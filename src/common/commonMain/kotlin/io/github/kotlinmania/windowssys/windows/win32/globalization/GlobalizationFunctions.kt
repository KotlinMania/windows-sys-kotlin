package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.EtoOptions
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public expect fun adjustCalendarDate(lpcaldatetime: MutPtr, calunit: CaldatetimeDateunit, amount: Int): Bool

public expect fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: ConstPtr, cchcount1: Int, lpstring2: ConstPtr, cchcount2: Int): ComparestringResult

public expect fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: ConstPtr, lpreserved: ConstPtr, lparam: Lparam): ComparestringResult

public expect fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult

public expect fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult

public expect fun convertCalDateTimeToSystemTime(lpcaldatetime: ConstPtr, lpsystime: MutPtr): Bool

public expect fun convertDefaultLocale(locale: UInt): UInt

public expect fun convertSystemTimeToCalDateTime(lpsystime: ConstPtr, calid: UInt, lpcaldatetime: MutPtr): Bool

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

public expect fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: ConstPtr): Bool

public expect fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool

public expect fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool

public expect fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool

public expect fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool

public expect fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool

public expect fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool

public expect fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr): Int

public expect fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr, lpversioninformation: ConstPtr, lpreserved: ConstPtr, sorthandle: Lparam): Int

public expect fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int

public expect fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int

public expect fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int

public expect fun getACP(): UInt

public expect fun getCPInfo(codepage: UInt, lpcpinfo: MutPtr): Bool

public expect fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr): Bool

public expect fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr): Bool

public expect fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: ConstPtr, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool

public expect fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: MutPtr): Int

public expect fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr): Int

public expect fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr): Int

public expect fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: MutPtr, lpcalmaxdatetime: MutPtr): Bool

public expect fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr, lpcurrencystr: Pstr, cchcurrency: Int): Int

public expect fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr, lpcurrencystr: Pwstr, cchcurrency: Int): Int

public expect fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr, lpcurrencystr: Pwstr, cchcurrency: Int): Int

public expect fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: ConstPtr, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int

public expect fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: ConstPtr, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int

public expect fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: ConstPtr, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int

public expect fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: MutPtr): Hresult

public expect fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: ConstPtr, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int

public expect fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: ConstPtr, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int

public expect fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: MutPtr, pcbfilemuiinfo: MutPtr): Bool

public expect fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: MutPtr, pwszfilemuipath: Pwstr, pcchfilemuipath: MutPtr, pululenumerator: MutPtr): Bool

public expect fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int

public expect fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int

public expect fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int

public expect fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int

public expect fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int

public expect fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int

public expect fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: MutPtr): Bool

public expect fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: MutPtr): Bool

public expect fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr, lpnumberstr: Pstr, cchnumber: Int): Int

public expect fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr, lpnumberstr: Pwstr, cchnumber: Int): Int

public expect fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr, lpnumberstr: Pwstr, cchnumber: Int): Int

public expect fun getOEMCP(): UInt

public expect fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr): Bool

public expect fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int

public expect fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr): Bool

public expect fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr): Bool

public expect fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr): Bool

public expect fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr): Bool

public expect fun getSystemDefaultLCID(): UInt

public expect fun getSystemDefaultLangID(): UShort

public expect fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int

public expect fun getSystemDefaultUILanguage(): UShort

public expect fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr): Bool

public expect fun getTextCharset(hdc: Hdc): Int

public expect fun getTextCharsetInfo(hdc: Hdc, lpsig: MutPtr, dwflags: UInt): Int

public expect fun getThreadLocale(): UInt

public expect fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr): Bool

public expect fun getThreadUILanguage(): UShort

public expect fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: ConstPtr, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int

public expect fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: ConstPtr, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int

public expect fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: ConstPtr, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int

public expect fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: MutPtr, pattributes: MutPtr): Bool

public expect fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int

public expect fun getUserDefaultLCID(): UInt

public expect fun getUserDefaultLangID(): UShort

public expect fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int

public expect fun getUserDefaultUILanguage(): UShort

public expect fun getUserGeoID(geoclass: Sysgeoclass): Int

public expect fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr): Bool

public expect fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int

public expect fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int

public expect fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int

public expect fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool

public expect fun isDBCSLeadByte(testchar: UByte): Bool

public expect fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool

public expect fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: ConstPtr, lpstring: Pcwstr, cchstr: Int): Bool

public expect fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool

public expect fun isTextUnicode(lpv: ConstPtr, isize: Int, lpiresult: MutPtr): Bool

public expect fun isValidCodePage(codepage: UInt): Bool

public expect fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool

public expect fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool

public expect fun isValidLocaleName(lplocalename: Pcwstr): Bool

public expect fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: ConstPtr): UInt

public expect fun isWellFormedTag(psztag: Pcwstr): UByte

public expect fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int

public expect fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int

public expect fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: ConstPtr, lpreserved: ConstPtr, sorthandle: Lparam): Int

public expect fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int

public expect fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt

public expect fun mappingDoAction(pbag: MutPtr, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult

public expect fun mappingFreePropertyBag(pbag: ConstPtr): Hresult

public expect fun mappingFreeServices(pserviceinfo: ConstPtr): Hresult

public expect fun mappingGetServices(poptions: ConstPtr, prgservices: MutPtr, pdwservicescount: MutPtr): Hresult

public expect fun mappingRecognizeText(pserviceinfo: ConstPtr, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: ConstPtr, pbag: MutPtr): Hresult

public expect fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int

public expect fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int

public expect fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: MutPtr): Bool

public expect fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int

public expect fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages)

public expect fun scriptApplyDigitSubstitution(psds: ConstPtr, psc: MutPtr, pss: MutPtr): Hresult

public expect fun scriptApplyLogicalWidth(pidx: ConstPtr, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr, psva: ConstPtr, piadvance: ConstPtr, psa: ConstPtr, pabc: MutPtr, pijustify: MutPtr): Hresult

public expect fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: ConstPtr, psla: MutPtr): Hresult

public expect fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr, psva: ConstPtr, piadvance: ConstPtr, psa: ConstPtr, pix: MutPtr): Hresult

public expect fun scriptCacheGetHeight(hdc: Hdc, psc: MutPtr, tmheight: MutPtr): Hresult

public expect fun scriptFreeCache(psc: MutPtr): Hresult

public expect fun scriptGetCMap(hdc: Hdc, psc: MutPtr, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: MutPtr): Hresult

public expect fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: MutPtr, pcalternates: MutPtr): Hresult

public expect fun scriptGetFontFeatureTags(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: MutPtr, pctags: MutPtr): Hresult

public expect fun scriptGetFontLanguageTags(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, cmaxtags: Int, plangsystags: MutPtr, pctags: MutPtr): Hresult

public expect fun scriptGetFontProperties(hdc: Hdc, psc: MutPtr, sfp: MutPtr): Hresult

public expect fun scriptGetFontScriptTags(hdc: Hdc, psc: MutPtr, psa: ConstPtr, cmaxtags: Int, pscripttags: MutPtr, pctags: MutPtr): Hresult

public expect fun scriptGetGlyphABCWidth(hdc: Hdc, psc: MutPtr, wglyph: UShort, pabc: MutPtr): Hresult

public expect fun scriptGetLogicalWidths(psa: ConstPtr, cchars: Int, cglyphs: Int, piglyphwidth: ConstPtr, pwlogclust: ConstPtr, psva: ConstPtr, pidx: ConstPtr): Hresult

public expect fun scriptGetProperties(ppsp: MutPtr, pinumscripts: MutPtr): Hresult

public expect fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult

public expect fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr, psstate: ConstPtr, pitems: MutPtr, pcitems: MutPtr): Hresult

public expect fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr, psstate: ConstPtr, pitems: MutPtr, pscripttags: MutPtr, pcitems: MutPtr): Hresult

public expect fun scriptJustify(psva: ConstPtr, piadvance: ConstPtr, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: MutPtr): Hresult

public expect fun scriptLayout(cruns: Int, pblevel: ConstPtr, pivisualtological: MutPtr, pilogicaltovisual: MutPtr): Hresult

public expect fun scriptPlace(hdc: Hdc, psc: MutPtr, pwglyphs: ConstPtr, cglyphs: Int, psva: ConstPtr, psa: MutPtr, piadvance: MutPtr, pgoffset: MutPtr, pabc: MutPtr): Hresult

public expect fun scriptPlaceOpenType(hdc: Hdc, psc: MutPtr, psa: MutPtr, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr, rprangeproperties: ConstPtr, cranges: Int, pwcchars: Pcwstr, pwlogclust: ConstPtr, pcharprops: ConstPtr, cchars: Int, pwglyphs: ConstPtr, pglyphprops: ConstPtr, cglyphs: Int, piadvance: MutPtr, pgoffset: MutPtr, pabc: MutPtr): Hresult

public expect fun scriptPositionSingleGlyph(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: MutPtr, poutgoffset: MutPtr): Hresult

public expect fun scriptRecordDigitSubstitution(locale: UInt, psds: MutPtr): Hresult

public expect fun scriptShape(hdc: Hdc, psc: MutPtr, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: MutPtr, pwoutglyphs: MutPtr, pwlogclust: MutPtr, psva: MutPtr, pcglyphs: MutPtr): Hresult

public expect fun scriptShapeOpenType(hdc: Hdc, psc: MutPtr, psa: MutPtr, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr, rprangeproperties: ConstPtr, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: MutPtr, pcharprops: MutPtr, pwoutglyphs: MutPtr, poutglyphprops: MutPtr, pcglyphs: MutPtr): Hresult

public expect fun scriptStringAnalyse(hdc: Hdc, pstring: ConstPtr, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: ConstPtr, psstate: ConstPtr, pidx: ConstPtr, ptabdef: ConstPtr, pbinclass: ConstPtr, pssa: MutPtr): Hresult

public expect fun scriptStringCPtoX(ssa: ConstPtr, icp: Int, ftrailing: Bool, px: MutPtr): Hresult

public expect fun scriptStringFree(pssa: MutPtr): Hresult

public expect fun scriptStringGetLogicalWidths(ssa: ConstPtr, pidx: MutPtr): Hresult

public expect fun scriptStringGetOrder(ssa: ConstPtr, puorder: MutPtr): Hresult

public expect fun scriptStringOut(ssa: ConstPtr, ix: Int, iy: Int, uoptions: EtoOptions, prc: ConstPtr, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult

public expect fun scriptStringValidate(ssa: ConstPtr): Hresult

public expect fun scriptStringXtoCP(ssa: ConstPtr, ix: Int, pich: MutPtr, pitrailing: MutPtr): Hresult

public expect fun scriptStringPLogAttr(ssa: ConstPtr): MutPtr

public expect fun scriptStringPSize(ssa: ConstPtr): MutPtr

public expect fun scriptStringPcOutChars(ssa: ConstPtr): MutPtr

public expect fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: MutPtr): Hresult

public expect fun scriptTextOut(hdc: Hdc, psc: MutPtr, x: Int, y: Int, fuoptions: UInt, lprc: ConstPtr, psa: ConstPtr, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: ConstPtr, cglyphs: Int, piadvance: ConstPtr, pijustify: ConstPtr, pgoffset: ConstPtr): Hresult

public expect fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr, psva: ConstPtr, piadvance: ConstPtr, psa: ConstPtr, picp: MutPtr, pitrailing: MutPtr): Hresult

public expect fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool

public expect fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool

public expect fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool

public expect fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool

public expect fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr): Bool

public expect fun setThreadLocale(locale: UInt): Bool

public expect fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr): Bool

public expect fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: MutPtr, snapshot: MutPtr): Bool

public expect fun setThreadUILanguage(langid: UShort): UShort

public expect fun setUserGeoID(geoid: Int): Bool

public expect fun setUserGeoName(geoname: Pcwstr): Bool

public expect fun translateCharsetInfo(lpsrc: MutPtr, lpcs: MutPtr, dwflags: TranslateCharsetInfoFlags): Bool

public expect fun ucnvFromUCallbackEscape(context: ConstPtr, fromuargs: MutPtr, codeunits: ConstPtr, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr)

public expect fun ucnvFromUCallbackSkip(context: ConstPtr, fromuargs: MutPtr, codeunits: ConstPtr, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr)

public expect fun ucnvFromUCallbackStop(context: ConstPtr, fromuargs: MutPtr, codeunits: ConstPtr, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr)

public expect fun ucnvFromUCallbackSubstitute(context: ConstPtr, fromuargs: MutPtr, codeunits: ConstPtr, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr)

public expect fun ucnvToUCallbackEscape(context: ConstPtr, touargs: MutPtr, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr)

public expect fun ucnvToUCallbackSkip(context: ConstPtr, touargs: MutPtr, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr)

public expect fun ucnvToUCallbackStop(context: ConstPtr, touargs: MutPtr, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr)

public expect fun ucnvToUCallbackSubstitute(context: ConstPtr, touargs: MutPtr, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr)

public expect fun updateCalendarDayOfWeek(lpcaldatetime: MutPtr): Bool

public expect fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool

public expect fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: MutPtr): Int

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

public expect fun uUcharsToChars(us: ConstPtr, cs: Pcstr, length: Int)

public expect fun uAustrcpy(dst: Pcstr, src: ConstPtr): Pstr

public expect fun uAustrncpy(dst: Pcstr, src: ConstPtr, n: Int): Pstr

public expect fun uCatclose(catd: MutPtr)

public expect fun uCatgets(catd: MutPtr, setNum: Int, msgNum: Int, s: ConstPtr, len: MutPtr, ec: MutPtr): MutPtr

public expect fun uCatopen(name: Pcstr, locale: Pcstr, ec: MutPtr): MutPtr

public expect fun uCharAge(c: Int, versionarray: MutPtr)

public expect fun uCharDigitValue(c: Int): Int

public expect fun uCharDirection(c: Int): UCharDirection

public expect fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: MutPtr): Int

public expect fun uCharMirror(c: Int): Int

public expect fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: MutPtr): Int

public expect fun uCharType(c: Int): Byte

public expect fun uCharsToUchars(cs: Pcstr, us: MutPtr, length: Int)

public expect fun uCleanup()

public expect fun uCountChar32(s: ConstPtr, length: Int): Int

public expect fun uDigit(ch: Int, radix: Byte): Int

public expect fun uEnumCharNames(start: Int, limit: Int, fn: MutPtr, context: MutPtr, namechoice: UCharNameChoice, perrorcode: MutPtr)

public expect fun uEnumCharTypes(enumrange: MutPtr, context: ConstPtr)

public expect fun uErrorName(code: UErrorCode): Pcstr

public expect fun uFoldCase(c: Int, options: UInt): Int

public expect fun uForDigit(digit: Int, radix: Byte): Int

public expect fun uFormatMessage(locale: Pcstr, pattern: ConstPtr, patternlength: Int, result: MutPtr, resultlength: Int, status: MutPtr, vararg variadicArgs: Long): Int

public expect fun uFormatMessageWithError(locale: Pcstr, pattern: ConstPtr, patternlength: Int, result: MutPtr, resultlength: Int, parseerror: MutPtr, status: MutPtr, vararg variadicArgs: Long): Int

public expect fun uGetBidiPairedBracket(c: Int): Int

public expect fun uGetBinaryPropertySet(property: UProperty, perrorcode: MutPtr): MutPtr

public expect fun uGetCombiningClass(c: Int): UByte

public expect fun uGetDataVersion(dataversionfillin: MutPtr, status: MutPtr)

public expect fun uGetFcNfkcClosure(c: Int, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int

public expect fun uGetIntPropertyMap(property: UProperty, perrorcode: MutPtr): MutPtr

public expect fun uGetIntPropertyMaxValue(which: UProperty): Int

public expect fun uGetIntPropertyMinValue(which: UProperty): Int

public expect fun uGetIntPropertyValue(c: Int, which: UProperty): Int

public expect fun uGetNumericValue(c: Int): Double

public expect fun uGetPropertyEnum(alias: Pcstr): UProperty

public expect fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr

public expect fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int

public expect fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr

public expect fun uGetUnicodeVersion(versionarray: MutPtr)

public expect fun uGetVersion(versionarray: MutPtr)

public expect fun uHasBinaryProperty(c: Int, which: UProperty): Byte

public expect fun uInit(status: MutPtr)

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

public expect fun uMemcasecmp(s1: ConstPtr, s2: ConstPtr, length: Int, options: UInt): Int

public expect fun uMemchr(s: ConstPtr, c: UShort, count: Int): MutPtr

public expect fun uMemchr32(s: ConstPtr, c: Int, count: Int): MutPtr

public expect fun uMemcmp(buf1: ConstPtr, buf2: ConstPtr, count: Int): Int

public expect fun uMemcmpCodePointOrder(s1: ConstPtr, s2: ConstPtr, count: Int): Int

public expect fun uMemcpy(dest: MutPtr, src: ConstPtr, count: Int): MutPtr

public expect fun uMemmove(dest: MutPtr, src: ConstPtr, count: Int): MutPtr

public expect fun uMemrchr(s: ConstPtr, c: UShort, count: Int): MutPtr

public expect fun uMemrchr32(s: ConstPtr, c: Int, count: Int): MutPtr

public expect fun uMemset(dest: MutPtr, c: UShort, count: Int): MutPtr

public expect fun uParseMessage(locale: Pcstr, pattern: ConstPtr, patternlength: Int, source: ConstPtr, sourcelength: Int, status: MutPtr, vararg variadicArgs: Long)

public expect fun uParseMessageWithError(locale: Pcstr, pattern: ConstPtr, patternlength: Int, source: ConstPtr, sourcelength: Int, parseerror: MutPtr, status: MutPtr, vararg variadicArgs: Long)

public expect fun uSetMemoryFunctions(context: ConstPtr, a: MutPtr, r: MutPtr, f: MutPtr, status: MutPtr)

public expect fun uShapeArabic(source: ConstPtr, sourcelength: Int, dest: MutPtr, destsize: Int, options: UInt, perrorcode: MutPtr): Int

public expect fun uStrCaseCompare(s1: ConstPtr, length1: Int, s2: ConstPtr, length2: Int, options: UInt, perrorcode: MutPtr): Int

public expect fun uStrCompare(s1: ConstPtr, length1: Int, s2: ConstPtr, length2: Int, codepointorder: Byte): Int

public expect fun uStrCompareIter(iter1: MutPtr, iter2: MutPtr, codepointorder: Byte): Int

public expect fun uStrFindFirst(s: ConstPtr, length: Int, substring: ConstPtr, sublength: Int): MutPtr

public expect fun uStrFindLast(s: ConstPtr, length: Int, substring: ConstPtr, sublength: Int): MutPtr

public expect fun uStrFoldCase(dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, options: UInt, perrorcode: MutPtr): Int

public expect fun uStrFromJavaModifiedUtf8WithSub(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): MutPtr

public expect fun uStrFromUtf32(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): MutPtr

public expect fun uStrFromUtf32WithSub(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): MutPtr

public expect fun uStrFromUtf8(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcstr, srclength: Int, perrorcode: MutPtr): MutPtr

public expect fun uStrFromUtf8Lenient(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcstr, srclength: Int, perrorcode: MutPtr): MutPtr

public expect fun uStrFromUtf8WithSub(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): MutPtr

public expect fun uStrFromWcs(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcwstr, srclength: Int, perrorcode: MutPtr): MutPtr

public expect fun uStrHasMoreChar32Than(s: ConstPtr, length: Int, number: Int): Byte

public expect fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Pstr

public expect fun uStrToLower(dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, locale: Pcstr, perrorcode: MutPtr): Int

public expect fun uStrToTitle(dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, titleiter: MutPtr, locale: Pcstr, perrorcode: MutPtr): Int

public expect fun uStrToUtf32(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): MutPtr

public expect fun uStrToUtf32WithSub(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): MutPtr

public expect fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Pstr

public expect fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): Pstr

public expect fun uStrToUpper(dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, locale: Pcstr, perrorcode: MutPtr): Int

public expect fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Pwstr

public expect fun uStrcasecmp(s1: ConstPtr, s2: ConstPtr, options: UInt): Int

public expect fun uStrcat(dst: MutPtr, src: ConstPtr): MutPtr

public expect fun uStrchr(s: ConstPtr, c: UShort): MutPtr

public expect fun uStrchr32(s: ConstPtr, c: Int): MutPtr

public expect fun uStrcmp(s1: ConstPtr, s2: ConstPtr): Int

public expect fun uStrcmpCodePointOrder(s1: ConstPtr, s2: ConstPtr): Int

public expect fun uStrcpy(dst: MutPtr, src: ConstPtr): MutPtr

public expect fun uStrcspn(string: ConstPtr, matchset: ConstPtr): Int

public expect fun uStrlen(s: ConstPtr): Int

public expect fun uStrncasecmp(s1: ConstPtr, s2: ConstPtr, n: Int, options: UInt): Int

public expect fun uStrncat(dst: MutPtr, src: ConstPtr, n: Int): MutPtr

public expect fun uStrncmp(ucs1: ConstPtr, ucs2: ConstPtr, n: Int): Int

public expect fun uStrncmpCodePointOrder(s1: ConstPtr, s2: ConstPtr, n: Int): Int

public expect fun uStrncpy(dst: MutPtr, src: ConstPtr, n: Int): MutPtr

public expect fun uStrpbrk(string: ConstPtr, matchset: ConstPtr): MutPtr

public expect fun uStrrchr(s: ConstPtr, c: UShort): MutPtr

public expect fun uStrrchr32(s: ConstPtr, c: Int): MutPtr

public expect fun uStrrstr(s: ConstPtr, substring: ConstPtr): MutPtr

public expect fun uStrspn(string: ConstPtr, matchset: ConstPtr): Int

public expect fun uStrstr(s: ConstPtr, substring: ConstPtr): MutPtr

public expect fun uStrtokR(src: MutPtr, delim: ConstPtr, savestate: MutPtr): MutPtr

public expect fun uTolower(c: Int): Int

public expect fun uTotitle(c: Int): Int

public expect fun uToupper(c: Int): Int

public expect fun uUastrcpy(dst: MutPtr, src: Pcstr): MutPtr

public expect fun uUastrncpy(dst: MutPtr, src: Pcstr, n: Int): MutPtr

public expect fun uUnescape(src: Pcstr, dest: MutPtr, destcapacity: Int): Int

public expect fun uUnescapeAt(charat: UnescapeCharAt, offset: MutPtr, length: Int, context: MutPtr): Int

public expect fun uVersionFromString(versionarray: MutPtr, versionstring: Pcstr)

public expect fun uVersionFromUstring(versionarray: MutPtr, versionstring: ConstPtr)

public expect fun uVersionToString(versionarray: ConstPtr, versionstring: Pcstr)

public expect fun uVformatMessage(locale: Pcstr, pattern: ConstPtr, patternlength: Int, result: MutPtr, resultlength: Int, ap: MutPtr, status: MutPtr): Int

public expect fun uVformatMessageWithError(locale: Pcstr, pattern: ConstPtr, patternlength: Int, result: MutPtr, resultlength: Int, parseerror: MutPtr, ap: MutPtr, status: MutPtr): Int

public expect fun uVparseMessage(locale: Pcstr, pattern: ConstPtr, patternlength: Int, source: ConstPtr, sourcelength: Int, ap: MutPtr, status: MutPtr)

public expect fun uVparseMessageWithError(locale: Pcstr, pattern: ConstPtr, patternlength: Int, source: ConstPtr, sourcelength: Int, ap: MutPtr, parseerror: MutPtr, status: MutPtr)

public expect fun ubidiClose(pbidi: MutPtr)

public expect fun ubidiCountParagraphs(pbidi: MutPtr): Int

public expect fun ubidiCountRuns(pbidi: MutPtr, perrorcode: MutPtr): Int

public expect fun ubidiGetBaseDirection(text: ConstPtr, length: Int): UBiDiDirection

public expect fun ubidiGetClassCallback(pbidi: MutPtr, fn: MutPtr, context: ConstPtr)

public expect fun ubidiGetCustomizedClass(pbidi: MutPtr, c: Int): UCharDirection

public expect fun ubidiGetDirection(pbidi: ConstPtr): UBiDiDirection

public expect fun ubidiGetLength(pbidi: ConstPtr): Int

public expect fun ubidiGetLevelAt(pbidi: ConstPtr, charindex: Int): UByte

public expect fun ubidiGetLevels(pbidi: MutPtr, perrorcode: MutPtr): MutPtr

public expect fun ubidiGetLogicalIndex(pbidi: MutPtr, visualindex: Int, perrorcode: MutPtr): Int

public expect fun ubidiGetLogicalMap(pbidi: MutPtr, indexmap: MutPtr, perrorcode: MutPtr)

public expect fun ubidiGetLogicalRun(pbidi: ConstPtr, logicalposition: Int, plogicallimit: MutPtr, plevel: MutPtr)

public expect fun ubidiGetParaLevel(pbidi: ConstPtr): UByte

public expect fun ubidiGetParagraph(pbidi: ConstPtr, charindex: Int, pparastart: MutPtr, pparalimit: MutPtr, pparalevel: MutPtr, perrorcode: MutPtr): Int

public expect fun ubidiGetParagraphByIndex(pbidi: ConstPtr, paraindex: Int, pparastart: MutPtr, pparalimit: MutPtr, pparalevel: MutPtr, perrorcode: MutPtr)

public expect fun ubidiGetProcessedLength(pbidi: ConstPtr): Int

public expect fun ubidiGetReorderingMode(pbidi: MutPtr): UBiDiReorderingMode

public expect fun ubidiGetReorderingOptions(pbidi: MutPtr): UInt

public expect fun ubidiGetResultLength(pbidi: ConstPtr): Int

public expect fun ubidiGetText(pbidi: ConstPtr): MutPtr

public expect fun ubidiGetVisualIndex(pbidi: MutPtr, logicalindex: Int, perrorcode: MutPtr): Int

public expect fun ubidiGetVisualMap(pbidi: MutPtr, indexmap: MutPtr, perrorcode: MutPtr)

public expect fun ubidiGetVisualRun(pbidi: MutPtr, runindex: Int, plogicalstart: MutPtr, plength: MutPtr): UBiDiDirection

public expect fun ubidiInvertMap(srcmap: ConstPtr, destmap: MutPtr, length: Int)

public expect fun ubidiIsInverse(pbidi: MutPtr): Byte

public expect fun ubidiIsOrderParagraphsLtr(pbidi: MutPtr): Byte

public expect fun ubidiOpen(): MutPtr

public expect fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: MutPtr): MutPtr

public expect fun ubidiOrderParagraphsLtr(pbidi: MutPtr, orderparagraphsltr: Byte)

public expect fun ubidiReorderLogical(levels: ConstPtr, length: Int, indexmap: MutPtr)

public expect fun ubidiReorderVisual(levels: ConstPtr, length: Int, indexmap: MutPtr)

public expect fun ubidiSetClassCallback(pbidi: MutPtr, newfn: UBiDiClassCallback, newcontext: ConstPtr, oldfn: MutPtr, oldcontext: ConstPtr, perrorcode: MutPtr)

public expect fun ubidiSetContext(pbidi: MutPtr, prologue: ConstPtr, prolength: Int, epilogue: ConstPtr, epilength: Int, perrorcode: MutPtr)

public expect fun ubidiSetInverse(pbidi: MutPtr, isinverse: Byte)

public expect fun ubidiSetLine(pparabidi: ConstPtr, start: Int, limit: Int, plinebidi: MutPtr, perrorcode: MutPtr)

public expect fun ubidiSetPara(pbidi: MutPtr, text: ConstPtr, length: Int, paralevel: UByte, embeddinglevels: MutPtr, perrorcode: MutPtr)

public expect fun ubidiSetReorderingMode(pbidi: MutPtr, reorderingmode: UBiDiReorderingMode)

public expect fun ubidiSetReorderingOptions(pbidi: MutPtr, reorderingoptions: UInt)

public expect fun ubidiWriteReordered(pbidi: MutPtr, dest: MutPtr, destsize: Int, options: UShort, perrorcode: MutPtr): Int

public expect fun ubidiWriteReverse(src: ConstPtr, srclength: Int, dest: MutPtr, destsize: Int, options: UShort, perrorcode: MutPtr): Int

public expect fun ubiditransformClose(pbiditransform: MutPtr)

public expect fun ubiditransformOpen(perrorcode: MutPtr): MutPtr

public expect fun ubiditransformTransform(pbiditransform: MutPtr, src: ConstPtr, srclength: Int, dest: MutPtr, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: MutPtr): UInt

public expect fun ublockGetCode(c: Int): UBlockCode

public expect fun ubrkClose(bi: MutPtr)

public expect fun ubrkCountAvailable(): Int

public expect fun ubrkCurrent(bi: ConstPtr): Int

public expect fun ubrkFirst(bi: MutPtr): Int

public expect fun ubrkFollowing(bi: MutPtr, offset: Int): Int

public expect fun ubrkGetAvailable(index: Int): Pcstr

public expect fun ubrkGetBinaryRules(bi: MutPtr, binaryrules: MutPtr, rulescapacity: Int, status: MutPtr): Int

public expect fun ubrkGetLocaleByType(bi: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr

public expect fun ubrkGetRuleStatus(bi: MutPtr): Int

public expect fun ubrkGetRuleStatusVec(bi: MutPtr, fillinvec: MutPtr, capacity: Int, status: MutPtr): Int

public expect fun ubrkIsBoundary(bi: MutPtr, offset: Int): Byte

public expect fun ubrkLast(bi: MutPtr): Int

public expect fun ubrkNext(bi: MutPtr): Int

public expect fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: ConstPtr, textlength: Int, status: MutPtr): MutPtr

public expect fun ubrkOpenBinaryRules(binaryrules: ConstPtr, ruleslength: Int, text: ConstPtr, textlength: Int, status: MutPtr): MutPtr

public expect fun ubrkOpenRules(rules: ConstPtr, ruleslength: Int, text: ConstPtr, textlength: Int, parseerr: MutPtr, status: MutPtr): MutPtr

public expect fun ubrkPreceding(bi: MutPtr, offset: Int): Int

public expect fun ubrkPrevious(bi: MutPtr): Int

public expect fun ubrkRefreshUtext(bi: MutPtr, text: MutPtr, status: MutPtr)

public expect fun ubrkSafeClone(bi: ConstPtr, stackbuffer: MutPtr, pbuffersize: MutPtr, status: MutPtr): MutPtr

public expect fun ubrkSetText(bi: MutPtr, text: ConstPtr, textlength: Int, status: MutPtr)

public expect fun ubrkSetUtext(bi: MutPtr, text: MutPtr, status: MutPtr)

public expect fun ucalAdd(cal: MutPtr, field: UCalendarDateFields, amount: Int, status: MutPtr)

public expect fun ucalClear(calendar: MutPtr)

public expect fun ucalClearField(cal: MutPtr, field: UCalendarDateFields)

public expect fun ucalClone(cal: ConstPtr, status: MutPtr): MutPtr

public expect fun ucalClose(cal: MutPtr)

public expect fun ucalCountAvailable(): Int

public expect fun ucalEquivalentTo(cal1: ConstPtr, cal2: ConstPtr): Byte

public expect fun ucalGet(cal: ConstPtr, field: UCalendarDateFields, status: MutPtr): Int

public expect fun ucalGetAttribute(cal: ConstPtr, attr: UCalendarAttribute): Int

public expect fun ucalGetAvailable(localeindex: Int): Pcstr

public expect fun ucalGetCanonicalTimeZoneId(id: ConstPtr, len: Int, result: MutPtr, resultcapacity: Int, issystemid: MutPtr, status: MutPtr): Int

public expect fun ucalGetDstsavings(zoneid: ConstPtr, ec: MutPtr): Int

public expect fun ucalGetDayOfWeekType(cal: ConstPtr, dayofweek: UCalendarDaysOfWeek, status: MutPtr): UCalendarWeekdayType

public expect fun ucalGetDefaultTimeZone(result: MutPtr, resultcapacity: Int, ec: MutPtr): Int

public expect fun ucalGetFieldDifference(cal: MutPtr, target: Double, field: UCalendarDateFields, status: MutPtr): Int

public expect fun ucalGetGregorianChange(cal: ConstPtr, perrorcode: MutPtr): Double

public expect fun ucalGetHostTimeZone(result: MutPtr, resultcapacity: Int, ec: MutPtr): Int

public expect fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr): MutPtr

public expect fun ucalGetLimit(cal: ConstPtr, field: UCalendarDateFields, type: UCalendarLimitType, status: MutPtr): Int

public expect fun ucalGetLocaleByType(cal: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr

public expect fun ucalGetMillis(cal: ConstPtr, status: MutPtr): Double

public expect fun ucalGetNow(): Double

public expect fun ucalGetTzdataVersion(status: MutPtr): Pcstr

public expect fun ucalGetTimeZoneDisplayName(cal: ConstPtr, type: UCalendarDisplayNameType, locale: Pcstr, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun ucalGetTimeZoneId(cal: ConstPtr, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun ucalGetTimeZoneIdforWindowsId(winid: ConstPtr, len: Int, region: Pcstr, id: MutPtr, idcapacity: Int, status: MutPtr): Int

public expect fun ucalGetTimeZoneTransitionDate(cal: ConstPtr, type: UTimeZoneTransitionType, transition: MutPtr, status: MutPtr): Byte

public expect fun ucalGetType(cal: ConstPtr, status: MutPtr): Pcstr

public expect fun ucalGetWeekendTransition(cal: ConstPtr, dayofweek: UCalendarDaysOfWeek, status: MutPtr): Int

public expect fun ucalGetWindowsTimeZoneId(id: ConstPtr, len: Int, winid: MutPtr, winidcapacity: Int, status: MutPtr): Int

public expect fun ucalInDaylightTime(cal: ConstPtr, status: MutPtr): Byte

public expect fun ucalIsSet(cal: ConstPtr, field: UCalendarDateFields): Byte

public expect fun ucalIsWeekend(cal: ConstPtr, date: Double, status: MutPtr): Byte

public expect fun ucalOpen(zoneid: ConstPtr, len: Int, locale: Pcstr, type: UCalendarType, status: MutPtr): MutPtr

public expect fun ucalOpenCountryTimeZones(country: Pcstr, ec: MutPtr): MutPtr

public expect fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: ConstPtr, ec: MutPtr): MutPtr

public expect fun ucalOpenTimeZones(ec: MutPtr): MutPtr

public expect fun ucalRoll(cal: MutPtr, field: UCalendarDateFields, amount: Int, status: MutPtr)

public expect fun ucalSet(cal: MutPtr, field: UCalendarDateFields, value: Int)

public expect fun ucalSetAttribute(cal: MutPtr, attr: UCalendarAttribute, newvalue: Int)

public expect fun ucalSetDate(cal: MutPtr, year: Int, month: Int, date: Int, status: MutPtr)

public expect fun ucalSetDateTime(cal: MutPtr, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: MutPtr)

public expect fun ucalSetDefaultTimeZone(zoneid: ConstPtr, ec: MutPtr)

public expect fun ucalSetGregorianChange(cal: MutPtr, date: Double, perrorcode: MutPtr)

public expect fun ucalSetMillis(cal: MutPtr, datetime: Double, status: MutPtr)

public expect fun ucalSetTimeZone(cal: MutPtr, zoneid: ConstPtr, len: Int, status: MutPtr)

public expect fun ucasemapClose(csm: MutPtr)

public expect fun ucasemapGetBreakIterator(csm: ConstPtr): MutPtr

public expect fun ucasemapGetLocale(csm: ConstPtr): Pcstr

public expect fun ucasemapGetOptions(csm: ConstPtr): UInt

public expect fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: MutPtr): MutPtr

public expect fun ucasemapSetBreakIterator(csm: MutPtr, itertoadopt: MutPtr, perrorcode: MutPtr)

public expect fun ucasemapSetLocale(csm: MutPtr, locale: Pcstr, perrorcode: MutPtr)

public expect fun ucasemapSetOptions(csm: MutPtr, options: UInt, perrorcode: MutPtr)

public expect fun ucasemapToTitle(csm: MutPtr, dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Int

public expect fun ucasemapUtf8FoldCase(csm: ConstPtr, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int

public expect fun ucasemapUtf8ToLower(csm: ConstPtr, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int

public expect fun ucasemapUtf8ToTitle(csm: MutPtr, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int

public expect fun ucasemapUtf8ToUpper(csm: ConstPtr, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int

public expect fun ucfposClose(ucfpos: MutPtr)

public expect fun ucfposConstrainCategory(ucfpos: MutPtr, category: Int, ec: MutPtr)

public expect fun ucfposConstrainField(ucfpos: MutPtr, category: Int, field: Int, ec: MutPtr)

public expect fun ucfposGetCategory(ucfpos: ConstPtr, ec: MutPtr): Int

public expect fun ucfposGetField(ucfpos: ConstPtr, ec: MutPtr): Int

public expect fun ucfposGetIndexes(ucfpos: ConstPtr, pstart: MutPtr, plimit: MutPtr, ec: MutPtr)

public expect fun ucfposGetInt64IterationContext(ucfpos: ConstPtr, ec: MutPtr): Long

public expect fun ucfposMatchesField(ucfpos: ConstPtr, category: Int, field: Int, ec: MutPtr): Byte

public expect fun ucfposOpen(ec: MutPtr): MutPtr

public expect fun ucfposReset(ucfpos: MutPtr, ec: MutPtr)

public expect fun ucfposSetInt64IterationContext(ucfpos: MutPtr, context: Long, ec: MutPtr)

public expect fun ucfposSetState(ucfpos: MutPtr, category: Int, field: Int, start: Int, limit: Int, ec: MutPtr)

public expect fun ucnvCbFromUwriteBytes(args: MutPtr, source: Pcstr, length: Int, offsetindex: Int, err: MutPtr)

public expect fun ucnvCbFromUwriteSub(args: MutPtr, offsetindex: Int, err: MutPtr)

public expect fun ucnvCbFromUwriteUchars(args: MutPtr, source: ConstPtr, sourcelimit: ConstPtr, offsetindex: Int, err: MutPtr)

public expect fun ucnvCbToUwriteSub(args: MutPtr, offsetindex: Int, err: MutPtr)

public expect fun ucnvCbToUwriteUchars(args: MutPtr, source: ConstPtr, length: Int, offsetindex: Int, err: MutPtr)

public expect fun ucnvClose(converter: MutPtr)

public expect fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int

public expect fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr): Int

public expect fun ucnvConvertEx(targetcnv: MutPtr, sourcecnv: MutPtr, target: MutPtr, targetlimit: Pcstr, source: ConstPtr, sourcelimit: Pcstr, pivotstart: MutPtr, pivotsource: MutPtr, pivottarget: MutPtr, pivotlimit: ConstPtr, reset: Byte, flush: Byte, perrorcode: MutPtr)

public expect fun ucnvCountAliases(alias: Pcstr, perrorcode: MutPtr): UShort

public expect fun ucnvCountAvailable(): Int

public expect fun ucnvCountStandards(): UShort

public expect fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: MutPtr, perrorcode: MutPtr): Pcstr

public expect fun ucnvFixFileSeparator(cnv: ConstPtr, source: MutPtr, sourcelen: Int)

public expect fun ucnvFlushCache(): Int

public expect fun ucnvFromAlgorithmic(cnv: MutPtr, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr): Int

public expect fun ucnvFromUchars(cnv: MutPtr, dest: Pcstr, destcapacity: Int, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Int
