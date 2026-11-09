package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.ETO_OPTIONS
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

public expect fun AdjustCalendarDate(lpcaldatetime: Long, calunit: CALDATETIME_DATEUNIT, amount: Int): BOOL

public expect fun CompareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): COMPARESTRING_RESULT

public expect fun CompareStringEx(lplocalename: PCWSTR, dwcmpflags: COMPARE_STRING_FLAGS, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, lpversioninformation: Long, lpreserved: Long, lparam: LPARAM): COMPARESTRING_RESULT

public expect fun CompareStringOrdinal(lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, bignorecase: BOOL): COMPARESTRING_RESULT

public expect fun CompareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int): COMPARESTRING_RESULT

public expect fun ConvertCalDateTimeToSystemTime(lpcaldatetime: Long, lpsystime: Long): BOOL

public expect fun ConvertDefaultLocale(locale: UInt): UInt

public expect fun ConvertSystemTimeToCalDateTime(lpsystime: Long, calid: UInt, lpcaldatetime: Long): BOOL

public expect fun EnumCalendarInfoA(lpcalinfoenumproc: CALINFO_ENUMPROCA, locale: UInt, calendar: UInt, caltype: UInt): BOOL

public expect fun EnumCalendarInfoExA(lpcalinfoenumprocex: CALINFO_ENUMPROCEXA, locale: UInt, calendar: UInt, caltype: UInt): BOOL

public expect fun EnumCalendarInfoExEx(pcalinfoenumprocexex: CALINFO_ENUMPROCEXEX, lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lparam: LPARAM): BOOL

public expect fun EnumCalendarInfoExW(lpcalinfoenumprocex: CALINFO_ENUMPROCEXW, locale: UInt, calendar: UInt, caltype: UInt): BOOL

public expect fun EnumCalendarInfoW(lpcalinfoenumproc: CALINFO_ENUMPROCW, locale: UInt, calendar: UInt, caltype: UInt): BOOL

public expect fun EnumDateFormatsA(lpdatefmtenumproc: DATEFMT_ENUMPROCA, locale: UInt, dwflags: UInt): BOOL

public expect fun EnumDateFormatsExA(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXA, locale: UInt, dwflags: UInt): BOOL

public expect fun EnumDateFormatsExEx(lpdatefmtenumprocexex: DATEFMT_ENUMPROCEXEX, lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lparam: LPARAM): BOOL

public expect fun EnumDateFormatsExW(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXW, locale: UInt, dwflags: UInt): BOOL

public expect fun EnumDateFormatsW(lpdatefmtenumproc: DATEFMT_ENUMPROCW, locale: UInt, dwflags: UInt): BOOL

public expect fun EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCA, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL

public expect fun EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCW, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL

public expect fun EnumSystemCodePagesA(lpcodepageenumproc: CODEPAGE_ENUMPROCA, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL

public expect fun EnumSystemCodePagesW(lpcodepageenumproc: CODEPAGE_ENUMPROCW, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL

public expect fun EnumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GEO_ENUMPROC): BOOL

public expect fun EnumSystemGeoNames(geoclass: UInt, geoenumproc: GEO_ENUMNAMEPROC, data: LPARAM): BOOL

public expect fun EnumSystemLanguageGroupsA(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCA, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL

public expect fun EnumSystemLanguageGroupsW(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCW, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL

public expect fun EnumSystemLocalesA(lplocaleenumproc: LOCALE_ENUMPROCA, dwflags: UInt): BOOL

public expect fun EnumSystemLocalesEx(lplocaleenumprocex: LOCALE_ENUMPROCEX, dwflags: UInt, lparam: LPARAM, lpreserved: Long): BOOL

public expect fun EnumSystemLocalesW(lplocaleenumproc: LOCALE_ENUMPROCW, dwflags: UInt): BOOL

public expect fun EnumTimeFormatsA(lptimefmtenumproc: TIMEFMT_ENUMPROCA, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL

public expect fun EnumTimeFormatsEx(lptimefmtenumprocex: TIMEFMT_ENUMPROCEX, lplocalename: PCWSTR, dwflags: UInt, lparam: LPARAM): BOOL

public expect fun EnumTimeFormatsW(lptimefmtenumproc: TIMEFMT_ENUMPROCW, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL

public expect fun EnumUILanguagesA(lpuilanguageenumproc: UILANGUAGE_ENUMPROCA, dwflags: UInt, lparam: Long): BOOL

public expect fun EnumUILanguagesW(lpuilanguageenumproc: UILANGUAGE_ENUMPROCW, dwflags: UInt, lparam: Long): BOOL

public expect fun FindNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long): Int

public expect fun FindNLSStringEx(lplocalename: PCWSTR, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int

public expect fun FindStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, bignorecase: BOOL): Int

public expect fun FoldStringA(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int

public expect fun FoldStringW(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int

public expect fun GetACP(): UInt

public expect fun GetCPInfo(codepage: UInt, lpcpinfo: Long): BOOL

public expect fun GetCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL

public expect fun GetCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL

public expect fun GetCalendarDateFormatEx(lpszlocale: PCWSTR, dwflags: UInt, lpcaldatetime: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): BOOL

public expect fun GetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PSTR, cchdata: Int, lpvalue: Long): Int

public expect fun GetCalendarInfoEx(lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int

public expect fun GetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int

public expect fun GetCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: Long, lpcalmaxdatetime: Long): BOOL

public expect fun GetCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpcurrencystr: PSTR, cchcurrency: Int): Int

public expect fun GetCurrencyFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int

public expect fun GetCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int

public expect fun GetDateFormatA(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCSTR, lpdatestr: PSTR, cchdate: Int): Int

public expect fun GetDateFormatEx(lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int, lpcalendar: PCWSTR): Int

public expect fun GetDateFormatW(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): Int

public expect fun GetDistanceOfClosestLanguageInList(pszlanguage: PCWSTR, pszlanguageslist: PCWSTR, wchlistdelimiter: UShort, pclosestdistance: Long): HRESULT

public expect fun GetDurationFormat(locale: UInt, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int

public expect fun GetDurationFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int

public expect fun GetFileMUIInfo(dwflags: UInt, pcwszfilepath: PCWSTR, pfilemuiinfo: Long, pcbfilemuiinfo: Long): BOOL

public expect fun GetFileMUIPath(dwflags: UInt, pcwszfilepath: PCWSTR, pwszlanguage: PWSTR, pcchlanguage: Long, pwszfilemuipath: PWSTR, pcchfilemuipath: Long, pululenumerator: Long): BOOL

public expect fun GetGeoInfoA(location: Int, geotype: SYSGEOTYPE, lpgeodata: PSTR, cchdata: Int, langid: UShort): Int

public expect fun GetGeoInfoEx(location: PCWSTR, geotype: SYSGEOTYPE, geodata: PWSTR, geodatacount: Int): Int

public expect fun GetGeoInfoW(location: Int, geotype: SYSGEOTYPE, lpgeodata: PWSTR, cchdata: Int, langid: UShort): Int

public expect fun GetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PSTR, cchdata: Int): Int

public expect fun GetLocaleInfoEx(lplocalename: PCWSTR, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int

public expect fun GetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int

public expect fun GetNLSVersion(function: UInt, locale: UInt, lpversioninformation: Long): BOOL

public expect fun GetNLSVersionEx(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): BOOL

public expect fun GetNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpnumberstr: PSTR, cchnumber: Int): Int

public expect fun GetNumberFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int

public expect fun GetNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int

public expect fun GetOEMCP(): UInt

public expect fun GetProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL

public expect fun GetStringScripts(dwflags: UInt, lpstring: PCWSTR, cchstring: Int, lpscripts: PWSTR, cchscripts: Int): Int

public expect fun GetStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL

public expect fun GetStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL

public expect fun GetStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL

public expect fun GetStringTypeW(dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL

public expect fun GetSystemDefaultLCID(): UInt

public expect fun GetSystemDefaultLangID(): UShort

public expect fun GetSystemDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int

public expect fun GetSystemDefaultUILanguage(): UShort

public expect fun GetSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL

public expect fun GetTextCharset(hdc: HDC): Int

public expect fun GetTextCharsetInfo(hdc: HDC, lpsig: Long, dwflags: UInt): Int

public expect fun GetThreadLocale(): UInt

public expect fun GetThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL

public expect fun GetThreadUILanguage(): UShort

public expect fun GetTimeFormatA(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCSTR, lptimestr: PSTR, cchtime: Int): Int

public expect fun GetTimeFormatEx(lplocalename: PCWSTR, dwflags: TIME_FORMAT_FLAGS, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int

public expect fun GetTimeFormatW(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int

public expect fun GetUILanguageInfo(dwflags: UInt, pwmszlanguage: PCWSTR, pwszfallbacklanguages: PWSTR, pcchfallbacklanguages: Long, pattributes: Long): BOOL

public expect fun GetUserDefaultGeoName(geoname: PWSTR, geonamecount: Int): Int

public expect fun GetUserDefaultLCID(): UInt

public expect fun GetUserDefaultLangID(): UShort

public expect fun GetUserDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int

public expect fun GetUserDefaultUILanguage(): UShort

public expect fun GetUserGeoID(geoclass: SYSGEOCLASS): Int

public expect fun GetUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL

public expect fun IdnToAscii(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpasciicharstr: PWSTR, cchasciichar: Int): Int

public expect fun IdnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpnameprepcharstr: PWSTR, cchnameprepchar: Int): Int

public expect fun IdnToUnicode(dwflags: UInt, lpasciicharstr: PCWSTR, cchasciichar: Int, lpunicodecharstr: PWSTR, cchunicodechar: Int): Int

public expect fun IsCalendarLeapYear(calid: UInt, year: UInt, era: UInt): BOOL

public expect fun IsDBCSLeadByte(testchar: UByte): BOOL

public expect fun IsDBCSLeadByteEx(codepage: UInt, testchar: UByte): BOOL

public expect fun IsNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: Long, lpstring: PCWSTR, cchstr: Int): BOOL

public expect fun IsNormalizedString(normform: NORM_FORM, lpstring: PCWSTR, cwlength: Int): BOOL

public expect fun IsTextUnicode(lpv: Long, isize: Int, lpiresult: Long): BOOL

public expect fun IsValidCodePage(codepage: UInt): BOOL

public expect fun IsValidLanguageGroup(languagegroup: UInt, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS): BOOL

public expect fun IsValidLocale(locale: UInt, dwflags: IS_VALID_LOCALE_FLAGS): BOOL

public expect fun IsValidLocaleName(lplocalename: PCWSTR): BOOL

public expect fun IsValidNLSVersion(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): UInt

public expect fun IsWellFormedTag(psztag: PCWSTR): UByte

public expect fun LCIDToLocaleName(locale: UInt, lpname: PWSTR, cchname: Int, dwflags: UInt): Int

public expect fun LCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int

public expect fun LCMapStringEx(lplocalename: PCWSTR, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int

public expect fun LCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int

public expect fun LocaleNameToLCID(lpname: PCWSTR, dwflags: UInt): UInt

public expect fun MappingDoAction(pbag: Long, dwrangeindex: UInt, pszactionid: PCWSTR): HRESULT

public expect fun MappingFreePropertyBag(pbag: Long): HRESULT

public expect fun MappingFreeServices(pserviceinfo: Long): HRESULT

public expect fun MappingGetServices(poptions: Long, prgservices: Long, pdwservicescount: Long): HRESULT

public expect fun MappingRecognizeText(pserviceinfo: Long, psztext: PCWSTR, dwlength: UInt, dwindex: UInt, poptions: Long, pbag: Long): HRESULT

public expect fun MultiByteToWideChar(codepage: UInt, dwflags: MULTI_BYTE_TO_WIDE_CHAR_FLAGS, lpmultibytestr: PCSTR, cbmultibyte: Int, lpwidecharstr: PWSTR, cchwidechar: Int): Int

public expect fun NormalizeString(normform: NORM_FORM, lpsrcstring: PCWSTR, cwsrclength: Int, lpdststring: PWSTR, cwdstlength: Int): Int

public expect fun NotifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: PCWSTR, pcwstrpreviouslanguage: PCWSTR, dwreserved: UInt, pdwstatusrtrn: Long): BOOL

public expect fun ResolveLocaleName(lpnametoresolve: PCWSTR, lplocalename: PWSTR, cchlocalename: Int): Int

public expect fun RestoreThreadPreferredUILanguages(snapshot: HSAVEDUILANGUAGES)

public expect fun ScriptApplyDigitSubstitution(psds: Long, psc: Long, pss: Long): HRESULT

public expect fun ScriptApplyLogicalWidth(pidx: Long, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pabc: Long, pijustify: Long): HRESULT

public expect fun ScriptBreak(pwcchars: PCWSTR, cchars: Int, psa: Long, psla: Long): HRESULT

public expect fun ScriptCPtoX(icp: Int, ftrailing: BOOL, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pix: Long): HRESULT

public expect fun ScriptCacheGetHeight(hdc: HDC, psc: Long, tmheight: Long): HRESULT

public expect fun ScriptFreeCache(psc: Long): HRESULT

public expect fun ScriptGetCMap(hdc: HDC, psc: Long, pwcinchars: PCWSTR, cchars: Int, dwflags: UInt, pwoutglyphs: Long): HRESULT

public expect fun ScriptGetFontAlternateGlyphs(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: Long, pcalternates: Long): HRESULT

public expect fun ScriptGetFontFeatureTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: Long, pctags: Long): HRESULT

public expect fun ScriptGetFontLanguageTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, cmaxtags: Int, plangsystags: Long, pctags: Long): HRESULT

public expect fun ScriptGetFontProperties(hdc: HDC, psc: Long, sfp: Long): HRESULT

public expect fun ScriptGetFontScriptTags(hdc: HDC, psc: Long, psa: Long, cmaxtags: Int, pscripttags: Long, pctags: Long): HRESULT

public expect fun ScriptGetGlyphABCWidth(hdc: HDC, psc: Long, wglyph: UShort, pabc: Long): HRESULT

public expect fun ScriptGetLogicalWidths(psa: Long, cchars: Int, cglyphs: Int, piglyphwidth: Long, pwlogclust: Long, psva: Long, pidx: Long): HRESULT

public expect fun ScriptGetProperties(ppsp: Long, pinumscripts: Long): HRESULT

public expect fun ScriptIsComplex(pwcinchars: PCWSTR, cinchars: Int, dwflags: SCRIPT_IS_COMPLEX_FLAGS): HRESULT

public expect fun ScriptItemize(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pcitems: Long): HRESULT

public expect fun ScriptItemizeOpenType(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pscripttags: Long, pcitems: Long): HRESULT

public expect fun ScriptJustify(psva: Long, piadvance: Long, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: Long): HRESULT

public expect fun ScriptLayout(cruns: Int, pblevel: Long, pivisualtological: Long, pilogicaltovisual: Long): HRESULT

public expect fun ScriptPlace(hdc: HDC, psc: Long, pwglyphs: Long, cglyphs: Int, psva: Long, psa: Long, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT

public expect fun ScriptPlaceOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, pwlogclust: Long, pcharprops: Long, cchars: Int, pwglyphs: Long, pglyphprops: Long, cglyphs: Int, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT

public expect fun ScriptPositionSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: GOFFSET, pioutadvance: Long, poutgoffset: Long): HRESULT

public expect fun ScriptRecordDigitSubstitution(locale: UInt, psds: Long): HRESULT

public expect fun ScriptShape(hdc: HDC, psc: Long, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, psa: Long, pwoutglyphs: Long, pwlogclust: Long, psva: Long, pcglyphs: Long): HRESULT

public expect fun ScriptShapeOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, pwlogclust: Long, pcharprops: Long, pwoutglyphs: Long, poutglyphprops: Long, pcglyphs: Long): HRESULT

public expect fun ScriptStringAnalyse(hdc: HDC, pstring: Long, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: Long, psstate: Long, pidx: Long, ptabdef: Long, pbinclass: Long, pssa: Long): HRESULT

public expect fun ScriptStringCPtoX(ssa: Long, icp: Int, ftrailing: BOOL, px: Long): HRESULT

public expect fun ScriptStringFree(pssa: Long): HRESULT

public expect fun ScriptStringGetLogicalWidths(ssa: Long, pidx: Long): HRESULT

public expect fun ScriptStringGetOrder(ssa: Long, puorder: Long): HRESULT

public expect fun ScriptStringOut(ssa: Long, ix: Int, iy: Int, uoptions: ETO_OPTIONS, prc: Long, iminsel: Int, imaxsel: Int, fdisabled: BOOL): HRESULT

public expect fun ScriptStringValidate(ssa: Long): HRESULT

public expect fun ScriptStringXtoCP(ssa: Long, ix: Int, pich: Long, pitrailing: Long): HRESULT

public expect fun ScriptString_pLogAttr(ssa: Long): Long

public expect fun ScriptString_pSize(ssa: Long): Long

public expect fun ScriptString_pcOutChars(ssa: Long): Long

public expect fun ScriptSubstituteSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: Long): HRESULT

public expect fun ScriptTextOut(hdc: HDC, psc: Long, x: Int, y: Int, fuoptions: UInt, lprc: Long, psa: Long, pwcreserved: PCWSTR, ireserved: Int, pwglyphs: Long, cglyphs: Int, piadvance: Long, pijustify: Long, pgoffset: Long): HRESULT

public expect fun ScriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, picp: Long, pitrailing: Long): HRESULT

public expect fun SetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCSTR): BOOL

public expect fun SetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCWSTR): BOOL

public expect fun SetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PCSTR): BOOL

public expect fun SetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PCWSTR): BOOL

public expect fun SetProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL

public expect fun SetThreadLocale(locale: UInt): BOOL

public expect fun SetThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL

public expect fun SetThreadPreferredUILanguages2(flags: UInt, languages: PCWSTR, numlanguagesset: Long, snapshot: Long): BOOL

public expect fun SetThreadUILanguage(langid: UShort): UShort

public expect fun SetUserGeoID(geoid: Int): BOOL

public expect fun SetUserGeoName(geoname: PCWSTR): BOOL

public expect fun TranslateCharsetInfo(lpsrc: Long, lpcs: Long, dwflags: TRANSLATE_CHARSET_INFO_FLAGS): BOOL

public expect fun UCNV_FROM_U_CALLBACK_ESCAPE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long)

public expect fun UCNV_FROM_U_CALLBACK_SKIP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long)

public expect fun UCNV_FROM_U_CALLBACK_STOP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long)

public expect fun UCNV_FROM_U_CALLBACK_SUBSTITUTE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long)

public expect fun UCNV_TO_U_CALLBACK_ESCAPE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long)

public expect fun UCNV_TO_U_CALLBACK_SKIP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long)

public expect fun UCNV_TO_U_CALLBACK_STOP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long)

public expect fun UCNV_TO_U_CALLBACK_SUBSTITUTE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long)

public expect fun UpdateCalendarDayOfWeek(lpcaldatetime: Long): BOOL

public expect fun VerifyScripts(dwflags: UInt, lplocalescripts: PCWSTR, cchlocalescripts: Int, lptestscripts: PCWSTR, cchtestscripts: Int): BOOL

public expect fun WideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: PCWSTR, cchwidechar: Int, lpmultibytestr: PSTR, cbmultibyte: Int, lpdefaultchar: PCSTR, lpuseddefaultchar: Long): Int

public expect fun lstrcatA(lpstring1: PSTR, lpstring2: PCSTR): PSTR

public expect fun lstrcatW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR

public expect fun lstrcmpA(lpstring1: PCSTR, lpstring2: PCSTR): Int

public expect fun lstrcmpW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int

public expect fun lstrcmpiA(lpstring1: PCSTR, lpstring2: PCSTR): Int

public expect fun lstrcmpiW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int

public expect fun lstrcpyA(lpstring1: PSTR, lpstring2: PCSTR): PSTR

public expect fun lstrcpyW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR

public expect fun lstrcpynA(lpstring1: PSTR, lpstring2: PCSTR, imaxlength: Int): PSTR

public expect fun lstrcpynW(lpstring1: PWSTR, lpstring2: PCWSTR, imaxlength: Int): PWSTR

public expect fun lstrlenA(lpstring: PCSTR): Int

public expect fun lstrlenW(lpstring: PCWSTR): Int

public expect fun u_UCharsToChars(us: Long, cs: PCSTR, length: Int)

public expect fun u_austrcpy(dst: PCSTR, src: Long): PSTR

public expect fun u_austrncpy(dst: PCSTR, src: Long, n: Int): PSTR

public expect fun u_catclose(catd: Long)

public expect fun u_catgets(catd: Long, set_num: Int, msg_num: Int, s: Long, len: Long, ec: Long): Long

public expect fun u_catopen(name: PCSTR, locale: PCSTR, ec: Long): Long

public expect fun u_charAge(c: Int, versionarray: Long)

public expect fun u_charDigitValue(c: Int): Int

public expect fun u_charDirection(c: Int): UCharDirection

public expect fun u_charFromName(namechoice: UCharNameChoice, name: PCSTR, perrorcode: Long): Int

public expect fun u_charMirror(c: Int): Int

public expect fun u_charName(code: Int, namechoice: UCharNameChoice, buffer: PCSTR, bufferlength: Int, perrorcode: Long): Int

public expect fun u_charType(c: Int): Byte

public expect fun u_charsToUChars(cs: PCSTR, us: Long, length: Int)

public expect fun u_cleanup()

public expect fun u_countChar32(s: Long, length: Int): Int

public expect fun u_digit(ch: Int, radix: Byte): Int

public expect fun u_enumCharNames(start: Int, limit: Int, fn: Long, context: Long, namechoice: UCharNameChoice, perrorcode: Long)

public expect fun u_enumCharTypes(enumrange: Long, context: Long)

public expect fun u_errorName(code: UErrorCode): PCSTR

public expect fun u_foldCase(c: Int, options: UInt): Int

public expect fun u_forDigit(digit: Int, radix: Byte): Int

public expect fun u_formatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, status: Long, vararg variadicArgs: Long): Int

public expect fun u_formatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, status: Long, vararg variadicArgs: Long): Int

public expect fun u_getBidiPairedBracket(c: Int): Int

public expect fun u_getBinaryPropertySet(property: UProperty, perrorcode: Long): Long

public expect fun u_getCombiningClass(c: Int): UByte

public expect fun u_getDataVersion(dataversionfillin: Long, status: Long)

public expect fun u_getFC_NFKC_Closure(c: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

public expect fun u_getIntPropertyMap(property: UProperty, perrorcode: Long): Long

public expect fun u_getIntPropertyMaxValue(which: UProperty): Int

public expect fun u_getIntPropertyMinValue(which: UProperty): Int

public expect fun u_getIntPropertyValue(c: Int, which: UProperty): Int

public expect fun u_getNumericValue(c: Int): Double

public expect fun u_getPropertyEnum(alias: PCSTR): UProperty

public expect fun u_getPropertyName(property: UProperty, namechoice: UPropertyNameChoice): PCSTR

public expect fun u_getPropertyValueEnum(property: UProperty, alias: PCSTR): Int

public expect fun u_getPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): PCSTR

public expect fun u_getUnicodeVersion(versionarray: Long)

public expect fun u_getVersion(versionarray: Long)

public expect fun u_hasBinaryProperty(c: Int, which: UProperty): Byte

public expect fun u_init(status: Long)

public expect fun u_isIDIgnorable(c: Int): Byte

public expect fun u_isIDPart(c: Int): Byte

public expect fun u_isIDStart(c: Int): Byte

public expect fun u_isISOControl(c: Int): Byte

public expect fun u_isJavaIDPart(c: Int): Byte

public expect fun u_isJavaIDStart(c: Int): Byte

public expect fun u_isJavaSpaceChar(c: Int): Byte

public expect fun u_isMirrored(c: Int): Byte

public expect fun u_isUAlphabetic(c: Int): Byte

public expect fun u_isULowercase(c: Int): Byte

public expect fun u_isUUppercase(c: Int): Byte

public expect fun u_isUWhiteSpace(c: Int): Byte

public expect fun u_isWhitespace(c: Int): Byte

public expect fun u_isalnum(c: Int): Byte

public expect fun u_isalpha(c: Int): Byte

public expect fun u_isbase(c: Int): Byte

public expect fun u_isblank(c: Int): Byte

public expect fun u_iscntrl(c: Int): Byte

public expect fun u_isdefined(c: Int): Byte

public expect fun u_isdigit(c: Int): Byte

public expect fun u_isgraph(c: Int): Byte

public expect fun u_islower(c: Int): Byte

public expect fun u_isprint(c: Int): Byte

public expect fun u_ispunct(c: Int): Byte

public expect fun u_isspace(c: Int): Byte

public expect fun u_istitle(c: Int): Byte

public expect fun u_isupper(c: Int): Byte

public expect fun u_isxdigit(c: Int): Byte

public expect fun u_memcasecmp(s1: Long, s2: Long, length: Int, options: UInt): Int

public expect fun u_memchr(s: Long, c: UShort, count: Int): Long

public expect fun u_memchr32(s: Long, c: Int, count: Int): Long

public expect fun u_memcmp(buf1: Long, buf2: Long, count: Int): Int

public expect fun u_memcmpCodePointOrder(s1: Long, s2: Long, count: Int): Int

public expect fun u_memcpy(dest: Long, src: Long, count: Int): Long

public expect fun u_memmove(dest: Long, src: Long, count: Int): Long

public expect fun u_memrchr(s: Long, c: UShort, count: Int): Long

public expect fun u_memrchr32(s: Long, c: Int, count: Int): Long

public expect fun u_memset(dest: Long, c: UShort, count: Int): Long

public expect fun u_parseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, status: Long, vararg variadicArgs: Long)

public expect fun u_parseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, parseerror: Long, status: Long, vararg variadicArgs: Long)

public expect fun u_setMemoryFunctions(context: Long, a: Long, r: Long, f: Long, status: Long)

public expect fun u_shapeArabic(source: Long, sourcelength: Int, dest: Long, destsize: Int, options: UInt, perrorcode: Long): Int

public expect fun u_strCaseCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int

public expect fun u_strCompare(s1: Long, length1: Int, s2: Long, length2: Int, codepointorder: Byte): Int

public expect fun u_strCompareIter(iter1: Long, iter2: Long, codepointorder: Byte): Int

public expect fun u_strFindFirst(s: Long, length: Int, substring: Long, sublength: Int): Long

public expect fun u_strFindLast(s: Long, length: Int, substring: Long, sublength: Int): Long

public expect fun u_strFoldCase(dest: Long, destcapacity: Int, src: Long, srclength: Int, options: UInt, perrorcode: Long): Int

public expect fun u_strFromJavaModifiedUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

public expect fun u_strFromUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

public expect fun u_strFromUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

public expect fun u_strFromUTF8(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long

public expect fun u_strFromUTF8Lenient(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long

public expect fun u_strFromUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

public expect fun u_strFromWCS(dest: Long, destcapacity: Int, pdestlength: Long, src: PCWSTR, srclength: Int, perrorcode: Long): Long

public expect fun u_strHasMoreChar32Than(s: Long, length: Int, number: Int): Byte

public expect fun u_strToJavaModifiedUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR

public expect fun u_strToLower(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int

public expect fun u_strToTitle(dest: Long, destcapacity: Int, src: Long, srclength: Int, titleiter: Long, locale: PCSTR, perrorcode: Long): Int

public expect fun u_strToUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

public expect fun u_strToUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

public expect fun u_strToUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR

public expect fun u_strToUTF8WithSub(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): PSTR

public expect fun u_strToUpper(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int

public expect fun u_strToWCS(dest: PCWSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PWSTR

public expect fun u_strcasecmp(s1: Long, s2: Long, options: UInt): Int

public expect fun u_strcat(dst: Long, src: Long): Long

public expect fun u_strchr(s: Long, c: UShort): Long

public expect fun u_strchr32(s: Long, c: Int): Long

public expect fun u_strcmp(s1: Long, s2: Long): Int

public expect fun u_strcmpCodePointOrder(s1: Long, s2: Long): Int

public expect fun u_strcpy(dst: Long, src: Long): Long

public expect fun u_strcspn(string: Long, matchset: Long): Int

public expect fun u_strlen(s: Long): Int

public expect fun u_strncasecmp(s1: Long, s2: Long, n: Int, options: UInt): Int

public expect fun u_strncat(dst: Long, src: Long, n: Int): Long

public expect fun u_strncmp(ucs1: Long, ucs2: Long, n: Int): Int

public expect fun u_strncmpCodePointOrder(s1: Long, s2: Long, n: Int): Int

public expect fun u_strncpy(dst: Long, src: Long, n: Int): Long

public expect fun u_strpbrk(string: Long, matchset: Long): Long

public expect fun u_strrchr(s: Long, c: UShort): Long

public expect fun u_strrchr32(s: Long, c: Int): Long

public expect fun u_strrstr(s: Long, substring: Long): Long

public expect fun u_strspn(string: Long, matchset: Long): Int

public expect fun u_strstr(s: Long, substring: Long): Long

public expect fun u_strtok_r(src: Long, delim: Long, savestate: Long): Long

public expect fun u_tolower(c: Int): Int

public expect fun u_totitle(c: Int): Int

public expect fun u_toupper(c: Int): Int

public expect fun u_uastrcpy(dst: Long, src: PCSTR): Long

public expect fun u_uastrncpy(dst: Long, src: PCSTR, n: Int): Long

public expect fun u_unescape(src: PCSTR, dest: Long, destcapacity: Int): Int

public expect fun u_unescapeAt(charat: UNESCAPE_CHAR_AT, offset: Long, length: Int, context: Long): Int

public expect fun u_versionFromString(versionarray: Long, versionstring: PCSTR)

public expect fun u_versionFromUString(versionarray: Long, versionstring: Long)

public expect fun u_versionToString(versionarray: Long, versionstring: PCSTR)

public expect fun u_vformatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, ap: Long, status: Long): Int

public expect fun u_vformatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, ap: Long, status: Long): Int

public expect fun u_vparseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, status: Long)

public expect fun u_vparseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, parseerror: Long, status: Long)

public expect fun ubidi_close(pbidi: Long)

public expect fun ubidi_countParagraphs(pbidi: Long): Int

public expect fun ubidi_countRuns(pbidi: Long, perrorcode: Long): Int

public expect fun ubidi_getBaseDirection(text: Long, length: Int): UBiDiDirection

public expect fun ubidi_getClassCallback(pbidi: Long, fn: Long, context: Long)

public expect fun ubidi_getCustomizedClass(pbidi: Long, c: Int): UCharDirection

public expect fun ubidi_getDirection(pbidi: Long): UBiDiDirection

public expect fun ubidi_getLength(pbidi: Long): Int

public expect fun ubidi_getLevelAt(pbidi: Long, charindex: Int): UByte

public expect fun ubidi_getLevels(pbidi: Long, perrorcode: Long): Long

public expect fun ubidi_getLogicalIndex(pbidi: Long, visualindex: Int, perrorcode: Long): Int

public expect fun ubidi_getLogicalMap(pbidi: Long, indexmap: Long, perrorcode: Long)

public expect fun ubidi_getLogicalRun(pbidi: Long, logicalposition: Int, plogicallimit: Long, plevel: Long)

public expect fun ubidi_getParaLevel(pbidi: Long): UByte

public expect fun ubidi_getParagraph(pbidi: Long, charindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long): Int

public expect fun ubidi_getParagraphByIndex(pbidi: Long, paraindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long)

public expect fun ubidi_getProcessedLength(pbidi: Long): Int

public expect fun ubidi_getReorderingMode(pbidi: Long): UBiDiReorderingMode

public expect fun ubidi_getReorderingOptions(pbidi: Long): UInt

public expect fun ubidi_getResultLength(pbidi: Long): Int

public expect fun ubidi_getText(pbidi: Long): Long

public expect fun ubidi_getVisualIndex(pbidi: Long, logicalindex: Int, perrorcode: Long): Int

public expect fun ubidi_getVisualMap(pbidi: Long, indexmap: Long, perrorcode: Long)

public expect fun ubidi_getVisualRun(pbidi: Long, runindex: Int, plogicalstart: Long, plength: Long): UBiDiDirection

public expect fun ubidi_invertMap(srcmap: Long, destmap: Long, length: Int)

public expect fun ubidi_isInverse(pbidi: Long): Byte

public expect fun ubidi_isOrderParagraphsLTR(pbidi: Long): Byte

public expect fun ubidi_open(): Long

public expect fun ubidi_openSized(maxlength: Int, maxruncount: Int, perrorcode: Long): Long

public expect fun ubidi_orderParagraphsLTR(pbidi: Long, orderparagraphsltr: Byte)

public expect fun ubidi_reorderLogical(levels: Long, length: Int, indexmap: Long)

public expect fun ubidi_reorderVisual(levels: Long, length: Int, indexmap: Long)

public expect fun ubidi_setClassCallback(pbidi: Long, newfn: UBiDiClassCallback, newcontext: Long, oldfn: Long, oldcontext: Long, perrorcode: Long)

public expect fun ubidi_setContext(pbidi: Long, prologue: Long, prolength: Int, epilogue: Long, epilength: Int, perrorcode: Long)

public expect fun ubidi_setInverse(pbidi: Long, isinverse: Byte)

public expect fun ubidi_setLine(pparabidi: Long, start: Int, limit: Int, plinebidi: Long, perrorcode: Long)

public expect fun ubidi_setPara(pbidi: Long, text: Long, length: Int, paralevel: UByte, embeddinglevels: Long, perrorcode: Long)

public expect fun ubidi_setReorderingMode(pbidi: Long, reorderingmode: UBiDiReorderingMode)

public expect fun ubidi_setReorderingOptions(pbidi: Long, reorderingoptions: UInt)

public expect fun ubidi_writeReordered(pbidi: Long, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int

public expect fun ubidi_writeReverse(src: Long, srclength: Int, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int

public expect fun ubiditransform_close(pbiditransform: Long)

public expect fun ubiditransform_open(perrorcode: Long): Long

public expect fun ubiditransform_transform(pbiditransform: Long, src: Long, srclength: Int, dest: Long, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: Long): UInt

public expect fun ublock_getCode(c: Int): UBlockCode

public expect fun ubrk_close(bi: Long)

public expect fun ubrk_countAvailable(): Int

public expect fun ubrk_current(bi: Long): Int

public expect fun ubrk_first(bi: Long): Int

public expect fun ubrk_following(bi: Long, offset: Int): Int

public expect fun ubrk_getAvailable(index: Int): PCSTR

public expect fun ubrk_getBinaryRules(bi: Long, binaryrules: Long, rulescapacity: Int, status: Long): Int

public expect fun ubrk_getLocaleByType(bi: Long, type: ULocDataLocaleType, status: Long): PCSTR

public expect fun ubrk_getRuleStatus(bi: Long): Int

public expect fun ubrk_getRuleStatusVec(bi: Long, fillinvec: Long, capacity: Int, status: Long): Int

public expect fun ubrk_isBoundary(bi: Long, offset: Int): Byte

public expect fun ubrk_last(bi: Long): Int

public expect fun ubrk_next(bi: Long): Int

public expect fun ubrk_open(type: UBreakIteratorType, locale: PCSTR, text: Long, textlength: Int, status: Long): Long

public expect fun ubrk_openBinaryRules(binaryrules: Long, ruleslength: Int, text: Long, textlength: Int, status: Long): Long

public expect fun ubrk_openRules(rules: Long, ruleslength: Int, text: Long, textlength: Int, parseerr: Long, status: Long): Long

public expect fun ubrk_preceding(bi: Long, offset: Int): Int

public expect fun ubrk_previous(bi: Long): Int

public expect fun ubrk_refreshUText(bi: Long, text: Long, status: Long)

public expect fun ubrk_safeClone(bi: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

public expect fun ubrk_setText(bi: Long, text: Long, textlength: Int, status: Long)

public expect fun ubrk_setUText(bi: Long, text: Long, status: Long)

public expect fun ucal_add(cal: Long, field: UCalendarDateFields, amount: Int, status: Long)

public expect fun ucal_clear(calendar: Long)

public expect fun ucal_clearField(cal: Long, field: UCalendarDateFields)

public expect fun ucal_clone(cal: Long, status: Long): Long

public expect fun ucal_close(cal: Long)

public expect fun ucal_countAvailable(): Int

public expect fun ucal_equivalentTo(cal1: Long, cal2: Long): Byte

public expect fun ucal_get(cal: Long, field: UCalendarDateFields, status: Long): Int

public expect fun ucal_getAttribute(cal: Long, attr: UCalendarAttribute): Int

public expect fun ucal_getAvailable(localeindex: Int): PCSTR

public expect fun ucal_getCanonicalTimeZoneID(id: Long, len: Int, result: Long, resultcapacity: Int, issystemid: Long, status: Long): Int

public expect fun ucal_getDSTSavings(zoneid: Long, ec: Long): Int

public expect fun ucal_getDayOfWeekType(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): UCalendarWeekdayType

public expect fun ucal_getDefaultTimeZone(result: Long, resultcapacity: Int, ec: Long): Int

public expect fun ucal_getFieldDifference(cal: Long, target: Double, field: UCalendarDateFields, status: Long): Int

public expect fun ucal_getGregorianChange(cal: Long, perrorcode: Long): Double

public expect fun ucal_getHostTimeZone(result: Long, resultcapacity: Int, ec: Long): Int

public expect fun ucal_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long

public expect fun ucal_getLimit(cal: Long, field: UCalendarDateFields, type: UCalendarLimitType, status: Long): Int

public expect fun ucal_getLocaleByType(cal: Long, type: ULocDataLocaleType, status: Long): PCSTR

public expect fun ucal_getMillis(cal: Long, status: Long): Double

public expect fun ucal_getNow(): Double

public expect fun ucal_getTZDataVersion(status: Long): PCSTR

public expect fun ucal_getTimeZoneDisplayName(cal: Long, type: UCalendarDisplayNameType, locale: PCSTR, result: Long, resultlength: Int, status: Long): Int

public expect fun ucal_getTimeZoneID(cal: Long, result: Long, resultlength: Int, status: Long): Int

public expect fun ucal_getTimeZoneIDForWindowsID(winid: Long, len: Int, region: PCSTR, id: Long, idcapacity: Int, status: Long): Int

public expect fun ucal_getTimeZoneTransitionDate(cal: Long, type: UTimeZoneTransitionType, transition: Long, status: Long): Byte

public expect fun ucal_getType(cal: Long, status: Long): PCSTR

public expect fun ucal_getWeekendTransition(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): Int

public expect fun ucal_getWindowsTimeZoneID(id: Long, len: Int, winid: Long, winidcapacity: Int, status: Long): Int

public expect fun ucal_inDaylightTime(cal: Long, status: Long): Byte

public expect fun ucal_isSet(cal: Long, field: UCalendarDateFields): Byte

public expect fun ucal_isWeekend(cal: Long, date: Double, status: Long): Byte

public expect fun ucal_open(zoneid: Long, len: Int, locale: PCSTR, type: UCalendarType, status: Long): Long

public expect fun ucal_openCountryTimeZones(country: PCSTR, ec: Long): Long

public expect fun ucal_openTimeZoneIDEnumeration(zonetype: USystemTimeZoneType, region: PCSTR, rawoffset: Long, ec: Long): Long

public expect fun ucal_openTimeZones(ec: Long): Long

public expect fun ucal_roll(cal: Long, field: UCalendarDateFields, amount: Int, status: Long)

public expect fun ucal_set(cal: Long, field: UCalendarDateFields, value: Int)

public expect fun ucal_setAttribute(cal: Long, attr: UCalendarAttribute, newvalue: Int)

public expect fun ucal_setDate(cal: Long, year: Int, month: Int, date: Int, status: Long)

public expect fun ucal_setDateTime(cal: Long, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: Long)

public expect fun ucal_setDefaultTimeZone(zoneid: Long, ec: Long)

public expect fun ucal_setGregorianChange(cal: Long, date: Double, perrorcode: Long)

public expect fun ucal_setMillis(cal: Long, datetime: Double, status: Long)

public expect fun ucal_setTimeZone(cal: Long, zoneid: Long, len: Int, status: Long)

public expect fun ucasemap_close(csm: Long)

public expect fun ucasemap_getBreakIterator(csm: Long): Long

public expect fun ucasemap_getLocale(csm: Long): PCSTR

public expect fun ucasemap_getOptions(csm: Long): UInt

public expect fun ucasemap_open(locale: PCSTR, options: UInt, perrorcode: Long): Long

public expect fun ucasemap_setBreakIterator(csm: Long, itertoadopt: Long, perrorcode: Long)

public expect fun ucasemap_setLocale(csm: Long, locale: PCSTR, perrorcode: Long)

public expect fun ucasemap_setOptions(csm: Long, options: UInt, perrorcode: Long)

public expect fun ucasemap_toTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

public expect fun ucasemap_utf8FoldCase(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int

public expect fun ucasemap_utf8ToLower(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int

public expect fun ucasemap_utf8ToTitle(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int

public expect fun ucasemap_utf8ToUpper(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int

public expect fun ucfpos_close(ucfpos: Long)

public expect fun ucfpos_constrainCategory(ucfpos: Long, category: Int, ec: Long)

public expect fun ucfpos_constrainField(ucfpos: Long, category: Int, field: Int, ec: Long)

public expect fun ucfpos_getCategory(ucfpos: Long, ec: Long): Int

public expect fun ucfpos_getField(ucfpos: Long, ec: Long): Int

public expect fun ucfpos_getIndexes(ucfpos: Long, pstart: Long, plimit: Long, ec: Long)

public expect fun ucfpos_getInt64IterationContext(ucfpos: Long, ec: Long): Long

public expect fun ucfpos_matchesField(ucfpos: Long, category: Int, field: Int, ec: Long): Byte

public expect fun ucfpos_open(ec: Long): Long

public expect fun ucfpos_reset(ucfpos: Long, ec: Long)

public expect fun ucfpos_setInt64IterationContext(ucfpos: Long, context: Long, ec: Long)

public expect fun ucfpos_setState(ucfpos: Long, category: Int, field: Int, start: Int, limit: Int, ec: Long)

public expect fun ucnv_cbFromUWriteBytes(args: Long, source: PCSTR, length: Int, offsetindex: Int, err: Long)

public expect fun ucnv_cbFromUWriteSub(args: Long, offsetindex: Int, err: Long)

public expect fun ucnv_cbFromUWriteUChars(args: Long, source: Long, sourcelimit: Long, offsetindex: Int, err: Long)

public expect fun ucnv_cbToUWriteSub(args: Long, offsetindex: Int, err: Long)

public expect fun ucnv_cbToUWriteUChars(args: Long, source: Long, length: Int, offsetindex: Int, err: Long)

public expect fun ucnv_close(converter: Long)

public expect fun ucnv_compareNames(name1: PCSTR, name2: PCSTR): Int

public expect fun ucnv_convert(toconvertername: PCSTR, fromconvertername: PCSTR, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int

public expect fun ucnv_convertEx(targetcnv: Long, sourcecnv: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: PCSTR, pivotstart: Long, pivotsource: Long, pivottarget: Long, pivotlimit: Long, reset: Byte, flush: Byte, perrorcode: Long)

public expect fun ucnv_countAliases(alias: PCSTR, perrorcode: Long): UShort

public expect fun ucnv_countAvailable(): Int

public expect fun ucnv_countStandards(): UShort

public expect fun ucnv_detectUnicodeSignature(source: PCSTR, sourcelength: Int, signaturelength: Long, perrorcode: Long): PCSTR

public expect fun ucnv_fixFileSeparator(cnv: Long, source: Long, sourcelen: Int)

public expect fun ucnv_flushCache(): Int

public expect fun ucnv_fromAlgorithmic(cnv: Long, algorithmictype: UConverterType, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int

public expect fun ucnv_fromUChars(cnv: Long, dest: PCSTR, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int
