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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Abc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.EtoOptions
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public expect fun adjustCalendarDate(lpcaldatetime: MutPtr<Caldatetime>, calunit: CaldatetimeDateunit, amount: Int): Bool

public expect fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: ConstPtr<Byte>, cchcount1: Int, lpstring2: ConstPtr<Byte>, cchcount2: Int): ComparestringResult

public expect fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, lparam: Lparam): ComparestringResult

public expect fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult

public expect fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult

public expect fun convertCalDateTimeToSystemTime(lpcaldatetime: ConstPtr<Caldatetime>, lpsystime: MutPtr<Systemtime>): Bool

public expect fun convertDefaultLocale(locale: UInt): UInt

public expect fun convertSystemTimeToCalDateTime(lpsystime: ConstPtr<Systemtime>, calid: UInt, lpcaldatetime: MutPtr<Caldatetime>): Bool

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

public expect fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: ConstPtr<CVoid>): Bool

public expect fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool

public expect fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool

public expect fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool

public expect fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool

public expect fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool

public expect fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool

public expect fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr<Int>): Int

public expect fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr<Int>, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, sorthandle: Lparam): Int

public expect fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int

public expect fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int

public expect fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int

public expect fun getACP(): UInt

public expect fun getCPInfo(codepage: UInt, lpcpinfo: MutPtr<Cpinfo>): Bool

public expect fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr<Cpinfoexa>): Bool

public expect fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr<Cpinfoexw>): Bool

public expect fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: ConstPtr<Caldatetime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool

public expect fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int

public expect fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int

public expect fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int

public expect fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: MutPtr<Caldatetime>, lpcalmaxdatetime: MutPtr<Caldatetime>): Bool

public expect fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr<Currencyfmta>, lpcurrencystr: Pstr, cchcurrency: Int): Int

public expect fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Currencyfmtw>, lpcurrencystr: Pwstr, cchcurrency: Int): Int

public expect fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Currencyfmtw>, lpcurrencystr: Pwstr, cchcurrency: Int): Int

public expect fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: ConstPtr<Systemtime>, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int

public expect fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: ConstPtr<Systemtime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int

public expect fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: ConstPtr<Systemtime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int

public expect fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: MutPtr<Double>): Hresult

public expect fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: ConstPtr<Systemtime>, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int

public expect fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: ConstPtr<Systemtime>, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int

public expect fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: MutPtr<Filemuiinfo>, pcbfilemuiinfo: MutPtr<UInt>): Bool

public expect fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: MutPtr<UInt>, pwszfilemuipath: Pwstr, pcchfilemuipath: MutPtr<UInt>, pululenumerator: MutPtr<ULong>): Bool

public expect fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int

public expect fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int

public expect fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int

public expect fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int

public expect fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int

public expect fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int

public expect fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: MutPtr<Nlsversioninfo>): Bool

public expect fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: MutPtr<Nlsversioninfoex>): Bool

public expect fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr<Numberfmta>, lpnumberstr: Pstr, cchnumber: Int): Int

public expect fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Numberfmtw>, lpnumberstr: Pwstr, cchnumber: Int): Int

public expect fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Numberfmtw>, lpnumberstr: Pwstr, cchnumber: Int): Int

public expect fun getOEMCP(): UInt

public expect fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool

public expect fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int

public expect fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool

public expect fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool

public expect fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool

public expect fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool

public expect fun getSystemDefaultLCID(): UInt

public expect fun getSystemDefaultLangID(): UShort

public expect fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int

public expect fun getSystemDefaultUILanguage(): UShort

public expect fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool

public expect fun getTextCharset(hdc: Hdc): Int

public expect fun getTextCharsetInfo(hdc: Hdc, lpsig: MutPtr<Fontsignature>, dwflags: UInt): Int

public expect fun getThreadLocale(): UInt

public expect fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool

public expect fun getThreadUILanguage(): UShort

public expect fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: ConstPtr<Systemtime>, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int

public expect fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: ConstPtr<Systemtime>, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int

public expect fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: ConstPtr<Systemtime>, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int

public expect fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: MutPtr<UInt>, pattributes: MutPtr<UInt>): Bool

public expect fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int

public expect fun getUserDefaultLCID(): UInt

public expect fun getUserDefaultLangID(): UShort

public expect fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int

public expect fun getUserDefaultUILanguage(): UShort

public expect fun getUserGeoID(geoclass: Sysgeoclass): Int

public expect fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool

public expect fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int

public expect fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int

public expect fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int

public expect fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool

public expect fun isDBCSLeadByte(testchar: UByte): Bool

public expect fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool

public expect fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: ConstPtr<Nlsversioninfo>, lpstring: Pcwstr, cchstr: Int): Bool

public expect fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool

public expect fun isTextUnicode(lpv: ConstPtr<CVoid>, isize: Int, lpiresult: MutPtr<IsTextUnicodeResult>): Bool

public expect fun isValidCodePage(codepage: UInt): Bool

public expect fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool

public expect fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool

public expect fun isValidLocaleName(lplocalename: Pcwstr): Bool

public expect fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: ConstPtr<Nlsversioninfoex>): UInt

public expect fun isWellFormedTag(psztag: Pcwstr): UByte

public expect fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int

public expect fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int

public expect fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, sorthandle: Lparam): Int

public expect fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int

public expect fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt

public expect fun mappingDoAction(pbag: MutPtr<MappingPropertyBag>, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult

public expect fun mappingFreePropertyBag(pbag: ConstPtr<MappingPropertyBag>): Hresult

public expect fun mappingFreeServices(pserviceinfo: ConstPtr<MappingServiceInfo>): Hresult

public expect fun mappingGetServices(poptions: ConstPtr<MappingEnumOptions>, prgservices: MutPtr<MutPtr<MappingServiceInfo>>, pdwservicescount: MutPtr<UInt>): Hresult

public expect fun mappingRecognizeText(pserviceinfo: ConstPtr<MappingServiceInfo>, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: ConstPtr<MappingOptions>, pbag: MutPtr<MappingPropertyBag>): Hresult

public expect fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int

public expect fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int

public expect fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: MutPtr<UInt>): Bool

public expect fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int

public expect fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages)

public expect fun scriptApplyDigitSubstitution(psds: ConstPtr<ScriptDigitsubstitute>, psc: MutPtr<ScriptControl>, pss: MutPtr<ScriptState>): Hresult

public expect fun scriptApplyLogicalWidth(pidx: ConstPtr<Int>, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, pabc: MutPtr<Abc>, pijustify: MutPtr<Int>): Hresult

public expect fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: ConstPtr<ScriptAnalysis>, psla: MutPtr<ScriptLogattr>): Hresult

public expect fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, pix: MutPtr<Int>): Hresult

public expect fun scriptCacheGetHeight(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, tmheight: MutPtr<Int>): Hresult

public expect fun scriptFreeCache(psc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun scriptGetCMap(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: MutPtr<UShort>): Hresult

public expect fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: MutPtr<UShort>, pcalternates: MutPtr<Int>): Hresult

public expect fun scriptGetFontFeatureTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult

public expect fun scriptGetFontLanguageTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, cmaxtags: Int, plangsystags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult

public expect fun scriptGetFontProperties(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, sfp: MutPtr<ScriptFontproperties>): Hresult

public expect fun scriptGetFontScriptTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, cmaxtags: Int, pscripttags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult

public expect fun scriptGetGlyphABCWidth(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, wglyph: UShort, pabc: MutPtr<Abc>): Hresult

public expect fun scriptGetLogicalWidths(psa: ConstPtr<ScriptAnalysis>, cchars: Int, cglyphs: Int, piglyphwidth: ConstPtr<Int>, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, pidx: ConstPtr<Int>): Hresult

public expect fun scriptGetProperties(ppsp: MutPtr<MutPtr<MutPtr<ScriptProperties>>>, pinumscripts: MutPtr<Int>): Hresult

public expect fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult

public expect fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pitems: MutPtr<ScriptItem>, pcitems: MutPtr<Int>): Hresult

public expect fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pitems: MutPtr<ScriptItem>, pscripttags: MutPtr<UInt>, pcitems: MutPtr<Int>): Hresult

public expect fun scriptJustify(psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: MutPtr<Int>): Hresult

public expect fun scriptLayout(cruns: Int, pblevel: ConstPtr<UByte>, pivisualtological: MutPtr<Int>, pilogicaltovisual: MutPtr<Int>): Hresult

public expect fun scriptPlace(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwglyphs: ConstPtr<UShort>, cglyphs: Int, psva: ConstPtr<ScriptVisattr>, psa: MutPtr<ScriptAnalysis>, piadvance: MutPtr<Int>, pgoffset: MutPtr<Goffset>, pabc: MutPtr<Abc>): Hresult

public expect fun scriptPlaceOpenType(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: MutPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr<Int>, rprangeproperties: ConstPtr<ConstPtr<TextrangeProperties>>, cranges: Int, pwcchars: Pcwstr, pwlogclust: ConstPtr<UShort>, pcharprops: ConstPtr<ScriptCharprop>, cchars: Int, pwglyphs: ConstPtr<UShort>, pglyphprops: ConstPtr<ScriptGlyphprop>, cglyphs: Int, piadvance: MutPtr<Int>, pgoffset: MutPtr<Goffset>, pabc: MutPtr<Abc>): Hresult

public expect fun scriptPositionSingleGlyph(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: MutPtr<Int>, poutgoffset: MutPtr<Goffset>): Hresult

public expect fun scriptRecordDigitSubstitution(locale: UInt, psds: MutPtr<ScriptDigitsubstitute>): Hresult

public expect fun scriptShape(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: MutPtr<ScriptAnalysis>, pwoutglyphs: MutPtr<UShort>, pwlogclust: MutPtr<UShort>, psva: MutPtr<ScriptVisattr>, pcglyphs: MutPtr<Int>): Hresult

public expect fun scriptShapeOpenType(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: MutPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr<Int>, rprangeproperties: ConstPtr<ConstPtr<TextrangeProperties>>, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: MutPtr<UShort>, pcharprops: MutPtr<ScriptCharprop>, pwoutglyphs: MutPtr<UShort>, poutglyphprops: MutPtr<ScriptGlyphprop>, pcglyphs: MutPtr<Int>): Hresult

public expect fun scriptStringAnalyse(hdc: Hdc, pstring: ConstPtr<CVoid>, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pidx: ConstPtr<Int>, ptabdef: ConstPtr<ScriptTabdef>, pbinclass: ConstPtr<UByte>, pssa: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun scriptStringCPtoX(ssa: ConstPtr<CVoid>, icp: Int, ftrailing: Bool, px: MutPtr<Int>): Hresult

public expect fun scriptStringFree(pssa: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun scriptStringGetLogicalWidths(ssa: ConstPtr<CVoid>, pidx: MutPtr<Int>): Hresult

public expect fun scriptStringGetOrder(ssa: ConstPtr<CVoid>, puorder: MutPtr<UInt>): Hresult

public expect fun scriptStringOut(ssa: ConstPtr<CVoid>, ix: Int, iy: Int, uoptions: EtoOptions, prc: ConstPtr<Rect>, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult

public expect fun scriptStringValidate(ssa: ConstPtr<CVoid>): Hresult

public expect fun scriptStringXtoCP(ssa: ConstPtr<CVoid>, ix: Int, pich: MutPtr<Int>, pitrailing: MutPtr<Int>): Hresult

public expect fun scriptStringPLogAttr(ssa: ConstPtr<CVoid>): MutPtr<ScriptLogattr>

public expect fun scriptStringPSize(ssa: ConstPtr<CVoid>): MutPtr<Size>

public expect fun scriptStringPcOutChars(ssa: ConstPtr<CVoid>): MutPtr<Int>

public expect fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: MutPtr<UShort>): Hresult

public expect fun scriptTextOut(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, x: Int, y: Int, fuoptions: UInt, lprc: ConstPtr<Rect>, psa: ConstPtr<ScriptAnalysis>, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: ConstPtr<UShort>, cglyphs: Int, piadvance: ConstPtr<Int>, pijustify: ConstPtr<Int>, pgoffset: ConstPtr<Goffset>): Hresult

public expect fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, picp: MutPtr<Int>, pitrailing: MutPtr<Int>): Hresult

public expect fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool

public expect fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool

public expect fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool

public expect fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool

public expect fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr<UInt>): Bool

public expect fun setThreadLocale(locale: UInt): Bool

public expect fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr<UInt>): Bool

public expect fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: MutPtr<UInt>, snapshot: MutPtr<Hsaveduilanguages>): Bool

public expect fun setThreadUILanguage(langid: UShort): UShort

public expect fun setUserGeoID(geoid: Int): Bool

public expect fun setUserGeoName(geoname: Pcwstr): Bool

public expect fun translateCharsetInfo(lpsrc: MutPtr<UInt>, lpcs: MutPtr<Charsetinfo>, dwflags: TranslateCharsetInfoFlags): Bool

public expect fun ucnvFromUCallbackEscape(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>)

public expect fun ucnvFromUCallbackSkip(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>)

public expect fun ucnvFromUCallbackStop(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>)

public expect fun ucnvFromUCallbackSubstitute(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>)

public expect fun ucnvToUCallbackEscape(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>)

public expect fun ucnvToUCallbackSkip(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>)

public expect fun ucnvToUCallbackStop(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>)

public expect fun ucnvToUCallbackSubstitute(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>)

public expect fun updateCalendarDayOfWeek(lpcaldatetime: MutPtr<Caldatetime>): Bool

public expect fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool

public expect fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: MutPtr<Bool>): Int

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

public expect fun uUcharsToChars(us: ConstPtr<UShort>, cs: Pcstr, length: Int)

public expect fun uAustrcpy(dst: Pcstr, src: ConstPtr<UShort>): Pstr

public expect fun uAustrncpy(dst: Pcstr, src: ConstPtr<UShort>, n: Int): Pstr

public expect fun uCatclose(catd: MutPtr<UResourceBundle>)

public expect fun uCatgets(catd: MutPtr<UResourceBundle>, setNum: Int, msgNum: Int, s: ConstPtr<UShort>, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uCatopen(name: Pcstr, locale: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UResourceBundle>

public expect fun uCharAge(c: Int, versionarray: MutPtr<UByte>)

public expect fun uCharDigitValue(c: Int): Int

public expect fun uCharDirection(c: Int): UCharDirection

public expect fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uCharMirror(c: Int): Int

public expect fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uCharType(c: Int): Byte

public expect fun uCharsToUchars(cs: Pcstr, us: MutPtr<UShort>, length: Int)

public expect fun uCleanup()

public expect fun uCountChar32(s: ConstPtr<UShort>, length: Int): Int

public expect fun uDigit(ch: Int, radix: Byte): Int

public expect fun uEnumCharNames(start: Int, limit: Int, fn: MutPtr<UEnumCharNamesFn>, context: MutPtr<CVoid>, namechoice: UCharNameChoice, perrorcode: MutPtr<UErrorCode>)

public expect fun uEnumCharTypes(enumrange: MutPtr<UCharEnumTypeRange>, context: ConstPtr<CVoid>)

public expect fun uErrorName(code: UErrorCode): Pcstr

public expect fun uFoldCase(c: Int, options: UInt): Int

public expect fun uForDigit(digit: Int, radix: Byte): Int

public expect fun uFormatMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int

public expect fun uFormatMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int

public expect fun uGetBidiPairedBracket(c: Int): Int

public expect fun uGetBinaryPropertySet(property: UProperty, perrorcode: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun uGetCombiningClass(c: Int): UByte

public expect fun uGetDataVersion(dataversionfillin: MutPtr<UByte>, status: MutPtr<UErrorCode>)

public expect fun uGetFcNfkcClosure(c: Int, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uGetIntPropertyMap(property: UProperty, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPMap>

public expect fun uGetIntPropertyMaxValue(which: UProperty): Int

public expect fun uGetIntPropertyMinValue(which: UProperty): Int

public expect fun uGetIntPropertyValue(c: Int, which: UProperty): Int

public expect fun uGetNumericValue(c: Int): Double

public expect fun uGetPropertyEnum(alias: Pcstr): UProperty

public expect fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr

public expect fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int

public expect fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr

public expect fun uGetUnicodeVersion(versionarray: MutPtr<UByte>)

public expect fun uGetVersion(versionarray: MutPtr<UByte>)

public expect fun uHasBinaryProperty(c: Int, which: UProperty): Byte

public expect fun uInit(status: MutPtr<UErrorCode>)

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

public expect fun uMemcasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, length: Int, options: UInt): Int

public expect fun uMemchr(s: ConstPtr<UShort>, c: UShort, count: Int): MutPtr<UShort>

public expect fun uMemchr32(s: ConstPtr<UShort>, c: Int, count: Int): MutPtr<UShort>

public expect fun uMemcmp(buf1: ConstPtr<UShort>, buf2: ConstPtr<UShort>, count: Int): Int

public expect fun uMemcmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, count: Int): Int

public expect fun uMemcpy(dest: MutPtr<UShort>, src: ConstPtr<UShort>, count: Int): MutPtr<UShort>

public expect fun uMemmove(dest: MutPtr<UShort>, src: ConstPtr<UShort>, count: Int): MutPtr<UShort>

public expect fun uMemrchr(s: ConstPtr<UShort>, c: UShort, count: Int): MutPtr<UShort>

public expect fun uMemrchr32(s: ConstPtr<UShort>, c: Int, count: Int): MutPtr<UShort>

public expect fun uMemset(dest: MutPtr<UShort>, c: UShort, count: Int): MutPtr<UShort>

public expect fun uParseMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long)

public expect fun uParseMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long)

public expect fun uSetMemoryFunctions(context: ConstPtr<CVoid>, a: MutPtr<UMemAllocFn>, r: MutPtr<UMemReallocFn>, f: MutPtr<UMemFreeFn>, status: MutPtr<UErrorCode>)

public expect fun uShapeArabic(source: ConstPtr<UShort>, sourcelength: Int, dest: MutPtr<UShort>, destsize: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uStrCaseCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uStrCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, codepointorder: Byte): Int

public expect fun uStrCompareIter(iter1: MutPtr<UCharIterator>, iter2: MutPtr<UCharIterator>, codepointorder: Byte): Int

public expect fun uStrFindFirst(s: ConstPtr<UShort>, length: Int, substring: ConstPtr<UShort>, sublength: Int): MutPtr<UShort>

public expect fun uStrFindLast(s: ConstPtr<UShort>, length: Int, substring: ConstPtr<UShort>, sublength: Int): MutPtr<UShort>

public expect fun uStrFoldCase(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uStrFromJavaModifiedUtf8WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uStrFromUtf32(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<Int>, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uStrFromUtf32WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<Int>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uStrFromUtf8(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uStrFromUtf8Lenient(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uStrFromUtf8WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uStrFromWcs(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcwstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uStrHasMoreChar32Than(s: ConstPtr<UShort>, length: Int, number: Int): Byte

public expect fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pstr

public expect fun uStrToLower(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uStrToTitle(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, titleiter: MutPtr<UBreakIterator>, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uStrToUtf32(dest: MutPtr<Int>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<Int>

public expect fun uStrToUtf32WithSub(dest: MutPtr<Int>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<Int>

public expect fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pstr

public expect fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Pstr

public expect fun uStrToUpper(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pwstr

public expect fun uStrcasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, options: UInt): Int

public expect fun uStrcat(dst: MutPtr<UShort>, src: ConstPtr<UShort>): MutPtr<UShort>

public expect fun uStrchr(s: ConstPtr<UShort>, c: UShort): MutPtr<UShort>

public expect fun uStrchr32(s: ConstPtr<UShort>, c: Int): MutPtr<UShort>

public expect fun uStrcmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>): Int

public expect fun uStrcmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>): Int

public expect fun uStrcpy(dst: MutPtr<UShort>, src: ConstPtr<UShort>): MutPtr<UShort>

public expect fun uStrcspn(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): Int

public expect fun uStrlen(s: ConstPtr<UShort>): Int

public expect fun uStrncasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, n: Int, options: UInt): Int

public expect fun uStrncat(dst: MutPtr<UShort>, src: ConstPtr<UShort>, n: Int): MutPtr<UShort>

public expect fun uStrncmp(ucs1: ConstPtr<UShort>, ucs2: ConstPtr<UShort>, n: Int): Int

public expect fun uStrncmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, n: Int): Int

public expect fun uStrncpy(dst: MutPtr<UShort>, src: ConstPtr<UShort>, n: Int): MutPtr<UShort>

public expect fun uStrpbrk(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): MutPtr<UShort>

public expect fun uStrrchr(s: ConstPtr<UShort>, c: UShort): MutPtr<UShort>

public expect fun uStrrchr32(s: ConstPtr<UShort>, c: Int): MutPtr<UShort>

public expect fun uStrrstr(s: ConstPtr<UShort>, substring: ConstPtr<UShort>): MutPtr<UShort>

public expect fun uStrspn(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): Int

public expect fun uStrstr(s: ConstPtr<UShort>, substring: ConstPtr<UShort>): MutPtr<UShort>

public expect fun uStrtokR(src: MutPtr<UShort>, delim: ConstPtr<UShort>, savestate: MutPtr<MutPtr<UShort>>): MutPtr<UShort>

public expect fun uTolower(c: Int): Int

public expect fun uTotitle(c: Int): Int

public expect fun uToupper(c: Int): Int

public expect fun uUastrcpy(dst: MutPtr<UShort>, src: Pcstr): MutPtr<UShort>

public expect fun uUastrncpy(dst: MutPtr<UShort>, src: Pcstr, n: Int): MutPtr<UShort>

public expect fun uUnescape(src: Pcstr, dest: MutPtr<UShort>, destcapacity: Int): Int

public expect fun uUnescapeAt(charat: UnescapeCharAt, offset: MutPtr<Int>, length: Int, context: MutPtr<CVoid>): Int

public expect fun uVersionFromString(versionarray: MutPtr<UByte>, versionstring: Pcstr)

public expect fun uVersionFromUstring(versionarray: MutPtr<UByte>, versionstring: ConstPtr<UShort>)

public expect fun uVersionToString(versionarray: ConstPtr<UByte>, versionstring: Pcstr)

public expect fun uVformatMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int

public expect fun uVformatMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, parseerror: MutPtr<UParseError>, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int

public expect fun uVparseMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>)

public expect fun uVparseMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, ap: MutPtr<Byte>, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>)

public expect fun ubidiClose(pbidi: MutPtr<UBiDi>)

public expect fun ubidiCountParagraphs(pbidi: MutPtr<UBiDi>): Int

public expect fun ubidiCountRuns(pbidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ubidiGetBaseDirection(text: ConstPtr<UShort>, length: Int): UBiDiDirection

public expect fun ubidiGetClassCallback(pbidi: MutPtr<UBiDi>, fn: MutPtr<UBiDiClassCallback>, context: ConstPtr<ConstPtr<CVoid>>)

public expect fun ubidiGetCustomizedClass(pbidi: MutPtr<UBiDi>, c: Int): UCharDirection

public expect fun ubidiGetDirection(pbidi: ConstPtr<UBiDi>): UBiDiDirection

public expect fun ubidiGetLength(pbidi: ConstPtr<UBiDi>): Int

public expect fun ubidiGetLevelAt(pbidi: ConstPtr<UBiDi>, charindex: Int): UByte

public expect fun ubidiGetLevels(pbidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>): MutPtr<UByte>

public expect fun ubidiGetLogicalIndex(pbidi: MutPtr<UBiDi>, visualindex: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ubidiGetLogicalMap(pbidi: MutPtr<UBiDi>, indexmap: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>)

public expect fun ubidiGetLogicalRun(pbidi: ConstPtr<UBiDi>, logicalposition: Int, plogicallimit: MutPtr<Int>, plevel: MutPtr<UByte>)

public expect fun ubidiGetParaLevel(pbidi: ConstPtr<UBiDi>): UByte

public expect fun ubidiGetParagraph(pbidi: ConstPtr<UBiDi>, charindex: Int, pparastart: MutPtr<Int>, pparalimit: MutPtr<Int>, pparalevel: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ubidiGetParagraphByIndex(pbidi: ConstPtr<UBiDi>, paraindex: Int, pparastart: MutPtr<Int>, pparalimit: MutPtr<Int>, pparalevel: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>)

public expect fun ubidiGetProcessedLength(pbidi: ConstPtr<UBiDi>): Int

public expect fun ubidiGetReorderingMode(pbidi: MutPtr<UBiDi>): UBiDiReorderingMode

public expect fun ubidiGetReorderingOptions(pbidi: MutPtr<UBiDi>): UInt

public expect fun ubidiGetResultLength(pbidi: ConstPtr<UBiDi>): Int

public expect fun ubidiGetText(pbidi: ConstPtr<UBiDi>): MutPtr<UShort>

public expect fun ubidiGetVisualIndex(pbidi: MutPtr<UBiDi>, logicalindex: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ubidiGetVisualMap(pbidi: MutPtr<UBiDi>, indexmap: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>)

public expect fun ubidiGetVisualRun(pbidi: MutPtr<UBiDi>, runindex: Int, plogicalstart: MutPtr<Int>, plength: MutPtr<Int>): UBiDiDirection

public expect fun ubidiInvertMap(srcmap: ConstPtr<Int>, destmap: MutPtr<Int>, length: Int)

public expect fun ubidiIsInverse(pbidi: MutPtr<UBiDi>): Byte

public expect fun ubidiIsOrderParagraphsLtr(pbidi: MutPtr<UBiDi>): Byte

public expect fun ubidiOpen(): MutPtr<UBiDi>

public expect fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UBiDi>

public expect fun ubidiOrderParagraphsLtr(pbidi: MutPtr<UBiDi>, orderparagraphsltr: Byte)

public expect fun ubidiReorderLogical(levels: ConstPtr<UByte>, length: Int, indexmap: MutPtr<Int>)

public expect fun ubidiReorderVisual(levels: ConstPtr<UByte>, length: Int, indexmap: MutPtr<Int>)

public expect fun ubidiSetClassCallback(pbidi: MutPtr<UBiDi>, newfn: UBiDiClassCallback, newcontext: ConstPtr<CVoid>, oldfn: MutPtr<UBiDiClassCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>)

public expect fun ubidiSetContext(pbidi: MutPtr<UBiDi>, prologue: ConstPtr<UShort>, prolength: Int, epilogue: ConstPtr<UShort>, epilength: Int, perrorcode: MutPtr<UErrorCode>)

public expect fun ubidiSetInverse(pbidi: MutPtr<UBiDi>, isinverse: Byte)

public expect fun ubidiSetLine(pparabidi: ConstPtr<UBiDi>, start: Int, limit: Int, plinebidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>)

public expect fun ubidiSetPara(pbidi: MutPtr<UBiDi>, text: ConstPtr<UShort>, length: Int, paralevel: UByte, embeddinglevels: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>)

public expect fun ubidiSetReorderingMode(pbidi: MutPtr<UBiDi>, reorderingmode: UBiDiReorderingMode)

public expect fun ubidiSetReorderingOptions(pbidi: MutPtr<UBiDi>, reorderingoptions: UInt)

public expect fun ubidiWriteReordered(pbidi: MutPtr<UBiDi>, dest: MutPtr<UShort>, destsize: Int, options: UShort, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ubidiWriteReverse(src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destsize: Int, options: UShort, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ubiditransformClose(pbiditransform: MutPtr<UBiDiTransform>)

public expect fun ubiditransformOpen(perrorcode: MutPtr<UErrorCode>): MutPtr<UBiDiTransform>

public expect fun ubiditransformTransform(pbiditransform: MutPtr<UBiDiTransform>, src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: MutPtr<UErrorCode>): UInt

public expect fun ublockGetCode(c: Int): UBlockCode

public expect fun ubrkClose(bi: MutPtr<UBreakIterator>)

public expect fun ubrkCountAvailable(): Int

public expect fun ubrkCurrent(bi: ConstPtr<UBreakIterator>): Int

public expect fun ubrkFirst(bi: MutPtr<UBreakIterator>): Int

public expect fun ubrkFollowing(bi: MutPtr<UBreakIterator>, offset: Int): Int

public expect fun ubrkGetAvailable(index: Int): Pcstr

public expect fun ubrkGetBinaryRules(bi: MutPtr<UBreakIterator>, binaryrules: MutPtr<UByte>, rulescapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ubrkGetLocaleByType(bi: ConstPtr<UBreakIterator>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr

public expect fun ubrkGetRuleStatus(bi: MutPtr<UBreakIterator>): Int

public expect fun ubrkGetRuleStatusVec(bi: MutPtr<UBreakIterator>, fillinvec: MutPtr<Int>, capacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ubrkIsBoundary(bi: MutPtr<UBreakIterator>, offset: Int): Byte

public expect fun ubrkLast(bi: MutPtr<UBreakIterator>): Int

public expect fun ubrkNext(bi: MutPtr<UBreakIterator>): Int

public expect fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator>

public expect fun ubrkOpenBinaryRules(binaryrules: ConstPtr<UByte>, ruleslength: Int, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator>

public expect fun ubrkOpenRules(rules: ConstPtr<UShort>, ruleslength: Int, text: ConstPtr<UShort>, textlength: Int, parseerr: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator>

public expect fun ubrkPreceding(bi: MutPtr<UBreakIterator>, offset: Int): Int

public expect fun ubrkPrevious(bi: MutPtr<UBreakIterator>): Int

public expect fun ubrkRefreshUtext(bi: MutPtr<UBreakIterator>, text: MutPtr<UText>, status: MutPtr<UErrorCode>)

public expect fun ubrkSafeClone(bi: ConstPtr<UBreakIterator>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator>

public expect fun ubrkSetText(bi: MutPtr<UBreakIterator>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>)

public expect fun ubrkSetUtext(bi: MutPtr<UBreakIterator>, text: MutPtr<UText>, status: MutPtr<UErrorCode>)

public expect fun ucalAdd(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, amount: Int, status: MutPtr<UErrorCode>)

public expect fun ucalClear(calendar: MutPtr<MutPtr<CVoid>>)

public expect fun ucalClearField(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields)

public expect fun ucalClone(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun ucalClose(cal: MutPtr<MutPtr<CVoid>>)

public expect fun ucalCountAvailable(): Int

public expect fun ucalEquivalentTo(cal1: ConstPtr<ConstPtr<CVoid>>, cal2: ConstPtr<ConstPtr<CVoid>>): Byte

public expect fun ucalGet(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields, status: MutPtr<UErrorCode>): Int

public expect fun ucalGetAttribute(cal: ConstPtr<ConstPtr<CVoid>>, attr: UCalendarAttribute): Int

public expect fun ucalGetAvailable(localeindex: Int): Pcstr

public expect fun ucalGetCanonicalTimeZoneId(id: ConstPtr<UShort>, len: Int, result: MutPtr<UShort>, resultcapacity: Int, issystemid: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int

public expect fun ucalGetDstsavings(zoneid: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Int

public expect fun ucalGetDayOfWeekType(cal: ConstPtr<ConstPtr<CVoid>>, dayofweek: UCalendarDaysOfWeek, status: MutPtr<UErrorCode>): UCalendarWeekdayType

public expect fun ucalGetDefaultTimeZone(result: MutPtr<UShort>, resultcapacity: Int, ec: MutPtr<UErrorCode>): Int

public expect fun ucalGetFieldDifference(cal: MutPtr<MutPtr<CVoid>>, target: Double, field: UCalendarDateFields, status: MutPtr<UErrorCode>): Int

public expect fun ucalGetGregorianChange(cal: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): Double

public expect fun ucalGetHostTimeZone(result: MutPtr<UShort>, resultcapacity: Int, ec: MutPtr<UErrorCode>): Int

public expect fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucalGetLimit(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields, type: UCalendarLimitType, status: MutPtr<UErrorCode>): Int

public expect fun ucalGetLocaleByType(cal: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr

public expect fun ucalGetMillis(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double

public expect fun ucalGetNow(): Double

public expect fun ucalGetTzdataVersion(status: MutPtr<UErrorCode>): Pcstr

public expect fun ucalGetTimeZoneDisplayName(cal: ConstPtr<ConstPtr<CVoid>>, type: UCalendarDisplayNameType, locale: Pcstr, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucalGetTimeZoneId(cal: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucalGetTimeZoneIdforWindowsId(winid: ConstPtr<UShort>, len: Int, region: Pcstr, id: MutPtr<UShort>, idcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucalGetTimeZoneTransitionDate(cal: ConstPtr<ConstPtr<CVoid>>, type: UTimeZoneTransitionType, transition: MutPtr<Double>, status: MutPtr<UErrorCode>): Byte

public expect fun ucalGetType(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Pcstr

public expect fun ucalGetWeekendTransition(cal: ConstPtr<ConstPtr<CVoid>>, dayofweek: UCalendarDaysOfWeek, status: MutPtr<UErrorCode>): Int

public expect fun ucalGetWindowsTimeZoneId(id: ConstPtr<UShort>, len: Int, winid: MutPtr<UShort>, winidcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucalInDaylightTime(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Byte

public expect fun ucalIsSet(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields): Byte

public expect fun ucalIsWeekend(cal: ConstPtr<ConstPtr<CVoid>>, date: Double, status: MutPtr<UErrorCode>): Byte

public expect fun ucalOpen(zoneid: ConstPtr<UShort>, len: Int, locale: Pcstr, type: UCalendarType, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun ucalOpenCountryTimeZones(country: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: ConstPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucalOpenTimeZones(ec: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucalRoll(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, amount: Int, status: MutPtr<UErrorCode>)

public expect fun ucalSet(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, value: Int)

public expect fun ucalSetAttribute(cal: MutPtr<MutPtr<CVoid>>, attr: UCalendarAttribute, newvalue: Int)

public expect fun ucalSetDate(cal: MutPtr<MutPtr<CVoid>>, year: Int, month: Int, date: Int, status: MutPtr<UErrorCode>)

public expect fun ucalSetDateTime(cal: MutPtr<MutPtr<CVoid>>, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: MutPtr<UErrorCode>)

public expect fun ucalSetDefaultTimeZone(zoneid: ConstPtr<UShort>, ec: MutPtr<UErrorCode>)

public expect fun ucalSetGregorianChange(cal: MutPtr<MutPtr<CVoid>>, date: Double, perrorcode: MutPtr<UErrorCode>)

public expect fun ucalSetMillis(cal: MutPtr<MutPtr<CVoid>>, datetime: Double, status: MutPtr<UErrorCode>)

public expect fun ucalSetTimeZone(cal: MutPtr<MutPtr<CVoid>>, zoneid: ConstPtr<UShort>, len: Int, status: MutPtr<UErrorCode>)

public expect fun ucasemapClose(csm: MutPtr<UCaseMap>)

public expect fun ucasemapGetBreakIterator(csm: ConstPtr<UCaseMap>): MutPtr<UBreakIterator>

public expect fun ucasemapGetLocale(csm: ConstPtr<UCaseMap>): Pcstr

public expect fun ucasemapGetOptions(csm: ConstPtr<UCaseMap>): UInt

public expect fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UCaseMap>

public expect fun ucasemapSetBreakIterator(csm: MutPtr<UCaseMap>, itertoadopt: MutPtr<UBreakIterator>, perrorcode: MutPtr<UErrorCode>)

public expect fun ucasemapSetLocale(csm: MutPtr<UCaseMap>, locale: Pcstr, perrorcode: MutPtr<UErrorCode>)

public expect fun ucasemapSetOptions(csm: MutPtr<UCaseMap>, options: UInt, perrorcode: MutPtr<UErrorCode>)

public expect fun ucasemapToTitle(csm: MutPtr<UCaseMap>, dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucasemapUtf8FoldCase(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucasemapUtf8ToLower(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucasemapUtf8ToTitle(csm: MutPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucasemapUtf8ToUpper(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucfposClose(ucfpos: MutPtr<UConstrainedFieldPosition>)

public expect fun ucfposConstrainCategory(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, ec: MutPtr<UErrorCode>)

public expect fun ucfposConstrainField(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, field: Int, ec: MutPtr<UErrorCode>)

public expect fun ucfposGetCategory(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Int

public expect fun ucfposGetField(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Int

public expect fun ucfposGetIndexes(ucfpos: ConstPtr<UConstrainedFieldPosition>, pstart: MutPtr<Int>, plimit: MutPtr<Int>, ec: MutPtr<UErrorCode>)

public expect fun ucfposGetInt64IterationContext(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Long

public expect fun ucfposMatchesField(ucfpos: ConstPtr<UConstrainedFieldPosition>, category: Int, field: Int, ec: MutPtr<UErrorCode>): Byte

public expect fun ucfposOpen(ec: MutPtr<UErrorCode>): MutPtr<UConstrainedFieldPosition>

public expect fun ucfposReset(ucfpos: MutPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>)

public expect fun ucfposSetInt64IterationContext(ucfpos: MutPtr<UConstrainedFieldPosition>, context: Long, ec: MutPtr<UErrorCode>)

public expect fun ucfposSetState(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, field: Int, start: Int, limit: Int, ec: MutPtr<UErrorCode>)

public expect fun ucnvCbFromUwriteBytes(args: MutPtr<UConverterFromUnicodeArgs>, source: Pcstr, length: Int, offsetindex: Int, err: MutPtr<UErrorCode>)

public expect fun ucnvCbFromUwriteSub(args: MutPtr<UConverterFromUnicodeArgs>, offsetindex: Int, err: MutPtr<UErrorCode>)

public expect fun ucnvCbFromUwriteUchars(args: MutPtr<UConverterFromUnicodeArgs>, source: ConstPtr<ConstPtr<UShort>>, sourcelimit: ConstPtr<UShort>, offsetindex: Int, err: MutPtr<UErrorCode>)

public expect fun ucnvCbToUwriteSub(args: MutPtr<UConverterToUnicodeArgs>, offsetindex: Int, err: MutPtr<UErrorCode>)

public expect fun ucnvCbToUwriteUchars(args: MutPtr<UConverterToUnicodeArgs>, source: ConstPtr<UShort>, length: Int, offsetindex: Int, err: MutPtr<UErrorCode>)

public expect fun ucnvClose(converter: MutPtr<UConverter>)

public expect fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int

public expect fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucnvConvertEx(targetcnv: MutPtr<UConverter>, sourcecnv: MutPtr<UConverter>, target: MutPtr<MutPtr<Byte>>, targetlimit: Pcstr, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, pivotstart: MutPtr<UShort>, pivotsource: MutPtr<MutPtr<UShort>>, pivottarget: MutPtr<MutPtr<UShort>>, pivotlimit: ConstPtr<UShort>, reset: Byte, flush: Byte, perrorcode: MutPtr<UErrorCode>)

public expect fun ucnvCountAliases(alias: Pcstr, perrorcode: MutPtr<UErrorCode>): UShort

public expect fun ucnvCountAvailable(): Int

public expect fun ucnvCountStandards(): UShort

public expect fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Pcstr

public expect fun ucnvFixFileSeparator(cnv: ConstPtr<UConverter>, source: MutPtr<UShort>, sourcelen: Int)

public expect fun ucnvFlushCache(): Int

public expect fun ucnvFromAlgorithmic(cnv: MutPtr<UConverter>, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucnvFromUchars(cnv: MutPtr<UConverter>, dest: Pcstr, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int
