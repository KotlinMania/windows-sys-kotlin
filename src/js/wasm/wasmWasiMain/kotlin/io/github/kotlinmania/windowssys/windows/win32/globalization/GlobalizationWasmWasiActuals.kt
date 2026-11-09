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

public actual fun AdjustCalendarDate(lpcaldatetime: Long, calunit: CALDATETIME_DATEUNIT, amount: Int): BOOL =
    0

public actual fun CompareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): COMPARESTRING_RESULT =
    0

public actual fun CompareStringEx(lplocalename: PCWSTR, dwcmpflags: COMPARE_STRING_FLAGS, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, lpversioninformation: Long, lpreserved: Long, lparam: LPARAM): COMPARESTRING_RESULT =
    0

public actual fun CompareStringOrdinal(lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, bignorecase: BOOL): COMPARESTRING_RESULT =
    0

public actual fun CompareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int): COMPARESTRING_RESULT =
    0

public actual fun ConvertCalDateTimeToSystemTime(lpcaldatetime: Long, lpsystime: Long): BOOL =
    0

public actual fun ConvertDefaultLocale(locale: UInt): UInt =
    0u

public actual fun ConvertSystemTimeToCalDateTime(lpsystime: Long, calid: UInt, lpcaldatetime: Long): BOOL =
    0

public actual fun EnumCalendarInfoA(lpcalinfoenumproc: CALINFO_ENUMPROCA, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    0

public actual fun EnumCalendarInfoExA(lpcalinfoenumprocex: CALINFO_ENUMPROCEXA, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    0

public actual fun EnumCalendarInfoExEx(pcalinfoenumprocexex: CALINFO_ENUMPROCEXEX, lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lparam: LPARAM): BOOL =
    0

public actual fun EnumCalendarInfoExW(lpcalinfoenumprocex: CALINFO_ENUMPROCEXW, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    0

public actual fun EnumCalendarInfoW(lpcalinfoenumproc: CALINFO_ENUMPROCW, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    0

public actual fun EnumDateFormatsA(lpdatefmtenumproc: DATEFMT_ENUMPROCA, locale: UInt, dwflags: UInt): BOOL =
    0

public actual fun EnumDateFormatsExA(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXA, locale: UInt, dwflags: UInt): BOOL =
    0

public actual fun EnumDateFormatsExEx(lpdatefmtenumprocexex: DATEFMT_ENUMPROCEXEX, lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lparam: LPARAM): BOOL =
    0

public actual fun EnumDateFormatsExW(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXW, locale: UInt, dwflags: UInt): BOOL =
    0

public actual fun EnumDateFormatsW(lpdatefmtenumproc: DATEFMT_ENUMPROCW, locale: UInt, dwflags: UInt): BOOL =
    0

public actual fun EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCA, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL =
    0

public actual fun EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCW, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL =
    0

public actual fun EnumSystemCodePagesA(lpcodepageenumproc: CODEPAGE_ENUMPROCA, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL =
    0

public actual fun EnumSystemCodePagesW(lpcodepageenumproc: CODEPAGE_ENUMPROCW, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL =
    0

public actual fun EnumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GEO_ENUMPROC): BOOL =
    0

public actual fun EnumSystemGeoNames(geoclass: UInt, geoenumproc: GEO_ENUMNAMEPROC, data: LPARAM): BOOL =
    0

public actual fun EnumSystemLanguageGroupsA(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCA, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL =
    0

public actual fun EnumSystemLanguageGroupsW(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCW, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL =
    0

public actual fun EnumSystemLocalesA(lplocaleenumproc: LOCALE_ENUMPROCA, dwflags: UInt): BOOL =
    0

public actual fun EnumSystemLocalesEx(lplocaleenumprocex: LOCALE_ENUMPROCEX, dwflags: UInt, lparam: LPARAM, lpreserved: Long): BOOL =
    0

public actual fun EnumSystemLocalesW(lplocaleenumproc: LOCALE_ENUMPROCW, dwflags: UInt): BOOL =
    0

public actual fun EnumTimeFormatsA(lptimefmtenumproc: TIMEFMT_ENUMPROCA, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL =
    0

public actual fun EnumTimeFormatsEx(lptimefmtenumprocex: TIMEFMT_ENUMPROCEX, lplocalename: PCWSTR, dwflags: UInt, lparam: LPARAM): BOOL =
    0

public actual fun EnumTimeFormatsW(lptimefmtenumproc: TIMEFMT_ENUMPROCW, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL =
    0

public actual fun EnumUILanguagesA(lpuilanguageenumproc: UILANGUAGE_ENUMPROCA, dwflags: UInt, lparam: Long): BOOL =
    0

public actual fun EnumUILanguagesW(lpuilanguageenumproc: UILANGUAGE_ENUMPROCW, dwflags: UInt, lparam: Long): BOOL =
    0

public actual fun FindNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long): Int =
    0

public actual fun FindNLSStringEx(lplocalename: PCWSTR, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int =
    0

public actual fun FindStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, bignorecase: BOOL): Int =
    0

public actual fun FoldStringA(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    0

public actual fun FoldStringW(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    0

public actual fun GetACP(): UInt =
    0u

public actual fun GetCPInfo(codepage: UInt, lpcpinfo: Long): BOOL =
    0

public actual fun GetCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL =
    0

public actual fun GetCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL =
    0

public actual fun GetCalendarDateFormatEx(lpszlocale: PCWSTR, dwflags: UInt, lpcaldatetime: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): BOOL =
    0

public actual fun GetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PSTR, cchdata: Int, lpvalue: Long): Int =
    0

public actual fun GetCalendarInfoEx(lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int =
    0

public actual fun GetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int =
    0

public actual fun GetCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: Long, lpcalmaxdatetime: Long): BOOL =
    0

public actual fun GetCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpcurrencystr: PSTR, cchcurrency: Int): Int =
    0

public actual fun GetCurrencyFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int =
    0

public actual fun GetCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int =
    0

public actual fun GetDateFormatA(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCSTR, lpdatestr: PSTR, cchdate: Int): Int =
    0

public actual fun GetDateFormatEx(lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int, lpcalendar: PCWSTR): Int =
    0

public actual fun GetDateFormatW(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): Int =
    0

public actual fun GetDistanceOfClosestLanguageInList(pszlanguage: PCWSTR, pszlanguageslist: PCWSTR, wchlistdelimiter: UShort, pclosestdistance: Long): HRESULT =
    0

public actual fun GetDurationFormat(locale: UInt, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int =
    0

public actual fun GetDurationFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int =
    0

public actual fun GetFileMUIInfo(dwflags: UInt, pcwszfilepath: PCWSTR, pfilemuiinfo: Long, pcbfilemuiinfo: Long): BOOL =
    0

public actual fun GetFileMUIPath(dwflags: UInt, pcwszfilepath: PCWSTR, pwszlanguage: PWSTR, pcchlanguage: Long, pwszfilemuipath: PWSTR, pcchfilemuipath: Long, pululenumerator: Long): BOOL =
    0

public actual fun GetGeoInfoA(location: Int, geotype: SYSGEOTYPE, lpgeodata: PSTR, cchdata: Int, langid: UShort): Int =
    0

public actual fun GetGeoInfoEx(location: PCWSTR, geotype: SYSGEOTYPE, geodata: PWSTR, geodatacount: Int): Int =
    0

public actual fun GetGeoInfoW(location: Int, geotype: SYSGEOTYPE, lpgeodata: PWSTR, cchdata: Int, langid: UShort): Int =
    0

public actual fun GetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PSTR, cchdata: Int): Int =
    0

public actual fun GetLocaleInfoEx(lplocalename: PCWSTR, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int =
    0

public actual fun GetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int =
    0

public actual fun GetNLSVersion(function: UInt, locale: UInt, lpversioninformation: Long): BOOL =
    0

public actual fun GetNLSVersionEx(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): BOOL =
    0

public actual fun GetNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpnumberstr: PSTR, cchnumber: Int): Int =
    0

public actual fun GetNumberFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int =
    0

public actual fun GetNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int =
    0

public actual fun GetOEMCP(): UInt =
    0u

public actual fun GetProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    0

public actual fun GetStringScripts(dwflags: UInt, lpstring: PCWSTR, cchstring: Int, lpscripts: PWSTR, cchscripts: Int): Int =
    0

public actual fun GetStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL =
    0

public actual fun GetStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL =
    0

public actual fun GetStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL =
    0

public actual fun GetStringTypeW(dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL =
    0

public actual fun GetSystemDefaultLCID(): UInt =
    0u

public actual fun GetSystemDefaultLangID(): UShort =
    0u

public actual fun GetSystemDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int =
    0

public actual fun GetSystemDefaultUILanguage(): UShort =
    0u

public actual fun GetSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    0

public actual fun GetTextCharset(hdc: HDC): Int =
    0

public actual fun GetTextCharsetInfo(hdc: HDC, lpsig: Long, dwflags: UInt): Int =
    0

public actual fun GetThreadLocale(): UInt =
    0u

public actual fun GetThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    0

public actual fun GetThreadUILanguage(): UShort =
    0u

public actual fun GetTimeFormatA(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCSTR, lptimestr: PSTR, cchtime: Int): Int =
    0

public actual fun GetTimeFormatEx(lplocalename: PCWSTR, dwflags: TIME_FORMAT_FLAGS, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int =
    0

public actual fun GetTimeFormatW(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int =
    0

public actual fun GetUILanguageInfo(dwflags: UInt, pwmszlanguage: PCWSTR, pwszfallbacklanguages: PWSTR, pcchfallbacklanguages: Long, pattributes: Long): BOOL =
    0

public actual fun GetUserDefaultGeoName(geoname: PWSTR, geonamecount: Int): Int =
    0

public actual fun GetUserDefaultLCID(): UInt =
    0u

public actual fun GetUserDefaultLangID(): UShort =
    0u

public actual fun GetUserDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int =
    0

public actual fun GetUserDefaultUILanguage(): UShort =
    0u

public actual fun GetUserGeoID(geoclass: SYSGEOCLASS): Int =
    0

public actual fun GetUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    0

public actual fun IdnToAscii(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpasciicharstr: PWSTR, cchasciichar: Int): Int =
    0

public actual fun IdnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpnameprepcharstr: PWSTR, cchnameprepchar: Int): Int =
    0

public actual fun IdnToUnicode(dwflags: UInt, lpasciicharstr: PCWSTR, cchasciichar: Int, lpunicodecharstr: PWSTR, cchunicodechar: Int): Int =
    0

public actual fun IsCalendarLeapYear(calid: UInt, year: UInt, era: UInt): BOOL =
    0

public actual fun IsDBCSLeadByte(testchar: UByte): BOOL =
    0

public actual fun IsDBCSLeadByteEx(codepage: UInt, testchar: UByte): BOOL =
    0

public actual fun IsNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: Long, lpstring: PCWSTR, cchstr: Int): BOOL =
    0

public actual fun IsNormalizedString(normform: NORM_FORM, lpstring: PCWSTR, cwlength: Int): BOOL =
    0

public actual fun IsTextUnicode(lpv: Long, isize: Int, lpiresult: Long): BOOL =
    0

public actual fun IsValidCodePage(codepage: UInt): BOOL =
    0

public actual fun IsValidLanguageGroup(languagegroup: UInt, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS): BOOL =
    0

public actual fun IsValidLocale(locale: UInt, dwflags: IS_VALID_LOCALE_FLAGS): BOOL =
    0

public actual fun IsValidLocaleName(lplocalename: PCWSTR): BOOL =
    0

public actual fun IsValidNLSVersion(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): UInt =
    0u

public actual fun IsWellFormedTag(psztag: PCWSTR): UByte =
    0u

public actual fun LCIDToLocaleName(locale: UInt, lpname: PWSTR, cchname: Int, dwflags: UInt): Int =
    0

public actual fun LCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    0

public actual fun LCMapStringEx(lplocalename: PCWSTR, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int =
    0

public actual fun LCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    0

public actual fun LocaleNameToLCID(lpname: PCWSTR, dwflags: UInt): UInt =
    0u

public actual fun MappingDoAction(pbag: Long, dwrangeindex: UInt, pszactionid: PCWSTR): HRESULT =
    0

public actual fun MappingFreePropertyBag(pbag: Long): HRESULT =
    0

public actual fun MappingFreeServices(pserviceinfo: Long): HRESULT =
    0

public actual fun MappingGetServices(poptions: Long, prgservices: Long, pdwservicescount: Long): HRESULT =
    0

public actual fun MappingRecognizeText(pserviceinfo: Long, psztext: PCWSTR, dwlength: UInt, dwindex: UInt, poptions: Long, pbag: Long): HRESULT =
    0

public actual fun MultiByteToWideChar(codepage: UInt, dwflags: MULTI_BYTE_TO_WIDE_CHAR_FLAGS, lpmultibytestr: PCSTR, cbmultibyte: Int, lpwidecharstr: PWSTR, cchwidechar: Int): Int =
    0

public actual fun NormalizeString(normform: NORM_FORM, lpsrcstring: PCWSTR, cwsrclength: Int, lpdststring: PWSTR, cwdstlength: Int): Int =
    0

public actual fun NotifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: PCWSTR, pcwstrpreviouslanguage: PCWSTR, dwreserved: UInt, pdwstatusrtrn: Long): BOOL =
    0

public actual fun ResolveLocaleName(lpnametoresolve: PCWSTR, lplocalename: PWSTR, cchlocalename: Int): Int =
    0

public actual fun RestoreThreadPreferredUILanguages(snapshot: HSAVEDUILANGUAGES) {
}

public actual fun ScriptApplyDigitSubstitution(psds: Long, psc: Long, pss: Long): HRESULT =
    0

public actual fun ScriptApplyLogicalWidth(pidx: Long, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pabc: Long, pijustify: Long): HRESULT =
    0

public actual fun ScriptBreak(pwcchars: PCWSTR, cchars: Int, psa: Long, psla: Long): HRESULT =
    0

public actual fun ScriptCPtoX(icp: Int, ftrailing: BOOL, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pix: Long): HRESULT =
    0

public actual fun ScriptCacheGetHeight(hdc: HDC, psc: Long, tmheight: Long): HRESULT =
    0

public actual fun ScriptFreeCache(psc: Long): HRESULT =
    0

public actual fun ScriptGetCMap(hdc: HDC, psc: Long, pwcinchars: PCWSTR, cchars: Int, dwflags: UInt, pwoutglyphs: Long): HRESULT =
    0

public actual fun ScriptGetFontAlternateGlyphs(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: Long, pcalternates: Long): HRESULT =
    0

public actual fun ScriptGetFontFeatureTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: Long, pctags: Long): HRESULT =
    0

public actual fun ScriptGetFontLanguageTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, cmaxtags: Int, plangsystags: Long, pctags: Long): HRESULT =
    0

public actual fun ScriptGetFontProperties(hdc: HDC, psc: Long, sfp: Long): HRESULT =
    0

public actual fun ScriptGetFontScriptTags(hdc: HDC, psc: Long, psa: Long, cmaxtags: Int, pscripttags: Long, pctags: Long): HRESULT =
    0

public actual fun ScriptGetGlyphABCWidth(hdc: HDC, psc: Long, wglyph: UShort, pabc: Long): HRESULT =
    0

public actual fun ScriptGetLogicalWidths(psa: Long, cchars: Int, cglyphs: Int, piglyphwidth: Long, pwlogclust: Long, psva: Long, pidx: Long): HRESULT =
    0

public actual fun ScriptGetProperties(ppsp: Long, pinumscripts: Long): HRESULT =
    0

public actual fun ScriptIsComplex(pwcinchars: PCWSTR, cinchars: Int, dwflags: SCRIPT_IS_COMPLEX_FLAGS): HRESULT =
    0

public actual fun ScriptItemize(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pcitems: Long): HRESULT =
    0

public actual fun ScriptItemizeOpenType(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pscripttags: Long, pcitems: Long): HRESULT =
    0

public actual fun ScriptJustify(psva: Long, piadvance: Long, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: Long): HRESULT =
    0

public actual fun ScriptLayout(cruns: Int, pblevel: Long, pivisualtological: Long, pilogicaltovisual: Long): HRESULT =
    0

public actual fun ScriptPlace(hdc: HDC, psc: Long, pwglyphs: Long, cglyphs: Int, psva: Long, psa: Long, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT =
    0

public actual fun ScriptPlaceOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, pwlogclust: Long, pcharprops: Long, cchars: Int, pwglyphs: Long, pglyphprops: Long, cglyphs: Int, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT =
    0

public actual fun ScriptPositionSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: GOFFSET, pioutadvance: Long, poutgoffset: Long): HRESULT =
    0

public actual fun ScriptRecordDigitSubstitution(locale: UInt, psds: Long): HRESULT =
    0

public actual fun ScriptShape(hdc: HDC, psc: Long, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, psa: Long, pwoutglyphs: Long, pwlogclust: Long, psva: Long, pcglyphs: Long): HRESULT =
    0

public actual fun ScriptShapeOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, pwlogclust: Long, pcharprops: Long, pwoutglyphs: Long, poutglyphprops: Long, pcglyphs: Long): HRESULT =
    0

public actual fun ScriptStringAnalyse(hdc: HDC, pstring: Long, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: Long, psstate: Long, pidx: Long, ptabdef: Long, pbinclass: Long, pssa: Long): HRESULT =
    0

public actual fun ScriptStringCPtoX(ssa: Long, icp: Int, ftrailing: BOOL, px: Long): HRESULT =
    0

public actual fun ScriptStringFree(pssa: Long): HRESULT =
    0

public actual fun ScriptStringGetLogicalWidths(ssa: Long, pidx: Long): HRESULT =
    0

public actual fun ScriptStringGetOrder(ssa: Long, puorder: Long): HRESULT =
    0

public actual fun ScriptStringOut(ssa: Long, ix: Int, iy: Int, uoptions: ETO_OPTIONS, prc: Long, iminsel: Int, imaxsel: Int, fdisabled: BOOL): HRESULT =
    0

public actual fun ScriptStringValidate(ssa: Long): HRESULT =
    0

public actual fun ScriptStringXtoCP(ssa: Long, ix: Int, pich: Long, pitrailing: Long): HRESULT =
    0

public actual fun ScriptString_pLogAttr(ssa: Long): Long =
    0L

public actual fun ScriptString_pSize(ssa: Long): Long =
    0L

public actual fun ScriptString_pcOutChars(ssa: Long): Long =
    0L

public actual fun ScriptSubstituteSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: Long): HRESULT =
    0

public actual fun ScriptTextOut(hdc: HDC, psc: Long, x: Int, y: Int, fuoptions: UInt, lprc: Long, psa: Long, pwcreserved: PCWSTR, ireserved: Int, pwglyphs: Long, cglyphs: Int, piadvance: Long, pijustify: Long, pgoffset: Long): HRESULT =
    0

public actual fun ScriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, picp: Long, pitrailing: Long): HRESULT =
    0

public actual fun SetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCSTR): BOOL =
    0

public actual fun SetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCWSTR): BOOL =
    0

public actual fun SetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PCSTR): BOOL =
    0

public actual fun SetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PCWSTR): BOOL =
    0

public actual fun SetProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL =
    0

public actual fun SetThreadLocale(locale: UInt): BOOL =
    0

public actual fun SetThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL =
    0

public actual fun SetThreadPreferredUILanguages2(flags: UInt, languages: PCWSTR, numlanguagesset: Long, snapshot: Long): BOOL =
    0

public actual fun SetThreadUILanguage(langid: UShort): UShort =
    0u

public actual fun SetUserGeoID(geoid: Int): BOOL =
    0

public actual fun SetUserGeoName(geoname: PCWSTR): BOOL =
    0

public actual fun TranslateCharsetInfo(lpsrc: Long, lpcs: Long, dwflags: TRANSLATE_CHARSET_INFO_FLAGS): BOOL =
    0

public actual fun UCNV_FROM_U_CALLBACK_ESCAPE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
}

public actual fun UCNV_FROM_U_CALLBACK_SKIP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
}

public actual fun UCNV_FROM_U_CALLBACK_STOP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
}

public actual fun UCNV_FROM_U_CALLBACK_SUBSTITUTE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
}

public actual fun UCNV_TO_U_CALLBACK_ESCAPE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
}

public actual fun UCNV_TO_U_CALLBACK_SKIP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
}

public actual fun UCNV_TO_U_CALLBACK_STOP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
}

public actual fun UCNV_TO_U_CALLBACK_SUBSTITUTE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
}

public actual fun UpdateCalendarDayOfWeek(lpcaldatetime: Long): BOOL =
    0

public actual fun VerifyScripts(dwflags: UInt, lplocalescripts: PCWSTR, cchlocalescripts: Int, lptestscripts: PCWSTR, cchtestscripts: Int): BOOL =
    0

public actual fun WideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: PCWSTR, cchwidechar: Int, lpmultibytestr: PSTR, cbmultibyte: Int, lpdefaultchar: PCSTR, lpuseddefaultchar: Long): Int =
    0

public actual fun lstrcatA(lpstring1: PSTR, lpstring2: PCSTR): PSTR =
    0L

public actual fun lstrcatW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR =
    0L

public actual fun lstrcmpA(lpstring1: PCSTR, lpstring2: PCSTR): Int =
    0

public actual fun lstrcmpW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int =
    0

public actual fun lstrcmpiA(lpstring1: PCSTR, lpstring2: PCSTR): Int =
    0

public actual fun lstrcmpiW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int =
    0

public actual fun lstrcpyA(lpstring1: PSTR, lpstring2: PCSTR): PSTR =
    0L

public actual fun lstrcpyW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR =
    0L

public actual fun lstrcpynA(lpstring1: PSTR, lpstring2: PCSTR, imaxlength: Int): PSTR =
    0L

public actual fun lstrcpynW(lpstring1: PWSTR, lpstring2: PCWSTR, imaxlength: Int): PWSTR =
    0L

public actual fun lstrlenA(lpstring: PCSTR): Int =
    0

public actual fun lstrlenW(lpstring: PCWSTR): Int =
    0

public actual fun u_UCharsToChars(us: Long, cs: PCSTR, length: Int) {
}

public actual fun u_austrcpy(dst: PCSTR, src: Long): PSTR =
    0L

public actual fun u_austrncpy(dst: PCSTR, src: Long, n: Int): PSTR =
    0L

public actual fun u_catclose(catd: Long) {
}

public actual fun u_catgets(catd: Long, set_num: Int, msg_num: Int, s: Long, len: Long, ec: Long): Long =
    0L

public actual fun u_catopen(name: PCSTR, locale: PCSTR, ec: Long): Long =
    0L

public actual fun u_charAge(c: Int, versionarray: Long) {
}

public actual fun u_charDigitValue(c: Int): Int =
    0

public actual fun u_charDirection(c: Int): UCharDirection =
    0

public actual fun u_charFromName(namechoice: UCharNameChoice, name: PCSTR, perrorcode: Long): Int =
    0

public actual fun u_charMirror(c: Int): Int =
    0

public actual fun u_charName(code: Int, namechoice: UCharNameChoice, buffer: PCSTR, bufferlength: Int, perrorcode: Long): Int =
    0

public actual fun u_charType(c: Int): Byte =
    0

public actual fun u_charsToUChars(cs: PCSTR, us: Long, length: Int) {
}

public actual fun u_cleanup() {
}

public actual fun u_countChar32(s: Long, length: Int): Int =
    0

public actual fun u_digit(ch: Int, radix: Byte): Int =
    0

public actual fun u_enumCharNames(start: Int, limit: Int, fn: Long, context: Long, namechoice: UCharNameChoice, perrorcode: Long) {
}

public actual fun u_enumCharTypes(enumrange: Long, context: Long) {
}

public actual fun u_errorName(code: UErrorCode): PCSTR =
    0L

public actual fun u_foldCase(c: Int, options: UInt): Int =
    0

public actual fun u_forDigit(digit: Int, radix: Byte): Int =
    0

public actual fun u_formatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun u_formatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, status: Long): Int =
    0

public actual fun u_getBidiPairedBracket(c: Int): Int =
    0

public actual fun u_getBinaryPropertySet(property: UProperty, perrorcode: Long): Long =
    0L

public actual fun u_getCombiningClass(c: Int): UByte =
    0u

public actual fun u_getDataVersion(dataversionfillin: Long, status: Long) {
}

public actual fun u_getFC_NFKC_Closure(c: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    0

public actual fun u_getIntPropertyMap(property: UProperty, perrorcode: Long): Long =
    0L

public actual fun u_getIntPropertyMaxValue(which: UProperty): Int =
    0

public actual fun u_getIntPropertyMinValue(which: UProperty): Int =
    0

public actual fun u_getIntPropertyValue(c: Int, which: UProperty): Int =
    0

public actual fun u_getNumericValue(c: Int): Double =
    0.0

public actual fun u_getPropertyEnum(alias: PCSTR): UProperty =
    0

public actual fun u_getPropertyName(property: UProperty, namechoice: UPropertyNameChoice): PCSTR =
    0L

public actual fun u_getPropertyValueEnum(property: UProperty, alias: PCSTR): Int =
    0

public actual fun u_getPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): PCSTR =
    0L

public actual fun u_getUnicodeVersion(versionarray: Long) {
}

public actual fun u_getVersion(versionarray: Long) {
}

public actual fun u_hasBinaryProperty(c: Int, which: UProperty): Byte =
    0

public actual fun u_init(status: Long) {
}

public actual fun u_isIDIgnorable(c: Int): Byte =
    0

public actual fun u_isIDPart(c: Int): Byte =
    0

public actual fun u_isIDStart(c: Int): Byte =
    0

public actual fun u_isISOControl(c: Int): Byte =
    0

public actual fun u_isJavaIDPart(c: Int): Byte =
    0

public actual fun u_isJavaIDStart(c: Int): Byte =
    0

public actual fun u_isJavaSpaceChar(c: Int): Byte =
    0

public actual fun u_isMirrored(c: Int): Byte =
    0

public actual fun u_isUAlphabetic(c: Int): Byte =
    0

public actual fun u_isULowercase(c: Int): Byte =
    0

public actual fun u_isUUppercase(c: Int): Byte =
    0

public actual fun u_isUWhiteSpace(c: Int): Byte =
    0

public actual fun u_isWhitespace(c: Int): Byte =
    0

public actual fun u_isalnum(c: Int): Byte =
    0

public actual fun u_isalpha(c: Int): Byte =
    0

public actual fun u_isbase(c: Int): Byte =
    0

public actual fun u_isblank(c: Int): Byte =
    0

public actual fun u_iscntrl(c: Int): Byte =
    0

public actual fun u_isdefined(c: Int): Byte =
    0

public actual fun u_isdigit(c: Int): Byte =
    0

public actual fun u_isgraph(c: Int): Byte =
    0

public actual fun u_islower(c: Int): Byte =
    0

public actual fun u_isprint(c: Int): Byte =
    0

public actual fun u_ispunct(c: Int): Byte =
    0

public actual fun u_isspace(c: Int): Byte =
    0

public actual fun u_istitle(c: Int): Byte =
    0

public actual fun u_isupper(c: Int): Byte =
    0

public actual fun u_isxdigit(c: Int): Byte =
    0

public actual fun u_memcasecmp(s1: Long, s2: Long, length: Int, options: UInt): Int =
    0

public actual fun u_memchr(s: Long, c: UShort, count: Int): Long =
    0L

public actual fun u_memchr32(s: Long, c: Int, count: Int): Long =
    0L

public actual fun u_memcmp(buf1: Long, buf2: Long, count: Int): Int =
    0

public actual fun u_memcmpCodePointOrder(s1: Long, s2: Long, count: Int): Int =
    0

public actual fun u_memcpy(dest: Long, src: Long, count: Int): Long =
    0L

public actual fun u_memmove(dest: Long, src: Long, count: Int): Long =
    0L

public actual fun u_memrchr(s: Long, c: UShort, count: Int): Long =
    0L

public actual fun u_memrchr32(s: Long, c: Int, count: Int): Long =
    0L

public actual fun u_memset(dest: Long, c: UShort, count: Int): Long =
    0L

public actual fun u_parseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, status: Long) {
}

public actual fun u_parseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, parseerror: Long, status: Long) {
}

public actual fun u_setMemoryFunctions(context: Long, a: Long, r: Long, f: Long, status: Long) {
}

public actual fun u_shapeArabic(source: Long, sourcelength: Int, dest: Long, destsize: Int, options: UInt, perrorcode: Long): Int =
    0

public actual fun u_strCaseCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int =
    0

public actual fun u_strCompare(s1: Long, length1: Int, s2: Long, length2: Int, codepointorder: Byte): Int =
    0

public actual fun u_strCompareIter(iter1: Long, iter2: Long, codepointorder: Byte): Int =
    0

public actual fun u_strFindFirst(s: Long, length: Int, substring: Long, sublength: Int): Long =
    0L

public actual fun u_strFindLast(s: Long, length: Int, substring: Long, sublength: Int): Long =
    0L

public actual fun u_strFoldCase(dest: Long, destcapacity: Int, src: Long, srclength: Int, options: UInt, perrorcode: Long): Int =
    0

public actual fun u_strFromJavaModifiedUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    0L

public actual fun u_strFromUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long =
    0L

public actual fun u_strFromUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    0L

public actual fun u_strFromUTF8(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long =
    0L

public actual fun u_strFromUTF8Lenient(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long =
    0L

public actual fun u_strFromUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    0L

public actual fun u_strFromWCS(dest: Long, destcapacity: Int, pdestlength: Long, src: PCWSTR, srclength: Int, perrorcode: Long): Long =
    0L

public actual fun u_strHasMoreChar32Than(s: Long, length: Int, number: Int): Byte =
    0

public actual fun u_strToJavaModifiedUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR =
    0L

public actual fun u_strToLower(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int =
    0

public actual fun u_strToTitle(dest: Long, destcapacity: Int, src: Long, srclength: Int, titleiter: Long, locale: PCSTR, perrorcode: Long): Int =
    0

public actual fun u_strToUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long =
    0L

public actual fun u_strToUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    0L

public actual fun u_strToUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR =
    0L

public actual fun u_strToUTF8WithSub(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): PSTR =
    0L

public actual fun u_strToUpper(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int =
    0

public actual fun u_strToWCS(dest: PCWSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PWSTR =
    0L

public actual fun u_strcasecmp(s1: Long, s2: Long, options: UInt): Int =
    0

public actual fun u_strcat(dst: Long, src: Long): Long =
    0L

public actual fun u_strchr(s: Long, c: UShort): Long =
    0L

public actual fun u_strchr32(s: Long, c: Int): Long =
    0L

public actual fun u_strcmp(s1: Long, s2: Long): Int =
    0

public actual fun u_strcmpCodePointOrder(s1: Long, s2: Long): Int =
    0

public actual fun u_strcpy(dst: Long, src: Long): Long =
    0L

public actual fun u_strcspn(string: Long, matchset: Long): Int =
    0

public actual fun u_strlen(s: Long): Int =
    0

public actual fun u_strncasecmp(s1: Long, s2: Long, n: Int, options: UInt): Int =
    0

public actual fun u_strncat(dst: Long, src: Long, n: Int): Long =
    0L

public actual fun u_strncmp(ucs1: Long, ucs2: Long, n: Int): Int =
    0

public actual fun u_strncmpCodePointOrder(s1: Long, s2: Long, n: Int): Int =
    0

public actual fun u_strncpy(dst: Long, src: Long, n: Int): Long =
    0L

public actual fun u_strpbrk(string: Long, matchset: Long): Long =
    0L

public actual fun u_strrchr(s: Long, c: UShort): Long =
    0L

public actual fun u_strrchr32(s: Long, c: Int): Long =
    0L

public actual fun u_strrstr(s: Long, substring: Long): Long =
    0L

public actual fun u_strspn(string: Long, matchset: Long): Int =
    0

public actual fun u_strstr(s: Long, substring: Long): Long =
    0L

public actual fun u_strtok_r(src: Long, delim: Long, savestate: Long): Long =
    0L

public actual fun u_tolower(c: Int): Int =
    0

public actual fun u_totitle(c: Int): Int =
    0

public actual fun u_toupper(c: Int): Int =
    0

public actual fun u_uastrcpy(dst: Long, src: PCSTR): Long =
    0L

public actual fun u_uastrncpy(dst: Long, src: PCSTR, n: Int): Long =
    0L

public actual fun u_unescape(src: PCSTR, dest: Long, destcapacity: Int): Int =
    0

public actual fun u_unescapeAt(charat: UNESCAPE_CHAR_AT, offset: Long, length: Int, context: Long): Int =
    0

public actual fun u_versionFromString(versionarray: Long, versionstring: PCSTR) {
}

public actual fun u_versionFromUString(versionarray: Long, versionstring: Long) {
}

public actual fun u_versionToString(versionarray: Long, versionstring: PCSTR) {
}

public actual fun u_vformatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, ap: Long, status: Long): Int =
    0

public actual fun u_vformatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, ap: Long, status: Long): Int =
    0

public actual fun u_vparseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, status: Long) {
}

public actual fun u_vparseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, parseerror: Long, status: Long) {
}

public actual fun ubidi_close(pbidi: Long) {
}

public actual fun ubidi_countParagraphs(pbidi: Long): Int =
    0

public actual fun ubidi_countRuns(pbidi: Long, perrorcode: Long): Int =
    0

public actual fun ubidi_getBaseDirection(text: Long, length: Int): UBiDiDirection =
    0

public actual fun ubidi_getClassCallback(pbidi: Long, fn: Long, context: Long) {
}

public actual fun ubidi_getCustomizedClass(pbidi: Long, c: Int): UCharDirection =
    0

public actual fun ubidi_getDirection(pbidi: Long): UBiDiDirection =
    0

public actual fun ubidi_getLength(pbidi: Long): Int =
    0

public actual fun ubidi_getLevelAt(pbidi: Long, charindex: Int): UByte =
    0u

public actual fun ubidi_getLevels(pbidi: Long, perrorcode: Long): Long =
    0L

public actual fun ubidi_getLogicalIndex(pbidi: Long, visualindex: Int, perrorcode: Long): Int =
    0

public actual fun ubidi_getLogicalMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
}

public actual fun ubidi_getLogicalRun(pbidi: Long, logicalposition: Int, plogicallimit: Long, plevel: Long) {
}

public actual fun ubidi_getParaLevel(pbidi: Long): UByte =
    0u

public actual fun ubidi_getParagraph(pbidi: Long, charindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long): Int =
    0

public actual fun ubidi_getParagraphByIndex(pbidi: Long, paraindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long) {
}

public actual fun ubidi_getProcessedLength(pbidi: Long): Int =
    0

public actual fun ubidi_getReorderingMode(pbidi: Long): UBiDiReorderingMode =
    0

public actual fun ubidi_getReorderingOptions(pbidi: Long): UInt =
    0u

public actual fun ubidi_getResultLength(pbidi: Long): Int =
    0

public actual fun ubidi_getText(pbidi: Long): Long =
    0L

public actual fun ubidi_getVisualIndex(pbidi: Long, logicalindex: Int, perrorcode: Long): Int =
    0

public actual fun ubidi_getVisualMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
}

public actual fun ubidi_getVisualRun(pbidi: Long, runindex: Int, plogicalstart: Long, plength: Long): UBiDiDirection =
    0

public actual fun ubidi_invertMap(srcmap: Long, destmap: Long, length: Int) {
}

public actual fun ubidi_isInverse(pbidi: Long): Byte =
    0

public actual fun ubidi_isOrderParagraphsLTR(pbidi: Long): Byte =
    0

public actual fun ubidi_open(): Long =
    0L

public actual fun ubidi_openSized(maxlength: Int, maxruncount: Int, perrorcode: Long): Long =
    0L

public actual fun ubidi_orderParagraphsLTR(pbidi: Long, orderparagraphsltr: Byte) {
}

public actual fun ubidi_reorderLogical(levels: Long, length: Int, indexmap: Long) {
}

public actual fun ubidi_reorderVisual(levels: Long, length: Int, indexmap: Long) {
}

public actual fun ubidi_setClassCallback(pbidi: Long, newfn: UBiDiClassCallback, newcontext: Long, oldfn: Long, oldcontext: Long, perrorcode: Long) {
}

public actual fun ubidi_setContext(pbidi: Long, prologue: Long, prolength: Int, epilogue: Long, epilength: Int, perrorcode: Long) {
}

public actual fun ubidi_setInverse(pbidi: Long, isinverse: Byte) {
}

public actual fun ubidi_setLine(pparabidi: Long, start: Int, limit: Int, plinebidi: Long, perrorcode: Long) {
}

public actual fun ubidi_setPara(pbidi: Long, text: Long, length: Int, paralevel: UByte, embeddinglevels: Long, perrorcode: Long) {
}

public actual fun ubidi_setReorderingMode(pbidi: Long, reorderingmode: UBiDiReorderingMode) {
}

public actual fun ubidi_setReorderingOptions(pbidi: Long, reorderingoptions: UInt) {
}

public actual fun ubidi_writeReordered(pbidi: Long, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int =
    0

public actual fun ubidi_writeReverse(src: Long, srclength: Int, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int =
    0

public actual fun ubiditransform_close(pbiditransform: Long) {
}

public actual fun ubiditransform_open(perrorcode: Long): Long =
    0L

public actual fun ubiditransform_transform(pbiditransform: Long, src: Long, srclength: Int, dest: Long, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: Long): UInt =
    0u

public actual fun ublock_getCode(c: Int): UBlockCode =
    0

public actual fun ubrk_close(bi: Long) {
}

public actual fun ubrk_countAvailable(): Int =
    0

public actual fun ubrk_current(bi: Long): Int =
    0

public actual fun ubrk_first(bi: Long): Int =
    0

public actual fun ubrk_following(bi: Long, offset: Int): Int =
    0

public actual fun ubrk_getAvailable(index: Int): PCSTR =
    0L

public actual fun ubrk_getBinaryRules(bi: Long, binaryrules: Long, rulescapacity: Int, status: Long): Int =
    0

public actual fun ubrk_getLocaleByType(bi: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    0L

public actual fun ubrk_getRuleStatus(bi: Long): Int =
    0

public actual fun ubrk_getRuleStatusVec(bi: Long, fillinvec: Long, capacity: Int, status: Long): Int =
    0

public actual fun ubrk_isBoundary(bi: Long, offset: Int): Byte =
    0

public actual fun ubrk_last(bi: Long): Int =
    0

public actual fun ubrk_next(bi: Long): Int =
    0

public actual fun ubrk_open(type: UBreakIteratorType, locale: PCSTR, text: Long, textlength: Int, status: Long): Long =
    0L

public actual fun ubrk_openBinaryRules(binaryrules: Long, ruleslength: Int, text: Long, textlength: Int, status: Long): Long =
    0L

public actual fun ubrk_openRules(rules: Long, ruleslength: Int, text: Long, textlength: Int, parseerr: Long, status: Long): Long =
    0L

public actual fun ubrk_preceding(bi: Long, offset: Int): Int =
    0

public actual fun ubrk_previous(bi: Long): Int =
    0

public actual fun ubrk_refreshUText(bi: Long, text: Long, status: Long) {
}

public actual fun ubrk_safeClone(bi: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    0L

public actual fun ubrk_setText(bi: Long, text: Long, textlength: Int, status: Long) {
}

public actual fun ubrk_setUText(bi: Long, text: Long, status: Long) {
}

public actual fun ucal_add(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
}

public actual fun ucal_clear(calendar: Long) {
}

public actual fun ucal_clearField(cal: Long, field: UCalendarDateFields) {
}

public actual fun ucal_clone(cal: Long, status: Long): Long =
    0L

public actual fun ucal_close(cal: Long) {
}

public actual fun ucal_countAvailable(): Int =
    0

public actual fun ucal_equivalentTo(cal1: Long, cal2: Long): Byte =
    0

public actual fun ucal_get(cal: Long, field: UCalendarDateFields, status: Long): Int =
    0

public actual fun ucal_getAttribute(cal: Long, attr: UCalendarAttribute): Int =
    0

public actual fun ucal_getAvailable(localeindex: Int): PCSTR =
    0L

public actual fun ucal_getCanonicalTimeZoneID(id: Long, len: Int, result: Long, resultcapacity: Int, issystemid: Long, status: Long): Int =
    0

public actual fun ucal_getDSTSavings(zoneid: Long, ec: Long): Int =
    0

public actual fun ucal_getDayOfWeekType(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): UCalendarWeekdayType =
    0

public actual fun ucal_getDefaultTimeZone(result: Long, resultcapacity: Int, ec: Long): Int =
    0

public actual fun ucal_getFieldDifference(cal: Long, target: Double, field: UCalendarDateFields, status: Long): Int =
    0

public actual fun ucal_getGregorianChange(cal: Long, perrorcode: Long): Double =
    0.0

public actual fun ucal_getHostTimeZone(result: Long, resultcapacity: Int, ec: Long): Int =
    0

public actual fun ucal_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    0L

public actual fun ucal_getLimit(cal: Long, field: UCalendarDateFields, type: UCalendarLimitType, status: Long): Int =
    0

public actual fun ucal_getLocaleByType(cal: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    0L

public actual fun ucal_getMillis(cal: Long, status: Long): Double =
    0.0

public actual fun ucal_getNow(): Double =
    0.0

public actual fun ucal_getTZDataVersion(status: Long): PCSTR =
    0L

public actual fun ucal_getTimeZoneDisplayName(cal: Long, type: UCalendarDisplayNameType, locale: PCSTR, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun ucal_getTimeZoneID(cal: Long, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun ucal_getTimeZoneIDForWindowsID(winid: Long, len: Int, region: PCSTR, id: Long, idcapacity: Int, status: Long): Int =
    0

public actual fun ucal_getTimeZoneTransitionDate(cal: Long, type: UTimeZoneTransitionType, transition: Long, status: Long): Byte =
    0

public actual fun ucal_getType(cal: Long, status: Long): PCSTR =
    0L

public actual fun ucal_getWeekendTransition(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): Int =
    0

public actual fun ucal_getWindowsTimeZoneID(id: Long, len: Int, winid: Long, winidcapacity: Int, status: Long): Int =
    0

public actual fun ucal_inDaylightTime(cal: Long, status: Long): Byte =
    0

public actual fun ucal_isSet(cal: Long, field: UCalendarDateFields): Byte =
    0

public actual fun ucal_isWeekend(cal: Long, date: Double, status: Long): Byte =
    0

public actual fun ucal_open(zoneid: Long, len: Int, locale: PCSTR, type: UCalendarType, status: Long): Long =
    0L

public actual fun ucal_openCountryTimeZones(country: PCSTR, ec: Long): Long =
    0L

public actual fun ucal_openTimeZoneIDEnumeration(zonetype: USystemTimeZoneType, region: PCSTR, rawoffset: Long, ec: Long): Long =
    0L

public actual fun ucal_openTimeZones(ec: Long): Long =
    0L

public actual fun ucal_roll(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
}

public actual fun ucal_set(cal: Long, field: UCalendarDateFields, value: Int) {
}

public actual fun ucal_setAttribute(cal: Long, attr: UCalendarAttribute, newvalue: Int) {
}

public actual fun ucal_setDate(cal: Long, year: Int, month: Int, date: Int, status: Long) {
}

public actual fun ucal_setDateTime(cal: Long, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: Long) {
}

public actual fun ucal_setDefaultTimeZone(zoneid: Long, ec: Long) {
}

public actual fun ucal_setGregorianChange(cal: Long, date: Double, perrorcode: Long) {
}

public actual fun ucal_setMillis(cal: Long, datetime: Double, status: Long) {
}

public actual fun ucal_setTimeZone(cal: Long, zoneid: Long, len: Int, status: Long) {
}

public actual fun ucasemap_close(csm: Long) {
}

public actual fun ucasemap_getBreakIterator(csm: Long): Long =
    0L

public actual fun ucasemap_getLocale(csm: Long): PCSTR =
    0L

public actual fun ucasemap_getOptions(csm: Long): UInt =
    0u

public actual fun ucasemap_open(locale: PCSTR, options: UInt, perrorcode: Long): Long =
    0L

public actual fun ucasemap_setBreakIterator(csm: Long, itertoadopt: Long, perrorcode: Long) {
}

public actual fun ucasemap_setLocale(csm: Long, locale: PCSTR, perrorcode: Long) {
}

public actual fun ucasemap_setOptions(csm: Long, options: UInt, perrorcode: Long) {
}

public actual fun ucasemap_toTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int =
    0

public actual fun ucasemap_utf8FoldCase(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    0

public actual fun ucasemap_utf8ToLower(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    0

public actual fun ucasemap_utf8ToTitle(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    0

public actual fun ucasemap_utf8ToUpper(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    0

public actual fun ucfpos_close(ucfpos: Long) {
}

public actual fun ucfpos_constrainCategory(ucfpos: Long, category: Int, ec: Long) {
}

public actual fun ucfpos_constrainField(ucfpos: Long, category: Int, field: Int, ec: Long) {
}

public actual fun ucfpos_getCategory(ucfpos: Long, ec: Long): Int =
    0

public actual fun ucfpos_getField(ucfpos: Long, ec: Long): Int =
    0

public actual fun ucfpos_getIndexes(ucfpos: Long, pstart: Long, plimit: Long, ec: Long) {
}

public actual fun ucfpos_getInt64IterationContext(ucfpos: Long, ec: Long): Long =
    0L

public actual fun ucfpos_matchesField(ucfpos: Long, category: Int, field: Int, ec: Long): Byte =
    0

public actual fun ucfpos_open(ec: Long): Long =
    0L

public actual fun ucfpos_reset(ucfpos: Long, ec: Long) {
}

public actual fun ucfpos_setInt64IterationContext(ucfpos: Long, context: Long, ec: Long) {
}

public actual fun ucfpos_setState(ucfpos: Long, category: Int, field: Int, start: Int, limit: Int, ec: Long) {
}

public actual fun ucnv_cbFromUWriteBytes(args: Long, source: PCSTR, length: Int, offsetindex: Int, err: Long) {
}

public actual fun ucnv_cbFromUWriteSub(args: Long, offsetindex: Int, err: Long) {
}

public actual fun ucnv_cbFromUWriteUChars(args: Long, source: Long, sourcelimit: Long, offsetindex: Int, err: Long) {
}

public actual fun ucnv_cbToUWriteSub(args: Long, offsetindex: Int, err: Long) {
}

public actual fun ucnv_cbToUWriteUChars(args: Long, source: Long, length: Int, offsetindex: Int, err: Long) {
}

public actual fun ucnv_close(converter: Long) {
}

public actual fun ucnv_compareNames(name1: PCSTR, name2: PCSTR): Int =
    0

public actual fun ucnv_convert(toconvertername: PCSTR, fromconvertername: PCSTR, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    0

public actual fun ucnv_convertEx(targetcnv: Long, sourcecnv: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: PCSTR, pivotstart: Long, pivotsource: Long, pivottarget: Long, pivotlimit: Long, reset: Byte, flush: Byte, perrorcode: Long) {
}

public actual fun ucnv_countAliases(alias: PCSTR, perrorcode: Long): UShort =
    0u

public actual fun ucnv_countAvailable(): Int =
    0

public actual fun ucnv_countStandards(): UShort =
    0u

public actual fun ucnv_detectUnicodeSignature(source: PCSTR, sourcelength: Int, signaturelength: Long, perrorcode: Long): PCSTR =
    0L

public actual fun ucnv_fixFileSeparator(cnv: Long, source: Long, sourcelen: Int) {
}

public actual fun ucnv_flushCache(): Int =
    0

public actual fun ucnv_fromAlgorithmic(cnv: Long, algorithmictype: UConverterType, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    0

public actual fun ucnv_fromUChars(cnv: Long, dest: PCSTR, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int =
    0

public actual fun ucnv_fromUCountPending(cnv: Long, status: Long): Int =
    0

public actual fun ucnv_fromUnicode(converter: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long) {
}

public actual fun ucnv_getAlias(alias: PCSTR, n: UShort, perrorcode: Long): PCSTR =
    0L

public actual fun ucnv_getAliases(alias: PCSTR, aliases: Long, perrorcode: Long) {
}

public actual fun ucnv_getAvailableName(n: Int): PCSTR =
    0L

public actual fun ucnv_getCCSID(converter: Long, err: Long): Int =
    0

public actual fun ucnv_getCanonicalName(alias: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR =
    0L

public actual fun ucnv_getDefaultName(): PCSTR =
    0L

public actual fun ucnv_getDisplayName(converter: Long, displaylocale: PCSTR, displayname: Long, displaynamecapacity: Int, err: Long): Int =
    0

public actual fun ucnv_getFromUCallBack(converter: Long, action: Long, context: Long) {
}

public actual fun ucnv_getInvalidChars(converter: Long, errbytes: PCSTR, len: Long, err: Long) {
}

public actual fun ucnv_getInvalidUChars(converter: Long, erruchars: Long, len: Long, err: Long) {
}

public actual fun ucnv_getMaxCharSize(converter: Long): Byte =
    0

public actual fun ucnv_getMinCharSize(converter: Long): Byte =
    0

public actual fun ucnv_getName(converter: Long, err: Long): PCSTR =
    0L

public actual fun ucnv_getNextUChar(converter: Long, source: Long, sourcelimit: PCSTR, err: Long): Int =
    0

public actual fun ucnv_getPlatform(converter: Long, err: Long): UConverterPlatform =
    0

public actual fun ucnv_getStandard(n: UShort, perrorcode: Long): PCSTR =
    0L

public actual fun ucnv_getStandardName(name: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR =
    0L

public actual fun ucnv_getStarters(converter: Long, starters: Long, err: Long) {
}

public actual fun ucnv_getSubstChars(converter: Long, subchars: PCSTR, len: Long, err: Long) {
}

public actual fun ucnv_getToUCallBack(converter: Long, action: Long, context: Long) {
}

public actual fun ucnv_getType(converter: Long): UConverterType =
    0

public actual fun ucnv_getUnicodeSet(cnv: Long, setfillin: Long, whichset: UConverterUnicodeSet, perrorcode: Long) {
}

public actual fun ucnv_isAmbiguous(cnv: Long): Byte =
    0

public actual fun ucnv_isFixedWidth(cnv: Long, status: Long): Byte =
    0

public actual fun ucnv_open(convertername: PCSTR, err: Long): Long =
    0L

public actual fun ucnv_openAllNames(perrorcode: Long): Long =
    0L

public actual fun ucnv_openCCSID(codepage: Int, platform: UConverterPlatform, err: Long): Long =
    0L

public actual fun ucnv_openPackage(packagename: PCSTR, convertername: PCSTR, err: Long): Long =
    0L

public actual fun ucnv_openStandardNames(convname: PCSTR, standard: PCSTR, perrorcode: Long): Long =
    0L

public actual fun ucnv_openU(name: Long, err: Long): Long =
    0L

public actual fun ucnv_reset(converter: Long) {
}

public actual fun ucnv_resetFromUnicode(converter: Long) {
}

public actual fun ucnv_resetToUnicode(converter: Long) {
}

public actual fun ucnv_safeClone(cnv: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    0L

public actual fun ucnv_setDefaultName(name: PCSTR) {
}

public actual fun ucnv_setFallback(cnv: Long, usesfallback: Byte) {
}

public actual fun ucnv_setFromUCallBack(converter: Long, newaction: UConverterFromUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
}

public actual fun ucnv_setSubstChars(converter: Long, subchars: PCSTR, len: Byte, err: Long) {
}

public actual fun ucnv_setSubstString(cnv: Long, s: Long, length: Int, err: Long) {
}

public actual fun ucnv_setToUCallBack(converter: Long, newaction: UConverterToUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
}

public actual fun ucnv_toAlgorithmic(algorithmictype: UConverterType, cnv: Long, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    0

public actual fun ucnv_toUChars(cnv: Long, dest: Long, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    0

public actual fun ucnv_toUCountPending(cnv: Long, status: Long): Int =
    0

public actual fun ucnv_toUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: PCSTR, offsets: Long, flush: Byte, err: Long) {
}

public actual fun ucnv_usesFallback(cnv: Long): Byte =
    0

public actual fun ucnvsel_close(sel: Long) {
}

public actual fun ucnvsel_open(converterlist: Long, converterlistsize: Int, excludedcodepoints: Long, whichset: UConverterUnicodeSet, status: Long): Long =
    0L

public actual fun ucnvsel_openFromSerialized(buffer: Long, length: Int, status: Long): Long =
    0L

public actual fun ucnvsel_selectForString(sel: Long, s: Long, length: Int, status: Long): Long =
    0L

public actual fun ucnvsel_selectForUTF8(sel: Long, s: PCSTR, length: Int, status: Long): Long =
    0L

public actual fun ucnvsel_serialize(sel: Long, buffer: Long, buffercapacity: Int, status: Long): Int =
    0

public actual fun ucol_cloneBinary(coll: Long, buffer: Long, capacity: Int, status: Long): Int =
    0

public actual fun ucol_close(coll: Long) {
}

public actual fun ucol_closeElements(elems: Long) {
}

public actual fun ucol_countAvailable(): Int =
    0

public actual fun ucol_equal(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    0

public actual fun ucol_getAttribute(coll: Long, attr: UColAttribute, status: Long): UColAttributeValue =
    0

public actual fun ucol_getAvailable(localeindex: Int): PCSTR =
    0L

public actual fun ucol_getBound(source: Long, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun ucol_getContractionsAndExpansions(coll: Long, contractions: Long, expansions: Long, addprefixes: Byte, status: Long) {
}

public actual fun ucol_getDisplayName(objloc: PCSTR, disploc: PCSTR, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun ucol_getEquivalentReorderCodes(reordercode: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    0

public actual fun ucol_getFunctionalEquivalent(result: PCSTR, resultcapacity: Int, keyword: PCSTR, locale: PCSTR, isavailable: Long, status: Long): Int =
    0

public actual fun ucol_getKeywordValues(keyword: PCSTR, status: Long): Long =
    0L

public actual fun ucol_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    0L

public actual fun ucol_getKeywords(status: Long): Long =
    0L

public actual fun ucol_getLocaleByType(coll: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    0L

public actual fun ucol_getMaxExpansion(elems: Long, order: Int): Int =
    0

public actual fun ucol_getMaxVariable(coll: Long): UColReorderCode =
    0

public actual fun ucol_getOffset(elems: Long): Int =
    0

public actual fun ucol_getReorderCodes(coll: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    0

public actual fun ucol_getRules(coll: Long, length: Long): Long =
    0L

public actual fun ucol_getRulesEx(coll: Long, delta: UColRuleOption, buffer: Long, bufferlen: Int): Int =
    0

public actual fun ucol_getSortKey(coll: Long, source: Long, sourcelength: Int, result: Long, resultlength: Int): Int =
    0

public actual fun ucol_getStrength(coll: Long): UColAttributeValue =
    0

public actual fun ucol_getTailoredSet(coll: Long, status: Long): Long =
    0L

public actual fun ucol_getUCAVersion(coll: Long, info: Long) {
}

public actual fun ucol_getVariableTop(coll: Long, status: Long): UInt =
    0u

public actual fun ucol_getVersion(coll: Long, info: Long) {
}

public actual fun ucol_greater(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    0

public actual fun ucol_greaterOrEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    0

public actual fun ucol_keyHashCode(key: Long, length: Int): Int =
    0

public actual fun ucol_mergeSortkeys(src1: Long, src1length: Int, src2: Long, src2length: Int, dest: Long, destcapacity: Int): Int =
    0

public actual fun ucol_next(elems: Long, status: Long): Int =
    0

public actual fun ucol_nextSortKeyPart(coll: Long, iter: Long, state: Long, dest: Long, count: Int, status: Long): Int =
    0

public actual fun ucol_open(loc: PCSTR, status: Long): Long =
    0L

public actual fun ucol_openAvailableLocales(status: Long): Long =
    0L

public actual fun ucol_openBinary(bin: Long, length: Int, base: Long, status: Long): Long =
    0L

public actual fun ucol_openElements(coll: Long, text: Long, textlength: Int, status: Long): Long =
    0L

public actual fun ucol_openRules(rules: Long, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: Long, status: Long): Long =
    0L

public actual fun ucol_previous(elems: Long, status: Long): Int =
    0

public actual fun ucol_primaryOrder(order: Int): Int =
    0

public actual fun ucol_reset(elems: Long) {
}

public actual fun ucol_safeClone(coll: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    0L

public actual fun ucol_secondaryOrder(order: Int): Int =
    0

public actual fun ucol_setAttribute(coll: Long, attr: UColAttribute, value: UColAttributeValue, status: Long) {
}

public actual fun ucol_setMaxVariable(coll: Long, group: UColReorderCode, perrorcode: Long) {
}

public actual fun ucol_setOffset(elems: Long, offset: Int, status: Long) {
}

public actual fun ucol_setReorderCodes(coll: Long, reordercodes: Long, reordercodeslength: Int, perrorcode: Long) {
}

public actual fun ucol_setStrength(coll: Long, strength: UColAttributeValue) {
}

public actual fun ucol_setText(elems: Long, text: Long, textlength: Int, status: Long) {
}

public actual fun ucol_strcoll(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): UCollationResult =
    0

public actual fun ucol_strcollIter(coll: Long, siter: Long, titer: Long, status: Long): UCollationResult =
    0

public actual fun ucol_strcollUTF8(coll: Long, source: PCSTR, sourcelength: Int, target: PCSTR, targetlength: Int, status: Long): UCollationResult =
    0

public actual fun ucol_tertiaryOrder(order: Int): Int =
    0

public actual fun ucpmap_get(map: Long, c: Int): UInt =
    0u

public actual fun ucpmap_getRange(map: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    0

public actual fun ucptrie_close(trie: Long) {
}

public actual fun ucptrie_get(trie: Long, c: Int): UInt =
    0u

public actual fun ucptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    0

public actual fun ucptrie_getType(trie: Long): UCPTrieType =
    0

public actual fun ucptrie_getValueWidth(trie: Long): UCPTrieValueWidth =
    0

public actual fun ucptrie_internalSmallIndex(trie: Long, c: Int): Int =
    0

public actual fun ucptrie_internalSmallU8Index(trie: Long, lt1: Int, t2: UByte, t3: UByte): Int =
    0

public actual fun ucptrie_internalU8PrevIndex(trie: Long, c: Int, start: Long, src: Long): Int =
    0

public actual fun ucptrie_openFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long =
    0L

public actual fun ucptrie_toBinary(trie: Long, data: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun ucsdet_close(ucsd: Long) {
}

public actual fun ucsdet_detect(ucsd: Long, status: Long): Long =
    0L

public actual fun ucsdet_detectAll(ucsd: Long, matchesfound: Long, status: Long): Long =
    0L

public actual fun ucsdet_enableInputFilter(ucsd: Long, filter: Byte): Byte =
    0

public actual fun ucsdet_getAllDetectableCharsets(ucsd: Long, status: Long): Long =
    0L

public actual fun ucsdet_getConfidence(ucsm: Long, status: Long): Int =
    0

public actual fun ucsdet_getLanguage(ucsm: Long, status: Long): PCSTR =
    0L

public actual fun ucsdet_getName(ucsm: Long, status: Long): PCSTR =
    0L

public actual fun ucsdet_getUChars(ucsm: Long, buf: Long, cap: Int, status: Long): Int =
    0

public actual fun ucsdet_isInputFilterEnabled(ucsd: Long): Byte =
    0

public actual fun ucsdet_open(status: Long): Long =
    0L

public actual fun ucsdet_setDeclaredEncoding(ucsd: Long, encoding: PCSTR, length: Int, status: Long) {
}

public actual fun ucsdet_setText(ucsd: Long, textin: PCSTR, len: Int, status: Long) {
}

public actual fun ucurr_countCurrencies(locale: PCSTR, date: Double, ec: Long): Int =
    0

public actual fun ucurr_forLocale(locale: PCSTR, buff: Long, buffcapacity: Int, ec: Long): Int =
    0

public actual fun ucurr_forLocaleAndDate(locale: PCSTR, date: Double, index: Int, buff: Long, buffcapacity: Int, ec: Long): Int =
    0

public actual fun ucurr_getDefaultFractionDigits(currency: Long, ec: Long): Int =
    0

public actual fun ucurr_getDefaultFractionDigitsForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Int =
    0

public actual fun ucurr_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    0L

public actual fun ucurr_getName(currency: Long, locale: PCSTR, namestyle: UCurrNameStyle, ischoiceformat: Long, len: Long, ec: Long): Long =
    0L

public actual fun ucurr_getNumericCode(currency: Long): Int =
    0

public actual fun ucurr_getPluralName(currency: Long, locale: PCSTR, ischoiceformat: Long, pluralcount: PCSTR, len: Long, ec: Long): Long =
    0L

public actual fun ucurr_getRoundingIncrement(currency: Long, ec: Long): Double =
    0.0

public actual fun ucurr_getRoundingIncrementForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Double =
    0.0

public actual fun ucurr_isAvailable(isocode: Long, from: Double, to: Double, errorcode: Long): Byte =
    0

public actual fun ucurr_openISOCurrencies(currtype: UInt, perrorcode: Long): Long =
    0L

public actual fun ucurr_register(isocode: Long, locale: PCSTR, status: Long): Long =
    0L

public actual fun ucurr_unregister(key: Long, status: Long): Byte =
    0

public actual fun udat_adoptNumberFormat(fmt: Long, numberformattoadopt: Long) {
}

public actual fun udat_adoptNumberFormatForFields(fmt: Long, fields: Long, numberformattoset: Long, status: Long) {
}

public actual fun udat_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int) {
}

public actual fun udat_clone(fmt: Long, status: Long): Long =
    0L

public actual fun udat_close(format: Long) {
}

public actual fun udat_countAvailable(): Int =
    0

public actual fun udat_countSymbols(fmt: Long, type: UDateFormatSymbolType): Int =
    0

public actual fun udat_format(format: Long, datetoformat: Double, result: Long, resultlength: Int, position: Long, status: Long): Int =
    0

public actual fun udat_formatCalendar(format: Long, calendar: Long, result: Long, capacity: Int, position: Long, status: Long): Int =
    0

public actual fun udat_formatCalendarForFields(format: Long, calendar: Long, result: Long, capacity: Int, fpositer: Long, status: Long): Int =
    0

public actual fun udat_formatForFields(format: Long, datetoformat: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int =
    0

public actual fun udat_get2DigitYearStart(fmt: Long, status: Long): Double =
    0.0

public actual fun udat_getAvailable(localeindex: Int): PCSTR =
    0L

public actual fun udat_getBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, status: Long): Byte =
    0

public actual fun udat_getCalendar(fmt: Long): Long =
    0L

public actual fun udat_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext =
    0

public actual fun udat_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    0L

public actual fun udat_getNumberFormat(fmt: Long): Long =
    0L

public actual fun udat_getNumberFormatForField(fmt: Long, field: UShort): Long =
    0L

public actual fun udat_getSymbols(fmt: Long, type: UDateFormatSymbolType, symbolindex: Int, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun udat_isLenient(fmt: Long): Byte =
    0

public actual fun udat_open(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: PCSTR, tzid: Long, tzidlength: Int, pattern: Long, patternlength: Int, status: Long): Long =
    0L

public actual fun udat_parse(format: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double =
    0.0

public actual fun udat_parseCalendar(format: Long, calendar: Long, text: Long, textlength: Int, parsepos: Long, status: Long) {
}

public actual fun udat_set2DigitYearStart(fmt: Long, d: Double, status: Long) {
}

public actual fun udat_setBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: Long) {
}

public actual fun udat_setCalendar(fmt: Long, calendartoset: Long) {
}

public actual fun udat_setContext(fmt: Long, value: UDisplayContext, status: Long) {
}

public actual fun udat_setLenient(fmt: Long, islenient: Byte) {
}

public actual fun udat_setNumberFormat(fmt: Long, numberformattoset: Long) {
}

public actual fun udat_setSymbols(format: Long, type: UDateFormatSymbolType, symbolindex: Int, value: Long, valuelength: Int, status: Long) {
}

public actual fun udat_toCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    0

public actual fun udat_toPattern(fmt: Long, localized: Byte, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun udatpg_addPattern(dtpg: Long, pattern: Long, patternlength: Int, override: Byte, conflictingpattern: Long, capacity: Int, plength: Long, perrorcode: Long): UDateTimePatternConflict =
    0

public actual fun udatpg_clone(dtpg: Long, perrorcode: Long): Long =
    0L

public actual fun udatpg_close(dtpg: Long) {
}

public actual fun udatpg_getAppendItemFormat(dtpg: Long, field: UDateTimePatternField, plength: Long): Long =
    0L

public actual fun udatpg_getAppendItemName(dtpg: Long, field: UDateTimePatternField, plength: Long): Long =
    0L

public actual fun udatpg_getBaseSkeleton(unuseddtpg: Long, pattern: Long, length: Int, baseskeleton: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun udatpg_getBestPattern(dtpg: Long, skeleton: Long, length: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun udatpg_getBestPatternWithOptions(dtpg: Long, skeleton: Long, length: Int, options: UDateTimePatternMatchOptions, bestpattern: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun udatpg_getDateTimeFormat(dtpg: Long, plength: Long): Long =
    0L

public actual fun udatpg_getDecimal(dtpg: Long, plength: Long): Long =
    0L

public actual fun udatpg_getFieldDisplayName(dtpg: Long, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun udatpg_getPatternForSkeleton(dtpg: Long, skeleton: Long, skeletonlength: Int, plength: Long): Long =
    0L

public actual fun udatpg_getSkeleton(unuseddtpg: Long, pattern: Long, length: Int, skeleton: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun udatpg_open(locale: PCSTR, perrorcode: Long): Long =
    0L

public actual fun udatpg_openBaseSkeletons(dtpg: Long, perrorcode: Long): Long =
    0L

public actual fun udatpg_openEmpty(perrorcode: Long): Long =
    0L

public actual fun udatpg_openSkeletons(dtpg: Long, perrorcode: Long): Long =
    0L

public actual fun udatpg_replaceFieldTypes(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    0

public actual fun udatpg_replaceFieldTypesWithOptions(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    0

public actual fun udatpg_setAppendItemFormat(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
}

public actual fun udatpg_setAppendItemName(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
}

public actual fun udatpg_setDateTimeFormat(dtpg: Long, dtformat: Long, length: Int) {
}

public actual fun udatpg_setDecimal(dtpg: Long, decimal: Long, length: Int) {
}

public actual fun udtitvfmt_close(formatter: Long) {
}

public actual fun udtitvfmt_closeResult(uresult: Long) {
}

public actual fun udtitvfmt_format(formatter: Long, fromdate: Double, todate: Double, result: Long, resultcapacity: Int, position: Long, status: Long): Int =
    0

public actual fun udtitvfmt_open(locale: PCSTR, skeleton: Long, skeletonlength: Int, tzid: Long, tzidlength: Int, status: Long): Long =
    0L

public actual fun udtitvfmt_openResult(ec: Long): Long =
    0L

public actual fun udtitvfmt_resultAsValue(uresult: Long, ec: Long): Long =
    0L

public actual fun uenum_close(en: Long) {
}

public actual fun uenum_count(en: Long, status: Long): Int =
    0

public actual fun uenum_next(en: Long, resultlength: Long, status: Long): PCSTR =
    0L

public actual fun uenum_openCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long =
    0L

public actual fun uenum_openUCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long =
    0L

public actual fun uenum_reset(en: Long, status: Long) {
}

public actual fun uenum_unext(en: Long, resultlength: Long, status: Long): Long =
    0L

public actual fun ufieldpositer_close(fpositer: Long) {
}

public actual fun ufieldpositer_next(fpositer: Long, beginindex: Long, endindex: Long): Int =
    0

public actual fun ufieldpositer_open(status: Long): Long =
    0L

public actual fun ufmt_close(fmt: Long) {
}

public actual fun ufmt_getArrayItemByIndex(fmt: Long, n: Int, status: Long): Long =
    0L

public actual fun ufmt_getArrayLength(fmt: Long, status: Long): Int =
    0

public actual fun ufmt_getDate(fmt: Long, status: Long): Double =
    0.0

public actual fun ufmt_getDecNumChars(fmt: Long, len: Long, status: Long): PCSTR =
    0L

public actual fun ufmt_getDouble(fmt: Long, status: Long): Double =
    0.0

public actual fun ufmt_getInt64(fmt: Long, status: Long): Long =
    0L

public actual fun ufmt_getLong(fmt: Long, status: Long): Int =
    0

public actual fun ufmt_getObject(fmt: Long, status: Long): Long =
    0L

public actual fun ufmt_getType(fmt: Long, status: Long): UFormattableType =
    0

public actual fun ufmt_getUChars(fmt: Long, len: Long, status: Long): Long =
    0L

public actual fun ufmt_isNumeric(fmt: Long): Byte =
    0

public actual fun ufmt_open(status: Long): Long =
    0L

public actual fun ufmtval_getString(ufmtval: Long, plength: Long, ec: Long): Long =
    0L

public actual fun ufmtval_nextPosition(ufmtval: Long, ucfpos: Long, ec: Long): Byte =
    0

public actual fun ugender_getInstance(locale: PCSTR, status: Long): Long =
    0L

public actual fun ugender_getListGender(genderinfo: Long, genders: Long, size: Int, status: Long): UGender =
    0

public actual fun uidna_close(idna: Long) {
}

public actual fun uidna_labelToASCII(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    0

public actual fun uidna_labelToASCII_UTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    0

public actual fun uidna_labelToUnicode(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    0

public actual fun uidna_labelToUnicodeUTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    0

public actual fun uidna_nameToASCII(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    0

public actual fun uidna_nameToASCII_UTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    0

public actual fun uidna_nameToUnicode(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    0

public actual fun uidna_nameToUnicodeUTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    0

public actual fun uidna_openUTS46(options: UInt, perrorcode: Long): Long =
    0L

public actual fun uiter_current32(iter: Long): Int =
    0

public actual fun uiter_getState(iter: Long): UInt =
    0u

public actual fun uiter_next32(iter: Long): Int =
    0

public actual fun uiter_previous32(iter: Long): Int =
    0

public actual fun uiter_setState(iter: Long, state: UInt, perrorcode: Long) {
}

public actual fun uiter_setString(iter: Long, s: Long, length: Int) {
}

public actual fun uiter_setUTF16BE(iter: Long, s: PCSTR, length: Int) {
}

public actual fun uiter_setUTF8(iter: Long, s: PCSTR, length: Int) {
}

public actual fun uldn_close(ldn: Long) {
}

public actual fun uldn_getContext(ldn: Long, type: UDisplayContextType, perrorcode: Long): UDisplayContext =
    0

public actual fun uldn_getDialectHandling(ldn: Long): UDialectHandling =
    0

public actual fun uldn_getLocale(ldn: Long): PCSTR =
    0L

public actual fun uldn_keyDisplayName(ldn: Long, key: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    0

public actual fun uldn_keyValueDisplayName(ldn: Long, key: PCSTR, value: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    0

public actual fun uldn_languageDisplayName(ldn: Long, lang: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    0

public actual fun uldn_localeDisplayName(ldn: Long, locale: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    0

public actual fun uldn_open(locale: PCSTR, dialecthandling: UDialectHandling, perrorcode: Long): Long =
    0L

public actual fun uldn_openForContext(locale: PCSTR, contexts: Long, length: Int, perrorcode: Long): Long =
    0L

public actual fun uldn_regionDisplayName(ldn: Long, region: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    0

public actual fun uldn_scriptCodeDisplayName(ldn: Long, scriptcode: UScriptCode, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    0

public actual fun uldn_scriptDisplayName(ldn: Long, script: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    0

public actual fun uldn_variantDisplayName(ldn: Long, variant: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    0

public actual fun ulistfmt_close(listfmt: Long) {
}

public actual fun ulistfmt_closeResult(uresult: Long) {
}

public actual fun ulistfmt_format(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, result: Long, resultcapacity: Int, status: Long): Int =
    0

public actual fun ulistfmt_formatStringsToResult(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, uresult: Long, status: Long) {
}

public actual fun ulistfmt_open(locale: PCSTR, status: Long): Long =
    0L

public actual fun ulistfmt_openForType(locale: PCSTR, type: UListFormatterType, width: UListFormatterWidth, status: Long): Long =
    0L

public actual fun ulistfmt_openResult(ec: Long): Long =
    0L

public actual fun ulistfmt_resultAsValue(uresult: Long, ec: Long): Long =
    0L

public actual fun uloc_acceptLanguage(result: PCSTR, resultavailable: Int, outresult: Long, acceptlist: Long, acceptlistcount: Int, availablelocales: Long, status: Long): Int =
    0

public actual fun uloc_acceptLanguageFromHTTP(result: PCSTR, resultavailable: Int, outresult: Long, httpacceptlanguage: PCSTR, availablelocales: Long, status: Long): Int =
    0

public actual fun uloc_addLikelySubtags(localeid: PCSTR, maximizedlocaleid: PCSTR, maximizedlocaleidcapacity: Int, err: Long): Int =
    0

public actual fun uloc_canonicalize(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    0

public actual fun uloc_countAvailable(): Int =
    0

public actual fun uloc_forLanguageTag(langtag: PCSTR, localeid: PCSTR, localeidcapacity: Int, parsedlength: Long, err: Long): Int =
    0

public actual fun uloc_getAvailable(n: Int): PCSTR =
    0L

public actual fun uloc_getBaseName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    0

public actual fun uloc_getCharacterOrientation(localeid: PCSTR, status: Long): ULayoutType =
    0

public actual fun uloc_getCountry(localeid: PCSTR, country: PCSTR, countrycapacity: Int, err: Long): Int =
    0

public actual fun uloc_getDefault(): PCSTR =
    0L

public actual fun uloc_getDisplayCountry(locale: PCSTR, displaylocale: PCSTR, country: Long, countrycapacity: Int, status: Long): Int =
    0

public actual fun uloc_getDisplayKeyword(keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int =
    0

public actual fun uloc_getDisplayKeywordValue(locale: PCSTR, keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int =
    0

public actual fun uloc_getDisplayLanguage(locale: PCSTR, displaylocale: PCSTR, language: Long, languagecapacity: Int, status: Long): Int =
    0

public actual fun uloc_getDisplayName(localeid: PCSTR, inlocaleid: PCSTR, result: Long, maxresultsize: Int, err: Long): Int =
    0

public actual fun uloc_getDisplayScript(locale: PCSTR, displaylocale: PCSTR, script: Long, scriptcapacity: Int, status: Long): Int =
    0

public actual fun uloc_getDisplayVariant(locale: PCSTR, displaylocale: PCSTR, variant: Long, variantcapacity: Int, status: Long): Int =
    0

public actual fun uloc_getISO3Country(localeid: PCSTR): PCSTR =
    0L

public actual fun uloc_getISO3Language(localeid: PCSTR): PCSTR =
    0L

public actual fun uloc_getISOCountries(): Long =
    0L

public actual fun uloc_getISOLanguages(): Long =
    0L

public actual fun uloc_getKeywordValue(localeid: PCSTR, keywordname: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int =
    0

public actual fun uloc_getLCID(localeid: PCSTR): UInt =
    0u

public actual fun uloc_getLanguage(localeid: PCSTR, language: PCSTR, languagecapacity: Int, err: Long): Int =
    0

public actual fun uloc_getLineOrientation(localeid: PCSTR, status: Long): ULayoutType =
    0

public actual fun uloc_getLocaleForLCID(hostid: UInt, locale: PCSTR, localecapacity: Int, status: Long): Int =
    0

public actual fun uloc_getName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    0

public actual fun uloc_getParent(localeid: PCSTR, parent: PCSTR, parentcapacity: Int, err: Long): Int =
    0

public actual fun uloc_getScript(localeid: PCSTR, script: PCSTR, scriptcapacity: Int, err: Long): Int =
    0

public actual fun uloc_getVariant(localeid: PCSTR, variant: PCSTR, variantcapacity: Int, err: Long): Int =
    0

public actual fun uloc_isRightToLeft(locale: PCSTR): Byte =
    0

public actual fun uloc_minimizeSubtags(localeid: PCSTR, minimizedlocaleid: PCSTR, minimizedlocaleidcapacity: Int, err: Long): Int =
    0

public actual fun uloc_openAvailableByType(type: ULocAvailableType, status: Long): Long =
    0L

public actual fun uloc_openKeywords(localeid: PCSTR, status: Long): Long =
    0L

public actual fun uloc_setDefault(localeid: PCSTR, status: Long) {
}

public actual fun uloc_setKeywordValue(keywordname: PCSTR, keywordvalue: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int =
    0

public actual fun uloc_toLanguageTag(localeid: PCSTR, langtag: PCSTR, langtagcapacity: Int, strict: Byte, err: Long): Int =
    0

public actual fun uloc_toLegacyKey(keyword: PCSTR): PCSTR =
    0L

public actual fun uloc_toLegacyType(keyword: PCSTR, value: PCSTR): PCSTR =
    0L

public actual fun uloc_toUnicodeLocaleKey(keyword: PCSTR): PCSTR =
    0L

public actual fun uloc_toUnicodeLocaleType(keyword: PCSTR, value: PCSTR): PCSTR =
    0L

public actual fun ulocdata_close(uld: Long) {
}

public actual fun ulocdata_getCLDRVersion(versionarray: Long, status: Long) {
}

public actual fun ulocdata_getDelimiter(uld: Long, type: ULocaleDataDelimiterType, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun ulocdata_getExemplarSet(uld: Long, fillin: Long, options: UInt, extype: ULocaleDataExemplarSetType, status: Long): Long =
    0L

public actual fun ulocdata_getLocaleDisplayPattern(uld: Long, pattern: Long, patterncapacity: Int, status: Long): Int =
    0

public actual fun ulocdata_getLocaleSeparator(uld: Long, separator: Long, separatorcapacity: Int, status: Long): Int =
    0

public actual fun ulocdata_getMeasurementSystem(localeid: PCSTR, status: Long): UMeasurementSystem =
    0

public actual fun ulocdata_getNoSubstitute(uld: Long): Byte =
    0

public actual fun ulocdata_getPaperSize(localeid: PCSTR, height: Long, width: Long, status: Long) {
}

public actual fun ulocdata_open(localeid: PCSTR, status: Long): Long =
    0L

public actual fun ulocdata_setNoSubstitute(uld: Long, setting: Byte) {
}

public actual fun umsg_applyPattern(fmt: Long, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
}

public actual fun umsg_autoQuoteApostrophe(pattern: Long, patternlength: Int, dest: Long, destcapacity: Int, ec: Long): Int =
    0

public actual fun umsg_clone(fmt: Long, status: Long): Long =
    0L

public actual fun umsg_close(format: Long) {
}

public actual fun umsg_format(fmt: Long, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun umsg_getLocale(fmt: Long): PCSTR =
    0L

public actual fun umsg_open(pattern: Long, patternlength: Int, locale: PCSTR, parseerror: Long, status: Long): Long =
    0L

public actual fun umsg_parse(fmt: Long, source: Long, sourcelength: Int, count: Long, status: Long) {
}

public actual fun umsg_setLocale(fmt: Long, locale: PCSTR) {
}

public actual fun umsg_toPattern(fmt: Long, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun umsg_vformat(fmt: Long, result: Long, resultlength: Int, ap: Long, status: Long): Int =
    0

public actual fun umsg_vparse(fmt: Long, source: Long, sourcelength: Int, count: Long, ap: Long, status: Long) {
}

public actual fun umutablecptrie_buildImmutable(trie: Long, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: Long): Long =
    0L

public actual fun umutablecptrie_clone(other: Long, perrorcode: Long): Long =
    0L

public actual fun umutablecptrie_close(trie: Long) {
}

public actual fun umutablecptrie_fromUCPMap(map: Long, perrorcode: Long): Long =
    0L

public actual fun umutablecptrie_fromUCPTrie(trie: Long, perrorcode: Long): Long =
    0L

public actual fun umutablecptrie_get(trie: Long, c: Int): UInt =
    0u

public actual fun umutablecptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    0

public actual fun umutablecptrie_open(initialvalue: UInt, errorvalue: UInt, perrorcode: Long): Long =
    0L

public actual fun umutablecptrie_set(trie: Long, c: Int, value: UInt, perrorcode: Long) {
}

public actual fun umutablecptrie_setRange(trie: Long, start: Int, end: Int, value: UInt, perrorcode: Long) {
}

public actual fun unorm2_append(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int =
    0

public actual fun unorm2_close(norm2: Long) {
}

public actual fun unorm2_composePair(norm2: Long, a: Int, b: Int): Int =
    0

public actual fun unorm2_getCombiningClass(norm2: Long, c: Int): UByte =
    0u

public actual fun unorm2_getDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun unorm2_getInstance(packagename: PCSTR, name: PCSTR, mode: UNormalization2Mode, perrorcode: Long): Long =
    0L

public actual fun unorm2_getNFCInstance(perrorcode: Long): Long =
    0L

public actual fun unorm2_getNFDInstance(perrorcode: Long): Long =
    0L

public actual fun unorm2_getNFKCCasefoldInstance(perrorcode: Long): Long =
    0L

public actual fun unorm2_getNFKCInstance(perrorcode: Long): Long =
    0L

public actual fun unorm2_getNFKDInstance(perrorcode: Long): Long =
    0L

public actual fun unorm2_getRawDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun unorm2_hasBoundaryAfter(norm2: Long, c: Int): Byte =
    0

public actual fun unorm2_hasBoundaryBefore(norm2: Long, c: Int): Byte =
    0

public actual fun unorm2_isInert(norm2: Long, c: Int): Byte =
    0

public actual fun unorm2_isNormalized(norm2: Long, s: Long, length: Int, perrorcode: Long): Byte =
    0

public actual fun unorm2_normalize(norm2: Long, src: Long, length: Int, dest: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun unorm2_normalizeSecondAndAppend(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int =
    0

public actual fun unorm2_openFiltered(norm2: Long, filterset: Long, perrorcode: Long): Long =
    0L

public actual fun unorm2_quickCheck(norm2: Long, s: Long, length: Int, perrorcode: Long): UNormalizationCheckResult =
    0

public actual fun unorm2_spanQuickCheckYes(norm2: Long, s: Long, length: Int, perrorcode: Long): Int =
    0

public actual fun unorm_compare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int =
    0

public actual fun unum_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
}

public actual fun unum_clone(fmt: Long, status: Long): Long =
    0L

public actual fun unum_close(fmt: Long) {
}

public actual fun unum_countAvailable(): Int =
    0

public actual fun unum_format(fmt: Long, number: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    0

public actual fun unum_formatDecimal(fmt: Long, number: PCSTR, length: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    0

public actual fun unum_formatDouble(fmt: Long, number: Double, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    0

public actual fun unum_formatDoubleCurrency(fmt: Long, number: Double, currency: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    0

public actual fun unum_formatDoubleForFields(format: Long, number: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int =
    0

public actual fun unum_formatInt64(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    0

public actual fun unum_formatUFormattable(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    0

public actual fun unum_getAttribute(fmt: Long, attr: UNumberFormatAttribute): Int =
    0

public actual fun unum_getAvailable(localeindex: Int): PCSTR =
    0L

public actual fun unum_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext =
    0

public actual fun unum_getDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute): Double =
    0.0

public actual fun unum_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    0L

public actual fun unum_getSymbol(fmt: Long, symbol: UNumberFormatSymbol, buffer: Long, size: Int, status: Long): Int =
    0

public actual fun unum_getTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun unum_open(style: UNumberFormatStyle, pattern: Long, patternlength: Int, locale: PCSTR, parseerr: Long, status: Long): Long =
    0L

public actual fun unum_parse(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Int =
    0

public actual fun unum_parseDecimal(fmt: Long, text: Long, textlength: Int, parsepos: Long, outbuf: PCSTR, outbuflength: Int, status: Long): Int =
    0

public actual fun unum_parseDouble(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double =
    0.0

public actual fun unum_parseDoubleCurrency(fmt: Long, text: Long, textlength: Int, parsepos: Long, currency: Long, status: Long): Double =
    0.0

public actual fun unum_parseInt64(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long =
    0L

public actual fun unum_parseToUFormattable(fmt: Long, result: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long =
    0L

public actual fun unum_setAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Int) {
}

public actual fun unum_setContext(fmt: Long, value: UDisplayContext, status: Long) {
}

public actual fun unum_setDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Double) {
}

public actual fun unum_setSymbol(fmt: Long, symbol: UNumberFormatSymbol, value: Long, length: Int, status: Long) {
}

public actual fun unum_setTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, newvalue: Long, newvaluelength: Int, status: Long) {
}

public actual fun unum_toPattern(fmt: Long, ispatternlocalized: Byte, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun unumf_close(uformatter: Long) {
}

public actual fun unumf_closeResult(uresult: Long) {
}

public actual fun unumf_formatDecimal(uformatter: Long, value: PCSTR, valuelen: Int, uresult: Long, ec: Long) {
}

public actual fun unumf_formatDouble(uformatter: Long, value: Double, uresult: Long, ec: Long) {
}

public actual fun unumf_formatInt(uformatter: Long, value: Long, uresult: Long, ec: Long) {
}

public actual fun unumf_openForSkeletonAndLocale(skeleton: Long, skeletonlen: Int, locale: PCSTR, ec: Long): Long =
    0L

public actual fun unumf_openForSkeletonAndLocaleWithError(skeleton: Long, skeletonlen: Int, locale: PCSTR, perror: Long, ec: Long): Long =
    0L

public actual fun unumf_openResult(ec: Long): Long =
    0L

public actual fun unumf_resultAsValue(uresult: Long, ec: Long): Long =
    0L

public actual fun unumf_resultGetAllFieldPositions(uresult: Long, ufpositer: Long, ec: Long) {
}

public actual fun unumf_resultNextFieldPosition(uresult: Long, ufpos: Long, ec: Long): Byte =
    0

public actual fun unumf_resultToString(uresult: Long, buffer: Long, buffercapacity: Int, ec: Long): Int =
    0

public actual fun unumsys_close(unumsys: Long) {
}

public actual fun unumsys_getDescription(unumsys: Long, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun unumsys_getName(unumsys: Long): PCSTR =
    0L

public actual fun unumsys_getRadix(unumsys: Long): Int =
    0

public actual fun unumsys_isAlgorithmic(unumsys: Long): Byte =
    0

public actual fun unumsys_open(locale: PCSTR, status: Long): Long =
    0L

public actual fun unumsys_openAvailableNames(status: Long): Long =
    0L

public actual fun unumsys_openByName(name: PCSTR, status: Long): Long =
    0L

public actual fun uplrules_close(uplrules: Long) {
}

public actual fun uplrules_getKeywords(uplrules: Long, status: Long): Long =
    0L

public actual fun uplrules_open(locale: PCSTR, status: Long): Long =
    0L

public actual fun uplrules_openForType(locale: PCSTR, type: UPluralType, status: Long): Long =
    0L

public actual fun uplrules_select(uplrules: Long, number: Double, keyword: Long, capacity: Int, status: Long): Int =
    0

public actual fun uplrules_selectFormatted(uplrules: Long, number: Long, keyword: Long, capacity: Int, status: Long): Int =
    0

public actual fun uregex_appendReplacement(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Long, status: Long): Int =
    0

public actual fun uregex_appendReplacementUText(regexp: Long, replacementtext: Long, dest: Long, status: Long) {
}

public actual fun uregex_appendTail(regexp: Long, destbuf: Long, destcapacity: Long, status: Long): Int =
    0

public actual fun uregex_appendTailUText(regexp: Long, dest: Long, status: Long): Long =
    0L

public actual fun uregex_clone(regexp: Long, status: Long): Long =
    0L

public actual fun uregex_close(regexp: Long) {
}

public actual fun uregex_end(regexp: Long, groupnum: Int, status: Long): Int =
    0

public actual fun uregex_end64(regexp: Long, groupnum: Int, status: Long): Long =
    0L

public actual fun uregex_find(regexp: Long, startindex: Int, status: Long): Byte =
    0

public actual fun uregex_find64(regexp: Long, startindex: Long, status: Long): Byte =
    0

public actual fun uregex_findNext(regexp: Long, status: Long): Byte =
    0

public actual fun uregex_flags(regexp: Long, status: Long): Int =
    0

public actual fun uregex_getFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long) {
}

public actual fun uregex_getMatchCallback(regexp: Long, callback: Long, context: Long, status: Long) {
}

public actual fun uregex_getStackLimit(regexp: Long, status: Long): Int =
    0

public actual fun uregex_getText(regexp: Long, textlength: Long, status: Long): Long =
    0L

public actual fun uregex_getTimeLimit(regexp: Long, status: Long): Int =
    0

public actual fun uregex_getUText(regexp: Long, dest: Long, status: Long): Long =
    0L

public actual fun uregex_group(regexp: Long, groupnum: Int, dest: Long, destcapacity: Int, status: Long): Int =
    0

public actual fun uregex_groupCount(regexp: Long, status: Long): Int =
    0

public actual fun uregex_groupNumberFromCName(regexp: Long, groupname: PCSTR, namelength: Int, status: Long): Int =
    0

public actual fun uregex_groupNumberFromName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int =
    0

public actual fun uregex_groupUText(regexp: Long, groupnum: Int, dest: Long, grouplength: Long, status: Long): Long =
    0L

public actual fun uregex_hasAnchoringBounds(regexp: Long, status: Long): Byte =
    0

public actual fun uregex_hasTransparentBounds(regexp: Long, status: Long): Byte =
    0

public actual fun uregex_hitEnd(regexp: Long, status: Long): Byte =
    0

public actual fun uregex_lookingAt(regexp: Long, startindex: Int, status: Long): Byte =
    0

public actual fun uregex_lookingAt64(regexp: Long, startindex: Long, status: Long): Byte =
    0

public actual fun uregex_matches(regexp: Long, startindex: Int, status: Long): Byte =
    0

public actual fun uregex_matches64(regexp: Long, startindex: Long, status: Long): Byte =
    0

public actual fun uregex_open(pattern: Long, patternlength: Int, flags: UInt, pe: Long, status: Long): Long =
    0L

public actual fun uregex_openC(pattern: PCSTR, flags: UInt, pe: Long, status: Long): Long =
    0L

public actual fun uregex_openUText(pattern: Long, flags: UInt, pe: Long, status: Long): Long =
    0L

public actual fun uregex_pattern(regexp: Long, patlength: Long, status: Long): Long =
    0L

public actual fun uregex_patternUText(regexp: Long, status: Long): Long =
    0L

public actual fun uregex_refreshUText(regexp: Long, text: Long, status: Long) {
}

public actual fun uregex_regionEnd(regexp: Long, status: Long): Int =
    0

public actual fun uregex_regionEnd64(regexp: Long, status: Long): Long =
    0L

public actual fun uregex_regionStart(regexp: Long, status: Long): Int =
    0

public actual fun uregex_regionStart64(regexp: Long, status: Long): Long =
    0L

public actual fun uregex_replaceAll(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int =
    0

public actual fun uregex_replaceAllUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long =
    0L

public actual fun uregex_replaceFirst(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int =
    0

public actual fun uregex_replaceFirstUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long =
    0L

public actual fun uregex_requireEnd(regexp: Long, status: Long): Byte =
    0

public actual fun uregex_reset(regexp: Long, index: Int, status: Long) {
}

public actual fun uregex_reset64(regexp: Long, index: Long, status: Long) {
}

public actual fun uregex_setFindProgressCallback(regexp: Long, callback: URegexFindProgressCallback, context: Long, status: Long) {
}

public actual fun uregex_setMatchCallback(regexp: Long, callback: URegexMatchCallback, context: Long, status: Long) {
}

public actual fun uregex_setRegion(regexp: Long, regionstart: Int, regionlimit: Int, status: Long) {
}

public actual fun uregex_setRegion64(regexp: Long, regionstart: Long, regionlimit: Long, status: Long) {
}

public actual fun uregex_setRegionAndStart(regexp: Long, regionstart: Long, regionlimit: Long, startindex: Long, status: Long) {
}

public actual fun uregex_setStackLimit(regexp: Long, limit: Int, status: Long) {
}

public actual fun uregex_setText(regexp: Long, text: Long, textlength: Int, status: Long) {
}

public actual fun uregex_setTimeLimit(regexp: Long, limit: Int, status: Long) {
}

public actual fun uregex_setUText(regexp: Long, text: Long, status: Long) {
}

public actual fun uregex_split(regexp: Long, destbuf: Long, destcapacity: Int, requiredcapacity: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int =
    0

public actual fun uregex_splitUText(regexp: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int =
    0

public actual fun uregex_start(regexp: Long, groupnum: Int, status: Long): Int =
    0

public actual fun uregex_start64(regexp: Long, groupnum: Int, status: Long): Long =
    0L

public actual fun uregex_useAnchoringBounds(regexp: Long, b: Byte, status: Long) {
}

public actual fun uregex_useTransparentBounds(regexp: Long, b: Byte, status: Long) {
}

public actual fun uregion_areEqual(uregion: Long, otherregion: Long): Byte =
    0

public actual fun uregion_contains(uregion: Long, otherregion: Long): Byte =
    0

public actual fun uregion_getAvailable(type: URegionType, status: Long): Long =
    0L

public actual fun uregion_getContainedRegions(uregion: Long, status: Long): Long =
    0L

public actual fun uregion_getContainedRegionsOfType(uregion: Long, type: URegionType, status: Long): Long =
    0L

public actual fun uregion_getContainingRegion(uregion: Long): Long =
    0L

public actual fun uregion_getContainingRegionOfType(uregion: Long, type: URegionType): Long =
    0L

public actual fun uregion_getNumericCode(uregion: Long): Int =
    0

public actual fun uregion_getPreferredValues(uregion: Long, status: Long): Long =
    0L

public actual fun uregion_getRegionCode(uregion: Long): PCSTR =
    0L

public actual fun uregion_getRegionFromCode(regioncode: PCSTR, status: Long): Long =
    0L

public actual fun uregion_getRegionFromNumericCode(code: Int, status: Long): Long =
    0L

public actual fun uregion_getType(uregion: Long): URegionType =
    0

public actual fun ureldatefmt_close(reldatefmt: Long) {
}

public actual fun ureldatefmt_closeResult(ufrdt: Long) {
}

public actual fun ureldatefmt_combineDateAndTime(reldatefmt: Long, relativedatestring: Long, relativedatestringlen: Int, timestring: Long, timestringlen: Int, result: Long, resultcapacity: Int, status: Long): Int =
    0

public actual fun ureldatefmt_format(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int =
    0

public actual fun ureldatefmt_formatNumeric(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int =
    0

public actual fun ureldatefmt_formatNumericToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
}

public actual fun ureldatefmt_formatToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
}

public actual fun ureldatefmt_open(locale: PCSTR, nftoadopt: Long, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: Long): Long =
    0L

public actual fun ureldatefmt_openResult(ec: Long): Long =
    0L

public actual fun ureldatefmt_resultAsValue(ufrdt: Long, ec: Long): Long =
    0L

public actual fun ures_close(resourcebundle: Long) {
}

public actual fun ures_getBinary(resourcebundle: Long, len: Long, status: Long): Long =
    0L

public actual fun ures_getByIndex(resourcebundle: Long, indexr: Int, fillin: Long, status: Long): Long =
    0L

public actual fun ures_getByKey(resourcebundle: Long, key: PCSTR, fillin: Long, status: Long): Long =
    0L

public actual fun ures_getInt(resourcebundle: Long, status: Long): Int =
    0

public actual fun ures_getIntVector(resourcebundle: Long, len: Long, status: Long): Long =
    0L

public actual fun ures_getKey(resourcebundle: Long): PCSTR =
    0L

public actual fun ures_getLocaleByType(resourcebundle: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    0L

public actual fun ures_getNextResource(resourcebundle: Long, fillin: Long, status: Long): Long =
    0L

public actual fun ures_getNextString(resourcebundle: Long, len: Long, key: Long, status: Long): Long =
    0L

public actual fun ures_getSize(resourcebundle: Long): Int =
    0

public actual fun ures_getString(resourcebundle: Long, len: Long, status: Long): Long =
    0L

public actual fun ures_getStringByIndex(resourcebundle: Long, indexs: Int, len: Long, status: Long): Long =
    0L

public actual fun ures_getStringByKey(resb: Long, key: PCSTR, len: Long, status: Long): Long =
    0L

public actual fun ures_getType(resourcebundle: Long): UResType =
    0

public actual fun ures_getUInt(resourcebundle: Long, status: Long): UInt =
    0u

public actual fun ures_getUTF8String(resb: Long, dest: PCSTR, length: Long, forcecopy: Byte, status: Long): PCSTR =
    0L

public actual fun ures_getUTF8StringByIndex(resb: Long, stringindex: Int, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR =
    0L

public actual fun ures_getUTF8StringByKey(resb: Long, key: PCSTR, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR =
    0L

public actual fun ures_getVersion(resb: Long, versioninfo: Long) {
}

public actual fun ures_hasNext(resourcebundle: Long): Byte =
    0

public actual fun ures_open(packagename: PCSTR, locale: PCSTR, status: Long): Long =
    0L

public actual fun ures_openAvailableLocales(packagename: PCSTR, status: Long): Long =
    0L

public actual fun ures_openDirect(packagename: PCSTR, locale: PCSTR, status: Long): Long =
    0L

public actual fun ures_openU(packagename: Long, locale: PCSTR, status: Long): Long =
    0L

public actual fun ures_resetIterator(resourcebundle: Long) {
}

public actual fun uscript_breaksBetweenLetters(script: UScriptCode): Byte =
    0

public actual fun uscript_getCode(nameorabbrorlocale: PCSTR, fillin: Long, capacity: Int, err: Long): Int =
    0

public actual fun uscript_getName(scriptcode: UScriptCode): PCSTR =
    0L

public actual fun uscript_getSampleString(script: UScriptCode, dest: Long, capacity: Int, perrorcode: Long): Int =
    0

public actual fun uscript_getScript(codepoint: Int, err: Long): UScriptCode =
    0

public actual fun uscript_getScriptExtensions(c: Int, scripts: Long, capacity: Int, errorcode: Long): Int =
    0

public actual fun uscript_getShortName(scriptcode: UScriptCode): PCSTR =
    0L

public actual fun uscript_getUsage(script: UScriptCode): UScriptUsage =
    0

public actual fun uscript_hasScript(c: Int, sc: UScriptCode): Byte =
    0

public actual fun uscript_isCased(script: UScriptCode): Byte =
    0

public actual fun uscript_isRightToLeft(script: UScriptCode): Byte =
    0

public actual fun usearch_close(searchiter: Long) {
}

public actual fun usearch_first(strsrch: Long, status: Long): Int =
    0

public actual fun usearch_following(strsrch: Long, position: Int, status: Long): Int =
    0

public actual fun usearch_getAttribute(strsrch: Long, attribute: USearchAttribute): USearchAttributeValue =
    0

public actual fun usearch_getBreakIterator(strsrch: Long): Long =
    0L

public actual fun usearch_getCollator(strsrch: Long): Long =
    0L

public actual fun usearch_getMatchedLength(strsrch: Long): Int =
    0

public actual fun usearch_getMatchedStart(strsrch: Long): Int =
    0

public actual fun usearch_getMatchedText(strsrch: Long, result: Long, resultcapacity: Int, status: Long): Int =
    0

public actual fun usearch_getOffset(strsrch: Long): Int =
    0

public actual fun usearch_getPattern(strsrch: Long, length: Long): Long =
    0L

public actual fun usearch_getText(strsrch: Long, length: Long): Long =
    0L

public actual fun usearch_last(strsrch: Long, status: Long): Int =
    0

public actual fun usearch_next(strsrch: Long, status: Long): Int =
    0

public actual fun usearch_open(pattern: Long, patternlength: Int, text: Long, textlength: Int, locale: PCSTR, breakiter: Long, status: Long): Long =
    0L

public actual fun usearch_openFromCollator(pattern: Long, patternlength: Int, text: Long, textlength: Int, collator: Long, breakiter: Long, status: Long): Long =
    0L

public actual fun usearch_preceding(strsrch: Long, position: Int, status: Long): Int =
    0

public actual fun usearch_previous(strsrch: Long, status: Long): Int =
    0

public actual fun usearch_reset(strsrch: Long) {
}

public actual fun usearch_setAttribute(strsrch: Long, attribute: USearchAttribute, value: USearchAttributeValue, status: Long) {
}

public actual fun usearch_setBreakIterator(strsrch: Long, breakiter: Long, status: Long) {
}

public actual fun usearch_setCollator(strsrch: Long, collator: Long, status: Long) {
}

public actual fun usearch_setOffset(strsrch: Long, position: Int, status: Long) {
}

public actual fun usearch_setPattern(strsrch: Long, pattern: Long, patternlength: Int, status: Long) {
}

public actual fun usearch_setText(strsrch: Long, text: Long, textlength: Int, status: Long) {
}

public actual fun uset_add(set: Long, c: Int) {
}

public actual fun uset_addAll(set: Long, additionalset: Long) {
}

public actual fun uset_addAllCodePoints(set: Long, str: Long, strlen: Int) {
}

public actual fun uset_addRange(set: Long, start: Int, end: Int) {
}

public actual fun uset_addString(set: Long, str: Long, strlen: Int) {
}

public actual fun uset_applyIntPropertyValue(set: Long, prop: UProperty, value: Int, ec: Long) {
}

public actual fun uset_applyPattern(set: Long, pattern: Long, patternlength: Int, options: UInt, status: Long): Int =
    0

public actual fun uset_applyPropertyAlias(set: Long, prop: Long, proplength: Int, value: Long, valuelength: Int, ec: Long) {
}

public actual fun uset_charAt(set: Long, charindex: Int): Int =
    0

public actual fun uset_clear(set: Long) {
}

public actual fun uset_clone(set: Long): Long =
    0L

public actual fun uset_cloneAsThawed(set: Long): Long =
    0L

public actual fun uset_close(set: Long) {
}

public actual fun uset_closeOver(set: Long, attributes: Int) {
}

public actual fun uset_compact(set: Long) {
}

public actual fun uset_complement(set: Long) {
}

public actual fun uset_complementAll(set: Long, complement: Long) {
}

public actual fun uset_contains(set: Long, c: Int): Byte =
    0

public actual fun uset_containsAll(set1: Long, set2: Long): Byte =
    0

public actual fun uset_containsAllCodePoints(set: Long, str: Long, strlen: Int): Byte =
    0

public actual fun uset_containsNone(set1: Long, set2: Long): Byte =
    0

public actual fun uset_containsRange(set: Long, start: Int, end: Int): Byte =
    0

public actual fun uset_containsSome(set1: Long, set2: Long): Byte =
    0

public actual fun uset_containsString(set: Long, str: Long, strlen: Int): Byte =
    0

public actual fun uset_equals(set1: Long, set2: Long): Byte =
    0

public actual fun uset_freeze(set: Long) {
}

public actual fun uset_getItem(set: Long, itemindex: Int, start: Long, end: Long, str: Long, strcapacity: Int, ec: Long): Int =
    0

public actual fun uset_getItemCount(set: Long): Int =
    0

public actual fun uset_getSerializedRange(set: Long, rangeindex: Int, pstart: Long, pend: Long): Byte =
    0

public actual fun uset_getSerializedRangeCount(set: Long): Int =
    0

public actual fun uset_getSerializedSet(fillset: Long, src: Long, srclength: Int): Byte =
    0

public actual fun uset_indexOf(set: Long, c: Int): Int =
    0

public actual fun uset_isEmpty(set: Long): Byte =
    0

public actual fun uset_isFrozen(set: Long): Byte =
    0

public actual fun uset_open(start: Int, end: Int): Long =
    0L

public actual fun uset_openEmpty(): Long =
    0L

public actual fun uset_openPattern(pattern: Long, patternlength: Int, ec: Long): Long =
    0L

public actual fun uset_openPatternOptions(pattern: Long, patternlength: Int, options: UInt, ec: Long): Long =
    0L

public actual fun uset_remove(set: Long, c: Int) {
}

public actual fun uset_removeAll(set: Long, removeset: Long) {
}

public actual fun uset_removeAllStrings(set: Long) {
}

public actual fun uset_removeRange(set: Long, start: Int, end: Int) {
}

public actual fun uset_removeString(set: Long, str: Long, strlen: Int) {
}

public actual fun uset_resemblesPattern(pattern: Long, patternlength: Int, pos: Int): Byte =
    0

public actual fun uset_retain(set: Long, start: Int, end: Int) {
}

public actual fun uset_retainAll(set: Long, retain: Long) {
}

public actual fun uset_serialize(set: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    0

public actual fun uset_serializedContains(set: Long, c: Int): Byte =
    0

public actual fun uset_set(set: Long, start: Int, end: Int) {
}

public actual fun uset_setSerializedToOne(fillset: Long, c: Int) {
}

public actual fun uset_size(set: Long): Int =
    0

public actual fun uset_span(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int =
    0

public actual fun uset_spanBack(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int =
    0

public actual fun uset_spanBackUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int =
    0

public actual fun uset_spanUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int =
    0

public actual fun uset_toPattern(set: Long, result: Long, resultcapacity: Int, escapeunprintable: Byte, ec: Long): Int =
    0

public actual fun uspoof_areConfusable(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int =
    0

public actual fun uspoof_areConfusableUTF8(sc: Long, id1: PCSTR, length1: Int, id2: PCSTR, length2: Int, status: Long): Int =
    0

public actual fun uspoof_check(sc: Long, id: Long, length: Int, position: Long, status: Long): Int =
    0

public actual fun uspoof_check2(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int =
    0

public actual fun uspoof_check2UTF8(sc: Long, id: PCSTR, length: Int, checkresult: Long, status: Long): Int =
    0

public actual fun uspoof_checkUTF8(sc: Long, id: PCSTR, length: Int, position: Long, status: Long): Int =
    0

public actual fun uspoof_clone(sc: Long, status: Long): Long =
    0L

public actual fun uspoof_close(sc: Long) {
}

public actual fun uspoof_closeCheckResult(checkresult: Long) {
}

public actual fun uspoof_getAllowedChars(sc: Long, status: Long): Long =
    0L

public actual fun uspoof_getAllowedLocales(sc: Long, status: Long): PCSTR =
    0L

public actual fun uspoof_getCheckResultChecks(checkresult: Long, status: Long): Int =
    0

public actual fun uspoof_getCheckResultNumerics(checkresult: Long, status: Long): Long =
    0L

public actual fun uspoof_getCheckResultRestrictionLevel(checkresult: Long, status: Long): URestrictionLevel =
    0

public actual fun uspoof_getChecks(sc: Long, status: Long): Int =
    0

public actual fun uspoof_getInclusionSet(status: Long): Long =
    0L

public actual fun uspoof_getRecommendedSet(status: Long): Long =
    0L

public actual fun uspoof_getRestrictionLevel(sc: Long): URestrictionLevel =
    0

public actual fun uspoof_getSkeleton(sc: Long, type: UInt, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int =
    0

public actual fun uspoof_getSkeletonUTF8(sc: Long, type: UInt, id: PCSTR, length: Int, dest: PCSTR, destcapacity: Int, status: Long): Int =
    0

public actual fun uspoof_open(status: Long): Long =
    0L

public actual fun uspoof_openCheckResult(status: Long): Long =
    0L

public actual fun uspoof_openFromSerialized(data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long =
    0L

public actual fun uspoof_openFromSource(confusables: PCSTR, confusableslen: Int, confusableswholescript: PCSTR, confusableswholescriptlen: Int, errtype: Long, pe: Long, status: Long): Long =
    0L

public actual fun uspoof_serialize(sc: Long, data: Long, capacity: Int, status: Long): Int =
    0

public actual fun uspoof_setAllowedChars(sc: Long, chars: Long, status: Long) {
}

public actual fun uspoof_setAllowedLocales(sc: Long, localeslist: PCSTR, status: Long) {
}

public actual fun uspoof_setChecks(sc: Long, checks: Int, status: Long) {
}

public actual fun uspoof_setRestrictionLevel(sc: Long, restrictionlevel: URestrictionLevel) {
}

public actual fun usprep_close(profile: Long) {
}

public actual fun usprep_open(path: PCSTR, filename: PCSTR, status: Long): Long =
    0L

public actual fun usprep_openByType(type: UStringPrepProfileType, status: Long): Long =
    0L

public actual fun usprep_prepare(prep: Long, src: Long, srclength: Int, dest: Long, destcapacity: Int, options: Int, parseerror: Long, status: Long): Int =
    0

public actual fun utext_char32At(ut: Long, nativeindex: Long): Int =
    0

public actual fun utext_clone(dest: Long, src: Long, deep: Byte, readonly: Byte, status: Long): Long =
    0L

public actual fun utext_close(ut: Long): Long =
    0L

public actual fun utext_copy(ut: Long, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: Long) {
}

public actual fun utext_current32(ut: Long): Int =
    0

public actual fun utext_equals(a: Long, b: Long): Byte =
    0

public actual fun utext_extract(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int =
    0

public actual fun utext_freeze(ut: Long) {
}

public actual fun utext_getNativeIndex(ut: Long): Long =
    0L

public actual fun utext_getPreviousNativeIndex(ut: Long): Long =
    0L

public actual fun utext_hasMetaData(ut: Long): Byte =
    0

public actual fun utext_isLengthExpensive(ut: Long): Byte =
    0

public actual fun utext_isWritable(ut: Long): Byte =
    0

public actual fun utext_moveIndex32(ut: Long, delta: Int): Byte =
    0

public actual fun utext_nativeLength(ut: Long): Long =
    0L

public actual fun utext_next32(ut: Long): Int =
    0

public actual fun utext_next32From(ut: Long, nativeindex: Long): Int =
    0

public actual fun utext_openUChars(ut: Long, s: Long, length: Long, status: Long): Long =
    0L

public actual fun utext_openUTF8(ut: Long, s: PCSTR, length: Long, status: Long): Long =
    0L

public actual fun utext_previous32(ut: Long): Int =
    0

public actual fun utext_previous32From(ut: Long, nativeindex: Long): Int =
    0

public actual fun utext_replace(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacementlength: Int, status: Long): Int =
    0

public actual fun utext_setNativeIndex(ut: Long, nativeindex: Long) {
}

public actual fun utext_setup(ut: Long, extraspace: Int, status: Long): Long =
    0L

public actual fun utf8_appendCharSafeBody(s: Long, i: Int, length: Int, c: Int, piserror: Long): Int =
    0

public actual fun utf8_back1SafeBody(s: Long, start: Int, i: Int): Int =
    0

public actual fun utf8_nextCharSafeBody(s: Long, pi: Long, length: Int, c: Int, strict: Byte): Int =
    0

public actual fun utf8_prevCharSafeBody(s: Long, start: Int, pi: Long, c: Int, strict: Byte): Int =
    0

public actual fun utmscale_fromInt64(othertime: Long, timescale: UDateTimeScale, status: Long): Long =
    0L

public actual fun utmscale_getTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: Long): Long =
    0L

public actual fun utmscale_toInt64(universaltime: Long, timescale: UDateTimeScale, status: Long): Long =
    0L

public actual fun utrace_format(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR): Int =
    0

public actual fun utrace_functionName(fnnumber: Int): PCSTR =
    0L

public actual fun utrace_getFunctions(context: Long, e: Long, x: Long, d: Long) {
}

public actual fun utrace_getLevel(): Int =
    0

public actual fun utrace_setFunctions(context: Long, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
}

public actual fun utrace_setLevel(tracelevel: Int) {
}

public actual fun utrace_vformat(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR, args: Long): Int =
    0

public actual fun utrans_clone(trans: Long, status: Long): Long =
    0L

public actual fun utrans_close(trans: Long) {
}

public actual fun utrans_countAvailableIDs(): Int =
    0

public actual fun utrans_getSourceSet(trans: Long, ignorefilter: Byte, fillin: Long, status: Long): Long =
    0L

public actual fun utrans_getUnicodeID(trans: Long, resultlength: Long): Long =
    0L

public actual fun utrans_openIDs(perrorcode: Long): Long =
    0L

public actual fun utrans_openInverse(trans: Long, status: Long): Long =
    0L

public actual fun utrans_openU(id: Long, idlength: Int, dir: UTransDirection, rules: Long, ruleslength: Int, parseerror: Long, perrorcode: Long): Long =
    0L

public actual fun utrans_register(adoptedtrans: Long, status: Long) {
}

public actual fun utrans_setFilter(trans: Long, filterpattern: Long, filterpatternlen: Int, status: Long) {
}

public actual fun utrans_toRules(trans: Long, escapeunprintable: Byte, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun utrans_trans(trans: Long, rep: Long, repfunc: Long, start: Int, limit: Long, status: Long) {
}

public actual fun utrans_transIncremental(trans: Long, rep: Long, repfunc: Long, pos: Long, status: Long) {
}

public actual fun utrans_transIncrementalUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, pos: Long, status: Long) {
}

public actual fun utrans_transUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, start: Int, limit: Long, status: Long) {
}

public actual fun utrans_unregisterID(id: Long, idlength: Int) {
}
