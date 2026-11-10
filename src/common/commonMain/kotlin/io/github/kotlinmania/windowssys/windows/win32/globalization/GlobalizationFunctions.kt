package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.EtoOptions
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public expect fun adjustCalendarDate(lpcaldatetime: COpaquePointer?, calunit: CaldatetimeDateunit, amount: Int): Bool

public expect fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: COpaquePointer?, cchcount1: Int, lpstring2: COpaquePointer?, cchcount2: Int): ComparestringResult

public expect fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, lparam: Lparam): ComparestringResult

public expect fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult

public expect fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult

public expect fun convertCalDateTimeToSystemTime(lpcaldatetime: COpaquePointer?, lpsystime: COpaquePointer?): Bool

public expect fun convertDefaultLocale(locale: UInt): UInt

public expect fun convertSystemTimeToCalDateTime(lpsystime: COpaquePointer?, calid: UInt, lpcaldatetime: COpaquePointer?): Bool

public expect fun enumCalendarInfoA(lpcalinfoenumproc: CalinfoEnumproca, locale: UInt, calendar: UInt, caltype: UInt): Bool

public expect fun enumCalendarInfoExA(lpcalinfoenumprocex: CalinfoEnumprocexa, locale: UInt, calendar: UInt, caltype: UInt): Bool

public expect fun enumCalendarInfoExEx(pcalinfoenumprocexex: CalinfoEnumprocexex, lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lparam: Lparam): Bool

public expect fun enumCalendarInfoExW(lpcalinfoenumprocex: CalinfoEnumprocexw, locale: UInt, calendar: UInt, caltype: UInt): Bool

public expect fun enumCalendarInfoW(lpcalinfoenumproc: CalinfoEnumprocw, locale: UInt, calendar: UInt, caltype: UInt): Bool

public expect fun enumDateFormatsA(lpdatefmtenumproc: DatefmtEnumproca, locale: UInt, dwflags: UInt): Bool

public expect fun enumDateFormatsExA(lpdatefmtenumprocex: DatefmtEnumprocexa, locale: UInt, dwflags: UInt): Bool

public expect fun enumDateFormatsExEx(lpdatefmtenumprocexex: DatefmtEnumprocexex, lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lparam: Lparam): Bool

public expect fun enumDateFormatsExW(lpdatefmtenumprocex: DatefmtEnumprocexw, locale: UInt, dwflags: UInt): Bool

public expect fun enumDateFormatsW(lpdatefmtenumproc: DatefmtEnumprocw, locale: UInt, dwflags: UInt): Bool

public expect fun enumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LanggrouplocaleEnumproca, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool

public expect fun enumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LanggrouplocaleEnumprocw, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool

public expect fun enumSystemCodePagesA(lpcodepageenumproc: CodepageEnumproca, dwflags: EnumSystemCodePagesFlags): Bool

public expect fun enumSystemCodePagesW(lpcodepageenumproc: CodepageEnumprocw, dwflags: EnumSystemCodePagesFlags): Bool

public expect fun enumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GeoEnumproc): Bool

public expect fun enumSystemGeoNames(geoclass: UInt, geoenumproc: GeoEnumnameproc, data: Lparam): Bool

public expect fun enumSystemLanguageGroupsA(lplanguagegroupenumproc: LanguagegroupEnumproca, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool

public expect fun enumSystemLanguageGroupsW(lplanguagegroupenumproc: LanguagegroupEnumprocw, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool

public expect fun enumSystemLocalesA(lplocaleenumproc: LocaleEnumproca, dwflags: UInt): Bool

public expect fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: COpaquePointer?): Bool

public expect fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool

public expect fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool

public expect fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool

public expect fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool

public expect fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool

public expect fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool

public expect fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: COpaquePointer?): Int

public expect fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: COpaquePointer?, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, sorthandle: Lparam): Int

public expect fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int

public expect fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int

public expect fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int

public expect fun getACP(): UInt

public expect fun getCPInfo(codepage: UInt, lpcpinfo: COpaquePointer?): Bool

public expect fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: COpaquePointer?): Bool

public expect fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: COpaquePointer?): Bool

public expect fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool

public expect fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: COpaquePointer?): Int

public expect fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: COpaquePointer?): Int

public expect fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: COpaquePointer?): Int

public expect fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: COpaquePointer?, lpcalmaxdatetime: COpaquePointer?): Bool

public expect fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: COpaquePointer?, lpcurrencystr: Pstr, cchcurrency: Int): Int

public expect fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpcurrencystr: Pwstr, cchcurrency: Int): Int

public expect fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpcurrencystr: Pwstr, cchcurrency: Int): Int

public expect fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: COpaquePointer?, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int

public expect fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int

public expect fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int

public expect fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: COpaquePointer?): Hresult

public expect fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: COpaquePointer?, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int

public expect fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: COpaquePointer?, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int

public expect fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: COpaquePointer?, pcbfilemuiinfo: COpaquePointer?): Bool

public expect fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: COpaquePointer?, pwszfilemuipath: Pwstr, pcchfilemuipath: COpaquePointer?, pululenumerator: COpaquePointer?): Bool

public expect fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int

public expect fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int

public expect fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int

public expect fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int

public expect fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int

public expect fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int

public expect fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: COpaquePointer?): Bool

public expect fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: COpaquePointer?): Bool

public expect fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: COpaquePointer?, lpnumberstr: Pstr, cchnumber: Int): Int

public expect fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpnumberstr: Pwstr, cchnumber: Int): Int

public expect fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpnumberstr: Pwstr, cchnumber: Int): Int

public expect fun getOEMCP(): UInt

public expect fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool

public expect fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int

public expect fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool

public expect fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool

public expect fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool

public expect fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool

public expect fun getSystemDefaultLCID(): UInt

public expect fun getSystemDefaultLangID(): UShort

public expect fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int

public expect fun getSystemDefaultUILanguage(): UShort

public expect fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool

public expect fun getTextCharset(hdc: Hdc): Int

public expect fun getTextCharsetInfo(hdc: Hdc, lpsig: COpaquePointer?, dwflags: UInt): Int

public expect fun getThreadLocale(): UInt

public expect fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool

public expect fun getThreadUILanguage(): UShort

public expect fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: COpaquePointer?, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int

public expect fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: COpaquePointer?, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int

public expect fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: COpaquePointer?, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int

public expect fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: COpaquePointer?, pattributes: COpaquePointer?): Bool

public expect fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int

public expect fun getUserDefaultLCID(): UInt

public expect fun getUserDefaultLangID(): UShort

public expect fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int

public expect fun getUserDefaultUILanguage(): UShort

public expect fun getUserGeoID(geoclass: Sysgeoclass): Int

public expect fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool

public expect fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int

public expect fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int

public expect fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int

public expect fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool

public expect fun isDBCSLeadByte(testchar: UByte): Bool

public expect fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool

public expect fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: COpaquePointer?, lpstring: Pcwstr, cchstr: Int): Bool

public expect fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool

public expect fun isTextUnicode(lpv: COpaquePointer?, isize: Int, lpiresult: COpaquePointer?): Bool

public expect fun isValidCodePage(codepage: UInt): Bool

public expect fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool

public expect fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool

public expect fun isValidLocaleName(lplocalename: Pcwstr): Bool

public expect fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: COpaquePointer?): UInt

public expect fun isWellFormedTag(psztag: Pcwstr): UByte

public expect fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int

public expect fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int

public expect fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, sorthandle: Lparam): Int

public expect fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int

public expect fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt

public expect fun mappingDoAction(pbag: COpaquePointer?, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult

public expect fun mappingFreePropertyBag(pbag: COpaquePointer?): Hresult

public expect fun mappingFreeServices(pserviceinfo: COpaquePointer?): Hresult

public expect fun mappingGetServices(poptions: COpaquePointer?, prgservices: COpaquePointer?, pdwservicescount: COpaquePointer?): Hresult

public expect fun mappingRecognizeText(pserviceinfo: COpaquePointer?, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: COpaquePointer?, pbag: COpaquePointer?): Hresult

public expect fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int

public expect fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int

public expect fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: COpaquePointer?): Bool

public expect fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int

public expect fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages)

public expect fun scriptApplyDigitSubstitution(psds: COpaquePointer?, psc: COpaquePointer?, pss: COpaquePointer?): Hresult

public expect fun scriptApplyLogicalWidth(pidx: COpaquePointer?, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, pabc: COpaquePointer?, pijustify: COpaquePointer?): Hresult

public expect fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: COpaquePointer?, psla: COpaquePointer?): Hresult

public expect fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, pix: COpaquePointer?): Hresult

public expect fun scriptCacheGetHeight(hdc: Hdc, psc: COpaquePointer?, tmheight: COpaquePointer?): Hresult

public expect fun scriptFreeCache(psc: COpaquePointer?): Hresult

public expect fun scriptGetCMap(hdc: Hdc, psc: COpaquePointer?, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: COpaquePointer?): Hresult

public expect fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: COpaquePointer?, pcalternates: COpaquePointer?): Hresult

public expect fun scriptGetFontFeatureTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: COpaquePointer?, pctags: COpaquePointer?): Hresult

public expect fun scriptGetFontLanguageTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, cmaxtags: Int, plangsystags: COpaquePointer?, pctags: COpaquePointer?): Hresult

public expect fun scriptGetFontProperties(hdc: Hdc, psc: COpaquePointer?, sfp: COpaquePointer?): Hresult

public expect fun scriptGetFontScriptTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, cmaxtags: Int, pscripttags: COpaquePointer?, pctags: COpaquePointer?): Hresult

public expect fun scriptGetGlyphABCWidth(hdc: Hdc, psc: COpaquePointer?, wglyph: UShort, pabc: COpaquePointer?): Hresult

public expect fun scriptGetLogicalWidths(psa: COpaquePointer?, cchars: Int, cglyphs: Int, piglyphwidth: COpaquePointer?, pwlogclust: COpaquePointer?, psva: COpaquePointer?, pidx: COpaquePointer?): Hresult

public expect fun scriptGetProperties(ppsp: COpaquePointer?, pinumscripts: COpaquePointer?): Hresult

public expect fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult

public expect fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pitems: COpaquePointer?, pcitems: COpaquePointer?): Hresult

public expect fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pitems: COpaquePointer?, pscripttags: COpaquePointer?, pcitems: COpaquePointer?): Hresult

public expect fun scriptJustify(psva: COpaquePointer?, piadvance: COpaquePointer?, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: COpaquePointer?): Hresult

public expect fun scriptLayout(cruns: Int, pblevel: COpaquePointer?, pivisualtological: COpaquePointer?, pilogicaltovisual: COpaquePointer?): Hresult

public expect fun scriptPlace(hdc: Hdc, psc: COpaquePointer?, pwglyphs: COpaquePointer?, cglyphs: Int, psva: COpaquePointer?, psa: COpaquePointer?, piadvance: COpaquePointer?, pgoffset: COpaquePointer?, pabc: COpaquePointer?): Hresult

public expect fun scriptPlaceOpenType(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, rcrangechars: COpaquePointer?, rprangeproperties: COpaquePointer?, cranges: Int, pwcchars: Pcwstr, pwlogclust: COpaquePointer?, pcharprops: COpaquePointer?, cchars: Int, pwglyphs: COpaquePointer?, pglyphprops: COpaquePointer?, cglyphs: Int, piadvance: COpaquePointer?, pgoffset: COpaquePointer?, pabc: COpaquePointer?): Hresult

public expect fun scriptPositionSingleGlyph(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: COpaquePointer?, poutgoffset: COpaquePointer?): Hresult

public expect fun scriptRecordDigitSubstitution(locale: UInt, psds: COpaquePointer?): Hresult

public expect fun scriptShape(hdc: Hdc, psc: COpaquePointer?, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: COpaquePointer?, pwoutglyphs: COpaquePointer?, pwlogclust: COpaquePointer?, psva: COpaquePointer?, pcglyphs: COpaquePointer?): Hresult

public expect fun scriptShapeOpenType(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, rcrangechars: COpaquePointer?, rprangeproperties: COpaquePointer?, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: COpaquePointer?, pcharprops: COpaquePointer?, pwoutglyphs: COpaquePointer?, poutglyphprops: COpaquePointer?, pcglyphs: COpaquePointer?): Hresult

public expect fun scriptStringAnalyse(hdc: Hdc, pstring: COpaquePointer?, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pidx: COpaquePointer?, ptabdef: COpaquePointer?, pbinclass: COpaquePointer?, pssa: COpaquePointer?): Hresult

public expect fun scriptStringCPtoX(ssa: COpaquePointer?, icp: Int, ftrailing: Bool, px: COpaquePointer?): Hresult

public expect fun scriptStringFree(pssa: COpaquePointer?): Hresult

public expect fun scriptStringGetLogicalWidths(ssa: COpaquePointer?, pidx: COpaquePointer?): Hresult

public expect fun scriptStringGetOrder(ssa: COpaquePointer?, puorder: COpaquePointer?): Hresult

public expect fun scriptStringOut(ssa: COpaquePointer?, ix: Int, iy: Int, uoptions: EtoOptions, prc: COpaquePointer?, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult

public expect fun scriptStringValidate(ssa: COpaquePointer?): Hresult

public expect fun scriptStringXtoCP(ssa: COpaquePointer?, ix: Int, pich: COpaquePointer?, pitrailing: COpaquePointer?): Hresult

public expect fun scriptStringPLogAttr(ssa: COpaquePointer?): COpaquePointer?

public expect fun scriptStringPSize(ssa: COpaquePointer?): COpaquePointer?

public expect fun scriptStringPcOutChars(ssa: COpaquePointer?): COpaquePointer?

public expect fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: COpaquePointer?): Hresult

public expect fun scriptTextOut(hdc: Hdc, psc: COpaquePointer?, x: Int, y: Int, fuoptions: UInt, lprc: COpaquePointer?, psa: COpaquePointer?, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: COpaquePointer?, cglyphs: Int, piadvance: COpaquePointer?, pijustify: COpaquePointer?, pgoffset: COpaquePointer?): Hresult

public expect fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, picp: COpaquePointer?, pitrailing: COpaquePointer?): Hresult

public expect fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool

public expect fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool

public expect fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool

public expect fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool

public expect fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: COpaquePointer?): Bool

public expect fun setThreadLocale(locale: UInt): Bool

public expect fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: COpaquePointer?): Bool

public expect fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: COpaquePointer?, snapshot: COpaquePointer?): Bool

public expect fun setThreadUILanguage(langid: UShort): UShort

public expect fun setUserGeoID(geoid: Int): Bool

public expect fun setUserGeoName(geoname: Pcwstr): Bool

public expect fun translateCharsetInfo(lpsrc: COpaquePointer?, lpcs: COpaquePointer?, dwflags: TranslateCharsetInfoFlags): Bool

public expect fun ucnvFromUCallbackEscape(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?)

public expect fun ucnvFromUCallbackSkip(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?)

public expect fun ucnvFromUCallbackStop(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?)

public expect fun ucnvFromUCallbackSubstitute(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?)

public expect fun ucnvToUCallbackEscape(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?)

public expect fun ucnvToUCallbackSkip(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?)

public expect fun ucnvToUCallbackStop(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?)

public expect fun ucnvToUCallbackSubstitute(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?)

public expect fun updateCalendarDayOfWeek(lpcaldatetime: COpaquePointer?): Bool

public expect fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool

public expect fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: COpaquePointer?): Int

public expect fun lstrcatA(lpstring1: Pstr, lpstring2: Pcstr): Pstr

public expect fun lstrcatW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr

public expect fun lstrcmpA(lpstring1: Pcstr, lpstring2: Pcstr): Int

public expect fun lstrcmpW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int

public expect fun lstrcmpiA(lpstring1: Pcstr, lpstring2: Pcstr): Int

public expect fun lstrcmpiW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int

public expect fun lstrcpyA(lpstring1: Pstr, lpstring2: Pcstr): Pstr

public expect fun lstrcpyW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr

public expect fun lstrcpynA(lpstring1: Pstr, lpstring2: Pcstr, imaxlength: Int): Pstr

public expect fun lstrcpynW(lpstring1: Pwstr, lpstring2: Pcwstr, imaxlength: Int): Pwstr

public expect fun lstrlenA(lpstring: Pcstr): Int

public expect fun lstrlenW(lpstring: Pcwstr): Int

public expect fun uUcharsToChars(us: COpaquePointer?, cs: Pcstr, length: Int)

public expect fun uAustrcpy(dst: Pcstr, src: COpaquePointer?): Pstr

public expect fun uAustrncpy(dst: Pcstr, src: COpaquePointer?, n: Int): Pstr

public expect fun uCatclose(catd: COpaquePointer?)

public expect fun uCatgets(catd: COpaquePointer?, setNum: Int, msgNum: Int, s: COpaquePointer?, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun uCatopen(name: Pcstr, locale: Pcstr, ec: COpaquePointer?): COpaquePointer?

public expect fun uCharAge(c: Int, versionarray: COpaquePointer?)

public expect fun uCharDigitValue(c: Int): Int

public expect fun uCharDirection(c: Int): UCharDirection

public expect fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: COpaquePointer?): Int

public expect fun uCharMirror(c: Int): Int

public expect fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: COpaquePointer?): Int

public expect fun uCharType(c: Int): Byte

public expect fun uCharsToUchars(cs: Pcstr, us: COpaquePointer?, length: Int)

public expect fun uCleanup()

public expect fun uCountChar32(s: COpaquePointer?, length: Int): Int

public expect fun uDigit(ch: Int, radix: Byte): Int

public expect fun uEnumCharNames(start: Int, limit: Int, fn: COpaquePointer?, context: COpaquePointer?, namechoice: UCharNameChoice, perrorcode: COpaquePointer?)

public expect fun uEnumCharTypes(enumrange: COpaquePointer?, context: COpaquePointer?)

public expect fun uErrorName(code: UErrorCode): Pcstr

public expect fun uFoldCase(c: Int, options: UInt): Int

public expect fun uForDigit(digit: Int, radix: Byte): Int

public expect fun uFormatMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?, vararg variadicArgs: Long): Int

public expect fun uFormatMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long): Int

public expect fun uGetBidiPairedBracket(c: Int): Int

public expect fun uGetBinaryPropertySet(property: UProperty, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uGetCombiningClass(c: Int): UByte

public expect fun uGetDataVersion(dataversionfillin: COpaquePointer?, status: COpaquePointer?)

public expect fun uGetFcNfkcClosure(c: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int

public expect fun uGetIntPropertyMap(property: UProperty, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uGetIntPropertyMaxValue(which: UProperty): Int

public expect fun uGetIntPropertyMinValue(which: UProperty): Int

public expect fun uGetIntPropertyValue(c: Int, which: UProperty): Int

public expect fun uGetNumericValue(c: Int): Double

public expect fun uGetPropertyEnum(alias: Pcstr): UProperty

public expect fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr

public expect fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int

public expect fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr

public expect fun uGetUnicodeVersion(versionarray: COpaquePointer?)

public expect fun uGetVersion(versionarray: COpaquePointer?)

public expect fun uHasBinaryProperty(c: Int, which: UProperty): Byte

public expect fun uInit(status: COpaquePointer?)

public expect fun uIsIdignorable(c: Int): Byte

public expect fun uIsIdpart(c: Int): Byte

public expect fun uIsIdstart(c: Int): Byte

public expect fun uIsIsocontrol(c: Int): Byte

public expect fun uIsJavaIdpart(c: Int): Byte

public expect fun uIsJavaIdstart(c: Int): Byte

public expect fun uIsJavaSpaceChar(c: Int): Byte

public expect fun uIsMirrored(c: Int): Byte

public expect fun uIsUalphabetic(c: Int): Byte

public expect fun uIsUlowercase(c: Int): Byte

public expect fun uIsUuppercase(c: Int): Byte

public expect fun uIsUwhiteSpace(c: Int): Byte

public expect fun uIsWhitespace(c: Int): Byte

public expect fun uIsalnum(c: Int): Byte

public expect fun uIsalpha(c: Int): Byte

public expect fun uIsbase(c: Int): Byte

public expect fun uIsblank(c: Int): Byte

public expect fun uIscntrl(c: Int): Byte

public expect fun uIsdefined(c: Int): Byte

public expect fun uIsdigit(c: Int): Byte

public expect fun uIsgraph(c: Int): Byte

public expect fun uIslower(c: Int): Byte

public expect fun uIsprint(c: Int): Byte

public expect fun uIspunct(c: Int): Byte

public expect fun uIsspace(c: Int): Byte

public expect fun uIstitle(c: Int): Byte

public expect fun uIsupper(c: Int): Byte

public expect fun uIsxdigit(c: Int): Byte

public expect fun uMemcasecmp(s1: COpaquePointer?, s2: COpaquePointer?, length: Int, options: UInt): Int

public expect fun uMemchr(s: COpaquePointer?, c: UShort, count: Int): COpaquePointer?

public expect fun uMemchr32(s: COpaquePointer?, c: Int, count: Int): COpaquePointer?

public expect fun uMemcmp(buf1: COpaquePointer?, buf2: COpaquePointer?, count: Int): Int

public expect fun uMemcmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?, count: Int): Int

public expect fun uMemcpy(dest: COpaquePointer?, src: COpaquePointer?, count: Int): COpaquePointer?

public expect fun uMemmove(dest: COpaquePointer?, src: COpaquePointer?, count: Int): COpaquePointer?

public expect fun uMemrchr(s: COpaquePointer?, c: UShort, count: Int): COpaquePointer?

public expect fun uMemrchr32(s: COpaquePointer?, c: Int, count: Int): COpaquePointer?

public expect fun uMemset(dest: COpaquePointer?, c: UShort, count: Int): COpaquePointer?

public expect fun uParseMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, status: COpaquePointer?, vararg variadicArgs: Long)

public expect fun uParseMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, parseerror: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long)

public expect fun uSetMemoryFunctions(context: COpaquePointer?, a: COpaquePointer?, r: COpaquePointer?, f: COpaquePointer?, status: COpaquePointer?)

public expect fun uShapeArabic(source: COpaquePointer?, sourcelength: Int, dest: COpaquePointer?, destsize: Int, options: UInt, perrorcode: COpaquePointer?): Int

public expect fun uStrCaseCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, options: UInt, perrorcode: COpaquePointer?): Int

public expect fun uStrCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, codepointorder: Byte): Int

public expect fun uStrCompareIter(iter1: COpaquePointer?, iter2: COpaquePointer?, codepointorder: Byte): Int

public expect fun uStrFindFirst(s: COpaquePointer?, length: Int, substring: COpaquePointer?, sublength: Int): COpaquePointer?

public expect fun uStrFindLast(s: COpaquePointer?, length: Int, substring: COpaquePointer?, sublength: Int): COpaquePointer?

public expect fun uStrFoldCase(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, options: UInt, perrorcode: COpaquePointer?): Int

public expect fun uStrFromJavaModifiedUtf8WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uStrFromUtf32(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uStrFromUtf32WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uStrFromUtf8(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uStrFromUtf8Lenient(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uStrFromUtf8WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uStrFromWcs(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcwstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uStrHasMoreChar32Than(s: COpaquePointer?, length: Int, number: Int): Byte

public expect fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pstr

public expect fun uStrToLower(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, locale: Pcstr, perrorcode: COpaquePointer?): Int

public expect fun uStrToTitle(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, titleiter: COpaquePointer?, locale: Pcstr, perrorcode: COpaquePointer?): Int

public expect fun uStrToUtf32(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uStrToUtf32WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pstr

public expect fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): Pstr

public expect fun uStrToUpper(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, locale: Pcstr, perrorcode: COpaquePointer?): Int

public expect fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pwstr

public expect fun uStrcasecmp(s1: COpaquePointer?, s2: COpaquePointer?, options: UInt): Int

public expect fun uStrcat(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer?

public expect fun uStrchr(s: COpaquePointer?, c: UShort): COpaquePointer?

public expect fun uStrchr32(s: COpaquePointer?, c: Int): COpaquePointer?

public expect fun uStrcmp(s1: COpaquePointer?, s2: COpaquePointer?): Int

public expect fun uStrcmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?): Int

public expect fun uStrcpy(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer?

public expect fun uStrcspn(string: COpaquePointer?, matchset: COpaquePointer?): Int

public expect fun uStrlen(s: COpaquePointer?): Int

public expect fun uStrncasecmp(s1: COpaquePointer?, s2: COpaquePointer?, n: Int, options: UInt): Int

public expect fun uStrncat(dst: COpaquePointer?, src: COpaquePointer?, n: Int): COpaquePointer?

public expect fun uStrncmp(ucs1: COpaquePointer?, ucs2: COpaquePointer?, n: Int): Int

public expect fun uStrncmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?, n: Int): Int

public expect fun uStrncpy(dst: COpaquePointer?, src: COpaquePointer?, n: Int): COpaquePointer?

public expect fun uStrpbrk(string: COpaquePointer?, matchset: COpaquePointer?): COpaquePointer?

public expect fun uStrrchr(s: COpaquePointer?, c: UShort): COpaquePointer?

public expect fun uStrrchr32(s: COpaquePointer?, c: Int): COpaquePointer?

public expect fun uStrrstr(s: COpaquePointer?, substring: COpaquePointer?): COpaquePointer?

public expect fun uStrspn(string: COpaquePointer?, matchset: COpaquePointer?): Int

public expect fun uStrstr(s: COpaquePointer?, substring: COpaquePointer?): COpaquePointer?

public expect fun uStrtokR(src: COpaquePointer?, delim: COpaquePointer?, savestate: COpaquePointer?): COpaquePointer?

public expect fun uTolower(c: Int): Int

public expect fun uTotitle(c: Int): Int

public expect fun uToupper(c: Int): Int

public expect fun uUastrcpy(dst: COpaquePointer?, src: Pcstr): COpaquePointer?

public expect fun uUastrncpy(dst: COpaquePointer?, src: Pcstr, n: Int): COpaquePointer?

public expect fun uUnescape(src: Pcstr, dest: COpaquePointer?, destcapacity: Int): Int

public expect fun uUnescapeAt(charat: UnescapeCharAt, offset: COpaquePointer?, length: Int, context: COpaquePointer?): Int

public expect fun uVersionFromString(versionarray: COpaquePointer?, versionstring: Pcstr)

public expect fun uVersionFromUstring(versionarray: COpaquePointer?, versionstring: COpaquePointer?)

public expect fun uVersionToString(versionarray: COpaquePointer?, versionstring: Pcstr)

public expect fun uVformatMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, ap: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uVformatMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, parseerror: COpaquePointer?, ap: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uVparseMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, ap: COpaquePointer?, status: COpaquePointer?)

public expect fun uVparseMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, ap: COpaquePointer?, parseerror: COpaquePointer?, status: COpaquePointer?)

public expect fun ubidiClose(pbidi: COpaquePointer?)

public expect fun ubidiCountParagraphs(pbidi: COpaquePointer?): Int

public expect fun ubidiCountRuns(pbidi: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun ubidiGetBaseDirection(text: COpaquePointer?, length: Int): UBiDiDirection

public expect fun ubidiGetClassCallback(pbidi: COpaquePointer?, fn: COpaquePointer?, context: COpaquePointer?)

public expect fun ubidiGetCustomizedClass(pbidi: COpaquePointer?, c: Int): UCharDirection

public expect fun ubidiGetDirection(pbidi: COpaquePointer?): UBiDiDirection

public expect fun ubidiGetLength(pbidi: COpaquePointer?): Int

public expect fun ubidiGetLevelAt(pbidi: COpaquePointer?, charindex: Int): UByte

public expect fun ubidiGetLevels(pbidi: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun ubidiGetLogicalIndex(pbidi: COpaquePointer?, visualindex: Int, perrorcode: COpaquePointer?): Int

public expect fun ubidiGetLogicalMap(pbidi: COpaquePointer?, indexmap: COpaquePointer?, perrorcode: COpaquePointer?)

public expect fun ubidiGetLogicalRun(pbidi: COpaquePointer?, logicalposition: Int, plogicallimit: COpaquePointer?, plevel: COpaquePointer?)

public expect fun ubidiGetParaLevel(pbidi: COpaquePointer?): UByte

public expect fun ubidiGetParagraph(pbidi: COpaquePointer?, charindex: Int, pparastart: COpaquePointer?, pparalimit: COpaquePointer?, pparalevel: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun ubidiGetParagraphByIndex(pbidi: COpaquePointer?, paraindex: Int, pparastart: COpaquePointer?, pparalimit: COpaquePointer?, pparalevel: COpaquePointer?, perrorcode: COpaquePointer?)

public expect fun ubidiGetProcessedLength(pbidi: COpaquePointer?): Int

public expect fun ubidiGetReorderingMode(pbidi: COpaquePointer?): UBiDiReorderingMode

public expect fun ubidiGetReorderingOptions(pbidi: COpaquePointer?): UInt

public expect fun ubidiGetResultLength(pbidi: COpaquePointer?): Int

public expect fun ubidiGetText(pbidi: COpaquePointer?): COpaquePointer?

public expect fun ubidiGetVisualIndex(pbidi: COpaquePointer?, logicalindex: Int, perrorcode: COpaquePointer?): Int

public expect fun ubidiGetVisualMap(pbidi: COpaquePointer?, indexmap: COpaquePointer?, perrorcode: COpaquePointer?)

public expect fun ubidiGetVisualRun(pbidi: COpaquePointer?, runindex: Int, plogicalstart: COpaquePointer?, plength: COpaquePointer?): UBiDiDirection

public expect fun ubidiInvertMap(srcmap: COpaquePointer?, destmap: COpaquePointer?, length: Int)

public expect fun ubidiIsInverse(pbidi: COpaquePointer?): Byte

public expect fun ubidiIsOrderParagraphsLtr(pbidi: COpaquePointer?): Byte

public expect fun ubidiOpen(): COpaquePointer?

public expect fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun ubidiOrderParagraphsLtr(pbidi: COpaquePointer?, orderparagraphsltr: Byte)

public expect fun ubidiReorderLogical(levels: COpaquePointer?, length: Int, indexmap: COpaquePointer?)

public expect fun ubidiReorderVisual(levels: COpaquePointer?, length: Int, indexmap: COpaquePointer?)

public expect fun ubidiSetClassCallback(pbidi: COpaquePointer?, newfn: UBiDiClassCallback, newcontext: COpaquePointer?, oldfn: COpaquePointer?, oldcontext: COpaquePointer?, perrorcode: COpaquePointer?)

public expect fun ubidiSetContext(pbidi: COpaquePointer?, prologue: COpaquePointer?, prolength: Int, epilogue: COpaquePointer?, epilength: Int, perrorcode: COpaquePointer?)

public expect fun ubidiSetInverse(pbidi: COpaquePointer?, isinverse: Byte)

public expect fun ubidiSetLine(pparabidi: COpaquePointer?, start: Int, limit: Int, plinebidi: COpaquePointer?, perrorcode: COpaquePointer?)

public expect fun ubidiSetPara(pbidi: COpaquePointer?, text: COpaquePointer?, length: Int, paralevel: UByte, embeddinglevels: COpaquePointer?, perrorcode: COpaquePointer?)

public expect fun ubidiSetReorderingMode(pbidi: COpaquePointer?, reorderingmode: UBiDiReorderingMode)

public expect fun ubidiSetReorderingOptions(pbidi: COpaquePointer?, reorderingoptions: UInt)

public expect fun ubidiWriteReordered(pbidi: COpaquePointer?, dest: COpaquePointer?, destsize: Int, options: UShort, perrorcode: COpaquePointer?): Int

public expect fun ubidiWriteReverse(src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destsize: Int, options: UShort, perrorcode: COpaquePointer?): Int

public expect fun ubiditransformClose(pbiditransform: COpaquePointer?)

public expect fun ubiditransformOpen(perrorcode: COpaquePointer?): COpaquePointer?

public expect fun ubiditransformTransform(pbiditransform: COpaquePointer?, src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: COpaquePointer?): UInt

public expect fun ublockGetCode(c: Int): UBlockCode

public expect fun ubrkClose(bi: COpaquePointer?)

public expect fun ubrkCountAvailable(): Int

public expect fun ubrkCurrent(bi: COpaquePointer?): Int

public expect fun ubrkFirst(bi: COpaquePointer?): Int

public expect fun ubrkFollowing(bi: COpaquePointer?, offset: Int): Int

public expect fun ubrkGetAvailable(index: Int): Pcstr

public expect fun ubrkGetBinaryRules(bi: COpaquePointer?, binaryrules: COpaquePointer?, rulescapacity: Int, status: COpaquePointer?): Int

public expect fun ubrkGetLocaleByType(bi: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr

public expect fun ubrkGetRuleStatus(bi: COpaquePointer?): Int

public expect fun ubrkGetRuleStatusVec(bi: COpaquePointer?, fillinvec: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int

public expect fun ubrkIsBoundary(bi: COpaquePointer?, offset: Int): Byte

public expect fun ubrkLast(bi: COpaquePointer?): Int

public expect fun ubrkNext(bi: COpaquePointer?): Int

public expect fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer?

public expect fun ubrkOpenBinaryRules(binaryrules: COpaquePointer?, ruleslength: Int, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer?

public expect fun ubrkOpenRules(rules: COpaquePointer?, ruleslength: Int, text: COpaquePointer?, textlength: Int, parseerr: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ubrkPreceding(bi: COpaquePointer?, offset: Int): Int

public expect fun ubrkPrevious(bi: COpaquePointer?): Int

public expect fun ubrkRefreshUtext(bi: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?)

public expect fun ubrkSafeClone(bi: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ubrkSetText(bi: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?)

public expect fun ubrkSetUtext(bi: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?)

public expect fun ucalAdd(cal: COpaquePointer?, field: UCalendarDateFields, amount: Int, status: COpaquePointer?)

public expect fun ucalClear(calendar: COpaquePointer?)

public expect fun ucalClearField(cal: COpaquePointer?, field: UCalendarDateFields)

public expect fun ucalClone(cal: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ucalClose(cal: COpaquePointer?)

public expect fun ucalCountAvailable(): Int

public expect fun ucalEquivalentTo(cal1: COpaquePointer?, cal2: COpaquePointer?): Byte

public expect fun ucalGet(cal: COpaquePointer?, field: UCalendarDateFields, status: COpaquePointer?): Int

public expect fun ucalGetAttribute(cal: COpaquePointer?, attr: UCalendarAttribute): Int

public expect fun ucalGetAvailable(localeindex: Int): Pcstr

public expect fun ucalGetCanonicalTimeZoneId(id: COpaquePointer?, len: Int, result: COpaquePointer?, resultcapacity: Int, issystemid: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ucalGetDstsavings(zoneid: COpaquePointer?, ec: COpaquePointer?): Int

public expect fun ucalGetDayOfWeekType(cal: COpaquePointer?, dayofweek: UCalendarDaysOfWeek, status: COpaquePointer?): UCalendarWeekdayType

public expect fun ucalGetDefaultTimeZone(result: COpaquePointer?, resultcapacity: Int, ec: COpaquePointer?): Int

public expect fun ucalGetFieldDifference(cal: COpaquePointer?, target: Double, field: UCalendarDateFields, status: COpaquePointer?): Int

public expect fun ucalGetGregorianChange(cal: COpaquePointer?, perrorcode: COpaquePointer?): Double

public expect fun ucalGetHostTimeZone(result: COpaquePointer?, resultcapacity: Int, ec: COpaquePointer?): Int

public expect fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer?

public expect fun ucalGetLimit(cal: COpaquePointer?, field: UCalendarDateFields, type: UCalendarLimitType, status: COpaquePointer?): Int

public expect fun ucalGetLocaleByType(cal: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr

public expect fun ucalGetMillis(cal: COpaquePointer?, status: COpaquePointer?): Double

public expect fun ucalGetNow(): Double

public expect fun ucalGetTzdataVersion(status: COpaquePointer?): Pcstr

public expect fun ucalGetTimeZoneDisplayName(cal: COpaquePointer?, type: UCalendarDisplayNameType, locale: Pcstr, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun ucalGetTimeZoneId(cal: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun ucalGetTimeZoneIdforWindowsId(winid: COpaquePointer?, len: Int, region: Pcstr, id: COpaquePointer?, idcapacity: Int, status: COpaquePointer?): Int

public expect fun ucalGetTimeZoneTransitionDate(cal: COpaquePointer?, type: UTimeZoneTransitionType, transition: COpaquePointer?, status: COpaquePointer?): Byte

public expect fun ucalGetType(cal: COpaquePointer?, status: COpaquePointer?): Pcstr

public expect fun ucalGetWeekendTransition(cal: COpaquePointer?, dayofweek: UCalendarDaysOfWeek, status: COpaquePointer?): Int

public expect fun ucalGetWindowsTimeZoneId(id: COpaquePointer?, len: Int, winid: COpaquePointer?, winidcapacity: Int, status: COpaquePointer?): Int

public expect fun ucalInDaylightTime(cal: COpaquePointer?, status: COpaquePointer?): Byte

public expect fun ucalIsSet(cal: COpaquePointer?, field: UCalendarDateFields): Byte

public expect fun ucalIsWeekend(cal: COpaquePointer?, date: Double, status: COpaquePointer?): Byte

public expect fun ucalOpen(zoneid: COpaquePointer?, len: Int, locale: Pcstr, type: UCalendarType, status: COpaquePointer?): COpaquePointer?

public expect fun ucalOpenCountryTimeZones(country: Pcstr, ec: COpaquePointer?): COpaquePointer?

public expect fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun ucalOpenTimeZones(ec: COpaquePointer?): COpaquePointer?

public expect fun ucalRoll(cal: COpaquePointer?, field: UCalendarDateFields, amount: Int, status: COpaquePointer?)

public expect fun ucalSet(cal: COpaquePointer?, field: UCalendarDateFields, value: Int)

public expect fun ucalSetAttribute(cal: COpaquePointer?, attr: UCalendarAttribute, newvalue: Int)

public expect fun ucalSetDate(cal: COpaquePointer?, year: Int, month: Int, date: Int, status: COpaquePointer?)

public expect fun ucalSetDateTime(cal: COpaquePointer?, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: COpaquePointer?)

public expect fun ucalSetDefaultTimeZone(zoneid: COpaquePointer?, ec: COpaquePointer?)

public expect fun ucalSetGregorianChange(cal: COpaquePointer?, date: Double, perrorcode: COpaquePointer?)

public expect fun ucalSetMillis(cal: COpaquePointer?, datetime: Double, status: COpaquePointer?)

public expect fun ucalSetTimeZone(cal: COpaquePointer?, zoneid: COpaquePointer?, len: Int, status: COpaquePointer?)

public expect fun ucasemapClose(csm: COpaquePointer?)

public expect fun ucasemapGetBreakIterator(csm: COpaquePointer?): COpaquePointer?

public expect fun ucasemapGetLocale(csm: COpaquePointer?): Pcstr

public expect fun ucasemapGetOptions(csm: COpaquePointer?): UInt

public expect fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun ucasemapSetBreakIterator(csm: COpaquePointer?, itertoadopt: COpaquePointer?, perrorcode: COpaquePointer?)

public expect fun ucasemapSetLocale(csm: COpaquePointer?, locale: Pcstr, perrorcode: COpaquePointer?)

public expect fun ucasemapSetOptions(csm: COpaquePointer?, options: UInt, perrorcode: COpaquePointer?)

public expect fun ucasemapToTitle(csm: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Int

public expect fun ucasemapUtf8FoldCase(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int

public expect fun ucasemapUtf8ToLower(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int

public expect fun ucasemapUtf8ToTitle(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int

public expect fun ucasemapUtf8ToUpper(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int

public expect fun ucfposClose(ucfpos: COpaquePointer?)

public expect fun ucfposConstrainCategory(ucfpos: COpaquePointer?, category: Int, ec: COpaquePointer?)

public expect fun ucfposConstrainField(ucfpos: COpaquePointer?, category: Int, field: Int, ec: COpaquePointer?)

public expect fun ucfposGetCategory(ucfpos: COpaquePointer?, ec: COpaquePointer?): Int

public expect fun ucfposGetField(ucfpos: COpaquePointer?, ec: COpaquePointer?): Int

public expect fun ucfposGetIndexes(ucfpos: COpaquePointer?, pstart: COpaquePointer?, plimit: COpaquePointer?, ec: COpaquePointer?)

public expect fun ucfposGetInt64IterationContext(ucfpos: COpaquePointer?, ec: COpaquePointer?): Long

public expect fun ucfposMatchesField(ucfpos: COpaquePointer?, category: Int, field: Int, ec: COpaquePointer?): Byte

public expect fun ucfposOpen(ec: COpaquePointer?): COpaquePointer?

public expect fun ucfposReset(ucfpos: COpaquePointer?, ec: COpaquePointer?)

public expect fun ucfposSetInt64IterationContext(ucfpos: COpaquePointer?, context: Long, ec: COpaquePointer?)

public expect fun ucfposSetState(ucfpos: COpaquePointer?, category: Int, field: Int, start: Int, limit: Int, ec: COpaquePointer?)

public expect fun ucnvCbFromUwriteBytes(args: COpaquePointer?, source: Pcstr, length: Int, offsetindex: Int, err: COpaquePointer?)

public expect fun ucnvCbFromUwriteSub(args: COpaquePointer?, offsetindex: Int, err: COpaquePointer?)

public expect fun ucnvCbFromUwriteUchars(args: COpaquePointer?, source: COpaquePointer?, sourcelimit: COpaquePointer?, offsetindex: Int, err: COpaquePointer?)

public expect fun ucnvCbToUwriteSub(args: COpaquePointer?, offsetindex: Int, err: COpaquePointer?)

public expect fun ucnvCbToUwriteUchars(args: COpaquePointer?, source: COpaquePointer?, length: Int, offsetindex: Int, err: COpaquePointer?)

public expect fun ucnvClose(converter: COpaquePointer?)

public expect fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int

public expect fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int

public expect fun ucnvConvertEx(targetcnv: COpaquePointer?, sourcecnv: COpaquePointer?, target: COpaquePointer?, targetlimit: Pcstr, source: COpaquePointer?, sourcelimit: Pcstr, pivotstart: COpaquePointer?, pivotsource: COpaquePointer?, pivottarget: COpaquePointer?, pivotlimit: COpaquePointer?, reset: Byte, flush: Byte, perrorcode: COpaquePointer?)

public expect fun ucnvCountAliases(alias: Pcstr, perrorcode: COpaquePointer?): UShort

public expect fun ucnvCountAvailable(): Int

public expect fun ucnvCountStandards(): UShort

public expect fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: COpaquePointer?, perrorcode: COpaquePointer?): Pcstr

public expect fun ucnvFixFileSeparator(cnv: COpaquePointer?, source: COpaquePointer?, sourcelen: Int)

public expect fun ucnvFlushCache(): Int

public expect fun ucnvFromAlgorithmic(cnv: COpaquePointer?, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int

public expect fun ucnvFromUchars(cnv: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Int
