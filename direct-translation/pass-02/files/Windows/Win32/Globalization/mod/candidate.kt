// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AdjustCalendarDate(lpcaldatetime : *mut CALDATETIME, calunit : CALDATETIME_DATEUNIT, amount : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CompareStringA(locale : u32, dwcmpflags : u32, lpstring1 : *const i8, cchcount1 : i32, lpstring2 : *const i8, cchcount2 : i32) -> COMPARESTRING_RESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CompareStringEx(lplocalename : windows_sys::core::PCWSTR, dwcmpflags : COMPARE_STRING_FLAGS, lpstring1 : windows_sys::core::PCWSTR, cchcount1 : i32, lpstring2 : windows_sys::core::PCWSTR, cchcount2 : i32, lpversioninformation : *const NLSVERSIONINFO, lpreserved : *const core::ffi::c_void, lparam : super::Foundation:: LPARAM) -> COMPARESTRING_RESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CompareStringOrdinal(lpstring1 : windows_sys::core::PCWSTR, cchcount1 : i32, lpstring2 : windows_sys::core::PCWSTR, cchcount2 : i32, bignorecase : windows_sys::core::BOOL) -> COMPARESTRING_RESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CompareStringW(locale : u32, dwcmpflags : u32, lpstring1 : windows_sys::core::PCWSTR, cchcount1 : i32, lpstring2 : windows_sys::core::PCWSTR, cchcount2 : i32) -> COMPARESTRING_RESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ConvertCalDateTimeToSystemTime(lpcaldatetime : *const CALDATETIME, lpsystime : *mut super::Foundation:: SYSTEMTIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ConvertDefaultLocale(locale : u32) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ConvertSystemTimeToCalDateTime(lpsystime : *const super::Foundation:: SYSTEMTIME, calid : u32, lpcaldatetime : *mut CALDATETIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumCalendarInfoA(lpcalinfoenumproc : CALINFO_ENUMPROCA, locale : u32, calendar : u32, caltype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumCalendarInfoExA(lpcalinfoenumprocex : CALINFO_ENUMPROCEXA, locale : u32, calendar : u32, caltype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumCalendarInfoExEx(pcalinfoenumprocexex : CALINFO_ENUMPROCEXEX, lplocalename : windows_sys::core::PCWSTR, calendar : u32, lpreserved : windows_sys::core::PCWSTR, caltype : u32, lparam : super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumCalendarInfoExW(lpcalinfoenumprocex : CALINFO_ENUMPROCEXW, locale : u32, calendar : u32, caltype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumCalendarInfoW(lpcalinfoenumproc : CALINFO_ENUMPROCW, locale : u32, calendar : u32, caltype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumDateFormatsA(lpdatefmtenumproc : DATEFMT_ENUMPROCA, locale : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumDateFormatsExA(lpdatefmtenumprocex : DATEFMT_ENUMPROCEXA, locale : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumDateFormatsExEx(lpdatefmtenumprocexex : DATEFMT_ENUMPROCEXEX, lplocalename : windows_sys::core::PCWSTR, dwflags : ENUM_DATE_FORMATS_FLAGS, lparam : super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumDateFormatsExW(lpdatefmtenumprocex : DATEFMT_ENUMPROCEXW, locale : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumDateFormatsW(lpdatefmtenumproc : DATEFMT_ENUMPROCW, locale : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc : LANGGROUPLOCALE_ENUMPROCA, languagegroup : u32, dwflags : u32, lparam : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc : LANGGROUPLOCALE_ENUMPROCW, languagegroup : u32, dwflags : u32, lparam : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemCodePagesA(lpcodepageenumproc : CODEPAGE_ENUMPROCA, dwflags : ENUM_SYSTEM_CODE_PAGES_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemCodePagesW(lpcodepageenumproc : CODEPAGE_ENUMPROCW, dwflags : ENUM_SYSTEM_CODE_PAGES_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemGeoID(geoclass : u32, parentgeoid : i32, lpgeoenumproc : GEO_ENUMPROC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemGeoNames(geoclass : u32, geoenumproc : GEO_ENUMNAMEPROC, data : super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemLanguageGroupsA(lplanguagegroupenumproc : LANGUAGEGROUP_ENUMPROCA, dwflags : ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemLanguageGroupsW(lplanguagegroupenumproc : LANGUAGEGROUP_ENUMPROCW, dwflags : ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemLocalesA(lplocaleenumproc : LOCALE_ENUMPROCA, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemLocalesEx(lplocaleenumprocex : LOCALE_ENUMPROCEX, dwflags : u32, lparam : super::Foundation:: LPARAM, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemLocalesW(lplocaleenumproc : LOCALE_ENUMPROCW, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumTimeFormatsA(lptimefmtenumproc : TIMEFMT_ENUMPROCA, locale : u32, dwflags : TIME_FORMAT_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumTimeFormatsEx(lptimefmtenumprocex : TIMEFMT_ENUMPROCEX, lplocalename : windows_sys::core::PCWSTR, dwflags : u32, lparam : super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumTimeFormatsW(lptimefmtenumproc : TIMEFMT_ENUMPROCW, locale : u32, dwflags : TIME_FORMAT_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumUILanguagesA(lpuilanguageenumproc : UILANGUAGE_ENUMPROCA, dwflags : u32, lparam : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumUILanguagesW(lpuilanguageenumproc : UILANGUAGE_ENUMPROCW, dwflags : u32, lparam : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FindNLSString(locale : u32, dwfindnlsstringflags : u32, lpstringsource : windows_sys::core::PCWSTR, cchsource : i32, lpstringvalue : windows_sys::core::PCWSTR, cchvalue : i32, pcchfound : *mut i32) -> i32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FindNLSStringEx(lplocalename : windows_sys::core::PCWSTR, dwfindnlsstringflags : u32, lpstringsource : windows_sys::core::PCWSTR, cchsource : i32, lpstringvalue : windows_sys::core::PCWSTR, cchvalue : i32, pcchfound : *mut i32, lpversioninformation : *const NLSVERSIONINFO, lpreserved : *const core::ffi::c_void, sorthandle : super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FindStringOrdinal(dwfindstringordinalflags : u32, lpstringsource : windows_sys::core::PCWSTR, cchsource : i32, lpstringvalue : windows_sys::core::PCWSTR, cchvalue : i32, bignorecase : windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FoldStringA(dwmapflags : FOLD_STRING_MAP_FLAGS, lpsrcstr : windows_sys::core::PCSTR, cchsrc : i32, lpdeststr : windows_sys::core::PSTR, cchdest : i32) -> i32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FoldStringW(dwmapflags : FOLD_STRING_MAP_FLAGS, lpsrcstr : windows_sys::core::PCWSTR, cchsrc : i32, lpdeststr : windows_sys::core::PWSTR, cchdest : i32) -> i32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetACP() -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCPInfo(codepage : u32, lpcpinfo : *mut CPINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCPInfoExA(codepage : u32, dwflags : u32, lpcpinfoex : *mut CPINFOEXA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCPInfoExW(codepage : u32, dwflags : u32, lpcpinfoex : *mut CPINFOEXW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCalendarDateFormatEx(lpszlocale : windows_sys::core::PCWSTR, dwflags : u32, lpcaldatetime : *const CALDATETIME, lpformat : windows_sys::core::PCWSTR, lpdatestr : windows_sys::core::PWSTR, cchdate : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCalendarInfoA(locale : u32, calendar : u32, caltype : u32, lpcaldata : windows_sys::core::PSTR, cchdata : i32, lpvalue : *mut u32) -> i32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCalendarInfoEx(lplocalename : windows_sys::core::PCWSTR, calendar : u32, lpreserved : windows_sys::core::PCWSTR, caltype : u32, lpcaldata : windows_sys::core::PWSTR, cchdata : i32, lpvalue : *mut u32) -> i32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCalendarInfoW(locale : u32, calendar : u32, caltype : u32, lpcaldata : windows_sys::core::PWSTR, cchdata : i32, lpvalue : *mut u32) -> i32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCalendarSupportedDateRange(calendar : u32, lpcalmindatetime : *mut CALDATETIME, lpcalmaxdatetime : *mut CALDATETIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrencyFormatA(locale : u32, dwflags : u32, lpvalue : windows_sys::core::PCSTR, lpformat : *const CURRENCYFMTA, lpcurrencystr : windows_sys::core::PSTR, cchcurrency : i32) -> i32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrencyFormatEx(lplocalename : windows_sys::core::PCWSTR, dwflags : u32, lpvalue : windows_sys::core::PCWSTR, lpformat : *const CURRENCYFMTW, lpcurrencystr : windows_sys::core::PWSTR, cchcurrency : i32) -> i32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrencyFormatW(locale : u32, dwflags : u32, lpvalue : windows_sys::core::PCWSTR, lpformat : *const CURRENCYFMTW, lpcurrencystr : windows_sys::core::PWSTR, cchcurrency : i32) -> i32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetDateFormatA(locale : u32, dwflags : u32, lpdate : *const super::Foundation:: SYSTEMTIME, lpformat : windows_sys::core::PCSTR, lpdatestr : windows_sys::core::PSTR, cchdate : i32) -> i32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetDateFormatEx(lplocalename : windows_sys::core::PCWSTR, dwflags : ENUM_DATE_FORMATS_FLAGS, lpdate : *const super::Foundation:: SYSTEMTIME, lpformat : windows_sys::core::PCWSTR, lpdatestr : windows_sys::core::PWSTR, cchdate : i32, lpcalendar : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetDateFormatW(locale : u32, dwflags : u32, lpdate : *const super::Foundation:: SYSTEMTIME, lpformat : windows_sys::core::PCWSTR, lpdatestr : windows_sys::core::PWSTR, cchdate : i32) -> i32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("bcp47mrm.dll" "system" fn GetDistanceOfClosestLanguageInList(pszlanguage : windows_sys::core::PCWSTR, pszlanguageslist : windows_sys::core::PCWSTR, wchlistdelimiter : u16, pclosestdistance : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetDurationFormat(locale : u32, dwflags : u32, lpduration : *const super::Foundation:: SYSTEMTIME, ullduration : u64, lpformat : windows_sys::core::PCWSTR, lpdurationstr : windows_sys::core::PWSTR, cchduration : i32) -> i32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetDurationFormatEx(lplocalename : windows_sys::core::PCWSTR, dwflags : u32, lpduration : *const super::Foundation:: SYSTEMTIME, ullduration : u64, lpformat : windows_sys::core::PCWSTR, lpdurationstr : windows_sys::core::PWSTR, cchduration : i32) -> i32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetFileMUIInfo(dwflags : u32, pcwszfilepath : windows_sys::core::PCWSTR, pfilemuiinfo : *mut FILEMUIINFO, pcbfilemuiinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetFileMUIPath(dwflags : u32, pcwszfilepath : windows_sys::core::PCWSTR, pwszlanguage : windows_sys::core::PWSTR, pcchlanguage : *mut u32, pwszfilemuipath : windows_sys::core::PWSTR, pcchfilemuipath : *mut u32, pululenumerator : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetGeoInfoA(location : i32, geotype : SYSGEOTYPE, lpgeodata : windows_sys::core::PSTR, cchdata : i32, langid : u16) -> i32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetGeoInfoEx(location : windows_sys::core::PCWSTR, geotype : SYSGEOTYPE, geodata : windows_sys::core::PWSTR, geodatacount : i32) -> i32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetGeoInfoW(location : i32, geotype : SYSGEOTYPE, lpgeodata : windows_sys::core::PWSTR, cchdata : i32, langid : u16) -> i32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetLocaleInfoA(locale : u32, lctype : u32, lplcdata : windows_sys::core::PSTR, cchdata : i32) -> i32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetLocaleInfoEx(lplocalename : windows_sys::core::PCWSTR, lctype : u32, lplcdata : windows_sys::core::PWSTR, cchdata : i32) -> i32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetLocaleInfoW(locale : u32, lctype : u32, lplcdata : windows_sys::core::PWSTR, cchdata : i32) -> i32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetNLSVersion(function : u32, locale : u32, lpversioninformation : *mut NLSVERSIONINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetNLSVersionEx(function : u32, lplocalename : windows_sys::core::PCWSTR, lpversioninformation : *mut NLSVERSIONINFOEX) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetNumberFormatA(locale : u32, dwflags : u32, lpvalue : windows_sys::core::PCSTR, lpformat : *const NUMBERFMTA, lpnumberstr : windows_sys::core::PSTR, cchnumber : i32) -> i32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetNumberFormatEx(lplocalename : windows_sys::core::PCWSTR, dwflags : u32, lpvalue : windows_sys::core::PCWSTR, lpformat : *const NUMBERFMTW, lpnumberstr : windows_sys::core::PWSTR, cchnumber : i32) -> i32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetNumberFormatW(locale : u32, dwflags : u32, lpvalue : windows_sys::core::PCWSTR, lpformat : *const NUMBERFMTW, lpnumberstr : windows_sys::core::PWSTR, cchnumber : i32) -> i32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetOEMCP() -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProcessPreferredUILanguages(dwflags : u32, pulnumlanguages : *mut u32, pwszlanguagesbuffer : windows_sys::core::PWSTR, pcchlanguagesbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetStringScripts(dwflags : u32, lpstring : windows_sys::core::PCWSTR, cchstring : i32, lpscripts : windows_sys::core::PWSTR, cchscripts : i32) -> i32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetStringTypeA(locale : u32, dwinfotype : u32, lpsrcstr : windows_sys::core::PCSTR, cchsrc : i32, lpchartype : *mut u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetStringTypeExA(locale : u32, dwinfotype : u32, lpsrcstr : windows_sys::core::PCSTR, cchsrc : i32, lpchartype : *mut u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetStringTypeExW(locale : u32, dwinfotype : u32, lpsrcstr : windows_sys::core::PCWSTR, cchsrc : i32, lpchartype : *mut u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetStringTypeW(dwinfotype : u32, lpsrcstr : windows_sys::core::PCWSTR, cchsrc : i32, lpchartype : *mut u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemDefaultLCID() -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemDefaultLangID() -> u16);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemDefaultLocaleName(lplocalename : windows_sys::core::PWSTR, cchlocalename : i32) -> i32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemDefaultUILanguage() -> u16);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemPreferredUILanguages(dwflags : u32, pulnumlanguages : *mut u32, pwszlanguagesbuffer : windows_sys::core::PWSTR, pcchlanguagesbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetTextCharset(hdc : super::Graphics::Gdi:: HDC) -> i32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetTextCharsetInfo(hdc : super::Graphics::Gdi:: HDC, lpsig : *mut FONTSIGNATURE, dwflags : u32) -> i32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetThreadLocale() -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetThreadPreferredUILanguages(dwflags : u32, pulnumlanguages : *mut u32, pwszlanguagesbuffer : windows_sys::core::PWSTR, pcchlanguagesbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetThreadUILanguage() -> u16);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetTimeFormatA(locale : u32, dwflags : u32, lptime : *const super::Foundation:: SYSTEMTIME, lpformat : windows_sys::core::PCSTR, lptimestr : windows_sys::core::PSTR, cchtime : i32) -> i32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetTimeFormatEx(lplocalename : windows_sys::core::PCWSTR, dwflags : TIME_FORMAT_FLAGS, lptime : *const super::Foundation:: SYSTEMTIME, lpformat : windows_sys::core::PCWSTR, lptimestr : windows_sys::core::PWSTR, cchtime : i32) -> i32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetTimeFormatW(locale : u32, dwflags : u32, lptime : *const super::Foundation:: SYSTEMTIME, lpformat : windows_sys::core::PCWSTR, lptimestr : windows_sys::core::PWSTR, cchtime : i32) -> i32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetUILanguageInfo(dwflags : u32, pwmszlanguage : windows_sys::core::PCWSTR, pwszfallbacklanguages : windows_sys::core::PWSTR, pcchfallbacklanguages : *mut u32, pattributes : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetUserDefaultGeoName(geoname : windows_sys::core::PWSTR, geonamecount : i32) -> i32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetUserDefaultLCID() -> u32);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetUserDefaultLangID() -> u16);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetUserDefaultLocaleName(lplocalename : windows_sys::core::PWSTR, cchlocalename : i32) -> i32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetUserDefaultUILanguage() -> u16);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetUserGeoID(geoclass : SYSGEOCLASS) -> i32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetUserPreferredUILanguages(dwflags : u32, pulnumlanguages : *mut u32, pwszlanguagesbuffer : windows_sys::core::PWSTR, pcchlanguagesbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("normaliz.dll" "system" fn IdnToAscii(dwflags : u32, lpunicodecharstr : windows_sys::core::PCWSTR, cchunicodechar : i32, lpasciicharstr : windows_sys::core::PWSTR, cchasciichar : i32) -> i32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IdnToNameprepUnicode(dwflags : u32, lpunicodecharstr : windows_sys::core::PCWSTR, cchunicodechar : i32, lpnameprepcharstr : windows_sys::core::PWSTR, cchnameprepchar : i32) -> i32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("normaliz.dll" "system" fn IdnToUnicode(dwflags : u32, lpasciicharstr : windows_sys::core::PCWSTR, cchasciichar : i32, lpunicodecharstr : windows_sys::core::PWSTR, cchunicodechar : i32) -> i32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsCalendarLeapYear(calid : u32, year : u32, era : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsDBCSLeadByte(testchar : u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsDBCSLeadByteEx(codepage : u32, testchar : u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsNLSDefinedString(function : u32, dwflags : u32, lpversioninformation : *const NLSVERSIONINFO, lpstring : windows_sys::core::PCWSTR, cchstr : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsNormalizedString(normform : NORM_FORM, lpstring : windows_sys::core::PCWSTR, cwlength : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn IsTextUnicode(lpv : *const core::ffi::c_void, isize : i32, lpiresult : *mut IS_TEXT_UNICODE_RESULT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsValidCodePage(codepage : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsValidLanguageGroup(languagegroup : u32, dwflags : ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsValidLocale(locale : u32, dwflags : IS_VALID_LOCALE_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsValidLocaleName(lplocalename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsValidNLSVersion(function : u32, lplocalename : windows_sys::core::PCWSTR, lpversioninformation : *const NLSVERSIONINFOEX) -> u32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("bcp47mrm.dll" "system" fn IsWellFormedTag(psztag : windows_sys::core::PCWSTR) -> u8);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LCIDToLocaleName(locale : u32, lpname : windows_sys::core::PWSTR, cchname : i32, dwflags : u32) -> i32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LCMapStringA(locale : u32, dwmapflags : u32, lpsrcstr : windows_sys::core::PCSTR, cchsrc : i32, lpdeststr : windows_sys::core::PSTR, cchdest : i32) -> i32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LCMapStringEx(lplocalename : windows_sys::core::PCWSTR, dwmapflags : u32, lpsrcstr : windows_sys::core::PCWSTR, cchsrc : i32, lpdeststr : windows_sys::core::PWSTR, cchdest : i32, lpversioninformation : *const NLSVERSIONINFO, lpreserved : *const core::ffi::c_void, sorthandle : super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LCMapStringW(locale : u32, dwmapflags : u32, lpsrcstr : windows_sys::core::PCWSTR, cchsrc : i32, lpdeststr : windows_sys::core::PWSTR, cchdest : i32) -> i32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocaleNameToLCID(lpname : windows_sys::core::PCWSTR, dwflags : u32) -> u32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("elscore.dll" "system" fn MappingDoAction(pbag : *mut MAPPING_PROPERTY_BAG, dwrangeindex : u32, pszactionid : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("elscore.dll" "system" fn MappingFreePropertyBag(pbag : *const MAPPING_PROPERTY_BAG) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("elscore.dll" "system" fn MappingFreeServices(pserviceinfo : *const MAPPING_SERVICE_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("elscore.dll" "system" fn MappingGetServices(poptions : *const MAPPING_ENUM_OPTIONS, prgservices : *mut *mut MAPPING_SERVICE_INFO, pdwservicescount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("elscore.dll" "system" fn MappingRecognizeText(pserviceinfo : *const MAPPING_SERVICE_INFO, psztext : windows_sys::core::PCWSTR, dwlength : u32, dwindex : u32, poptions : *const MAPPING_OPTIONS, pbag : *mut MAPPING_PROPERTY_BAG) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn MultiByteToWideChar(codepage : u32, dwflags : MULTI_BYTE_TO_WIDE_CHAR_FLAGS, lpmultibytestr : windows_sys::core::PCSTR, cbmultibyte : i32, lpwidecharstr : windows_sys::core::PWSTR, cchwidechar : i32) -> i32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn NormalizeString(normform : NORM_FORM, lpsrcstring : windows_sys::core::PCWSTR, cwsrclength : i32, lpdststring : windows_sys::core::PWSTR, cwdstlength : i32) -> i32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn NotifyUILanguageChange(dwflags : u32, pcwstrnewlanguage : windows_sys::core::PCWSTR, pcwstrpreviouslanguage : windows_sys::core::PCWSTR, dwreserved : u32, pdwstatusrtrn : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ResolveLocaleName(lpnametoresolve : windows_sys::core::PCWSTR, lplocalename : windows_sys::core::PWSTR, cchlocalename : i32) -> i32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RestoreThreadPreferredUILanguages(snapshot : HSAVEDUILANGUAGES));

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptApplyDigitSubstitution(psds : *const SCRIPT_DIGITSUBSTITUTE, psc : *mut SCRIPT_CONTROL, pss : *mut SCRIPT_STATE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptApplyLogicalWidth(pidx : *const i32, cchars : i32, cglyphs : i32, pwlogclust : *const u16, psva : *const SCRIPT_VISATTR, piadvance : *const i32, psa : *const SCRIPT_ANALYSIS, pabc : *mut super::Graphics::Gdi:: ABC, pijustify : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptBreak(pwcchars : windows_sys::core::PCWSTR, cchars : i32, psa : *const SCRIPT_ANALYSIS, psla : *mut SCRIPT_LOGATTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptCPtoX(icp : i32, ftrailing : windows_sys::core::BOOL, cchars : i32, cglyphs : i32, pwlogclust : *const u16, psva : *const SCRIPT_VISATTR, piadvance : *const i32, psa : *const SCRIPT_ANALYSIS, pix : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptCacheGetHeight(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, tmheight : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptFreeCache(psc : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptGetCMap(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, pwcinchars : windows_sys::core::PCWSTR, cchars : i32, dwflags : u32, pwoutglyphs : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptGetFontAlternateGlyphs(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, psa : *const SCRIPT_ANALYSIS, tagscript : u32, taglangsys : u32, tagfeature : u32, wglyphid : u16, cmaxalternates : i32, palternateglyphs : *mut u16, pcalternates : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptGetFontFeatureTags(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, psa : *const SCRIPT_ANALYSIS, tagscript : u32, taglangsys : u32, cmaxtags : i32, pfeaturetags : *mut u32, pctags : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptGetFontLanguageTags(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, psa : *const SCRIPT_ANALYSIS, tagscript : u32, cmaxtags : i32, plangsystags : *mut u32, pctags : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptGetFontProperties(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, sfp : *mut SCRIPT_FONTPROPERTIES) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptGetFontScriptTags(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, psa : *const SCRIPT_ANALYSIS, cmaxtags : i32, pscripttags : *mut u32, pctags : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptGetGlyphABCWidth(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, wglyph : u16, pabc : *mut super::Graphics::Gdi:: ABC) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptGetLogicalWidths(psa : *const SCRIPT_ANALYSIS, cchars : i32, cglyphs : i32, piglyphwidth : *const i32, pwlogclust : *const u16, psva : *const SCRIPT_VISATTR, pidx : *const i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptGetProperties(ppsp : *mut *mut *mut SCRIPT_PROPERTIES, pinumscripts : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptIsComplex(pwcinchars : windows_sys::core::PCWSTR, cinchars : i32, dwflags : SCRIPT_IS_COMPLEX_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptItemize(pwcinchars : windows_sys::core::PCWSTR, cinchars : i32, cmaxitems : i32, pscontrol : *const SCRIPT_CONTROL, psstate : *const SCRIPT_STATE, pitems : *mut SCRIPT_ITEM, pcitems : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptItemizeOpenType(pwcinchars : windows_sys::core::PCWSTR, cinchars : i32, cmaxitems : i32, pscontrol : *const SCRIPT_CONTROL, psstate : *const SCRIPT_STATE, pitems : *mut SCRIPT_ITEM, pscripttags : *mut u32, pcitems : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptJustify(psva : *const SCRIPT_VISATTR, piadvance : *const i32, cglyphs : i32, idx : i32, iminkashida : i32, pijustify : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptLayout(cruns : i32, pblevel : *const u8, pivisualtological : *mut i32, pilogicaltovisual : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptPlace(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, pwglyphs : *const u16, cglyphs : i32, psva : *const SCRIPT_VISATTR, psa : *mut SCRIPT_ANALYSIS, piadvance : *mut i32, pgoffset : *mut GOFFSET, pabc : *mut super::Graphics::Gdi:: ABC) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptPlaceOpenType(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, psa : *mut SCRIPT_ANALYSIS, tagscript : u32, taglangsys : u32, rcrangechars : *const i32, rprangeproperties : *const *const TEXTRANGE_PROPERTIES, cranges : i32, pwcchars : windows_sys::core::PCWSTR, pwlogclust : *const u16, pcharprops : *const SCRIPT_CHARPROP, cchars : i32, pwglyphs : *const u16, pglyphprops : *const SCRIPT_GLYPHPROP, cglyphs : i32, piadvance : *mut i32, pgoffset : *mut GOFFSET, pabc : *mut super::Graphics::Gdi:: ABC) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptPositionSingleGlyph(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, psa : *const SCRIPT_ANALYSIS, tagscript : u32, taglangsys : u32, tagfeature : u32, lparameter : i32, wglyphid : u16, iadvance : i32, goffset : GOFFSET, pioutadvance : *mut i32, poutgoffset : *mut GOFFSET) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptRecordDigitSubstitution(locale : u32, psds : *mut SCRIPT_DIGITSUBSTITUTE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptShape(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, pwcchars : windows_sys::core::PCWSTR, cchars : i32, cmaxglyphs : i32, psa : *mut SCRIPT_ANALYSIS, pwoutglyphs : *mut u16, pwlogclust : *mut u16, psva : *mut SCRIPT_VISATTR, pcglyphs : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptShapeOpenType(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, psa : *mut SCRIPT_ANALYSIS, tagscript : u32, taglangsys : u32, rcrangechars : *const i32, rprangeproperties : *const *const TEXTRANGE_PROPERTIES, cranges : i32, pwcchars : windows_sys::core::PCWSTR, cchars : i32, cmaxglyphs : i32, pwlogclust : *mut u16, pcharprops : *mut SCRIPT_CHARPROP, pwoutglyphs : *mut u16, poutglyphprops : *mut SCRIPT_GLYPHPROP, pcglyphs : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptStringAnalyse(hdc : super::Graphics::Gdi:: HDC, pstring : *const core::ffi::c_void, cstring : i32, cglyphs : i32, icharset : i32, dwflags : u32, ireqwidth : i32, pscontrol : *const SCRIPT_CONTROL, psstate : *const SCRIPT_STATE, pidx : *const i32, ptabdef : *const SCRIPT_TABDEF, pbinclass : *const u8, pssa : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptStringCPtoX(ssa : *const core::ffi::c_void, icp : i32, ftrailing : windows_sys::core::BOOL, px : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptStringFree(pssa : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptStringGetLogicalWidths(ssa : *const core::ffi::c_void, pidx : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptStringGetOrder(ssa : *const core::ffi::c_void, puorder : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptStringOut(ssa : *const core::ffi::c_void, ix : i32, iy : i32, uoptions : super::Graphics::Gdi:: ETO_OPTIONS, prc : *const super::Foundation:: RECT, iminsel : i32, imaxsel : i32, fdisabled : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptStringValidate(ssa : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptStringXtoCP(ssa : *const core::ffi::c_void, ix : i32, pich : *mut i32, pitrailing : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptString_pLogAttr(ssa : *const core::ffi::c_void) -> *mut SCRIPT_LOGATTR);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptString_pSize(ssa : *const core::ffi::c_void) -> *mut super::Foundation:: SIZE);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptString_pcOutChars(ssa : *const core::ffi::c_void) -> *mut i32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptSubstituteSingleGlyph(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, psa : *const SCRIPT_ANALYSIS, tagscript : u32, taglangsys : u32, tagfeature : u32, lparameter : i32, wglyphid : u16, pwoutglyphid : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("usp10.dll" "system" fn ScriptTextOut(hdc : super::Graphics::Gdi:: HDC, psc : *mut *mut core::ffi::c_void, x : i32, y : i32, fuoptions : u32, lprc : *const super::Foundation:: RECT, psa : *const SCRIPT_ANALYSIS, pwcreserved : windows_sys::core::PCWSTR, ireserved : i32, pwglyphs : *const u16, cglyphs : i32, piadvance : *const i32, pijustify : *const i32, pgoffset : *const GOFFSET) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("usp10.dll" "system" fn ScriptXtoCP(ix : i32, cchars : i32, cglyphs : i32, pwlogclust : *const u16, psva : *const SCRIPT_VISATTR, piadvance : *const i32, psa : *const SCRIPT_ANALYSIS, picp : *mut i32, pitrailing : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetCalendarInfoA(locale : u32, calendar : u32, caltype : u32, lpcaldata : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetCalendarInfoW(locale : u32, calendar : u32, caltype : u32, lpcaldata : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetLocaleInfoA(locale : u32, lctype : u32, lplcdata : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetLocaleInfoW(locale : u32, lctype : u32, lplcdata : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetProcessPreferredUILanguages(dwflags : u32, pwszlanguagesbuffer : windows_sys::core::PCWSTR, pulnumlanguages : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetThreadLocale(locale : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetThreadPreferredUILanguages(dwflags : u32, pwszlanguagesbuffer : windows_sys::core::PCWSTR, pulnumlanguages : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetThreadPreferredUILanguages2(flags : u32, languages : windows_sys::core::PCWSTR, numlanguagesset : *mut u32, snapshot : *mut HSAVEDUILANGUAGES) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetThreadUILanguage(langid : u16) -> u16);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetUserGeoID(geoid : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetUserGeoName(geoname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn TranslateCharsetInfo(lpsrc : *mut u32, lpcs : *mut CHARSETINFO, dwflags : TRANSLATE_CHARSET_INFO_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn UCNV_FROM_U_CALLBACK_ESCAPE(context : *const core::ffi::c_void, fromuargs : *mut UConverterFromUnicodeArgs, codeunits : *const u16, length : i32, codepoint : i32, reason : UConverterCallbackReason, err : *mut UErrorCode));

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn UCNV_FROM_U_CALLBACK_SKIP(context : *const core::ffi::c_void, fromuargs : *mut UConverterFromUnicodeArgs, codeunits : *const u16, length : i32, codepoint : i32, reason : UConverterCallbackReason, err : *mut UErrorCode));

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn UCNV_FROM_U_CALLBACK_STOP(context : *const core::ffi::c_void, fromuargs : *mut UConverterFromUnicodeArgs, codeunits : *const u16, length : i32, codepoint : i32, reason : UConverterCallbackReason, err : *mut UErrorCode));

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn UCNV_FROM_U_CALLBACK_SUBSTITUTE(context : *const core::ffi::c_void, fromuargs : *mut UConverterFromUnicodeArgs, codeunits : *const u16, length : i32, codepoint : i32, reason : UConverterCallbackReason, err : *mut UErrorCode));

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn UCNV_TO_U_CALLBACK_ESCAPE(context : *const core::ffi::c_void, touargs : *mut UConverterToUnicodeArgs, codeunits : windows_sys::core::PCSTR, length : i32, reason : UConverterCallbackReason, err : *mut UErrorCode));

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn UCNV_TO_U_CALLBACK_SKIP(context : *const core::ffi::c_void, touargs : *mut UConverterToUnicodeArgs, codeunits : windows_sys::core::PCSTR, length : i32, reason : UConverterCallbackReason, err : *mut UErrorCode));

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn UCNV_TO_U_CALLBACK_STOP(context : *const core::ffi::c_void, touargs : *mut UConverterToUnicodeArgs, codeunits : windows_sys::core::PCSTR, length : i32, reason : UConverterCallbackReason, err : *mut UErrorCode));

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn UCNV_TO_U_CALLBACK_SUBSTITUTE(context : *const core::ffi::c_void, touargs : *mut UConverterToUnicodeArgs, codeunits : windows_sys::core::PCSTR, length : i32, reason : UConverterCallbackReason, err : *mut UErrorCode));

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn UpdateCalendarDayOfWeek(lpcaldatetime : *mut CALDATETIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VerifyScripts(dwflags : u32, lplocalescripts : windows_sys::core::PCWSTR, cchlocalescripts : i32, lptestscripts : windows_sys::core::PCWSTR, cchtestscripts : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WideCharToMultiByte(codepage : u32, dwflags : u32, lpwidecharstr : windows_sys::core::PCWSTR, cchwidechar : i32, lpmultibytestr : windows_sys::core::PSTR, cbmultibyte : i32, lpdefaultchar : windows_sys::core::PCSTR, lpuseddefaultchar : *mut windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcatA(lpstring1 : windows_sys::core::PSTR, lpstring2 : windows_sys::core::PCSTR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcatW(lpstring1 : windows_sys::core::PWSTR, lpstring2 : windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcmpA(lpstring1 : windows_sys::core::PCSTR, lpstring2 : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcmpW(lpstring1 : windows_sys::core::PCWSTR, lpstring2 : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcmpiA(lpstring1 : windows_sys::core::PCSTR, lpstring2 : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcmpiW(lpstring1 : windows_sys::core::PCWSTR, lpstring2 : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcpyA(lpstring1 : windows_sys::core::PSTR, lpstring2 : windows_sys::core::PCSTR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcpyW(lpstring1 : windows_sys::core::PWSTR, lpstring2 : windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcpynA(lpstring1 : windows_sys::core::PSTR, lpstring2 : windows_sys::core::PCSTR, imaxlength : i32) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrcpynW(lpstring1 : windows_sys::core::PWSTR, lpstring2 : windows_sys::core::PCWSTR, imaxlength : i32) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrlenA(lpstring : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn lstrlenW(lpstring : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_UCharsToChars(us : *const u16, cs : windows_sys::core::PCSTR, length : i32));

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_austrcpy(dst : windows_sys::core::PCSTR, src : *const u16) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_austrncpy(dst : windows_sys::core::PCSTR, src : *const u16, n : i32) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_catclose(catd : *mut UResourceBundle));

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_catgets(catd : *mut UResourceBundle, set_num : i32, msg_num : i32, s : *const u16, len : *mut i32, ec : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_catopen(name : windows_sys::core::PCSTR, locale : windows_sys::core::PCSTR, ec : *mut UErrorCode) -> *mut UResourceBundle);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_charAge(c : i32, versionarray : *mut u8));

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_charDigitValue(c : i32) -> i32);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_charDirection(c : i32) -> UCharDirection);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_charFromName(namechoice : UCharNameChoice, name : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_charMirror(c : i32) -> i32);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_charName(code : i32, namechoice : UCharNameChoice, buffer : windows_sys::core::PCSTR, bufferlength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_charType(c : i32) -> i8);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_charsToUChars(cs : windows_sys::core::PCSTR, us : *mut u16, length : i32));

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_cleanup());

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_countChar32(s : *const u16, length : i32) -> i32);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_digit(ch : i32, radix : i8) -> i32);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_enumCharNames(start : i32, limit : i32, r#fn : *mut UEnumCharNamesFn, context : *mut core::ffi::c_void, namechoice : UCharNameChoice, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_enumCharTypes(enumrange : *mut UCharEnumTypeRange, context : *const core::ffi::c_void));

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_errorName(code : UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_foldCase(c : i32, options : u32) -> i32);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_forDigit(digit : i32, radix : i8) -> i32);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn u_formatMessage(locale : windows_sys::core::PCSTR, pattern : *const u16, patternlength : i32, result : *mut u16, resultlength : i32, status : *mut UErrorCode, ...) -> i32);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn u_formatMessageWithError(locale : windows_sys::core::PCSTR, pattern : *const u16, patternlength : i32, result : *mut u16, resultlength : i32, parseerror : *mut UParseError, status : *mut UErrorCode, ...) -> i32);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getBidiPairedBracket(c : i32) -> i32);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn u_getBinaryPropertySet(property : UProperty, perrorcode : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getCombiningClass(c : i32) -> u8);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getDataVersion(dataversionfillin : *mut u8, status : *mut UErrorCode));

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getFC_NFKC_Closure(c : i32, dest : *mut u16, destcapacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn u_getIntPropertyMap(property : UProperty, perrorcode : *mut UErrorCode) -> *mut UCPMap);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getIntPropertyMaxValue(which : UProperty) -> i32);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getIntPropertyMinValue(which : UProperty) -> i32);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getIntPropertyValue(c : i32, which : UProperty) -> i32);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getNumericValue(c : i32) -> f64);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getPropertyEnum(alias : windows_sys::core::PCSTR) -> UProperty);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getPropertyName(property : UProperty, namechoice : UPropertyNameChoice) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getPropertyValueEnum(property : UProperty, alias : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getPropertyValueName(property : UProperty, value : i32, namechoice : UPropertyNameChoice) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getUnicodeVersion(versionarray : *mut u8));

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_getVersion(versionarray : *mut u8));

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_hasBinaryProperty(c : i32, which : UProperty) -> i8);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_init(status : *mut UErrorCode));

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isIDIgnorable(c : i32) -> i8);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isIDPart(c : i32) -> i8);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isIDStart(c : i32) -> i8);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isISOControl(c : i32) -> i8);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isJavaIDPart(c : i32) -> i8);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isJavaIDStart(c : i32) -> i8);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isJavaSpaceChar(c : i32) -> i8);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isMirrored(c : i32) -> i8);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isUAlphabetic(c : i32) -> i8);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isULowercase(c : i32) -> i8);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isUUppercase(c : i32) -> i8);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isUWhiteSpace(c : i32) -> i8);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isWhitespace(c : i32) -> i8);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isalnum(c : i32) -> i8);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isalpha(c : i32) -> i8);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isbase(c : i32) -> i8);

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isblank(c : i32) -> i8);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_iscntrl(c : i32) -> i8);

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isdefined(c : i32) -> i8);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isdigit(c : i32) -> i8);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isgraph(c : i32) -> i8);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_islower(c : i32) -> i8);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isprint(c : i32) -> i8);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_ispunct(c : i32) -> i8);

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isspace(c : i32) -> i8);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_istitle(c : i32) -> i8);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isupper(c : i32) -> i8);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_isxdigit(c : i32) -> i8);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memcasecmp(s1 : *const u16, s2 : *const u16, length : i32, options : u32) -> i32);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memchr(s : *const u16, c : u16, count : i32) -> *mut u16);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memchr32(s : *const u16, c : i32, count : i32) -> *mut u16);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memcmp(buf1 : *const u16, buf2 : *const u16, count : i32) -> i32);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memcmpCodePointOrder(s1 : *const u16, s2 : *const u16, count : i32) -> i32);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memcpy(dest : *mut u16, src : *const u16, count : i32) -> *mut u16);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memmove(dest : *mut u16, src : *const u16, count : i32) -> *mut u16);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memrchr(s : *const u16, c : u16, count : i32) -> *mut u16);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memrchr32(s : *const u16, c : i32, count : i32) -> *mut u16);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_memset(dest : *mut u16, c : u16, count : i32) -> *mut u16);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn u_parseMessage(locale : windows_sys::core::PCSTR, pattern : *const u16, patternlength : i32, source : *const u16, sourcelength : i32, status : *mut UErrorCode, ...));

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn u_parseMessageWithError(locale : windows_sys::core::PCSTR, pattern : *const u16, patternlength : i32, source : *const u16, sourcelength : i32, parseerror : *mut UParseError, status : *mut UErrorCode, ...));

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_setMemoryFunctions(context : *const core::ffi::c_void, a : *mut UMemAllocFn, r : *mut UMemReallocFn, f : *mut UMemFreeFn, status : *mut UErrorCode));

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_shapeArabic(source : *const u16, sourcelength : i32, dest : *mut u16, destsize : i32, options : u32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strCaseCompare(s1 : *const u16, length1 : i32, s2 : *const u16, length2 : i32, options : u32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strCompare(s1 : *const u16, length1 : i32, s2 : *const u16, length2 : i32, codepointorder : i8) -> i32);

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strCompareIter(iter1 : *mut UCharIterator, iter2 : *mut UCharIterator, codepointorder : i8) -> i32);

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFindFirst(s : *const u16, length : i32, substring : *const u16, sublength : i32) -> *mut u16);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFindLast(s : *const u16, length : i32, substring : *const u16, sublength : i32) -> *mut u16);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFoldCase(dest : *mut u16, destcapacity : i32, src : *const u16, srclength : i32, options : u32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFromJavaModifiedUTF8WithSub(dest : *mut u16, destcapacity : i32, pdestlength : *mut i32, src : windows_sys::core::PCSTR, srclength : i32, subchar : i32, pnumsubstitutions : *mut i32, perrorcode : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFromUTF32(dest : *mut u16, destcapacity : i32, pdestlength : *mut i32, src : *const i32, srclength : i32, perrorcode : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 316:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFromUTF32WithSub(dest : *mut u16, destcapacity : i32, pdestlength : *mut i32, src : *const i32, srclength : i32, subchar : i32, pnumsubstitutions : *mut i32, perrorcode : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFromUTF8(dest : *mut u16, destcapacity : i32, pdestlength : *mut i32, src : windows_sys::core::PCSTR, srclength : i32, perrorcode : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 318:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFromUTF8Lenient(dest : *mut u16, destcapacity : i32, pdestlength : *mut i32, src : windows_sys::core::PCSTR, srclength : i32, perrorcode : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFromUTF8WithSub(dest : *mut u16, destcapacity : i32, pdestlength : *mut i32, src : windows_sys::core::PCSTR, srclength : i32, subchar : i32, pnumsubstitutions : *mut i32, perrorcode : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strFromWCS(dest : *mut u16, destcapacity : i32, pdestlength : *mut i32, src : windows_sys::core::PCWSTR, srclength : i32, perrorcode : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strHasMoreChar32Than(s : *const u16, length : i32, number : i32) -> i8);

// UNSUPPORTED Rust 322:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strToJavaModifiedUTF8(dest : windows_sys::core::PCSTR, destcapacity : i32, pdestlength : *mut i32, src : *const u16, srclength : i32, perrorcode : *mut UErrorCode) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strToLower(dest : *mut u16, destcapacity : i32, src : *const u16, srclength : i32, locale : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strToTitle(dest : *mut u16, destcapacity : i32, src : *const u16, srclength : i32, titleiter : *mut UBreakIterator, locale : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strToUTF32(dest : *mut i32, destcapacity : i32, pdestlength : *mut i32, src : *const u16, srclength : i32, perrorcode : *mut UErrorCode) -> *mut i32);

// UNSUPPORTED Rust 326:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strToUTF32WithSub(dest : *mut i32, destcapacity : i32, pdestlength : *mut i32, src : *const u16, srclength : i32, subchar : i32, pnumsubstitutions : *mut i32, perrorcode : *mut UErrorCode) -> *mut i32);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strToUTF8(dest : windows_sys::core::PCSTR, destcapacity : i32, pdestlength : *mut i32, src : *const u16, srclength : i32, perrorcode : *mut UErrorCode) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 328:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strToUTF8WithSub(dest : windows_sys::core::PCSTR, destcapacity : i32, pdestlength : *mut i32, src : *const u16, srclength : i32, subchar : i32, pnumsubstitutions : *mut i32, perrorcode : *mut UErrorCode) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strToUpper(dest : *mut u16, destcapacity : i32, src : *const u16, srclength : i32, locale : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 330:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strToWCS(dest : windows_sys::core::PCWSTR, destcapacity : i32, pdestlength : *mut i32, src : *const u16, srclength : i32, perrorcode : *mut UErrorCode) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strcasecmp(s1 : *const u16, s2 : *const u16, options : u32) -> i32);

// UNSUPPORTED Rust 332:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strcat(dst : *mut u16, src : *const u16) -> *mut u16);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strchr(s : *const u16, c : u16) -> *mut u16);

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strchr32(s : *const u16, c : i32) -> *mut u16);

// UNSUPPORTED Rust 335:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strcmp(s1 : *const u16, s2 : *const u16) -> i32);

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strcmpCodePointOrder(s1 : *const u16, s2 : *const u16) -> i32);

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strcpy(dst : *mut u16, src : *const u16) -> *mut u16);

// UNSUPPORTED Rust 338:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strcspn(string : *const u16, matchset : *const u16) -> i32);

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strlen(s : *const u16) -> i32);

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strncasecmp(s1 : *const u16, s2 : *const u16, n : i32, options : u32) -> i32);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strncat(dst : *mut u16, src : *const u16, n : i32) -> *mut u16);

// UNSUPPORTED Rust 342:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strncmp(ucs1 : *const u16, ucs2 : *const u16, n : i32) -> i32);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strncmpCodePointOrder(s1 : *const u16, s2 : *const u16, n : i32) -> i32);

// UNSUPPORTED Rust 344:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strncpy(dst : *mut u16, src : *const u16, n : i32) -> *mut u16);

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strpbrk(string : *const u16, matchset : *const u16) -> *mut u16);

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strrchr(s : *const u16, c : u16) -> *mut u16);

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strrchr32(s : *const u16, c : i32) -> *mut u16);

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strrstr(s : *const u16, substring : *const u16) -> *mut u16);

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strspn(string : *const u16, matchset : *const u16) -> i32);

// UNSUPPORTED Rust 350:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strstr(s : *const u16, substring : *const u16) -> *mut u16);

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_strtok_r(src : *mut u16, delim : *const u16, savestate : *mut *mut u16) -> *mut u16);

// UNSUPPORTED Rust 352:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_tolower(c : i32) -> i32);

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_totitle(c : i32) -> i32);

// UNSUPPORTED Rust 354:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_toupper(c : i32) -> i32);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_uastrcpy(dst : *mut u16, src : windows_sys::core::PCSTR) -> *mut u16);

// UNSUPPORTED Rust 356:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_uastrncpy(dst : *mut u16, src : windows_sys::core::PCSTR, n : i32) -> *mut u16);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_unescape(src : windows_sys::core::PCSTR, dest : *mut u16, destcapacity : i32) -> i32);

// UNSUPPORTED Rust 358:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_unescapeAt(charat : UNESCAPE_CHAR_AT, offset : *mut i32, length : i32, context : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_versionFromString(versionarray : *mut u8, versionstring : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 360:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_versionFromUString(versionarray : *mut u8, versionstring : *const u16));

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn u_versionToString(versionarray : *const u8, versionstring : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 362:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn u_vformatMessage(locale : windows_sys::core::PCSTR, pattern : *const u16, patternlength : i32, result : *mut u16, resultlength : i32, ap : *mut i8, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn u_vformatMessageWithError(locale : windows_sys::core::PCSTR, pattern : *const u16, patternlength : i32, result : *mut u16, resultlength : i32, parseerror : *mut UParseError, ap : *mut i8, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn u_vparseMessage(locale : windows_sys::core::PCSTR, pattern : *const u16, patternlength : i32, source : *const u16, sourcelength : i32, ap : *mut i8, status : *mut UErrorCode));

// UNSUPPORTED Rust 365:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn u_vparseMessageWithError(locale : windows_sys::core::PCSTR, pattern : *const u16, patternlength : i32, source : *const u16, sourcelength : i32, ap : *mut i8, parseerror : *mut UParseError, status : *mut UErrorCode));

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_close(pbidi : *mut UBiDi));

// UNSUPPORTED Rust 367:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_countParagraphs(pbidi : *mut UBiDi) -> i32);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_countRuns(pbidi : *mut UBiDi, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 369:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getBaseDirection(text : *const u16, length : i32) -> UBiDiDirection);

// UNSUPPORTED Rust 370:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getClassCallback(pbidi : *mut UBiDi, r#fn : *mut UBiDiClassCallback, context : *const *const core::ffi::c_void));

// UNSUPPORTED Rust 371:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getCustomizedClass(pbidi : *mut UBiDi, c : i32) -> UCharDirection);

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getDirection(pbidi : *const UBiDi) -> UBiDiDirection);

// UNSUPPORTED Rust 373:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getLength(pbidi : *const UBiDi) -> i32);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getLevelAt(pbidi : *const UBiDi, charindex : i32) -> u8);

// UNSUPPORTED Rust 375:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getLevels(pbidi : *mut UBiDi, perrorcode : *mut UErrorCode) -> *mut u8);

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getLogicalIndex(pbidi : *mut UBiDi, visualindex : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getLogicalMap(pbidi : *mut UBiDi, indexmap : *mut i32, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 378:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getLogicalRun(pbidi : *const UBiDi, logicalposition : i32, plogicallimit : *mut i32, plevel : *mut u8));

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getParaLevel(pbidi : *const UBiDi) -> u8);

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getParagraph(pbidi : *const UBiDi, charindex : i32, pparastart : *mut i32, pparalimit : *mut i32, pparalevel : *mut u8, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 381:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getParagraphByIndex(pbidi : *const UBiDi, paraindex : i32, pparastart : *mut i32, pparalimit : *mut i32, pparalevel : *mut u8, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getProcessedLength(pbidi : *const UBiDi) -> i32);

// UNSUPPORTED Rust 383:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getReorderingMode(pbidi : *mut UBiDi) -> UBiDiReorderingMode);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getReorderingOptions(pbidi : *mut UBiDi) -> u32);

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getResultLength(pbidi : *const UBiDi) -> i32);

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getText(pbidi : *const UBiDi) -> *mut u16);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getVisualIndex(pbidi : *mut UBiDi, logicalindex : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getVisualMap(pbidi : *mut UBiDi, indexmap : *mut i32, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_getVisualRun(pbidi : *mut UBiDi, runindex : i32, plogicalstart : *mut i32, plength : *mut i32) -> UBiDiDirection);

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_invertMap(srcmap : *const i32, destmap : *mut i32, length : i32));

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_isInverse(pbidi : *mut UBiDi) -> i8);

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_isOrderParagraphsLTR(pbidi : *mut UBiDi) -> i8);

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_open() -> *mut UBiDi);

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_openSized(maxlength : i32, maxruncount : i32, perrorcode : *mut UErrorCode) -> *mut UBiDi);

// UNSUPPORTED Rust 395:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_orderParagraphsLTR(pbidi : *mut UBiDi, orderparagraphsltr : i8));

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_reorderLogical(levels : *const u8, length : i32, indexmap : *mut i32));

// UNSUPPORTED Rust 397:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_reorderVisual(levels : *const u8, length : i32, indexmap : *mut i32));

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_setClassCallback(pbidi : *mut UBiDi, newfn : UBiDiClassCallback, newcontext : *const core::ffi::c_void, oldfn : *mut UBiDiClassCallback, oldcontext : *const *const core::ffi::c_void, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 399:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_setContext(pbidi : *mut UBiDi, prologue : *const u16, prolength : i32, epilogue : *const u16, epilength : i32, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_setInverse(pbidi : *mut UBiDi, isinverse : i8));

// UNSUPPORTED Rust 401:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_setLine(pparabidi : *const UBiDi, start : i32, limit : i32, plinebidi : *mut UBiDi, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 402:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_setPara(pbidi : *mut UBiDi, text : *const u16, length : i32, paralevel : u8, embeddinglevels : *mut u8, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 403:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_setReorderingMode(pbidi : *mut UBiDi, reorderingmode : UBiDiReorderingMode));

// UNSUPPORTED Rust 404:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_setReorderingOptions(pbidi : *mut UBiDi, reorderingoptions : u32));

// UNSUPPORTED Rust 405:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_writeReordered(pbidi : *mut UBiDi, dest : *mut u16, destsize : i32, options : u16, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 406:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubidi_writeReverse(src : *const u16, srclength : i32, dest : *mut u16, destsize : i32, options : u16, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 407:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubiditransform_close(pbiditransform : *mut UBiDiTransform));

// UNSUPPORTED Rust 408:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubiditransform_open(perrorcode : *mut UErrorCode) -> *mut UBiDiTransform);

// UNSUPPORTED Rust 409:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubiditransform_transform(pbiditransform : *mut UBiDiTransform, src : *const u16, srclength : i32, dest : *mut u16, destsize : i32, inparalevel : u8, inorder : UBiDiOrder, outparalevel : u8, outorder : UBiDiOrder, domirroring : UBiDiMirroring, shapingoptions : u32, perrorcode : *mut UErrorCode) -> u32);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ublock_getCode(c : i32) -> UBlockCode);

// UNSUPPORTED Rust 411:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_close(bi : *mut UBreakIterator));

// UNSUPPORTED Rust 412:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_countAvailable() -> i32);

// UNSUPPORTED Rust 413:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_current(bi : *const UBreakIterator) -> i32);

// UNSUPPORTED Rust 414:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_first(bi : *mut UBreakIterator) -> i32);

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_following(bi : *mut UBreakIterator, offset : i32) -> i32);

// UNSUPPORTED Rust 416:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_getAvailable(index : i32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 417:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_getBinaryRules(bi : *mut UBreakIterator, binaryrules : *mut u8, rulescapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 418:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_getLocaleByType(bi : *const UBreakIterator, r#type : ULocDataLocaleType, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 419:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_getRuleStatus(bi : *mut UBreakIterator) -> i32);

// UNSUPPORTED Rust 420:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_getRuleStatusVec(bi : *mut UBreakIterator, fillinvec : *mut i32, capacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_isBoundary(bi : *mut UBreakIterator, offset : i32) -> i8);

// UNSUPPORTED Rust 422:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_last(bi : *mut UBreakIterator) -> i32);

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_next(bi : *mut UBreakIterator) -> i32);

// UNSUPPORTED Rust 424:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_open(r#type : UBreakIteratorType, locale : windows_sys::core::PCSTR, text : *const u16, textlength : i32, status : *mut UErrorCode) -> *mut UBreakIterator);

// UNSUPPORTED Rust 425:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_openBinaryRules(binaryrules : *const u8, ruleslength : i32, text : *const u16, textlength : i32, status : *mut UErrorCode) -> *mut UBreakIterator);

// UNSUPPORTED Rust 426:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_openRules(rules : *const u16, ruleslength : i32, text : *const u16, textlength : i32, parseerr : *mut UParseError, status : *mut UErrorCode) -> *mut UBreakIterator);

// UNSUPPORTED Rust 427:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_preceding(bi : *mut UBreakIterator, offset : i32) -> i32);

// UNSUPPORTED Rust 428:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_previous(bi : *mut UBreakIterator) -> i32);

// UNSUPPORTED Rust 429:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_refreshUText(bi : *mut UBreakIterator, text : *mut UText, status : *mut UErrorCode));

// UNSUPPORTED Rust 430:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_safeClone(bi : *const UBreakIterator, stackbuffer : *mut core::ffi::c_void, pbuffersize : *mut i32, status : *mut UErrorCode) -> *mut UBreakIterator);

// UNSUPPORTED Rust 431:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_setText(bi : *mut UBreakIterator, text : *const u16, textlength : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 432:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ubrk_setUText(bi : *mut UBreakIterator, text : *mut UText, status : *mut UErrorCode));

// UNSUPPORTED Rust 433:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_add(cal : *mut *mut core::ffi::c_void, field : UCalendarDateFields, amount : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 434:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_clear(calendar : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 435:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_clearField(cal : *mut *mut core::ffi::c_void, field : UCalendarDateFields));

// UNSUPPORTED Rust 436:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_clone(cal : *const *const core::ffi::c_void, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 437:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_close(cal : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 438:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_countAvailable() -> i32);

// UNSUPPORTED Rust 439:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_equivalentTo(cal1 : *const *const core::ffi::c_void, cal2 : *const *const core::ffi::c_void) -> i8);

// UNSUPPORTED Rust 440:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_get(cal : *const *const core::ffi::c_void, field : UCalendarDateFields, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 441:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getAttribute(cal : *const *const core::ffi::c_void, attr : UCalendarAttribute) -> i32);

// UNSUPPORTED Rust 442:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getAvailable(localeindex : i32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 443:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getCanonicalTimeZoneID(id : *const u16, len : i32, result : *mut u16, resultcapacity : i32, issystemid : *mut i8, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 444:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getDSTSavings(zoneid : *const u16, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 445:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getDayOfWeekType(cal : *const *const core::ffi::c_void, dayofweek : UCalendarDaysOfWeek, status : *mut UErrorCode) -> UCalendarWeekdayType);

// UNSUPPORTED Rust 446:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getDefaultTimeZone(result : *mut u16, resultcapacity : i32, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 447:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getFieldDifference(cal : *mut *mut core::ffi::c_void, target : f64, field : UCalendarDateFields, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 448:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getGregorianChange(cal : *const *const core::ffi::c_void, perrorcode : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 449:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucal_getHostTimeZone(result : *mut u16, resultcapacity : i32, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 450:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getKeywordValuesForLocale(key : windows_sys::core::PCSTR, locale : windows_sys::core::PCSTR, commonlyused : i8, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 451:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getLimit(cal : *const *const core::ffi::c_void, field : UCalendarDateFields, r#type : UCalendarLimitType, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 452:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getLocaleByType(cal : *const *const core::ffi::c_void, r#type : ULocDataLocaleType, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 453:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getMillis(cal : *const *const core::ffi::c_void, status : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 454:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getNow() -> f64);

// UNSUPPORTED Rust 455:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getTZDataVersion(status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 456:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getTimeZoneDisplayName(cal : *const *const core::ffi::c_void, r#type : UCalendarDisplayNameType, locale : windows_sys::core::PCSTR, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 457:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getTimeZoneID(cal : *const *const core::ffi::c_void, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 458:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getTimeZoneIDForWindowsID(winid : *const u16, len : i32, region : windows_sys::core::PCSTR, id : *mut u16, idcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 459:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getTimeZoneTransitionDate(cal : *const *const core::ffi::c_void, r#type : UTimeZoneTransitionType, transition : *mut f64, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 460:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getType(cal : *const *const core::ffi::c_void, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 461:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getWeekendTransition(cal : *const *const core::ffi::c_void, dayofweek : UCalendarDaysOfWeek, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 462:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_getWindowsTimeZoneID(id : *const u16, len : i32, winid : *mut u16, winidcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 463:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_inDaylightTime(cal : *const *const core::ffi::c_void, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 464:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_isSet(cal : *const *const core::ffi::c_void, field : UCalendarDateFields) -> i8);

// UNSUPPORTED Rust 465:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_isWeekend(cal : *const *const core::ffi::c_void, date : f64, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 466:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_open(zoneid : *const u16, len : i32, locale : windows_sys::core::PCSTR, r#type : UCalendarType, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 467:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_openCountryTimeZones(country : windows_sys::core::PCSTR, ec : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 468:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_openTimeZoneIDEnumeration(zonetype : USystemTimeZoneType, region : windows_sys::core::PCSTR, rawoffset : *const i32, ec : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 469:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_openTimeZones(ec : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 470:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_roll(cal : *mut *mut core::ffi::c_void, field : UCalendarDateFields, amount : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 471:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_set(cal : *mut *mut core::ffi::c_void, field : UCalendarDateFields, value : i32));

// UNSUPPORTED Rust 472:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_setAttribute(cal : *mut *mut core::ffi::c_void, attr : UCalendarAttribute, newvalue : i32));

// UNSUPPORTED Rust 473:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_setDate(cal : *mut *mut core::ffi::c_void, year : i32, month : i32, date : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 474:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_setDateTime(cal : *mut *mut core::ffi::c_void, year : i32, month : i32, date : i32, hour : i32, minute : i32, second : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 475:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_setDefaultTimeZone(zoneid : *const u16, ec : *mut UErrorCode));

// UNSUPPORTED Rust 476:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_setGregorianChange(cal : *mut *mut core::ffi::c_void, date : f64, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 477:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_setMillis(cal : *mut *mut core::ffi::c_void, datetime : f64, status : *mut UErrorCode));

// UNSUPPORTED Rust 478:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucal_setTimeZone(cal : *mut *mut core::ffi::c_void, zoneid : *const u16, len : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 479:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_close(csm : *mut UCaseMap));

// UNSUPPORTED Rust 480:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_getBreakIterator(csm : *const UCaseMap) -> *mut UBreakIterator);

// UNSUPPORTED Rust 481:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_getLocale(csm : *const UCaseMap) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 482:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_getOptions(csm : *const UCaseMap) -> u32);

// UNSUPPORTED Rust 483:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_open(locale : windows_sys::core::PCSTR, options : u32, perrorcode : *mut UErrorCode) -> *mut UCaseMap);

// UNSUPPORTED Rust 484:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_setBreakIterator(csm : *mut UCaseMap, itertoadopt : *mut UBreakIterator, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 485:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_setLocale(csm : *mut UCaseMap, locale : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 486:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_setOptions(csm : *mut UCaseMap, options : u32, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 487:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_toTitle(csm : *mut UCaseMap, dest : *mut u16, destcapacity : i32, src : *const u16, srclength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 488:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_utf8FoldCase(csm : *const UCaseMap, dest : windows_sys::core::PCSTR, destcapacity : i32, src : windows_sys::core::PCSTR, srclength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 489:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_utf8ToLower(csm : *const UCaseMap, dest : windows_sys::core::PCSTR, destcapacity : i32, src : windows_sys::core::PCSTR, srclength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 490:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_utf8ToTitle(csm : *mut UCaseMap, dest : windows_sys::core::PCSTR, destcapacity : i32, src : windows_sys::core::PCSTR, srclength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 491:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucasemap_utf8ToUpper(csm : *const UCaseMap, dest : windows_sys::core::PCSTR, destcapacity : i32, src : windows_sys::core::PCSTR, srclength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 492:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_close(ucfpos : *mut UConstrainedFieldPosition));

// UNSUPPORTED Rust 493:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_constrainCategory(ucfpos : *mut UConstrainedFieldPosition, category : i32, ec : *mut UErrorCode));

// UNSUPPORTED Rust 494:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_constrainField(ucfpos : *mut UConstrainedFieldPosition, category : i32, field : i32, ec : *mut UErrorCode));

// UNSUPPORTED Rust 495:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_getCategory(ucfpos : *const UConstrainedFieldPosition, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 496:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_getField(ucfpos : *const UConstrainedFieldPosition, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 497:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_getIndexes(ucfpos : *const UConstrainedFieldPosition, pstart : *mut i32, plimit : *mut i32, ec : *mut UErrorCode));

// UNSUPPORTED Rust 498:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_getInt64IterationContext(ucfpos : *const UConstrainedFieldPosition, ec : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 499:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_matchesField(ucfpos : *const UConstrainedFieldPosition, category : i32, field : i32, ec : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 500:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_open(ec : *mut UErrorCode) -> *mut UConstrainedFieldPosition);

// UNSUPPORTED Rust 501:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_reset(ucfpos : *mut UConstrainedFieldPosition, ec : *mut UErrorCode));

// UNSUPPORTED Rust 502:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_setInt64IterationContext(ucfpos : *mut UConstrainedFieldPosition, context : i64, ec : *mut UErrorCode));

// UNSUPPORTED Rust 503:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucfpos_setState(ucfpos : *mut UConstrainedFieldPosition, category : i32, field : i32, start : i32, limit : i32, ec : *mut UErrorCode));

// UNSUPPORTED Rust 504:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_cbFromUWriteBytes(args : *mut UConverterFromUnicodeArgs, source : windows_sys::core::PCSTR, length : i32, offsetindex : i32, err : *mut UErrorCode));

// UNSUPPORTED Rust 505:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_cbFromUWriteSub(args : *mut UConverterFromUnicodeArgs, offsetindex : i32, err : *mut UErrorCode));

// UNSUPPORTED Rust 506:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_cbFromUWriteUChars(args : *mut UConverterFromUnicodeArgs, source : *const *const u16, sourcelimit : *const u16, offsetindex : i32, err : *mut UErrorCode));

// UNSUPPORTED Rust 507:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_cbToUWriteSub(args : *mut UConverterToUnicodeArgs, offsetindex : i32, err : *mut UErrorCode));

// UNSUPPORTED Rust 508:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_cbToUWriteUChars(args : *mut UConverterToUnicodeArgs, source : *const u16, length : i32, offsetindex : i32, err : *mut UErrorCode));

// UNSUPPORTED Rust 509:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_close(converter : *mut UConverter));

// UNSUPPORTED Rust 510:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_compareNames(name1 : windows_sys::core::PCSTR, name2 : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 511:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_convert(toconvertername : windows_sys::core::PCSTR, fromconvertername : windows_sys::core::PCSTR, target : windows_sys::core::PCSTR, targetcapacity : i32, source : windows_sys::core::PCSTR, sourcelength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 512:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_convertEx(targetcnv : *mut UConverter, sourcecnv : *mut UConverter, target : *mut *mut i8, targetlimit : windows_sys::core::PCSTR, source : *const *const i8, sourcelimit : windows_sys::core::PCSTR, pivotstart : *mut u16, pivotsource : *mut *mut u16, pivottarget : *mut *mut u16, pivotlimit : *const u16, reset : i8, flush : i8, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 513:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_countAliases(alias : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode) -> u16);

// UNSUPPORTED Rust 514:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_countAvailable() -> i32);

// UNSUPPORTED Rust 515:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_countStandards() -> u16);

// UNSUPPORTED Rust 516:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_detectUnicodeSignature(source : windows_sys::core::PCSTR, sourcelength : i32, signaturelength : *mut i32, perrorcode : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 517:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_fixFileSeparator(cnv : *const UConverter, source : *mut u16, sourcelen : i32));

// UNSUPPORTED Rust 518:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_flushCache() -> i32);

// UNSUPPORTED Rust 519:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_fromAlgorithmic(cnv : *mut UConverter, algorithmictype : UConverterType, target : windows_sys::core::PCSTR, targetcapacity : i32, source : windows_sys::core::PCSTR, sourcelength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 520:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_fromUChars(cnv : *mut UConverter, dest : windows_sys::core::PCSTR, destcapacity : i32, src : *const u16, srclength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 521:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_fromUCountPending(cnv : *const UConverter, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 522:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_fromUnicode(converter : *mut UConverter, target : *mut *mut i8, targetlimit : windows_sys::core::PCSTR, source : *const *const u16, sourcelimit : *const u16, offsets : *mut i32, flush : i8, err : *mut UErrorCode));

// UNSUPPORTED Rust 523:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getAlias(alias : windows_sys::core::PCSTR, n : u16, perrorcode : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 524:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getAliases(alias : windows_sys::core::PCSTR, aliases : *const *const i8, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 525:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getAvailableName(n : i32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 526:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getCCSID(converter : *const UConverter, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 527:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getCanonicalName(alias : windows_sys::core::PCSTR, standard : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 528:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getDefaultName() -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 529:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getDisplayName(converter : *const UConverter, displaylocale : windows_sys::core::PCSTR, displayname : *mut u16, displaynamecapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 530:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getFromUCallBack(converter : *const UConverter, action : *mut UConverterFromUCallback, context : *const *const core::ffi::c_void));

// UNSUPPORTED Rust 531:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getInvalidChars(converter : *const UConverter, errbytes : windows_sys::core::PCSTR, len : *mut i8, err : *mut UErrorCode));

// UNSUPPORTED Rust 532:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getInvalidUChars(converter : *const UConverter, erruchars : *mut u16, len : *mut i8, err : *mut UErrorCode));

// UNSUPPORTED Rust 533:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getMaxCharSize(converter : *const UConverter) -> i8);

// UNSUPPORTED Rust 534:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getMinCharSize(converter : *const UConverter) -> i8);

// UNSUPPORTED Rust 535:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getName(converter : *const UConverter, err : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 536:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getNextUChar(converter : *mut UConverter, source : *const *const i8, sourcelimit : windows_sys::core::PCSTR, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 537:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getPlatform(converter : *const UConverter, err : *mut UErrorCode) -> UConverterPlatform);

// UNSUPPORTED Rust 538:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getStandard(n : u16, perrorcode : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 539:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getStandardName(name : windows_sys::core::PCSTR, standard : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 540:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getStarters(converter : *const UConverter, starters : *mut i8, err : *mut UErrorCode));

// UNSUPPORTED Rust 541:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getSubstChars(converter : *const UConverter, subchars : windows_sys::core::PCSTR, len : *mut i8, err : *mut UErrorCode));

// UNSUPPORTED Rust 542:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getToUCallBack(converter : *const UConverter, action : *mut UConverterToUCallback, context : *const *const core::ffi::c_void));

// UNSUPPORTED Rust 543:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getType(converter : *const UConverter) -> UConverterType);

// UNSUPPORTED Rust 544:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_getUnicodeSet(cnv : *const UConverter, setfillin : *mut USet, whichset : UConverterUnicodeSet, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 545:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_isAmbiguous(cnv : *const UConverter) -> i8);

// UNSUPPORTED Rust 546:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_isFixedWidth(cnv : *mut UConverter, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 547:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_open(convertername : windows_sys::core::PCSTR, err : *mut UErrorCode) -> *mut UConverter);

// UNSUPPORTED Rust 548:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_openAllNames(perrorcode : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 549:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_openCCSID(codepage : i32, platform : UConverterPlatform, err : *mut UErrorCode) -> *mut UConverter);

// UNSUPPORTED Rust 550:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_openPackage(packagename : windows_sys::core::PCSTR, convertername : windows_sys::core::PCSTR, err : *mut UErrorCode) -> *mut UConverter);

// UNSUPPORTED Rust 551:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_openStandardNames(convname : windows_sys::core::PCSTR, standard : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 552:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_openU(name : *const u16, err : *mut UErrorCode) -> *mut UConverter);

// UNSUPPORTED Rust 553:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_reset(converter : *mut UConverter));

// UNSUPPORTED Rust 554:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_resetFromUnicode(converter : *mut UConverter));

// UNSUPPORTED Rust 555:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_resetToUnicode(converter : *mut UConverter));

// UNSUPPORTED Rust 556:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_safeClone(cnv : *const UConverter, stackbuffer : *mut core::ffi::c_void, pbuffersize : *mut i32, status : *mut UErrorCode) -> *mut UConverter);

// UNSUPPORTED Rust 557:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_setDefaultName(name : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 558:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_setFallback(cnv : *mut UConverter, usesfallback : i8));

// UNSUPPORTED Rust 559:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_setFromUCallBack(converter : *mut UConverter, newaction : UConverterFromUCallback, newcontext : *const core::ffi::c_void, oldaction : *mut UConverterFromUCallback, oldcontext : *const *const core::ffi::c_void, err : *mut UErrorCode));

// UNSUPPORTED Rust 560:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_setSubstChars(converter : *mut UConverter, subchars : windows_sys::core::PCSTR, len : i8, err : *mut UErrorCode));

// UNSUPPORTED Rust 561:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_setSubstString(cnv : *mut UConverter, s : *const u16, length : i32, err : *mut UErrorCode));

// UNSUPPORTED Rust 562:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_setToUCallBack(converter : *mut UConverter, newaction : UConverterToUCallback, newcontext : *const core::ffi::c_void, oldaction : *mut UConverterToUCallback, oldcontext : *const *const core::ffi::c_void, err : *mut UErrorCode));

// UNSUPPORTED Rust 563:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_toAlgorithmic(algorithmictype : UConverterType, cnv : *mut UConverter, target : windows_sys::core::PCSTR, targetcapacity : i32, source : windows_sys::core::PCSTR, sourcelength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 564:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_toUChars(cnv : *mut UConverter, dest : *mut u16, destcapacity : i32, src : windows_sys::core::PCSTR, srclength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 565:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_toUCountPending(cnv : *const UConverter, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 566:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_toUnicode(converter : *mut UConverter, target : *mut *mut u16, targetlimit : *const u16, source : *const *const i8, sourcelimit : windows_sys::core::PCSTR, offsets : *mut i32, flush : i8, err : *mut UErrorCode));

// UNSUPPORTED Rust 567:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnv_usesFallback(cnv : *const UConverter) -> i8);

// UNSUPPORTED Rust 568:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnvsel_close(sel : *mut UConverterSelector));

// UNSUPPORTED Rust 569:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnvsel_open(converterlist : *const *const i8, converterlistsize : i32, excludedcodepoints : *const USet, whichset : UConverterUnicodeSet, status : *mut UErrorCode) -> *mut UConverterSelector);

// UNSUPPORTED Rust 570:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnvsel_openFromSerialized(buffer : *const core::ffi::c_void, length : i32, status : *mut UErrorCode) -> *mut UConverterSelector);

// UNSUPPORTED Rust 571:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnvsel_selectForString(sel : *const UConverterSelector, s : *const u16, length : i32, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 572:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnvsel_selectForUTF8(sel : *const UConverterSelector, s : windows_sys::core::PCSTR, length : i32, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 573:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucnvsel_serialize(sel : *const UConverterSelector, buffer : *mut core::ffi::c_void, buffercapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 574:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_cloneBinary(coll : *const UCollator, buffer : *mut u8, capacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 575:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_close(coll : *mut UCollator));

// UNSUPPORTED Rust 576:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_closeElements(elems : *mut UCollationElements));

// UNSUPPORTED Rust 577:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_countAvailable() -> i32);

// UNSUPPORTED Rust 578:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_equal(coll : *const UCollator, source : *const u16, sourcelength : i32, target : *const u16, targetlength : i32) -> i8);

// UNSUPPORTED Rust 579:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getAttribute(coll : *const UCollator, attr : UColAttribute, status : *mut UErrorCode) -> UColAttributeValue);

// UNSUPPORTED Rust 580:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getAvailable(localeindex : i32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 581:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getBound(source : *const u8, sourcelength : i32, boundtype : UColBoundMode, nooflevels : u32, result : *mut u8, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 582:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getContractionsAndExpansions(coll : *const UCollator, contractions : *mut USet, expansions : *mut USet, addprefixes : i8, status : *mut UErrorCode));

// UNSUPPORTED Rust 583:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getDisplayName(objloc : windows_sys::core::PCSTR, disploc : windows_sys::core::PCSTR, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 584:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getEquivalentReorderCodes(reordercode : i32, dest : *mut i32, destcapacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 585:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getFunctionalEquivalent(result : windows_sys::core::PCSTR, resultcapacity : i32, keyword : windows_sys::core::PCSTR, locale : windows_sys::core::PCSTR, isavailable : *mut i8, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 586:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getKeywordValues(keyword : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 587:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getKeywordValuesForLocale(key : windows_sys::core::PCSTR, locale : windows_sys::core::PCSTR, commonlyused : i8, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 588:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getKeywords(status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 589:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getLocaleByType(coll : *const UCollator, r#type : ULocDataLocaleType, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 590:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getMaxExpansion(elems : *const UCollationElements, order : i32) -> i32);

// UNSUPPORTED Rust 591:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getMaxVariable(coll : *const UCollator) -> UColReorderCode);

// UNSUPPORTED Rust 592:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getOffset(elems : *const UCollationElements) -> i32);

// UNSUPPORTED Rust 593:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getReorderCodes(coll : *const UCollator, dest : *mut i32, destcapacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 594:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getRules(coll : *const UCollator, length : *mut i32) -> *mut u16);

// UNSUPPORTED Rust 595:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getRulesEx(coll : *const UCollator, delta : UColRuleOption, buffer : *mut u16, bufferlen : i32) -> i32);

// UNSUPPORTED Rust 596:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getSortKey(coll : *const UCollator, source : *const u16, sourcelength : i32, result : *mut u8, resultlength : i32) -> i32);

// UNSUPPORTED Rust 597:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getStrength(coll : *const UCollator) -> UColAttributeValue);

// UNSUPPORTED Rust 598:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getTailoredSet(coll : *const UCollator, status : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 599:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getUCAVersion(coll : *const UCollator, info : *mut u8));

// UNSUPPORTED Rust 600:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getVariableTop(coll : *const UCollator, status : *mut UErrorCode) -> u32);

// UNSUPPORTED Rust 601:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_getVersion(coll : *const UCollator, info : *mut u8));

// UNSUPPORTED Rust 602:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_greater(coll : *const UCollator, source : *const u16, sourcelength : i32, target : *const u16, targetlength : i32) -> i8);

// UNSUPPORTED Rust 603:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_greaterOrEqual(coll : *const UCollator, source : *const u16, sourcelength : i32, target : *const u16, targetlength : i32) -> i8);

// UNSUPPORTED Rust 604:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_keyHashCode(key : *const u8, length : i32) -> i32);

// UNSUPPORTED Rust 605:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_mergeSortkeys(src1 : *const u8, src1length : i32, src2 : *const u8, src2length : i32, dest : *mut u8, destcapacity : i32) -> i32);

// UNSUPPORTED Rust 606:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_next(elems : *mut UCollationElements, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 607:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_nextSortKeyPart(coll : *const UCollator, iter : *mut UCharIterator, state : *mut u32, dest : *mut u8, count : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 608:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_open(loc : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UCollator);

// UNSUPPORTED Rust 609:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_openAvailableLocales(status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 610:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_openBinary(bin : *const u8, length : i32, base : *const UCollator, status : *mut UErrorCode) -> *mut UCollator);

// UNSUPPORTED Rust 611:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_openElements(coll : *const UCollator, text : *const u16, textlength : i32, status : *mut UErrorCode) -> *mut UCollationElements);

// UNSUPPORTED Rust 612:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_openRules(rules : *const u16, ruleslength : i32, normalizationmode : UColAttributeValue, strength : UColAttributeValue, parseerror : *mut UParseError, status : *mut UErrorCode) -> *mut UCollator);

// UNSUPPORTED Rust 613:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_previous(elems : *mut UCollationElements, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 614:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_primaryOrder(order : i32) -> i32);

// UNSUPPORTED Rust 615:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_reset(elems : *mut UCollationElements));

// UNSUPPORTED Rust 616:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_safeClone(coll : *const UCollator, stackbuffer : *mut core::ffi::c_void, pbuffersize : *mut i32, status : *mut UErrorCode) -> *mut UCollator);

// UNSUPPORTED Rust 617:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_secondaryOrder(order : i32) -> i32);

// UNSUPPORTED Rust 618:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_setAttribute(coll : *mut UCollator, attr : UColAttribute, value : UColAttributeValue, status : *mut UErrorCode));

// UNSUPPORTED Rust 619:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_setMaxVariable(coll : *mut UCollator, group : UColReorderCode, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 620:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_setOffset(elems : *mut UCollationElements, offset : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 621:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_setReorderCodes(coll : *mut UCollator, reordercodes : *const i32, reordercodeslength : i32, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 622:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_setStrength(coll : *mut UCollator, strength : UColAttributeValue));

// UNSUPPORTED Rust 623:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_setText(elems : *mut UCollationElements, text : *const u16, textlength : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 624:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_strcoll(coll : *const UCollator, source : *const u16, sourcelength : i32, target : *const u16, targetlength : i32) -> UCollationResult);

// UNSUPPORTED Rust 625:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_strcollIter(coll : *const UCollator, siter : *mut UCharIterator, titer : *mut UCharIterator, status : *mut UErrorCode) -> UCollationResult);

// UNSUPPORTED Rust 626:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_strcollUTF8(coll : *const UCollator, source : windows_sys::core::PCSTR, sourcelength : i32, target : windows_sys::core::PCSTR, targetlength : i32, status : *mut UErrorCode) -> UCollationResult);

// UNSUPPORTED Rust 627:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucol_tertiaryOrder(order : i32) -> i32);

// UNSUPPORTED Rust 628:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucpmap_get(map : *const UCPMap, c : i32) -> u32);

// UNSUPPORTED Rust 629:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucpmap_getRange(map : *const UCPMap, start : i32, option : UCPMapRangeOption, surrogatevalue : u32, filter : *mut UCPMapValueFilter, context : *const core::ffi::c_void, pvalue : *mut u32) -> i32);

// UNSUPPORTED Rust 630:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_close(trie : *mut UCPTrie));

// UNSUPPORTED Rust 631:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_get(trie : *const UCPTrie, c : i32) -> u32);

// UNSUPPORTED Rust 632:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_getRange(trie : *const UCPTrie, start : i32, option : UCPMapRangeOption, surrogatevalue : u32, filter : *mut UCPMapValueFilter, context : *const core::ffi::c_void, pvalue : *mut u32) -> i32);

// UNSUPPORTED Rust 633:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_getType(trie : *const UCPTrie) -> UCPTrieType);

// UNSUPPORTED Rust 634:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_getValueWidth(trie : *const UCPTrie) -> UCPTrieValueWidth);

// UNSUPPORTED Rust 635:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_internalSmallIndex(trie : *const UCPTrie, c : i32) -> i32);

// UNSUPPORTED Rust 636:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_internalSmallU8Index(trie : *const UCPTrie, lt1 : i32, t2 : u8, t3 : u8) -> i32);

// UNSUPPORTED Rust 637:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_internalU8PrevIndex(trie : *const UCPTrie, c : i32, start : *const u8, src : *const u8) -> i32);

// UNSUPPORTED Rust 638:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_openFromBinary(r#type : UCPTrieType, valuewidth : UCPTrieValueWidth, data : *const core::ffi::c_void, length : i32, pactuallength : *mut i32, perrorcode : *mut UErrorCode) -> *mut UCPTrie);

// UNSUPPORTED Rust 639:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ucptrie_toBinary(trie : *const UCPTrie, data : *mut core::ffi::c_void, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 640:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_close(ucsd : *mut UCharsetDetector));

// UNSUPPORTED Rust 641:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_detect(ucsd : *mut UCharsetDetector, status : *mut UErrorCode) -> *mut UCharsetMatch);

// UNSUPPORTED Rust 642:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_detectAll(ucsd : *mut UCharsetDetector, matchesfound : *mut i32, status : *mut UErrorCode) -> *mut *mut UCharsetMatch);

// UNSUPPORTED Rust 643:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_enableInputFilter(ucsd : *mut UCharsetDetector, filter : i8) -> i8);

// UNSUPPORTED Rust 644:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_getAllDetectableCharsets(ucsd : *const UCharsetDetector, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 645:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_getConfidence(ucsm : *const UCharsetMatch, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 646:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_getLanguage(ucsm : *const UCharsetMatch, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 647:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_getName(ucsm : *const UCharsetMatch, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 648:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_getUChars(ucsm : *const UCharsetMatch, buf : *mut u16, cap : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 649:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_isInputFilterEnabled(ucsd : *const UCharsetDetector) -> i8);

// UNSUPPORTED Rust 650:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_open(status : *mut UErrorCode) -> *mut UCharsetDetector);

// UNSUPPORTED Rust 651:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_setDeclaredEncoding(ucsd : *mut UCharsetDetector, encoding : windows_sys::core::PCSTR, length : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 652:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ucsdet_setText(ucsd : *mut UCharsetDetector, textin : windows_sys::core::PCSTR, len : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 653:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_countCurrencies(locale : windows_sys::core::PCSTR, date : f64, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 654:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_forLocale(locale : windows_sys::core::PCSTR, buff : *mut u16, buffcapacity : i32, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 655:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_forLocaleAndDate(locale : windows_sys::core::PCSTR, date : f64, index : i32, buff : *mut u16, buffcapacity : i32, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 656:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_getDefaultFractionDigits(currency : *const u16, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 657:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_getDefaultFractionDigitsForUsage(currency : *const u16, usage : UCurrencyUsage, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 658:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_getKeywordValuesForLocale(key : windows_sys::core::PCSTR, locale : windows_sys::core::PCSTR, commonlyused : i8, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 659:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_getName(currency : *const u16, locale : windows_sys::core::PCSTR, namestyle : UCurrNameStyle, ischoiceformat : *mut i8, len : *mut i32, ec : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 660:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_getNumericCode(currency : *const u16) -> i32);

// UNSUPPORTED Rust 661:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_getPluralName(currency : *const u16, locale : windows_sys::core::PCSTR, ischoiceformat : *mut i8, pluralcount : windows_sys::core::PCSTR, len : *mut i32, ec : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 662:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_getRoundingIncrement(currency : *const u16, ec : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 663:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_getRoundingIncrementForUsage(currency : *const u16, usage : UCurrencyUsage, ec : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 664:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_isAvailable(isocode : *const u16, from : f64, to : f64, errorcode : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 665:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_openISOCurrencies(currtype : u32, perrorcode : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 666:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_register(isocode : *const u16, locale : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 667:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ucurr_unregister(key : *mut core::ffi::c_void, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 668:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_adoptNumberFormat(fmt : *mut *mut core::ffi::c_void, numberformattoadopt : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 669:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_adoptNumberFormatForFields(fmt : *mut *mut core::ffi::c_void, fields : *const u16, numberformattoset : *mut *mut core::ffi::c_void, status : *mut UErrorCode));

// UNSUPPORTED Rust 670:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_applyPattern(format : *mut *mut core::ffi::c_void, localized : i8, pattern : *const u16, patternlength : i32));

// UNSUPPORTED Rust 671:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_clone(fmt : *const *const core::ffi::c_void, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 672:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_close(format : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 673:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_countAvailable() -> i32);

// UNSUPPORTED Rust 674:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_countSymbols(fmt : *const *const core::ffi::c_void, r#type : UDateFormatSymbolType) -> i32);

// UNSUPPORTED Rust 675:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_format(format : *const *const core::ffi::c_void, datetoformat : f64, result : *mut u16, resultlength : i32, position : *mut UFieldPosition, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 676:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_formatCalendar(format : *const *const core::ffi::c_void, calendar : *mut *mut core::ffi::c_void, result : *mut u16, capacity : i32, position : *mut UFieldPosition, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 677:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_formatCalendarForFields(format : *const *const core::ffi::c_void, calendar : *mut *mut core::ffi::c_void, result : *mut u16, capacity : i32, fpositer : *mut UFieldPositionIterator, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 678:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_formatForFields(format : *const *const core::ffi::c_void, datetoformat : f64, result : *mut u16, resultlength : i32, fpositer : *mut UFieldPositionIterator, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 679:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_get2DigitYearStart(fmt : *const *const core::ffi::c_void, status : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 680:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_getAvailable(localeindex : i32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 681:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_getBooleanAttribute(fmt : *const *const core::ffi::c_void, attr : UDateFormatBooleanAttribute, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 682:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_getCalendar(fmt : *const *const core::ffi::c_void) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 683:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_getContext(fmt : *const *const core::ffi::c_void, r#type : UDisplayContextType, status : *mut UErrorCode) -> UDisplayContext);

// UNSUPPORTED Rust 684:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_getLocaleByType(fmt : *const *const core::ffi::c_void, r#type : ULocDataLocaleType, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 685:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_getNumberFormat(fmt : *const *const core::ffi::c_void) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 686:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_getNumberFormatForField(fmt : *const *const core::ffi::c_void, field : u16) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 687:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_getSymbols(fmt : *const *const core::ffi::c_void, r#type : UDateFormatSymbolType, symbolindex : i32, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 688:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_isLenient(fmt : *const *const core::ffi::c_void) -> i8);

// UNSUPPORTED Rust 689:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_open(timestyle : UDateFormatStyle, datestyle : UDateFormatStyle, locale : windows_sys::core::PCSTR, tzid : *const u16, tzidlength : i32, pattern : *const u16, patternlength : i32, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 690:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_parse(format : *const *const core::ffi::c_void, text : *const u16, textlength : i32, parsepos : *mut i32, status : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 691:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_parseCalendar(format : *const *const core::ffi::c_void, calendar : *mut *mut core::ffi::c_void, text : *const u16, textlength : i32, parsepos : *mut i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 692:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_set2DigitYearStart(fmt : *mut *mut core::ffi::c_void, d : f64, status : *mut UErrorCode));

// UNSUPPORTED Rust 693:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_setBooleanAttribute(fmt : *mut *mut core::ffi::c_void, attr : UDateFormatBooleanAttribute, newvalue : i8, status : *mut UErrorCode));

// UNSUPPORTED Rust 694:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_setCalendar(fmt : *mut *mut core::ffi::c_void, calendartoset : *const *const core::ffi::c_void));

// UNSUPPORTED Rust 695:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_setContext(fmt : *mut *mut core::ffi::c_void, value : UDisplayContext, status : *mut UErrorCode));

// UNSUPPORTED Rust 696:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_setLenient(fmt : *mut *mut core::ffi::c_void, islenient : i8));

// UNSUPPORTED Rust 697:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_setNumberFormat(fmt : *mut *mut core::ffi::c_void, numberformattoset : *const *const core::ffi::c_void));

// UNSUPPORTED Rust 698:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_setSymbols(format : *mut *mut core::ffi::c_void, r#type : UDateFormatSymbolType, symbolindex : i32, value : *mut u16, valuelength : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 699:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_toCalendarDateField(field : UDateFormatField) -> UCalendarDateFields);

// UNSUPPORTED Rust 700:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udat_toPattern(fmt : *const *const core::ffi::c_void, localized : i8, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 701:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_addPattern(dtpg : *mut *mut core::ffi::c_void, pattern : *const u16, patternlength : i32, r#override : i8, conflictingpattern : *mut u16, capacity : i32, plength : *mut i32, perrorcode : *mut UErrorCode) -> UDateTimePatternConflict);

// UNSUPPORTED Rust 702:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_clone(dtpg : *const *const core::ffi::c_void, perrorcode : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 703:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_close(dtpg : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 704:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_getAppendItemFormat(dtpg : *const *const core::ffi::c_void, field : UDateTimePatternField, plength : *mut i32) -> *mut u16);

// UNSUPPORTED Rust 705:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_getAppendItemName(dtpg : *const *const core::ffi::c_void, field : UDateTimePatternField, plength : *mut i32) -> *mut u16);

// UNSUPPORTED Rust 706:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_getBaseSkeleton(unuseddtpg : *mut *mut core::ffi::c_void, pattern : *const u16, length : i32, baseskeleton : *mut u16, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 707:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_getBestPattern(dtpg : *mut *mut core::ffi::c_void, skeleton : *const u16, length : i32, bestpattern : *mut u16, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 708:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_getBestPatternWithOptions(dtpg : *mut *mut core::ffi::c_void, skeleton : *const u16, length : i32, options : UDateTimePatternMatchOptions, bestpattern : *mut u16, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 709:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_getDateTimeFormat(dtpg : *const *const core::ffi::c_void, plength : *mut i32) -> *mut u16);

// UNSUPPORTED Rust 710:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_getDecimal(dtpg : *const *const core::ffi::c_void, plength : *mut i32) -> *mut u16);

// UNSUPPORTED Rust 711:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn udatpg_getFieldDisplayName(dtpg : *const *const core::ffi::c_void, field : UDateTimePatternField, width : UDateTimePGDisplayWidth, fieldname : *mut u16, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 712:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_getPatternForSkeleton(dtpg : *const *const core::ffi::c_void, skeleton : *const u16, skeletonlength : i32, plength : *mut i32) -> *mut u16);

// UNSUPPORTED Rust 713:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_getSkeleton(unuseddtpg : *mut *mut core::ffi::c_void, pattern : *const u16, length : i32, skeleton : *mut u16, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 714:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_open(locale : windows_sys::core::PCSTR, perrorcode : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 715:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_openBaseSkeletons(dtpg : *const *const core::ffi::c_void, perrorcode : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 716:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_openEmpty(perrorcode : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 717:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_openSkeletons(dtpg : *const *const core::ffi::c_void, perrorcode : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 718:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_replaceFieldTypes(dtpg : *mut *mut core::ffi::c_void, pattern : *const u16, patternlength : i32, skeleton : *const u16, skeletonlength : i32, dest : *mut u16, destcapacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 719:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_replaceFieldTypesWithOptions(dtpg : *mut *mut core::ffi::c_void, pattern : *const u16, patternlength : i32, skeleton : *const u16, skeletonlength : i32, options : UDateTimePatternMatchOptions, dest : *mut u16, destcapacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 720:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_setAppendItemFormat(dtpg : *mut *mut core::ffi::c_void, field : UDateTimePatternField, value : *const u16, length : i32));

// UNSUPPORTED Rust 721:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_setAppendItemName(dtpg : *mut *mut core::ffi::c_void, field : UDateTimePatternField, value : *const u16, length : i32));

// UNSUPPORTED Rust 722:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_setDateTimeFormat(dtpg : *const *const core::ffi::c_void, dtformat : *const u16, length : i32));

// UNSUPPORTED Rust 723:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udatpg_setDecimal(dtpg : *mut *mut core::ffi::c_void, decimal : *const u16, length : i32));

// UNSUPPORTED Rust 724:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udtitvfmt_close(formatter : *mut UDateIntervalFormat));

// UNSUPPORTED Rust 725:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn udtitvfmt_closeResult(uresult : *mut UFormattedDateInterval));

// UNSUPPORTED Rust 726:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udtitvfmt_format(formatter : *const UDateIntervalFormat, fromdate : f64, todate : f64, result : *mut u16, resultcapacity : i32, position : *mut UFieldPosition, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 727:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn udtitvfmt_open(locale : windows_sys::core::PCSTR, skeleton : *const u16, skeletonlength : i32, tzid : *const u16, tzidlength : i32, status : *mut UErrorCode) -> *mut UDateIntervalFormat);

// UNSUPPORTED Rust 728:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn udtitvfmt_openResult(ec : *mut UErrorCode) -> *mut UFormattedDateInterval);

// UNSUPPORTED Rust 729:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn udtitvfmt_resultAsValue(uresult : *const UFormattedDateInterval, ec : *mut UErrorCode) -> *mut UFormattedValue);

// UNSUPPORTED Rust 730:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uenum_close(en : *mut UEnumeration));

// UNSUPPORTED Rust 731:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uenum_count(en : *mut UEnumeration, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 732:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uenum_next(en : *mut UEnumeration, resultlength : *mut i32, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 733:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uenum_openCharStringsEnumeration(strings : *const *const i8, count : i32, ec : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 734:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uenum_openUCharStringsEnumeration(strings : *const *const u16, count : i32, ec : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 735:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uenum_reset(en : *mut UEnumeration, status : *mut UErrorCode));

// UNSUPPORTED Rust 736:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uenum_unext(en : *mut UEnumeration, resultlength : *mut i32, status : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 737:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufieldpositer_close(fpositer : *mut UFieldPositionIterator));

// UNSUPPORTED Rust 738:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufieldpositer_next(fpositer : *mut UFieldPositionIterator, beginindex : *mut i32, endindex : *mut i32) -> i32);

// UNSUPPORTED Rust 739:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufieldpositer_open(status : *mut UErrorCode) -> *mut UFieldPositionIterator);

// UNSUPPORTED Rust 740:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_close(fmt : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 741:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getArrayItemByIndex(fmt : *mut *mut core::ffi::c_void, n : i32, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 742:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getArrayLength(fmt : *const *const core::ffi::c_void, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 743:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getDate(fmt : *const *const core::ffi::c_void, status : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 744:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getDecNumChars(fmt : *mut *mut core::ffi::c_void, len : *mut i32, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 745:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getDouble(fmt : *mut *mut core::ffi::c_void, status : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 746:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getInt64(fmt : *mut *mut core::ffi::c_void, status : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 747:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getLong(fmt : *mut *mut core::ffi::c_void, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 748:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getObject(fmt : *const *const core::ffi::c_void, status : *mut UErrorCode) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 749:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getType(fmt : *const *const core::ffi::c_void, status : *mut UErrorCode) -> UFormattableType);

// UNSUPPORTED Rust 750:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_getUChars(fmt : *mut *mut core::ffi::c_void, len : *mut i32, status : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 751:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_isNumeric(fmt : *const *const core::ffi::c_void) -> i8);

// UNSUPPORTED Rust 752:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ufmt_open(status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 753:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ufmtval_getString(ufmtval : *const UFormattedValue, plength : *mut i32, ec : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 754:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ufmtval_nextPosition(ufmtval : *const UFormattedValue, ucfpos : *mut UConstrainedFieldPosition, ec : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 755:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ugender_getInstance(locale : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UGenderInfo);

// UNSUPPORTED Rust 756:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ugender_getListGender(genderinfo : *const UGenderInfo, genders : *const UGender, size : i32, status : *mut UErrorCode) -> UGender);

// UNSUPPORTED Rust 757:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_close(idna : *mut UIDNA));

// UNSUPPORTED Rust 758:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_labelToASCII(idna : *const UIDNA, label : *const u16, length : i32, dest : *mut u16, capacity : i32, pinfo : *mut UIDNAInfo, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 759:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_labelToASCII_UTF8(idna : *const UIDNA, label : windows_sys::core::PCSTR, length : i32, dest : windows_sys::core::PCSTR, capacity : i32, pinfo : *mut UIDNAInfo, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 760:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_labelToUnicode(idna : *const UIDNA, label : *const u16, length : i32, dest : *mut u16, capacity : i32, pinfo : *mut UIDNAInfo, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 761:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_labelToUnicodeUTF8(idna : *const UIDNA, label : windows_sys::core::PCSTR, length : i32, dest : windows_sys::core::PCSTR, capacity : i32, pinfo : *mut UIDNAInfo, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 762:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_nameToASCII(idna : *const UIDNA, name : *const u16, length : i32, dest : *mut u16, capacity : i32, pinfo : *mut UIDNAInfo, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 763:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_nameToASCII_UTF8(idna : *const UIDNA, name : windows_sys::core::PCSTR, length : i32, dest : windows_sys::core::PCSTR, capacity : i32, pinfo : *mut UIDNAInfo, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 764:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_nameToUnicode(idna : *const UIDNA, name : *const u16, length : i32, dest : *mut u16, capacity : i32, pinfo : *mut UIDNAInfo, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 765:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_nameToUnicodeUTF8(idna : *const UIDNA, name : windows_sys::core::PCSTR, length : i32, dest : windows_sys::core::PCSTR, capacity : i32, pinfo : *mut UIDNAInfo, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 766:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uidna_openUTS46(options : u32, perrorcode : *mut UErrorCode) -> *mut UIDNA);

// UNSUPPORTED Rust 767:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uiter_current32(iter : *mut UCharIterator) -> i32);

// UNSUPPORTED Rust 768:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uiter_getState(iter : *const UCharIterator) -> u32);

// UNSUPPORTED Rust 769:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uiter_next32(iter : *mut UCharIterator) -> i32);

// UNSUPPORTED Rust 770:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uiter_previous32(iter : *mut UCharIterator) -> i32);

// UNSUPPORTED Rust 771:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uiter_setState(iter : *mut UCharIterator, state : u32, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 772:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uiter_setString(iter : *mut UCharIterator, s : *const u16, length : i32));

// UNSUPPORTED Rust 773:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uiter_setUTF16BE(iter : *mut UCharIterator, s : windows_sys::core::PCSTR, length : i32));

// UNSUPPORTED Rust 774:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uiter_setUTF8(iter : *mut UCharIterator, s : windows_sys::core::PCSTR, length : i32));

// UNSUPPORTED Rust 775:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_close(ldn : *mut ULocaleDisplayNames));

// UNSUPPORTED Rust 776:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_getContext(ldn : *const ULocaleDisplayNames, r#type : UDisplayContextType, perrorcode : *mut UErrorCode) -> UDisplayContext);

// UNSUPPORTED Rust 777:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_getDialectHandling(ldn : *const ULocaleDisplayNames) -> UDialectHandling);

// UNSUPPORTED Rust 778:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_getLocale(ldn : *const ULocaleDisplayNames) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 779:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_keyDisplayName(ldn : *const ULocaleDisplayNames, key : windows_sys::core::PCSTR, result : *mut u16, maxresultsize : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 780:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_keyValueDisplayName(ldn : *const ULocaleDisplayNames, key : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, result : *mut u16, maxresultsize : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 781:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_languageDisplayName(ldn : *const ULocaleDisplayNames, lang : windows_sys::core::PCSTR, result : *mut u16, maxresultsize : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 782:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_localeDisplayName(ldn : *const ULocaleDisplayNames, locale : windows_sys::core::PCSTR, result : *mut u16, maxresultsize : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 783:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_open(locale : windows_sys::core::PCSTR, dialecthandling : UDialectHandling, perrorcode : *mut UErrorCode) -> *mut ULocaleDisplayNames);

// UNSUPPORTED Rust 784:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_openForContext(locale : windows_sys::core::PCSTR, contexts : *mut UDisplayContext, length : i32, perrorcode : *mut UErrorCode) -> *mut ULocaleDisplayNames);

// UNSUPPORTED Rust 785:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_regionDisplayName(ldn : *const ULocaleDisplayNames, region : windows_sys::core::PCSTR, result : *mut u16, maxresultsize : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 786:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_scriptCodeDisplayName(ldn : *const ULocaleDisplayNames, scriptcode : UScriptCode, result : *mut u16, maxresultsize : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 787:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_scriptDisplayName(ldn : *const ULocaleDisplayNames, script : windows_sys::core::PCSTR, result : *mut u16, maxresultsize : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 788:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uldn_variantDisplayName(ldn : *const ULocaleDisplayNames, variant : windows_sys::core::PCSTR, result : *mut u16, maxresultsize : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 789:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ulistfmt_close(listfmt : *mut UListFormatter));

// UNSUPPORTED Rust 790:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ulistfmt_closeResult(uresult : *mut UFormattedList));

// UNSUPPORTED Rust 791:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ulistfmt_format(listfmt : *const UListFormatter, strings : *const *const u16, stringlengths : *const i32, stringcount : i32, result : *mut u16, resultcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 792:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ulistfmt_formatStringsToResult(listfmt : *const UListFormatter, strings : *const *const u16, stringlengths : *const i32, stringcount : i32, uresult : *mut UFormattedList, status : *mut UErrorCode));

// UNSUPPORTED Rust 793:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ulistfmt_open(locale : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UListFormatter);

// UNSUPPORTED Rust 794:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ulistfmt_openForType(locale : windows_sys::core::PCSTR, r#type : UListFormatterType, width : UListFormatterWidth, status : *mut UErrorCode) -> *mut UListFormatter);

// UNSUPPORTED Rust 795:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ulistfmt_openResult(ec : *mut UErrorCode) -> *mut UFormattedList);

// UNSUPPORTED Rust 796:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ulistfmt_resultAsValue(uresult : *const UFormattedList, ec : *mut UErrorCode) -> *mut UFormattedValue);

// UNSUPPORTED Rust 797:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_acceptLanguage(result : windows_sys::core::PCSTR, resultavailable : i32, outresult : *mut UAcceptResult, acceptlist : *const *const i8, acceptlistcount : i32, availablelocales : *mut UEnumeration, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 798:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_acceptLanguageFromHTTP(result : windows_sys::core::PCSTR, resultavailable : i32, outresult : *mut UAcceptResult, httpacceptlanguage : windows_sys::core::PCSTR, availablelocales : *mut UEnumeration, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 799:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_addLikelySubtags(localeid : windows_sys::core::PCSTR, maximizedlocaleid : windows_sys::core::PCSTR, maximizedlocaleidcapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 800:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_canonicalize(localeid : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, namecapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 801:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_countAvailable() -> i32);

// UNSUPPORTED Rust 802:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_forLanguageTag(langtag : windows_sys::core::PCSTR, localeid : windows_sys::core::PCSTR, localeidcapacity : i32, parsedlength : *mut i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 803:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getAvailable(n : i32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 804:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getBaseName(localeid : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, namecapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 805:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getCharacterOrientation(localeid : windows_sys::core::PCSTR, status : *mut UErrorCode) -> ULayoutType);

// UNSUPPORTED Rust 806:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getCountry(localeid : windows_sys::core::PCSTR, country : windows_sys::core::PCSTR, countrycapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 807:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getDefault() -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 808:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getDisplayCountry(locale : windows_sys::core::PCSTR, displaylocale : windows_sys::core::PCSTR, country : *mut u16, countrycapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 809:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getDisplayKeyword(keyword : windows_sys::core::PCSTR, displaylocale : windows_sys::core::PCSTR, dest : *mut u16, destcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 810:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getDisplayKeywordValue(locale : windows_sys::core::PCSTR, keyword : windows_sys::core::PCSTR, displaylocale : windows_sys::core::PCSTR, dest : *mut u16, destcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 811:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getDisplayLanguage(locale : windows_sys::core::PCSTR, displaylocale : windows_sys::core::PCSTR, language : *mut u16, languagecapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 812:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getDisplayName(localeid : windows_sys::core::PCSTR, inlocaleid : windows_sys::core::PCSTR, result : *mut u16, maxresultsize : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 813:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getDisplayScript(locale : windows_sys::core::PCSTR, displaylocale : windows_sys::core::PCSTR, script : *mut u16, scriptcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 814:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getDisplayVariant(locale : windows_sys::core::PCSTR, displaylocale : windows_sys::core::PCSTR, variant : *mut u16, variantcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 815:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getISO3Country(localeid : windows_sys::core::PCSTR) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 816:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getISO3Language(localeid : windows_sys::core::PCSTR) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 817:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getISOCountries() -> *mut *mut i8);

// UNSUPPORTED Rust 818:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getISOLanguages() -> *mut *mut i8);

// UNSUPPORTED Rust 819:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getKeywordValue(localeid : windows_sys::core::PCSTR, keywordname : windows_sys::core::PCSTR, buffer : windows_sys::core::PCSTR, buffercapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 820:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getLCID(localeid : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 821:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getLanguage(localeid : windows_sys::core::PCSTR, language : windows_sys::core::PCSTR, languagecapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 822:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getLineOrientation(localeid : windows_sys::core::PCSTR, status : *mut UErrorCode) -> ULayoutType);

// UNSUPPORTED Rust 823:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getLocaleForLCID(hostid : u32, locale : windows_sys::core::PCSTR, localecapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 824:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getName(localeid : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, namecapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 825:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getParent(localeid : windows_sys::core::PCSTR, parent : windows_sys::core::PCSTR, parentcapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 826:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getScript(localeid : windows_sys::core::PCSTR, script : windows_sys::core::PCSTR, scriptcapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 827:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_getVariant(localeid : windows_sys::core::PCSTR, variant : windows_sys::core::PCSTR, variantcapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 828:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_isRightToLeft(locale : windows_sys::core::PCSTR) -> i8);

// UNSUPPORTED Rust 829:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_minimizeSubtags(localeid : windows_sys::core::PCSTR, minimizedlocaleid : windows_sys::core::PCSTR, minimizedlocaleidcapacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 830:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn uloc_openAvailableByType(r#type : ULocAvailableType, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 831:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_openKeywords(localeid : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 832:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_setDefault(localeid : windows_sys::core::PCSTR, status : *mut UErrorCode));

// UNSUPPORTED Rust 833:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_setKeywordValue(keywordname : windows_sys::core::PCSTR, keywordvalue : windows_sys::core::PCSTR, buffer : windows_sys::core::PCSTR, buffercapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 834:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_toLanguageTag(localeid : windows_sys::core::PCSTR, langtag : windows_sys::core::PCSTR, langtagcapacity : i32, strict : i8, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 835:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_toLegacyKey(keyword : windows_sys::core::PCSTR) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 836:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_toLegacyType(keyword : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 837:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_toUnicodeLocaleKey(keyword : windows_sys::core::PCSTR) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 838:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uloc_toUnicodeLocaleType(keyword : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 839:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_close(uld : *mut ULocaleData));

// UNSUPPORTED Rust 840:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_getCLDRVersion(versionarray : *mut u8, status : *mut UErrorCode));

// UNSUPPORTED Rust 841:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_getDelimiter(uld : *mut ULocaleData, r#type : ULocaleDataDelimiterType, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 842:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_getExemplarSet(uld : *mut ULocaleData, fillin : *mut USet, options : u32, extype : ULocaleDataExemplarSetType, status : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 843:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_getLocaleDisplayPattern(uld : *mut ULocaleData, pattern : *mut u16, patterncapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 844:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_getLocaleSeparator(uld : *mut ULocaleData, separator : *mut u16, separatorcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 845:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_getMeasurementSystem(localeid : windows_sys::core::PCSTR, status : *mut UErrorCode) -> UMeasurementSystem);

// UNSUPPORTED Rust 846:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_getNoSubstitute(uld : *mut ULocaleData) -> i8);

// UNSUPPORTED Rust 847:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_getPaperSize(localeid : windows_sys::core::PCSTR, height : *mut i32, width : *mut i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 848:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_open(localeid : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut ULocaleData);

// UNSUPPORTED Rust 849:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ulocdata_setNoSubstitute(uld : *mut ULocaleData, setting : i8));

// UNSUPPORTED Rust 850:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_applyPattern(fmt : *mut *mut core::ffi::c_void, pattern : *const u16, patternlength : i32, parseerror : *mut UParseError, status : *mut UErrorCode));

// UNSUPPORTED Rust 851:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_autoQuoteApostrophe(pattern : *const u16, patternlength : i32, dest : *mut u16, destcapacity : i32, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 852:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_clone(fmt : *const *const core::ffi::c_void, status : *mut UErrorCode) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 853:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_close(format : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 854:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_format(fmt : *const *const core::ffi::c_void, result : *mut u16, resultlength : i32, status : *mut UErrorCode, ...) -> i32);

// UNSUPPORTED Rust 855:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_getLocale(fmt : *const *const core::ffi::c_void) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 856:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_open(pattern : *const u16, patternlength : i32, locale : windows_sys::core::PCSTR, parseerror : *mut UParseError, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 857:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_parse(fmt : *const *const core::ffi::c_void, source : *const u16, sourcelength : i32, count : *mut i32, status : *mut UErrorCode, ...));

// UNSUPPORTED Rust 858:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_setLocale(fmt : *mut *mut core::ffi::c_void, locale : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 859:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_toPattern(fmt : *const *const core::ffi::c_void, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 860:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_vformat(fmt : *const *const core::ffi::c_void, result : *mut u16, resultlength : i32, ap : *mut i8, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 861:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn umsg_vparse(fmt : *const *const core::ffi::c_void, source : *const u16, sourcelength : i32, count : *mut i32, ap : *mut i8, status : *mut UErrorCode));

// UNSUPPORTED Rust 862:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_buildImmutable(trie : *mut UMutableCPTrie, r#type : UCPTrieType, valuewidth : UCPTrieValueWidth, perrorcode : *mut UErrorCode) -> *mut UCPTrie);

// UNSUPPORTED Rust 863:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_clone(other : *const UMutableCPTrie, perrorcode : *mut UErrorCode) -> *mut UMutableCPTrie);

// UNSUPPORTED Rust 864:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_close(trie : *mut UMutableCPTrie));

// UNSUPPORTED Rust 865:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_fromUCPMap(map : *const UCPMap, perrorcode : *mut UErrorCode) -> *mut UMutableCPTrie);

// UNSUPPORTED Rust 866:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_fromUCPTrie(trie : *const UCPTrie, perrorcode : *mut UErrorCode) -> *mut UMutableCPTrie);

// UNSUPPORTED Rust 867:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_get(trie : *const UMutableCPTrie, c : i32) -> u32);

// UNSUPPORTED Rust 868:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_getRange(trie : *const UMutableCPTrie, start : i32, option : UCPMapRangeOption, surrogatevalue : u32, filter : *mut UCPMapValueFilter, context : *const core::ffi::c_void, pvalue : *mut u32) -> i32);

// UNSUPPORTED Rust 869:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_open(initialvalue : u32, errorvalue : u32, perrorcode : *mut UErrorCode) -> *mut UMutableCPTrie);

// UNSUPPORTED Rust 870:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_set(trie : *mut UMutableCPTrie, c : i32, value : u32, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 871:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn umutablecptrie_setRange(trie : *mut UMutableCPTrie, start : i32, end : i32, value : u32, perrorcode : *mut UErrorCode));

// UNSUPPORTED Rust 872:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_append(norm2 : *const UNormalizer2, first : *mut u16, firstlength : i32, firstcapacity : i32, second : *const u16, secondlength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 873:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_close(norm2 : *mut UNormalizer2));

// UNSUPPORTED Rust 874:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_composePair(norm2 : *const UNormalizer2, a : i32, b : i32) -> i32);

// UNSUPPORTED Rust 875:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_getCombiningClass(norm2 : *const UNormalizer2, c : i32) -> u8);

// UNSUPPORTED Rust 876:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_getDecomposition(norm2 : *const UNormalizer2, c : i32, decomposition : *mut u16, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 877:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_getInstance(packagename : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, mode : UNormalization2Mode, perrorcode : *mut UErrorCode) -> *mut UNormalizer2);

// UNSUPPORTED Rust 878:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_getNFCInstance(perrorcode : *mut UErrorCode) -> *mut UNormalizer2);

// UNSUPPORTED Rust 879:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_getNFDInstance(perrorcode : *mut UErrorCode) -> *mut UNormalizer2);

// UNSUPPORTED Rust 880:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_getNFKCCasefoldInstance(perrorcode : *mut UErrorCode) -> *mut UNormalizer2);

// UNSUPPORTED Rust 881:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_getNFKCInstance(perrorcode : *mut UErrorCode) -> *mut UNormalizer2);

// UNSUPPORTED Rust 882:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_getNFKDInstance(perrorcode : *mut UErrorCode) -> *mut UNormalizer2);

// UNSUPPORTED Rust 883:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_getRawDecomposition(norm2 : *const UNormalizer2, c : i32, decomposition : *mut u16, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 884:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_hasBoundaryAfter(norm2 : *const UNormalizer2, c : i32) -> i8);

// UNSUPPORTED Rust 885:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_hasBoundaryBefore(norm2 : *const UNormalizer2, c : i32) -> i8);

// UNSUPPORTED Rust 886:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_isInert(norm2 : *const UNormalizer2, c : i32) -> i8);

// UNSUPPORTED Rust 887:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_isNormalized(norm2 : *const UNormalizer2, s : *const u16, length : i32, perrorcode : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 888:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_normalize(norm2 : *const UNormalizer2, src : *const u16, length : i32, dest : *mut u16, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 889:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_normalizeSecondAndAppend(norm2 : *const UNormalizer2, first : *mut u16, firstlength : i32, firstcapacity : i32, second : *const u16, secondlength : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 890:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_openFiltered(norm2 : *const UNormalizer2, filterset : *const USet, perrorcode : *mut UErrorCode) -> *mut UNormalizer2);

// UNSUPPORTED Rust 891:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_quickCheck(norm2 : *const UNormalizer2, s : *const u16, length : i32, perrorcode : *mut UErrorCode) -> UNormalizationCheckResult);

// UNSUPPORTED Rust 892:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm2_spanQuickCheckYes(norm2 : *const UNormalizer2, s : *const u16, length : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 893:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn unorm_compare(s1 : *const u16, length1 : i32, s2 : *const u16, length2 : i32, options : u32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 894:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_applyPattern(format : *mut *mut core::ffi::c_void, localized : i8, pattern : *const u16, patternlength : i32, parseerror : *mut UParseError, status : *mut UErrorCode));

// UNSUPPORTED Rust 895:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_clone(fmt : *const *const core::ffi::c_void, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 896:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_close(fmt : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 897:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_countAvailable() -> i32);

// UNSUPPORTED Rust 898:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_format(fmt : *const *const core::ffi::c_void, number : i32, result : *mut u16, resultlength : i32, pos : *mut UFieldPosition, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 899:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_formatDecimal(fmt : *const *const core::ffi::c_void, number : windows_sys::core::PCSTR, length : i32, result : *mut u16, resultlength : i32, pos : *mut UFieldPosition, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 900:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_formatDouble(fmt : *const *const core::ffi::c_void, number : f64, result : *mut u16, resultlength : i32, pos : *mut UFieldPosition, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 901:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_formatDoubleCurrency(fmt : *const *const core::ffi::c_void, number : f64, currency : *mut u16, result : *mut u16, resultlength : i32, pos : *mut UFieldPosition, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 902:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_formatDoubleForFields(format : *const *const core::ffi::c_void, number : f64, result : *mut u16, resultlength : i32, fpositer : *mut UFieldPositionIterator, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 903:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_formatInt64(fmt : *const *const core::ffi::c_void, number : i64, result : *mut u16, resultlength : i32, pos : *mut UFieldPosition, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 904:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_formatUFormattable(fmt : *const *const core::ffi::c_void, number : *const *const core::ffi::c_void, result : *mut u16, resultlength : i32, pos : *mut UFieldPosition, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 905:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_getAttribute(fmt : *const *const core::ffi::c_void, attr : UNumberFormatAttribute) -> i32);

// UNSUPPORTED Rust 906:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_getAvailable(localeindex : i32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 907:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_getContext(fmt : *const *const core::ffi::c_void, r#type : UDisplayContextType, status : *mut UErrorCode) -> UDisplayContext);

// UNSUPPORTED Rust 908:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_getDoubleAttribute(fmt : *const *const core::ffi::c_void, attr : UNumberFormatAttribute) -> f64);

// UNSUPPORTED Rust 909:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_getLocaleByType(fmt : *const *const core::ffi::c_void, r#type : ULocDataLocaleType, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 910:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_getSymbol(fmt : *const *const core::ffi::c_void, symbol : UNumberFormatSymbol, buffer : *mut u16, size : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 911:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_getTextAttribute(fmt : *const *const core::ffi::c_void, tag : UNumberFormatTextAttribute, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 912:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_open(style : UNumberFormatStyle, pattern : *const u16, patternlength : i32, locale : windows_sys::core::PCSTR, parseerr : *mut UParseError, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 913:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_parse(fmt : *const *const core::ffi::c_void, text : *const u16, textlength : i32, parsepos : *mut i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 914:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_parseDecimal(fmt : *const *const core::ffi::c_void, text : *const u16, textlength : i32, parsepos : *mut i32, outbuf : windows_sys::core::PCSTR, outbuflength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 915:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_parseDouble(fmt : *const *const core::ffi::c_void, text : *const u16, textlength : i32, parsepos : *mut i32, status : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 916:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_parseDoubleCurrency(fmt : *const *const core::ffi::c_void, text : *const u16, textlength : i32, parsepos : *mut i32, currency : *mut u16, status : *mut UErrorCode) -> f64);

// UNSUPPORTED Rust 917:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_parseInt64(fmt : *const *const core::ffi::c_void, text : *const u16, textlength : i32, parsepos : *mut i32, status : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 918:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_parseToUFormattable(fmt : *const *const core::ffi::c_void, result : *mut *mut core::ffi::c_void, text : *const u16, textlength : i32, parsepos : *mut i32, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 919:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_setAttribute(fmt : *mut *mut core::ffi::c_void, attr : UNumberFormatAttribute, newvalue : i32));

// UNSUPPORTED Rust 920:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_setContext(fmt : *mut *mut core::ffi::c_void, value : UDisplayContext, status : *mut UErrorCode));

// UNSUPPORTED Rust 921:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_setDoubleAttribute(fmt : *mut *mut core::ffi::c_void, attr : UNumberFormatAttribute, newvalue : f64));

// UNSUPPORTED Rust 922:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_setSymbol(fmt : *mut *mut core::ffi::c_void, symbol : UNumberFormatSymbol, value : *const u16, length : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 923:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_setTextAttribute(fmt : *mut *mut core::ffi::c_void, tag : UNumberFormatTextAttribute, newvalue : *const u16, newvaluelength : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 924:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unum_toPattern(fmt : *const *const core::ffi::c_void, ispatternlocalized : i8, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 925:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_close(uformatter : *mut UNumberFormatter));

// UNSUPPORTED Rust 926:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_closeResult(uresult : *mut UFormattedNumber));

// UNSUPPORTED Rust 927:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_formatDecimal(uformatter : *const UNumberFormatter, value : windows_sys::core::PCSTR, valuelen : i32, uresult : *mut UFormattedNumber, ec : *mut UErrorCode));

// UNSUPPORTED Rust 928:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_formatDouble(uformatter : *const UNumberFormatter, value : f64, uresult : *mut UFormattedNumber, ec : *mut UErrorCode));

// UNSUPPORTED Rust 929:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_formatInt(uformatter : *const UNumberFormatter, value : i64, uresult : *mut UFormattedNumber, ec : *mut UErrorCode));

// UNSUPPORTED Rust 930:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_openForSkeletonAndLocale(skeleton : *const u16, skeletonlen : i32, locale : windows_sys::core::PCSTR, ec : *mut UErrorCode) -> *mut UNumberFormatter);

// UNSUPPORTED Rust 931:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_openForSkeletonAndLocaleWithError(skeleton : *const u16, skeletonlen : i32, locale : windows_sys::core::PCSTR, perror : *mut UParseError, ec : *mut UErrorCode) -> *mut UNumberFormatter);

// UNSUPPORTED Rust 932:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_openResult(ec : *mut UErrorCode) -> *mut UFormattedNumber);

// UNSUPPORTED Rust 933:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_resultAsValue(uresult : *const UFormattedNumber, ec : *mut UErrorCode) -> *mut UFormattedValue);

// UNSUPPORTED Rust 934:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_resultGetAllFieldPositions(uresult : *const UFormattedNumber, ufpositer : *mut UFieldPositionIterator, ec : *mut UErrorCode));

// UNSUPPORTED Rust 935:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_resultNextFieldPosition(uresult : *const UFormattedNumber, ufpos : *mut UFieldPosition, ec : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 936:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn unumf_resultToString(uresult : *const UFormattedNumber, buffer : *mut u16, buffercapacity : i32, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 937:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unumsys_close(unumsys : *mut UNumberingSystem));

// UNSUPPORTED Rust 938:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unumsys_getDescription(unumsys : *const UNumberingSystem, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 939:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unumsys_getName(unumsys : *const UNumberingSystem) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 940:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unumsys_getRadix(unumsys : *const UNumberingSystem) -> i32);

// UNSUPPORTED Rust 941:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unumsys_isAlgorithmic(unumsys : *const UNumberingSystem) -> i8);

// UNSUPPORTED Rust 942:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unumsys_open(locale : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UNumberingSystem);

// UNSUPPORTED Rust 943:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unumsys_openAvailableNames(status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 944:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn unumsys_openByName(name : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UNumberingSystem);

// UNSUPPORTED Rust 945:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uplrules_close(uplrules : *mut UPluralRules));

// UNSUPPORTED Rust 946:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uplrules_getKeywords(uplrules : *const UPluralRules, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 947:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uplrules_open(locale : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UPluralRules);

// UNSUPPORTED Rust 948:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uplrules_openForType(locale : windows_sys::core::PCSTR, r#type : UPluralType, status : *mut UErrorCode) -> *mut UPluralRules);

// UNSUPPORTED Rust 949:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uplrules_select(uplrules : *const UPluralRules, number : f64, keyword : *mut u16, capacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 950:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn uplrules_selectFormatted(uplrules : *const UPluralRules, number : *const UFormattedNumber, keyword : *mut u16, capacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 951:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_appendReplacement(regexp : *mut URegularExpression, replacementtext : *const u16, replacementlength : i32, destbuf : *mut *mut u16, destcapacity : *mut i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 952:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_appendReplacementUText(regexp : *mut URegularExpression, replacementtext : *mut UText, dest : *mut UText, status : *mut UErrorCode));

// UNSUPPORTED Rust 953:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_appendTail(regexp : *mut URegularExpression, destbuf : *mut *mut u16, destcapacity : *mut i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 954:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_appendTailUText(regexp : *mut URegularExpression, dest : *mut UText, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 955:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_clone(regexp : *const URegularExpression, status : *mut UErrorCode) -> *mut URegularExpression);

// UNSUPPORTED Rust 956:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_close(regexp : *mut URegularExpression));

// UNSUPPORTED Rust 957:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_end(regexp : *mut URegularExpression, groupnum : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 958:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_end64(regexp : *mut URegularExpression, groupnum : i32, status : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 959:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_find(regexp : *mut URegularExpression, startindex : i32, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 960:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_find64(regexp : *mut URegularExpression, startindex : i64, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 961:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_findNext(regexp : *mut URegularExpression, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 962:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_flags(regexp : *const URegularExpression, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 963:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_getFindProgressCallback(regexp : *const URegularExpression, callback : *mut URegexFindProgressCallback, context : *const *const core::ffi::c_void, status : *mut UErrorCode));

// UNSUPPORTED Rust 964:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_getMatchCallback(regexp : *const URegularExpression, callback : *mut URegexMatchCallback, context : *const *const core::ffi::c_void, status : *mut UErrorCode));

// UNSUPPORTED Rust 965:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_getStackLimit(regexp : *const URegularExpression, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 966:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_getText(regexp : *mut URegularExpression, textlength : *mut i32, status : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 967:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_getTimeLimit(regexp : *const URegularExpression, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 968:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_getUText(regexp : *mut URegularExpression, dest : *mut UText, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 969:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_group(regexp : *mut URegularExpression, groupnum : i32, dest : *mut u16, destcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 970:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_groupCount(regexp : *mut URegularExpression, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 971:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_groupNumberFromCName(regexp : *mut URegularExpression, groupname : windows_sys::core::PCSTR, namelength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 972:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_groupNumberFromName(regexp : *mut URegularExpression, groupname : *const u16, namelength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 973:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_groupUText(regexp : *mut URegularExpression, groupnum : i32, dest : *mut UText, grouplength : *mut i64, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 974:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_hasAnchoringBounds(regexp : *const URegularExpression, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 975:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_hasTransparentBounds(regexp : *const URegularExpression, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 976:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_hitEnd(regexp : *const URegularExpression, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 977:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_lookingAt(regexp : *mut URegularExpression, startindex : i32, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 978:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_lookingAt64(regexp : *mut URegularExpression, startindex : i64, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 979:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_matches(regexp : *mut URegularExpression, startindex : i32, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 980:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_matches64(regexp : *mut URegularExpression, startindex : i64, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 981:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_open(pattern : *const u16, patternlength : i32, flags : u32, pe : *mut UParseError, status : *mut UErrorCode) -> *mut URegularExpression);

// UNSUPPORTED Rust 982:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_openC(pattern : windows_sys::core::PCSTR, flags : u32, pe : *mut UParseError, status : *mut UErrorCode) -> *mut URegularExpression);

// UNSUPPORTED Rust 983:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_openUText(pattern : *mut UText, flags : u32, pe : *mut UParseError, status : *mut UErrorCode) -> *mut URegularExpression);

// UNSUPPORTED Rust 984:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_pattern(regexp : *const URegularExpression, patlength : *mut i32, status : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 985:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_patternUText(regexp : *const URegularExpression, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 986:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_refreshUText(regexp : *mut URegularExpression, text : *mut UText, status : *mut UErrorCode));

// UNSUPPORTED Rust 987:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_regionEnd(regexp : *const URegularExpression, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 988:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_regionEnd64(regexp : *const URegularExpression, status : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 989:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_regionStart(regexp : *const URegularExpression, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 990:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_regionStart64(regexp : *const URegularExpression, status : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 991:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_replaceAll(regexp : *mut URegularExpression, replacementtext : *const u16, replacementlength : i32, destbuf : *mut u16, destcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 992:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_replaceAllUText(regexp : *mut URegularExpression, replacement : *mut UText, dest : *mut UText, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 993:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_replaceFirst(regexp : *mut URegularExpression, replacementtext : *const u16, replacementlength : i32, destbuf : *mut u16, destcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 994:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_replaceFirstUText(regexp : *mut URegularExpression, replacement : *mut UText, dest : *mut UText, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 995:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_requireEnd(regexp : *const URegularExpression, status : *mut UErrorCode) -> i8);

// UNSUPPORTED Rust 996:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_reset(regexp : *mut URegularExpression, index : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 997:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_reset64(regexp : *mut URegularExpression, index : i64, status : *mut UErrorCode));

// UNSUPPORTED Rust 998:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_setFindProgressCallback(regexp : *mut URegularExpression, callback : URegexFindProgressCallback, context : *const core::ffi::c_void, status : *mut UErrorCode));

// UNSUPPORTED Rust 999:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_setMatchCallback(regexp : *mut URegularExpression, callback : URegexMatchCallback, context : *const core::ffi::c_void, status : *mut UErrorCode));

// UNSUPPORTED Rust 1000:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_setRegion(regexp : *mut URegularExpression, regionstart : i32, regionlimit : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1001:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_setRegion64(regexp : *mut URegularExpression, regionstart : i64, regionlimit : i64, status : *mut UErrorCode));

// UNSUPPORTED Rust 1002:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_setRegionAndStart(regexp : *mut URegularExpression, regionstart : i64, regionlimit : i64, startindex : i64, status : *mut UErrorCode));

// UNSUPPORTED Rust 1003:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_setStackLimit(regexp : *mut URegularExpression, limit : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1004:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_setText(regexp : *mut URegularExpression, text : *const u16, textlength : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1005:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_setTimeLimit(regexp : *mut URegularExpression, limit : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1006:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_setUText(regexp : *mut URegularExpression, text : *mut UText, status : *mut UErrorCode));

// UNSUPPORTED Rust 1007:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_split(regexp : *mut URegularExpression, destbuf : *mut u16, destcapacity : i32, requiredcapacity : *mut i32, destfields : *mut *mut u16, destfieldscapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1008:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_splitUText(regexp : *mut URegularExpression, destfields : *mut *mut UText, destfieldscapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1009:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_start(regexp : *mut URegularExpression, groupnum : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1010:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_start64(regexp : *mut URegularExpression, groupnum : i32, status : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 1011:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_useAnchoringBounds(regexp : *mut URegularExpression, b : i8, status : *mut UErrorCode));

// UNSUPPORTED Rust 1012:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregex_useTransparentBounds(regexp : *mut URegularExpression, b : i8, status : *mut UErrorCode));

// UNSUPPORTED Rust 1013:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_areEqual(uregion : *const URegion, otherregion : *const URegion) -> i8);

// UNSUPPORTED Rust 1014:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_contains(uregion : *const URegion, otherregion : *const URegion) -> i8);

// UNSUPPORTED Rust 1015:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getAvailable(r#type : URegionType, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 1016:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getContainedRegions(uregion : *const URegion, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 1017:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getContainedRegionsOfType(uregion : *const URegion, r#type : URegionType, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 1018:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getContainingRegion(uregion : *const URegion) -> *mut URegion);

// UNSUPPORTED Rust 1019:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getContainingRegionOfType(uregion : *const URegion, r#type : URegionType) -> *mut URegion);

// UNSUPPORTED Rust 1020:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getNumericCode(uregion : *const URegion) -> i32);

// UNSUPPORTED Rust 1021:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getPreferredValues(uregion : *const URegion, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 1022:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getRegionCode(uregion : *const URegion) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1023:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getRegionFromCode(regioncode : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut URegion);

// UNSUPPORTED Rust 1024:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getRegionFromNumericCode(code : i32, status : *mut UErrorCode) -> *mut URegion);

// UNSUPPORTED Rust 1025:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uregion_getType(uregion : *const URegion) -> URegionType);

// UNSUPPORTED Rust 1026:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ureldatefmt_close(reldatefmt : *mut URelativeDateTimeFormatter));

// UNSUPPORTED Rust 1027:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ureldatefmt_closeResult(ufrdt : *mut UFormattedRelativeDateTime));

// UNSUPPORTED Rust 1028:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ureldatefmt_combineDateAndTime(reldatefmt : *const URelativeDateTimeFormatter, relativedatestring : *const u16, relativedatestringlen : i32, timestring : *const u16, timestringlen : i32, result : *mut u16, resultcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1029:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ureldatefmt_format(reldatefmt : *const URelativeDateTimeFormatter, offset : f64, unit : URelativeDateTimeUnit, result : *mut u16, resultcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1030:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ureldatefmt_formatNumeric(reldatefmt : *const URelativeDateTimeFormatter, offset : f64, unit : URelativeDateTimeUnit, result : *mut u16, resultcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1031:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ureldatefmt_formatNumericToResult(reldatefmt : *const URelativeDateTimeFormatter, offset : f64, unit : URelativeDateTimeUnit, result : *mut UFormattedRelativeDateTime, status : *mut UErrorCode));

// UNSUPPORTED Rust 1032:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ureldatefmt_formatToResult(reldatefmt : *const URelativeDateTimeFormatter, offset : f64, unit : URelativeDateTimeUnit, result : *mut UFormattedRelativeDateTime, status : *mut UErrorCode));

// UNSUPPORTED Rust 1033:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn ureldatefmt_open(locale : windows_sys::core::PCSTR, nftoadopt : *mut *mut core::ffi::c_void, width : UDateRelativeDateTimeFormatterStyle, capitalizationcontext : UDisplayContext, status : *mut UErrorCode) -> *mut URelativeDateTimeFormatter);

// UNSUPPORTED Rust 1034:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ureldatefmt_openResult(ec : *mut UErrorCode) -> *mut UFormattedRelativeDateTime);

// UNSUPPORTED Rust 1035:1: declaration Macro has no candidate rule
// windows_link::link!("icu.dll" "C" fn ureldatefmt_resultAsValue(ufrdt : *const UFormattedRelativeDateTime, ec : *mut UErrorCode) -> *mut UFormattedValue);

// UNSUPPORTED Rust 1036:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_close(resourcebundle : *mut UResourceBundle));

// UNSUPPORTED Rust 1037:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getBinary(resourcebundle : *const UResourceBundle, len : *mut i32, status : *mut UErrorCode) -> *mut u8);

// UNSUPPORTED Rust 1038:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getByIndex(resourcebundle : *const UResourceBundle, indexr : i32, fillin : *mut UResourceBundle, status : *mut UErrorCode) -> *mut UResourceBundle);

// UNSUPPORTED Rust 1039:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getByKey(resourcebundle : *const UResourceBundle, key : windows_sys::core::PCSTR, fillin : *mut UResourceBundle, status : *mut UErrorCode) -> *mut UResourceBundle);

// UNSUPPORTED Rust 1040:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getInt(resourcebundle : *const UResourceBundle, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1041:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getIntVector(resourcebundle : *const UResourceBundle, len : *mut i32, status : *mut UErrorCode) -> *mut i32);

// UNSUPPORTED Rust 1042:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getKey(resourcebundle : *const UResourceBundle) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1043:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getLocaleByType(resourcebundle : *const UResourceBundle, r#type : ULocDataLocaleType, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1044:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getNextResource(resourcebundle : *mut UResourceBundle, fillin : *mut UResourceBundle, status : *mut UErrorCode) -> *mut UResourceBundle);

// UNSUPPORTED Rust 1045:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getNextString(resourcebundle : *mut UResourceBundle, len : *mut i32, key : *const *const i8, status : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 1046:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getSize(resourcebundle : *const UResourceBundle) -> i32);

// UNSUPPORTED Rust 1047:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getString(resourcebundle : *const UResourceBundle, len : *mut i32, status : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 1048:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getStringByIndex(resourcebundle : *const UResourceBundle, indexs : i32, len : *mut i32, status : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 1049:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getStringByKey(resb : *const UResourceBundle, key : windows_sys::core::PCSTR, len : *mut i32, status : *mut UErrorCode) -> *mut u16);

// UNSUPPORTED Rust 1050:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getType(resourcebundle : *const UResourceBundle) -> UResType);

// UNSUPPORTED Rust 1051:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getUInt(resourcebundle : *const UResourceBundle, status : *mut UErrorCode) -> u32);

// UNSUPPORTED Rust 1052:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getUTF8String(resb : *const UResourceBundle, dest : windows_sys::core::PCSTR, length : *mut i32, forcecopy : i8, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1053:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getUTF8StringByIndex(resb : *const UResourceBundle, stringindex : i32, dest : windows_sys::core::PCSTR, plength : *mut i32, forcecopy : i8, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1054:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getUTF8StringByKey(resb : *const UResourceBundle, key : windows_sys::core::PCSTR, dest : windows_sys::core::PCSTR, plength : *mut i32, forcecopy : i8, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1055:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_getVersion(resb : *const UResourceBundle, versioninfo : *mut u8));

// UNSUPPORTED Rust 1056:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_hasNext(resourcebundle : *const UResourceBundle) -> i8);

// UNSUPPORTED Rust 1057:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_open(packagename : windows_sys::core::PCSTR, locale : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UResourceBundle);

// UNSUPPORTED Rust 1058:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_openAvailableLocales(packagename : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 1059:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_openDirect(packagename : windows_sys::core::PCSTR, locale : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UResourceBundle);

// UNSUPPORTED Rust 1060:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_openU(packagename : *const u16, locale : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UResourceBundle);

// UNSUPPORTED Rust 1061:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn ures_resetIterator(resourcebundle : *mut UResourceBundle));

// UNSUPPORTED Rust 1062:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_breaksBetweenLetters(script : UScriptCode) -> i8);

// UNSUPPORTED Rust 1063:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_getCode(nameorabbrorlocale : windows_sys::core::PCSTR, fillin : *mut UScriptCode, capacity : i32, err : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1064:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_getName(scriptcode : UScriptCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1065:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_getSampleString(script : UScriptCode, dest : *mut u16, capacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1066:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_getScript(codepoint : i32, err : *mut UErrorCode) -> UScriptCode);

// UNSUPPORTED Rust 1067:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_getScriptExtensions(c : i32, scripts : *mut UScriptCode, capacity : i32, errorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1068:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_getShortName(scriptcode : UScriptCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1069:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_getUsage(script : UScriptCode) -> UScriptUsage);

// UNSUPPORTED Rust 1070:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_hasScript(c : i32, sc : UScriptCode) -> i8);

// UNSUPPORTED Rust 1071:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_isCased(script : UScriptCode) -> i8);

// UNSUPPORTED Rust 1072:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uscript_isRightToLeft(script : UScriptCode) -> i8);

// UNSUPPORTED Rust 1073:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_close(searchiter : *mut UStringSearch));

// UNSUPPORTED Rust 1074:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_first(strsrch : *mut UStringSearch, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1075:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_following(strsrch : *mut UStringSearch, position : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1076:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_getAttribute(strsrch : *const UStringSearch, attribute : USearchAttribute) -> USearchAttributeValue);

// UNSUPPORTED Rust 1077:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_getBreakIterator(strsrch : *const UStringSearch) -> *mut UBreakIterator);

// UNSUPPORTED Rust 1078:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_getCollator(strsrch : *const UStringSearch) -> *mut UCollator);

// UNSUPPORTED Rust 1079:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_getMatchedLength(strsrch : *const UStringSearch) -> i32);

// UNSUPPORTED Rust 1080:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_getMatchedStart(strsrch : *const UStringSearch) -> i32);

// UNSUPPORTED Rust 1081:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_getMatchedText(strsrch : *const UStringSearch, result : *mut u16, resultcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1082:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_getOffset(strsrch : *const UStringSearch) -> i32);

// UNSUPPORTED Rust 1083:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_getPattern(strsrch : *const UStringSearch, length : *mut i32) -> *mut u16);

// UNSUPPORTED Rust 1084:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_getText(strsrch : *const UStringSearch, length : *mut i32) -> *mut u16);

// UNSUPPORTED Rust 1085:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_last(strsrch : *mut UStringSearch, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1086:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_next(strsrch : *mut UStringSearch, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1087:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_open(pattern : *const u16, patternlength : i32, text : *const u16, textlength : i32, locale : windows_sys::core::PCSTR, breakiter : *mut UBreakIterator, status : *mut UErrorCode) -> *mut UStringSearch);

// UNSUPPORTED Rust 1088:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_openFromCollator(pattern : *const u16, patternlength : i32, text : *const u16, textlength : i32, collator : *const UCollator, breakiter : *mut UBreakIterator, status : *mut UErrorCode) -> *mut UStringSearch);

// UNSUPPORTED Rust 1089:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_preceding(strsrch : *mut UStringSearch, position : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1090:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_previous(strsrch : *mut UStringSearch, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1091:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_reset(strsrch : *mut UStringSearch));

// UNSUPPORTED Rust 1092:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_setAttribute(strsrch : *mut UStringSearch, attribute : USearchAttribute, value : USearchAttributeValue, status : *mut UErrorCode));

// UNSUPPORTED Rust 1093:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_setBreakIterator(strsrch : *mut UStringSearch, breakiter : *mut UBreakIterator, status : *mut UErrorCode));

// UNSUPPORTED Rust 1094:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_setCollator(strsrch : *mut UStringSearch, collator : *const UCollator, status : *mut UErrorCode));

// UNSUPPORTED Rust 1095:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_setOffset(strsrch : *mut UStringSearch, position : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1096:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_setPattern(strsrch : *mut UStringSearch, pattern : *const u16, patternlength : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1097:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn usearch_setText(strsrch : *mut UStringSearch, text : *const u16, textlength : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1098:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_add(set : *mut USet, c : i32));

// UNSUPPORTED Rust 1099:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_addAll(set : *mut USet, additionalset : *const USet));

// UNSUPPORTED Rust 1100:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_addAllCodePoints(set : *mut USet, str : *const u16, strlen : i32));

// UNSUPPORTED Rust 1101:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_addRange(set : *mut USet, start : i32, end : i32));

// UNSUPPORTED Rust 1102:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_addString(set : *mut USet, str : *const u16, strlen : i32));

// UNSUPPORTED Rust 1103:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_applyIntPropertyValue(set : *mut USet, prop : UProperty, value : i32, ec : *mut UErrorCode));

// UNSUPPORTED Rust 1104:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_applyPattern(set : *mut USet, pattern : *const u16, patternlength : i32, options : u32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1105:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_applyPropertyAlias(set : *mut USet, prop : *const u16, proplength : i32, value : *const u16, valuelength : i32, ec : *mut UErrorCode));

// UNSUPPORTED Rust 1106:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_charAt(set : *const USet, charindex : i32) -> i32);

// UNSUPPORTED Rust 1107:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_clear(set : *mut USet));

// UNSUPPORTED Rust 1108:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_clone(set : *const USet) -> *mut USet);

// UNSUPPORTED Rust 1109:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_cloneAsThawed(set : *const USet) -> *mut USet);

// UNSUPPORTED Rust 1110:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_close(set : *mut USet));

// UNSUPPORTED Rust 1111:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_closeOver(set : *mut USet, attributes : i32));

// UNSUPPORTED Rust 1112:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_compact(set : *mut USet));

// UNSUPPORTED Rust 1113:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_complement(set : *mut USet));

// UNSUPPORTED Rust 1114:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_complementAll(set : *mut USet, complement : *const USet));

// UNSUPPORTED Rust 1115:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_contains(set : *const USet, c : i32) -> i8);

// UNSUPPORTED Rust 1116:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_containsAll(set1 : *const USet, set2 : *const USet) -> i8);

// UNSUPPORTED Rust 1117:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_containsAllCodePoints(set : *const USet, str : *const u16, strlen : i32) -> i8);

// UNSUPPORTED Rust 1118:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_containsNone(set1 : *const USet, set2 : *const USet) -> i8);

// UNSUPPORTED Rust 1119:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_containsRange(set : *const USet, start : i32, end : i32) -> i8);

// UNSUPPORTED Rust 1120:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_containsSome(set1 : *const USet, set2 : *const USet) -> i8);

// UNSUPPORTED Rust 1121:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_containsString(set : *const USet, str : *const u16, strlen : i32) -> i8);

// UNSUPPORTED Rust 1122:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_equals(set1 : *const USet, set2 : *const USet) -> i8);

// UNSUPPORTED Rust 1123:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_freeze(set : *mut USet));

// UNSUPPORTED Rust 1124:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_getItem(set : *const USet, itemindex : i32, start : *mut i32, end : *mut i32, str : *mut u16, strcapacity : i32, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1125:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_getItemCount(set : *const USet) -> i32);

// UNSUPPORTED Rust 1126:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_getSerializedRange(set : *const USerializedSet, rangeindex : i32, pstart : *mut i32, pend : *mut i32) -> i8);

// UNSUPPORTED Rust 1127:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_getSerializedRangeCount(set : *const USerializedSet) -> i32);

// UNSUPPORTED Rust 1128:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_getSerializedSet(fillset : *mut USerializedSet, src : *const u16, srclength : i32) -> i8);

// UNSUPPORTED Rust 1129:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_indexOf(set : *const USet, c : i32) -> i32);

// UNSUPPORTED Rust 1130:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_isEmpty(set : *const USet) -> i8);

// UNSUPPORTED Rust 1131:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_isFrozen(set : *const USet) -> i8);

// UNSUPPORTED Rust 1132:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_open(start : i32, end : i32) -> *mut USet);

// UNSUPPORTED Rust 1133:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_openEmpty() -> *mut USet);

// UNSUPPORTED Rust 1134:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_openPattern(pattern : *const u16, patternlength : i32, ec : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 1135:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_openPatternOptions(pattern : *const u16, patternlength : i32, options : u32, ec : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 1136:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_remove(set : *mut USet, c : i32));

// UNSUPPORTED Rust 1137:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_removeAll(set : *mut USet, removeset : *const USet));

// UNSUPPORTED Rust 1138:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_removeAllStrings(set : *mut USet));

// UNSUPPORTED Rust 1139:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_removeRange(set : *mut USet, start : i32, end : i32));

// UNSUPPORTED Rust 1140:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_removeString(set : *mut USet, str : *const u16, strlen : i32));

// UNSUPPORTED Rust 1141:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_resemblesPattern(pattern : *const u16, patternlength : i32, pos : i32) -> i8);

// UNSUPPORTED Rust 1142:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_retain(set : *mut USet, start : i32, end : i32));

// UNSUPPORTED Rust 1143:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_retainAll(set : *mut USet, retain : *const USet));

// UNSUPPORTED Rust 1144:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_serialize(set : *const USet, dest : *mut u16, destcapacity : i32, perrorcode : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1145:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_serializedContains(set : *const USerializedSet, c : i32) -> i8);

// UNSUPPORTED Rust 1146:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_set(set : *mut USet, start : i32, end : i32));

// UNSUPPORTED Rust 1147:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_setSerializedToOne(fillset : *mut USerializedSet, c : i32));

// UNSUPPORTED Rust 1148:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_size(set : *const USet) -> i32);

// UNSUPPORTED Rust 1149:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_span(set : *const USet, s : *const u16, length : i32, spancondition : USetSpanCondition) -> i32);

// UNSUPPORTED Rust 1150:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_spanBack(set : *const USet, s : *const u16, length : i32, spancondition : USetSpanCondition) -> i32);

// UNSUPPORTED Rust 1151:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_spanBackUTF8(set : *const USet, s : windows_sys::core::PCSTR, length : i32, spancondition : USetSpanCondition) -> i32);

// UNSUPPORTED Rust 1152:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_spanUTF8(set : *const USet, s : windows_sys::core::PCSTR, length : i32, spancondition : USetSpanCondition) -> i32);

// UNSUPPORTED Rust 1153:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn uset_toPattern(set : *const USet, result : *mut u16, resultcapacity : i32, escapeunprintable : i8, ec : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1154:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_areConfusable(sc : *const USpoofChecker, id1 : *const u16, length1 : i32, id2 : *const u16, length2 : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1155:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_areConfusableUTF8(sc : *const USpoofChecker, id1 : windows_sys::core::PCSTR, length1 : i32, id2 : windows_sys::core::PCSTR, length2 : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1156:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_check(sc : *const USpoofChecker, id : *const u16, length : i32, position : *mut i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1157:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_check2(sc : *const USpoofChecker, id : *const u16, length : i32, checkresult : *mut USpoofCheckResult, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1158:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_check2UTF8(sc : *const USpoofChecker, id : windows_sys::core::PCSTR, length : i32, checkresult : *mut USpoofCheckResult, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1159:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_checkUTF8(sc : *const USpoofChecker, id : windows_sys::core::PCSTR, length : i32, position : *mut i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1160:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_clone(sc : *const USpoofChecker, status : *mut UErrorCode) -> *mut USpoofChecker);

// UNSUPPORTED Rust 1161:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_close(sc : *mut USpoofChecker));

// UNSUPPORTED Rust 1162:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_closeCheckResult(checkresult : *mut USpoofCheckResult));

// UNSUPPORTED Rust 1163:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getAllowedChars(sc : *const USpoofChecker, status : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 1164:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getAllowedLocales(sc : *mut USpoofChecker, status : *mut UErrorCode) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1165:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getCheckResultChecks(checkresult : *const USpoofCheckResult, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1166:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getCheckResultNumerics(checkresult : *const USpoofCheckResult, status : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 1167:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getCheckResultRestrictionLevel(checkresult : *const USpoofCheckResult, status : *mut UErrorCode) -> URestrictionLevel);

// UNSUPPORTED Rust 1168:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getChecks(sc : *const USpoofChecker, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1169:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getInclusionSet(status : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 1170:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getRecommendedSet(status : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 1171:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getRestrictionLevel(sc : *const USpoofChecker) -> URestrictionLevel);

// UNSUPPORTED Rust 1172:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getSkeleton(sc : *const USpoofChecker, r#type : u32, id : *const u16, length : i32, dest : *mut u16, destcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1173:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_getSkeletonUTF8(sc : *const USpoofChecker, r#type : u32, id : windows_sys::core::PCSTR, length : i32, dest : windows_sys::core::PCSTR, destcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1174:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_open(status : *mut UErrorCode) -> *mut USpoofChecker);

// UNSUPPORTED Rust 1175:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_openCheckResult(status : *mut UErrorCode) -> *mut USpoofCheckResult);

// UNSUPPORTED Rust 1176:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_openFromSerialized(data : *const core::ffi::c_void, length : i32, pactuallength : *mut i32, perrorcode : *mut UErrorCode) -> *mut USpoofChecker);

// UNSUPPORTED Rust 1177:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_openFromSource(confusables : windows_sys::core::PCSTR, confusableslen : i32, confusableswholescript : windows_sys::core::PCSTR, confusableswholescriptlen : i32, errtype : *mut i32, pe : *mut UParseError, status : *mut UErrorCode) -> *mut USpoofChecker);

// UNSUPPORTED Rust 1178:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_serialize(sc : *mut USpoofChecker, data : *mut core::ffi::c_void, capacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1179:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_setAllowedChars(sc : *mut USpoofChecker, chars : *const USet, status : *mut UErrorCode));

// UNSUPPORTED Rust 1180:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_setAllowedLocales(sc : *mut USpoofChecker, localeslist : windows_sys::core::PCSTR, status : *mut UErrorCode));

// UNSUPPORTED Rust 1181:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_setChecks(sc : *mut USpoofChecker, checks : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1182:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn uspoof_setRestrictionLevel(sc : *mut USpoofChecker, restrictionlevel : URestrictionLevel));

// UNSUPPORTED Rust 1183:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn usprep_close(profile : *mut UStringPrepProfile));

// UNSUPPORTED Rust 1184:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn usprep_open(path : windows_sys::core::PCSTR, filename : windows_sys::core::PCSTR, status : *mut UErrorCode) -> *mut UStringPrepProfile);

// UNSUPPORTED Rust 1185:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn usprep_openByType(r#type : UStringPrepProfileType, status : *mut UErrorCode) -> *mut UStringPrepProfile);

// UNSUPPORTED Rust 1186:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn usprep_prepare(prep : *const UStringPrepProfile, src : *const u16, srclength : i32, dest : *mut u16, destcapacity : i32, options : i32, parseerror : *mut UParseError, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1187:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_char32At(ut : *mut UText, nativeindex : i64) -> i32);

// UNSUPPORTED Rust 1188:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_clone(dest : *mut UText, src : *const UText, deep : i8, readonly : i8, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 1189:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_close(ut : *mut UText) -> *mut UText);

// UNSUPPORTED Rust 1190:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_copy(ut : *mut UText, nativestart : i64, nativelimit : i64, destindex : i64, r#move : i8, status : *mut UErrorCode));

// UNSUPPORTED Rust 1191:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_current32(ut : *mut UText) -> i32);

// UNSUPPORTED Rust 1192:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_equals(a : *const UText, b : *const UText) -> i8);

// UNSUPPORTED Rust 1193:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_extract(ut : *mut UText, nativestart : i64, nativelimit : i64, dest : *mut u16, destcapacity : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1194:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_freeze(ut : *mut UText));

// UNSUPPORTED Rust 1195:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_getNativeIndex(ut : *const UText) -> i64);

// UNSUPPORTED Rust 1196:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_getPreviousNativeIndex(ut : *mut UText) -> i64);

// UNSUPPORTED Rust 1197:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_hasMetaData(ut : *const UText) -> i8);

// UNSUPPORTED Rust 1198:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_isLengthExpensive(ut : *const UText) -> i8);

// UNSUPPORTED Rust 1199:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_isWritable(ut : *const UText) -> i8);

// UNSUPPORTED Rust 1200:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_moveIndex32(ut : *mut UText, delta : i32) -> i8);

// UNSUPPORTED Rust 1201:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_nativeLength(ut : *mut UText) -> i64);

// UNSUPPORTED Rust 1202:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_next32(ut : *mut UText) -> i32);

// UNSUPPORTED Rust 1203:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_next32From(ut : *mut UText, nativeindex : i64) -> i32);

// UNSUPPORTED Rust 1204:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_openUChars(ut : *mut UText, s : *const u16, length : i64, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 1205:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_openUTF8(ut : *mut UText, s : windows_sys::core::PCSTR, length : i64, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 1206:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_previous32(ut : *mut UText) -> i32);

// UNSUPPORTED Rust 1207:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_previous32From(ut : *mut UText, nativeindex : i64) -> i32);

// UNSUPPORTED Rust 1208:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_replace(ut : *mut UText, nativestart : i64, nativelimit : i64, replacementtext : *const u16, replacementlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1209:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_setNativeIndex(ut : *mut UText, nativeindex : i64));

// UNSUPPORTED Rust 1210:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utext_setup(ut : *mut UText, extraspace : i32, status : *mut UErrorCode) -> *mut UText);

// UNSUPPORTED Rust 1211:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utf8_appendCharSafeBody(s : *mut u8, i : i32, length : i32, c : i32, piserror : *mut i8) -> i32);

// UNSUPPORTED Rust 1212:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utf8_back1SafeBody(s : *const u8, start : i32, i : i32) -> i32);

// UNSUPPORTED Rust 1213:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utf8_nextCharSafeBody(s : *const u8, pi : *mut i32, length : i32, c : i32, strict : i8) -> i32);

// UNSUPPORTED Rust 1214:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utf8_prevCharSafeBody(s : *const u8, start : i32, pi : *mut i32, c : i32, strict : i8) -> i32);

// UNSUPPORTED Rust 1215:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utmscale_fromInt64(othertime : i64, timescale : UDateTimeScale, status : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 1216:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utmscale_getTimeScaleValue(timescale : UDateTimeScale, value : UTimeScaleValue, status : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 1217:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utmscale_toInt64(universaltime : i64, timescale : UDateTimeScale, status : *mut UErrorCode) -> i64);

// UNSUPPORTED Rust 1218:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utrace_format(outbuf : windows_sys::core::PCSTR, capacity : i32, indent : i32, fmt : windows_sys::core::PCSTR, ...) -> i32);

// UNSUPPORTED Rust 1219:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utrace_functionName(fnnumber : i32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 1220:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utrace_getFunctions(context : *const *const core::ffi::c_void, e : *mut UTraceEntry, x : *mut UTraceExit, d : *mut UTraceData));

// UNSUPPORTED Rust 1221:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utrace_getLevel() -> i32);

// UNSUPPORTED Rust 1222:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utrace_setFunctions(context : *const core::ffi::c_void, e : UTraceEntry, x : UTraceExit, d : UTraceData));

// UNSUPPORTED Rust 1223:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utrace_setLevel(tracelevel : i32));

// UNSUPPORTED Rust 1224:1: declaration Macro has no candidate rule
// windows_link::link!("icuuc.dll" "C" fn utrace_vformat(outbuf : windows_sys::core::PCSTR, capacity : i32, indent : i32, fmt : windows_sys::core::PCSTR, args : *mut i8) -> i32);

// UNSUPPORTED Rust 1225:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_clone(trans : *const *const core::ffi::c_void, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 1226:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_close(trans : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 1227:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_countAvailableIDs() -> i32);

// UNSUPPORTED Rust 1228:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_getSourceSet(trans : *const *const core::ffi::c_void, ignorefilter : i8, fillin : *mut USet, status : *mut UErrorCode) -> *mut USet);

// UNSUPPORTED Rust 1229:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_getUnicodeID(trans : *const *const core::ffi::c_void, resultlength : *mut i32) -> *mut u16);

// UNSUPPORTED Rust 1230:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_openIDs(perrorcode : *mut UErrorCode) -> *mut UEnumeration);

// UNSUPPORTED Rust 1231:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_openInverse(trans : *const *const core::ffi::c_void, status : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 1232:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_openU(id : *const u16, idlength : i32, dir : UTransDirection, rules : *const u16, ruleslength : i32, parseerror : *mut UParseError, perrorcode : *mut UErrorCode) -> *mut *mut core::ffi::c_void);

// UNSUPPORTED Rust 1233:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_register(adoptedtrans : *mut *mut core::ffi::c_void, status : *mut UErrorCode));

// UNSUPPORTED Rust 1234:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_setFilter(trans : *mut *mut core::ffi::c_void, filterpattern : *const u16, filterpatternlen : i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1235:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_toRules(trans : *const *const core::ffi::c_void, escapeunprintable : i8, result : *mut u16, resultlength : i32, status : *mut UErrorCode) -> i32);

// UNSUPPORTED Rust 1236:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_trans(trans : *const *const core::ffi::c_void, rep : *mut *mut core::ffi::c_void, repfunc : *const UReplaceableCallbacks, start : i32, limit : *mut i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1237:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_transIncremental(trans : *const *const core::ffi::c_void, rep : *mut *mut core::ffi::c_void, repfunc : *const UReplaceableCallbacks, pos : *mut UTransPosition, status : *mut UErrorCode));

// UNSUPPORTED Rust 1238:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_transIncrementalUChars(trans : *const *const core::ffi::c_void, text : *mut u16, textlength : *mut i32, textcapacity : i32, pos : *mut UTransPosition, status : *mut UErrorCode));

// UNSUPPORTED Rust 1239:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_transUChars(trans : *const *const core::ffi::c_void, text : *mut u16, textlength : *mut i32, textcapacity : i32, start : i32, limit : *mut i32, status : *mut UErrorCode));

// UNSUPPORTED Rust 1240:1: declaration Macro has no candidate rule
// windows_link::link!("icuin.dll" "C" fn utrans_unregisterID(id : *const u16, idlength : i32));

public const val `ALL_SERVICES`: UInt = 0u;
public const val `ALL_SERVICE_TYPES`: UInt = 0u;
public const val `C1_ALPHA`: UInt = 256u;
public const val `C1_BLANK`: UInt = 64u;
public const val `C1_CNTRL`: UInt = 32u;
public const val `C1_DEFINED`: UInt = 512u;
public const val `C1_DIGIT`: UInt = 4u;
public const val `C1_LOWER`: UInt = 2u;
public const val `C1_PUNCT`: UInt = 16u;
public const val `C1_SPACE`: UInt = 8u;
public const val `C1_UPPER`: UInt = 1u;
public const val `C1_XDIGIT`: UInt = 128u;
public const val `C2_ARABICNUMBER`: UInt = 6u;
public const val `C2_BLOCKSEPARATOR`: UInt = 8u;
public const val `C2_COMMONSEPARATOR`: UInt = 7u;
public const val `C2_EUROPENUMBER`: UInt = 3u;
public const val `C2_EUROPESEPARATOR`: UInt = 4u;
public const val `C2_EUROPETERMINATOR`: UInt = 5u;
public const val `C2_LEFTTORIGHT`: UInt = 1u;
public const val `C2_NOTAPPLICABLE`: UInt = 0u;
public const val `C2_OTHERNEUTRAL`: UInt = 11u;
public const val `C2_RIGHTTOLEFT`: UInt = 2u;
public const val `C2_SEGMENTSEPARATOR`: UInt = 9u;
public const val `C2_WHITESPACE`: UInt = 10u;
public const val `C3_ALPHA`: UInt = 32768u;
public const val `C3_DIACRITIC`: UInt = 2u;
public const val `C3_FULLWIDTH`: UInt = 128u;
public const val `C3_HALFWIDTH`: UInt = 64u;
public const val `C3_HIGHSURROGATE`: UInt = 2048u;
public const val `C3_HIRAGANA`: UInt = 32u;
public const val `C3_IDEOGRAPH`: UInt = 256u;
public const val `C3_KASHIDA`: UInt = 512u;
public const val `C3_KATAKANA`: UInt = 16u;
public const val `C3_LEXICAL`: UInt = 1024u;
public const val `C3_LOWSURROGATE`: UInt = 4096u;
public const val `C3_NONSPACING`: UInt = 1u;
public const val `C3_NOTAPPLICABLE`: UInt = 0u;
public const val `C3_SYMBOL`: UInt = 8u;
public const val `C3_VOWELMARK`: UInt = 4u;
// UNSUPPORTED Rust 1280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CALDATETIME {
//     pub CalId: u32,
//     pub Era: u32,
//     pub Year: u32,
//     pub Month: u32,
//     pub Day: u32,
//     pub DayOfWeek: u32,
//     pub Hour: u32,
//     pub Minute: u32,
//     pub Second: u32,
//     pub Tick: u32,
// }

public typealias `CALDATETIME_DATEUNIT` = Int;
// UNSUPPORTED Rust 1295:1: generic scalar type unsupported
// pub type CALINFO_ENUMPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1296:1: generic scalar type unsupported
// pub type CALINFO_ENUMPROCEXA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1297:1: generic scalar type unsupported
// pub type CALINFO_ENUMPROCEXEX = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: windows_sys::core::PCWSTR, param3: super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1298:1: generic scalar type unsupported
// pub type CALINFO_ENUMPROCEXW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1299:1: generic scalar type unsupported
// pub type CALINFO_ENUMPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

public const val `CAL_GREGORIAN`: UInt = 1u;
public const val `CAL_GREGORIAN_ARABIC`: UInt = 10u;
public const val `CAL_GREGORIAN_ME_FRENCH`: UInt = 9u;
public const val `CAL_GREGORIAN_US`: UInt = 2u;
public const val `CAL_GREGORIAN_XLIT_ENGLISH`: UInt = 11u;
public const val `CAL_GREGORIAN_XLIT_FRENCH`: UInt = 12u;
public const val `CAL_HEBREW`: UInt = 8u;
public const val `CAL_HIJRI`: UInt = 6u;
public const val `CAL_ICALINTVALUE`: UInt = 1u;
public const val `CAL_ITWODIGITYEARMAX`: UInt = 48u;
public const val `CAL_IYEAROFFSETRANGE`: UInt = 3u;
public const val `CAL_JAPAN`: UInt = 3u;
public const val `CAL_KOREA`: UInt = 5u;
public const val `CAL_NOUSEROVERRIDE`: UInt = 2147483648u;
public const val `CAL_PERSIAN`: UInt = 22u;
public const val `CAL_RETURN_GENITIVE_NAMES`: UInt = 268435456u;
public const val `CAL_RETURN_NUMBER`: UInt = 536870912u;
public const val `CAL_SABBREVDAYNAME1`: UInt = 14u;
public const val `CAL_SABBREVDAYNAME2`: UInt = 15u;
public const val `CAL_SABBREVDAYNAME3`: UInt = 16u;
public const val `CAL_SABBREVDAYNAME4`: UInt = 17u;
public const val `CAL_SABBREVDAYNAME5`: UInt = 18u;
public const val `CAL_SABBREVDAYNAME6`: UInt = 19u;
public const val `CAL_SABBREVDAYNAME7`: UInt = 20u;
public const val `CAL_SABBREVERASTRING`: UInt = 57u;
public const val `CAL_SABBREVMONTHNAME1`: UInt = 34u;
public const val `CAL_SABBREVMONTHNAME10`: UInt = 43u;
public const val `CAL_SABBREVMONTHNAME11`: UInt = 44u;
public const val `CAL_SABBREVMONTHNAME12`: UInt = 45u;
public const val `CAL_SABBREVMONTHNAME13`: UInt = 46u;
public const val `CAL_SABBREVMONTHNAME2`: UInt = 35u;
public const val `CAL_SABBREVMONTHNAME3`: UInt = 36u;
public const val `CAL_SABBREVMONTHNAME4`: UInt = 37u;
public const val `CAL_SABBREVMONTHNAME5`: UInt = 38u;
public const val `CAL_SABBREVMONTHNAME6`: UInt = 39u;
public const val `CAL_SABBREVMONTHNAME7`: UInt = 40u;
public const val `CAL_SABBREVMONTHNAME8`: UInt = 41u;
public const val `CAL_SABBREVMONTHNAME9`: UInt = 42u;
public const val `CAL_SCALNAME`: UInt = 2u;
public const val `CAL_SDAYNAME1`: UInt = 7u;
public const val `CAL_SDAYNAME2`: UInt = 8u;
public const val `CAL_SDAYNAME3`: UInt = 9u;
public const val `CAL_SDAYNAME4`: UInt = 10u;
public const val `CAL_SDAYNAME5`: UInt = 11u;
public const val `CAL_SDAYNAME6`: UInt = 12u;
public const val `CAL_SDAYNAME7`: UInt = 13u;
public const val `CAL_SENGLISHABBREVERANAME`: UInt = 60u;
public const val `CAL_SENGLISHERANAME`: UInt = 59u;
public const val `CAL_SERASTRING`: UInt = 4u;
public const val `CAL_SJAPANESEERAFIRSTYEAR`: UInt = 61u;
public const val `CAL_SLONGDATE`: UInt = 6u;
public const val `CAL_SMONTHDAY`: UInt = 56u;
public const val `CAL_SMONTHNAME1`: UInt = 21u;
public const val `CAL_SMONTHNAME10`: UInt = 30u;
public const val `CAL_SMONTHNAME11`: UInt = 31u;
public const val `CAL_SMONTHNAME12`: UInt = 32u;
public const val `CAL_SMONTHNAME13`: UInt = 33u;
public const val `CAL_SMONTHNAME2`: UInt = 22u;
public const val `CAL_SMONTHNAME3`: UInt = 23u;
public const val `CAL_SMONTHNAME4`: UInt = 24u;
public const val `CAL_SMONTHNAME5`: UInt = 25u;
public const val `CAL_SMONTHNAME6`: UInt = 26u;
public const val `CAL_SMONTHNAME7`: UInt = 27u;
public const val `CAL_SMONTHNAME8`: UInt = 28u;
public const val `CAL_SMONTHNAME9`: UInt = 29u;
public const val `CAL_SRELATIVELONGDATE`: UInt = 58u;
public const val `CAL_SSHORTDATE`: UInt = 5u;
public const val `CAL_SSHORTESTDAYNAME1`: UInt = 49u;
public const val `CAL_SSHORTESTDAYNAME2`: UInt = 50u;
public const val `CAL_SSHORTESTDAYNAME3`: UInt = 51u;
public const val `CAL_SSHORTESTDAYNAME4`: UInt = 52u;
public const val `CAL_SSHORTESTDAYNAME5`: UInt = 53u;
public const val `CAL_SSHORTESTDAYNAME6`: UInt = 54u;
public const val `CAL_SSHORTESTDAYNAME7`: UInt = 55u;
public const val `CAL_SYEARMONTH`: UInt = 47u;
public const val `CAL_TAIWAN`: UInt = 4u;
public const val `CAL_THAI`: UInt = 7u;
public const val `CAL_UMALQURA`: UInt = 23u;
public const val `CAL_USE_CP_ACP`: UInt = 1073741824u;
public const val `CANITER_SKIP_ZEROES`: UInt = 1u;
// UNSUPPORTED Rust 1380:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CHARSETINFO {
//     pub ciCharset: u32,
//     pub ciACP: u32,
//     pub fs: FONTSIGNATURE,
// }

// UNSUPPORTED Rust 1387:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CMLangConvertCharset: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd66d6f99_cdaa_11d0_b822_00c04fc9b31f);

// UNSUPPORTED Rust 1388:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CMLangString: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc04d65cf_b70d_11d0_b188_00aa0038c969);

// UNSUPPORTED Rust 1389:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CMultiLanguage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x275c23e2_3747_11d0_9fea_00aa003f8646);

// UNSUPPORTED Rust 1390:1: generic scalar type unsupported
// pub type CODEPAGE_ENUMPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1391:1: generic scalar type unsupported
// pub type CODEPAGE_ENUMPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

public typealias `COMPARESTRING_RESULT` = Int;
public const val `COMPARE_STRING`: `SYSNLS_FUNCTION` = 1;
public typealias `COMPARE_STRING_FLAGS` = UInt;
public typealias `CORRECTIVE_ACTION` = Int;
public const val `CORRECTIVE_ACTION_DELETE`: `CORRECTIVE_ACTION` = 3;
public const val `CORRECTIVE_ACTION_GET_SUGGESTIONS`: `CORRECTIVE_ACTION` = 1;
public const val `CORRECTIVE_ACTION_NONE`: `CORRECTIVE_ACTION` = 0;
public const val `CORRECTIVE_ACTION_REPLACE`: `CORRECTIVE_ACTION` = 2;
// UNSUPPORTED Rust 1400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPINFO {
//     pub MaxCharSize: u32,
//     pub DefaultChar: [u8; 2],
//     pub LeadByte: [u8; 12],
// }

// UNSUPPORTED Rust 1407:1: declaration Impl has no candidate rule
// impl Default for CPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1412:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPINFOEXA {
//     pub MaxCharSize: u32,
//     pub DefaultChar: [u8; 2],
//     pub LeadByte: [u8; 12],
//     pub UnicodeDefaultChar: u16,
//     pub CodePage: u32,
//     pub CodePageName: [i8; 260],
// }

// UNSUPPORTED Rust 1422:1: declaration Impl has no candidate rule
// impl Default for CPINFOEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1427:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPINFOEXW {
//     pub MaxCharSize: u32,
//     pub DefaultChar: [u8; 2],
//     pub LeadByte: [u8; 12],
//     pub UnicodeDefaultChar: u16,
//     pub CodePage: u32,
//     pub CodePageName: [u16; 260],
// }

// UNSUPPORTED Rust 1437:1: declaration Impl has no candidate rule
// impl Default for CPINFOEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CPIOD_FORCE_PROMPT`: Int = -2147483648;
public const val `CPIOD_PEEK`: Int = 1073741824;
public const val `CP_ACP`: UInt = 0u;
public const val `CP_INSTALLED`: `ENUM_SYSTEM_CODE_PAGES_FLAGS` = 1u;
public const val `CP_MACCP`: UInt = 2u;
public const val `CP_OEMCP`: UInt = 1u;
public const val `CP_SUPPORTED`: `ENUM_SYSTEM_CODE_PAGES_FLAGS` = 2u;
public const val `CP_SYMBOL`: UInt = 42u;
public const val `CP_THREAD_ACP`: UInt = 3u;
public const val `CP_UTF7`: UInt = 65000u;
public const val `CP_UTF8`: UInt = 65001u;
public const val `CSTR_EQUAL`: `COMPARESTRING_RESULT` = 2;
public const val `CSTR_GREATER_THAN`: `COMPARESTRING_RESULT` = 3;
public const val `CSTR_LESS_THAN`: `COMPARESTRING_RESULT` = 1;
public const val `CTRY_ALBANIA`: UInt = 355u;
public const val `CTRY_ALGERIA`: UInt = 213u;
public const val `CTRY_ARGENTINA`: UInt = 54u;
public const val `CTRY_ARMENIA`: UInt = 374u;
public const val `CTRY_AUSTRALIA`: UInt = 61u;
public const val `CTRY_AUSTRIA`: UInt = 43u;
public const val `CTRY_AZERBAIJAN`: UInt = 994u;
public const val `CTRY_BAHRAIN`: UInt = 973u;
public const val `CTRY_BELARUS`: UInt = 375u;
public const val `CTRY_BELGIUM`: UInt = 32u;
public const val `CTRY_BELIZE`: UInt = 501u;
public const val `CTRY_BOLIVIA`: UInt = 591u;
public const val `CTRY_BRAZIL`: UInt = 55u;
public const val `CTRY_BRUNEI_DARUSSALAM`: UInt = 673u;
public const val `CTRY_BULGARIA`: UInt = 359u;
public const val `CTRY_CANADA`: UInt = 2u;
public const val `CTRY_CARIBBEAN`: UInt = 1u;
public const val `CTRY_CHILE`: UInt = 56u;
public const val `CTRY_COLOMBIA`: UInt = 57u;
public const val `CTRY_COSTA_RICA`: UInt = 506u;
public const val `CTRY_CROATIA`: UInt = 385u;
public const val `CTRY_CZECH`: UInt = 420u;
public const val `CTRY_DEFAULT`: UInt = 0u;
public const val `CTRY_DENMARK`: UInt = 45u;
public const val `CTRY_DOMINICAN_REPUBLIC`: UInt = 1u;
public const val `CTRY_ECUADOR`: UInt = 593u;
public const val `CTRY_EGYPT`: UInt = 20u;
public const val `CTRY_EL_SALVADOR`: UInt = 503u;
public const val `CTRY_ESTONIA`: UInt = 372u;
public const val `CTRY_FAEROE_ISLANDS`: UInt = 298u;
public const val `CTRY_FINLAND`: UInt = 358u;
public const val `CTRY_FRANCE`: UInt = 33u;
public const val `CTRY_GEORGIA`: UInt = 995u;
public const val `CTRY_GERMANY`: UInt = 49u;
public const val `CTRY_GREECE`: UInt = 30u;
public const val `CTRY_GUATEMALA`: UInt = 502u;
public const val `CTRY_HONDURAS`: UInt = 504u;
public const val `CTRY_HONG_KONG`: UInt = 852u;
public const val `CTRY_HUNGARY`: UInt = 36u;
public const val `CTRY_ICELAND`: UInt = 354u;
public const val `CTRY_INDIA`: UInt = 91u;
public const val `CTRY_INDONESIA`: UInt = 62u;
public const val `CTRY_IRAN`: UInt = 981u;
public const val `CTRY_IRAQ`: UInt = 964u;
public const val `CTRY_IRELAND`: UInt = 353u;
public const val `CTRY_ISRAEL`: UInt = 972u;
public const val `CTRY_ITALY`: UInt = 39u;
public const val `CTRY_JAMAICA`: UInt = 1u;
public const val `CTRY_JAPAN`: UInt = 81u;
public const val `CTRY_JORDAN`: UInt = 962u;
public const val `CTRY_KAZAKSTAN`: UInt = 7u;
public const val `CTRY_KENYA`: UInt = 254u;
public const val `CTRY_KUWAIT`: UInt = 965u;
public const val `CTRY_KYRGYZSTAN`: UInt = 996u;
public const val `CTRY_LATVIA`: UInt = 371u;
public const val `CTRY_LEBANON`: UInt = 961u;
public const val `CTRY_LIBYA`: UInt = 218u;
public const val `CTRY_LIECHTENSTEIN`: UInt = 41u;
public const val `CTRY_LITHUANIA`: UInt = 370u;
public const val `CTRY_LUXEMBOURG`: UInt = 352u;
public const val `CTRY_MACAU`: UInt = 853u;
public const val `CTRY_MACEDONIA`: UInt = 389u;
public const val `CTRY_MALAYSIA`: UInt = 60u;
public const val `CTRY_MALDIVES`: UInt = 960u;
public const val `CTRY_MEXICO`: UInt = 52u;
public const val `CTRY_MONACO`: UInt = 33u;
public const val `CTRY_MONGOLIA`: UInt = 976u;
public const val `CTRY_MOROCCO`: UInt = 212u;
public const val `CTRY_NETHERLANDS`: UInt = 31u;
public const val `CTRY_NEW_ZEALAND`: UInt = 64u;
public const val `CTRY_NICARAGUA`: UInt = 505u;
public const val `CTRY_NORWAY`: UInt = 47u;
public const val `CTRY_OMAN`: UInt = 968u;
public const val `CTRY_PAKISTAN`: UInt = 92u;
public const val `CTRY_PANAMA`: UInt = 507u;
public const val `CTRY_PARAGUAY`: UInt = 595u;
public const val `CTRY_PERU`: UInt = 51u;
public const val `CTRY_PHILIPPINES`: UInt = 63u;
public const val `CTRY_POLAND`: UInt = 48u;
public const val `CTRY_PORTUGAL`: UInt = 351u;
public const val `CTRY_PRCHINA`: UInt = 86u;
public const val `CTRY_PUERTO_RICO`: UInt = 1u;
public const val `CTRY_QATAR`: UInt = 974u;
public const val `CTRY_ROMANIA`: UInt = 40u;
public const val `CTRY_RUSSIA`: UInt = 7u;
public const val `CTRY_SAUDI_ARABIA`: UInt = 966u;
public const val `CTRY_SERBIA`: UInt = 381u;
public const val `CTRY_SINGAPORE`: UInt = 65u;
public const val `CTRY_SLOVAK`: UInt = 421u;
public const val `CTRY_SLOVENIA`: UInt = 386u;
public const val `CTRY_SOUTH_AFRICA`: UInt = 27u;
public const val `CTRY_SOUTH_KOREA`: UInt = 82u;
public const val `CTRY_SPAIN`: UInt = 34u;
public const val `CTRY_SWEDEN`: UInt = 46u;
public const val `CTRY_SWITZERLAND`: UInt = 41u;
public const val `CTRY_SYRIA`: UInt = 963u;
public const val `CTRY_TAIWAN`: UInt = 886u;
public const val `CTRY_TATARSTAN`: UInt = 7u;
public const val `CTRY_THAILAND`: UInt = 66u;
public const val `CTRY_TRINIDAD_Y_TOBAGO`: UInt = 1u;
public const val `CTRY_TUNISIA`: UInt = 216u;
public const val `CTRY_TURKEY`: UInt = 90u;
public const val `CTRY_UAE`: UInt = 971u;
public const val `CTRY_UKRAINE`: UInt = 380u;
public const val `CTRY_UNITED_KINGDOM`: UInt = 44u;
public const val `CTRY_UNITED_STATES`: UInt = 1u;
public const val `CTRY_URUGUAY`: UInt = 598u;
public const val `CTRY_UZBEKISTAN`: UInt = 7u;
public const val `CTRY_VENEZUELA`: UInt = 58u;
public const val `CTRY_VIET_NAM`: UInt = 84u;
public const val `CTRY_YEMEN`: UInt = 967u;
public const val `CTRY_ZIMBABWE`: UInt = 263u;
public const val `CT_CTYPE1`: UInt = 1u;
public const val `CT_CTYPE2`: UInt = 2u;
public const val `CT_CTYPE3`: UInt = 4u;
// UNSUPPORTED Rust 1571:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CURRENCYFMTA {
//     pub NumDigits: u32,
//     pub LeadingZero: u32,
//     pub Grouping: u32,
//     pub lpDecimalSep: windows_sys::core::PSTR,
//     pub lpThousandSep: windows_sys::core::PSTR,
//     pub NegativeOrder: u32,
//     pub PositiveOrder: u32,
//     pub lpCurrencySymbol: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1583:1: declaration Impl has no candidate rule
// impl Default for CURRENCYFMTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CURRENCYFMTW {
//     pub NumDigits: u32,
//     pub LeadingZero: u32,
//     pub Grouping: u32,
//     pub lpDecimalSep: windows_sys::core::PWSTR,
//     pub lpThousandSep: windows_sys::core::PWSTR,
//     pub NegativeOrder: u32,
//     pub PositiveOrder: u32,
//     pub lpCurrencySymbol: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1600:1: declaration Impl has no candidate rule
// impl Default for CURRENCYFMTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1605:1: generic scalar type unsupported
// pub type DATEFMT_ENUMPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1606:1: generic scalar type unsupported
// pub type DATEFMT_ENUMPROCEXA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1607:1: generic scalar type unsupported
// pub type DATEFMT_ENUMPROCEXEX = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1608:1: generic scalar type unsupported
// pub type DATEFMT_ENUMPROCEXW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1609:1: generic scalar type unsupported
// pub type DATEFMT_ENUMPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

public const val `DATE_AUTOLAYOUT`: `ENUM_DATE_FORMATS_FLAGS` = 64u;
public const val `DATE_LONGDATE`: `ENUM_DATE_FORMATS_FLAGS` = 2u;
public const val `DATE_LTRREADING`: `ENUM_DATE_FORMATS_FLAGS` = 16u;
public const val `DATE_MONTHDAY`: `ENUM_DATE_FORMATS_FLAGS` = 128u;
public const val `DATE_RTLREADING`: `ENUM_DATE_FORMATS_FLAGS` = 32u;
public const val `DATE_SHORTDATE`: `ENUM_DATE_FORMATS_FLAGS` = 1u;
public const val `DATE_USE_ALT_CALENDAR`: `ENUM_DATE_FORMATS_FLAGS` = 4u;
public const val `DATE_YEARMONTH`: `ENUM_DATE_FORMATS_FLAGS` = 8u;
public const val `DayUnit`: `CALDATETIME_DATEUNIT` = 4;
// UNSUPPORTED Rust 1619:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DetectEncodingInfo {
//     pub nLangID: u32,
//     pub nCodePage: u32,
//     pub nDocPercent: i32,
//     pub nConfidence: i32,
// }

// UNSUPPORTED Rust 1627:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ELS_GUID_LANGUAGE_DETECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf7e00b1_909b_4d95_a8f4_611f7c377702);

// UNSUPPORTED Rust 1628:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ELS_GUID_SCRIPT_DETECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d64b439_6caf_4f6b_b688_e5d0f4faa7d7);

// UNSUPPORTED Rust 1629:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ELS_GUID_TRANSLITERATION_BENGALI_TO_LATIN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf4dfd825_91a4_489f_855e_9ad9bee55727);

// UNSUPPORTED Rust 1630:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ELS_GUID_TRANSLITERATION_CYRILLIC_TO_LATIN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3dd12a98_5afd_4903_a13f_e17e6c0bfe01);

// UNSUPPORTED Rust 1631:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ELS_GUID_TRANSLITERATION_DEVANAGARI_TO_LATIN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4a4dcfe_2661_4d02_9835_f48187109803);

// UNSUPPORTED Rust 1632:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ELS_GUID_TRANSLITERATION_HANGUL_DECOMPOSITION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4ba2a721_e43d_41b7_b330_536ae1e48863);

// UNSUPPORTED Rust 1633:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ELS_GUID_TRANSLITERATION_HANS_TO_HANT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3caccdc8_5590_42dc_9a7b_b5a6b5b3b63b);

// UNSUPPORTED Rust 1634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ELS_GUID_TRANSLITERATION_HANT_TO_HANS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3a8333b_f4fc_42f6_a0c4_0462fe7317cb);

// UNSUPPORTED Rust 1635:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ELS_GUID_TRANSLITERATION_MALAYALAM_TO_LATIN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8b983b1_f8bf_4a2b_bcd5_5b5ea20613e1);

// UNSUPPORTED Rust 1636:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy, Default)]
// pub struct ENUMTEXTMETRICA {
//     pub etmNewTextMetricEx: NEWTEXTMETRICEXA,
//     pub etmAxesList: super::Graphics::Gdi::AXESLISTA,
// }

// UNSUPPORTED Rust 1643:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy, Default)]
// pub struct ENUMTEXTMETRICW {
//     pub etmNewTextMetricEx: NEWTEXTMETRICEXW,
//     pub etmAxesList: super::Graphics::Gdi::AXESLISTW,
// }

public const val `ENUM_ALL_CALENDARS`: UInt = 4294967295u;
public typealias `ENUM_DATE_FORMATS_FLAGS` = UInt;
public typealias `ENUM_SYSTEM_CODE_PAGES_FLAGS` = UInt;
public typealias `ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS` = UInt;
public const val `EraUnit`: `CALDATETIME_DATEUNIT` = 0;
// UNSUPPORTED Rust 1655:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILEMUIINFO {
//     pub dwSize: u32,
//     pub dwVersion: u32,
//     pub dwFileType: u32,
//     pub pChecksum: [u8; 16],
//     pub pServiceChecksum: [u8; 16],
//     pub dwLanguageNameOffset: u32,
//     pub dwTypeIDMainSize: u32,
//     pub dwTypeIDMainOffset: u32,
//     pub dwTypeNameMainOffset: u32,
//     pub dwTypeIDMUISize: u32,
//     pub dwTypeIDMUIOffset: u32,
//     pub dwTypeNameMUIOffset: u32,
//     pub abBuffer: [u8; 8],
// }

// UNSUPPORTED Rust 1672:1: declaration Impl has no candidate rule
// impl Default for FILEMUIINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FIND_ENDSWITH`: UInt = 2097152u;
public const val `FIND_FROMEND`: UInt = 8388608u;
public const val `FIND_FROMSTART`: UInt = 4194304u;
public const val `FIND_STARTSWITH`: UInt = 1048576u;
public typealias `FOLD_STRING_MAP_FLAGS` = UInt;
// UNSUPPORTED Rust 1682:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FONTSIGNATURE {
//     pub fsUsb: [u32; 4],
//     pub fsCsb: [u32; 2],
// }

// UNSUPPORTED Rust 1688:1: declaration Impl has no candidate rule
// impl Default for FONTSIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GEOCLASS_ALL`: `SYSGEOCLASS` = 0;
public const val `GEOCLASS_NATION`: `SYSGEOCLASS` = 16;
public const val `GEOCLASS_REGION`: `SYSGEOCLASS` = 14;
public const val `GEOID_NOT_AVAILABLE`: Int = -1;
public const val `GEO_CURRENCYCODE`: `SYSGEOTYPE` = 15;
public const val `GEO_CURRENCYSYMBOL`: `SYSGEOTYPE` = 16;
public const val `GEO_DIALINGCODE`: `SYSGEOTYPE` = 14;
// UNSUPPORTED Rust 1700:1: generic scalar type unsupported
// pub type GEO_ENUMNAMEPROC = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1701:1: generic scalar type unsupported
// pub type GEO_ENUMPROC = Option<unsafe extern "system" fn(param0: i32) -> windows_sys::core::BOOL>;

public const val `GEO_FRIENDLYNAME`: `SYSGEOTYPE` = 8;
public const val `GEO_ID`: `SYSGEOTYPE` = 18;
public const val `GEO_ISO2`: `SYSGEOTYPE` = 4;
public const val `GEO_ISO3`: `SYSGEOTYPE` = 5;
public const val `GEO_ISO_UN_NUMBER`: `SYSGEOTYPE` = 12;
public const val `GEO_LATITUDE`: `SYSGEOTYPE` = 2;
public const val `GEO_LCID`: `SYSGEOTYPE` = 7;
public const val `GEO_LONGITUDE`: `SYSGEOTYPE` = 3;
public const val `GEO_NAME`: `SYSGEOTYPE` = 17;
public const val `GEO_NATION`: `SYSGEOTYPE` = 1;
public const val `GEO_OFFICIALLANGUAGES`: `SYSGEOTYPE` = 11;
public const val `GEO_OFFICIALNAME`: `SYSGEOTYPE` = 9;
public const val `GEO_PARENT`: `SYSGEOTYPE` = 13;
public const val `GEO_RFC1766`: `SYSGEOTYPE` = 6;
public const val `GEO_TIMEZONES`: `SYSGEOTYPE` = 10;
// UNSUPPORTED Rust 1717:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GOFFSET {
//     pub du: i32,
//     pub dv: i32,
// }

public const val `GSS_ALLOW_INHERITED_COMMON`: UInt = 1u;
public const val `HIGHLEVEL_SERVICE_TYPES`: UInt = 1u;
public const val `HIGH_SURROGATE_END`: UInt = 56319u;
public const val `HIGH_SURROGATE_START`: UInt = 55296u;
// UNSUPPORTED Rust 1727:1: non-scalar type Ptr unsupported
// pub type HSAVEDUILANGUAGES = *mut core::ffi::c_void;

public const val `HourUnit`: `CALDATETIME_DATEUNIT` = 5;
public const val `IDN_ALLOW_UNASSIGNED`: UInt = 1u;
public const val `IDN_EMAIL_ADDRESS`: UInt = 4u;
public const val `IDN_RAW_PUNYCODE`: UInt = 8u;
public const val `IDN_USE_STD3_ASCII_RULES`: UInt = 2u;
public const val `IS_TEXT_UNICODE_ASCII16`: `IS_TEXT_UNICODE_RESULT` = 1u;
public const val `IS_TEXT_UNICODE_CONTROLS`: `IS_TEXT_UNICODE_RESULT` = 4u;
public const val `IS_TEXT_UNICODE_ILLEGAL_CHARS`: `IS_TEXT_UNICODE_RESULT` = 256u;
public const val `IS_TEXT_UNICODE_NOT_ASCII_MASK`: `IS_TEXT_UNICODE_RESULT` = 61440u;
public const val `IS_TEXT_UNICODE_NOT_UNICODE_MASK`: `IS_TEXT_UNICODE_RESULT` = 3840u;
public const val `IS_TEXT_UNICODE_NULL_BYTES`: `IS_TEXT_UNICODE_RESULT` = 4096u;
public const val `IS_TEXT_UNICODE_ODD_LENGTH`: `IS_TEXT_UNICODE_RESULT` = 512u;
public typealias `IS_TEXT_UNICODE_RESULT` = UInt;
public const val `IS_TEXT_UNICODE_REVERSE_ASCII16`: `IS_TEXT_UNICODE_RESULT` = 16u;
public const val `IS_TEXT_UNICODE_REVERSE_CONTROLS`: `IS_TEXT_UNICODE_RESULT` = 64u;
public const val `IS_TEXT_UNICODE_REVERSE_MASK`: `IS_TEXT_UNICODE_RESULT` = 240u;
public const val `IS_TEXT_UNICODE_REVERSE_SIGNATURE`: `IS_TEXT_UNICODE_RESULT` = 128u;
public const val `IS_TEXT_UNICODE_REVERSE_STATISTICS`: `IS_TEXT_UNICODE_RESULT` = 32u;
public const val `IS_TEXT_UNICODE_SIGNATURE`: `IS_TEXT_UNICODE_RESULT` = 8u;
public const val `IS_TEXT_UNICODE_STATISTICS`: `IS_TEXT_UNICODE_RESULT` = 2u;
public const val `IS_TEXT_UNICODE_UNICODE_MASK`: `IS_TEXT_UNICODE_RESULT` = 15u;
public typealias `IS_VALID_LOCALE_FLAGS` = UInt;
// UNSUPPORTED Rust 1750:1: generic scalar type unsupported
// pub type LANGGROUPLOCALE_ENUMPROCA = Option<unsafe extern "system" fn(param0: u32, param1: u32, param2: windows_sys::core::PCSTR, param3: isize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1751:1: generic scalar type unsupported
// pub type LANGGROUPLOCALE_ENUMPROCW = Option<unsafe extern "system" fn(param0: u32, param1: u32, param2: windows_sys::core::PCWSTR, param3: isize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1752:1: generic scalar type unsupported
// pub type LANGUAGEGROUP_ENUMPROCA = Option<unsafe extern "system" fn(param0: u32, param1: windows_sys::core::PCSTR, param2: windows_sys::core::PCSTR, param3: u32, param4: isize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1753:1: generic scalar type unsupported
// pub type LANGUAGEGROUP_ENUMPROCW = Option<unsafe extern "system" fn(param0: u32, param1: windows_sys::core::PCWSTR, param2: windows_sys::core::PCWSTR, param3: u32, param4: isize) -> windows_sys::core::BOOL>;

public const val `LANG_SYSTEM_DEFAULT`: Int = 2048;
public const val `LANG_USER_DEFAULT`: Int = 1024;
public const val `LCID_ALTERNATE_SORTS`: UInt = 4u;
public const val `LCID_INSTALLED`: `IS_VALID_LOCALE_FLAGS` = 1u;
public const val `LCID_SUPPORTED`: `IS_VALID_LOCALE_FLAGS` = 2u;
public const val `LCMAP_BYTEREV`: UInt = 2048u;
public const val `LCMAP_FULLWIDTH`: UInt = 8388608u;
public const val `LCMAP_HALFWIDTH`: UInt = 4194304u;
public const val `LCMAP_HASH`: UInt = 262144u;
public const val `LCMAP_HIRAGANA`: UInt = 1048576u;
public const val `LCMAP_KATAKANA`: UInt = 2097152u;
public const val `LCMAP_LINGUISTIC_CASING`: UInt = 16777216u;
public const val `LCMAP_LOWERCASE`: UInt = 256u;
public const val `LCMAP_SIMPLIFIED_CHINESE`: UInt = 33554432u;
public const val `LCMAP_SORTHANDLE`: UInt = 536870912u;
public const val `LCMAP_SORTKEY`: UInt = 1024u;
public const val `LCMAP_TITLECASE`: UInt = 768u;
public const val `LCMAP_TRADITIONAL_CHINESE`: UInt = 67108864u;
public const val `LCMAP_UPPERCASE`: UInt = 512u;
public const val `LGRPID_ARABIC`: UInt = 13u;
public const val `LGRPID_ARMENIAN`: UInt = 17u;
public const val `LGRPID_BALTIC`: UInt = 3u;
public const val `LGRPID_CENTRAL_EUROPE`: UInt = 2u;
public const val `LGRPID_CYRILLIC`: UInt = 5u;
public const val `LGRPID_GEORGIAN`: UInt = 16u;
public const val `LGRPID_GREEK`: UInt = 4u;
public const val `LGRPID_HEBREW`: UInt = 12u;
public const val `LGRPID_INDIC`: UInt = 15u;
public const val `LGRPID_INSTALLED`: `ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS` = 1u;
public const val `LGRPID_JAPANESE`: UInt = 7u;
public const val `LGRPID_KOREAN`: UInt = 8u;
public const val `LGRPID_SIMPLIFIED_CHINESE`: UInt = 10u;
public const val `LGRPID_SUPPORTED`: `ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS` = 2u;
public const val `LGRPID_THAI`: UInt = 11u;
public const val `LGRPID_TRADITIONAL_CHINESE`: UInt = 9u;
public const val `LGRPID_TURKIC`: UInt = 6u;
public const val `LGRPID_TURKISH`: UInt = 6u;
public const val `LGRPID_VIETNAMESE`: UInt = 14u;
public const val `LGRPID_WESTERN_EUROPE`: UInt = 1u;
public const val `LINGUISTIC_IGNORECASE`: `COMPARE_STRING_FLAGS` = 16u;
public const val `LINGUISTIC_IGNOREDIACRITIC`: `COMPARE_STRING_FLAGS` = 32u;
// UNSUPPORTED Rust 1795:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOCALESIGNATURE {
//     pub lsUsb: [u32; 4],
//     pub lsCsbDefault: [u32; 2],
//     pub lsCsbSupported: [u32; 2],
// }

// UNSUPPORTED Rust 1802:1: declaration Impl has no candidate rule
// impl Default for LOCALESIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOCALE_ALL`: UInt = 0u;
public const val `LOCALE_ALLOW_NEUTRAL_NAMES`: UInt = 134217728u;
public const val `LOCALE_ALTERNATE_SORTS`: UInt = 4u;
// UNSUPPORTED Rust 1810:1: generic scalar type unsupported
// pub type LOCALE_ENUMPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1811:1: generic scalar type unsupported
// pub type LOCALE_ENUMPROCEX = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1812:1: generic scalar type unsupported
// pub type LOCALE_ENUMPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

public const val `LOCALE_FONTSIGNATURE`: UInt = 88u;
public const val `LOCALE_ICALENDARTYPE`: UInt = 4105u;
public const val `LOCALE_ICENTURY`: UInt = 36u;
public const val `LOCALE_ICONSTRUCTEDLOCALE`: UInt = 125u;
public const val `LOCALE_ICOUNTRY`: UInt = 5u;
public const val `LOCALE_ICURRDIGITS`: UInt = 25u;
public const val `LOCALE_ICURRENCY`: UInt = 27u;
public const val `LOCALE_IDATE`: UInt = 33u;
public const val `LOCALE_IDAYLZERO`: UInt = 38u;
public const val `LOCALE_IDEFAULTANSICODEPAGE`: UInt = 4100u;
public const val `LOCALE_IDEFAULTCODEPAGE`: UInt = 11u;
public const val `LOCALE_IDEFAULTCOUNTRY`: UInt = 10u;
public const val `LOCALE_IDEFAULTEBCDICCODEPAGE`: UInt = 4114u;
public const val `LOCALE_IDEFAULTLANGUAGE`: UInt = 9u;
public const val `LOCALE_IDEFAULTMACCODEPAGE`: UInt = 4113u;
public const val `LOCALE_IDIALINGCODE`: UInt = 5u;
public const val `LOCALE_IDIGITS`: UInt = 17u;
public const val `LOCALE_IDIGITSUBSTITUTION`: UInt = 4116u;
public const val `LOCALE_IFIRSTDAYOFWEEK`: UInt = 4108u;
public const val `LOCALE_IFIRSTWEEKOFYEAR`: UInt = 4109u;
public const val `LOCALE_IGEOID`: UInt = 91u;
public const val `LOCALE_IINTLCURRDIGITS`: UInt = 26u;
public const val `LOCALE_ILANGUAGE`: UInt = 1u;
public const val `LOCALE_ILDATE`: UInt = 34u;
public const val `LOCALE_ILZERO`: UInt = 18u;
public const val `LOCALE_IMEASURE`: UInt = 13u;
public const val `LOCALE_IMONLZERO`: UInt = 39u;
public const val `LOCALE_INEGATIVEPERCENT`: UInt = 116u;
public const val `LOCALE_INEGCURR`: UInt = 28u;
public const val `LOCALE_INEGNUMBER`: UInt = 4112u;
public const val `LOCALE_INEGSEPBYSPACE`: UInt = 87u;
public const val `LOCALE_INEGSIGNPOSN`: UInt = 83u;
public const val `LOCALE_INEGSYMPRECEDES`: UInt = 86u;
public const val `LOCALE_INEUTRAL`: UInt = 113u;
public const val `LOCALE_IOPTIONALCALENDAR`: UInt = 4107u;
public const val `LOCALE_IPAPERSIZE`: UInt = 4106u;
public const val `LOCALE_IPOSITIVEPERCENT`: UInt = 117u;
public const val `LOCALE_IPOSSEPBYSPACE`: UInt = 85u;
public const val `LOCALE_IPOSSIGNPOSN`: UInt = 82u;
public const val `LOCALE_IPOSSYMPRECEDES`: UInt = 84u;
public const val `LOCALE_IREADINGLAYOUT`: UInt = 112u;
public const val `LOCALE_ITIME`: UInt = 35u;
public const val `LOCALE_ITIMEMARKPOSN`: UInt = 4101u;
public const val `LOCALE_ITLZERO`: UInt = 37u;
public const val `LOCALE_IUSEUTF8LEGACYACP`: UInt = 1638u;
public const val `LOCALE_IUSEUTF8LEGACYOEMCP`: UInt = 2457u;
// UNSUPPORTED Rust 1859:1: non-scalar type Ptr unsupported
// pub const LOCALE_NAME_INVARIANT: windows_sys::core::PCWSTR = windows_sys::core::w!("");

// UNSUPPORTED Rust 1860:1: non-scalar type Ptr unsupported
// pub const LOCALE_NAME_SYSTEM_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("!x-sys-default-locale");

public const val `LOCALE_NEUTRALDATA`: UInt = 16u;
public const val `LOCALE_NOUSEROVERRIDE`: UInt = 2147483648u;
public const val `LOCALE_REPLACEMENT`: UInt = 8u;
public const val `LOCALE_RETURN_GENITIVE_NAMES`: UInt = 268435456u;
public const val `LOCALE_RETURN_NUMBER`: UInt = 536870912u;
public const val `LOCALE_S1159`: UInt = 40u;
public const val `LOCALE_S2359`: UInt = 41u;
public const val `LOCALE_SABBREVCTRYNAME`: UInt = 7u;
public const val `LOCALE_SABBREVDAYNAME1`: UInt = 49u;
public const val `LOCALE_SABBREVDAYNAME2`: UInt = 50u;
public const val `LOCALE_SABBREVDAYNAME3`: UInt = 51u;
public const val `LOCALE_SABBREVDAYNAME4`: UInt = 52u;
public const val `LOCALE_SABBREVDAYNAME5`: UInt = 53u;
public const val `LOCALE_SABBREVDAYNAME6`: UInt = 54u;
public const val `LOCALE_SABBREVDAYNAME7`: UInt = 55u;
public const val `LOCALE_SABBREVLANGNAME`: UInt = 3u;
public const val `LOCALE_SABBREVMONTHNAME1`: UInt = 68u;
public const val `LOCALE_SABBREVMONTHNAME10`: UInt = 77u;
public const val `LOCALE_SABBREVMONTHNAME11`: UInt = 78u;
public const val `LOCALE_SABBREVMONTHNAME12`: UInt = 79u;
public const val `LOCALE_SABBREVMONTHNAME13`: UInt = 4111u;
public const val `LOCALE_SABBREVMONTHNAME2`: UInt = 69u;
public const val `LOCALE_SABBREVMONTHNAME3`: UInt = 70u;
public const val `LOCALE_SABBREVMONTHNAME4`: UInt = 71u;
public const val `LOCALE_SABBREVMONTHNAME5`: UInt = 72u;
public const val `LOCALE_SABBREVMONTHNAME6`: UInt = 73u;
public const val `LOCALE_SABBREVMONTHNAME7`: UInt = 74u;
public const val `LOCALE_SABBREVMONTHNAME8`: UInt = 75u;
public const val `LOCALE_SABBREVMONTHNAME9`: UInt = 76u;
public const val `LOCALE_SAM`: UInt = 40u;
public const val `LOCALE_SCONSOLEFALLBACKNAME`: UInt = 110u;
public const val `LOCALE_SCOUNTRY`: UInt = 6u;
public const val `LOCALE_SCURRENCY`: UInt = 20u;
public const val `LOCALE_SDATE`: UInt = 29u;
public const val `LOCALE_SDAYNAME1`: UInt = 42u;
public const val `LOCALE_SDAYNAME2`: UInt = 43u;
public const val `LOCALE_SDAYNAME3`: UInt = 44u;
public const val `LOCALE_SDAYNAME4`: UInt = 45u;
public const val `LOCALE_SDAYNAME5`: UInt = 46u;
public const val `LOCALE_SDAYNAME6`: UInt = 47u;
public const val `LOCALE_SDAYNAME7`: UInt = 48u;
public const val `LOCALE_SDECIMAL`: UInt = 14u;
public const val `LOCALE_SDURATION`: UInt = 93u;
public const val `LOCALE_SENGCOUNTRY`: UInt = 4098u;
public const val `LOCALE_SENGCURRNAME`: UInt = 4103u;
public const val `LOCALE_SENGLANGUAGE`: UInt = 4097u;
public const val `LOCALE_SENGLISHCOUNTRYNAME`: UInt = 4098u;
public const val `LOCALE_SENGLISHDISPLAYNAME`: UInt = 114u;
public const val `LOCALE_SENGLISHLANGUAGENAME`: UInt = 4097u;
public const val `LOCALE_SGROUPING`: UInt = 16u;
public const val `LOCALE_SINTLSYMBOL`: UInt = 21u;
public const val `LOCALE_SISO3166CTRYNAME`: UInt = 90u;
public const val `LOCALE_SISO3166CTRYNAME2`: UInt = 104u;
public const val `LOCALE_SISO639LANGNAME`: UInt = 89u;
public const val `LOCALE_SISO639LANGNAME2`: UInt = 103u;
public const val `LOCALE_SKEYBOARDSTOINSTALL`: UInt = 94u;
public const val `LOCALE_SLANGDISPLAYNAME`: UInt = 111u;
public const val `LOCALE_SLANGUAGE`: UInt = 2u;
public const val `LOCALE_SLIST`: UInt = 12u;
public const val `LOCALE_SLOCALIZEDCOUNTRYNAME`: UInt = 6u;
public const val `LOCALE_SLOCALIZEDDISPLAYNAME`: UInt = 2u;
public const val `LOCALE_SLOCALIZEDLANGUAGENAME`: UInt = 111u;
public const val `LOCALE_SLONGDATE`: UInt = 32u;
public const val `LOCALE_SMONDECIMALSEP`: UInt = 22u;
public const val `LOCALE_SMONGROUPING`: UInt = 24u;
public const val `LOCALE_SMONTHDAY`: UInt = 120u;
public const val `LOCALE_SMONTHNAME1`: UInt = 56u;
public const val `LOCALE_SMONTHNAME10`: UInt = 65u;
public const val `LOCALE_SMONTHNAME11`: UInt = 66u;
public const val `LOCALE_SMONTHNAME12`: UInt = 67u;
public const val `LOCALE_SMONTHNAME13`: UInt = 4110u;
public const val `LOCALE_SMONTHNAME2`: UInt = 57u;
public const val `LOCALE_SMONTHNAME3`: UInt = 58u;
public const val `LOCALE_SMONTHNAME4`: UInt = 59u;
public const val `LOCALE_SMONTHNAME5`: UInt = 60u;
public const val `LOCALE_SMONTHNAME6`: UInt = 61u;
public const val `LOCALE_SMONTHNAME7`: UInt = 62u;
public const val `LOCALE_SMONTHNAME8`: UInt = 63u;
public const val `LOCALE_SMONTHNAME9`: UInt = 64u;
public const val `LOCALE_SMONTHOUSANDSEP`: UInt = 23u;
public const val `LOCALE_SNAME`: UInt = 92u;
public const val `LOCALE_SNAN`: UInt = 105u;
public const val `LOCALE_SNATIVECOUNTRYNAME`: UInt = 8u;
public const val `LOCALE_SNATIVECTRYNAME`: UInt = 8u;
public const val `LOCALE_SNATIVECURRNAME`: UInt = 4104u;
public const val `LOCALE_SNATIVEDIGITS`: UInt = 19u;
public const val `LOCALE_SNATIVEDISPLAYNAME`: UInt = 115u;
public const val `LOCALE_SNATIVELANGNAME`: UInt = 4u;
public const val `LOCALE_SNATIVELANGUAGENAME`: UInt = 4u;
public const val `LOCALE_SNEGATIVESIGN`: UInt = 81u;
public const val `LOCALE_SNEGINFINITY`: UInt = 107u;
public const val `LOCALE_SOPENTYPELANGUAGETAG`: UInt = 122u;
public const val `LOCALE_SPARENT`: UInt = 109u;
public const val `LOCALE_SPECIFICDATA`: UInt = 32u;
public const val `LOCALE_SPERCENT`: UInt = 118u;
public const val `LOCALE_SPERMILLE`: UInt = 119u;
public const val `LOCALE_SPM`: UInt = 41u;
public const val `LOCALE_SPOSINFINITY`: UInt = 106u;
public const val `LOCALE_SPOSITIVESIGN`: UInt = 80u;
public const val `LOCALE_SRELATIVELONGDATE`: UInt = 124u;
public const val `LOCALE_SSCRIPTS`: UInt = 108u;
public const val `LOCALE_SSHORTDATE`: UInt = 31u;
public const val `LOCALE_SSHORTESTAM`: UInt = 126u;
public const val `LOCALE_SSHORTESTDAYNAME1`: UInt = 96u;
public const val `LOCALE_SSHORTESTDAYNAME2`: UInt = 97u;
public const val `LOCALE_SSHORTESTDAYNAME3`: UInt = 98u;
public const val `LOCALE_SSHORTESTDAYNAME4`: UInt = 99u;
public const val `LOCALE_SSHORTESTDAYNAME5`: UInt = 100u;
public const val `LOCALE_SSHORTESTDAYNAME6`: UInt = 101u;
public const val `LOCALE_SSHORTESTDAYNAME7`: UInt = 102u;
public const val `LOCALE_SSHORTESTPM`: UInt = 127u;
public const val `LOCALE_SSHORTTIME`: UInt = 121u;
public const val `LOCALE_SSORTLOCALE`: UInt = 123u;
public const val `LOCALE_SSORTNAME`: UInt = 4115u;
public const val `LOCALE_STHOUSAND`: UInt = 15u;
public const val `LOCALE_STIME`: UInt = 30u;
public const val `LOCALE_STIMEFORMAT`: UInt = 4099u;
public const val `LOCALE_SUPPLEMENTAL`: UInt = 2u;
public const val `LOCALE_SYEARMONTH`: UInt = 4102u;
public const val `LOCALE_SYSTEM_DEFAULT`: UInt = 2048u;
public const val `LOCALE_USER_DEFAULT`: UInt = 1024u;
public const val `LOCALE_USE_CP_ACP`: UInt = 1073741824u;
public const val `LOCALE_WINDOWS`: UInt = 1u;
public const val `LOWLEVEL_SERVICE_TYPES`: UInt = 2u;
public const val `LOW_SURROGATE_END`: UInt = 57343u;
public const val `LOW_SURROGATE_START`: UInt = 56320u;
// UNSUPPORTED Rust 1987:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPPING_DATA_RANGE {
//     pub dwStartIndex: u32,
//     pub dwEndIndex: u32,
//     pub pszDescription: windows_sys::core::PWSTR,
//     pub dwDescriptionLength: u32,
//     pub pData: *mut core::ffi::c_void,
//     pub dwDataSize: u32,
//     pub pszContentType: windows_sys::core::PWSTR,
//     pub prgActionIds: *mut windows_sys::core::PWSTR,
//     pub dwActionsCount: u32,
//     pub prgActionDisplayNames: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2001:1: declaration Impl has no candidate rule
// impl Default for MAPPING_DATA_RANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2006:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPPING_ENUM_OPTIONS {
//     pub Size: usize,
//     pub pszCategory: windows_sys::core::PWSTR,
//     pub pszInputLanguage: windows_sys::core::PWSTR,
//     pub pszOutputLanguage: windows_sys::core::PWSTR,
//     pub pszInputScript: windows_sys::core::PWSTR,
//     pub pszOutputScript: windows_sys::core::PWSTR,
//     pub pszInputContentType: windows_sys::core::PWSTR,
//     pub pszOutputContentType: windows_sys::core::PWSTR,
//     pub pGuid: *mut windows_sys::core::GUID,
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2020:1: declaration Impl has no candidate rule
// impl Default for MAPPING_ENUM_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2025:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPPING_OPTIONS {
//     pub Size: usize,
//     pub pszInputLanguage: windows_sys::core::PWSTR,
//     pub pszOutputLanguage: windows_sys::core::PWSTR,
//     pub pszInputScript: windows_sys::core::PWSTR,
//     pub pszOutputScript: windows_sys::core::PWSTR,
//     pub pszInputContentType: windows_sys::core::PWSTR,
//     pub pszOutputContentType: windows_sys::core::PWSTR,
//     pub pszUILanguage: windows_sys::core::PWSTR,
//     pub pfnRecognizeCallback: PFN_MAPPINGCALLBACKPROC,
//     pub pRecognizeCallerData: *mut core::ffi::c_void,
//     pub dwRecognizeCallerDataSize: u32,
//     pub pfnActionCallback: PFN_MAPPINGCALLBACKPROC,
//     pub pActionCallerData: *mut core::ffi::c_void,
//     pub dwActionCallerDataSize: u32,
//     pub dwServiceFlag: u32,
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2045:1: declaration Impl has no candidate rule
// impl Default for MAPPING_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPPING_PROPERTY_BAG {
//     pub Size: usize,
//     pub prgResultRanges: *mut MAPPING_DATA_RANGE,
//     pub dwRangesCount: u32,
//     pub pServiceData: *mut core::ffi::c_void,
//     pub dwServiceDataSize: u32,
//     pub pCallerData: *mut core::ffi::c_void,
//     pub dwCallerDataSize: u32,
//     pub pContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2062:1: declaration Impl has no candidate rule
// impl Default for MAPPING_PROPERTY_BAG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2067:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPPING_SERVICE_INFO {
//     pub Size: usize,
//     pub pszCopyright: windows_sys::core::PWSTR,
//     pub wMajorVersion: u16,
//     pub wMinorVersion: u16,
//     pub wBuildVersion: u16,
//     pub wStepVersion: u16,
//     pub dwInputContentTypesCount: u32,
//     pub prgInputContentTypes: *mut windows_sys::core::PWSTR,
//     pub dwOutputContentTypesCount: u32,
//     pub prgOutputContentTypes: *mut windows_sys::core::PWSTR,
//     pub dwInputLanguagesCount: u32,
//     pub prgInputLanguages: *mut windows_sys::core::PWSTR,
//     pub dwOutputLanguagesCount: u32,
//     pub prgOutputLanguages: *mut windows_sys::core::PWSTR,
//     pub dwInputScriptsCount: u32,
//     pub prgInputScripts: *mut windows_sys::core::PWSTR,
//     pub dwOutputScriptsCount: u32,
//     pub prgOutputScripts: *mut windows_sys::core::PWSTR,
//     pub guid: windows_sys::core::GUID,
//     pub pszCategory: windows_sys::core::PWSTR,
//     pub pszDescription: windows_sys::core::PWSTR,
//     pub dwPrivateDataSize: u32,
//     pub pPrivateData: *mut core::ffi::c_void,
//     pub pContext: *mut core::ffi::c_void,
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2096:1: declaration Impl has no candidate rule
// impl Default for MAPPING_SERVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAP_COMPOSITE`: `FOLD_STRING_MAP_FLAGS` = 64u;
public const val `MAP_EXPAND_LIGATURES`: `FOLD_STRING_MAP_FLAGS` = 8192u;
public const val `MAP_FOLDCZONE`: `FOLD_STRING_MAP_FLAGS` = 16u;
public const val `MAP_FOLDDIGITS`: `FOLD_STRING_MAP_FLAGS` = 128u;
public const val `MAP_PRECOMPOSED`: `FOLD_STRING_MAP_FLAGS` = 32u;
public const val `MAX_DEFAULTCHAR`: UInt = 2u;
public const val `MAX_LEADBYTES`: UInt = 12u;
public const val `MAX_LOCALE_NAME`: UInt = 32u;
public const val `MAX_MIMECP_NAME`: UInt = 64u;
public const val `MAX_MIMECSET_NAME`: UInt = 50u;
public const val `MAX_MIMEFACE_NAME`: UInt = 32u;
public const val `MAX_RFC1766_NAME`: UInt = 6u;
public const val `MAX_SCRIPT_NAME`: UInt = 48u;
public const val `MB_COMPOSITE`: `MULTI_BYTE_TO_WIDE_CHAR_FLAGS` = 2u;
public const val `MB_ERR_INVALID_CHARS`: `MULTI_BYTE_TO_WIDE_CHAR_FLAGS` = 8u;
public const val `MB_PRECOMPOSED`: `MULTI_BYTE_TO_WIDE_CHAR_FLAGS` = 1u;
public const val `MB_USEGLYPHCHARS`: `MULTI_BYTE_TO_WIDE_CHAR_FLAGS` = 4u;
public typealias `MIMECONTF` = Int;
public const val `MIMECONTF_BROWSER`: `MIMECONTF` = 2;
public const val `MIMECONTF_EXPORT`: `MIMECONTF` = 1024;
public const val `MIMECONTF_IMPORT`: `MIMECONTF` = 8;
public const val `MIMECONTF_MAILNEWS`: `MIMECONTF` = 1;
public const val `MIMECONTF_MIME_IE4`: `MIMECONTF` = 268435456;
public const val `MIMECONTF_MIME_LATEST`: `MIMECONTF` = 536870912;
public const val `MIMECONTF_MIME_REGISTRY`: `MIMECONTF` = 1073741824;
public const val `MIMECONTF_MINIMAL`: `MIMECONTF` = 4;
public const val `MIMECONTF_PRIVCONVERTER`: `MIMECONTF` = 65536;
public const val `MIMECONTF_SAVABLE_BROWSER`: `MIMECONTF` = 512;
public const val `MIMECONTF_SAVABLE_MAILNEWS`: `MIMECONTF` = 256;
public const val `MIMECONTF_VALID`: `MIMECONTF` = 131072;
public const val `MIMECONTF_VALID_NLS`: `MIMECONTF` = 262144;
// UNSUPPORTED Rust 2132:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIMECPINFO {
//     pub dwFlags: u32,
//     pub uiCodePage: u32,
//     pub uiFamilyCodePage: u32,
//     pub wszDescription: [u16; 64],
//     pub wszWebCharset: [u16; 50],
//     pub wszHeaderCharset: [u16; 50],
//     pub wszBodyCharset: [u16; 50],
//     pub wszFixedWidthFont: [u16; 32],
//     pub wszProportionalFont: [u16; 32],
//     pub bGDICharset: u8,
// }

// UNSUPPORTED Rust 2146:1: declaration Impl has no candidate rule
// impl Default for MIMECPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIMECSETINFO {
//     pub uiCodePage: u32,
//     pub uiInternetEncoding: u32,
//     pub wszCharset: [u16; 50],
// }

// UNSUPPORTED Rust 2158:1: declaration Impl has no candidate rule
// impl Default for MIMECSETINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIN_SPELLING_NTDDI`: UInt = 100794368u;
public typealias `MLCONVCHAR` = Int;
public const val `MLCONVCHARF_AUTODETECT`: `MLCONVCHAR` = 1;
public const val `MLCONVCHARF_DETECTJPN`: `MLCONVCHAR` = 32;
public const val `MLCONVCHARF_ENTITIZE`: `MLCONVCHAR` = 2;
public const val `MLCONVCHARF_NAME_ENTITIZE`: `MLCONVCHAR` = 4;
public const val `MLCONVCHARF_NCR_ENTITIZE`: `MLCONVCHAR` = 2;
public const val `MLCONVCHARF_NOBESTFITCHARS`: `MLCONVCHAR` = 16;
public const val `MLCONVCHARF_USEDEFCHAR`: `MLCONVCHAR` = 8;
public typealias `MLCP` = Int;
public typealias `MLDETECTCP` = Int;
public const val `MLDETECTCP_7BIT`: `MLDETECTCP` = 1;
public const val `MLDETECTCP_8BIT`: `MLDETECTCP` = 2;
public const val `MLDETECTCP_DBCS`: `MLDETECTCP` = 4;
public const val `MLDETECTCP_HTML`: `MLDETECTCP` = 8;
public const val `MLDETECTCP_NONE`: `MLDETECTCP` = 0;
public const val `MLDETECTCP_NUMBER`: `MLDETECTCP` = 16;
public const val `MLDETECTF_BROWSER`: `MLCP` = 2;
public const val `MLDETECTF_EURO_UTF8`: `MLCP` = 128;
public const val `MLDETECTF_FILTER_SPECIALCHAR`: `MLCP` = 64;
public const val `MLDETECTF_MAILNEWS`: `MLCP` = 1;
public const val `MLDETECTF_PREFERRED_ONLY`: `MLCP` = 32;
public const val `MLDETECTF_PRESERVE_ORDER`: `MLCP` = 16;
public const val `MLDETECTF_VALID`: `MLCP` = 4;
public const val `MLDETECTF_VALID_NLS`: `MLCP` = 8;
public typealias `MLSTR_FLAGS` = Int;
public const val `MLSTR_READ`: `MLSTR_FLAGS` = 1;
public const val `MLSTR_WRITE`: `MLSTR_FLAGS` = 2;
public const val `MUI_COMPLEX_SCRIPT_FILTER`: UInt = 512u;
public const val `MUI_CONSOLE_FILTER`: UInt = 256u;
public const val `MUI_FILEINFO_VERSION`: UInt = 1u;
public const val `MUI_FILETYPE_LANGUAGE_NEUTRAL_MAIN`: UInt = 2u;
public const val `MUI_FILETYPE_LANGUAGE_NEUTRAL_MUI`: UInt = 4u;
public const val `MUI_FILETYPE_NOT_LANGUAGE_NEUTRAL`: UInt = 1u;
public const val `MUI_FORMAT_INF_COMPAT`: UInt = 2u;
public const val `MUI_FORMAT_REG_COMPAT`: UInt = 1u;
public const val `MUI_FULL_LANGUAGE`: UInt = 1u;
public const val `MUI_IMMUTABLE_LOOKUP`: UInt = 16u;
public const val `MUI_LANGUAGE_EXACT`: UInt = 16u;
public const val `MUI_LANGUAGE_ID`: UInt = 4u;
public const val `MUI_LANGUAGE_INSTALLED`: UInt = 32u;
public const val `MUI_LANGUAGE_LICENSED`: UInt = 64u;
public const val `MUI_LANGUAGE_NAME`: UInt = 8u;
public const val `MUI_LANG_NEUTRAL_PE_FILE`: UInt = 256u;
public const val `MUI_LIP_LANGUAGE`: UInt = 4u;
public const val `MUI_MACHINE_LANGUAGE_SETTINGS`: UInt = 1024u;
public const val `MUI_MERGE_SYSTEM_FALLBACK`: UInt = 16u;
public const val `MUI_MERGE_USER_FALLBACK`: UInt = 32u;
public const val `MUI_NON_LANG_NEUTRAL_FILE`: UInt = 512u;
public const val `MUI_PARTIAL_LANGUAGE`: UInt = 2u;
public const val `MUI_QUERY_CHECKSUM`: UInt = 2u;
public const val `MUI_QUERY_LANGUAGE_NAME`: UInt = 4u;
public const val `MUI_QUERY_RESOURCE_TYPES`: UInt = 8u;
public const val `MUI_QUERY_TYPE`: UInt = 1u;
public const val `MUI_RESET_FILTERS`: UInt = 1u;
public const val `MUI_SKIP_STRING_CACHE`: UInt = 8u;
public const val `MUI_THREAD_LANGUAGES`: UInt = 64u;
public const val `MUI_USER_PREFERRED_UI_LANGUAGES`: UInt = 16u;
public const val `MUI_USE_INSTALLED_LANGUAGES`: UInt = 32u;
public const val `MUI_USE_SEARCH_ALL_LANGUAGES`: UInt = 64u;
public const val `MUI_VERIFY_FILE_EXISTS`: UInt = 4u;
public typealias `MULTI_BYTE_TO_WIDE_CHAR_FLAGS` = UInt;
public const val `MinuteUnit`: `CALDATETIME_DATEUNIT` = 6;
public const val `MonthUnit`: `CALDATETIME_DATEUNIT` = 2;
// UNSUPPORTED Rust 2227:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy, Default)]
// pub struct NEWTEXTMETRICEXA {
//     pub ntmTm: super::Graphics::Gdi::NEWTEXTMETRICA,
//     pub ntmFontSig: FONTSIGNATURE,
// }

// UNSUPPORTED Rust 2234:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy, Default)]
// pub struct NEWTEXTMETRICEXW {
//     pub ntmTm: super::Graphics::Gdi::NEWTEXTMETRICW,
//     pub ntmFontSig: FONTSIGNATURE,
// }

// UNSUPPORTED Rust 2241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NLSVERSIONINFO {
//     pub dwNLSVersionInfoSize: u32,
//     pub dwNLSVersion: u32,
//     pub dwDefinedVersion: u32,
//     pub dwEffectiveId: u32,
//     pub guidCustomVersion: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2250:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NLSVERSIONINFOEX {
//     pub dwNLSVersionInfoSize: u32,
//     pub dwNLSVersion: u32,
//     pub dwDefinedVersion: u32,
//     pub dwEffectiveId: u32,
//     pub guidCustomVersion: windows_sys::core::GUID,
// }

public const val `NLS_CP_CPINFO`: UInt = 268435456u;
public const val `NLS_CP_MBTOWC`: UInt = 1073741824u;
public const val `NLS_CP_WCTOMB`: UInt = 2147483648u;
public typealias `NORM_FORM` = Int;
public const val `NORM_IGNORECASE`: `COMPARE_STRING_FLAGS` = 1u;
public const val `NORM_IGNOREKANATYPE`: `COMPARE_STRING_FLAGS` = 65536u;
public const val `NORM_IGNORENONSPACE`: `COMPARE_STRING_FLAGS` = 2u;
public const val `NORM_IGNORESYMBOLS`: `COMPARE_STRING_FLAGS` = 4u;
public const val `NORM_IGNOREWIDTH`: `COMPARE_STRING_FLAGS` = 131072u;
public const val `NORM_LINGUISTIC_CASING`: `COMPARE_STRING_FLAGS` = 134217728u;
// UNSUPPORTED Rust 2269:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NUMBERFMTA {
//     pub NumDigits: u32,
//     pub LeadingZero: u32,
//     pub Grouping: u32,
//     pub lpDecimalSep: windows_sys::core::PSTR,
//     pub lpThousandSep: windows_sys::core::PSTR,
//     pub NegativeOrder: u32,
// }

// UNSUPPORTED Rust 2279:1: declaration Impl has no candidate rule
// impl Default for NUMBERFMTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2284:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NUMBERFMTW {
//     pub NumDigits: u32,
//     pub LeadingZero: u32,
//     pub Grouping: u32,
//     pub lpDecimalSep: windows_sys::core::PWSTR,
//     pub lpThousandSep: windows_sys::core::PWSTR,
//     pub NegativeOrder: u32,
// }

// UNSUPPORTED Rust 2294:1: declaration Impl has no candidate rule
// impl Default for NUMBERFMTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NUMSYS_NAME_CAPACITY`: UInt = 8u;
public const val `NormalizationC`: `NORM_FORM` = 1;
public const val `NormalizationD`: `NORM_FORM` = 2;
public const val `NormalizationKC`: `NORM_FORM` = 5;
public const val `NormalizationKD`: `NORM_FORM` = 6;
public const val `NormalizationOther`: `NORM_FORM` = 0;
public const val `OFFLINE_SERVICES`: UInt = 2u;
public const val `ONLINE_SERVICES`: UInt = 1u;
// UNSUPPORTED Rust 2307:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OPENTYPE_FEATURE_RECORD {
//     pub tagFeature: u32,
//     pub lParameter: i32,
// }

// UNSUPPORTED Rust 2313:1: generic scalar type unsupported
// pub type PFN_MAPPINGCALLBACKPROC = Option<unsafe extern "system" fn(pbag: *mut MAPPING_PROPERTY_BAG, data: *mut core::ffi::c_void, dwdatasize: u32, result: windows_sys::core::HRESULT)>;

// UNSUPPORTED Rust 2314:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RFC1766INFO {
//     pub lcid: u32,
//     pub wszRfc1766: [u16; 6],
//     pub wszLocaleName: [u16; 32],
// }

// UNSUPPORTED Rust 2321:1: declaration Impl has no candidate rule
// impl Default for RFC1766INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SCRIPTCONTF` = Int;
public const val `SCRIPTCONTF_FIXED_FONT`: `SCRIPTFONTCONTF` = 1;
public const val `SCRIPTCONTF_PROPORTIONAL_FONT`: `SCRIPTFONTCONTF` = 2;
public const val `SCRIPTCONTF_SCRIPT_HIDE`: `SCRIPTFONTCONTF` = 131072;
public const val `SCRIPTCONTF_SCRIPT_SYSTEM`: `SCRIPTFONTCONTF` = 262144;
public const val `SCRIPTCONTF_SCRIPT_USER`: `SCRIPTFONTCONTF` = 65536;
public typealias `SCRIPTFONTCONTF` = Int;
// UNSUPPORTED Rust 2333:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCRIPTFONTINFO {
//     pub scripts: i64,
//     pub wszFont: [u16; 32],
// }

// UNSUPPORTED Rust 2339:1: declaration Impl has no candidate rule
// impl Default for SCRIPTFONTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCRIPTINFO {
//     pub ScriptId: u8,
//     pub uiCodePage: u32,
//     pub wszDescription: [u16; 48],
//     pub wszFixedWidthFont: [u16; 32],
//     pub wszProportionalFont: [u16; 32],
// }

// UNSUPPORTED Rust 2353:1: declaration Impl has no candidate rule
// impl Default for SCRIPTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2358:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_ANALYSIS {
//     pub _bitfield: u16,
//     pub s: SCRIPT_STATE,
// }

// UNSUPPORTED Rust 2364:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_CHARPROP {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 2369:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_CONTROL {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2374:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_DIGITSUBSTITUTE {
//     pub _bitfield1: u32,
//     pub _bitfield2: u32,
//     pub dwReserved: u32,
// }

public const val `SCRIPT_DIGITSUBSTITUTE_CONTEXT`: UInt = 0u;
public const val `SCRIPT_DIGITSUBSTITUTE_NATIONAL`: UInt = 2u;
public const val `SCRIPT_DIGITSUBSTITUTE_NONE`: UInt = 1u;
public const val `SCRIPT_DIGITSUBSTITUTE_TRADITIONAL`: UInt = 3u;
// UNSUPPORTED Rust 2385:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_FONTPROPERTIES {
//     pub cBytes: i32,
//     pub wgBlank: u16,
//     pub wgDefault: u16,
//     pub wgInvalid: u16,
//     pub wgKashida: u16,
//     pub iKashidaWidth: i32,
// }

// UNSUPPORTED Rust 2395:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_GLYPHPROP {
//     pub sva: SCRIPT_VISATTR,
//     pub reserved: u16,
// }

public typealias `SCRIPT_IS_COMPLEX_FLAGS` = UInt;
// UNSUPPORTED Rust 2402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_ITEM {
//     pub iCharPos: i32,
//     pub a: SCRIPT_ANALYSIS,
// }

public typealias `SCRIPT_JUSTIFY` = Int;
public const val `SCRIPT_JUSTIFY_ARABIC_ALEF`: `SCRIPT_JUSTIFY` = 9;
public const val `SCRIPT_JUSTIFY_ARABIC_BA`: `SCRIPT_JUSTIFY` = 12;
public const val `SCRIPT_JUSTIFY_ARABIC_BARA`: `SCRIPT_JUSTIFY` = 13;
public const val `SCRIPT_JUSTIFY_ARABIC_BLANK`: `SCRIPT_JUSTIFY` = 1;
public const val `SCRIPT_JUSTIFY_ARABIC_HA`: `SCRIPT_JUSTIFY` = 10;
public const val `SCRIPT_JUSTIFY_ARABIC_KASHIDA`: `SCRIPT_JUSTIFY` = 8;
public const val `SCRIPT_JUSTIFY_ARABIC_NORMAL`: `SCRIPT_JUSTIFY` = 7;
public const val `SCRIPT_JUSTIFY_ARABIC_RA`: `SCRIPT_JUSTIFY` = 11;
public const val `SCRIPT_JUSTIFY_ARABIC_SEEN`: `SCRIPT_JUSTIFY` = 14;
public const val `SCRIPT_JUSTIFY_ARABIC_SEEN_M`: `SCRIPT_JUSTIFY` = 15;
public const val `SCRIPT_JUSTIFY_BLANK`: `SCRIPT_JUSTIFY` = 4;
public const val `SCRIPT_JUSTIFY_CHARACTER`: `SCRIPT_JUSTIFY` = 2;
public const val `SCRIPT_JUSTIFY_NONE`: `SCRIPT_JUSTIFY` = 0;
public const val `SCRIPT_JUSTIFY_RESERVED1`: `SCRIPT_JUSTIFY` = 3;
public const val `SCRIPT_JUSTIFY_RESERVED2`: `SCRIPT_JUSTIFY` = 5;
public const val `SCRIPT_JUSTIFY_RESERVED3`: `SCRIPT_JUSTIFY` = 6;
// UNSUPPORTED Rust 2425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_LOGATTR {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 2430:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_PROPERTIES {
//     pub _bitfield1: u32,
//     pub _bitfield2: u32,
// }

// UNSUPPORTED Rust 2436:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_STATE {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 2441:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCRIPT_TABDEF {
//     pub cTabStops: i32,
//     pub iScale: i32,
//     pub pTabStops: *mut i32,
//     pub iTabOrigin: i32,
// }

// UNSUPPORTED Rust 2449:1: declaration Impl has no candidate rule
// impl Default for SCRIPT_TABDEF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCRIPT_TAG_UNKNOWN`: UInt = 0u;
public const val `SCRIPT_UNDEFINED`: UInt = 0u;
// UNSUPPORTED Rust 2456:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCRIPT_VISATTR {
//     pub _bitfield: u16,
// }

public const val `SGCM_RTL`: UInt = 1u;
public const val `SIC_ASCIIDIGIT`: `SCRIPT_IS_COMPLEX_FLAGS` = 2u;
public const val `SIC_COMPLEX`: `SCRIPT_IS_COMPLEX_FLAGS` = 1u;
public const val `SIC_NEUTRAL`: `SCRIPT_IS_COMPLEX_FLAGS` = 4u;
public const val `SORTING_PARADIGM_ICU`: UInt = 16777216u;
public const val `SORTING_PARADIGM_NLS`: UInt = 0u;
public const val `SORT_DIGITSASNUMBERS`: `COMPARE_STRING_FLAGS` = 8u;
public const val `SORT_STRINGSORT`: `COMPARE_STRING_FLAGS` = 4096u;
public const val `SSA_BREAK`: UInt = 64u;
public const val `SSA_CLIP`: UInt = 4u;
public const val `SSA_DONTGLYPH`: UInt = 1073741824u;
public const val `SSA_DZWG`: UInt = 16u;
public const val `SSA_FALLBACK`: UInt = 32u;
public const val `SSA_FIT`: UInt = 8u;
public const val `SSA_FULLMEASURE`: UInt = 67108864u;
public const val `SSA_GCP`: UInt = 512u;
public const val `SSA_GLYPHS`: UInt = 128u;
public const val `SSA_HIDEHOTKEY`: UInt = 8192u;
public const val `SSA_HOTKEY`: UInt = 1024u;
public const val `SSA_HOTKEYONLY`: UInt = 9216u;
public const val `SSA_LAYOUTRTL`: UInt = 536870912u;
public const val `SSA_LINK`: UInt = 4096u;
public const val `SSA_LPKANSIFALLBACK`: UInt = 134217728u;
public const val `SSA_METAFILE`: UInt = 2048u;
public const val `SSA_NOKASHIDA`: UInt = 2147483648u;
public const val `SSA_PASSWORD`: UInt = 1u;
public const val `SSA_PIDX`: UInt = 268435456u;
public const val `SSA_RTL`: UInt = 256u;
public const val `SSA_TAB`: UInt = 2u;
public typealias `SYSGEOCLASS` = Int;
public typealias `SYSGEOTYPE` = Int;
public typealias `SYSNLS_FUNCTION` = Int;
public const val `SecondUnit`: `CALDATETIME_DATEUNIT` = 7;
// UNSUPPORTED Rust 2494:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SpellCheckerFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7ab36653_1796_484b_bdfa_e74f1db7c1dc);

public const val `TCI_SRCCHARSET`: `TRANSLATE_CHARSET_INFO_FLAGS` = 1u;
public const val `TCI_SRCCODEPAGE`: `TRANSLATE_CHARSET_INFO_FLAGS` = 2u;
public const val `TCI_SRCFONTSIG`: `TRANSLATE_CHARSET_INFO_FLAGS` = 3u;
public const val `TCI_SRCLOCALE`: `TRANSLATE_CHARSET_INFO_FLAGS` = 4096u;
// UNSUPPORTED Rust 2499:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TEXTRANGE_PROPERTIES {
//     pub potfRecords: *mut OPENTYPE_FEATURE_RECORD,
//     pub cotfRecords: i32,
// }

// UNSUPPORTED Rust 2505:1: declaration Impl has no candidate rule
// impl Default for TEXTRANGE_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2510:1: generic scalar type unsupported
// pub type TIMEFMT_ENUMPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2511:1: generic scalar type unsupported
// pub type TIMEFMT_ENUMPROCEX = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2512:1: generic scalar type unsupported
// pub type TIMEFMT_ENUMPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

public const val `TIME_FORCE24HOURFORMAT`: `TIME_FORMAT_FLAGS` = 8u;
public typealias `TIME_FORMAT_FLAGS` = UInt;
public const val `TIME_NOMINUTESORSECONDS`: `TIME_FORMAT_FLAGS` = 1u;
public const val `TIME_NOSECONDS`: `TIME_FORMAT_FLAGS` = 2u;
public const val `TIME_NOTIMEMARKER`: `TIME_FORMAT_FLAGS` = 4u;
public typealias `TRANSLATE_CHARSET_INFO_FLAGS` = UInt;
public const val `TickUnit`: `CALDATETIME_DATEUNIT` = 8;
public const val `U16_MAX_LENGTH`: UInt = 2u;
// UNSUPPORTED Rust 2521:1: non-scalar type Ptr unsupported
// pub const U8_LEAD3_T1_BITS: windows_sys::core::PCSTR = windows_sys::core::s!(" 000000000000\u{10}00");

// UNSUPPORTED Rust 2522:1: non-scalar type Ptr unsupported
// pub const U8_LEAD4_T1_BITS: windows_sys::core::PCSTR = windows_sys::core::s!("\u{0}\u{0}\u{0}\u{0}\u{0}\u{0}\u{0}\u{0}\u{1e}\u{f}\u{f}\u{f}\u{0}\u{0}\u{0}\u{0}");

public const val `U8_MAX_LENGTH`: UInt = 4u;
public typealias `UAcceptResult` = Int;
public typealias `UAlphabeticIndexLabelType` = Int;
public const val `UBIDI_DEFAULT_LTR`: UInt = 254u;
public const val `UBIDI_DEFAULT_RTL`: UInt = 255u;
public const val `UBIDI_DO_MIRRORING`: UInt = 2u;
public const val `UBIDI_INSERT_LRM_FOR_NUMERIC`: UInt = 4u;
public const val `UBIDI_KEEP_BASE_COMBINING`: UInt = 1u;
public const val `UBIDI_LEVEL_OVERRIDE`: UInt = 128u;
public const val `UBIDI_LOGICAL`: `UBiDiOrder` = 0;
public const val `UBIDI_LTR`: `UBiDiDirection` = 0;
public const val `UBIDI_MAP_NOWHERE`: Int = -1;
public const val `UBIDI_MAX_EXPLICIT_LEVEL`: UInt = 125u;
public const val `UBIDI_MIRRORING_OFF`: `UBiDiMirroring` = 0;
public const val `UBIDI_MIRRORING_ON`: `UBiDiMirroring` = 1;
public const val `UBIDI_MIXED`: `UBiDiDirection` = 2;
public const val `UBIDI_NEUTRAL`: `UBiDiDirection` = 3;
public const val `UBIDI_OPTION_DEFAULT`: `UBiDiReorderingOption` = 0;
public const val `UBIDI_OPTION_INSERT_MARKS`: `UBiDiReorderingOption` = 1;
public const val `UBIDI_OPTION_REMOVE_CONTROLS`: `UBiDiReorderingOption` = 2;
public const val `UBIDI_OPTION_STREAMING`: `UBiDiReorderingOption` = 4;
public const val `UBIDI_OUTPUT_REVERSE`: UInt = 16u;
public const val `UBIDI_REMOVE_BIDI_CONTROLS`: UInt = 8u;
public const val `UBIDI_REORDER_DEFAULT`: `UBiDiReorderingMode` = 0;
public const val `UBIDI_REORDER_GROUP_NUMBERS_WITH_R`: `UBiDiReorderingMode` = 2;
public const val `UBIDI_REORDER_INVERSE_FOR_NUMBERS_SPECIAL`: `UBiDiReorderingMode` = 6;
public const val `UBIDI_REORDER_INVERSE_LIKE_DIRECT`: `UBiDiReorderingMode` = 5;
public const val `UBIDI_REORDER_INVERSE_NUMBERS_AS_L`: `UBiDiReorderingMode` = 4;
public const val `UBIDI_REORDER_NUMBERS_SPECIAL`: `UBiDiReorderingMode` = 1;
public const val `UBIDI_REORDER_RUNS_ONLY`: `UBiDiReorderingMode` = 3;
public const val `UBIDI_RTL`: `UBiDiDirection` = 1;
public const val `UBIDI_VISUAL`: `UBiDiOrder` = 1;
public const val `UBLOCK_ADLAM`: `UBlockCode` = 263;
public const val `UBLOCK_AEGEAN_NUMBERS`: `UBlockCode` = 119;
public const val `UBLOCK_AHOM`: `UBlockCode` = 253;
public const val `UBLOCK_ALCHEMICAL_SYMBOLS`: `UBlockCode` = 208;
public const val `UBLOCK_ALPHABETIC_PRESENTATION_FORMS`: `UBlockCode` = 80;
public const val `UBLOCK_ANATOLIAN_HIEROGLYPHS`: `UBlockCode` = 254;
public const val `UBLOCK_ANCIENT_GREEK_MUSICAL_NOTATION`: `UBlockCode` = 126;
public const val `UBLOCK_ANCIENT_GREEK_NUMBERS`: `UBlockCode` = 127;
public const val `UBLOCK_ANCIENT_SYMBOLS`: `UBlockCode` = 165;
public const val `UBLOCK_ARABIC`: `UBlockCode` = 12;
public const val `UBLOCK_ARABIC_EXTENDED_A`: `UBlockCode` = 210;
public const val `UBLOCK_ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS`: `UBlockCode` = 211;
public const val `UBLOCK_ARABIC_PRESENTATION_FORMS_A`: `UBlockCode` = 81;
public const val `UBLOCK_ARABIC_PRESENTATION_FORMS_B`: `UBlockCode` = 85;
public const val `UBLOCK_ARABIC_SUPPLEMENT`: `UBlockCode` = 128;
public const val `UBLOCK_ARMENIAN`: `UBlockCode` = 10;
public const val `UBLOCK_ARROWS`: `UBlockCode` = 46;
public const val `UBLOCK_AVESTAN`: `UBlockCode` = 188;
public const val `UBLOCK_BALINESE`: `UBlockCode` = 147;
public const val `UBLOCK_BAMUM`: `UBlockCode` = 177;
public const val `UBLOCK_BAMUM_SUPPLEMENT`: `UBlockCode` = 202;
public const val `UBLOCK_BASIC_LATIN`: `UBlockCode` = 1;
public const val `UBLOCK_BASSA_VAH`: `UBlockCode` = 221;
public const val `UBLOCK_BATAK`: `UBlockCode` = 199;
public const val `UBLOCK_BENGALI`: `UBlockCode` = 16;
public const val `UBLOCK_BHAIKSUKI`: `UBlockCode` = 264;
public const val `UBLOCK_BLOCK_ELEMENTS`: `UBlockCode` = 53;
public const val `UBLOCK_BOPOMOFO`: `UBlockCode` = 64;
public const val `UBLOCK_BOPOMOFO_EXTENDED`: `UBlockCode` = 67;
public const val `UBLOCK_BOX_DRAWING`: `UBlockCode` = 52;
public const val `UBLOCK_BRAHMI`: `UBlockCode` = 201;
public const val `UBLOCK_BRAILLE_PATTERNS`: `UBlockCode` = 57;
public const val `UBLOCK_BUGINESE`: `UBlockCode` = 129;
public const val `UBLOCK_BUHID`: `UBlockCode` = 100;
public const val `UBLOCK_BYZANTINE_MUSICAL_SYMBOLS`: `UBlockCode` = 91;
public const val `UBLOCK_CARIAN`: `UBlockCode` = 168;
public const val `UBLOCK_CAUCASIAN_ALBANIAN`: `UBlockCode` = 222;
public const val `UBLOCK_CHAKMA`: `UBlockCode` = 212;
public const val `UBLOCK_CHAM`: `UBlockCode` = 164;
public const val `UBLOCK_CHEROKEE`: `UBlockCode` = 32;
public const val `UBLOCK_CHEROKEE_SUPPLEMENT`: `UBlockCode` = 255;
public const val `UBLOCK_CHESS_SYMBOLS`: `UBlockCode` = 281;
public const val `UBLOCK_CHORASMIAN`: `UBlockCode` = 301;
public const val `UBLOCK_CJK_COMPATIBILITY`: `UBlockCode` = 69;
public const val `UBLOCK_CJK_COMPATIBILITY_FORMS`: `UBlockCode` = 83;
public const val `UBLOCK_CJK_COMPATIBILITY_IDEOGRAPHS`: `UBlockCode` = 79;
public const val `UBLOCK_CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT`: `UBlockCode` = 95;
public const val `UBLOCK_CJK_RADICALS_SUPPLEMENT`: `UBlockCode` = 58;
public const val `UBLOCK_CJK_STROKES`: `UBlockCode` = 130;
public const val `UBLOCK_CJK_SYMBOLS_AND_PUNCTUATION`: `UBlockCode` = 61;
public const val `UBLOCK_CJK_UNIFIED_IDEOGRAPHS`: `UBlockCode` = 71;
public const val `UBLOCK_CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A`: `UBlockCode` = 70;
public const val `UBLOCK_CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B`: `UBlockCode` = 94;
public const val `UBLOCK_CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C`: `UBlockCode` = 197;
public const val `UBLOCK_CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D`: `UBlockCode` = 209;
public const val `UBLOCK_CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E`: `UBlockCode` = 256;
public const val `UBLOCK_CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F`: `UBlockCode` = 274;
public const val `UBLOCK_CJK_UNIFIED_IDEOGRAPHS_EXTENSION_G`: `UBlockCode` = 302;
public const val `UBLOCK_COMBINING_DIACRITICAL_MARKS`: `UBlockCode` = 7;
public const val `UBLOCK_COMBINING_DIACRITICAL_MARKS_EXTENDED`: `UBlockCode` = 224;
public const val `UBLOCK_COMBINING_DIACRITICAL_MARKS_SUPPLEMENT`: `UBlockCode` = 131;
public const val `UBLOCK_COMBINING_HALF_MARKS`: `UBlockCode` = 82;
public const val `UBLOCK_COMBINING_MARKS_FOR_SYMBOLS`: `UBlockCode` = 43;
public const val `UBLOCK_COMMON_INDIC_NUMBER_FORMS`: `UBlockCode` = 178;
public const val `UBLOCK_CONTROL_PICTURES`: `UBlockCode` = 49;
public const val `UBLOCK_COPTIC`: `UBlockCode` = 132;
public const val `UBLOCK_COPTIC_EPACT_NUMBERS`: `UBlockCode` = 223;
public const val `UBLOCK_COUNTING_ROD_NUMERALS`: `UBlockCode` = 154;
public const val `UBLOCK_CUNEIFORM`: `UBlockCode` = 152;
public const val `UBLOCK_CUNEIFORM_NUMBERS_AND_PUNCTUATION`: `UBlockCode` = 153;
public const val `UBLOCK_CURRENCY_SYMBOLS`: `UBlockCode` = 42;
public const val `UBLOCK_CYPRIOT_SYLLABARY`: `UBlockCode` = 123;
public const val `UBLOCK_CYRILLIC`: `UBlockCode` = 9;
public const val `UBLOCK_CYRILLIC_EXTENDED_A`: `UBlockCode` = 158;
public const val `UBLOCK_CYRILLIC_EXTENDED_B`: `UBlockCode` = 160;
public const val `UBLOCK_CYRILLIC_EXTENDED_C`: `UBlockCode` = 265;
public const val `UBLOCK_CYRILLIC_SUPPLEMENT`: `UBlockCode` = 97;
public const val `UBLOCK_CYRILLIC_SUPPLEMENTARY`: `UBlockCode` = 97;
public const val `UBLOCK_DESERET`: `UBlockCode` = 90;
public const val `UBLOCK_DEVANAGARI`: `UBlockCode` = 15;
public const val `UBLOCK_DEVANAGARI_EXTENDED`: `UBlockCode` = 179;
public const val `UBLOCK_DINGBATS`: `UBlockCode` = 56;
public const val `UBLOCK_DIVES_AKURU`: `UBlockCode` = 303;
public const val `UBLOCK_DOGRA`: `UBlockCode` = 282;
public const val `UBLOCK_DOMINO_TILES`: `UBlockCode` = 171;
public const val `UBLOCK_DUPLOYAN`: `UBlockCode` = 225;
public const val `UBLOCK_EARLY_DYNASTIC_CUNEIFORM`: `UBlockCode` = 257;
public const val `UBLOCK_EGYPTIAN_HIEROGLYPHS`: `UBlockCode` = 194;
public const val `UBLOCK_EGYPTIAN_HIEROGLYPH_FORMAT_CONTROLS`: `UBlockCode` = 292;
public const val `UBLOCK_ELBASAN`: `UBlockCode` = 226;
public const val `UBLOCK_ELYMAIC`: `UBlockCode` = 293;
public const val `UBLOCK_EMOTICONS`: `UBlockCode` = 206;
public const val `UBLOCK_ENCLOSED_ALPHANUMERICS`: `UBlockCode` = 51;
public const val `UBLOCK_ENCLOSED_ALPHANUMERIC_SUPPLEMENT`: `UBlockCode` = 195;
public const val `UBLOCK_ENCLOSED_CJK_LETTERS_AND_MONTHS`: `UBlockCode` = 68;
public const val `UBLOCK_ENCLOSED_IDEOGRAPHIC_SUPPLEMENT`: `UBlockCode` = 196;
public const val `UBLOCK_ETHIOPIC`: `UBlockCode` = 31;
public const val `UBLOCK_ETHIOPIC_EXTENDED`: `UBlockCode` = 133;
public const val `UBLOCK_ETHIOPIC_EXTENDED_A`: `UBlockCode` = 200;
public const val `UBLOCK_ETHIOPIC_SUPPLEMENT`: `UBlockCode` = 134;
public const val `UBLOCK_GENERAL_PUNCTUATION`: `UBlockCode` = 40;
public const val `UBLOCK_GEOMETRIC_SHAPES`: `UBlockCode` = 54;
public const val `UBLOCK_GEOMETRIC_SHAPES_EXTENDED`: `UBlockCode` = 227;
public const val `UBLOCK_GEORGIAN`: `UBlockCode` = 29;
public const val `UBLOCK_GEORGIAN_EXTENDED`: `UBlockCode` = 283;
public const val `UBLOCK_GEORGIAN_SUPPLEMENT`: `UBlockCode` = 135;
public const val `UBLOCK_GLAGOLITIC`: `UBlockCode` = 136;
public const val `UBLOCK_GLAGOLITIC_SUPPLEMENT`: `UBlockCode` = 266;
public const val `UBLOCK_GOTHIC`: `UBlockCode` = 89;
public const val `UBLOCK_GRANTHA`: `UBlockCode` = 228;
public const val `UBLOCK_GREEK`: `UBlockCode` = 8;
public const val `UBLOCK_GREEK_EXTENDED`: `UBlockCode` = 39;
public const val `UBLOCK_GUJARATI`: `UBlockCode` = 18;
public const val `UBLOCK_GUNJALA_GONDI`: `UBlockCode` = 284;
public const val `UBLOCK_GURMUKHI`: `UBlockCode` = 17;
public const val `UBLOCK_HALFWIDTH_AND_FULLWIDTH_FORMS`: `UBlockCode` = 87;
public const val `UBLOCK_HANGUL_COMPATIBILITY_JAMO`: `UBlockCode` = 65;
public const val `UBLOCK_HANGUL_JAMO`: `UBlockCode` = 30;
public const val `UBLOCK_HANGUL_JAMO_EXTENDED_A`: `UBlockCode` = 180;
public const val `UBLOCK_HANGUL_JAMO_EXTENDED_B`: `UBlockCode` = 185;
public const val `UBLOCK_HANGUL_SYLLABLES`: `UBlockCode` = 74;
public const val `UBLOCK_HANIFI_ROHINGYA`: `UBlockCode` = 285;
public const val `UBLOCK_HANUNOO`: `UBlockCode` = 99;
public const val `UBLOCK_HATRAN`: `UBlockCode` = 258;
public const val `UBLOCK_HEBREW`: `UBlockCode` = 11;
public const val `UBLOCK_HIGH_PRIVATE_USE_SURROGATES`: `UBlockCode` = 76;
public const val `UBLOCK_HIGH_SURROGATES`: `UBlockCode` = 75;
public const val `UBLOCK_HIRAGANA`: `UBlockCode` = 62;
public const val `UBLOCK_IDEOGRAPHIC_DESCRIPTION_CHARACTERS`: `UBlockCode` = 60;
public const val `UBLOCK_IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION`: `UBlockCode` = 267;
public const val `UBLOCK_IMPERIAL_ARAMAIC`: `UBlockCode` = 186;
public const val `UBLOCK_INDIC_SIYAQ_NUMBERS`: `UBlockCode` = 286;
public const val `UBLOCK_INSCRIPTIONAL_PAHLAVI`: `UBlockCode` = 190;
public const val `UBLOCK_INSCRIPTIONAL_PARTHIAN`: `UBlockCode` = 189;
public const val `UBLOCK_INVALID_CODE`: `UBlockCode` = -1;
public const val `UBLOCK_IPA_EXTENSIONS`: `UBlockCode` = 5;
public const val `UBLOCK_JAVANESE`: `UBlockCode` = 181;
public const val `UBLOCK_KAITHI`: `UBlockCode` = 193;
public const val `UBLOCK_KANA_EXTENDED_A`: `UBlockCode` = 275;
public const val `UBLOCK_KANA_SUPPLEMENT`: `UBlockCode` = 203;
public const val `UBLOCK_KANBUN`: `UBlockCode` = 66;
public const val `UBLOCK_KANGXI_RADICALS`: `UBlockCode` = 59;
public const val `UBLOCK_KANNADA`: `UBlockCode` = 22;
public const val `UBLOCK_KATAKANA`: `UBlockCode` = 63;
public const val `UBLOCK_KATAKANA_PHONETIC_EXTENSIONS`: `UBlockCode` = 107;
public const val `UBLOCK_KAYAH_LI`: `UBlockCode` = 162;
public const val `UBLOCK_KHAROSHTHI`: `UBlockCode` = 137;
public const val `UBLOCK_KHITAN_SMALL_SCRIPT`: `UBlockCode` = 304;
public const val `UBLOCK_KHMER`: `UBlockCode` = 36;
public const val `UBLOCK_KHMER_SYMBOLS`: `UBlockCode` = 113;
public const val `UBLOCK_KHOJKI`: `UBlockCode` = 229;
public const val `UBLOCK_KHUDAWADI`: `UBlockCode` = 230;
public const val `UBLOCK_LAO`: `UBlockCode` = 26;
public const val `UBLOCK_LATIN_1_SUPPLEMENT`: `UBlockCode` = 2;
public const val `UBLOCK_LATIN_EXTENDED_A`: `UBlockCode` = 3;
public const val `UBLOCK_LATIN_EXTENDED_ADDITIONAL`: `UBlockCode` = 38;
public const val `UBLOCK_LATIN_EXTENDED_B`: `UBlockCode` = 4;
public const val `UBLOCK_LATIN_EXTENDED_C`: `UBlockCode` = 148;
public const val `UBLOCK_LATIN_EXTENDED_D`: `UBlockCode` = 149;
public const val `UBLOCK_LATIN_EXTENDED_E`: `UBlockCode` = 231;
public const val `UBLOCK_LEPCHA`: `UBlockCode` = 156;
public const val `UBLOCK_LETTERLIKE_SYMBOLS`: `UBlockCode` = 44;
public const val `UBLOCK_LIMBU`: `UBlockCode` = 111;
public const val `UBLOCK_LINEAR_A`: `UBlockCode` = 232;
public const val `UBLOCK_LINEAR_B_IDEOGRAMS`: `UBlockCode` = 118;
public const val `UBLOCK_LINEAR_B_SYLLABARY`: `UBlockCode` = 117;
public const val `UBLOCK_LISU`: `UBlockCode` = 176;
public const val `UBLOCK_LISU_SUPPLEMENT`: `UBlockCode` = 305;
public const val `UBLOCK_LOW_SURROGATES`: `UBlockCode` = 77;
public const val `UBLOCK_LYCIAN`: `UBlockCode` = 167;
public const val `UBLOCK_LYDIAN`: `UBlockCode` = 169;
public const val `UBLOCK_MAHAJANI`: `UBlockCode` = 233;
public const val `UBLOCK_MAHJONG_TILES`: `UBlockCode` = 170;
public const val `UBLOCK_MAKASAR`: `UBlockCode` = 287;
public const val `UBLOCK_MALAYALAM`: `UBlockCode` = 23;
public const val `UBLOCK_MANDAIC`: `UBlockCode` = 198;
public const val `UBLOCK_MANICHAEAN`: `UBlockCode` = 234;
public const val `UBLOCK_MARCHEN`: `UBlockCode` = 268;
public const val `UBLOCK_MASARAM_GONDI`: `UBlockCode` = 276;
public const val `UBLOCK_MATHEMATICAL_ALPHANUMERIC_SYMBOLS`: `UBlockCode` = 93;
public const val `UBLOCK_MATHEMATICAL_OPERATORS`: `UBlockCode` = 47;
public const val `UBLOCK_MAYAN_NUMERALS`: `UBlockCode` = 288;
public const val `UBLOCK_MEDEFAIDRIN`: `UBlockCode` = 289;
public const val `UBLOCK_MEETEI_MAYEK`: `UBlockCode` = 184;
public const val `UBLOCK_MEETEI_MAYEK_EXTENSIONS`: `UBlockCode` = 213;
public const val `UBLOCK_MENDE_KIKAKUI`: `UBlockCode` = 235;
public const val `UBLOCK_MEROITIC_CURSIVE`: `UBlockCode` = 214;
public const val `UBLOCK_MEROITIC_HIEROGLYPHS`: `UBlockCode` = 215;
public const val `UBLOCK_MIAO`: `UBlockCode` = 216;
public const val `UBLOCK_MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A`: `UBlockCode` = 102;
public const val `UBLOCK_MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B`: `UBlockCode` = 105;
public const val `UBLOCK_MISCELLANEOUS_SYMBOLS`: `UBlockCode` = 55;
public const val `UBLOCK_MISCELLANEOUS_SYMBOLS_AND_ARROWS`: `UBlockCode` = 115;
public const val `UBLOCK_MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS`: `UBlockCode` = 205;
public const val `UBLOCK_MISCELLANEOUS_TECHNICAL`: `UBlockCode` = 48;
public const val `UBLOCK_MODI`: `UBlockCode` = 236;
public const val `UBLOCK_MODIFIER_TONE_LETTERS`: `UBlockCode` = 138;
public const val `UBLOCK_MONGOLIAN`: `UBlockCode` = 37;
public const val `UBLOCK_MONGOLIAN_SUPPLEMENT`: `UBlockCode` = 269;
public const val `UBLOCK_MRO`: `UBlockCode` = 237;
public const val `UBLOCK_MULTANI`: `UBlockCode` = 259;
public const val `UBLOCK_MUSICAL_SYMBOLS`: `UBlockCode` = 92;
public const val `UBLOCK_MYANMAR`: `UBlockCode` = 28;
public const val `UBLOCK_MYANMAR_EXTENDED_A`: `UBlockCode` = 182;
public const val `UBLOCK_MYANMAR_EXTENDED_B`: `UBlockCode` = 238;
public const val `UBLOCK_NABATAEAN`: `UBlockCode` = 239;
public const val `UBLOCK_NANDINAGARI`: `UBlockCode` = 294;
public const val `UBLOCK_NEWA`: `UBlockCode` = 270;
public const val `UBLOCK_NEW_TAI_LUE`: `UBlockCode` = 139;
public const val `UBLOCK_NKO`: `UBlockCode` = 146;
public const val `UBLOCK_NO_BLOCK`: `UBlockCode` = 0;
public const val `UBLOCK_NUMBER_FORMS`: `UBlockCode` = 45;
public const val `UBLOCK_NUSHU`: `UBlockCode` = 277;
public const val `UBLOCK_NYIAKENG_PUACHUE_HMONG`: `UBlockCode` = 295;
public const val `UBLOCK_OGHAM`: `UBlockCode` = 34;
public const val `UBLOCK_OLD_HUNGARIAN`: `UBlockCode` = 260;
public const val `UBLOCK_OLD_ITALIC`: `UBlockCode` = 88;
public const val `UBLOCK_OLD_NORTH_ARABIAN`: `UBlockCode` = 240;
public const val `UBLOCK_OLD_PERMIC`: `UBlockCode` = 241;
public const val `UBLOCK_OLD_PERSIAN`: `UBlockCode` = 140;
public const val `UBLOCK_OLD_SOGDIAN`: `UBlockCode` = 290;
public const val `UBLOCK_OLD_SOUTH_ARABIAN`: `UBlockCode` = 187;
public const val `UBLOCK_OLD_TURKIC`: `UBlockCode` = 191;
public const val `UBLOCK_OL_CHIKI`: `UBlockCode` = 157;
public const val `UBLOCK_OPTICAL_CHARACTER_RECOGNITION`: `UBlockCode` = 50;
public const val `UBLOCK_ORIYA`: `UBlockCode` = 19;
public const val `UBLOCK_ORNAMENTAL_DINGBATS`: `UBlockCode` = 242;
public const val `UBLOCK_OSAGE`: `UBlockCode` = 271;
public const val `UBLOCK_OSMANYA`: `UBlockCode` = 122;
public const val `UBLOCK_OTTOMAN_SIYAQ_NUMBERS`: `UBlockCode` = 296;
public const val `UBLOCK_PAHAWH_HMONG`: `UBlockCode` = 243;
public const val `UBLOCK_PALMYRENE`: `UBlockCode` = 244;
public const val `UBLOCK_PAU_CIN_HAU`: `UBlockCode` = 245;
public const val `UBLOCK_PHAGS_PA`: `UBlockCode` = 150;
public const val `UBLOCK_PHAISTOS_DISC`: `UBlockCode` = 166;
public const val `UBLOCK_PHOENICIAN`: `UBlockCode` = 151;
public const val `UBLOCK_PHONETIC_EXTENSIONS`: `UBlockCode` = 114;
public const val `UBLOCK_PHONETIC_EXTENSIONS_SUPPLEMENT`: `UBlockCode` = 141;
public const val `UBLOCK_PLAYING_CARDS`: `UBlockCode` = 204;
public const val `UBLOCK_PRIVATE_USE`: `UBlockCode` = 78;
public const val `UBLOCK_PRIVATE_USE_AREA`: `UBlockCode` = 78;
public const val `UBLOCK_PSALTER_PAHLAVI`: `UBlockCode` = 246;
public const val `UBLOCK_REJANG`: `UBlockCode` = 163;
public const val `UBLOCK_RUMI_NUMERAL_SYMBOLS`: `UBlockCode` = 192;
public const val `UBLOCK_RUNIC`: `UBlockCode` = 35;
public const val `UBLOCK_SAMARITAN`: `UBlockCode` = 172;
public const val `UBLOCK_SAURASHTRA`: `UBlockCode` = 161;
public const val `UBLOCK_SHARADA`: `UBlockCode` = 217;
public const val `UBLOCK_SHAVIAN`: `UBlockCode` = 121;
public const val `UBLOCK_SHORTHAND_FORMAT_CONTROLS`: `UBlockCode` = 247;
public const val `UBLOCK_SIDDHAM`: `UBlockCode` = 248;
public const val `UBLOCK_SINHALA`: `UBlockCode` = 24;
public const val `UBLOCK_SINHALA_ARCHAIC_NUMBERS`: `UBlockCode` = 249;
public const val `UBLOCK_SMALL_FORM_VARIANTS`: `UBlockCode` = 84;
public const val `UBLOCK_SMALL_KANA_EXTENSION`: `UBlockCode` = 297;
public const val `UBLOCK_SOGDIAN`: `UBlockCode` = 291;
public const val `UBLOCK_SORA_SOMPENG`: `UBlockCode` = 218;
public const val `UBLOCK_SOYOMBO`: `UBlockCode` = 278;
public const val `UBLOCK_SPACING_MODIFIER_LETTERS`: `UBlockCode` = 6;
public const val `UBLOCK_SPECIALS`: `UBlockCode` = 86;
public const val `UBLOCK_SUNDANESE`: `UBlockCode` = 155;
public const val `UBLOCK_SUNDANESE_SUPPLEMENT`: `UBlockCode` = 219;
public const val `UBLOCK_SUPERSCRIPTS_AND_SUBSCRIPTS`: `UBlockCode` = 41;
public const val `UBLOCK_SUPPLEMENTAL_ARROWS_A`: `UBlockCode` = 103;
public const val `UBLOCK_SUPPLEMENTAL_ARROWS_B`: `UBlockCode` = 104;
public const val `UBLOCK_SUPPLEMENTAL_ARROWS_C`: `UBlockCode` = 250;
public const val `UBLOCK_SUPPLEMENTAL_MATHEMATICAL_OPERATORS`: `UBlockCode` = 106;
public const val `UBLOCK_SUPPLEMENTAL_PUNCTUATION`: `UBlockCode` = 142;
public const val `UBLOCK_SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS`: `UBlockCode` = 261;
public const val `UBLOCK_SUPPLEMENTARY_PRIVATE_USE_AREA_A`: `UBlockCode` = 109;
public const val `UBLOCK_SUPPLEMENTARY_PRIVATE_USE_AREA_B`: `UBlockCode` = 110;
public const val `UBLOCK_SUTTON_SIGNWRITING`: `UBlockCode` = 262;
public const val `UBLOCK_SYLOTI_NAGRI`: `UBlockCode` = 143;
public const val `UBLOCK_SYMBOLS_AND_PICTOGRAPHS_EXTENDED_A`: `UBlockCode` = 298;
public const val `UBLOCK_SYMBOLS_FOR_LEGACY_COMPUTING`: `UBlockCode` = 306;
public const val `UBLOCK_SYRIAC`: `UBlockCode` = 13;
public const val `UBLOCK_SYRIAC_SUPPLEMENT`: `UBlockCode` = 279;
public const val `UBLOCK_TAGALOG`: `UBlockCode` = 98;
public const val `UBLOCK_TAGBANWA`: `UBlockCode` = 101;
public const val `UBLOCK_TAGS`: `UBlockCode` = 96;
public const val `UBLOCK_TAI_LE`: `UBlockCode` = 112;
public const val `UBLOCK_TAI_THAM`: `UBlockCode` = 174;
public const val `UBLOCK_TAI_VIET`: `UBlockCode` = 183;
public const val `UBLOCK_TAI_XUAN_JING_SYMBOLS`: `UBlockCode` = 124;
public const val `UBLOCK_TAKRI`: `UBlockCode` = 220;
public const val `UBLOCK_TAMIL`: `UBlockCode` = 20;
public const val `UBLOCK_TAMIL_SUPPLEMENT`: `UBlockCode` = 299;
public const val `UBLOCK_TANGUT`: `UBlockCode` = 272;
public const val `UBLOCK_TANGUT_COMPONENTS`: `UBlockCode` = 273;
public const val `UBLOCK_TANGUT_SUPPLEMENT`: `UBlockCode` = 307;
public const val `UBLOCK_TELUGU`: `UBlockCode` = 21;
public const val `UBLOCK_THAANA`: `UBlockCode` = 14;
public const val `UBLOCK_THAI`: `UBlockCode` = 25;
public const val `UBLOCK_TIBETAN`: `UBlockCode` = 27;
public const val `UBLOCK_TIFINAGH`: `UBlockCode` = 144;
public const val `UBLOCK_TIRHUTA`: `UBlockCode` = 251;
public const val `UBLOCK_TRANSPORT_AND_MAP_SYMBOLS`: `UBlockCode` = 207;
public const val `UBLOCK_UGARITIC`: `UBlockCode` = 120;
public const val `UBLOCK_UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS`: `UBlockCode` = 33;
public const val `UBLOCK_UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED`: `UBlockCode` = 173;
public const val `UBLOCK_VAI`: `UBlockCode` = 159;
public const val `UBLOCK_VARIATION_SELECTORS`: `UBlockCode` = 108;
public const val `UBLOCK_VARIATION_SELECTORS_SUPPLEMENT`: `UBlockCode` = 125;
public const val `UBLOCK_VEDIC_EXTENSIONS`: `UBlockCode` = 175;
public const val `UBLOCK_VERTICAL_FORMS`: `UBlockCode` = 145;
public const val `UBLOCK_WANCHO`: `UBlockCode` = 300;
public const val `UBLOCK_WARANG_CITI`: `UBlockCode` = 252;
public const val `UBLOCK_YEZIDI`: `UBlockCode` = 308;
public const val `UBLOCK_YIJING_HEXAGRAM_SYMBOLS`: `UBlockCode` = 116;
public const val `UBLOCK_YI_RADICALS`: `UBlockCode` = 73;
public const val `UBLOCK_YI_SYLLABLES`: `UBlockCode` = 72;
public const val `UBLOCK_ZANABAZAR_SQUARE`: `UBlockCode` = 280;
public const val `UBRK_CHARACTER`: `UBreakIteratorType` = 0;
public const val `UBRK_LINE`: `UBreakIteratorType` = 2;
public const val `UBRK_LINE_HARD`: `ULineBreakTag` = 100;
public const val `UBRK_LINE_HARD_LIMIT`: `ULineBreakTag` = 200;
public const val `UBRK_LINE_SOFT`: `ULineBreakTag` = 0;
public const val `UBRK_LINE_SOFT_LIMIT`: `ULineBreakTag` = 100;
public const val `UBRK_SENTENCE`: `UBreakIteratorType` = 3;
public const val `UBRK_SENTENCE_SEP`: `USentenceBreakTag` = 100;
public const val `UBRK_SENTENCE_SEP_LIMIT`: `USentenceBreakTag` = 200;
public const val `UBRK_SENTENCE_TERM`: `USentenceBreakTag` = 0;
public const val `UBRK_SENTENCE_TERM_LIMIT`: `USentenceBreakTag` = 100;
public const val `UBRK_WORD`: `UBreakIteratorType` = 1;
public const val `UBRK_WORD_IDEO`: `UWordBreak` = 400;
public const val `UBRK_WORD_IDEO_LIMIT`: `UWordBreak` = 500;
public const val `UBRK_WORD_KANA`: `UWordBreak` = 300;
public const val `UBRK_WORD_KANA_LIMIT`: `UWordBreak` = 400;
public const val `UBRK_WORD_LETTER`: `UWordBreak` = 200;
public const val `UBRK_WORD_LETTER_LIMIT`: `UWordBreak` = 300;
public const val `UBRK_WORD_NONE`: `UWordBreak` = 0;
public const val `UBRK_WORD_NONE_LIMIT`: `UWordBreak` = 100;
public const val `UBRK_WORD_NUMBER`: `UWordBreak` = 100;
public const val `UBRK_WORD_NUMBER_LIMIT`: `UWordBreak` = 200;
public typealias `UBiDi` = Long;
// UNSUPPORTED Rust 2890:1: generic scalar type unsupported
// pub type UBiDiClassCallback = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, c: i32) -> UCharDirection>;

public typealias `UBiDiDirection` = Int;
public typealias `UBiDiMirroring` = Int;
public typealias `UBiDiOrder` = Int;
public typealias `UBiDiReorderingMode` = Int;
public typealias `UBiDiReorderingOption` = Int;
public typealias `UBiDiTransform` = Long;
public typealias `UBidiPairedBracketType` = Int;
public typealias `UBlockCode` = Int;
public typealias `UBreakIterator` = Long;
public typealias `UBreakIteratorType` = Int;
public const val `UCAL_ACTUAL_MAXIMUM`: `UCalendarLimitType` = 5;
public const val `UCAL_ACTUAL_MINIMUM`: `UCalendarLimitType` = 4;
public const val `UCAL_AM`: `UCalendarAMPMs` = 0;
public const val `UCAL_AM_PM`: `UCalendarDateFields` = 9;
public const val `UCAL_APRIL`: `UCalendarMonths` = 3;
public const val `UCAL_AUGUST`: `UCalendarMonths` = 7;
public const val `UCAL_DATE`: `UCalendarDateFields` = 5;
public const val `UCAL_DAY_OF_MONTH`: `UCalendarDateFields` = 5;
public const val `UCAL_DAY_OF_WEEK`: `UCalendarDateFields` = 7;
public const val `UCAL_DAY_OF_WEEK_IN_MONTH`: `UCalendarDateFields` = 8;
public const val `UCAL_DAY_OF_YEAR`: `UCalendarDateFields` = 6;
public const val `UCAL_DECEMBER`: `UCalendarMonths` = 11;
public const val `UCAL_DEFAULT`: `UCalendarType` = 0;
public const val `UCAL_DOW_LOCAL`: `UCalendarDateFields` = 18;
public const val `UCAL_DST`: `UCalendarDisplayNameType` = 2;
public const val `UCAL_DST_OFFSET`: `UCalendarDateFields` = 16;
public const val `UCAL_ERA`: `UCalendarDateFields` = 0;
public const val `UCAL_EXTENDED_YEAR`: `UCalendarDateFields` = 19;
public const val `UCAL_FEBRUARY`: `UCalendarMonths` = 1;
public const val `UCAL_FIELD_COUNT`: `UCalendarDateFields` = 23;
public const val `UCAL_FIRST_DAY_OF_WEEK`: `UCalendarAttribute` = 1;
public const val `UCAL_FRIDAY`: `UCalendarDaysOfWeek` = 6;
public const val `UCAL_GREATEST_MINIMUM`: `UCalendarLimitType` = 2;
public const val `UCAL_GREGORIAN`: `UCalendarType` = 1;
public const val `UCAL_HOUR`: `UCalendarDateFields` = 10;
public const val `UCAL_HOUR_OF_DAY`: `UCalendarDateFields` = 11;
public const val `UCAL_IS_LEAP_MONTH`: `UCalendarDateFields` = 22;
public const val `UCAL_JANUARY`: `UCalendarMonths` = 0;
public const val `UCAL_JULIAN_DAY`: `UCalendarDateFields` = 20;
public const val `UCAL_JULY`: `UCalendarMonths` = 6;
public const val `UCAL_JUNE`: `UCalendarMonths` = 5;
public const val `UCAL_LEAST_MAXIMUM`: `UCalendarLimitType` = 3;
public const val `UCAL_LENIENT`: `UCalendarAttribute` = 0;
public const val `UCAL_MARCH`: `UCalendarMonths` = 2;
public const val `UCAL_MAXIMUM`: `UCalendarLimitType` = 1;
public const val `UCAL_MAY`: `UCalendarMonths` = 4;
public const val `UCAL_MILLISECOND`: `UCalendarDateFields` = 14;
public const val `UCAL_MILLISECONDS_IN_DAY`: `UCalendarDateFields` = 21;
public const val `UCAL_MINIMAL_DAYS_IN_FIRST_WEEK`: `UCalendarAttribute` = 2;
public const val `UCAL_MINIMUM`: `UCalendarLimitType` = 0;
public const val `UCAL_MINUTE`: `UCalendarDateFields` = 12;
public const val `UCAL_MONDAY`: `UCalendarDaysOfWeek` = 2;
public const val `UCAL_MONTH`: `UCalendarDateFields` = 2;
public const val `UCAL_NOVEMBER`: `UCalendarMonths` = 10;
public const val `UCAL_OCTOBER`: `UCalendarMonths` = 9;
public const val `UCAL_PM`: `UCalendarAMPMs` = 1;
public const val `UCAL_REPEATED_WALL_TIME`: `UCalendarAttribute` = 3;
public const val `UCAL_SATURDAY`: `UCalendarDaysOfWeek` = 7;
public const val `UCAL_SECOND`: `UCalendarDateFields` = 13;
public const val `UCAL_SEPTEMBER`: `UCalendarMonths` = 8;
public const val `UCAL_SHORT_DST`: `UCalendarDisplayNameType` = 3;
public const val `UCAL_SHORT_STANDARD`: `UCalendarDisplayNameType` = 1;
public const val `UCAL_SKIPPED_WALL_TIME`: `UCalendarAttribute` = 4;
public const val `UCAL_STANDARD`: `UCalendarDisplayNameType` = 0;
public const val `UCAL_SUNDAY`: `UCalendarDaysOfWeek` = 1;
public const val `UCAL_THURSDAY`: `UCalendarDaysOfWeek` = 5;
public const val `UCAL_TRADITIONAL`: `UCalendarType` = 0;
public const val `UCAL_TUESDAY`: `UCalendarDaysOfWeek` = 3;
public const val `UCAL_TZ_TRANSITION_NEXT`: `UTimeZoneTransitionType` = 0;
public const val `UCAL_TZ_TRANSITION_NEXT_INCLUSIVE`: `UTimeZoneTransitionType` = 1;
public const val `UCAL_TZ_TRANSITION_PREVIOUS`: `UTimeZoneTransitionType` = 2;
public const val `UCAL_TZ_TRANSITION_PREVIOUS_INCLUSIVE`: `UTimeZoneTransitionType` = 3;
public const val `UCAL_UNDECIMBER`: `UCalendarMonths` = 12;
// UNSUPPORTED Rust 2964:1: non-scalar type Ptr unsupported
// pub const UCAL_UNKNOWN_ZONE_ID: windows_sys::core::PCSTR = windows_sys::core::s!("Etc/Unknown");

public const val `UCAL_WALLTIME_FIRST`: `UCalendarWallTimeOption` = 1;
public const val `UCAL_WALLTIME_LAST`: `UCalendarWallTimeOption` = 0;
public const val `UCAL_WALLTIME_NEXT_VALID`: `UCalendarWallTimeOption` = 2;
public const val `UCAL_WEDNESDAY`: `UCalendarDaysOfWeek` = 4;
public const val `UCAL_WEEKDAY`: `UCalendarWeekdayType` = 0;
public const val `UCAL_WEEKEND`: `UCalendarWeekdayType` = 1;
public const val `UCAL_WEEKEND_CEASE`: `UCalendarWeekdayType` = 3;
public const val `UCAL_WEEKEND_ONSET`: `UCalendarWeekdayType` = 2;
public const val `UCAL_WEEK_OF_MONTH`: `UCalendarDateFields` = 4;
public const val `UCAL_WEEK_OF_YEAR`: `UCalendarDateFields` = 3;
public const val `UCAL_YEAR`: `UCalendarDateFields` = 1;
public const val `UCAL_YEAR_WOY`: `UCalendarDateFields` = 17;
public const val `UCAL_ZONE_OFFSET`: `UCalendarDateFields` = 15;
public const val `UCAL_ZONE_TYPE_ANY`: `USystemTimeZoneType` = 0;
public const val `UCAL_ZONE_TYPE_CANONICAL`: `USystemTimeZoneType` = 1;
public const val `UCAL_ZONE_TYPE_CANONICAL_LOCATION`: `USystemTimeZoneType` = 2;
public const val `UCHAR_AGE`: `UProperty` = 16384;
public const val `UCHAR_ALPHABETIC`: `UProperty` = 0;
public const val `UCHAR_ASCII_HEX_DIGIT`: `UProperty` = 1;
public const val `UCHAR_BIDI_CLASS`: `UProperty` = 4096;
public const val `UCHAR_BIDI_CONTROL`: `UProperty` = 2;
public const val `UCHAR_BIDI_MIRRORED`: `UProperty` = 3;
public const val `UCHAR_BIDI_MIRRORING_GLYPH`: `UProperty` = 16385;
public const val `UCHAR_BIDI_PAIRED_BRACKET`: `UProperty` = 16397;
public const val `UCHAR_BIDI_PAIRED_BRACKET_TYPE`: `UProperty` = 4117;
public const val `UCHAR_BINARY_START`: `UProperty` = 0;
public const val `UCHAR_BLOCK`: `UProperty` = 4097;
public const val `UCHAR_CANONICAL_COMBINING_CLASS`: `UProperty` = 4098;
public const val `UCHAR_CASED`: `UProperty` = 49;
public const val `UCHAR_CASE_FOLDING`: `UProperty` = 16386;
public const val `UCHAR_CASE_IGNORABLE`: `UProperty` = 50;
public const val `UCHAR_CASE_SENSITIVE`: `UProperty` = 34;
public const val `UCHAR_CHANGES_WHEN_CASEFOLDED`: `UProperty` = 54;
public const val `UCHAR_CHANGES_WHEN_CASEMAPPED`: `UProperty` = 55;
public const val `UCHAR_CHANGES_WHEN_LOWERCASED`: `UProperty` = 51;
public const val `UCHAR_CHANGES_WHEN_NFKC_CASEFOLDED`: `UProperty` = 56;
public const val `UCHAR_CHANGES_WHEN_TITLECASED`: `UProperty` = 53;
public const val `UCHAR_CHANGES_WHEN_UPPERCASED`: `UProperty` = 52;
public const val `UCHAR_DASH`: `UProperty` = 4;
public const val `UCHAR_DECOMPOSITION_TYPE`: `UProperty` = 4099;
public const val `UCHAR_DEFAULT_IGNORABLE_CODE_POINT`: `UProperty` = 5;
public const val `UCHAR_DEPRECATED`: `UProperty` = 6;
public const val `UCHAR_DIACRITIC`: `UProperty` = 7;
public const val `UCHAR_DOUBLE_START`: `UProperty` = 12288;
public const val `UCHAR_EAST_ASIAN_WIDTH`: `UProperty` = 4100;
public const val `UCHAR_EMOJI`: `UProperty` = 57;
public const val `UCHAR_EMOJI_COMPONENT`: `UProperty` = 61;
public const val `UCHAR_EMOJI_MODIFIER`: `UProperty` = 59;
public const val `UCHAR_EMOJI_MODIFIER_BASE`: `UProperty` = 60;
public const val `UCHAR_EMOJI_PRESENTATION`: `UProperty` = 58;
public const val `UCHAR_EXTENDED_PICTOGRAPHIC`: `UProperty` = 64;
public const val `UCHAR_EXTENDER`: `UProperty` = 8;
public const val `UCHAR_FULL_COMPOSITION_EXCLUSION`: `UProperty` = 9;
public const val `UCHAR_GENERAL_CATEGORY`: `UProperty` = 4101;
public const val `UCHAR_GENERAL_CATEGORY_MASK`: `UProperty` = 8192;
public const val `UCHAR_GRAPHEME_BASE`: `UProperty` = 10;
public const val `UCHAR_GRAPHEME_CLUSTER_BREAK`: `UProperty` = 4114;
public const val `UCHAR_GRAPHEME_EXTEND`: `UProperty` = 11;
public const val `UCHAR_GRAPHEME_LINK`: `UProperty` = 12;
public const val `UCHAR_HANGUL_SYLLABLE_TYPE`: `UProperty` = 4107;
public const val `UCHAR_HEX_DIGIT`: `UProperty` = 13;
public const val `UCHAR_HYPHEN`: `UProperty` = 14;
public const val `UCHAR_IDEOGRAPHIC`: `UProperty` = 17;
public const val `UCHAR_IDS_BINARY_OPERATOR`: `UProperty` = 18;
public const val `UCHAR_IDS_TRINARY_OPERATOR`: `UProperty` = 19;
public const val `UCHAR_ID_CONTINUE`: `UProperty` = 15;
public const val `UCHAR_ID_START`: `UProperty` = 16;
public const val `UCHAR_INDIC_POSITIONAL_CATEGORY`: `UProperty` = 4118;
public const val `UCHAR_INDIC_SYLLABIC_CATEGORY`: `UProperty` = 4119;
public const val `UCHAR_INT_START`: `UProperty` = 4096;
public const val `UCHAR_INVALID_CODE`: `UProperty` = -1;
public const val `UCHAR_JOINING_GROUP`: `UProperty` = 4102;
public const val `UCHAR_JOINING_TYPE`: `UProperty` = 4103;
public const val `UCHAR_JOIN_CONTROL`: `UProperty` = 20;
public const val `UCHAR_LEAD_CANONICAL_COMBINING_CLASS`: `UProperty` = 4112;
public const val `UCHAR_LINE_BREAK`: `UProperty` = 4104;
public const val `UCHAR_LOGICAL_ORDER_EXCEPTION`: `UProperty` = 21;
public const val `UCHAR_LOWERCASE`: `UProperty` = 22;
public const val `UCHAR_LOWERCASE_MAPPING`: `UProperty` = 16388;
public const val `UCHAR_MASK_START`: `UProperty` = 8192;
public const val `UCHAR_MATH`: `UProperty` = 23;
public const val `UCHAR_MAX_VALUE`: UInt = 1114111u;
public const val `UCHAR_MIN_VALUE`: UInt = 0u;
public const val `UCHAR_NAME`: `UProperty` = 16389;
public const val `UCHAR_NFC_INERT`: `UProperty` = 39;
public const val `UCHAR_NFC_QUICK_CHECK`: `UProperty` = 4110;
public const val `UCHAR_NFD_INERT`: `UProperty` = 37;
public const val `UCHAR_NFD_QUICK_CHECK`: `UProperty` = 4108;
public const val `UCHAR_NFKC_INERT`: `UProperty` = 40;
public const val `UCHAR_NFKC_QUICK_CHECK`: `UProperty` = 4111;
public const val `UCHAR_NFKD_INERT`: `UProperty` = 38;
public const val `UCHAR_NFKD_QUICK_CHECK`: `UProperty` = 4109;
public const val `UCHAR_NONCHARACTER_CODE_POINT`: `UProperty` = 24;
public const val `UCHAR_NUMERIC_TYPE`: `UProperty` = 4105;
public const val `UCHAR_NUMERIC_VALUE`: `UProperty` = 12288;
public const val `UCHAR_OTHER_PROPERTY_START`: `UProperty` = 28672;
public const val `UCHAR_PATTERN_SYNTAX`: `UProperty` = 42;
public const val `UCHAR_PATTERN_WHITE_SPACE`: `UProperty` = 43;
public const val `UCHAR_POSIX_ALNUM`: `UProperty` = 44;
public const val `UCHAR_POSIX_BLANK`: `UProperty` = 45;
public const val `UCHAR_POSIX_GRAPH`: `UProperty` = 46;
public const val `UCHAR_POSIX_PRINT`: `UProperty` = 47;
public const val `UCHAR_POSIX_XDIGIT`: `UProperty` = 48;
public const val `UCHAR_PREPENDED_CONCATENATION_MARK`: `UProperty` = 63;
public const val `UCHAR_QUOTATION_MARK`: `UProperty` = 25;
public const val `UCHAR_RADICAL`: `UProperty` = 26;
public const val `UCHAR_REGIONAL_INDICATOR`: `UProperty` = 62;
public const val `UCHAR_SCRIPT`: `UProperty` = 4106;
public const val `UCHAR_SCRIPT_EXTENSIONS`: `UProperty` = 28672;
public const val `UCHAR_SEGMENT_STARTER`: `UProperty` = 41;
public const val `UCHAR_SENTENCE_BREAK`: `UProperty` = 4115;
public const val `UCHAR_SIMPLE_CASE_FOLDING`: `UProperty` = 16390;
public const val `UCHAR_SIMPLE_LOWERCASE_MAPPING`: `UProperty` = 16391;
public const val `UCHAR_SIMPLE_TITLECASE_MAPPING`: `UProperty` = 16392;
public const val `UCHAR_SIMPLE_UPPERCASE_MAPPING`: `UProperty` = 16393;
public const val `UCHAR_SOFT_DOTTED`: `UProperty` = 27;
public const val `UCHAR_STRING_START`: `UProperty` = 16384;
public const val `UCHAR_S_TERM`: `UProperty` = 35;
public const val `UCHAR_TERMINAL_PUNCTUATION`: `UProperty` = 28;
public const val `UCHAR_TITLECASE_MAPPING`: `UProperty` = 16394;
public const val `UCHAR_TRAIL_CANONICAL_COMBINING_CLASS`: `UProperty` = 4113;
public const val `UCHAR_UNIFIED_IDEOGRAPH`: `UProperty` = 29;
public const val `UCHAR_UPPERCASE`: `UProperty` = 30;
public const val `UCHAR_UPPERCASE_MAPPING`: `UProperty` = 16396;
public const val `UCHAR_VARIATION_SELECTOR`: `UProperty` = 36;
public const val `UCHAR_VERTICAL_ORIENTATION`: `UProperty` = 4120;
public const val `UCHAR_WHITE_SPACE`: `UProperty` = 31;
public const val `UCHAR_WORD_BREAK`: `UProperty` = 4116;
public const val `UCHAR_XID_CONTINUE`: `UProperty` = 32;
public const val `UCHAR_XID_START`: `UProperty` = 33;
public const val `UCLN_NO_AUTO_CLEANUP`: UInt = 1u;
public const val `UCNV_BOCU1`: `UConverterType` = 28;
public const val `UCNV_CESU8`: `UConverterType` = 31;
public const val `UCNV_CLONE`: `UConverterCallbackReason` = 5;
public const val `UCNV_CLOSE`: `UConverterCallbackReason` = 4;
public const val `UCNV_COMPOUND_TEXT`: `UConverterType` = 33;
public const val `UCNV_DBCS`: `UConverterType` = 1;
public const val `UCNV_EBCDIC_STATEFUL`: `UConverterType` = 9;
// UNSUPPORTED Rust 3103:1: non-scalar type Ptr unsupported
// pub const UCNV_ESCAPE_C: windows_sys::core::PCSTR = windows_sys::core::s!("C");

// UNSUPPORTED Rust 3104:1: non-scalar type Ptr unsupported
// pub const UCNV_ESCAPE_CSS2: windows_sys::core::PCSTR = windows_sys::core::s!("S");

// UNSUPPORTED Rust 3105:1: non-scalar type Ptr unsupported
// pub const UCNV_ESCAPE_JAVA: windows_sys::core::PCSTR = windows_sys::core::s!("J");

// UNSUPPORTED Rust 3106:1: non-scalar type Ptr unsupported
// pub const UCNV_ESCAPE_UNICODE: windows_sys::core::PCSTR = windows_sys::core::s!("U");

// UNSUPPORTED Rust 3107:1: non-scalar type Ptr unsupported
// pub const UCNV_ESCAPE_XML_DEC: windows_sys::core::PCSTR = windows_sys::core::s!("D");

// UNSUPPORTED Rust 3108:1: non-scalar type Ptr unsupported
// pub const UCNV_ESCAPE_XML_HEX: windows_sys::core::PCSTR = windows_sys::core::s!("X");

public const val `UCNV_HZ`: `UConverterType` = 23;
public const val `UCNV_IBM`: `UConverterPlatform` = 0;
public const val `UCNV_ILLEGAL`: `UConverterCallbackReason` = 1;
public const val `UCNV_IMAP_MAILBOX`: `UConverterType` = 32;
public const val `UCNV_IRREGULAR`: `UConverterCallbackReason` = 2;
public const val `UCNV_ISCII`: `UConverterType` = 25;
public const val `UCNV_ISO_2022`: `UConverterType` = 10;
public const val `UCNV_LATIN_1`: `UConverterType` = 3;
public const val `UCNV_LMBCS_1`: `UConverterType` = 11;
public const val `UCNV_LMBCS_11`: `UConverterType` = 18;
public const val `UCNV_LMBCS_16`: `UConverterType` = 19;
public const val `UCNV_LMBCS_17`: `UConverterType` = 20;
public const val `UCNV_LMBCS_18`: `UConverterType` = 21;
public const val `UCNV_LMBCS_19`: `UConverterType` = 22;
public const val `UCNV_LMBCS_2`: `UConverterType` = 12;
public const val `UCNV_LMBCS_3`: `UConverterType` = 13;
public const val `UCNV_LMBCS_4`: `UConverterType` = 14;
public const val `UCNV_LMBCS_5`: `UConverterType` = 15;
public const val `UCNV_LMBCS_6`: `UConverterType` = 16;
public const val `UCNV_LMBCS_8`: `UConverterType` = 17;
public const val `UCNV_LMBCS_LAST`: `UConverterType` = 22;
// UNSUPPORTED Rust 3130:1: non-scalar type Ptr unsupported
// pub const UCNV_LOCALE_OPTION_STRING: windows_sys::core::PCSTR = windows_sys::core::s!(",locale=");

public const val `UCNV_MAX_CONVERTER_NAME_LENGTH`: UInt = 60u;
public const val `UCNV_MBCS`: `UConverterType` = 2;
public const val `UCNV_NUMBER_OF_SUPPORTED_CONVERTER_TYPES`: `UConverterType` = 34;
// UNSUPPORTED Rust 3134:1: non-scalar type Ptr unsupported
// pub const UCNV_OPTION_SEP_STRING: windows_sys::core::PCSTR = windows_sys::core::s!(",");

public const val `UCNV_RESET`: `UConverterCallbackReason` = 3;
public const val `UCNV_ROUNDTRIP_AND_FALLBACK_SET`: `UConverterUnicodeSet` = 1;
public const val `UCNV_ROUNDTRIP_SET`: `UConverterUnicodeSet` = 0;
public const val `UCNV_SBCS`: `UConverterType` = 0;
public const val `UCNV_SCSU`: `UConverterType` = 24;
public const val `UCNV_SI`: UInt = 15u;
// UNSUPPORTED Rust 3141:1: non-scalar type Ptr unsupported
// pub const UCNV_SKIP_STOP_ON_ILLEGAL: windows_sys::core::PCSTR = windows_sys::core::s!("i");

public const val `UCNV_SO`: UInt = 14u;
// UNSUPPORTED Rust 3143:1: non-scalar type Ptr unsupported
// pub const UCNV_SUB_STOP_ON_ILLEGAL: windows_sys::core::PCSTR = windows_sys::core::s!("i");

// UNSUPPORTED Rust 3144:1: non-scalar type Ptr unsupported
// pub const UCNV_SWAP_LFNL_OPTION_STRING: windows_sys::core::PCSTR = windows_sys::core::s!(",swaplfnl");

public const val `UCNV_UNASSIGNED`: `UConverterCallbackReason` = 0;
public const val `UCNV_UNKNOWN`: `UConverterPlatform` = -1;
public const val `UCNV_UNSUPPORTED_CONVERTER`: `UConverterType` = -1;
public const val `UCNV_US_ASCII`: `UConverterType` = 26;
public const val `UCNV_UTF16`: `UConverterType` = 29;
public const val `UCNV_UTF16_BigEndian`: `UConverterType` = 5;
public const val `UCNV_UTF16_LittleEndian`: `UConverterType` = 6;
public const val `UCNV_UTF32`: `UConverterType` = 30;
public const val `UCNV_UTF32_BigEndian`: `UConverterType` = 7;
public const val `UCNV_UTF32_LittleEndian`: `UConverterType` = 8;
public const val `UCNV_UTF7`: `UConverterType` = 27;
public const val `UCNV_UTF8`: `UConverterType` = 4;
// UNSUPPORTED Rust 3157:1: non-scalar type Ptr unsupported
// pub const UCNV_VALUE_SEP_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("=");

// UNSUPPORTED Rust 3158:1: non-scalar type Ptr unsupported
// pub const UCNV_VERSION_OPTION_STRING: windows_sys::core::PCSTR = windows_sys::core::s!(",version=");

public const val `UCOL_ALTERNATE_HANDLING`: `UColAttribute` = 1;
public const val `UCOL_ATTRIBUTE_COUNT`: `UColAttribute` = 8;
public const val `UCOL_BOUND_LOWER`: `UColBoundMode` = 0;
public const val `UCOL_BOUND_UPPER`: `UColBoundMode` = 1;
public const val `UCOL_BOUND_UPPER_LONG`: `UColBoundMode` = 2;
public const val `UCOL_CASE_FIRST`: `UColAttribute` = 2;
public const val `UCOL_CASE_LEVEL`: `UColAttribute` = 3;
public const val `UCOL_CE_STRENGTH_LIMIT`: `UColAttributeValue` = 3;
public const val `UCOL_DECOMPOSITION_MODE`: `UColAttribute` = 4;
public const val `UCOL_DEFAULT`: `UColAttributeValue` = -1;
public const val `UCOL_DEFAULT_STRENGTH`: `UColAttributeValue` = 2;
public const val `UCOL_EQUAL`: `UCollationResult` = 0;
public const val `UCOL_FRENCH_COLLATION`: `UColAttribute` = 0;
public const val `UCOL_FULL_RULES`: `UColRuleOption` = 1;
public const val `UCOL_GREATER`: `UCollationResult` = 1;
public const val `UCOL_IDENTICAL`: `UColAttributeValue` = 15;
public const val `UCOL_LESS`: `UCollationResult` = -1;
public const val `UCOL_LOWER_FIRST`: `UColAttributeValue` = 24;
public const val `UCOL_NON_IGNORABLE`: `UColAttributeValue` = 21;
public const val `UCOL_NORMALIZATION_MODE`: `UColAttribute` = 4;
public const val `UCOL_NUMERIC_COLLATION`: `UColAttribute` = 7;
public const val `UCOL_OFF`: `UColAttributeValue` = 16;
public const val `UCOL_ON`: `UColAttributeValue` = 17;
public const val `UCOL_PRIMARY`: `UColAttributeValue` = 0;
public const val `UCOL_QUATERNARY`: `UColAttributeValue` = 3;
public const val `UCOL_REORDER_CODE_CURRENCY`: `UColReorderCode` = 4099;
public const val `UCOL_REORDER_CODE_DEFAULT`: `UColReorderCode` = -1;
public const val `UCOL_REORDER_CODE_DIGIT`: `UColReorderCode` = 4100;
public const val `UCOL_REORDER_CODE_FIRST`: `UColReorderCode` = 4096;
public const val `UCOL_REORDER_CODE_NONE`: `UColReorderCode` = 103;
public const val `UCOL_REORDER_CODE_OTHERS`: `UColReorderCode` = 103;
public const val `UCOL_REORDER_CODE_PUNCTUATION`: `UColReorderCode` = 4097;
public const val `UCOL_REORDER_CODE_SPACE`: `UColReorderCode` = 4096;
public const val `UCOL_REORDER_CODE_SYMBOL`: `UColReorderCode` = 4098;
public const val `UCOL_SECONDARY`: `UColAttributeValue` = 1;
public const val `UCOL_SHIFTED`: `UColAttributeValue` = 20;
public const val `UCOL_STRENGTH`: `UColAttribute` = 5;
public const val `UCOL_STRENGTH_LIMIT`: `UColAttributeValue` = 16;
public const val `UCOL_TAILORING_ONLY`: `UColRuleOption` = 0;
public const val `UCOL_TERTIARY`: `UColAttributeValue` = 2;
public const val `UCOL_UPPER_FIRST`: `UColAttributeValue` = 25;
public const val `UCONFIG_ENABLE_PLUGINS`: UInt = 0u;
public const val `UCONFIG_FORMAT_FASTPATHS_49`: UInt = 1u;
public const val `UCONFIG_HAVE_PARSEALLINPUT`: UInt = 1u;
public const val `UCONFIG_NO_BREAK_ITERATION`: UInt = 1u;
public const val `UCONFIG_NO_COLLATION`: UInt = 1u;
public const val `UCONFIG_NO_CONVERSION`: UInt = 0u;
public const val `UCONFIG_NO_FILE_IO`: UInt = 0u;
public const val `UCONFIG_NO_FILTERED_BREAK_ITERATION`: UInt = 0u;
public const val `UCONFIG_NO_FORMATTING`: UInt = 1u;
public const val `UCONFIG_NO_IDNA`: UInt = 1u;
public const val `UCONFIG_NO_LEGACY_CONVERSION`: UInt = 1u;
public const val `UCONFIG_NO_NORMALIZATION`: UInt = 0u;
public const val `UCONFIG_NO_REGULAR_EXPRESSIONS`: UInt = 1u;
public const val `UCONFIG_NO_SERVICE`: UInt = 0u;
public const val `UCONFIG_NO_TRANSLITERATION`: UInt = 1u;
public const val `UCONFIG_ONLY_COLLATION`: UInt = 0u;
public const val `UCONFIG_ONLY_HTML_CONVERSION`: UInt = 0u;
public const val `UCPMAP_RANGE_FIXED_ALL_SURROGATES`: `UCPMapRangeOption` = 2;
public const val `UCPMAP_RANGE_FIXED_LEAD_SURROGATES`: `UCPMapRangeOption` = 1;
public const val `UCPMAP_RANGE_NORMAL`: `UCPMapRangeOption` = 0;
public typealias `UCPMap` = Long;
public typealias `UCPMapRangeOption` = Int;
// UNSUPPORTED Rust 3222:1: generic scalar type unsupported
// pub type UCPMapValueFilter = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, value: u32) -> u32>;

public const val `UCPTRIE_ERROR_VALUE_NEG_DATA_OFFSET`: Int = 1;
public const val `UCPTRIE_FAST_DATA_BLOCK_LENGTH`: Int = 64;
public const val `UCPTRIE_FAST_DATA_MASK`: Int = 63;
public const val `UCPTRIE_FAST_SHIFT`: Int = 6;
public const val `UCPTRIE_HIGH_VALUE_NEG_DATA_OFFSET`: Int = 2;
public const val `UCPTRIE_SMALL_MAX`: Int = 4095;
public const val `UCPTRIE_TYPE_ANY`: `UCPTrieType` = -1;
public const val `UCPTRIE_TYPE_FAST`: `UCPTrieType` = 0;
public const val `UCPTRIE_TYPE_SMALL`: `UCPTrieType` = 1;
public const val `UCPTRIE_VALUE_BITS_16`: `UCPTrieValueWidth` = 0;
public const val `UCPTRIE_VALUE_BITS_32`: `UCPTrieValueWidth` = 1;
public const val `UCPTRIE_VALUE_BITS_8`: `UCPTrieValueWidth` = 2;
public const val `UCPTRIE_VALUE_BITS_ANY`: `UCPTrieValueWidth` = -1;
// UNSUPPORTED Rust 3236:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UCPTrie {
//     pub index: *const u16,
//     pub data: UCPTrieData,
//     pub indexLength: i32,
//     pub dataLength: i32,
//     pub highStart: i32,
//     pub shifted12HighStart: u16,
//     pub r#type: i8,
//     pub valueWidth: i8,
//     pub reserved32: u32,
//     pub reserved16: u16,
//     pub index3NullOffset: u16,
//     pub dataNullOffset: i32,
//     pub nullValue: u32,
// }

// UNSUPPORTED Rust 3253:1: declaration Impl has no candidate rule
// impl Default for UCPTrie {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3258:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union UCPTrieData {
//     pub ptr0: *const core::ffi::c_void,
//     pub ptr16: *const u16,
//     pub ptr32: *const u32,
//     pub ptr8: *const u8,
// }

// UNSUPPORTED Rust 3266:1: declaration Impl has no candidate rule
// impl Default for UCPTrieData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `UCPTrieType` = Int;
public typealias `UCPTrieValueWidth` = Int;
public const val `UCURR_ALL`: `UCurrCurrencyType` = 2147483647;
public const val `UCURR_COMMON`: `UCurrCurrencyType` = 1;
public const val `UCURR_DEPRECATED`: `UCurrCurrencyType` = 4;
public const val `UCURR_LONG_NAME`: `UCurrNameStyle` = 1;
public const val `UCURR_NARROW_SYMBOL_NAME`: `UCurrNameStyle` = 2;
public const val `UCURR_NON_DEPRECATED`: `UCurrCurrencyType` = 8;
public const val `UCURR_SYMBOL_NAME`: `UCurrNameStyle` = 0;
public const val `UCURR_UNCOMMON`: `UCurrCurrencyType` = 2;
public const val `UCURR_USAGE_CASH`: `UCurrencyUsage` = 1;
public const val `UCURR_USAGE_STANDARD`: `UCurrencyUsage` = 0;
public typealias `UCalendarAMPMs` = Int;
public typealias `UCalendarAttribute` = Int;
public typealias `UCalendarDateFields` = Int;
public typealias `UCalendarDaysOfWeek` = Int;
public typealias `UCalendarDisplayNameType` = Int;
public typealias `UCalendarLimitType` = Int;
public typealias `UCalendarMonths` = Int;
public typealias `UCalendarType` = Int;
public typealias `UCalendarWallTimeOption` = Int;
public typealias `UCalendarWeekdayType` = Int;
public typealias `UCaseMap` = Long;
public typealias `UCharCategory` = Int;
public typealias `UCharDirection` = Int;
// UNSUPPORTED Rust 3296:1: generic scalar type unsupported
// pub type UCharEnumTypeRange = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, start: i32, limit: i32, r#type: UCharCategory) -> i8>;

// UNSUPPORTED Rust 3297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UCharIterator {
//     pub context: *const core::ffi::c_void,
//     pub length: i32,
//     pub start: i32,
//     pub index: i32,
//     pub limit: i32,
//     pub reservedField: i32,
//     pub getIndex: UCharIteratorGetIndex,
//     pub r#move: UCharIteratorMove,
//     pub hasNext: UCharIteratorHasNext,
//     pub hasPrevious: UCharIteratorHasPrevious,
//     pub current: UCharIteratorCurrent,
//     pub next: UCharIteratorNext,
//     pub previous: UCharIteratorPrevious,
//     pub reservedFn: UCharIteratorReserved,
//     pub getState: UCharIteratorGetState,
//     pub setState: UCharIteratorSetState,
// }

// UNSUPPORTED Rust 3317:1: declaration Impl has no candidate rule
// impl Default for UCharIterator {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3322:1: generic scalar type unsupported
// pub type UCharIteratorCurrent = Option<unsafe extern "system" fn(iter: *mut UCharIterator) -> i32>;

// UNSUPPORTED Rust 3323:1: generic scalar type unsupported
// pub type UCharIteratorGetIndex = Option<unsafe extern "system" fn(iter: *mut UCharIterator, origin: UCharIteratorOrigin) -> i32>;

// UNSUPPORTED Rust 3324:1: generic scalar type unsupported
// pub type UCharIteratorGetState = Option<unsafe extern "system" fn(iter: *const UCharIterator) -> u32>;

// UNSUPPORTED Rust 3325:1: generic scalar type unsupported
// pub type UCharIteratorHasNext = Option<unsafe extern "system" fn(iter: *mut UCharIterator) -> i8>;

// UNSUPPORTED Rust 3326:1: generic scalar type unsupported
// pub type UCharIteratorHasPrevious = Option<unsafe extern "system" fn(iter: *mut UCharIterator) -> i8>;

// UNSUPPORTED Rust 3327:1: generic scalar type unsupported
// pub type UCharIteratorMove = Option<unsafe extern "system" fn(iter: *mut UCharIterator, delta: i32, origin: UCharIteratorOrigin) -> i32>;

// UNSUPPORTED Rust 3328:1: generic scalar type unsupported
// pub type UCharIteratorNext = Option<unsafe extern "system" fn(iter: *mut UCharIterator) -> i32>;

public typealias `UCharIteratorOrigin` = Int;
// UNSUPPORTED Rust 3330:1: generic scalar type unsupported
// pub type UCharIteratorPrevious = Option<unsafe extern "system" fn(iter: *mut UCharIterator) -> i32>;

// UNSUPPORTED Rust 3331:1: generic scalar type unsupported
// pub type UCharIteratorReserved = Option<unsafe extern "system" fn(iter: *mut UCharIterator, something: i32) -> i32>;

// UNSUPPORTED Rust 3332:1: generic scalar type unsupported
// pub type UCharIteratorSetState = Option<unsafe extern "system" fn(iter: *mut UCharIterator, state: u32, perrorcode: *mut UErrorCode)>;

public typealias `UCharNameChoice` = Int;
public typealias `UCharsetDetector` = Long;
public typealias `UCharsetMatch` = Long;
public typealias `UColAttribute` = Int;
public typealias `UColAttributeValue` = Int;
public typealias `UColBoundMode` = Int;
public typealias `UColReorderCode` = Int;
public typealias `UColRuleOption` = Int;
public typealias `UCollationElements` = Long;
public typealias `UCollationResult` = Int;
public typealias `UCollator` = Long;
public typealias `UConstrainedFieldPosition` = Long;
public typealias `UConverter` = Long;
public typealias `UConverterCallbackReason` = Int;
// UNSUPPORTED Rust 3347:1: generic scalar type unsupported
// pub type UConverterFromUCallback = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, args: *mut UConverterFromUnicodeArgs, codeunits: *const u16, length: i32, codepoint: i32, reason: UConverterCallbackReason, perrorcode: *mut UErrorCode)>;

// UNSUPPORTED Rust 3348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UConverterFromUnicodeArgs {
//     pub size: u16,
//     pub flush: i8,
//     pub converter: *mut UConverter,
//     pub source: *const u16,
//     pub sourceLimit: *const u16,
//     pub target: windows_sys::core::PSTR,
//     pub targetLimit: windows_sys::core::PCSTR,
//     pub offsets: *mut i32,
// }

// UNSUPPORTED Rust 3360:1: declaration Impl has no candidate rule
// impl Default for UConverterFromUnicodeArgs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `UConverterPlatform` = Int;
public typealias `UConverterSelector` = Long;
// UNSUPPORTED Rust 3367:1: generic scalar type unsupported
// pub type UConverterToUCallback = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, args: *mut UConverterToUnicodeArgs, codeunits: windows_sys::core::PCSTR, length: i32, reason: UConverterCallbackReason, perrorcode: *mut UErrorCode)>;

// UNSUPPORTED Rust 3368:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UConverterToUnicodeArgs {
//     pub size: u16,
//     pub flush: i8,
//     pub converter: *mut UConverter,
//     pub source: windows_sys::core::PCSTR,
//     pub sourceLimit: windows_sys::core::PCSTR,
//     pub target: *mut u16,
//     pub targetLimit: *const u16,
//     pub offsets: *mut i32,
// }

// UNSUPPORTED Rust 3380:1: declaration Impl has no candidate rule
// impl Default for UConverterToUnicodeArgs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `UConverterType` = Int;
public typealias `UConverterUnicodeSet` = Int;
public typealias `UCurrCurrencyType` = Int;
public typealias `UCurrNameStyle` = Int;
public typealias `UCurrencySpacing` = Int;
public typealias `UCurrencyUsage` = Int;
public const val `UDATPG_ABBREVIATED`: `UDateTimePGDisplayWidth` = 1;
public const val `UDATPG_BASE_CONFLICT`: `UDateTimePatternConflict` = 1;
public const val `UDATPG_CONFLICT`: `UDateTimePatternConflict` = 2;
public const val `UDATPG_DAYPERIOD_FIELD`: `UDateTimePatternField` = 10;
public const val `UDATPG_DAY_FIELD`: `UDateTimePatternField` = 9;
public const val `UDATPG_DAY_OF_WEEK_IN_MONTH_FIELD`: `UDateTimePatternField` = 8;
public const val `UDATPG_DAY_OF_YEAR_FIELD`: `UDateTimePatternField` = 7;
public const val `UDATPG_ERA_FIELD`: `UDateTimePatternField` = 0;
public const val `UDATPG_FIELD_COUNT`: `UDateTimePatternField` = 16;
public const val `UDATPG_FRACTIONAL_SECOND_FIELD`: `UDateTimePatternField` = 14;
public const val `UDATPG_HOUR_FIELD`: `UDateTimePatternField` = 11;
public const val `UDATPG_MATCH_ALL_FIELDS_LENGTH`: `UDateTimePatternMatchOptions` = 65535;
public const val `UDATPG_MATCH_HOUR_FIELD_LENGTH`: `UDateTimePatternMatchOptions` = 2048;
public const val `UDATPG_MATCH_NO_OPTIONS`: `UDateTimePatternMatchOptions` = 0;
public const val `UDATPG_MINUTE_FIELD`: `UDateTimePatternField` = 12;
public const val `UDATPG_MONTH_FIELD`: `UDateTimePatternField` = 3;
public const val `UDATPG_NARROW`: `UDateTimePGDisplayWidth` = 2;
public const val `UDATPG_NO_CONFLICT`: `UDateTimePatternConflict` = 0;
public const val `UDATPG_QUARTER_FIELD`: `UDateTimePatternField` = 2;
public const val `UDATPG_SECOND_FIELD`: `UDateTimePatternField` = 13;
public const val `UDATPG_WEEKDAY_FIELD`: `UDateTimePatternField` = 6;
public const val `UDATPG_WEEK_OF_MONTH_FIELD`: `UDateTimePatternField` = 5;
public const val `UDATPG_WEEK_OF_YEAR_FIELD`: `UDateTimePatternField` = 4;
public const val `UDATPG_WIDE`: `UDateTimePGDisplayWidth` = 0;
public const val `UDATPG_YEAR_FIELD`: `UDateTimePatternField` = 1;
public const val `UDATPG_ZONE_FIELD`: `UDateTimePatternField` = 15;
// UNSUPPORTED Rust 3417:1: non-scalar type Ptr unsupported
// pub const UDAT_ABBR_GENERIC_TZ: windows_sys::core::PCSTR = windows_sys::core::s!("v");

// UNSUPPORTED Rust 3418:1: non-scalar type Ptr unsupported
// pub const UDAT_ABBR_MONTH: windows_sys::core::PCSTR = windows_sys::core::s!("MMM");

// UNSUPPORTED Rust 3419:1: non-scalar type Ptr unsupported
// pub const UDAT_ABBR_MONTH_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("MMMd");

// UNSUPPORTED Rust 3420:1: non-scalar type Ptr unsupported
// pub const UDAT_ABBR_MONTH_WEEKDAY_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("MMMEd");

// UNSUPPORTED Rust 3421:1: non-scalar type Ptr unsupported
// pub const UDAT_ABBR_QUARTER: windows_sys::core::PCSTR = windows_sys::core::s!("QQQ");

// UNSUPPORTED Rust 3422:1: non-scalar type Ptr unsupported
// pub const UDAT_ABBR_SPECIFIC_TZ: windows_sys::core::PCSTR = windows_sys::core::s!("z");

// UNSUPPORTED Rust 3423:1: non-scalar type Ptr unsupported
// pub const UDAT_ABBR_UTC_TZ: windows_sys::core::PCSTR = windows_sys::core::s!("ZZZZ");

// UNSUPPORTED Rust 3424:1: non-scalar type Ptr unsupported
// pub const UDAT_ABBR_WEEKDAY: windows_sys::core::PCSTR = windows_sys::core::s!("E");

public const val `UDAT_ABSOLUTE_DAY`: `UDateAbsoluteUnit` = 7;
public const val `UDAT_ABSOLUTE_FRIDAY`: `UDateAbsoluteUnit` = 5;
public const val `UDAT_ABSOLUTE_MONDAY`: `UDateAbsoluteUnit` = 1;
public const val `UDAT_ABSOLUTE_MONTH`: `UDateAbsoluteUnit` = 9;
public const val `UDAT_ABSOLUTE_NOW`: `UDateAbsoluteUnit` = 11;
public const val `UDAT_ABSOLUTE_SATURDAY`: `UDateAbsoluteUnit` = 6;
public const val `UDAT_ABSOLUTE_SUNDAY`: `UDateAbsoluteUnit` = 0;
public const val `UDAT_ABSOLUTE_THURSDAY`: `UDateAbsoluteUnit` = 4;
public const val `UDAT_ABSOLUTE_TUESDAY`: `UDateAbsoluteUnit` = 2;
public const val `UDAT_ABSOLUTE_UNIT_COUNT`: `UDateAbsoluteUnit` = 12;
public const val `UDAT_ABSOLUTE_WEDNESDAY`: `UDateAbsoluteUnit` = 3;
public const val `UDAT_ABSOLUTE_WEEK`: `UDateAbsoluteUnit` = 8;
public const val `UDAT_ABSOLUTE_YEAR`: `UDateAbsoluteUnit` = 10;
public const val `UDAT_AM_PMS`: `UDateFormatSymbolType` = 5;
public const val `UDAT_AM_PM_FIELD`: `UDateFormatField` = 14;
public const val `UDAT_AM_PM_MIDNIGHT_NOON_FIELD`: `UDateFormatField` = 35;
public const val `UDAT_BOOLEAN_ATTRIBUTE_COUNT`: `UDateFormatBooleanAttribute` = 4;
public const val `UDAT_CYCLIC_YEARS_ABBREVIATED`: `UDateFormatSymbolType` = 23;
public const val `UDAT_CYCLIC_YEARS_NARROW`: `UDateFormatSymbolType` = 24;
public const val `UDAT_CYCLIC_YEARS_WIDE`: `UDateFormatSymbolType` = 22;
public const val `UDAT_DATE_FIELD`: `UDateFormatField` = 3;
// UNSUPPORTED Rust 3446:1: non-scalar type Ptr unsupported
// pub const UDAT_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("d");

public const val `UDAT_DAY_OF_WEEK_FIELD`: `UDateFormatField` = 9;
public const val `UDAT_DAY_OF_WEEK_IN_MONTH_FIELD`: `UDateFormatField` = 11;
public const val `UDAT_DAY_OF_YEAR_FIELD`: `UDateFormatField` = 10;
public const val `UDAT_DEFAULT`: `UDateFormatStyle` = 2;
public const val `UDAT_DIRECTION_COUNT`: `UDateDirection` = 6;
public const val `UDAT_DIRECTION_LAST`: `UDateDirection` = 1;
public const val `UDAT_DIRECTION_LAST_2`: `UDateDirection` = 0;
public const val `UDAT_DIRECTION_NEXT`: `UDateDirection` = 3;
public const val `UDAT_DIRECTION_NEXT_2`: `UDateDirection` = 4;
public const val `UDAT_DIRECTION_PLAIN`: `UDateDirection` = 5;
public const val `UDAT_DIRECTION_THIS`: `UDateDirection` = 2;
public const val `UDAT_DOW_LOCAL_FIELD`: `UDateFormatField` = 19;
public const val `UDAT_ERAS`: `UDateFormatSymbolType` = 0;
public const val `UDAT_ERA_FIELD`: `UDateFormatField` = 0;
public const val `UDAT_ERA_NAMES`: `UDateFormatSymbolType` = 7;
public const val `UDAT_EXTENDED_YEAR_FIELD`: `UDateFormatField` = 20;
public const val `UDAT_FLEXIBLE_DAY_PERIOD_FIELD`: `UDateFormatField` = 36;
public const val `UDAT_FRACTIONAL_SECOND_FIELD`: `UDateFormatField` = 8;
public const val `UDAT_FULL`: `UDateFormatStyle` = 0;
public const val `UDAT_FULL_RELATIVE`: `UDateFormatStyle` = 128;
// UNSUPPORTED Rust 3467:1: non-scalar type Ptr unsupported
// pub const UDAT_GENERIC_TZ: windows_sys::core::PCSTR = windows_sys::core::s!("vvvv");

// UNSUPPORTED Rust 3468:1: non-scalar type Ptr unsupported
// pub const UDAT_HOUR: windows_sys::core::PCSTR = windows_sys::core::s!("j");

public const val `UDAT_HOUR0_FIELD`: `UDateFormatField` = 16;
public const val `UDAT_HOUR1_FIELD`: `UDateFormatField` = 15;
// UNSUPPORTED Rust 3471:1: non-scalar type Ptr unsupported
// pub const UDAT_HOUR24: windows_sys::core::PCSTR = windows_sys::core::s!("H");

// UNSUPPORTED Rust 3472:1: non-scalar type Ptr unsupported
// pub const UDAT_HOUR24_MINUTE: windows_sys::core::PCSTR = windows_sys::core::s!("Hm");

// UNSUPPORTED Rust 3473:1: non-scalar type Ptr unsupported
// pub const UDAT_HOUR24_MINUTE_SECOND: windows_sys::core::PCSTR = windows_sys::core::s!("Hms");

// UNSUPPORTED Rust 3474:1: non-scalar type Ptr unsupported
// pub const UDAT_HOUR_MINUTE: windows_sys::core::PCSTR = windows_sys::core::s!("jm");

// UNSUPPORTED Rust 3475:1: non-scalar type Ptr unsupported
// pub const UDAT_HOUR_MINUTE_SECOND: windows_sys::core::PCSTR = windows_sys::core::s!("jms");

public const val `UDAT_HOUR_OF_DAY0_FIELD`: `UDateFormatField` = 5;
public const val `UDAT_HOUR_OF_DAY1_FIELD`: `UDateFormatField` = 4;
public const val `UDAT_JULIAN_DAY_FIELD`: `UDateFormatField` = 21;
public const val `UDAT_LOCALIZED_CHARS`: `UDateFormatSymbolType` = 6;
// UNSUPPORTED Rust 3480:1: non-scalar type Ptr unsupported
// pub const UDAT_LOCATION_TZ: windows_sys::core::PCSTR = windows_sys::core::s!("VVVV");

public const val `UDAT_LONG`: `UDateFormatStyle` = 1;
public const val `UDAT_LONG_RELATIVE`: `UDateFormatStyle` = 129;
public const val `UDAT_MEDIUM`: `UDateFormatStyle` = 2;
public const val `UDAT_MEDIUM_RELATIVE`: `UDateFormatStyle` = 130;
public const val `UDAT_MILLISECONDS_IN_DAY_FIELD`: `UDateFormatField` = 22;
// UNSUPPORTED Rust 3486:1: non-scalar type Ptr unsupported
// pub const UDAT_MINUTE: windows_sys::core::PCSTR = windows_sys::core::s!("m");

public const val `UDAT_MINUTE_FIELD`: `UDateFormatField` = 6;
// UNSUPPORTED Rust 3488:1: non-scalar type Ptr unsupported
// pub const UDAT_MINUTE_SECOND: windows_sys::core::PCSTR = windows_sys::core::s!("ms");

// UNSUPPORTED Rust 3489:1: non-scalar type Ptr unsupported
// pub const UDAT_MONTH: windows_sys::core::PCSTR = windows_sys::core::s!("MMMM");

public const val `UDAT_MONTHS`: `UDateFormatSymbolType` = 1;
// UNSUPPORTED Rust 3491:1: non-scalar type Ptr unsupported
// pub const UDAT_MONTH_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("MMMMd");

public const val `UDAT_MONTH_FIELD`: `UDateFormatField` = 2;
// UNSUPPORTED Rust 3493:1: non-scalar type Ptr unsupported
// pub const UDAT_MONTH_WEEKDAY_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("MMMMEEEEd");

public const val `UDAT_NARROW_MONTHS`: `UDateFormatSymbolType` = 8;
public const val `UDAT_NARROW_WEEKDAYS`: `UDateFormatSymbolType` = 9;
public const val `UDAT_NONE`: `UDateFormatStyle` = -1;
// UNSUPPORTED Rust 3497:1: non-scalar type Ptr unsupported
// pub const UDAT_NUM_MONTH: windows_sys::core::PCSTR = windows_sys::core::s!("M");

// UNSUPPORTED Rust 3498:1: non-scalar type Ptr unsupported
// pub const UDAT_NUM_MONTH_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("Md");

// UNSUPPORTED Rust 3499:1: non-scalar type Ptr unsupported
// pub const UDAT_NUM_MONTH_WEEKDAY_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("MEd");

public const val `UDAT_PARSE_ALLOW_NUMERIC`: `UDateFormatBooleanAttribute` = 1;
public const val `UDAT_PARSE_ALLOW_WHITESPACE`: `UDateFormatBooleanAttribute` = 0;
public const val `UDAT_PARSE_MULTIPLE_PATTERNS_FOR_MATCH`: `UDateFormatBooleanAttribute` = 3;
public const val `UDAT_PARSE_PARTIAL_LITERAL_MATCH`: `UDateFormatBooleanAttribute` = 2;
public const val `UDAT_PATTERN`: `UDateFormatStyle` = -2;
// UNSUPPORTED Rust 3505:1: non-scalar type Ptr unsupported
// pub const UDAT_QUARTER: windows_sys::core::PCSTR = windows_sys::core::s!("QQQQ");

public const val `UDAT_QUARTERS`: `UDateFormatSymbolType` = 16;
public const val `UDAT_QUARTER_FIELD`: `UDateFormatField` = 27;
public const val `UDAT_RELATIVE`: `UDateFormatStyle` = 128;
public const val `UDAT_RELATIVE_DAYS`: `UDateRelativeUnit` = 3;
public const val `UDAT_RELATIVE_HOURS`: `UDateRelativeUnit` = 2;
public const val `UDAT_RELATIVE_MINUTES`: `UDateRelativeUnit` = 1;
public const val `UDAT_RELATIVE_MONTHS`: `UDateRelativeUnit` = 5;
public const val `UDAT_RELATIVE_SECONDS`: `UDateRelativeUnit` = 0;
public const val `UDAT_RELATIVE_UNIT_COUNT`: `UDateRelativeUnit` = 7;
public const val `UDAT_RELATIVE_WEEKS`: `UDateRelativeUnit` = 4;
public const val `UDAT_RELATIVE_YEARS`: `UDateRelativeUnit` = 6;
public const val `UDAT_REL_LITERAL_FIELD`: `URelativeDateTimeFormatterField` = 0;
public const val `UDAT_REL_NUMERIC_FIELD`: `URelativeDateTimeFormatterField` = 1;
public const val `UDAT_REL_UNIT_DAY`: `URelativeDateTimeUnit` = 4;
public const val `UDAT_REL_UNIT_FRIDAY`: `URelativeDateTimeUnit` = 13;
public const val `UDAT_REL_UNIT_HOUR`: `URelativeDateTimeUnit` = 5;
public const val `UDAT_REL_UNIT_MINUTE`: `URelativeDateTimeUnit` = 6;
public const val `UDAT_REL_UNIT_MONDAY`: `URelativeDateTimeUnit` = 9;
public const val `UDAT_REL_UNIT_MONTH`: `URelativeDateTimeUnit` = 2;
public const val `UDAT_REL_UNIT_QUARTER`: `URelativeDateTimeUnit` = 1;
public const val `UDAT_REL_UNIT_SATURDAY`: `URelativeDateTimeUnit` = 14;
public const val `UDAT_REL_UNIT_SECOND`: `URelativeDateTimeUnit` = 7;
public const val `UDAT_REL_UNIT_SUNDAY`: `URelativeDateTimeUnit` = 8;
public const val `UDAT_REL_UNIT_THURSDAY`: `URelativeDateTimeUnit` = 12;
public const val `UDAT_REL_UNIT_TUESDAY`: `URelativeDateTimeUnit` = 10;
public const val `UDAT_REL_UNIT_WEDNESDAY`: `URelativeDateTimeUnit` = 11;
public const val `UDAT_REL_UNIT_WEEK`: `URelativeDateTimeUnit` = 3;
public const val `UDAT_REL_UNIT_YEAR`: `URelativeDateTimeUnit` = 0;
// UNSUPPORTED Rust 3534:1: non-scalar type Ptr unsupported
// pub const UDAT_SECOND: windows_sys::core::PCSTR = windows_sys::core::s!("s");

public const val `UDAT_SECOND_FIELD`: `UDateFormatField` = 7;
public const val `UDAT_SHORT`: `UDateFormatStyle` = 3;
public const val `UDAT_SHORTER_WEEKDAYS`: `UDateFormatSymbolType` = 20;
public const val `UDAT_SHORT_MONTHS`: `UDateFormatSymbolType` = 2;
public const val `UDAT_SHORT_QUARTERS`: `UDateFormatSymbolType` = 17;
public const val `UDAT_SHORT_RELATIVE`: `UDateFormatStyle` = 131;
public const val `UDAT_SHORT_WEEKDAYS`: `UDateFormatSymbolType` = 4;
// UNSUPPORTED Rust 3542:1: non-scalar type Ptr unsupported
// pub const UDAT_SPECIFIC_TZ: windows_sys::core::PCSTR = windows_sys::core::s!("zzzz");

public const val `UDAT_STANDALONE_DAY_FIELD`: `UDateFormatField` = 25;
public const val `UDAT_STANDALONE_MONTHS`: `UDateFormatSymbolType` = 10;
public const val `UDAT_STANDALONE_MONTH_FIELD`: `UDateFormatField` = 26;
public const val `UDAT_STANDALONE_NARROW_MONTHS`: `UDateFormatSymbolType` = 12;
public const val `UDAT_STANDALONE_NARROW_WEEKDAYS`: `UDateFormatSymbolType` = 15;
public const val `UDAT_STANDALONE_QUARTERS`: `UDateFormatSymbolType` = 18;
public const val `UDAT_STANDALONE_QUARTER_FIELD`: `UDateFormatField` = 28;
public const val `UDAT_STANDALONE_SHORTER_WEEKDAYS`: `UDateFormatSymbolType` = 21;
public const val `UDAT_STANDALONE_SHORT_MONTHS`: `UDateFormatSymbolType` = 11;
public const val `UDAT_STANDALONE_SHORT_QUARTERS`: `UDateFormatSymbolType` = 19;
public const val `UDAT_STANDALONE_SHORT_WEEKDAYS`: `UDateFormatSymbolType` = 14;
public const val `UDAT_STANDALONE_WEEKDAYS`: `UDateFormatSymbolType` = 13;
public const val `UDAT_STYLE_LONG`: `UDateRelativeDateTimeFormatterStyle` = 0;
public const val `UDAT_STYLE_NARROW`: `UDateRelativeDateTimeFormatterStyle` = 2;
public const val `UDAT_STYLE_SHORT`: `UDateRelativeDateTimeFormatterStyle` = 1;
public const val `UDAT_TIMEZONE_FIELD`: `UDateFormatField` = 17;
public const val `UDAT_TIMEZONE_GENERIC_FIELD`: `UDateFormatField` = 24;
public const val `UDAT_TIMEZONE_ISO_FIELD`: `UDateFormatField` = 32;
public const val `UDAT_TIMEZONE_ISO_LOCAL_FIELD`: `UDateFormatField` = 33;
public const val `UDAT_TIMEZONE_LOCALIZED_GMT_OFFSET_FIELD`: `UDateFormatField` = 31;
public const val `UDAT_TIMEZONE_RFC_FIELD`: `UDateFormatField` = 23;
public const val `UDAT_TIMEZONE_SPECIAL_FIELD`: `UDateFormatField` = 29;
// UNSUPPORTED Rust 3565:1: non-scalar type Ptr unsupported
// pub const UDAT_WEEKDAY: windows_sys::core::PCSTR = windows_sys::core::s!("EEEE");

public const val `UDAT_WEEKDAYS`: `UDateFormatSymbolType` = 3;
public const val `UDAT_WEEK_OF_MONTH_FIELD`: `UDateFormatField` = 13;
public const val `UDAT_WEEK_OF_YEAR_FIELD`: `UDateFormatField` = 12;
// UNSUPPORTED Rust 3569:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR: windows_sys::core::PCSTR = windows_sys::core::s!("y");

// UNSUPPORTED Rust 3570:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_ABBR_MONTH: windows_sys::core::PCSTR = windows_sys::core::s!("yMMM");

// UNSUPPORTED Rust 3571:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_ABBR_MONTH_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("yMMMd");

// UNSUPPORTED Rust 3572:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_ABBR_MONTH_WEEKDAY_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("yMMMEd");

// UNSUPPORTED Rust 3573:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_ABBR_QUARTER: windows_sys::core::PCSTR = windows_sys::core::s!("yQQQ");

public const val `UDAT_YEAR_FIELD`: `UDateFormatField` = 1;
// UNSUPPORTED Rust 3575:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_MONTH: windows_sys::core::PCSTR = windows_sys::core::s!("yMMMM");

// UNSUPPORTED Rust 3576:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_MONTH_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("yMMMMd");

// UNSUPPORTED Rust 3577:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_MONTH_WEEKDAY_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("yMMMMEEEEd");

public const val `UDAT_YEAR_NAME_FIELD`: `UDateFormatField` = 30;
// UNSUPPORTED Rust 3579:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_NUM_MONTH: windows_sys::core::PCSTR = windows_sys::core::s!("yM");

// UNSUPPORTED Rust 3580:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_NUM_MONTH_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("yMd");

// UNSUPPORTED Rust 3581:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_NUM_MONTH_WEEKDAY_DAY: windows_sys::core::PCSTR = windows_sys::core::s!("yMEd");

// UNSUPPORTED Rust 3582:1: non-scalar type Ptr unsupported
// pub const UDAT_YEAR_QUARTER: windows_sys::core::PCSTR = windows_sys::core::s!("yQQQQ");

public const val `UDAT_YEAR_WOY_FIELD`: `UDateFormatField` = 18;
public const val `UDAT_ZODIAC_NAMES_ABBREVIATED`: `UDateFormatSymbolType` = 26;
public const val `UDAT_ZODIAC_NAMES_NARROW`: `UDateFormatSymbolType` = 27;
public const val `UDAT_ZODIAC_NAMES_WIDE`: `UDateFormatSymbolType` = 25;
public const val `UDISPCTX_CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE`: `UDisplayContext` = 258;
public const val `UDISPCTX_CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE`: `UDisplayContext` = 257;
public const val `UDISPCTX_CAPITALIZATION_FOR_STANDALONE`: `UDisplayContext` = 260;
public const val `UDISPCTX_CAPITALIZATION_FOR_UI_LIST_OR_MENU`: `UDisplayContext` = 259;
public const val `UDISPCTX_CAPITALIZATION_NONE`: `UDisplayContext` = 256;
public const val `UDISPCTX_DIALECT_NAMES`: `UDisplayContext` = 1;
public const val `UDISPCTX_LENGTH_FULL`: `UDisplayContext` = 512;
public const val `UDISPCTX_LENGTH_SHORT`: `UDisplayContext` = 513;
public const val `UDISPCTX_NO_SUBSTITUTE`: `UDisplayContext` = 769;
public const val `UDISPCTX_STANDARD_NAMES`: `UDisplayContext` = 0;
public const val `UDISPCTX_SUBSTITUTE`: `UDisplayContext` = 768;
public const val `UDISPCTX_TYPE_CAPITALIZATION`: `UDisplayContextType` = 1;
public const val `UDISPCTX_TYPE_DIALECT_HANDLING`: `UDisplayContextType` = 0;
public const val `UDISPCTX_TYPE_DISPLAY_LENGTH`: `UDisplayContextType` = 2;
public const val `UDISPCTX_TYPE_SUBSTITUTE_HANDLING`: `UDisplayContextType` = 3;
public const val `UDTS_DB2_TIME`: `UDateTimeScale` = 8;
public const val `UDTS_DOTNET_DATE_TIME`: `UDateTimeScale` = 4;
public const val `UDTS_EXCEL_TIME`: `UDateTimeScale` = 7;
public const val `UDTS_ICU4C_TIME`: `UDateTimeScale` = 2;
public const val `UDTS_JAVA_TIME`: `UDateTimeScale` = 0;
public const val `UDTS_MAC_OLD_TIME`: `UDateTimeScale` = 5;
public const val `UDTS_MAC_TIME`: `UDateTimeScale` = 6;
public const val `UDTS_UNIX_MICROSECONDS_TIME`: `UDateTimeScale` = 9;
public const val `UDTS_UNIX_TIME`: `UDateTimeScale` = 1;
public const val `UDTS_WINDOWS_FILE_TIME`: `UDateTimeScale` = 3;
public typealias `UDateAbsoluteUnit` = Int;
public typealias `UDateDirection` = Int;
public typealias `UDateFormatBooleanAttribute` = Int;
public typealias `UDateFormatField` = Int;
public typealias `UDateFormatStyle` = Int;
public typealias `UDateFormatSymbolType` = Int;
public typealias `UDateFormatSymbols` = Long;
public typealias `UDateIntervalFormat` = Long;
public typealias `UDateRelativeDateTimeFormatterStyle` = Int;
public typealias `UDateRelativeUnit` = Int;
public typealias `UDateTimePGDisplayWidth` = Int;
public typealias `UDateTimePatternConflict` = Int;
public typealias `UDateTimePatternField` = Int;
public typealias `UDateTimePatternMatchOptions` = Int;
public typealias `UDateTimeScale` = Int;
public typealias `UDecompositionType` = Int;
public typealias `UDialectHandling` = Int;
public typealias `UDisplayContext` = Int;
public typealias `UDisplayContextType` = Int;
public typealias `UEastAsianWidth` = Int;
// UNSUPPORTED Rust 3632:1: generic scalar type unsupported
// pub type UEnumCharNamesFn = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, code: i32, namechoice: UCharNameChoice, name: windows_sys::core::PCSTR, length: i32) -> i8>;

public typealias `UEnumeration` = Long;
public typealias `UErrorCode` = Int;
public const val `UFIELD_CATEGORY_DATE`: `UFieldCategory` = 1;
public const val `UFIELD_CATEGORY_DATE_INTERVAL`: `UFieldCategory` = 5;
public const val `UFIELD_CATEGORY_DATE_INTERVAL_SPAN`: `UFieldCategory` = 4101;
public const val `UFIELD_CATEGORY_LIST`: `UFieldCategory` = 3;
public const val `UFIELD_CATEGORY_LIST_SPAN`: `UFieldCategory` = 4099;
public const val `UFIELD_CATEGORY_NUMBER`: `UFieldCategory` = 2;
public const val `UFIELD_CATEGORY_RELATIVE_DATETIME`: `UFieldCategory` = 4;
public const val `UFIELD_CATEGORY_UNDEFINED`: `UFieldCategory` = 0;
public const val `UFMT_ARRAY`: `UFormattableType` = 4;
public const val `UFMT_DATE`: `UFormattableType` = 0;
public const val `UFMT_DOUBLE`: `UFormattableType` = 1;
public const val `UFMT_INT64`: `UFormattableType` = 5;
public const val `UFMT_LONG`: `UFormattableType` = 2;
public const val `UFMT_OBJECT`: `UFormattableType` = 6;
public const val `UFMT_STRING`: `UFormattableType` = 3;
public typealias `UFieldCategory` = Int;
// UNSUPPORTED Rust 3651:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UFieldPosition {
//     pub field: i32,
//     pub beginIndex: i32,
//     pub endIndex: i32,
// }

public typealias `UFieldPositionIterator` = Long;
public typealias `UFormattableType` = Int;
public typealias `UFormattedDateInterval` = Long;
public typealias `UFormattedList` = Long;
public typealias `UFormattedNumber` = Long;
public typealias `UFormattedNumberRange` = Long;
public typealias `UFormattedRelativeDateTime` = Long;
public typealias `UFormattedValue` = Long;
public const val `UGENDER_FEMALE`: `UGender` = 1;
public const val `UGENDER_MALE`: `UGender` = 0;
public const val `UGENDER_OTHER`: `UGender` = 2;
public typealias `UGender` = Int;
public typealias `UGenderInfo` = Long;
public typealias `UGraphemeClusterBreak` = Int;
public typealias `UHangulSyllableType` = Int;
public typealias `UHashtable` = Long;
public typealias `UIDNA` = Long;
// UNSUPPORTED Rust 3675:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UIDNAInfo {
//     pub size: i16,
//     pub isTransitionalDifferent: i8,
//     pub reservedB3: i8,
//     pub errors: u32,
//     pub reservedI2: i32,
//     pub reservedI3: i32,
// }

public const val `UIDNA_CHECK_BIDI`: Int = 4;
public const val `UIDNA_CHECK_CONTEXTJ`: Int = 8;
public const val `UIDNA_CHECK_CONTEXTO`: Int = 64;
public const val `UIDNA_DEFAULT`: Int = 0;
public const val `UIDNA_ERROR_BIDI`: Int = 2048;
public const val `UIDNA_ERROR_CONTEXTJ`: Int = 4096;
public const val `UIDNA_ERROR_CONTEXTO_DIGITS`: Int = 16384;
public const val `UIDNA_ERROR_CONTEXTO_PUNCTUATION`: Int = 8192;
public const val `UIDNA_ERROR_DISALLOWED`: Int = 128;
public const val `UIDNA_ERROR_DOMAIN_NAME_TOO_LONG`: Int = 4;
public const val `UIDNA_ERROR_EMPTY_LABEL`: Int = 1;
public const val `UIDNA_ERROR_HYPHEN_3_4`: Int = 32;
public const val `UIDNA_ERROR_INVALID_ACE_LABEL`: Int = 1024;
public const val `UIDNA_ERROR_LABEL_HAS_DOT`: Int = 512;
public const val `UIDNA_ERROR_LABEL_TOO_LONG`: Int = 2;
public const val `UIDNA_ERROR_LEADING_COMBINING_MARK`: Int = 64;
public const val `UIDNA_ERROR_LEADING_HYPHEN`: Int = 8;
public const val `UIDNA_ERROR_PUNYCODE`: Int = 256;
public const val `UIDNA_ERROR_TRAILING_HYPHEN`: Int = 16;
public const val `UIDNA_NONTRANSITIONAL_TO_ASCII`: Int = 16;
public const val `UIDNA_NONTRANSITIONAL_TO_UNICODE`: Int = 32;
public const val `UIDNA_USE_STD3_RULES`: Int = 2;
// UNSUPPORTED Rust 3707:1: generic scalar type unsupported
// pub type UILANGUAGE_ENUMPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: isize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3708:1: generic scalar type unsupported
// pub type UILANGUAGE_ENUMPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: isize) -> windows_sys::core::BOOL>;

public const val `UITER_CURRENT`: `UCharIteratorOrigin` = 1;
public const val `UITER_LENGTH`: `UCharIteratorOrigin` = 4;
public const val `UITER_LIMIT`: `UCharIteratorOrigin` = 2;
public const val `UITER_START`: `UCharIteratorOrigin` = 0;
public const val `UITER_UNKNOWN_INDEX`: Int = -2;
public const val `UITER_ZERO`: `UCharIteratorOrigin` = 3;
public typealias `UIndicPositionalCategory` = Int;
public typealias `UIndicSyllabicCategory` = Int;
public typealias `UJoiningGroup` = Int;
public typealias `UJoiningType` = Int;
public const val `ULDN_DIALECT_NAMES`: `UDialectHandling` = 1;
public const val `ULDN_STANDARD_NAMES`: `UDialectHandling` = 0;
public const val `ULISTFMT_ELEMENT_FIELD`: `UListFormatterField` = 1;
public const val `ULISTFMT_LITERAL_FIELD`: `UListFormatterField` = 0;
public const val `ULISTFMT_TYPE_AND`: `UListFormatterType` = 0;
public const val `ULISTFMT_TYPE_OR`: `UListFormatterType` = 1;
public const val `ULISTFMT_TYPE_UNITS`: `UListFormatterType` = 2;
public const val `ULISTFMT_WIDTH_NARROW`: `UListFormatterWidth` = 2;
public const val `ULISTFMT_WIDTH_SHORT`: `UListFormatterWidth` = 1;
public const val `ULISTFMT_WIDTH_WIDE`: `UListFormatterWidth` = 0;
public const val `ULOCDATA_ALT_QUOTATION_END`: `ULocaleDataDelimiterType` = 3;
public const val `ULOCDATA_ALT_QUOTATION_START`: `ULocaleDataDelimiterType` = 2;
public const val `ULOCDATA_ES_AUXILIARY`: `ULocaleDataExemplarSetType` = 1;
public const val `ULOCDATA_ES_INDEX`: `ULocaleDataExemplarSetType` = 2;
public const val `ULOCDATA_ES_PUNCTUATION`: `ULocaleDataExemplarSetType` = 3;
public const val `ULOCDATA_ES_STANDARD`: `ULocaleDataExemplarSetType` = 0;
public const val `ULOCDATA_QUOTATION_END`: `ULocaleDataDelimiterType` = 1;
public const val `ULOCDATA_QUOTATION_START`: `ULocaleDataDelimiterType` = 0;
public const val `ULOC_ACCEPT_FAILED`: `UAcceptResult` = 0;
public const val `ULOC_ACCEPT_FALLBACK`: `UAcceptResult` = 2;
public const val `ULOC_ACCEPT_VALID`: `UAcceptResult` = 1;
public const val `ULOC_ACTUAL_LOCALE`: `ULocDataLocaleType` = 0;
public const val `ULOC_AVAILABLE_DEFAULT`: `ULocAvailableType` = 0;
public const val `ULOC_AVAILABLE_ONLY_LEGACY_ALIASES`: `ULocAvailableType` = 1;
public const val `ULOC_AVAILABLE_WITH_LEGACY_ALIASES`: `ULocAvailableType` = 2;
// UNSUPPORTED Rust 3744:1: non-scalar type Ptr unsupported
// pub const ULOC_CANADA: windows_sys::core::PCSTR = windows_sys::core::s!("en_CA");

// UNSUPPORTED Rust 3745:1: non-scalar type Ptr unsupported
// pub const ULOC_CANADA_FRENCH: windows_sys::core::PCSTR = windows_sys::core::s!("fr_CA");

// UNSUPPORTED Rust 3746:1: non-scalar type Ptr unsupported
// pub const ULOC_CHINA: windows_sys::core::PCSTR = windows_sys::core::s!("zh_CN");

// UNSUPPORTED Rust 3747:1: non-scalar type Ptr unsupported
// pub const ULOC_CHINESE: windows_sys::core::PCSTR = windows_sys::core::s!("zh");

public const val `ULOC_COUNTRY_CAPACITY`: UInt = 4u;
// UNSUPPORTED Rust 3749:1: non-scalar type Ptr unsupported
// pub const ULOC_ENGLISH: windows_sys::core::PCSTR = windows_sys::core::s!("en");

// UNSUPPORTED Rust 3750:1: non-scalar type Ptr unsupported
// pub const ULOC_FRANCE: windows_sys::core::PCSTR = windows_sys::core::s!("fr_FR");

// UNSUPPORTED Rust 3751:1: non-scalar type Ptr unsupported
// pub const ULOC_FRENCH: windows_sys::core::PCSTR = windows_sys::core::s!("fr");

public const val `ULOC_FULLNAME_CAPACITY`: UInt = 157u;
// UNSUPPORTED Rust 3753:1: non-scalar type Ptr unsupported
// pub const ULOC_GERMAN: windows_sys::core::PCSTR = windows_sys::core::s!("de");

// UNSUPPORTED Rust 3754:1: non-scalar type Ptr unsupported
// pub const ULOC_GERMANY: windows_sys::core::PCSTR = windows_sys::core::s!("de_DE");

// UNSUPPORTED Rust 3755:1: non-scalar type Ptr unsupported
// pub const ULOC_ITALIAN: windows_sys::core::PCSTR = windows_sys::core::s!("it");

// UNSUPPORTED Rust 3756:1: non-scalar type Ptr unsupported
// pub const ULOC_ITALY: windows_sys::core::PCSTR = windows_sys::core::s!("it_IT");

// UNSUPPORTED Rust 3757:1: non-scalar type Ptr unsupported
// pub const ULOC_JAPAN: windows_sys::core::PCSTR = windows_sys::core::s!("ja_JP");

// UNSUPPORTED Rust 3758:1: non-scalar type Ptr unsupported
// pub const ULOC_JAPANESE: windows_sys::core::PCSTR = windows_sys::core::s!("ja");

public const val `ULOC_KEYWORDS_CAPACITY`: UInt = 96u;
public const val `ULOC_KEYWORD_AND_VALUES_CAPACITY`: UInt = 100u;
public const val `ULOC_KEYWORD_ASSIGN_UNICODE`: UInt = 61u;
public const val `ULOC_KEYWORD_ITEM_SEPARATOR_UNICODE`: UInt = 59u;
public const val `ULOC_KEYWORD_SEPARATOR_UNICODE`: UInt = 64u;
// UNSUPPORTED Rust 3764:1: non-scalar type Ptr unsupported
// pub const ULOC_KOREA: windows_sys::core::PCSTR = windows_sys::core::s!("ko_KR");

// UNSUPPORTED Rust 3765:1: non-scalar type Ptr unsupported
// pub const ULOC_KOREAN: windows_sys::core::PCSTR = windows_sys::core::s!("ko");

public const val `ULOC_LANG_CAPACITY`: UInt = 12u;
public const val `ULOC_LAYOUT_BTT`: `ULayoutType` = 3;
public const val `ULOC_LAYOUT_LTR`: `ULayoutType` = 0;
public const val `ULOC_LAYOUT_RTL`: `ULayoutType` = 1;
public const val `ULOC_LAYOUT_TTB`: `ULayoutType` = 2;
public const val `ULOC_LAYOUT_UNKNOWN`: `ULayoutType` = 4;
// UNSUPPORTED Rust 3772:1: non-scalar type Ptr unsupported
// pub const ULOC_PRC: windows_sys::core::PCSTR = windows_sys::core::s!("zh_CN");

public const val `ULOC_SCRIPT_CAPACITY`: UInt = 6u;
// UNSUPPORTED Rust 3774:1: non-scalar type Ptr unsupported
// pub const ULOC_SIMPLIFIED_CHINESE: windows_sys::core::PCSTR = windows_sys::core::s!("zh_CN");

// UNSUPPORTED Rust 3775:1: non-scalar type Ptr unsupported
// pub const ULOC_TAIWAN: windows_sys::core::PCSTR = windows_sys::core::s!("zh_TW");

// UNSUPPORTED Rust 3776:1: non-scalar type Ptr unsupported
// pub const ULOC_TRADITIONAL_CHINESE: windows_sys::core::PCSTR = windows_sys::core::s!("zh_TW");

// UNSUPPORTED Rust 3777:1: non-scalar type Ptr unsupported
// pub const ULOC_UK: windows_sys::core::PCSTR = windows_sys::core::s!("en_GB");

// UNSUPPORTED Rust 3778:1: non-scalar type Ptr unsupported
// pub const ULOC_US: windows_sys::core::PCSTR = windows_sys::core::s!("en_US");

public const val `ULOC_VALID_LOCALE`: `ULocDataLocaleType` = 1;
public typealias `ULayoutType` = Int;
public typealias `ULineBreak` = Int;
public typealias `ULineBreakTag` = Int;
public typealias `UListFormatter` = Long;
public typealias `UListFormatterField` = Int;
public typealias `UListFormatterType` = Int;
public typealias `UListFormatterWidth` = Int;
public typealias `ULocAvailableType` = Int;
public typealias `ULocDataLocaleType` = Int;
public typealias `ULocaleData` = Long;
public typealias `ULocaleDataDelimiterType` = Int;
public typealias `ULocaleDataExemplarSetType` = Int;
public typealias `ULocaleDisplayNames` = Long;
public const val `UMEASFMT_WIDTH_COUNT`: `UMeasureFormatWidth` = 4;
public const val `UMEASFMT_WIDTH_NARROW`: `UMeasureFormatWidth` = 2;
public const val `UMEASFMT_WIDTH_NUMERIC`: `UMeasureFormatWidth` = 3;
public const val `UMEASFMT_WIDTH_SHORT`: `UMeasureFormatWidth` = 1;
public const val `UMEASFMT_WIDTH_WIDE`: `UMeasureFormatWidth` = 0;
public const val `UMSGPAT_APOS_DOUBLE_OPTIONAL`: `UMessagePatternApostropheMode` = 0;
public const val `UMSGPAT_APOS_DOUBLE_REQUIRED`: `UMessagePatternApostropheMode` = 1;
public const val `UMSGPAT_ARG_NAME_NOT_NUMBER`: Int = -1;
public const val `UMSGPAT_ARG_NAME_NOT_VALID`: Int = -2;
public const val `UMSGPAT_ARG_TYPE_CHOICE`: `UMessagePatternArgType` = 2;
public const val `UMSGPAT_ARG_TYPE_NONE`: `UMessagePatternArgType` = 0;
public const val `UMSGPAT_ARG_TYPE_PLURAL`: `UMessagePatternArgType` = 3;
public const val `UMSGPAT_ARG_TYPE_SELECT`: `UMessagePatternArgType` = 4;
public const val `UMSGPAT_ARG_TYPE_SELECTORDINAL`: `UMessagePatternArgType` = 5;
public const val `UMSGPAT_ARG_TYPE_SIMPLE`: `UMessagePatternArgType` = 1;
public const val `UMSGPAT_PART_TYPE_ARG_DOUBLE`: `UMessagePatternPartType` = 13;
public const val `UMSGPAT_PART_TYPE_ARG_INT`: `UMessagePatternPartType` = 12;
public const val `UMSGPAT_PART_TYPE_ARG_LIMIT`: `UMessagePatternPartType` = 6;
public const val `UMSGPAT_PART_TYPE_ARG_NAME`: `UMessagePatternPartType` = 8;
public const val `UMSGPAT_PART_TYPE_ARG_NUMBER`: `UMessagePatternPartType` = 7;
public const val `UMSGPAT_PART_TYPE_ARG_SELECTOR`: `UMessagePatternPartType` = 11;
public const val `UMSGPAT_PART_TYPE_ARG_START`: `UMessagePatternPartType` = 5;
public const val `UMSGPAT_PART_TYPE_ARG_STYLE`: `UMessagePatternPartType` = 10;
public const val `UMSGPAT_PART_TYPE_ARG_TYPE`: `UMessagePatternPartType` = 9;
public const val `UMSGPAT_PART_TYPE_INSERT_CHAR`: `UMessagePatternPartType` = 3;
public const val `UMSGPAT_PART_TYPE_MSG_LIMIT`: `UMessagePatternPartType` = 1;
public const val `UMSGPAT_PART_TYPE_MSG_START`: `UMessagePatternPartType` = 0;
public const val `UMSGPAT_PART_TYPE_REPLACE_NUMBER`: `UMessagePatternPartType` = 4;
public const val `UMSGPAT_PART_TYPE_SKIP_SYNTAX`: `UMessagePatternPartType` = 2;
public const val `UMS_SI`: `UMeasurementSystem` = 0;
public const val `UMS_UK`: `UMeasurementSystem` = 2;
public const val `UMS_US`: `UMeasurementSystem` = 1;
public typealias `UMeasureFormatWidth` = Int;
public typealias `UMeasurementSystem` = Int;
// UNSUPPORTED Rust 3827:1: generic scalar type unsupported
// pub type UMemAllocFn = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, size: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 3828:1: generic scalar type unsupported
// pub type UMemFreeFn = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, mem: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 3829:1: generic scalar type unsupported
// pub type UMemReallocFn = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, mem: *mut core::ffi::c_void, size: usize) -> *mut core::ffi::c_void>;

public typealias `UMessagePatternApostropheMode` = Int;
public typealias `UMessagePatternArgType` = Int;
public typealias `UMessagePatternPartType` = Int;
public typealias `UMutableCPTrie` = Long;
// UNSUPPORTED Rust 3834:1: generic scalar type unsupported
// pub type UNESCAPE_CHAR_AT = Option<unsafe extern "system" fn(offset: i32, context: *mut core::ffi::c_void) -> u16>;

// UNSUPPORTED Rust 3835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UNICODERANGE {
//     pub wcFrom: u16,
//     pub wcTo: u16,
// }

public const val `UNISCRIBE_OPENTYPE`: UInt = 256u;
public const val `UNORM2_COMPOSE`: `UNormalization2Mode` = 0;
public const val `UNORM2_COMPOSE_CONTIGUOUS`: `UNormalization2Mode` = 3;
public const val `UNORM2_DECOMPOSE`: `UNormalization2Mode` = 1;
public const val `UNORM2_FCD`: `UNormalization2Mode` = 2;
public const val `UNORM_DEFAULT`: `UNormalizationMode` = 4;
public const val `UNORM_FCD`: `UNormalizationMode` = 6;
public const val `UNORM_INPUT_IS_FCD`: UInt = 131072u;
public const val `UNORM_MAYBE`: `UNormalizationCheckResult` = 2;
public const val `UNORM_MODE_COUNT`: `UNormalizationMode` = 7;
public const val `UNORM_NFC`: `UNormalizationMode` = 4;
public const val `UNORM_NFD`: `UNormalizationMode` = 2;
public const val `UNORM_NFKC`: `UNormalizationMode` = 5;
public const val `UNORM_NFKD`: `UNormalizationMode` = 3;
public const val `UNORM_NO`: `UNormalizationCheckResult` = 0;
public const val `UNORM_NONE`: `UNormalizationMode` = 1;
public const val `UNORM_YES`: `UNormalizationCheckResult` = 1;
public const val `UNUM_CASH_CURRENCY`: `UNumberFormatStyle` = 13;
public const val `UNUM_COMPACT_FIELD`: `UNumberFormatFields` = 12;
public const val `UNUM_CURRENCY`: `UNumberFormatStyle` = 2;
public const val `UNUM_CURRENCY_ACCOUNTING`: `UNumberFormatStyle` = 12;
public const val `UNUM_CURRENCY_CODE`: `UNumberFormatTextAttribute` = 5;
public const val `UNUM_CURRENCY_FIELD`: `UNumberFormatFields` = 7;
public const val `UNUM_CURRENCY_INSERT`: `UCurrencySpacing` = 2;
public const val `UNUM_CURRENCY_ISO`: `UNumberFormatStyle` = 10;
public const val `UNUM_CURRENCY_MATCH`: `UCurrencySpacing` = 0;
public const val `UNUM_CURRENCY_PLURAL`: `UNumberFormatStyle` = 11;
public const val `UNUM_CURRENCY_SPACING_COUNT`: `UCurrencySpacing` = 3;
public const val `UNUM_CURRENCY_STANDARD`: `UNumberFormatStyle` = 16;
public const val `UNUM_CURRENCY_SURROUNDING_MATCH`: `UCurrencySpacing` = 1;
public const val `UNUM_CURRENCY_SYMBOL`: `UNumberFormatSymbol` = 8;
public const val `UNUM_CURRENCY_USAGE`: `UNumberFormatAttribute` = 23;
public const val `UNUM_DECIMAL`: `UNumberFormatStyle` = 1;
public const val `UNUM_DECIMAL_ALWAYS_SHOWN`: `UNumberFormatAttribute` = 2;
public const val `UNUM_DECIMAL_COMPACT_LONG`: `UNumberFormatStyle` = 15;
public const val `UNUM_DECIMAL_COMPACT_SHORT`: `UNumberFormatStyle` = 14;
public const val `UNUM_DECIMAL_SEPARATOR_ALWAYS`: `UNumberDecimalSeparatorDisplay` = 1;
public const val `UNUM_DECIMAL_SEPARATOR_AUTO`: `UNumberDecimalSeparatorDisplay` = 0;
public const val `UNUM_DECIMAL_SEPARATOR_COUNT`: `UNumberDecimalSeparatorDisplay` = 2;
public const val `UNUM_DECIMAL_SEPARATOR_FIELD`: `UNumberFormatFields` = 2;
public const val `UNUM_DECIMAL_SEPARATOR_SYMBOL`: `UNumberFormatSymbol` = 0;
public const val `UNUM_DEFAULT`: `UNumberFormatStyle` = 1;
public const val `UNUM_DEFAULT_RULESET`: `UNumberFormatTextAttribute` = 6;
public const val `UNUM_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 5;
public const val `UNUM_DURATION`: `UNumberFormatStyle` = 7;
public const val `UNUM_EIGHT_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 25;
public const val `UNUM_EXPONENTIAL_SYMBOL`: `UNumberFormatSymbol` = 11;
public const val `UNUM_EXPONENT_FIELD`: `UNumberFormatFields` = 5;
public const val `UNUM_EXPONENT_MULTIPLICATION_SYMBOL`: `UNumberFormatSymbol` = 27;
public const val `UNUM_EXPONENT_SIGN_FIELD`: `UNumberFormatFields` = 4;
public const val `UNUM_EXPONENT_SYMBOL_FIELD`: `UNumberFormatFields` = 3;
public const val `UNUM_FIVE_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 22;
public const val `UNUM_FORMAT_ATTRIBUTE_VALUE_HIDDEN`: `UNumberFormatAttributeValue` = 0;
public const val `UNUM_FORMAT_FAIL_IF_MORE_THAN_MAX_DIGITS`: `UNumberFormatAttribute` = 4096;
public const val `UNUM_FORMAT_WIDTH`: `UNumberFormatAttribute` = 13;
public const val `UNUM_FOUR_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 21;
public const val `UNUM_FRACTION_DIGITS`: `UNumberFormatAttribute` = 8;
public const val `UNUM_FRACTION_FIELD`: `UNumberFormatFields` = 1;
public const val `UNUM_GROUPING_AUTO`: `UNumberGroupingStrategy` = 2;
public const val `UNUM_GROUPING_MIN2`: `UNumberGroupingStrategy` = 1;
public const val `UNUM_GROUPING_OFF`: `UNumberGroupingStrategy` = 0;
public const val `UNUM_GROUPING_ON_ALIGNED`: `UNumberGroupingStrategy` = 3;
public const val `UNUM_GROUPING_SEPARATOR_FIELD`: `UNumberFormatFields` = 6;
public const val `UNUM_GROUPING_SEPARATOR_SYMBOL`: `UNumberFormatSymbol` = 1;
public const val `UNUM_GROUPING_SIZE`: `UNumberFormatAttribute` = 10;
public const val `UNUM_GROUPING_THOUSANDS`: `UNumberGroupingStrategy` = 4;
public const val `UNUM_GROUPING_USED`: `UNumberFormatAttribute` = 1;
public const val `UNUM_IDENTITY_FALLBACK_APPROXIMATELY`: `UNumberRangeIdentityFallback` = 2;
public const val `UNUM_IDENTITY_FALLBACK_APPROXIMATELY_OR_SINGLE_VALUE`: `UNumberRangeIdentityFallback` = 1;
public const val `UNUM_IDENTITY_FALLBACK_RANGE`: `UNumberRangeIdentityFallback` = 3;
public const val `UNUM_IDENTITY_FALLBACK_SINGLE_VALUE`: `UNumberRangeIdentityFallback` = 0;
public const val `UNUM_IDENTITY_RESULT_EQUAL_AFTER_ROUNDING`: `UNumberRangeIdentityResult` = 1;
public const val `UNUM_IDENTITY_RESULT_EQUAL_BEFORE_ROUNDING`: `UNumberRangeIdentityResult` = 0;
public const val `UNUM_IDENTITY_RESULT_NOT_EQUAL`: `UNumberRangeIdentityResult` = 2;
public const val `UNUM_IGNORE`: `UNumberFormatStyle` = 0;
public const val `UNUM_INFINITY_SYMBOL`: `UNumberFormatSymbol` = 14;
public const val `UNUM_INTEGER_DIGITS`: `UNumberFormatAttribute` = 5;
public const val `UNUM_INTEGER_FIELD`: `UNumberFormatFields` = 0;
public const val `UNUM_INTL_CURRENCY_SYMBOL`: `UNumberFormatSymbol` = 9;
public const val `UNUM_LENIENT_PARSE`: `UNumberFormatAttribute` = 19;
public const val `UNUM_LONG`: `UNumberCompactStyle` = 1;
public const val `UNUM_MAX_FRACTION_DIGITS`: `UNumberFormatAttribute` = 6;
public const val `UNUM_MAX_INTEGER_DIGITS`: `UNumberFormatAttribute` = 3;
public const val `UNUM_MAX_SIGNIFICANT_DIGITS`: `UNumberFormatAttribute` = 18;
public const val `UNUM_MEASURE_UNIT_FIELD`: `UNumberFormatFields` = 11;
public const val `UNUM_MINIMUM_GROUPING_DIGITS`: `UNumberFormatAttribute` = 22;
public const val `UNUM_MINUS_SIGN_SYMBOL`: `UNumberFormatSymbol` = 6;
public const val `UNUM_MIN_FRACTION_DIGITS`: `UNumberFormatAttribute` = 7;
public const val `UNUM_MIN_INTEGER_DIGITS`: `UNumberFormatAttribute` = 4;
public const val `UNUM_MIN_SIGNIFICANT_DIGITS`: `UNumberFormatAttribute` = 17;
public const val `UNUM_MONETARY_GROUPING_SEPARATOR_SYMBOL`: `UNumberFormatSymbol` = 17;
public const val `UNUM_MONETARY_SEPARATOR_SYMBOL`: `UNumberFormatSymbol` = 10;
public const val `UNUM_MULTIPLIER`: `UNumberFormatAttribute` = 9;
public const val `UNUM_NAN_SYMBOL`: `UNumberFormatSymbol` = 15;
public const val `UNUM_NEGATIVE_PREFIX`: `UNumberFormatTextAttribute` = 2;
public const val `UNUM_NEGATIVE_SUFFIX`: `UNumberFormatTextAttribute` = 3;
public const val `UNUM_NINE_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 26;
public const val `UNUM_NUMBERING_SYSTEM`: `UNumberFormatStyle` = 8;
public const val `UNUM_ONE_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 18;
public const val `UNUM_ORDINAL`: `UNumberFormatStyle` = 6;
public const val `UNUM_PADDING_CHARACTER`: `UNumberFormatTextAttribute` = 4;
public const val `UNUM_PADDING_POSITION`: `UNumberFormatAttribute` = 14;
public const val `UNUM_PAD_AFTER_PREFIX`: `UNumberFormatPadPosition` = 1;
public const val `UNUM_PAD_AFTER_SUFFIX`: `UNumberFormatPadPosition` = 3;
public const val `UNUM_PAD_BEFORE_PREFIX`: `UNumberFormatPadPosition` = 0;
public const val `UNUM_PAD_BEFORE_SUFFIX`: `UNumberFormatPadPosition` = 2;
public const val `UNUM_PAD_ESCAPE_SYMBOL`: `UNumberFormatSymbol` = 13;
public const val `UNUM_PARSE_ALL_INPUT`: `UNumberFormatAttribute` = 20;
public const val `UNUM_PARSE_CASE_SENSITIVE`: `UNumberFormatAttribute` = 4099;
public const val `UNUM_PARSE_DECIMAL_MARK_REQUIRED`: `UNumberFormatAttribute` = 4098;
public const val `UNUM_PARSE_INT_ONLY`: `UNumberFormatAttribute` = 0;
public const val `UNUM_PARSE_NO_EXPONENT`: `UNumberFormatAttribute` = 4097;
public const val `UNUM_PATTERN_DECIMAL`: `UNumberFormatStyle` = 0;
public const val `UNUM_PATTERN_RULEBASED`: `UNumberFormatStyle` = 9;
public const val `UNUM_PATTERN_SEPARATOR_SYMBOL`: `UNumberFormatSymbol` = 2;
public const val `UNUM_PERCENT`: `UNumberFormatStyle` = 3;
public const val `UNUM_PERCENT_FIELD`: `UNumberFormatFields` = 8;
public const val `UNUM_PERCENT_SYMBOL`: `UNumberFormatSymbol` = 3;
public const val `UNUM_PERMILL_FIELD`: `UNumberFormatFields` = 9;
public const val `UNUM_PERMILL_SYMBOL`: `UNumberFormatSymbol` = 12;
public const val `UNUM_PLUS_SIGN_SYMBOL`: `UNumberFormatSymbol` = 7;
public const val `UNUM_POSITIVE_PREFIX`: `UNumberFormatTextAttribute` = 0;
public const val `UNUM_POSITIVE_SUFFIX`: `UNumberFormatTextAttribute` = 1;
public const val `UNUM_PUBLIC_RULESETS`: `UNumberFormatTextAttribute` = 7;
public const val `UNUM_RANGE_COLLAPSE_ALL`: `UNumberRangeCollapse` = 3;
public const val `UNUM_RANGE_COLLAPSE_AUTO`: `UNumberRangeCollapse` = 0;
public const val `UNUM_RANGE_COLLAPSE_NONE`: `UNumberRangeCollapse` = 1;
public const val `UNUM_RANGE_COLLAPSE_UNIT`: `UNumberRangeCollapse` = 2;
public const val `UNUM_ROUNDING_INCREMENT`: `UNumberFormatAttribute` = 12;
public const val `UNUM_ROUNDING_MODE`: `UNumberFormatAttribute` = 11;
public const val `UNUM_ROUND_CEILING`: `UNumberFormatRoundingMode` = 0;
public const val `UNUM_ROUND_DOWN`: `UNumberFormatRoundingMode` = 2;
public const val `UNUM_ROUND_FLOOR`: `UNumberFormatRoundingMode` = 1;
public const val `UNUM_ROUND_HALFDOWN`: `UNumberFormatRoundingMode` = 5;
public const val `UNUM_ROUND_HALFEVEN`: `UNumberFormatRoundingMode` = 4;
public const val `UNUM_ROUND_HALFUP`: `UNumberFormatRoundingMode` = 6;
public const val `UNUM_ROUND_UNNECESSARY`: `UNumberFormatRoundingMode` = 7;
public const val `UNUM_ROUND_UP`: `UNumberFormatRoundingMode` = 3;
public const val `UNUM_SCALE`: `UNumberFormatAttribute` = 21;
public const val `UNUM_SCIENTIFIC`: `UNumberFormatStyle` = 4;
public const val `UNUM_SECONDARY_GROUPING_SIZE`: `UNumberFormatAttribute` = 15;
public const val `UNUM_SEVEN_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 24;
public const val `UNUM_SHORT`: `UNumberCompactStyle` = 0;
public const val `UNUM_SIGNIFICANT_DIGITS_USED`: `UNumberFormatAttribute` = 16;
public const val `UNUM_SIGNIFICANT_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 16;
public const val `UNUM_SIGN_ACCOUNTING`: `UNumberSignDisplay` = 3;
public const val `UNUM_SIGN_ACCOUNTING_ALWAYS`: `UNumberSignDisplay` = 4;
public const val `UNUM_SIGN_ACCOUNTING_EXCEPT_ZERO`: `UNumberSignDisplay` = 6;
public const val `UNUM_SIGN_ALWAYS`: `UNumberSignDisplay` = 1;
public const val `UNUM_SIGN_ALWAYS_SHOWN`: `UNumberFormatAttribute` = 4100;
public const val `UNUM_SIGN_AUTO`: `UNumberSignDisplay` = 0;
public const val `UNUM_SIGN_COUNT`: `UNumberSignDisplay` = 7;
public const val `UNUM_SIGN_EXCEPT_ZERO`: `UNumberSignDisplay` = 5;
public const val `UNUM_SIGN_FIELD`: `UNumberFormatFields` = 10;
public const val `UNUM_SIGN_NEVER`: `UNumberSignDisplay` = 2;
public const val `UNUM_SIX_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 23;
public const val `UNUM_SPELLOUT`: `UNumberFormatStyle` = 5;
public const val `UNUM_THREE_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 20;
public const val `UNUM_TWO_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 19;
public const val `UNUM_UNIT_WIDTH_COUNT`: `UNumberUnitWidth` = 5;
public const val `UNUM_UNIT_WIDTH_FULL_NAME`: `UNumberUnitWidth` = 2;
public const val `UNUM_UNIT_WIDTH_HIDDEN`: `UNumberUnitWidth` = 4;
public const val `UNUM_UNIT_WIDTH_ISO_CODE`: `UNumberUnitWidth` = 3;
public const val `UNUM_UNIT_WIDTH_NARROW`: `UNumberUnitWidth` = 0;
public const val `UNUM_UNIT_WIDTH_SHORT`: `UNumberUnitWidth` = 1;
public const val `UNUM_ZERO_DIGIT_SYMBOL`: `UNumberFormatSymbol` = 4;
public typealias `UNormalization2Mode` = Int;
public typealias `UNormalizationCheckResult` = Int;
public typealias `UNormalizationMode` = Int;
public typealias `UNormalizer2` = Long;
public typealias `UNumberCompactStyle` = Int;
public typealias `UNumberDecimalSeparatorDisplay` = Int;
public typealias `UNumberFormatAttribute` = Int;
public typealias `UNumberFormatAttributeValue` = Int;
public typealias `UNumberFormatFields` = Int;
public typealias `UNumberFormatPadPosition` = Int;
public typealias `UNumberFormatRoundingMode` = Int;
public typealias `UNumberFormatStyle` = Int;
public typealias `UNumberFormatSymbol` = Int;
public typealias `UNumberFormatTextAttribute` = Int;
public typealias `UNumberFormatter` = Long;
public typealias `UNumberGroupingStrategy` = Int;
public typealias `UNumberRangeCollapse` = Int;
public typealias `UNumberRangeIdentityFallback` = Int;
public typealias `UNumberRangeIdentityResult` = Int;
public typealias `UNumberSignDisplay` = Int;
public typealias `UNumberUnitWidth` = Int;
public typealias `UNumberingSystem` = Long;
public typealias `UNumericType` = Int;
public const val `UPLURAL_TYPE_CARDINAL`: `UPluralType` = 0;
public const val `UPLURAL_TYPE_ORDINAL`: `UPluralType` = 1;
// UNSUPPORTED Rust 4032:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UParseError {
//     pub line: i32,
//     pub offset: i32,
//     pub preContext: [u16; 16],
//     pub postContext: [u16; 16],
// }

// UNSUPPORTED Rust 4040:1: declaration Impl has no candidate rule
// impl Default for UParseError {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `UPluralRules` = Long;
public typealias `UPluralType` = Int;
public typealias `UProperty` = Int;
public typealias `UPropertyNameChoice` = Int;
public const val `UREGEX_CASE_INSENSITIVE`: `URegexpFlag` = 2;
public const val `UREGEX_COMMENTS`: `URegexpFlag` = 4;
public const val `UREGEX_DOTALL`: `URegexpFlag` = 32;
public const val `UREGEX_ERROR_ON_UNKNOWN_ESCAPES`: `URegexpFlag` = 512;
public const val `UREGEX_LITERAL`: `URegexpFlag` = 16;
public const val `UREGEX_MULTILINE`: `URegexpFlag` = 8;
public const val `UREGEX_UNIX_LINES`: `URegexpFlag` = 1;
public const val `UREGEX_UWORD`: `URegexpFlag` = 256;
public const val `URES_ALIAS`: `UResType` = 3;
public const val `URES_ARRAY`: `UResType` = 8;
public const val `URES_BINARY`: `UResType` = 1;
public const val `URES_INT`: `UResType` = 7;
public const val `URES_INT_VECTOR`: `UResType` = 14;
public const val `URES_NONE`: `UResType` = -1;
public const val `URES_STRING`: `UResType` = 0;
public const val `URES_TABLE`: `UResType` = 2;
public const val `URGN_CONTINENT`: `URegionType` = 3;
public const val `URGN_DEPRECATED`: `URegionType` = 6;
public const val `URGN_GROUPING`: `URegionType` = 5;
public const val `URGN_SUBCONTINENT`: `URegionType` = 4;
public const val `URGN_TERRITORY`: `URegionType` = 1;
public const val `URGN_UNKNOWN`: `URegionType` = 0;
public const val `URGN_WORLD`: `URegionType` = 2;
// UNSUPPORTED Rust 4072:1: generic scalar type unsupported
// pub type URegexFindProgressCallback = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, matchindex: i64) -> i8>;

// UNSUPPORTED Rust 4073:1: generic scalar type unsupported
// pub type URegexMatchCallback = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, steps: i32) -> i8>;

public typealias `URegexpFlag` = Int;
public typealias `URegion` = Long;
public typealias `URegionType` = Int;
public typealias `URegularExpression` = Long;
public typealias `URelativeDateTimeFormatter` = Long;
public typealias `URelativeDateTimeFormatterField` = Int;
public typealias `URelativeDateTimeUnit` = Int;
// UNSUPPORTED Rust 4081:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UReplaceableCallbacks {
//     pub length: isize,
//     pub charAt: isize,
//     pub char32At: isize,
//     pub replace: isize,
//     pub extract: isize,
//     pub copy: isize,
// }

public typealias `UResType` = Int;
public typealias `UResourceBundle` = Long;
public typealias `URestrictionLevel` = Int;
public const val `USCRIPT_ADLAM`: `UScriptCode` = 167;
public const val `USCRIPT_AFAKA`: `UScriptCode` = 147;
public const val `USCRIPT_AHOM`: `UScriptCode` = 161;
public const val `USCRIPT_ANATOLIAN_HIEROGLYPHS`: `UScriptCode` = 156;
public const val `USCRIPT_ARABIC`: `UScriptCode` = 2;
public const val `USCRIPT_ARMENIAN`: `UScriptCode` = 3;
public const val `USCRIPT_AVESTAN`: `UScriptCode` = 117;
public const val `USCRIPT_BALINESE`: `UScriptCode` = 62;
public const val `USCRIPT_BAMUM`: `UScriptCode` = 130;
public const val `USCRIPT_BASSA_VAH`: `UScriptCode` = 134;
public const val `USCRIPT_BATAK`: `UScriptCode` = 63;
public const val `USCRIPT_BENGALI`: `UScriptCode` = 4;
public const val `USCRIPT_BHAIKSUKI`: `UScriptCode` = 168;
public const val `USCRIPT_BLISSYMBOLS`: `UScriptCode` = 64;
public const val `USCRIPT_BOOK_PAHLAVI`: `UScriptCode` = 124;
public const val `USCRIPT_BOPOMOFO`: `UScriptCode` = 5;
public const val `USCRIPT_BRAHMI`: `UScriptCode` = 65;
public const val `USCRIPT_BRAILLE`: `UScriptCode` = 46;
public const val `USCRIPT_BUGINESE`: `UScriptCode` = 55;
public const val `USCRIPT_BUHID`: `UScriptCode` = 44;
public const val `USCRIPT_CANADIAN_ABORIGINAL`: `UScriptCode` = 40;
public const val `USCRIPT_CARIAN`: `UScriptCode` = 104;
public const val `USCRIPT_CAUCASIAN_ALBANIAN`: `UScriptCode` = 159;
public const val `USCRIPT_CHAKMA`: `UScriptCode` = 118;
public const val `USCRIPT_CHAM`: `UScriptCode` = 66;
public const val `USCRIPT_CHEROKEE`: `UScriptCode` = 6;
public const val `USCRIPT_CHORASMIAN`: `UScriptCode` = 189;
public const val `USCRIPT_CIRTH`: `UScriptCode` = 67;
public const val `USCRIPT_COMMON`: `UScriptCode` = 0;
public const val `USCRIPT_COPTIC`: `UScriptCode` = 7;
public const val `USCRIPT_CUNEIFORM`: `UScriptCode` = 101;
public const val `USCRIPT_CYPRIOT`: `UScriptCode` = 47;
public const val `USCRIPT_CYRILLIC`: `UScriptCode` = 8;
public const val `USCRIPT_DEMOTIC_EGYPTIAN`: `UScriptCode` = 69;
public const val `USCRIPT_DESERET`: `UScriptCode` = 9;
public const val `USCRIPT_DEVANAGARI`: `UScriptCode` = 10;
public const val `USCRIPT_DIVES_AKURU`: `UScriptCode` = 190;
public const val `USCRIPT_DOGRA`: `UScriptCode` = 178;
public const val `USCRIPT_DUPLOYAN`: `UScriptCode` = 135;
public const val `USCRIPT_EASTERN_SYRIAC`: `UScriptCode` = 97;
public const val `USCRIPT_EGYPTIAN_HIEROGLYPHS`: `UScriptCode` = 71;
public const val `USCRIPT_ELBASAN`: `UScriptCode` = 136;
public const val `USCRIPT_ELYMAIC`: `UScriptCode` = 185;
public const val `USCRIPT_ESTRANGELO_SYRIAC`: `UScriptCode` = 95;
public const val `USCRIPT_ETHIOPIC`: `UScriptCode` = 11;
public const val `USCRIPT_GEORGIAN`: `UScriptCode` = 12;
public const val `USCRIPT_GLAGOLITIC`: `UScriptCode` = 56;
public const val `USCRIPT_GOTHIC`: `UScriptCode` = 13;
public const val `USCRIPT_GRANTHA`: `UScriptCode` = 137;
public const val `USCRIPT_GREEK`: `UScriptCode` = 14;
public const val `USCRIPT_GUJARATI`: `UScriptCode` = 15;
public const val `USCRIPT_GUNJALA_GONDI`: `UScriptCode` = 179;
public const val `USCRIPT_GURMUKHI`: `UScriptCode` = 16;
public const val `USCRIPT_HAN`: `UScriptCode` = 17;
public const val `USCRIPT_HANGUL`: `UScriptCode` = 18;
public const val `USCRIPT_HANIFI_ROHINGYA`: `UScriptCode` = 182;
public const val `USCRIPT_HANUNOO`: `UScriptCode` = 43;
public const val `USCRIPT_HAN_WITH_BOPOMOFO`: `UScriptCode` = 172;
public const val `USCRIPT_HARAPPAN_INDUS`: `UScriptCode` = 77;
public const val `USCRIPT_HATRAN`: `UScriptCode` = 162;
public const val `USCRIPT_HEBREW`: `UScriptCode` = 19;
public const val `USCRIPT_HIERATIC_EGYPTIAN`: `UScriptCode` = 70;
public const val `USCRIPT_HIRAGANA`: `UScriptCode` = 20;
public const val `USCRIPT_IMPERIAL_ARAMAIC`: `UScriptCode` = 116;
public const val `USCRIPT_INHERITED`: `UScriptCode` = 1;
public const val `USCRIPT_INSCRIPTIONAL_PAHLAVI`: `UScriptCode` = 122;
public const val `USCRIPT_INSCRIPTIONAL_PARTHIAN`: `UScriptCode` = 125;
public const val `USCRIPT_INVALID_CODE`: `UScriptCode` = -1;
public const val `USCRIPT_JAMO`: `UScriptCode` = 173;
public const val `USCRIPT_JAPANESE`: `UScriptCode` = 105;
public const val `USCRIPT_JAVANESE`: `UScriptCode` = 78;
public const val `USCRIPT_JURCHEN`: `UScriptCode` = 148;
public const val `USCRIPT_KAITHI`: `UScriptCode` = 120;
public const val `USCRIPT_KANNADA`: `UScriptCode` = 21;
public const val `USCRIPT_KATAKANA`: `UScriptCode` = 22;
public const val `USCRIPT_KATAKANA_OR_HIRAGANA`: `UScriptCode` = 54;
public const val `USCRIPT_KAYAH_LI`: `UScriptCode` = 79;
public const val `USCRIPT_KHAROSHTHI`: `UScriptCode` = 57;
public const val `USCRIPT_KHITAN_SMALL_SCRIPT`: `UScriptCode` = 191;
public const val `USCRIPT_KHMER`: `UScriptCode` = 23;
public const val `USCRIPT_KHOJKI`: `UScriptCode` = 157;
public const val `USCRIPT_KHUDAWADI`: `UScriptCode` = 145;
public const val `USCRIPT_KHUTSURI`: `UScriptCode` = 72;
public const val `USCRIPT_KOREAN`: `UScriptCode` = 119;
public const val `USCRIPT_KPELLE`: `UScriptCode` = 138;
public const val `USCRIPT_LANNA`: `UScriptCode` = 106;
public const val `USCRIPT_LAO`: `UScriptCode` = 24;
public const val `USCRIPT_LATIN`: `UScriptCode` = 25;
public const val `USCRIPT_LATIN_FRAKTUR`: `UScriptCode` = 80;
public const val `USCRIPT_LATIN_GAELIC`: `UScriptCode` = 81;
public const val `USCRIPT_LEPCHA`: `UScriptCode` = 82;
public const val `USCRIPT_LIMBU`: `UScriptCode` = 48;
public const val `USCRIPT_LINEAR_A`: `UScriptCode` = 83;
public const val `USCRIPT_LINEAR_B`: `UScriptCode` = 49;
public const val `USCRIPT_LISU`: `UScriptCode` = 131;
public const val `USCRIPT_LOMA`: `UScriptCode` = 139;
public const val `USCRIPT_LYCIAN`: `UScriptCode` = 107;
public const val `USCRIPT_LYDIAN`: `UScriptCode` = 108;
public const val `USCRIPT_MAHAJANI`: `UScriptCode` = 160;
public const val `USCRIPT_MAKASAR`: `UScriptCode` = 180;
public const val `USCRIPT_MALAYALAM`: `UScriptCode` = 26;
public const val `USCRIPT_MANDAEAN`: `UScriptCode` = 84;
public const val `USCRIPT_MANDAIC`: `UScriptCode` = 84;
public const val `USCRIPT_MANICHAEAN`: `UScriptCode` = 121;
public const val `USCRIPT_MARCHEN`: `UScriptCode` = 169;
public const val `USCRIPT_MASARAM_GONDI`: `UScriptCode` = 175;
public const val `USCRIPT_MATHEMATICAL_NOTATION`: `UScriptCode` = 128;
public const val `USCRIPT_MAYAN_HIEROGLYPHS`: `UScriptCode` = 85;
public const val `USCRIPT_MEDEFAIDRIN`: `UScriptCode` = 181;
public const val `USCRIPT_MEITEI_MAYEK`: `UScriptCode` = 115;
public const val `USCRIPT_MENDE`: `UScriptCode` = 140;
public const val `USCRIPT_MEROITIC`: `UScriptCode` = 86;
public const val `USCRIPT_MEROITIC_CURSIVE`: `UScriptCode` = 141;
public const val `USCRIPT_MEROITIC_HIEROGLYPHS`: `UScriptCode` = 86;
public const val `USCRIPT_MIAO`: `UScriptCode` = 92;
public const val `USCRIPT_MODI`: `UScriptCode` = 163;
public const val `USCRIPT_MONGOLIAN`: `UScriptCode` = 27;
public const val `USCRIPT_MOON`: `UScriptCode` = 114;
public const val `USCRIPT_MRO`: `UScriptCode` = 149;
public const val `USCRIPT_MULTANI`: `UScriptCode` = 164;
public const val `USCRIPT_MYANMAR`: `UScriptCode` = 28;
public const val `USCRIPT_NABATAEAN`: `UScriptCode` = 143;
public const val `USCRIPT_NAKHI_GEBA`: `UScriptCode` = 132;
public const val `USCRIPT_NANDINAGARI`: `UScriptCode` = 187;
public const val `USCRIPT_NEWA`: `UScriptCode` = 170;
public const val `USCRIPT_NEW_TAI_LUE`: `UScriptCode` = 59;
public const val `USCRIPT_NKO`: `UScriptCode` = 87;
public const val `USCRIPT_NUSHU`: `UScriptCode` = 150;
public const val `USCRIPT_NYIAKENG_PUACHUE_HMONG`: `UScriptCode` = 186;
public const val `USCRIPT_OGHAM`: `UScriptCode` = 29;
public const val `USCRIPT_OLD_CHURCH_SLAVONIC_CYRILLIC`: `UScriptCode` = 68;
public const val `USCRIPT_OLD_HUNGARIAN`: `UScriptCode` = 76;
public const val `USCRIPT_OLD_ITALIC`: `UScriptCode` = 30;
public const val `USCRIPT_OLD_NORTH_ARABIAN`: `UScriptCode` = 142;
public const val `USCRIPT_OLD_PERMIC`: `UScriptCode` = 89;
public const val `USCRIPT_OLD_PERSIAN`: `UScriptCode` = 61;
public const val `USCRIPT_OLD_SOGDIAN`: `UScriptCode` = 184;
public const val `USCRIPT_OLD_SOUTH_ARABIAN`: `UScriptCode` = 133;
public const val `USCRIPT_OL_CHIKI`: `UScriptCode` = 109;
public const val `USCRIPT_ORIYA`: `UScriptCode` = 31;
public const val `USCRIPT_ORKHON`: `UScriptCode` = 88;
public const val `USCRIPT_OSAGE`: `UScriptCode` = 171;
public const val `USCRIPT_OSMANYA`: `UScriptCode` = 50;
public const val `USCRIPT_PAHAWH_HMONG`: `UScriptCode` = 75;
public const val `USCRIPT_PALMYRENE`: `UScriptCode` = 144;
public const val `USCRIPT_PAU_CIN_HAU`: `UScriptCode` = 165;
public const val `USCRIPT_PHAGS_PA`: `UScriptCode` = 90;
public const val `USCRIPT_PHOENICIAN`: `UScriptCode` = 91;
public const val `USCRIPT_PHONETIC_POLLARD`: `UScriptCode` = 92;
public const val `USCRIPT_PSALTER_PAHLAVI`: `UScriptCode` = 123;
public const val `USCRIPT_REJANG`: `UScriptCode` = 110;
public const val `USCRIPT_RONGORONGO`: `UScriptCode` = 93;
public const val `USCRIPT_RUNIC`: `UScriptCode` = 32;
public const val `USCRIPT_SAMARITAN`: `UScriptCode` = 126;
public const val `USCRIPT_SARATI`: `UScriptCode` = 94;
public const val `USCRIPT_SAURASHTRA`: `UScriptCode` = 111;
public const val `USCRIPT_SHARADA`: `UScriptCode` = 151;
public const val `USCRIPT_SHAVIAN`: `UScriptCode` = 51;
public const val `USCRIPT_SIDDHAM`: `UScriptCode` = 166;
public const val `USCRIPT_SIGN_WRITING`: `UScriptCode` = 112;
public const val `USCRIPT_SIMPLIFIED_HAN`: `UScriptCode` = 73;
public const val `USCRIPT_SINDHI`: `UScriptCode` = 145;
public const val `USCRIPT_SINHALA`: `UScriptCode` = 33;
public const val `USCRIPT_SOGDIAN`: `UScriptCode` = 183;
public const val `USCRIPT_SORA_SOMPENG`: `UScriptCode` = 152;
public const val `USCRIPT_SOYOMBO`: `UScriptCode` = 176;
public const val `USCRIPT_SUNDANESE`: `UScriptCode` = 113;
public const val `USCRIPT_SYLOTI_NAGRI`: `UScriptCode` = 58;
public const val `USCRIPT_SYMBOLS`: `UScriptCode` = 129;
public const val `USCRIPT_SYMBOLS_EMOJI`: `UScriptCode` = 174;
public const val `USCRIPT_SYRIAC`: `UScriptCode` = 34;
public const val `USCRIPT_TAGALOG`: `UScriptCode` = 42;
public const val `USCRIPT_TAGBANWA`: `UScriptCode` = 45;
public const val `USCRIPT_TAI_LE`: `UScriptCode` = 52;
public const val `USCRIPT_TAI_VIET`: `UScriptCode` = 127;
public const val `USCRIPT_TAKRI`: `UScriptCode` = 153;
public const val `USCRIPT_TAMIL`: `UScriptCode` = 35;
public const val `USCRIPT_TANGUT`: `UScriptCode` = 154;
public const val `USCRIPT_TELUGU`: `UScriptCode` = 36;
public const val `USCRIPT_TENGWAR`: `UScriptCode` = 98;
public const val `USCRIPT_THAANA`: `UScriptCode` = 37;
public const val `USCRIPT_THAI`: `UScriptCode` = 38;
public const val `USCRIPT_TIBETAN`: `UScriptCode` = 39;
public const val `USCRIPT_TIFINAGH`: `UScriptCode` = 60;
public const val `USCRIPT_TIRHUTA`: `UScriptCode` = 158;
public const val `USCRIPT_TRADITIONAL_HAN`: `UScriptCode` = 74;
public const val `USCRIPT_UCAS`: `UScriptCode` = 40;
public const val `USCRIPT_UGARITIC`: `UScriptCode` = 53;
public const val `USCRIPT_UNKNOWN`: `UScriptCode` = 103;
public const val `USCRIPT_UNWRITTEN_LANGUAGES`: `UScriptCode` = 102;
public const val `USCRIPT_USAGE_ASPIRATIONAL`: `UScriptUsage` = 4;
public const val `USCRIPT_USAGE_EXCLUDED`: `UScriptUsage` = 2;
public const val `USCRIPT_USAGE_LIMITED_USE`: `UScriptUsage` = 3;
public const val `USCRIPT_USAGE_NOT_ENCODED`: `UScriptUsage` = 0;
public const val `USCRIPT_USAGE_RECOMMENDED`: `UScriptUsage` = 5;
public const val `USCRIPT_USAGE_UNKNOWN`: `UScriptUsage` = 1;
public const val `USCRIPT_VAI`: `UScriptCode` = 99;
public const val `USCRIPT_VISIBLE_SPEECH`: `UScriptCode` = 100;
public const val `USCRIPT_WANCHO`: `UScriptCode` = 188;
public const val `USCRIPT_WARANG_CITI`: `UScriptCode` = 146;
public const val `USCRIPT_WESTERN_SYRIAC`: `UScriptCode` = 96;
public const val `USCRIPT_WOLEAI`: `UScriptCode` = 155;
public const val `USCRIPT_YEZIDI`: `UScriptCode` = 192;
public const val `USCRIPT_YI`: `UScriptCode` = 41;
public const val `USCRIPT_ZANABAZAR_SQUARE`: `UScriptCode` = 177;
public const val `USEARCH_ANY_BASE_WEIGHT_IS_WILDCARD`: `USearchAttributeValue` = 4;
public const val `USEARCH_DEFAULT`: `USearchAttributeValue` = -1;
public const val `USEARCH_DONE`: Int = -1;
public const val `USEARCH_ELEMENT_COMPARISON`: `USearchAttribute` = 2;
public const val `USEARCH_OFF`: `USearchAttributeValue` = 0;
public const val `USEARCH_ON`: `USearchAttributeValue` = 1;
public const val `USEARCH_OVERLAP`: `USearchAttribute` = 0;
public const val `USEARCH_PATTERN_BASE_WEIGHT_IS_WILDCARD`: `USearchAttributeValue` = 3;
public const val `USEARCH_STANDARD_ELEMENT_COMPARISON`: `USearchAttributeValue` = 2;
public const val `USET_ADD_CASE_MAPPINGS`: Int = 4;
public const val `USET_CASE_INSENSITIVE`: Int = 2;
public const val `USET_IGNORE_SPACE`: Int = 1;
public const val `USET_SERIALIZED_STATIC_ARRAY_CAPACITY`: Int = 8;
public const val `USET_SPAN_CONTAINED`: `USetSpanCondition` = 1;
public const val `USET_SPAN_NOT_CONTAINED`: `USetSpanCondition` = 0;
public const val `USET_SPAN_SIMPLE`: `USetSpanCondition` = 2;
public const val `USPOOF_ALL_CHECKS`: `USpoofChecks` = 65535;
public const val `USPOOF_ASCII`: `URestrictionLevel` = 268435456;
public const val `USPOOF_AUX_INFO`: `USpoofChecks` = 1073741824;
public const val `USPOOF_CHAR_LIMIT`: `USpoofChecks` = 64;
public const val `USPOOF_CONFUSABLE`: `USpoofChecks` = 7;
public const val `USPOOF_HIDDEN_OVERLAY`: `USpoofChecks` = 256;
public const val `USPOOF_HIGHLY_RESTRICTIVE`: `URestrictionLevel` = 805306368;
public const val `USPOOF_INVISIBLE`: `USpoofChecks` = 32;
public const val `USPOOF_MINIMALLY_RESTRICTIVE`: `URestrictionLevel` = 1342177280;
public const val `USPOOF_MIXED_NUMBERS`: `USpoofChecks` = 128;
public const val `USPOOF_MIXED_SCRIPT_CONFUSABLE`: `USpoofChecks` = 2;
public const val `USPOOF_MODERATELY_RESTRICTIVE`: `URestrictionLevel` = 1073741824;
public const val `USPOOF_RESTRICTION_LEVEL`: `USpoofChecks` = 16;
public const val `USPOOF_RESTRICTION_LEVEL_MASK`: `URestrictionLevel` = 2130706432;
public const val `USPOOF_SINGLE_SCRIPT_CONFUSABLE`: `USpoofChecks` = 1;
public const val `USPOOF_SINGLE_SCRIPT_RESTRICTIVE`: `URestrictionLevel` = 536870912;
public const val `USPOOF_UNRESTRICTIVE`: `URestrictionLevel` = 1610612736;
public const val `USPOOF_WHOLE_SCRIPT_CONFUSABLE`: `USpoofChecks` = 4;
public const val `USPREP_ALLOW_UNASSIGNED`: UInt = 1u;
public const val `USPREP_DEFAULT`: UInt = 0u;
public const val `USPREP_RFC3491_NAMEPREP`: `UStringPrepProfileType` = 0;
public const val `USPREP_RFC3530_NFS4_CIS_PREP`: `UStringPrepProfileType` = 3;
public const val `USPREP_RFC3530_NFS4_CS_PREP`: `UStringPrepProfileType` = 1;
public const val `USPREP_RFC3530_NFS4_CS_PREP_CI`: `UStringPrepProfileType` = 2;
public const val `USPREP_RFC3530_NFS4_MIXED_PREP_PREFIX`: `UStringPrepProfileType` = 4;
public const val `USPREP_RFC3530_NFS4_MIXED_PREP_SUFFIX`: `UStringPrepProfileType` = 5;
public const val `USPREP_RFC3722_ISCSI`: `UStringPrepProfileType` = 6;
public const val `USPREP_RFC3920_NODEPREP`: `UStringPrepProfileType` = 7;
public const val `USPREP_RFC3920_RESOURCEPREP`: `UStringPrepProfileType` = 8;
public const val `USPREP_RFC4011_MIB`: `UStringPrepProfileType` = 9;
public const val `USPREP_RFC4013_SASLPREP`: `UStringPrepProfileType` = 10;
public const val `USPREP_RFC4505_TRACE`: `UStringPrepProfileType` = 11;
public const val `USPREP_RFC4518_LDAP`: `UStringPrepProfileType` = 12;
public const val `USPREP_RFC4518_LDAP_CI`: `UStringPrepProfileType` = 13;
public const val `USP_E_SCRIPT_NOT_IN_FONT`: Int = -2147220992;
public const val `USTRINGTRIE_BUILD_FAST`: `UStringTrieBuildOption` = 0;
public const val `USTRINGTRIE_BUILD_SMALL`: `UStringTrieBuildOption` = 1;
public const val `USTRINGTRIE_FINAL_VALUE`: `UStringTrieResult` = 2;
public const val `USTRINGTRIE_INTERMEDIATE_VALUE`: `UStringTrieResult` = 3;
public const val `USTRINGTRIE_NO_MATCH`: `UStringTrieResult` = 0;
public const val `USTRINGTRIE_NO_VALUE`: `UStringTrieResult` = 1;
public typealias `UScriptCode` = Int;
public typealias `UScriptUsage` = Int;
public typealias `USearch` = Long;
public typealias `USearchAttribute` = Int;
public typealias `USearchAttributeValue` = Int;
public typealias `USentenceBreak` = Int;
public typealias `USentenceBreakTag` = Int;
// UNSUPPORTED Rust 4363:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USerializedSet {
//     pub array: *const u16,
//     pub bmpLength: i32,
//     pub length: i32,
//     pub staticArray: [u16; 8],
// }

// UNSUPPORTED Rust 4371:1: declaration Impl has no candidate rule
// impl Default for USerializedSet {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USet` = Long;
public typealias `USetSpanCondition` = Int;
public typealias `USpoofCheckResult` = Long;
public typealias `USpoofChecker` = Long;
public typealias `USpoofChecks` = Int;
// UNSUPPORTED Rust 4381:1: generic scalar type unsupported
// pub type UStringCaseMapper = Option<unsafe extern "system" fn(csm: *const UCaseMap, dest: *mut u16, destcapacity: i32, src: *const u16, srclength: i32, perrorcode: *mut UErrorCode) -> i32>;

public typealias `UStringPrepProfile` = Long;
public typealias `UStringPrepProfileType` = Int;
public typealias `UStringSearch` = Long;
public typealias `UStringTrieBuildOption` = Int;
public typealias `UStringTrieResult` = Int;
public typealias `USystemTimeZoneType` = Int;
public const val `UTEXT_MAGIC`: Int = 878368812;
public const val `UTEXT_PROVIDER_HAS_META_DATA`: Int = 4;
public const val `UTEXT_PROVIDER_LENGTH_IS_EXPENSIVE`: Int = 1;
public const val `UTEXT_PROVIDER_OWNS_TEXT`: Int = 5;
public const val `UTEXT_PROVIDER_STABLE_CHUNKS`: Int = 2;
public const val `UTEXT_PROVIDER_WRITABLE`: Int = 3;
public const val `UTF16_MAX_CHAR_LENGTH`: UInt = 2u;
public const val `UTF32_MAX_CHAR_LENGTH`: UInt = 1u;
public const val `UTF8_ERROR_VALUE_1`: UInt = 21u;
public const val `UTF8_ERROR_VALUE_2`: UInt = 159u;
public const val `UTF8_MAX_CHAR_LENGTH`: UInt = 4u;
public const val `UTF_ERROR_VALUE`: UInt = 65535u;
public const val `UTF_MAX_CHAR_LENGTH`: UInt = 2u;
public const val `UTF_SIZE`: UInt = 16u;
public const val `UTRACE_COLLATION_START`: `UTraceFunctionNumber` = 8192;
public const val `UTRACE_CONVERSION_START`: `UTraceFunctionNumber` = 4096;
public const val `UTRACE_ERROR`: `UTraceLevel` = 0;
public const val `UTRACE_FUNCTION_START`: `UTraceFunctionNumber` = 0;
public const val `UTRACE_INFO`: `UTraceLevel` = 7;
public const val `UTRACE_OFF`: `UTraceLevel` = -1;
public const val `UTRACE_OPEN_CLOSE`: `UTraceLevel` = 5;
public const val `UTRACE_UCNV_CLONE`: `UTraceFunctionNumber` = 4099;
public const val `UTRACE_UCNV_CLOSE`: `UTraceFunctionNumber` = 4100;
public const val `UTRACE_UCNV_FLUSH_CACHE`: `UTraceFunctionNumber` = 4101;
public const val `UTRACE_UCNV_LOAD`: `UTraceFunctionNumber` = 4102;
public const val `UTRACE_UCNV_OPEN`: `UTraceFunctionNumber` = 4096;
public const val `UTRACE_UCNV_OPEN_ALGORITHMIC`: `UTraceFunctionNumber` = 4098;
public const val `UTRACE_UCNV_OPEN_PACKAGE`: `UTraceFunctionNumber` = 4097;
public const val `UTRACE_UCNV_UNLOAD`: `UTraceFunctionNumber` = 4103;
public const val `UTRACE_UCOL_CLOSE`: `UTraceFunctionNumber` = 8193;
public const val `UTRACE_UCOL_GETLOCALE`: `UTraceFunctionNumber` = 8196;
public const val `UTRACE_UCOL_GET_SORTKEY`: `UTraceFunctionNumber` = 8195;
public const val `UTRACE_UCOL_NEXTSORTKEYPART`: `UTraceFunctionNumber` = 8197;
public const val `UTRACE_UCOL_OPEN`: `UTraceFunctionNumber` = 8192;
public const val `UTRACE_UCOL_OPEN_FROM_SHORT_STRING`: `UTraceFunctionNumber` = 8199;
public const val `UTRACE_UCOL_STRCOLL`: `UTraceFunctionNumber` = 8194;
public const val `UTRACE_UCOL_STRCOLLITER`: `UTraceFunctionNumber` = 8198;
public const val `UTRACE_UCOL_STRCOLLUTF8`: `UTraceFunctionNumber` = 8200;
public const val `UTRACE_UDATA_BUNDLE`: `UTraceFunctionNumber` = 12289;
public const val `UTRACE_UDATA_DATA_FILE`: `UTraceFunctionNumber` = 12290;
public const val `UTRACE_UDATA_RESOURCE`: `UTraceFunctionNumber` = 12288;
public const val `UTRACE_UDATA_RES_FILE`: `UTraceFunctionNumber` = 12291;
public const val `UTRACE_UDATA_START`: `UTraceFunctionNumber` = 12288;
public const val `UTRACE_U_CLEANUP`: `UTraceFunctionNumber` = 1;
public const val `UTRACE_U_INIT`: `UTraceFunctionNumber` = 0;
public const val `UTRACE_VERBOSE`: `UTraceLevel` = 9;
public const val `UTRACE_WARNING`: `UTraceLevel` = 3;
public const val `UTRANS_FORWARD`: `UTransDirection` = 0;
public const val `UTRANS_REVERSE`: `UTransDirection` = 1;
public const val `UTSV_EPOCH_OFFSET_VALUE`: `UTimeScaleValue` = 1;
public const val `UTSV_FROM_MAX_VALUE`: `UTimeScaleValue` = 3;
public const val `UTSV_FROM_MIN_VALUE`: `UTimeScaleValue` = 2;
public const val `UTSV_TO_MAX_VALUE`: `UTimeScaleValue` = 5;
public const val `UTSV_TO_MIN_VALUE`: `UTimeScaleValue` = 4;
public const val `UTSV_UNITS_VALUE`: `UTimeScaleValue` = 0;
public const val `UTZFMT_PARSE_OPTION_ALL_STYLES`: `UTimeZoneFormatParseOption` = 1;
public const val `UTZFMT_PARSE_OPTION_NONE`: `UTimeZoneFormatParseOption` = 0;
public const val `UTZFMT_PARSE_OPTION_TZ_DATABASE_ABBREVIATIONS`: `UTimeZoneFormatParseOption` = 2;
public const val `UTZFMT_PAT_COUNT`: `UTimeZoneFormatGMTOffsetPatternType` = 6;
public const val `UTZFMT_PAT_NEGATIVE_H`: `UTimeZoneFormatGMTOffsetPatternType` = 5;
public const val `UTZFMT_PAT_NEGATIVE_HM`: `UTimeZoneFormatGMTOffsetPatternType` = 2;
public const val `UTZFMT_PAT_NEGATIVE_HMS`: `UTimeZoneFormatGMTOffsetPatternType` = 3;
public const val `UTZFMT_PAT_POSITIVE_H`: `UTimeZoneFormatGMTOffsetPatternType` = 4;
public const val `UTZFMT_PAT_POSITIVE_HM`: `UTimeZoneFormatGMTOffsetPatternType` = 0;
public const val `UTZFMT_PAT_POSITIVE_HMS`: `UTimeZoneFormatGMTOffsetPatternType` = 1;
public const val `UTZFMT_STYLE_EXEMPLAR_LOCATION`: `UTimeZoneFormatStyle` = 19;
public const val `UTZFMT_STYLE_GENERIC_LOCATION`: `UTimeZoneFormatStyle` = 0;
public const val `UTZFMT_STYLE_GENERIC_LONG`: `UTimeZoneFormatStyle` = 1;
public const val `UTZFMT_STYLE_GENERIC_SHORT`: `UTimeZoneFormatStyle` = 2;
public const val `UTZFMT_STYLE_ISO_BASIC_FIXED`: `UTimeZoneFormatStyle` = 9;
public const val `UTZFMT_STYLE_ISO_BASIC_FULL`: `UTimeZoneFormatStyle` = 11;
public const val `UTZFMT_STYLE_ISO_BASIC_LOCAL_FIXED`: `UTimeZoneFormatStyle` = 10;
public const val `UTZFMT_STYLE_ISO_BASIC_LOCAL_FULL`: `UTimeZoneFormatStyle` = 12;
public const val `UTZFMT_STYLE_ISO_BASIC_LOCAL_SHORT`: `UTimeZoneFormatStyle` = 8;
public const val `UTZFMT_STYLE_ISO_BASIC_SHORT`: `UTimeZoneFormatStyle` = 7;
public const val `UTZFMT_STYLE_ISO_EXTENDED_FIXED`: `UTimeZoneFormatStyle` = 13;
public const val `UTZFMT_STYLE_ISO_EXTENDED_FULL`: `UTimeZoneFormatStyle` = 15;
public const val `UTZFMT_STYLE_ISO_EXTENDED_LOCAL_FIXED`: `UTimeZoneFormatStyle` = 14;
public const val `UTZFMT_STYLE_ISO_EXTENDED_LOCAL_FULL`: `UTimeZoneFormatStyle` = 16;
public const val `UTZFMT_STYLE_LOCALIZED_GMT`: `UTimeZoneFormatStyle` = 5;
public const val `UTZFMT_STYLE_LOCALIZED_GMT_SHORT`: `UTimeZoneFormatStyle` = 6;
public const val `UTZFMT_STYLE_SPECIFIC_LONG`: `UTimeZoneFormatStyle` = 3;
public const val `UTZFMT_STYLE_SPECIFIC_SHORT`: `UTimeZoneFormatStyle` = 4;
public const val `UTZFMT_STYLE_ZONE_ID`: `UTimeZoneFormatStyle` = 17;
public const val `UTZFMT_STYLE_ZONE_ID_SHORT`: `UTimeZoneFormatStyle` = 18;
public const val `UTZFMT_TIME_TYPE_DAYLIGHT`: `UTimeZoneFormatTimeType` = 2;
public const val `UTZFMT_TIME_TYPE_STANDARD`: `UTimeZoneFormatTimeType` = 1;
public const val `UTZFMT_TIME_TYPE_UNKNOWN`: `UTimeZoneFormatTimeType` = 0;
public const val `UTZNM_EXEMPLAR_LOCATION`: `UTimeZoneNameType` = 64;
public const val `UTZNM_LONG_DAYLIGHT`: `UTimeZoneNameType` = 4;
public const val `UTZNM_LONG_GENERIC`: `UTimeZoneNameType` = 1;
public const val `UTZNM_LONG_STANDARD`: `UTimeZoneNameType` = 2;
public const val `UTZNM_SHORT_DAYLIGHT`: `UTimeZoneNameType` = 32;
public const val `UTZNM_SHORT_GENERIC`: `UTimeZoneNameType` = 8;
public const val `UTZNM_SHORT_STANDARD`: `UTimeZoneNameType` = 16;
public const val `UTZNM_UNKNOWN`: `UTimeZoneNameType` = 0;
// UNSUPPORTED Rust 4484:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UText {
//     pub magic: u32,
//     pub flags: i32,
//     pub providerProperties: i32,
//     pub sizeOfStruct: i32,
//     pub chunkNativeLimit: i64,
//     pub extraSize: i32,
//     pub nativeIndexingLimit: i32,
//     pub chunkNativeStart: i64,
//     pub chunkOffset: i32,
//     pub chunkLength: i32,
//     pub chunkContents: *const u16,
//     pub pFuncs: *const UTextFuncs,
//     pub pExtra: *mut core::ffi::c_void,
//     pub context: *const core::ffi::c_void,
//     pub p: *const core::ffi::c_void,
//     pub q: *const core::ffi::c_void,
//     pub r: *const core::ffi::c_void,
//     pub privP: *mut core::ffi::c_void,
//     pub a: i64,
//     pub b: i32,
//     pub c: i32,
//     pub privA: i64,
//     pub privB: i32,
//     pub privC: i32,
// }

// UNSUPPORTED Rust 4512:1: declaration Impl has no candidate rule
// impl Default for UText {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4517:1: generic scalar type unsupported
// pub type UTextAccess = Option<unsafe extern "system" fn(ut: *mut UText, nativeindex: i64, forward: i8) -> i8>;

// UNSUPPORTED Rust 4518:1: generic scalar type unsupported
// pub type UTextClone = Option<unsafe extern "system" fn(dest: *mut UText, src: *const UText, deep: i8, status: *mut UErrorCode) -> *mut UText>;

// UNSUPPORTED Rust 4519:1: generic scalar type unsupported
// pub type UTextClose = Option<unsafe extern "system" fn(ut: *mut UText)>;

// UNSUPPORTED Rust 4520:1: generic scalar type unsupported
// pub type UTextCopy = Option<unsafe extern "system" fn(ut: *mut UText, nativestart: i64, nativelimit: i64, nativedest: i64, r#move: i8, status: *mut UErrorCode)>;

// UNSUPPORTED Rust 4521:1: generic scalar type unsupported
// pub type UTextExtract = Option<unsafe extern "system" fn(ut: *mut UText, nativestart: i64, nativelimit: i64, dest: *mut u16, destcapacity: i32, status: *mut UErrorCode) -> i32>;

// UNSUPPORTED Rust 4522:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UTextFuncs {
//     pub tableSize: i32,
//     pub reserved1: i32,
//     pub reserved2: i32,
//     pub reserved3: i32,
//     pub clone: UTextClone,
//     pub nativeLength: UTextNativeLength,
//     pub access: UTextAccess,
//     pub extract: UTextExtract,
//     pub replace: UTextReplace,
//     pub copy: UTextCopy,
//     pub mapOffsetToNative: UTextMapOffsetToNative,
//     pub mapNativeIndexToUTF16: UTextMapNativeIndexToUTF16,
//     pub close: UTextClose,
//     pub spare1: UTextClose,
//     pub spare2: UTextClose,
//     pub spare3: UTextClose,
// }

// UNSUPPORTED Rust 4542:1: generic scalar type unsupported
// pub type UTextMapNativeIndexToUTF16 = Option<unsafe extern "system" fn(ut: *const UText, nativeindex: i64) -> i32>;

// UNSUPPORTED Rust 4543:1: generic scalar type unsupported
// pub type UTextMapOffsetToNative = Option<unsafe extern "system" fn(ut: *const UText) -> i64>;

// UNSUPPORTED Rust 4544:1: generic scalar type unsupported
// pub type UTextNativeLength = Option<unsafe extern "system" fn(ut: *mut UText) -> i64>;

// UNSUPPORTED Rust 4545:1: generic scalar type unsupported
// pub type UTextReplace = Option<unsafe extern "system" fn(ut: *mut UText, nativestart: i64, nativelimit: i64, replacementtext: *const u16, replacmentlength: i32, status: *mut UErrorCode) -> i32>;

public typealias `UTimeScaleValue` = Int;
public typealias `UTimeZoneFormatGMTOffsetPatternType` = Int;
public typealias `UTimeZoneFormatParseOption` = Int;
public typealias `UTimeZoneFormatStyle` = Int;
public typealias `UTimeZoneFormatTimeType` = Int;
public typealias `UTimeZoneNameType` = Int;
public typealias `UTimeZoneTransitionType` = Int;
// UNSUPPORTED Rust 4553:1: generic scalar type unsupported
// pub type UTraceData = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, fnnumber: i32, level: i32, fmt: windows_sys::core::PCSTR, args: *mut i8)>;

// UNSUPPORTED Rust 4554:1: generic scalar type unsupported
// pub type UTraceEntry = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, fnnumber: i32)>;

// UNSUPPORTED Rust 4555:1: generic scalar type unsupported
// pub type UTraceExit = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, fnnumber: i32, fmt: windows_sys::core::PCSTR, args: *mut i8)>;

public typealias `UTraceFunctionNumber` = Int;
public typealias `UTraceLevel` = Int;
public typealias `UTransDirection` = Int;
// UNSUPPORTED Rust 4559:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UTransPosition {
//     pub contextStart: i32,
//     pub contextLimit: i32,
//     pub start: i32,
//     pub limit: i32,
// }

public typealias `UVerticalOrientation` = Int;
public typealias `UWordBreak` = Int;
public typealias `UWordBreakValues` = Int;
public const val `U_ALPHAINDEX_INFLOW`: `UAlphabeticIndexLabelType` = 2;
public const val `U_ALPHAINDEX_NORMAL`: `UAlphabeticIndexLabelType` = 0;
public const val `U_ALPHAINDEX_OVERFLOW`: `UAlphabeticIndexLabelType` = 3;
public const val `U_ALPHAINDEX_UNDERFLOW`: `UAlphabeticIndexLabelType` = 1;
public const val `U_AMBIGUOUS_ALIAS_WARNING`: `UErrorCode` = -122;
public const val `U_ARABIC_NUMBER`: `UCharDirection` = 5;
public const val `U_ARGUMENT_TYPE_MISMATCH`: `UErrorCode` = 65804;
public const val `U_ASCII_FAMILY`: UInt = 0u;
public const val `U_BAD_VARIABLE_DEFINITION`: `UErrorCode` = 65536;
public const val `U_BLOCK_SEPARATOR`: `UCharDirection` = 7;
public const val `U_BOUNDARY_NEUTRAL`: `UCharDirection` = 18;
public const val `U_BPT_CLOSE`: `UBidiPairedBracketType` = 2;
public const val `U_BPT_NONE`: `UBidiPairedBracketType` = 0;
public const val `U_BPT_OPEN`: `UBidiPairedBracketType` = 1;
public const val `U_BRK_ASSIGN_ERROR`: `UErrorCode` = 66053;
public const val `U_BRK_ERROR_START`: `UErrorCode` = 66048;
public const val `U_BRK_HEX_DIGITS_EXPECTED`: `UErrorCode` = 66049;
public const val `U_BRK_INIT_ERROR`: `UErrorCode` = 66058;
public const val `U_BRK_INTERNAL_ERROR`: `UErrorCode` = 66048;
public const val `U_BRK_MALFORMED_RULE_TAG`: `UErrorCode` = 66061;
public const val `U_BRK_MISMATCHED_PAREN`: `UErrorCode` = 66055;
public const val `U_BRK_NEW_LINE_IN_QUOTED_STRING`: `UErrorCode` = 66056;
public const val `U_BRK_RULE_EMPTY_SET`: `UErrorCode` = 66059;
public const val `U_BRK_RULE_SYNTAX`: `UErrorCode` = 66051;
public const val `U_BRK_SEMICOLON_EXPECTED`: `UErrorCode` = 66050;
public const val `U_BRK_UNCLOSED_SET`: `UErrorCode` = 66052;
public const val `U_BRK_UNDEFINED_VARIABLE`: `UErrorCode` = 66057;
public const val `U_BRK_UNRECOGNIZED_OPTION`: `UErrorCode` = 66060;
public const val `U_BRK_VARIABLE_REDFINITION`: `UErrorCode` = 66054;
public const val `U_BUFFER_OVERFLOW_ERROR`: `UErrorCode` = 15;
public const val `U_CE_NOT_FOUND_ERROR`: `UErrorCode` = 21;
public const val `U_CHAR16_IS_TYPEDEF`: UInt = 1u;
public const val `U_CHARSET_FAMILY`: UInt = 1u;
public const val `U_CHARSET_IS_UTF8`: UInt = 1u;
public const val `U_CHAR_CATEGORY_COUNT`: `UCharCategory` = 30;
public const val `U_CHAR_NAME_ALIAS`: `UCharNameChoice` = 3;
public const val `U_CHECK_DYLOAD`: UInt = 1u;
public const val `U_COLLATOR_VERSION_MISMATCH`: `UErrorCode` = 28;
public const val `U_COMBINED_IMPLEMENTATION`: UInt = 1u;
public const val `U_COMBINING_SPACING_MARK`: `UCharCategory` = 8;
public const val `U_COMMON_NUMBER_SEPARATOR`: `UCharDirection` = 6;
public const val `U_COMPARE_CODE_POINT_ORDER`: UInt = 32768u;
public const val `U_COMPARE_IGNORE_CASE`: UInt = 65536u;
public const val `U_CONNECTOR_PUNCTUATION`: `UCharCategory` = 22;
public const val `U_CONTROL_CHAR`: `UCharCategory` = 15;
public const val `U_COPYRIGHT_STRING_LENGTH`: UInt = 128u;
public const val `U_CPLUSPLUS_VERSION`: UInt = 0u;
public const val `U_CURRENCY_SYMBOL`: `UCharCategory` = 25;
public const val `U_DASH_PUNCTUATION`: `UCharCategory` = 19;
public const val `U_DEBUG`: UInt = 1u;
public const val `U_DECIMAL_DIGIT_NUMBER`: `UCharCategory` = 9;
public const val `U_DECIMAL_NUMBER_SYNTAX_ERROR`: `UErrorCode` = 65808;
public const val `U_DEFAULT_KEYWORD_MISSING`: `UErrorCode` = 65807;
public const val `U_DEFAULT_SHOW_DRAFT`: UInt = 0u;
public const val `U_DEFINE_FALSE_AND_TRUE`: UInt = 1u;
public const val `U_DIFFERENT_UCA_VERSION`: `UErrorCode` = -121;
public const val `U_DIR_NON_SPACING_MARK`: `UCharDirection` = 17;
public const val `U_DISABLE_RENAMING`: UInt = 1u;
public const val `U_DT_CANONICAL`: `UDecompositionType` = 1;
public const val `U_DT_CIRCLE`: `UDecompositionType` = 3;
public const val `U_DT_COMPAT`: `UDecompositionType` = 2;
public const val `U_DT_FINAL`: `UDecompositionType` = 4;
public const val `U_DT_FONT`: `UDecompositionType` = 5;
public const val `U_DT_FRACTION`: `UDecompositionType` = 6;
public const val `U_DT_INITIAL`: `UDecompositionType` = 7;
public const val `U_DT_ISOLATED`: `UDecompositionType` = 8;
public const val `U_DT_MEDIAL`: `UDecompositionType` = 9;
public const val `U_DT_NARROW`: `UDecompositionType` = 10;
public const val `U_DT_NOBREAK`: `UDecompositionType` = 11;
public const val `U_DT_NONE`: `UDecompositionType` = 0;
public const val `U_DT_SMALL`: `UDecompositionType` = 12;
public const val `U_DT_SQUARE`: `UDecompositionType` = 13;
public const val `U_DT_SUB`: `UDecompositionType` = 14;
public const val `U_DT_SUPER`: `UDecompositionType` = 15;
public const val `U_DT_VERTICAL`: `UDecompositionType` = 16;
public const val `U_DT_WIDE`: `UDecompositionType` = 17;
public const val `U_DUPLICATE_KEYWORD`: `UErrorCode` = 65805;
public const val `U_EA_AMBIGUOUS`: `UEastAsianWidth` = 1;
public const val `U_EA_FULLWIDTH`: `UEastAsianWidth` = 3;
public const val `U_EA_HALFWIDTH`: `UEastAsianWidth` = 2;
public const val `U_EA_NARROW`: `UEastAsianWidth` = 4;
public const val `U_EA_NEUTRAL`: `UEastAsianWidth` = 0;
public const val `U_EA_WIDE`: `UEastAsianWidth` = 5;
public const val `U_EBCDIC_FAMILY`: UInt = 1u;
public const val `U_EDITS_NO_RESET`: UInt = 8192u;
public const val `U_ENABLE_DYLOAD`: UInt = 1u;
public const val `U_ENABLE_TRACING`: UInt = 0u;
public const val `U_ENCLOSING_MARK`: `UCharCategory` = 7;
public const val `U_END_PUNCTUATION`: `UCharCategory` = 21;
public const val `U_ENUM_OUT_OF_SYNC_ERROR`: `UErrorCode` = 25;
public const val `U_ERROR_WARNING_START`: `UErrorCode` = -128;
public const val `U_EUROPEAN_NUMBER`: `UCharDirection` = 2;
public const val `U_EUROPEAN_NUMBER_SEPARATOR`: `UCharDirection` = 3;
public const val `U_EUROPEAN_NUMBER_TERMINATOR`: `UCharDirection` = 4;
public const val `U_EXTENDED_CHAR_NAME`: `UCharNameChoice` = 2;
public const val `U_FILE_ACCESS_ERROR`: `UErrorCode` = 4;
public const val `U_FINAL_PUNCTUATION`: `UCharCategory` = 29;
public const val `U_FIRST_STRONG_ISOLATE`: `UCharDirection` = 19;
public const val `U_FMT_PARSE_ERROR_START`: `UErrorCode` = 65792;
public const val `U_FOLD_CASE_DEFAULT`: UInt = 0u;
public const val `U_FOLD_CASE_EXCLUDE_SPECIAL_I`: UInt = 1u;
public const val `U_FORMAT_CHAR`: `UCharCategory` = 16;
public const val `U_FORMAT_INEXACT_ERROR`: `UErrorCode` = 65809;
public const val `U_GCB_CONTROL`: `UGraphemeClusterBreak` = 1;
public const val `U_GCB_CR`: `UGraphemeClusterBreak` = 2;
public const val `U_GCB_EXTEND`: `UGraphemeClusterBreak` = 3;
public const val `U_GCB_E_BASE`: `UGraphemeClusterBreak` = 13;
public const val `U_GCB_E_BASE_GAZ`: `UGraphemeClusterBreak` = 14;
public const val `U_GCB_E_MODIFIER`: `UGraphemeClusterBreak` = 15;
public const val `U_GCB_GLUE_AFTER_ZWJ`: `UGraphemeClusterBreak` = 16;
public const val `U_GCB_L`: `UGraphemeClusterBreak` = 4;
public const val `U_GCB_LF`: `UGraphemeClusterBreak` = 5;
public const val `U_GCB_LV`: `UGraphemeClusterBreak` = 6;
public const val `U_GCB_LVT`: `UGraphemeClusterBreak` = 7;
public const val `U_GCB_OTHER`: `UGraphemeClusterBreak` = 0;
public const val `U_GCB_PREPEND`: `UGraphemeClusterBreak` = 11;
public const val `U_GCB_REGIONAL_INDICATOR`: `UGraphemeClusterBreak` = 12;
public const val `U_GCB_SPACING_MARK`: `UGraphemeClusterBreak` = 10;
public const val `U_GCB_T`: `UGraphemeClusterBreak` = 8;
public const val `U_GCB_V`: `UGraphemeClusterBreak` = 9;
public const val `U_GCB_ZWJ`: `UGraphemeClusterBreak` = 17;
public const val `U_GCC_MAJOR_MINOR`: UInt = 0u;
public const val `U_GENERAL_OTHER_TYPES`: `UCharCategory` = 0;
public const val `U_HAVE_CHAR16_T`: UInt = 1u;
public const val `U_HAVE_DEBUG_LOCATION_NEW`: UInt = 1u;
public const val `U_HAVE_INTTYPES_H`: UInt = 1u;
public const val `U_HAVE_LIB_SUFFIX`: UInt = 1u;
public const val `U_HAVE_PLACEMENT_NEW`: UInt = 0u;
public const val `U_HAVE_RBNF`: UInt = 0u;
public const val `U_HAVE_RVALUE_REFERENCES`: UInt = 1u;
public const val `U_HAVE_STDINT_H`: UInt = 1u;
public const val `U_HAVE_STD_STRING`: UInt = 0u;
public const val `U_HAVE_WCHAR_H`: UInt = 0u;
public const val `U_HAVE_WCSCPY`: UInt = 0u;
public const val `U_HIDE_DEPRECATED_API`: UInt = 1u;
public const val `U_HIDE_DRAFT_API`: UInt = 1u;
public const val `U_HIDE_INTERNAL_API`: UInt = 1u;
public const val `U_HIDE_OBSOLETE_API`: UInt = 1u;
public const val `U_HIDE_OBSOLETE_UTF_OLD_H`: UInt = 0u;
public const val `U_HST_LEADING_JAMO`: `UHangulSyllableType` = 1;
public const val `U_HST_LVT_SYLLABLE`: `UHangulSyllableType` = 5;
public const val `U_HST_LV_SYLLABLE`: `UHangulSyllableType` = 4;
public const val `U_HST_NOT_APPLICABLE`: `UHangulSyllableType` = 0;
public const val `U_HST_TRAILING_JAMO`: `UHangulSyllableType` = 3;
public const val `U_HST_VOWEL_JAMO`: `UHangulSyllableType` = 2;
// UNSUPPORTED Rust 4715:1: non-scalar type Ptr unsupported
// pub const U_ICUDATA_TYPE_LETTER: windows_sys::core::PCSTR = windows_sys::core::s!("e");

// UNSUPPORTED Rust 4716:1: non-scalar type Ptr unsupported
// pub const U_ICU_DATA_KEY: windows_sys::core::PCSTR = windows_sys::core::s!("DataVersion");

// UNSUPPORTED Rust 4717:1: non-scalar type Ptr unsupported
// pub const U_ICU_VERSION_BUNDLE: windows_sys::core::PCSTR = windows_sys::core::s!("icuver");

public const val `U_IDNA_ACE_PREFIX_ERROR`: `UErrorCode` = 66564;
public const val `U_IDNA_CHECK_BIDI_ERROR`: `UErrorCode` = 66562;
public const val `U_IDNA_DOMAIN_NAME_TOO_LONG_ERROR`: `UErrorCode` = 66568;
public const val `U_IDNA_ERROR_START`: `UErrorCode` = 66560;
public const val `U_IDNA_LABEL_TOO_LONG_ERROR`: `UErrorCode` = 66566;
public const val `U_IDNA_PROHIBITED_ERROR`: `UErrorCode` = 66560;
public const val `U_IDNA_STD3_ASCII_RULES_ERROR`: `UErrorCode` = 66563;
public const val `U_IDNA_UNASSIGNED_ERROR`: `UErrorCode` = 66561;
public const val `U_IDNA_VERIFICATION_ERROR`: `UErrorCode` = 66565;
public const val `U_IDNA_ZERO_LENGTH_LABEL_ERROR`: `UErrorCode` = 66567;
public const val `U_ILLEGAL_ARGUMENT_ERROR`: `UErrorCode` = 1;
public const val `U_ILLEGAL_CHARACTER`: `UErrorCode` = 65567;
public const val `U_ILLEGAL_CHAR_FOUND`: `UErrorCode` = 12;
public const val `U_ILLEGAL_CHAR_IN_SEGMENT`: `UErrorCode` = 65564;
public const val `U_ILLEGAL_ESCAPE_SEQUENCE`: `UErrorCode` = 18;
public const val `U_ILLEGAL_PAD_POSITION`: `UErrorCode` = 65800;
public const val `U_INDEX_OUTOFBOUNDS_ERROR`: `UErrorCode` = 8;
public const val `U_INITIAL_PUNCTUATION`: `UCharCategory` = 28;
public const val `U_INPC_BOTTOM`: `UIndicPositionalCategory` = 1;
public const val `U_INPC_BOTTOM_AND_LEFT`: `UIndicPositionalCategory` = 2;
public const val `U_INPC_BOTTOM_AND_RIGHT`: `UIndicPositionalCategory` = 3;
public const val `U_INPC_LEFT`: `UIndicPositionalCategory` = 4;
public const val `U_INPC_LEFT_AND_RIGHT`: `UIndicPositionalCategory` = 5;
public const val `U_INPC_NA`: `UIndicPositionalCategory` = 0;
public const val `U_INPC_OVERSTRUCK`: `UIndicPositionalCategory` = 6;
public const val `U_INPC_RIGHT`: `UIndicPositionalCategory` = 7;
public const val `U_INPC_TOP`: `UIndicPositionalCategory` = 8;
public const val `U_INPC_TOP_AND_BOTTOM`: `UIndicPositionalCategory` = 9;
public const val `U_INPC_TOP_AND_BOTTOM_AND_LEFT`: `UIndicPositionalCategory` = 15;
public const val `U_INPC_TOP_AND_BOTTOM_AND_RIGHT`: `UIndicPositionalCategory` = 10;
public const val `U_INPC_TOP_AND_LEFT`: `UIndicPositionalCategory` = 11;
public const val `U_INPC_TOP_AND_LEFT_AND_RIGHT`: `UIndicPositionalCategory` = 12;
public const val `U_INPC_TOP_AND_RIGHT`: `UIndicPositionalCategory` = 13;
public const val `U_INPC_VISUAL_ORDER_LEFT`: `UIndicPositionalCategory` = 14;
public const val `U_INSC_AVAGRAHA`: `UIndicSyllabicCategory` = 1;
public const val `U_INSC_BINDU`: `UIndicSyllabicCategory` = 2;
public const val `U_INSC_BRAHMI_JOINING_NUMBER`: `UIndicSyllabicCategory` = 3;
public const val `U_INSC_CANTILLATION_MARK`: `UIndicSyllabicCategory` = 4;
public const val `U_INSC_CONSONANT`: `UIndicSyllabicCategory` = 5;
public const val `U_INSC_CONSONANT_DEAD`: `UIndicSyllabicCategory` = 6;
public const val `U_INSC_CONSONANT_FINAL`: `UIndicSyllabicCategory` = 7;
public const val `U_INSC_CONSONANT_HEAD_LETTER`: `UIndicSyllabicCategory` = 8;
public const val `U_INSC_CONSONANT_INITIAL_POSTFIXED`: `UIndicSyllabicCategory` = 9;
public const val `U_INSC_CONSONANT_KILLER`: `UIndicSyllabicCategory` = 10;
public const val `U_INSC_CONSONANT_MEDIAL`: `UIndicSyllabicCategory` = 11;
public const val `U_INSC_CONSONANT_PLACEHOLDER`: `UIndicSyllabicCategory` = 12;
public const val `U_INSC_CONSONANT_PRECEDING_REPHA`: `UIndicSyllabicCategory` = 13;
public const val `U_INSC_CONSONANT_PREFIXED`: `UIndicSyllabicCategory` = 14;
public const val `U_INSC_CONSONANT_SUBJOINED`: `UIndicSyllabicCategory` = 15;
public const val `U_INSC_CONSONANT_SUCCEEDING_REPHA`: `UIndicSyllabicCategory` = 16;
public const val `U_INSC_CONSONANT_WITH_STACKER`: `UIndicSyllabicCategory` = 17;
public const val `U_INSC_GEMINATION_MARK`: `UIndicSyllabicCategory` = 18;
public const val `U_INSC_INVISIBLE_STACKER`: `UIndicSyllabicCategory` = 19;
public const val `U_INSC_JOINER`: `UIndicSyllabicCategory` = 20;
public const val `U_INSC_MODIFYING_LETTER`: `UIndicSyllabicCategory` = 21;
public const val `U_INSC_NON_JOINER`: `UIndicSyllabicCategory` = 22;
public const val `U_INSC_NUKTA`: `UIndicSyllabicCategory` = 23;
public const val `U_INSC_NUMBER`: `UIndicSyllabicCategory` = 24;
public const val `U_INSC_NUMBER_JOINER`: `UIndicSyllabicCategory` = 25;
public const val `U_INSC_OTHER`: `UIndicSyllabicCategory` = 0;
public const val `U_INSC_PURE_KILLER`: `UIndicSyllabicCategory` = 26;
public const val `U_INSC_REGISTER_SHIFTER`: `UIndicSyllabicCategory` = 27;
public const val `U_INSC_SYLLABLE_MODIFIER`: `UIndicSyllabicCategory` = 28;
public const val `U_INSC_TONE_LETTER`: `UIndicSyllabicCategory` = 29;
public const val `U_INSC_TONE_MARK`: `UIndicSyllabicCategory` = 30;
public const val `U_INSC_VIRAMA`: `UIndicSyllabicCategory` = 31;
public const val `U_INSC_VISARGA`: `UIndicSyllabicCategory` = 32;
public const val `U_INSC_VOWEL`: `UIndicSyllabicCategory` = 33;
public const val `U_INSC_VOWEL_DEPENDENT`: `UIndicSyllabicCategory` = 34;
public const val `U_INSC_VOWEL_INDEPENDENT`: `UIndicSyllabicCategory` = 35;
public const val `U_INTERNAL_PROGRAM_ERROR`: `UErrorCode` = 5;
public const val `U_INTERNAL_TRANSLITERATOR_ERROR`: `UErrorCode` = 65568;
public const val `U_INVALID_CHAR_FOUND`: `UErrorCode` = 10;
public const val `U_INVALID_FORMAT_ERROR`: `UErrorCode` = 3;
public const val `U_INVALID_FUNCTION`: `UErrorCode` = 65570;
public const val `U_INVALID_ID`: `UErrorCode` = 65569;
public const val `U_INVALID_PROPERTY_PATTERN`: `UErrorCode` = 65561;
public const val `U_INVALID_RBT_SYNTAX`: `UErrorCode` = 65560;
public const val `U_INVALID_STATE_ERROR`: `UErrorCode` = 27;
public const val `U_INVALID_TABLE_FILE`: `UErrorCode` = 14;
public const val `U_INVALID_TABLE_FORMAT`: `UErrorCode` = 13;
public const val `U_INVARIANT_CONVERSION_ERROR`: `UErrorCode` = 26;
public const val `U_IOSTREAM_SOURCE`: UInt = 199711u;
public const val `U_IS_BIG_ENDIAN`: UInt = 0u;
public const val `U_JG_AFRICAN_FEH`: `UJoiningGroup` = 86;
public const val `U_JG_AFRICAN_NOON`: `UJoiningGroup` = 87;
public const val `U_JG_AFRICAN_QAF`: `UJoiningGroup` = 88;
public const val `U_JG_AIN`: `UJoiningGroup` = 1;
public const val `U_JG_ALAPH`: `UJoiningGroup` = 2;
public const val `U_JG_ALEF`: `UJoiningGroup` = 3;
public const val `U_JG_BEH`: `UJoiningGroup` = 4;
public const val `U_JG_BETH`: `UJoiningGroup` = 5;
public const val `U_JG_BURUSHASKI_YEH_BARREE`: `UJoiningGroup` = 54;
public const val `U_JG_DAL`: `UJoiningGroup` = 6;
public const val `U_JG_DALATH_RISH`: `UJoiningGroup` = 7;
public const val `U_JG_E`: `UJoiningGroup` = 8;
public const val `U_JG_FARSI_YEH`: `UJoiningGroup` = 55;
public const val `U_JG_FE`: `UJoiningGroup` = 51;
public const val `U_JG_FEH`: `UJoiningGroup` = 9;
public const val `U_JG_FINAL_SEMKATH`: `UJoiningGroup` = 10;
public const val `U_JG_GAF`: `UJoiningGroup` = 11;
public const val `U_JG_GAMAL`: `UJoiningGroup` = 12;
public const val `U_JG_HAH`: `UJoiningGroup` = 13;
public const val `U_JG_HAMZA_ON_HEH_GOAL`: `UJoiningGroup` = 14;
public const val `U_JG_HANIFI_ROHINGYA_KINNA_YA`: `UJoiningGroup` = 100;
public const val `U_JG_HANIFI_ROHINGYA_PA`: `UJoiningGroup` = 101;
public const val `U_JG_HE`: `UJoiningGroup` = 15;
public const val `U_JG_HEH`: `UJoiningGroup` = 16;
public const val `U_JG_HEH_GOAL`: `UJoiningGroup` = 17;
public const val `U_JG_HETH`: `UJoiningGroup` = 18;
public const val `U_JG_KAF`: `UJoiningGroup` = 19;
public const val `U_JG_KAPH`: `UJoiningGroup` = 20;
public const val `U_JG_KHAPH`: `UJoiningGroup` = 52;
public const val `U_JG_KNOTTED_HEH`: `UJoiningGroup` = 21;
public const val `U_JG_LAM`: `UJoiningGroup` = 22;
public const val `U_JG_LAMADH`: `UJoiningGroup` = 23;
public const val `U_JG_MALAYALAM_BHA`: `UJoiningGroup` = 89;
public const val `U_JG_MALAYALAM_JA`: `UJoiningGroup` = 90;
public const val `U_JG_MALAYALAM_LLA`: `UJoiningGroup` = 91;
public const val `U_JG_MALAYALAM_LLLA`: `UJoiningGroup` = 92;
public const val `U_JG_MALAYALAM_NGA`: `UJoiningGroup` = 93;
public const val `U_JG_MALAYALAM_NNA`: `UJoiningGroup` = 94;
public const val `U_JG_MALAYALAM_NNNA`: `UJoiningGroup` = 95;
public const val `U_JG_MALAYALAM_NYA`: `UJoiningGroup` = 96;
public const val `U_JG_MALAYALAM_RA`: `UJoiningGroup` = 97;
public const val `U_JG_MALAYALAM_SSA`: `UJoiningGroup` = 98;
public const val `U_JG_MALAYALAM_TTA`: `UJoiningGroup` = 99;
public const val `U_JG_MANICHAEAN_ALEPH`: `UJoiningGroup` = 58;
public const val `U_JG_MANICHAEAN_AYIN`: `UJoiningGroup` = 59;
public const val `U_JG_MANICHAEAN_BETH`: `UJoiningGroup` = 60;
public const val `U_JG_MANICHAEAN_DALETH`: `UJoiningGroup` = 61;
public const val `U_JG_MANICHAEAN_DHAMEDH`: `UJoiningGroup` = 62;
public const val `U_JG_MANICHAEAN_FIVE`: `UJoiningGroup` = 63;
public const val `U_JG_MANICHAEAN_GIMEL`: `UJoiningGroup` = 64;
public const val `U_JG_MANICHAEAN_HETH`: `UJoiningGroup` = 65;
public const val `U_JG_MANICHAEAN_HUNDRED`: `UJoiningGroup` = 66;
public const val `U_JG_MANICHAEAN_KAPH`: `UJoiningGroup` = 67;
public const val `U_JG_MANICHAEAN_LAMEDH`: `UJoiningGroup` = 68;
public const val `U_JG_MANICHAEAN_MEM`: `UJoiningGroup` = 69;
public const val `U_JG_MANICHAEAN_NUN`: `UJoiningGroup` = 70;
public const val `U_JG_MANICHAEAN_ONE`: `UJoiningGroup` = 71;
public const val `U_JG_MANICHAEAN_PE`: `UJoiningGroup` = 72;
public const val `U_JG_MANICHAEAN_QOPH`: `UJoiningGroup` = 73;
public const val `U_JG_MANICHAEAN_RESH`: `UJoiningGroup` = 74;
public const val `U_JG_MANICHAEAN_SADHE`: `UJoiningGroup` = 75;
public const val `U_JG_MANICHAEAN_SAMEKH`: `UJoiningGroup` = 76;
public const val `U_JG_MANICHAEAN_TAW`: `UJoiningGroup` = 77;
public const val `U_JG_MANICHAEAN_TEN`: `UJoiningGroup` = 78;
public const val `U_JG_MANICHAEAN_TETH`: `UJoiningGroup` = 79;
public const val `U_JG_MANICHAEAN_THAMEDH`: `UJoiningGroup` = 80;
public const val `U_JG_MANICHAEAN_TWENTY`: `UJoiningGroup` = 81;
public const val `U_JG_MANICHAEAN_WAW`: `UJoiningGroup` = 82;
public const val `U_JG_MANICHAEAN_YODH`: `UJoiningGroup` = 83;
public const val `U_JG_MANICHAEAN_ZAYIN`: `UJoiningGroup` = 84;
public const val `U_JG_MEEM`: `UJoiningGroup` = 24;
public const val `U_JG_MIM`: `UJoiningGroup` = 25;
public const val `U_JG_NOON`: `UJoiningGroup` = 26;
public const val `U_JG_NO_JOINING_GROUP`: `UJoiningGroup` = 0;
public const val `U_JG_NUN`: `UJoiningGroup` = 27;
public const val `U_JG_NYA`: `UJoiningGroup` = 56;
public const val `U_JG_PE`: `UJoiningGroup` = 28;
public const val `U_JG_QAF`: `UJoiningGroup` = 29;
public const val `U_JG_QAPH`: `UJoiningGroup` = 30;
public const val `U_JG_REH`: `UJoiningGroup` = 31;
public const val `U_JG_REVERSED_PE`: `UJoiningGroup` = 32;
public const val `U_JG_ROHINGYA_YEH`: `UJoiningGroup` = 57;
public const val `U_JG_SAD`: `UJoiningGroup` = 33;
public const val `U_JG_SADHE`: `UJoiningGroup` = 34;
public const val `U_JG_SEEN`: `UJoiningGroup` = 35;
public const val `U_JG_SEMKATH`: `UJoiningGroup` = 36;
public const val `U_JG_SHIN`: `UJoiningGroup` = 37;
public const val `U_JG_STRAIGHT_WAW`: `UJoiningGroup` = 85;
public const val `U_JG_SWASH_KAF`: `UJoiningGroup` = 38;
public const val `U_JG_SYRIAC_WAW`: `UJoiningGroup` = 39;
public const val `U_JG_TAH`: `UJoiningGroup` = 40;
public const val `U_JG_TAW`: `UJoiningGroup` = 41;
public const val `U_JG_TEH_MARBUTA`: `UJoiningGroup` = 42;
public const val `U_JG_TEH_MARBUTA_GOAL`: `UJoiningGroup` = 14;
public const val `U_JG_TETH`: `UJoiningGroup` = 43;
public const val `U_JG_WAW`: `UJoiningGroup` = 44;
public const val `U_JG_YEH`: `UJoiningGroup` = 45;
public const val `U_JG_YEH_BARREE`: `UJoiningGroup` = 46;
public const val `U_JG_YEH_WITH_TAIL`: `UJoiningGroup` = 47;
public const val `U_JG_YUDH`: `UJoiningGroup` = 48;
public const val `U_JG_YUDH_HE`: `UJoiningGroup` = 49;
public const val `U_JG_ZAIN`: `UJoiningGroup` = 50;
public const val `U_JG_ZHAIN`: `UJoiningGroup` = 53;
public const val `U_JT_DUAL_JOINING`: `UJoiningType` = 2;
public const val `U_JT_JOIN_CAUSING`: `UJoiningType` = 1;
public const val `U_JT_LEFT_JOINING`: `UJoiningType` = 3;
public const val `U_JT_NON_JOINING`: `UJoiningType` = 0;
public const val `U_JT_RIGHT_JOINING`: `UJoiningType` = 4;
public const val `U_JT_TRANSPARENT`: `UJoiningType` = 5;
public const val `U_LB_ALPHABETIC`: `ULineBreak` = 2;
public const val `U_LB_AMBIGUOUS`: `ULineBreak` = 1;
public const val `U_LB_BREAK_AFTER`: `ULineBreak` = 4;
public const val `U_LB_BREAK_BEFORE`: `ULineBreak` = 5;
public const val `U_LB_BREAK_BOTH`: `ULineBreak` = 3;
public const val `U_LB_BREAK_SYMBOLS`: `ULineBreak` = 27;
public const val `U_LB_CARRIAGE_RETURN`: `ULineBreak` = 10;
public const val `U_LB_CLOSE_PARENTHESIS`: `ULineBreak` = 36;
public const val `U_LB_CLOSE_PUNCTUATION`: `ULineBreak` = 8;
public const val `U_LB_COMBINING_MARK`: `ULineBreak` = 9;
public const val `U_LB_COMPLEX_CONTEXT`: `ULineBreak` = 24;
public const val `U_LB_CONDITIONAL_JAPANESE_STARTER`: `ULineBreak` = 37;
public const val `U_LB_CONTINGENT_BREAK`: `ULineBreak` = 7;
public const val `U_LB_EXCLAMATION`: `ULineBreak` = 11;
public const val `U_LB_E_BASE`: `ULineBreak` = 40;
public const val `U_LB_E_MODIFIER`: `ULineBreak` = 41;
public const val `U_LB_GLUE`: `ULineBreak` = 12;
public const val `U_LB_H2`: `ULineBreak` = 31;
public const val `U_LB_H3`: `ULineBreak` = 32;
public const val `U_LB_HEBREW_LETTER`: `ULineBreak` = 38;
public const val `U_LB_HYPHEN`: `ULineBreak` = 13;
public const val `U_LB_IDEOGRAPHIC`: `ULineBreak` = 14;
public const val `U_LB_INFIX_NUMERIC`: `ULineBreak` = 16;
public const val `U_LB_INSEPARABLE`: `ULineBreak` = 15;
public const val `U_LB_INSEPERABLE`: `ULineBreak` = 15;
public const val `U_LB_JL`: `ULineBreak` = 33;
public const val `U_LB_JT`: `ULineBreak` = 34;
public const val `U_LB_JV`: `ULineBreak` = 35;
public const val `U_LB_LINE_FEED`: `ULineBreak` = 17;
public const val `U_LB_MANDATORY_BREAK`: `ULineBreak` = 6;
public const val `U_LB_NEXT_LINE`: `ULineBreak` = 29;
public const val `U_LB_NONSTARTER`: `ULineBreak` = 18;
public const val `U_LB_NUMERIC`: `ULineBreak` = 19;
public const val `U_LB_OPEN_PUNCTUATION`: `ULineBreak` = 20;
public const val `U_LB_POSTFIX_NUMERIC`: `ULineBreak` = 21;
public const val `U_LB_PREFIX_NUMERIC`: `ULineBreak` = 22;
public const val `U_LB_QUOTATION`: `ULineBreak` = 23;
public const val `U_LB_REGIONAL_INDICATOR`: `ULineBreak` = 39;
public const val `U_LB_SPACE`: `ULineBreak` = 26;
public const val `U_LB_SURROGATE`: `ULineBreak` = 25;
public const val `U_LB_UNKNOWN`: `ULineBreak` = 0;
public const val `U_LB_WORD_JOINER`: `ULineBreak` = 30;
public const val `U_LB_ZWJ`: `ULineBreak` = 42;
public const val `U_LB_ZWSPACE`: `ULineBreak` = 28;
public const val `U_LEFT_TO_RIGHT`: `UCharDirection` = 0;
public const val `U_LEFT_TO_RIGHT_EMBEDDING`: `UCharDirection` = 11;
public const val `U_LEFT_TO_RIGHT_ISOLATE`: `UCharDirection` = 20;
public const val `U_LEFT_TO_RIGHT_OVERRIDE`: `UCharDirection` = 12;
public const val `U_LETTER_NUMBER`: `UCharCategory` = 10;
// UNSUPPORTED Rust 4960:1: non-scalar type Ptr unsupported
// pub const U_LIB_SUFFIX_C_NAME_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("");

public const val `U_LINE_SEPARATOR`: `UCharCategory` = 13;
public const val `U_LONG_PROPERTY_NAME`: `UPropertyNameChoice` = 1;
public const val `U_LOWERCASE_LETTER`: `UCharCategory` = 2;
public const val `U_MALFORMED_EXPONENTIAL_PATTERN`: `UErrorCode` = 65795;
public const val `U_MALFORMED_PRAGMA`: `UErrorCode` = 65562;
public const val `U_MALFORMED_RULE`: `UErrorCode` = 65537;
public const val `U_MALFORMED_SET`: `UErrorCode` = 65538;
public const val `U_MALFORMED_SYMBOL_REFERENCE`: `UErrorCode` = 65539;
public const val `U_MALFORMED_UNICODE_ESCAPE`: `UErrorCode` = 65540;
public const val `U_MALFORMED_VARIABLE_DEFINITION`: `UErrorCode` = 65541;
public const val `U_MALFORMED_VARIABLE_REFERENCE`: `UErrorCode` = 65542;
public const val `U_MATH_SYMBOL`: `UCharCategory` = 24;
public const val `U_MAX_VERSION_LENGTH`: UInt = 4u;
public const val `U_MAX_VERSION_STRING_LENGTH`: UInt = 20u;
public const val `U_MEMORY_ALLOCATION_ERROR`: `UErrorCode` = 7;
public const val `U_MESSAGE_PARSE_ERROR`: `UErrorCode` = 6;
public const val `U_MILLIS_PER_DAY`: UInt = 86400000u;
public const val `U_MILLIS_PER_HOUR`: UInt = 3600000u;
public const val `U_MILLIS_PER_MINUTE`: UInt = 60000u;
public const val `U_MILLIS_PER_SECOND`: UInt = 1000u;
public const val `U_MISMATCHED_SEGMENT_DELIMITERS`: `UErrorCode` = 65543;
public const val `U_MISPLACED_ANCHOR_START`: `UErrorCode` = 65544;
public const val `U_MISPLACED_COMPOUND_FILTER`: `UErrorCode` = 65558;
public const val `U_MISPLACED_CURSOR_OFFSET`: `UErrorCode` = 65545;
public const val `U_MISPLACED_QUANTIFIER`: `UErrorCode` = 65546;
public const val `U_MISSING_OPERATOR`: `UErrorCode` = 65547;
public const val `U_MISSING_RESOURCE_ERROR`: `UErrorCode` = 2;
public const val `U_MISSING_SEGMENT_CLOSE`: `UErrorCode` = 65548;
public const val `U_MODIFIER_LETTER`: `UCharCategory` = 4;
public const val `U_MODIFIER_SYMBOL`: `UCharCategory` = 26;
public const val `U_MULTIPLE_ANTE_CONTEXTS`: `UErrorCode` = 65549;
public const val `U_MULTIPLE_COMPOUND_FILTERS`: `UErrorCode` = 65559;
public const val `U_MULTIPLE_CURSORS`: `UErrorCode` = 65550;
public const val `U_MULTIPLE_DECIMAL_SEPARATORS`: `UErrorCode` = 65793;
public const val `U_MULTIPLE_DECIMAL_SEPERATORS`: `UErrorCode` = 65793;
public const val `U_MULTIPLE_EXPONENTIAL_SYMBOLS`: `UErrorCode` = 65794;
public const val `U_MULTIPLE_PAD_SPECIFIERS`: `UErrorCode` = 65798;
public const val `U_MULTIPLE_PERCENT_SYMBOLS`: `UErrorCode` = 65796;
public const val `U_MULTIPLE_PERMILL_SYMBOLS`: `UErrorCode` = 65797;
public const val `U_MULTIPLE_POST_CONTEXTS`: `UErrorCode` = 65551;
public const val `U_NON_SPACING_MARK`: `UCharCategory` = 6;
public const val `U_NO_DEFAULT_INCLUDE_UTF_HEADERS`: UInt = 1u;
public const val `U_NO_SPACE_AVAILABLE`: `UErrorCode` = 20;
public const val `U_NO_WRITE_PERMISSION`: `UErrorCode` = 30;
public const val `U_NT_DECIMAL`: `UNumericType` = 1;
public const val `U_NT_DIGIT`: `UNumericType` = 2;
public const val `U_NT_NONE`: `UNumericType` = 0;
public const val `U_NT_NUMERIC`: `UNumericType` = 3;
public const val `U_NUMBER_ARG_OUTOFBOUNDS_ERROR`: `UErrorCode` = 65810;
public const val `U_NUMBER_SKELETON_SYNTAX_ERROR`: `UErrorCode` = 65811;
public const val `U_OMIT_UNCHANGED_TEXT`: UInt = 16384u;
public const val `U_OTHER_LETTER`: `UCharCategory` = 5;
public const val `U_OTHER_NEUTRAL`: `UCharDirection` = 10;
public const val `U_OTHER_NUMBER`: `UCharCategory` = 11;
public const val `U_OTHER_PUNCTUATION`: `UCharCategory` = 23;
public const val `U_OTHER_SYMBOL`: `UCharCategory` = 27;
public const val `U_OVERRIDE_CXX_ALLOCATION`: UInt = 1u;
public const val `U_PARAGRAPH_SEPARATOR`: `UCharCategory` = 14;
public const val `U_PARSE_CONTEXT_LEN`: Int = 16;
public const val `U_PARSE_ERROR`: `UErrorCode` = 9;
public const val `U_PARSE_ERROR_START`: `UErrorCode` = 65536;
public const val `U_PATTERN_SYNTAX_ERROR`: `UErrorCode` = 65799;
public const val `U_PF_AIX`: UInt = 3100u;
public const val `U_PF_ANDROID`: UInt = 4050u;
public const val `U_PF_BROWSER_NATIVE_CLIENT`: UInt = 4020u;
public const val `U_PF_BSD`: UInt = 3000u;
public const val `U_PF_CYGWIN`: UInt = 1900u;
public const val `U_PF_DARWIN`: UInt = 3500u;
public const val `U_PF_EMSCRIPTEN`: UInt = 5010u;
public const val `U_PF_FUCHSIA`: UInt = 4100u;
public const val `U_PF_HPUX`: UInt = 2100u;
public const val `U_PF_IPHONE`: UInt = 3550u;
public const val `U_PF_IRIX`: UInt = 3200u;
public const val `U_PF_LINUX`: UInt = 4000u;
public const val `U_PF_MINGW`: UInt = 1800u;
public const val `U_PF_OS390`: UInt = 9000u;
public const val `U_PF_OS400`: UInt = 9400u;
public const val `U_PF_QNX`: UInt = 3700u;
public const val `U_PF_SOLARIS`: UInt = 2600u;
public const val `U_PF_UNKNOWN`: UInt = 0u;
public const val `U_PF_WINDOWS`: UInt = 1000u;
public const val `U_PLATFORM`: UInt = 1800u;
public const val `U_PLATFORM_HAS_WIN32_API`: UInt = 1u;
public const val `U_PLATFORM_HAS_WINUWP_API`: UInt = 0u;
public const val `U_PLATFORM_IMPLEMENTS_POSIX`: UInt = 0u;
public const val `U_PLATFORM_IS_DARWIN_BASED`: UInt = 1u;
public const val `U_PLATFORM_IS_LINUX_BASED`: UInt = 1u;
public const val `U_PLATFORM_USES_ONLY_WIN32_API`: UInt = 1u;
public const val `U_PLUGIN_CHANGED_LEVEL_WARNING`: `UErrorCode` = -120;
public const val `U_PLUGIN_DIDNT_SET_LEVEL`: `UErrorCode` = 66817;
public const val `U_PLUGIN_ERROR_START`: `UErrorCode` = 66816;
public const val `U_PLUGIN_TOO_HIGH`: `UErrorCode` = 66816;
public const val `U_POP_DIRECTIONAL_FORMAT`: `UCharDirection` = 16;
public const val `U_POP_DIRECTIONAL_ISOLATE`: `UCharDirection` = 22;
public const val `U_PRIMARY_TOO_LONG_ERROR`: `UErrorCode` = 22;
public const val `U_PRIVATE_USE_CHAR`: `UCharCategory` = 17;
public const val `U_REGEX_BAD_ESCAPE_SEQUENCE`: `UErrorCode` = 66307;
public const val `U_REGEX_BAD_INTERVAL`: `UErrorCode` = 66312;
public const val `U_REGEX_ERROR_START`: `UErrorCode` = 66304;
public const val `U_REGEX_INTERNAL_ERROR`: `UErrorCode` = 66304;
public const val `U_REGEX_INVALID_BACK_REF`: `UErrorCode` = 66314;
public const val `U_REGEX_INVALID_CAPTURE_GROUP_NAME`: `UErrorCode` = 66325;
public const val `U_REGEX_INVALID_FLAG`: `UErrorCode` = 66315;
public const val `U_REGEX_INVALID_RANGE`: `UErrorCode` = 66320;
public const val `U_REGEX_INVALID_STATE`: `UErrorCode` = 66306;
public const val `U_REGEX_LOOK_BEHIND_LIMIT`: `UErrorCode` = 66316;
public const val `U_REGEX_MAX_LT_MIN`: `UErrorCode` = 66313;
public const val `U_REGEX_MISMATCHED_PAREN`: `UErrorCode` = 66310;
public const val `U_REGEX_MISSING_CLOSE_BRACKET`: `UErrorCode` = 66319;
public const val `U_REGEX_NUMBER_TOO_BIG`: `UErrorCode` = 66311;
public const val `U_REGEX_PATTERN_TOO_BIG`: `UErrorCode` = 66324;
public const val `U_REGEX_PROPERTY_SYNTAX`: `UErrorCode` = 66308;
public const val `U_REGEX_RULE_SYNTAX`: `UErrorCode` = 66305;
public const val `U_REGEX_SET_CONTAINS_STRING`: `UErrorCode` = 66317;
public const val `U_REGEX_STACK_OVERFLOW`: `UErrorCode` = 66321;
public const val `U_REGEX_STOPPED_BY_CALLER`: `UErrorCode` = 66323;
public const val `U_REGEX_TIME_OUT`: `UErrorCode` = 66322;
public const val `U_REGEX_UNIMPLEMENTED`: `UErrorCode` = 66309;
public const val `U_RESOURCE_TYPE_MISMATCH`: `UErrorCode` = 17;
public const val `U_RIGHT_TO_LEFT`: `UCharDirection` = 1;
public const val `U_RIGHT_TO_LEFT_ARABIC`: `UCharDirection` = 13;
public const val `U_RIGHT_TO_LEFT_EMBEDDING`: `UCharDirection` = 14;
public const val `U_RIGHT_TO_LEFT_ISOLATE`: `UCharDirection` = 21;
public const val `U_RIGHT_TO_LEFT_OVERRIDE`: `UCharDirection` = 15;
public const val `U_RULE_MASK_ERROR`: `UErrorCode` = 65557;
public const val `U_SAFECLONE_ALLOCATED_WARNING`: `UErrorCode` = -126;
public const val `U_SB_ATERM`: `USentenceBreak` = 1;
public const val `U_SB_CLOSE`: `USentenceBreak` = 2;
public const val `U_SB_CR`: `USentenceBreak` = 11;
public const val `U_SB_EXTEND`: `USentenceBreak` = 12;
public const val `U_SB_FORMAT`: `USentenceBreak` = 3;
public const val `U_SB_LF`: `USentenceBreak` = 13;
public const val `U_SB_LOWER`: `USentenceBreak` = 4;
public const val `U_SB_NUMERIC`: `USentenceBreak` = 5;
public const val `U_SB_OLETTER`: `USentenceBreak` = 6;
public const val `U_SB_OTHER`: `USentenceBreak` = 0;
public const val `U_SB_SCONTINUE`: `USentenceBreak` = 14;
public const val `U_SB_SEP`: `USentenceBreak` = 7;
public const val `U_SB_SP`: `USentenceBreak` = 8;
public const val `U_SB_STERM`: `USentenceBreak` = 9;
public const val `U_SB_UPPER`: `USentenceBreak` = 10;
public const val `U_SEGMENT_SEPARATOR`: `UCharDirection` = 8;
public const val `U_SENTINEL`: Int = -1;
public const val `U_SHAPE_AGGREGATE_TASHKEEL`: UInt = 16384u;
public const val `U_SHAPE_AGGREGATE_TASHKEEL_MASK`: UInt = 16384u;
public const val `U_SHAPE_AGGREGATE_TASHKEEL_NOOP`: UInt = 0u;
public const val `U_SHAPE_DIGITS_ALEN2AN_INIT_AL`: UInt = 128u;
public const val `U_SHAPE_DIGITS_ALEN2AN_INIT_LR`: UInt = 96u;
public const val `U_SHAPE_DIGITS_AN2EN`: UInt = 64u;
public const val `U_SHAPE_DIGITS_EN2AN`: UInt = 32u;
public const val `U_SHAPE_DIGITS_MASK`: UInt = 224u;
public const val `U_SHAPE_DIGITS_NOOP`: UInt = 0u;
public const val `U_SHAPE_DIGITS_RESERVED`: UInt = 160u;
public const val `U_SHAPE_DIGIT_TYPE_AN`: UInt = 0u;
public const val `U_SHAPE_DIGIT_TYPE_AN_EXTENDED`: UInt = 256u;
public const val `U_SHAPE_DIGIT_TYPE_MASK`: UInt = 768u;
public const val `U_SHAPE_DIGIT_TYPE_RESERVED`: UInt = 512u;
public const val `U_SHAPE_LAMALEF_AUTO`: UInt = 65536u;
public const val `U_SHAPE_LAMALEF_BEGIN`: UInt = 3u;
public const val `U_SHAPE_LAMALEF_END`: UInt = 2u;
public const val `U_SHAPE_LAMALEF_MASK`: UInt = 65539u;
public const val `U_SHAPE_LAMALEF_NEAR`: UInt = 1u;
public const val `U_SHAPE_LAMALEF_RESIZE`: UInt = 0u;
public const val `U_SHAPE_LENGTH_FIXED_SPACES_AT_BEGINNING`: UInt = 3u;
public const val `U_SHAPE_LENGTH_FIXED_SPACES_AT_END`: UInt = 2u;
public const val `U_SHAPE_LENGTH_FIXED_SPACES_NEAR`: UInt = 1u;
public const val `U_SHAPE_LENGTH_GROW_SHRINK`: UInt = 0u;
public const val `U_SHAPE_LENGTH_MASK`: UInt = 65539u;
public const val `U_SHAPE_LETTERS_MASK`: UInt = 24u;
public const val `U_SHAPE_LETTERS_NOOP`: UInt = 0u;
public const val `U_SHAPE_LETTERS_SHAPE`: UInt = 8u;
public const val `U_SHAPE_LETTERS_SHAPE_TASHKEEL_ISOLATED`: UInt = 24u;
public const val `U_SHAPE_LETTERS_UNSHAPE`: UInt = 16u;
public const val `U_SHAPE_PRESERVE_PRESENTATION`: UInt = 32768u;
public const val `U_SHAPE_PRESERVE_PRESENTATION_MASK`: UInt = 32768u;
public const val `U_SHAPE_PRESERVE_PRESENTATION_NOOP`: UInt = 0u;
public const val `U_SHAPE_SEEN_MASK`: UInt = 7340032u;
public const val `U_SHAPE_SEEN_TWOCELL_NEAR`: UInt = 2097152u;
public const val `U_SHAPE_SPACES_RELATIVE_TO_TEXT_BEGIN_END`: UInt = 67108864u;
public const val `U_SHAPE_SPACES_RELATIVE_TO_TEXT_MASK`: UInt = 67108864u;
public const val `U_SHAPE_TAIL_NEW_UNICODE`: UInt = 134217728u;
public const val `U_SHAPE_TAIL_TYPE_MASK`: UInt = 134217728u;
public const val `U_SHAPE_TASHKEEL_BEGIN`: UInt = 262144u;
public const val `U_SHAPE_TASHKEEL_END`: UInt = 393216u;
public const val `U_SHAPE_TASHKEEL_MASK`: UInt = 917504u;
public const val `U_SHAPE_TASHKEEL_REPLACE_BY_TATWEEL`: UInt = 786432u;
public const val `U_SHAPE_TASHKEEL_RESIZE`: UInt = 524288u;
public const val `U_SHAPE_TEXT_DIRECTION_LOGICAL`: UInt = 0u;
public const val `U_SHAPE_TEXT_DIRECTION_MASK`: UInt = 4u;
public const val `U_SHAPE_TEXT_DIRECTION_VISUAL_LTR`: UInt = 4u;
public const val `U_SHAPE_TEXT_DIRECTION_VISUAL_RTL`: UInt = 0u;
public const val `U_SHAPE_YEHHAMZA_MASK`: UInt = 58720256u;
public const val `U_SHAPE_YEHHAMZA_TWOCELL_NEAR`: UInt = 16777216u;
public const val `U_SHORT_PROPERTY_NAME`: `UPropertyNameChoice` = 0;
public const val `U_SHOW_CPLUSPLUS_API`: UInt = 0u;
public const val `U_SIZEOF_UCHAR`: UInt = 2u;
public const val `U_SIZEOF_WCHAR_T`: UInt = 1u;
public const val `U_SORT_KEY_TOO_SHORT_WARNING`: `UErrorCode` = -123;
public const val `U_SPACE_SEPARATOR`: `UCharCategory` = 12;
public const val `U_START_PUNCTUATION`: `UCharCategory` = 20;
public const val `U_STATE_OLD_WARNING`: `UErrorCode` = -125;
public const val `U_STATE_TOO_OLD_ERROR`: `UErrorCode` = 23;
public const val `U_STRINGPREP_CHECK_BIDI_ERROR`: `UErrorCode` = 66562;
public const val `U_STRINGPREP_PROHIBITED_ERROR`: `UErrorCode` = 66560;
public const val `U_STRINGPREP_UNASSIGNED_ERROR`: `UErrorCode` = 66561;
public const val `U_STRING_NOT_TERMINATED_WARNING`: `UErrorCode` = -124;
public const val `U_SURROGATE`: `UCharCategory` = 18;
public const val `U_TITLECASE_ADJUST_TO_CASED`: UInt = 1024u;
public const val `U_TITLECASE_LETTER`: `UCharCategory` = 3;
public const val `U_TITLECASE_NO_BREAK_ADJUSTMENT`: UInt = 512u;
public const val `U_TITLECASE_NO_LOWERCASE`: UInt = 256u;
public const val `U_TITLECASE_SENTENCES`: UInt = 64u;
public const val `U_TITLECASE_WHOLE_STRING`: UInt = 32u;
public const val `U_TOO_MANY_ALIASES_ERROR`: `UErrorCode` = 24;
public const val `U_TRAILING_BACKSLASH`: `UErrorCode` = 65552;
public const val `U_TRUNCATED_CHAR_FOUND`: `UErrorCode` = 11;
public const val `U_UNASSIGNED`: `UCharCategory` = 0;
public const val `U_UNCLOSED_SEGMENT`: `UErrorCode` = 65563;
public const val `U_UNDEFINED_KEYWORD`: `UErrorCode` = 65806;
public const val `U_UNDEFINED_SEGMENT_REFERENCE`: `UErrorCode` = 65553;
public const val `U_UNDEFINED_VARIABLE`: `UErrorCode` = 65554;
public const val `U_UNEXPECTED_TOKEN`: `UErrorCode` = 65792;
public const val `U_UNICODE_CHAR_NAME`: `UCharNameChoice` = 0;
// UNSUPPORTED Rust 5184:1: non-scalar type Ptr unsupported
// pub const U_UNICODE_VERSION: windows_sys::core::PCSTR = windows_sys::core::s!("8.0");

public const val `U_UNMATCHED_BRACES`: `UErrorCode` = 65801;
public const val `U_UNQUOTED_SPECIAL`: `UErrorCode` = 65555;
public const val `U_UNSUPPORTED_ATTRIBUTE`: `UErrorCode` = 65803;
public const val `U_UNSUPPORTED_ERROR`: `UErrorCode` = 16;
public const val `U_UNSUPPORTED_ESCAPE_SEQUENCE`: `UErrorCode` = 19;
public const val `U_UNSUPPORTED_PROPERTY`: `UErrorCode` = 65802;
public const val `U_UNTERMINATED_QUOTE`: `UErrorCode` = 65556;
public const val `U_UPPERCASE_LETTER`: `UCharCategory` = 1;
public const val `U_USELESS_COLLATOR_ERROR`: `UErrorCode` = 29;
public const val `U_USING_DEFAULT_WARNING`: `UErrorCode` = -127;
public const val `U_USING_FALLBACK_WARNING`: `UErrorCode` = -128;
public const val `U_USING_ICU_NAMESPACE`: UInt = 1u;
public const val `U_VARIABLE_RANGE_EXHAUSTED`: `UErrorCode` = 65565;
public const val `U_VARIABLE_RANGE_OVERLAP`: `UErrorCode` = 65566;
public const val `U_VO_ROTATED`: `UVerticalOrientation` = 0;
public const val `U_VO_TRANSFORMED_ROTATED`: `UVerticalOrientation` = 1;
public const val `U_VO_TRANSFORMED_UPRIGHT`: `UVerticalOrientation` = 2;
public const val `U_VO_UPRIGHT`: `UVerticalOrientation` = 3;
public const val `U_WB_ALETTER`: `UWordBreakValues` = 1;
public const val `U_WB_CR`: `UWordBreakValues` = 8;
public const val `U_WB_DOUBLE_QUOTE`: `UWordBreakValues` = 16;
public const val `U_WB_EXTEND`: `UWordBreakValues` = 9;
public const val `U_WB_EXTENDNUMLET`: `UWordBreakValues` = 7;
public const val `U_WB_E_BASE`: `UWordBreakValues` = 17;
public const val `U_WB_E_BASE_GAZ`: `UWordBreakValues` = 18;
public const val `U_WB_E_MODIFIER`: `UWordBreakValues` = 19;
public const val `U_WB_FORMAT`: `UWordBreakValues` = 2;
public const val `U_WB_GLUE_AFTER_ZWJ`: `UWordBreakValues` = 20;
public const val `U_WB_HEBREW_LETTER`: `UWordBreakValues` = 14;
public const val `U_WB_KATAKANA`: `UWordBreakValues` = 3;
public const val `U_WB_LF`: `UWordBreakValues` = 10;
public const val `U_WB_MIDLETTER`: `UWordBreakValues` = 4;
public const val `U_WB_MIDNUM`: `UWordBreakValues` = 5;
public const val `U_WB_MIDNUMLET`: `UWordBreakValues` = 11;
public const val `U_WB_NEWLINE`: `UWordBreakValues` = 12;
public const val `U_WB_NUMERIC`: `UWordBreakValues` = 6;
public const val `U_WB_OTHER`: `UWordBreakValues` = 0;
public const val `U_WB_REGIONAL_INDICATOR`: `UWordBreakValues` = 13;
public const val `U_WB_SINGLE_QUOTE`: `UWordBreakValues` = 15;
public const val `U_WB_WSEGSPACE`: `UWordBreakValues` = 22;
public const val `U_WB_ZWJ`: `UWordBreakValues` = 21;
public const val `U_WHITE_SPACE_NEUTRAL`: `UCharDirection` = 9;
public const val `U_ZERO_ERROR`: `UErrorCode` = 0;
public const val `VS_ALLOW_LATIN`: UInt = 1u;
public const val `WC_COMPOSITECHECK`: UInt = 512u;
public const val `WC_DEFAULTCHAR`: UInt = 64u;
public const val `WC_DISCARDNS`: UInt = 16u;
public const val `WC_ERR_INVALID_CHARS`: UInt = 128u;
public const val `WC_NO_BEST_FIT_CHARS`: UInt = 1024u;
public const val `WC_SEPCHARS`: UInt = 32u;
public typealias `WORDLIST_TYPE` = Int;
public const val `WORDLIST_TYPE_ADD`: `WORDLIST_TYPE` = 1;
public const val `WORDLIST_TYPE_AUTOCORRECT`: `WORDLIST_TYPE` = 3;
public const val `WORDLIST_TYPE_EXCLUDE`: `WORDLIST_TYPE` = 2;
public const val `WORDLIST_TYPE_IGNORE`: `WORDLIST_TYPE` = 0;
public const val `WeekUnit`: `CALDATETIME_DATEUNIT` = 3;
public const val `YearUnit`: `CALDATETIME_DATEUNIT` = 1;
public const val `sidArabic`: `SCRIPTCONTF` = 9;
public const val `sidArmenian`: `SCRIPTCONTF` = 7;
public const val `sidAsciiLatin`: `SCRIPTCONTF` = 3;
public const val `sidAsciiSym`: `SCRIPTCONTF` = 2;
public const val `sidBengali`: `SCRIPTCONTF` = 11;
public const val `sidBopomofo`: `SCRIPTCONTF` = 25;
public const val `sidBraille`: `SCRIPTCONTF` = 31;
public const val `sidBurmese`: `SCRIPTCONTF` = 36;
public const val `sidCanSyllabic`: `SCRIPTCONTF` = 28;
public const val `sidCherokee`: `SCRIPTCONTF` = 29;
public const val `sidCyrillic`: `SCRIPTCONTF` = 6;
public const val `sidDefault`: `SCRIPTCONTF` = 0;
public const val `sidDevanagari`: `SCRIPTCONTF` = 10;
public const val `sidEthiopic`: `SCRIPTCONTF` = 27;
public const val `sidFEFirst`: `SCRIPTCONTF` = 23;
public const val `sidFELast`: `SCRIPTCONTF` = 26;
public const val `sidGeorgian`: `SCRIPTCONTF` = 22;
public const val `sidGreek`: `SCRIPTCONTF` = 5;
public const val `sidGujarati`: `SCRIPTCONTF` = 13;
public const val `sidGurmukhi`: `SCRIPTCONTF` = 12;
public const val `sidHan`: `SCRIPTCONTF` = 26;
public const val `sidHangul`: `SCRIPTCONTF` = 23;
public const val `sidHebrew`: `SCRIPTCONTF` = 8;
public const val `sidKana`: `SCRIPTCONTF` = 24;
public const val `sidKannada`: `SCRIPTCONTF` = 17;
public const val `sidKhmer`: `SCRIPTCONTF` = 37;
public const val `sidLao`: `SCRIPTCONTF` = 20;
public const val `sidLatin`: `SCRIPTCONTF` = 4;
public const val `sidLim`: `SCRIPTCONTF` = 41;
public const val `sidMalayalam`: `SCRIPTCONTF` = 18;
public const val `sidMerge`: `SCRIPTCONTF` = 1;
public const val `sidMongolian`: `SCRIPTCONTF` = 39;
public const val `sidOgham`: `SCRIPTCONTF` = 33;
public const val `sidOriya`: `SCRIPTCONTF` = 14;
public const val `sidRunic`: `SCRIPTCONTF` = 32;
public const val `sidSinhala`: `SCRIPTCONTF` = 34;
public const val `sidSyriac`: `SCRIPTCONTF` = 35;
public const val `sidTamil`: `SCRIPTCONTF` = 15;
public const val `sidTelugu`: `SCRIPTCONTF` = 16;
public const val `sidThaana`: `SCRIPTCONTF` = 38;
public const val `sidThai`: `SCRIPTCONTF` = 19;
public const val `sidTibetan`: `SCRIPTCONTF` = 21;
public const val `sidUserDefined`: `SCRIPTCONTF` = 40;
public const val `sidYi`: `SCRIPTCONTF` = 30;
