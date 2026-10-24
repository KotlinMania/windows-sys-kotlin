// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_System_Performance_HardwareCounterProfiling")]
// pub mod HardwareCounterProfiling;

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn BackupPerfRegistryToFileW(szfilename : windows_sys::core::PCWSTR, szcommentstring : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn InstallPerfDllA(szcomputername : windows_sys::core::PCSTR, lpinifile : windows_sys::core::PCSTR, dwflags : usize) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn InstallPerfDllW(szcomputername : windows_sys::core::PCWSTR, lpinifile : windows_sys::core::PCWSTR, dwflags : usize) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn LoadPerfCounterTextStringsA(lpcommandline : windows_sys::core::PCSTR, bquietmodearg : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn LoadPerfCounterTextStringsW(lpcommandline : windows_sys::core::PCWSTR, bquietmodearg : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhAddCounterA(hquery : PDH_HQUERY, szfullcounterpath : windows_sys::core::PCSTR, dwuserdata : usize, phcounter : *mut PDH_HCOUNTER) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhAddCounterW(hquery : PDH_HQUERY, szfullcounterpath : windows_sys::core::PCWSTR, dwuserdata : usize, phcounter : *mut PDH_HCOUNTER) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhAddEnglishCounterA(hquery : PDH_HQUERY, szfullcounterpath : windows_sys::core::PCSTR, dwuserdata : usize, phcounter : *mut PDH_HCOUNTER) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhAddEnglishCounterW(hquery : PDH_HQUERY, szfullcounterpath : windows_sys::core::PCWSTR, dwuserdata : usize, phcounter : *mut PDH_HCOUNTER) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhBindInputDataSourceA(phdatasource : *mut PDH_HLOG, logfilenamelist : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhBindInputDataSourceW(phdatasource : *mut PDH_HLOG, logfilenamelist : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhBrowseCountersA(pbrowsedlgdata : *const PDH_BROWSE_DLG_CONFIG_A) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhBrowseCountersHA(pbrowsedlgdata : *const PDH_BROWSE_DLG_CONFIG_HA) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhBrowseCountersHW(pbrowsedlgdata : *const PDH_BROWSE_DLG_CONFIG_HW) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhBrowseCountersW(pbrowsedlgdata : *const PDH_BROWSE_DLG_CONFIG_W) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhCalculateCounterFromRawValue(hcounter : PDH_HCOUNTER, dwformat : PDH_FMT, rawvalue1 : *const PDH_RAW_COUNTER, rawvalue2 : *const PDH_RAW_COUNTER, fmtvalue : *mut PDH_FMT_COUNTERVALUE) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhCloseLog(hlog : PDH_HLOG, dwflags : u32) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhCloseQuery(hquery : PDH_HQUERY) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhCollectQueryData(hquery : PDH_HQUERY) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhCollectQueryDataEx(hquery : PDH_HQUERY, dwintervaltime : u32, hnewdataevent : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhCollectQueryDataWithTime(hquery : PDH_HQUERY, plltimestamp : *mut i64) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhComputeCounterStatistics(hcounter : PDH_HCOUNTER, dwformat : PDH_FMT, dwfirstentry : u32, dwnumentries : u32, lprawvaluearray : *const PDH_RAW_COUNTER, data : *mut PDH_STATISTICS) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhConnectMachineA(szmachinename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhConnectMachineW(szmachinename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhCreateSQLTablesA(szdatasource : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhCreateSQLTablesW(szdatasource : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumLogSetNamesA(szdatasource : windows_sys::core::PCSTR, mszdatasetnamelist : windows_sys::core::PSTR, pcchbufferlength : *mut u32) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumLogSetNamesW(szdatasource : windows_sys::core::PCWSTR, mszdatasetnamelist : windows_sys::core::PWSTR, pcchbufferlength : *mut u32) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumMachinesA(szdatasource : windows_sys::core::PCSTR, mszmachinelist : windows_sys::core::PSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumMachinesHA(hdatasource : PDH_HLOG, mszmachinelist : windows_sys::core::PSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumMachinesHW(hdatasource : PDH_HLOG, mszmachinelist : windows_sys::core::PWSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumMachinesW(szdatasource : windows_sys::core::PCWSTR, mszmachinelist : windows_sys::core::PWSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumObjectItemsA(szdatasource : windows_sys::core::PCSTR, szmachinename : windows_sys::core::PCSTR, szobjectname : windows_sys::core::PCSTR, mszcounterlist : windows_sys::core::PSTR, pcchcounterlistlength : *mut u32, mszinstancelist : windows_sys::core::PSTR, pcchinstancelistlength : *mut u32, dwdetaillevel : PERF_DETAIL, dwflags : u32) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumObjectItemsHA(hdatasource : PDH_HLOG, szmachinename : windows_sys::core::PCSTR, szobjectname : windows_sys::core::PCSTR, mszcounterlist : windows_sys::core::PSTR, pcchcounterlistlength : *mut u32, mszinstancelist : windows_sys::core::PSTR, pcchinstancelistlength : *mut u32, dwdetaillevel : PERF_DETAIL, dwflags : u32) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumObjectItemsHW(hdatasource : PDH_HLOG, szmachinename : windows_sys::core::PCWSTR, szobjectname : windows_sys::core::PCWSTR, mszcounterlist : windows_sys::core::PWSTR, pcchcounterlistlength : *mut u32, mszinstancelist : windows_sys::core::PWSTR, pcchinstancelistlength : *mut u32, dwdetaillevel : PERF_DETAIL, dwflags : u32) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumObjectItemsW(szdatasource : windows_sys::core::PCWSTR, szmachinename : windows_sys::core::PCWSTR, szobjectname : windows_sys::core::PCWSTR, mszcounterlist : windows_sys::core::PWSTR, pcchcounterlistlength : *mut u32, mszinstancelist : windows_sys::core::PWSTR, pcchinstancelistlength : *mut u32, dwdetaillevel : PERF_DETAIL, dwflags : u32) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumObjectsA(szdatasource : windows_sys::core::PCSTR, szmachinename : windows_sys::core::PCSTR, mszobjectlist : windows_sys::core::PSTR, pcchbuffersize : *mut u32, dwdetaillevel : PERF_DETAIL, brefresh : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumObjectsHA(hdatasource : PDH_HLOG, szmachinename : windows_sys::core::PCSTR, mszobjectlist : windows_sys::core::PSTR, pcchbuffersize : *mut u32, dwdetaillevel : PERF_DETAIL, brefresh : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumObjectsHW(hdatasource : PDH_HLOG, szmachinename : windows_sys::core::PCWSTR, mszobjectlist : windows_sys::core::PWSTR, pcchbuffersize : *mut u32, dwdetaillevel : PERF_DETAIL, brefresh : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhEnumObjectsW(szdatasource : windows_sys::core::PCWSTR, szmachinename : windows_sys::core::PCWSTR, mszobjectlist : windows_sys::core::PWSTR, pcchbuffersize : *mut u32, dwdetaillevel : PERF_DETAIL, brefresh : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhExpandCounterPathA(szwildcardpath : windows_sys::core::PCSTR, mszexpandedpathlist : windows_sys::core::PSTR, pcchpathlistlength : *mut u32) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhExpandCounterPathW(szwildcardpath : windows_sys::core::PCWSTR, mszexpandedpathlist : windows_sys::core::PWSTR, pcchpathlistlength : *mut u32) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhExpandWildCardPathA(szdatasource : windows_sys::core::PCSTR, szwildcardpath : windows_sys::core::PCSTR, mszexpandedpathlist : windows_sys::core::PSTR, pcchpathlistlength : *mut u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhExpandWildCardPathHA(hdatasource : PDH_HLOG, szwildcardpath : windows_sys::core::PCSTR, mszexpandedpathlist : windows_sys::core::PSTR, pcchpathlistlength : *mut u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhExpandWildCardPathHW(hdatasource : PDH_HLOG, szwildcardpath : windows_sys::core::PCWSTR, mszexpandedpathlist : windows_sys::core::PWSTR, pcchpathlistlength : *mut u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhExpandWildCardPathW(szdatasource : windows_sys::core::PCWSTR, szwildcardpath : windows_sys::core::PCWSTR, mszexpandedpathlist : windows_sys::core::PWSTR, pcchpathlistlength : *mut u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhFormatFromRawValue(dwcountertype : u32, dwformat : PDH_FMT, ptimebase : *const i64, prawvalue1 : *const PDH_RAW_COUNTER, prawvalue2 : *const PDH_RAW_COUNTER, pfmtvalue : *mut PDH_FMT_COUNTERVALUE) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetCounterInfoA(hcounter : PDH_HCOUNTER, bretrieveexplaintext : bool, pdwbuffersize : *mut u32, lpbuffer : *mut PDH_COUNTER_INFO_A) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetCounterInfoW(hcounter : PDH_HCOUNTER, bretrieveexplaintext : bool, pdwbuffersize : *mut u32, lpbuffer : *mut PDH_COUNTER_INFO_W) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetCounterTimeBase(hcounter : PDH_HCOUNTER, ptimebase : *mut i64) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDataSourceTimeRangeA(szdatasource : windows_sys::core::PCSTR, pdwnumentries : *mut u32, pinfo : *mut PDH_TIME_INFO, pdwbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDataSourceTimeRangeH(hdatasource : PDH_HLOG, pdwnumentries : *mut u32, pinfo : *mut PDH_TIME_INFO, pdwbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDataSourceTimeRangeW(szdatasource : windows_sys::core::PCWSTR, pdwnumentries : *mut u32, pinfo : *mut PDH_TIME_INFO, pdwbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDefaultPerfCounterA(szdatasource : windows_sys::core::PCSTR, szmachinename : windows_sys::core::PCSTR, szobjectname : windows_sys::core::PCSTR, szdefaultcountername : windows_sys::core::PSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDefaultPerfCounterHA(hdatasource : PDH_HLOG, szmachinename : windows_sys::core::PCSTR, szobjectname : windows_sys::core::PCSTR, szdefaultcountername : windows_sys::core::PSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDefaultPerfCounterHW(hdatasource : PDH_HLOG, szmachinename : windows_sys::core::PCWSTR, szobjectname : windows_sys::core::PCWSTR, szdefaultcountername : windows_sys::core::PWSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDefaultPerfCounterW(szdatasource : windows_sys::core::PCWSTR, szmachinename : windows_sys::core::PCWSTR, szobjectname : windows_sys::core::PCWSTR, szdefaultcountername : windows_sys::core::PWSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDefaultPerfObjectA(szdatasource : windows_sys::core::PCSTR, szmachinename : windows_sys::core::PCSTR, szdefaultobjectname : windows_sys::core::PSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDefaultPerfObjectHA(hdatasource : PDH_HLOG, szmachinename : windows_sys::core::PCSTR, szdefaultobjectname : windows_sys::core::PSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDefaultPerfObjectHW(hdatasource : PDH_HLOG, szmachinename : windows_sys::core::PCWSTR, szdefaultobjectname : windows_sys::core::PWSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDefaultPerfObjectW(szdatasource : windows_sys::core::PCWSTR, szmachinename : windows_sys::core::PCWSTR, szdefaultobjectname : windows_sys::core::PWSTR, pcchbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetDllVersion(lpdwversion : *mut PDH_DLL_VERSION) -> u32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetFormattedCounterArrayA(hcounter : PDH_HCOUNTER, dwformat : PDH_FMT, lpdwbuffersize : *mut u32, lpdwitemcount : *mut u32, itembuffer : *mut PDH_FMT_COUNTERVALUE_ITEM_A) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetFormattedCounterArrayW(hcounter : PDH_HCOUNTER, dwformat : PDH_FMT, lpdwbuffersize : *mut u32, lpdwitemcount : *mut u32, itembuffer : *mut PDH_FMT_COUNTERVALUE_ITEM_W) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetFormattedCounterValue(hcounter : PDH_HCOUNTER, dwformat : PDH_FMT, lpdwtype : *mut u32, pvalue : *mut PDH_FMT_COUNTERVALUE) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetLogFileSize(hlog : PDH_HLOG, llsize : *mut i64) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetLogSetGUID(hlog : PDH_HLOG, pguid : *mut windows_sys::core::GUID, prunid : *mut i32) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetRawCounterArrayA(hcounter : PDH_HCOUNTER, lpdwbuffersize : *mut u32, lpdwitemcount : *mut u32, itembuffer : *mut PDH_RAW_COUNTER_ITEM_A) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetRawCounterArrayW(hcounter : PDH_HCOUNTER, lpdwbuffersize : *mut u32, lpdwitemcount : *mut u32, itembuffer : *mut PDH_RAW_COUNTER_ITEM_W) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhGetRawCounterValue(hcounter : PDH_HCOUNTER, lpdwtype : *mut u32, pvalue : *mut PDH_RAW_COUNTER) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhIsRealTimeQuery(hquery : PDH_HQUERY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhLookupPerfIndexByNameA(szmachinename : windows_sys::core::PCSTR, sznamebuffer : windows_sys::core::PCSTR, pdwindex : *mut u32) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhLookupPerfIndexByNameW(szmachinename : windows_sys::core::PCWSTR, sznamebuffer : windows_sys::core::PCWSTR, pdwindex : *mut u32) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhLookupPerfNameByIndexA(szmachinename : windows_sys::core::PCSTR, dwnameindex : u32, sznamebuffer : windows_sys::core::PSTR, pcchnamebuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhLookupPerfNameByIndexW(szmachinename : windows_sys::core::PCWSTR, dwnameindex : u32, sznamebuffer : windows_sys::core::PWSTR, pcchnamebuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhMakeCounterPathA(pcounterpathelements : *const PDH_COUNTER_PATH_ELEMENTS_A, szfullpathbuffer : windows_sys::core::PSTR, pcchbuffersize : *mut u32, dwflags : PDH_PATH_FLAGS) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhMakeCounterPathW(pcounterpathelements : *const PDH_COUNTER_PATH_ELEMENTS_W, szfullpathbuffer : windows_sys::core::PWSTR, pcchbuffersize : *mut u32, dwflags : PDH_PATH_FLAGS) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhOpenLogA(szlogfilename : windows_sys::core::PCSTR, dwaccessflags : PDH_LOG, lpdwlogtype : *mut PDH_LOG_TYPE, hquery : PDH_HQUERY, dwmaxsize : u32, szusercaption : windows_sys::core::PCSTR, phlog : *mut PDH_HLOG) -> u32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhOpenLogW(szlogfilename : windows_sys::core::PCWSTR, dwaccessflags : PDH_LOG, lpdwlogtype : *mut PDH_LOG_TYPE, hquery : PDH_HQUERY, dwmaxsize : u32, szusercaption : windows_sys::core::PCWSTR, phlog : *mut PDH_HLOG) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhOpenQueryA(szdatasource : windows_sys::core::PCSTR, dwuserdata : usize, phquery : *mut PDH_HQUERY) -> u32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhOpenQueryH(hdatasource : PDH_HLOG, dwuserdata : usize, phquery : *mut PDH_HQUERY) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhOpenQueryW(szdatasource : windows_sys::core::PCWSTR, dwuserdata : usize, phquery : *mut PDH_HQUERY) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhParseCounterPathA(szfullpathbuffer : windows_sys::core::PCSTR, pcounterpathelements : *mut PDH_COUNTER_PATH_ELEMENTS_A, pdwbuffersize : *mut u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhParseCounterPathW(szfullpathbuffer : windows_sys::core::PCWSTR, pcounterpathelements : *mut PDH_COUNTER_PATH_ELEMENTS_W, pdwbuffersize : *mut u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhParseInstanceNameA(szinstancestring : windows_sys::core::PCSTR, szinstancename : windows_sys::core::PSTR, pcchinstancenamelength : *mut u32, szparentname : windows_sys::core::PSTR, pcchparentnamelength : *mut u32, lpindex : *mut u32) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhParseInstanceNameW(szinstancestring : windows_sys::core::PCWSTR, szinstancename : windows_sys::core::PWSTR, pcchinstancenamelength : *mut u32, szparentname : windows_sys::core::PWSTR, pcchparentnamelength : *mut u32, lpindex : *mut u32) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhReadRawLogRecord(hlog : PDH_HLOG, ftrecord : super::super::Foundation:: FILETIME, prawlogrecord : *mut PDH_RAW_LOG_RECORD, pdwbufferlength : *mut u32) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhRemoveCounter(hcounter : PDH_HCOUNTER) -> u32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhSelectDataSourceA(hwndowner : super::super::Foundation:: HWND, dwflags : PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource : windows_sys::core::PSTR, pcchbufferlength : *mut u32) -> u32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhSelectDataSourceW(hwndowner : super::super::Foundation:: HWND, dwflags : PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource : windows_sys::core::PWSTR, pcchbufferlength : *mut u32) -> u32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhSetCounterScaleFactor(hcounter : PDH_HCOUNTER, lfactor : i32) -> u32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhSetDefaultRealTimeDataSource(dwdatasourceid : REAL_TIME_DATA_SOURCE_ID_FLAGS) -> u32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhSetLogSetRunID(hlog : PDH_HLOG, runid : i32) -> u32);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhSetQueryTimeRange(hquery : PDH_HQUERY, pinfo : *const PDH_TIME_INFO) -> u32);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhUpdateLogA(hlog : PDH_HLOG, szuserstring : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhUpdateLogFileCatalog(hlog : PDH_HLOG) -> u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhUpdateLogW(hlog : PDH_HLOG, szuserstring : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhValidatePathA(szfullpathbuffer : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhValidatePathExA(hdatasource : PDH_HLOG, szfullpathbuffer : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhValidatePathExW(hdatasource : PDH_HLOG, szfullpathbuffer : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhValidatePathW(szfullpathbuffer : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhVerifySQLDBA(szdatasource : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("pdh.dll" "system" fn PdhVerifySQLDBW(szdatasource : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfAddCounters(hquery : super::super::Foundation:: HANDLE, pcounters : *mut PERF_COUNTER_IDENTIFIER, cbcounters : u32) -> u32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfCloseQueryHandle(hquery : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfCreateInstance(providerhandle : super::super::Foundation:: HANDLE, countersetguid : *const windows_sys::core::GUID, name : windows_sys::core::PCWSTR, id : u32) -> *mut PERF_COUNTERSET_INSTANCE);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfDecrementULongCounterValue(provider : super::super::Foundation:: HANDLE, instance : *mut PERF_COUNTERSET_INSTANCE, counterid : u32, value : u32) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfDecrementULongLongCounterValue(provider : super::super::Foundation:: HANDLE, instance : *mut PERF_COUNTERSET_INSTANCE, counterid : u32, value : u64) -> u32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfDeleteCounters(hquery : super::super::Foundation:: HANDLE, pcounters : *mut PERF_COUNTER_IDENTIFIER, cbcounters : u32) -> u32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfDeleteInstance(provider : super::super::Foundation:: HANDLE, instanceblock : *const PERF_COUNTERSET_INSTANCE) -> u32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfEnumerateCounterSet(szmachine : windows_sys::core::PCWSTR, pcountersetids : *mut windows_sys::core::GUID, ccountersetids : u32, pccountersetidsactual : *mut u32) -> u32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfEnumerateCounterSetInstances(szmachine : windows_sys::core::PCWSTR, pcountersetid : *const windows_sys::core::GUID, pinstances : *mut PERF_INSTANCE_HEADER, cbinstances : u32, pcbinstancesactual : *mut u32) -> u32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfIncrementULongCounterValue(provider : super::super::Foundation:: HANDLE, instance : *mut PERF_COUNTERSET_INSTANCE, counterid : u32, value : u32) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfIncrementULongLongCounterValue(provider : super::super::Foundation:: HANDLE, instance : *mut PERF_COUNTERSET_INSTANCE, counterid : u32, value : u64) -> u32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfOpenQueryHandle(szmachine : windows_sys::core::PCWSTR, phquery : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfQueryCounterData(hquery : super::super::Foundation:: HANDLE, pcounterblock : *mut PERF_DATA_HEADER, cbcounterblock : u32, pcbcounterblockactual : *mut u32) -> u32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfQueryCounterInfo(hquery : super::super::Foundation:: HANDLE, pcounters : *mut PERF_COUNTER_IDENTIFIER, cbcounters : u32, pcbcountersactual : *mut u32) -> u32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfQueryCounterSetRegistrationInfo(szmachine : windows_sys::core::PCWSTR, pcountersetid : *const windows_sys::core::GUID, requestcode : PerfRegInfoType, requestlangid : u32, pbreginfo : *mut u8, cbreginfo : u32, pcbreginfoactual : *mut u32) -> u32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfQueryInstance(providerhandle : super::super::Foundation:: HANDLE, countersetguid : *const windows_sys::core::GUID, name : windows_sys::core::PCWSTR, id : u32) -> *mut PERF_COUNTERSET_INSTANCE);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfSetCounterRefValue(provider : super::super::Foundation:: HANDLE, instance : *mut PERF_COUNTERSET_INSTANCE, counterid : u32, address : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfSetCounterSetInfo(providerhandle : super::super::Foundation:: HANDLE, template : *mut PERF_COUNTERSET_INFO, templatesize : u32) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfSetULongCounterValue(provider : super::super::Foundation:: HANDLE, instance : *mut PERF_COUNTERSET_INSTANCE, counterid : u32, value : u32) -> u32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfSetULongLongCounterValue(provider : super::super::Foundation:: HANDLE, instance : *mut PERF_COUNTERSET_INSTANCE, counterid : u32, value : u64) -> u32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfStartProvider(providerguid : *const windows_sys::core::GUID, controlcallback : PERFLIBREQUEST, phprovider : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfStartProviderEx(providerguid : *const windows_sys::core::GUID, providercontext : *const PERF_PROVIDER_CONTEXT, provider : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PerfStopProvider(providerhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryPerformanceCounter(lpperformancecount : *mut i64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryPerformanceFrequency(lpfrequency : *mut i64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn RestorePerfRegistryFromFileW(szfilename : windows_sys::core::PCWSTR, szlangid : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn SetServiceAsTrustedA(szreserved : windows_sys::core::PCSTR, szservicename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn SetServiceAsTrustedW(szreserved : windows_sys::core::PCWSTR, szservicename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn UnloadPerfCounterTextStringsA(lpcommandline : windows_sys::core::PCSTR, bquietmodearg : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn UnloadPerfCounterTextStringsW(lpcommandline : windows_sys::core::PCWSTR, bquietmodearg : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn UpdatePerfNameFilesA(sznewctrfilepath : windows_sys::core::PCSTR, sznewhlpfilepath : windows_sys::core::PCSTR, szlanguageid : windows_sys::core::PCSTR, dwflags : usize) -> u32);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("loadperf.dll" "system" fn UpdatePerfNameFilesW(sznewctrfilepath : windows_sys::core::PCWSTR, sznewhlpfilepath : windows_sys::core::PCWSTR, szlanguageid : windows_sys::core::PCWSTR, dwflags : usize) -> u32);

// UNSUPPORTED Rust 138:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AppearPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe49741e9_93a8_4ab1_8e96_bf4482282e9c);

public typealias `AutoPathFormat` = Int;
// UNSUPPORTED Rust 140:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const BootTraceSession: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837538_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 141:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const BootTraceSessionCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837539_098b_11d8_9414_505054503030);

public typealias `ClockType` = Int;
public typealias `CommitMode` = Int;
// UNSUPPORTED Rust 144:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CounterItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4d2d8e0_d1dd_11ce_940f_008029004348);

// UNSUPPORTED Rust 145:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CounterItem2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43196c62_c31f_4ce3_a02e_79efe0f6a525);

// UNSUPPORTED Rust 146:1: generic scalar type unsupported
// pub type CounterPathCallBack = Option<unsafe extern "system" fn(param0: usize) -> i32>;

// UNSUPPORTED Rust 147:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CounterPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf948561_ede8_11ce_941e_008029004347);

// UNSUPPORTED Rust 148:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Counters: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2b066d2_2aac_11cf_942f_008029004347);

public const val `DATA_SOURCE_REGISTRY`: `REAL_TIME_DATA_SOURCE_ID_FLAGS` = 1u;
public const val `DATA_SOURCE_WBEM`: `REAL_TIME_DATA_SOURCE_ID_FLAGS` = 4u;
// UNSUPPORTED Rust 151:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DIID_DICounterItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc08c4ff2_0e2e_11cf_942c_008029004347);

// UNSUPPORTED Rust 152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DIID_DILogFileItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8d093ffc_f777_4917_82d1_833fbc54c58f);

// UNSUPPORTED Rust 153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DIID_DISystemMonitor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13d73d81_c32e_11cf_9398_00aa00a3ddea);

// UNSUPPORTED Rust 154:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DIID_DISystemMonitorEvents: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x84979930_4ab3_11cf_943a_008029004347);

// UNSUPPORTED Rust 155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DIID_DISystemMonitorInternal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x194eb242_c32c_11cf_9398_00aa00a3ddea);

// UNSUPPORTED Rust 156:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DataCollectorSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837521_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 157:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DataCollectorSetCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837525_098b_11d8_9414_505054503030);

public typealias `DataCollectorSetStatus` = Int;
public typealias `DataCollectorType` = Int;
public typealias `DataManagerSteps` = Int;
public typealias `DataSourceTypeConstants` = Int;
public typealias `DisplayTypeConstants` = Int;
public typealias `FileFormat` = Int;
public typealias `FolderActionSteps` = Int;
// UNSUPPORTED Rust 165:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GeneralPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc3e5d3d2_1a03_11cf_942d_008029004347);

// UNSUPPORTED Rust 166:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GraphPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc3e5d3d3_1a03_11cf_942d_008029004347);

public const val `H_WBEM_DATASOURCE`: Int = -1;
// UNSUPPORTED Rust 168:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LIBID_SystemMonitor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b773e42_2509_11cf_942f_008029004347);

// UNSUPPORTED Rust 169:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LegacyDataCollectorSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837526_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 170:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LegacyDataCollectorSetCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837527_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 171:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LegacyTraceSession: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837528_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 172:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LegacyTraceSessionCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837529_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 173:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LogFileItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16ec5be8_df93_4237_94e4_9ee918111d71);

// UNSUPPORTED Rust 174:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LogFiles: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2735d9fd_f6b9_4f19_a5d9_e2d068584bc5);

public const val `MAX_COUNTER_PATH`: UInt = 256u;
public const val `MAX_PERF_OBJECTS_IN_QUERY_FUNCTION`: Int = 64;
public const val `PDH_ACCESS_DENIED`: UInt = 3221228507u;
public const val `PDH_ASYNC_QUERY_TIMEOUT`: UInt = 2147485659u;
public const val `PDH_BINARY_LOG_CORRUPT`: UInt = 3221228535u;
// UNSUPPORTED Rust 180:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_BROWSE_DLG_CONFIG_A {
//     pub _bitfield: u32,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub szDataSource: windows_sys::core::PSTR,
//     pub szReturnPathBuffer: windows_sys::core::PSTR,
//     pub cchReturnPathLength: u32,
//     pub pCallBack: CounterPathCallBack,
//     pub dwCallBackArg: usize,
//     pub CallBackStatus: i32,
//     pub dwDefaultDetailLevel: PERF_DETAIL,
//     pub szDialogBoxCaption: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 194:1: declaration Impl has no candidate rule
// impl Default for PDH_BROWSE_DLG_CONFIG_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 199:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_BROWSE_DLG_CONFIG_HA {
//     pub _bitfield: u32,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub hDataSource: PDH_HLOG,
//     pub szReturnPathBuffer: windows_sys::core::PSTR,
//     pub cchReturnPathLength: u32,
//     pub pCallBack: CounterPathCallBack,
//     pub dwCallBackArg: usize,
//     pub CallBackStatus: i32,
//     pub dwDefaultDetailLevel: PERF_DETAIL,
//     pub szDialogBoxCaption: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 213:1: declaration Impl has no candidate rule
// impl Default for PDH_BROWSE_DLG_CONFIG_HA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 218:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_BROWSE_DLG_CONFIG_HW {
//     pub _bitfield: u32,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub hDataSource: PDH_HLOG,
//     pub szReturnPathBuffer: windows_sys::core::PWSTR,
//     pub cchReturnPathLength: u32,
//     pub pCallBack: CounterPathCallBack,
//     pub dwCallBackArg: usize,
//     pub CallBackStatus: i32,
//     pub dwDefaultDetailLevel: PERF_DETAIL,
//     pub szDialogBoxCaption: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 232:1: declaration Impl has no candidate rule
// impl Default for PDH_BROWSE_DLG_CONFIG_HW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_BROWSE_DLG_CONFIG_W {
//     pub _bitfield: u32,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub szDataSource: windows_sys::core::PWSTR,
//     pub szReturnPathBuffer: windows_sys::core::PWSTR,
//     pub cchReturnPathLength: u32,
//     pub pCallBack: CounterPathCallBack,
//     pub dwCallBackArg: usize,
//     pub CallBackStatus: i32,
//     pub dwDefaultDetailLevel: PERF_DETAIL,
//     pub szDialogBoxCaption: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 251:1: declaration Impl has no candidate rule
// impl Default for PDH_BROWSE_DLG_CONFIG_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_CALC_NEGATIVE_DENOMINATOR`: UInt = 2147485654u;
public const val `PDH_CALC_NEGATIVE_TIMEBASE`: UInt = 2147485655u;
public const val `PDH_CALC_NEGATIVE_VALUE`: UInt = 2147485656u;
public const val `PDH_CANNOT_CONNECT_MACHINE`: UInt = 3221228483u;
public const val `PDH_CANNOT_CONNECT_WMI_SERVER`: UInt = 3221228520u;
public const val `PDH_CANNOT_READ_NAME_STRINGS`: UInt = 3221228488u;
public const val `PDH_CANNOT_SET_DEFAULT_REALTIME_DATASOURCE`: UInt = 2147485660u;
public const val `PDH_COUNTER_ALREADY_IN_QUERY`: UInt = 3221228534u;
// UNSUPPORTED Rust 264:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_COUNTER_INFO_A {
//     pub dwLength: u32,
//     pub dwType: u32,
//     pub CVersion: u32,
//     pub CStatus: u32,
//     pub lScale: i32,
//     pub lDefaultScale: i32,
//     pub dwUserData: usize,
//     pub dwQueryUserData: usize,
//     pub szFullPath: windows_sys::core::PSTR,
//     pub Anonymous: PDH_COUNTER_INFO_A_0,
//     pub szExplainText: windows_sys::core::PSTR,
//     pub DataBuffer: [u32; 1],
// }

// UNSUPPORTED Rust 280:1: declaration Impl has no candidate rule
// impl Default for PDH_COUNTER_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 285:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_COUNTER_INFO_A_0 {
//     pub DataItemPath: PDH_DATA_ITEM_PATH_ELEMENTS_A,
//     pub CounterPath: PDH_COUNTER_PATH_ELEMENTS_A,
//     pub Anonymous: PDH_COUNTER_INFO_A_0_0,
// }

// UNSUPPORTED Rust 292:1: declaration Impl has no candidate rule
// impl Default for PDH_COUNTER_INFO_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_COUNTER_INFO_A_0_0 {
//     pub szMachineName: windows_sys::core::PSTR,
//     pub szObjectName: windows_sys::core::PSTR,
//     pub szInstanceName: windows_sys::core::PSTR,
//     pub szParentInstance: windows_sys::core::PSTR,
//     pub dwInstanceIndex: u32,
//     pub szCounterName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 307:1: declaration Impl has no candidate rule
// impl Default for PDH_COUNTER_INFO_A_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_COUNTER_INFO_W {
//     pub dwLength: u32,
//     pub dwType: u32,
//     pub CVersion: u32,
//     pub CStatus: u32,
//     pub lScale: i32,
//     pub lDefaultScale: i32,
//     pub dwUserData: usize,
//     pub dwQueryUserData: usize,
//     pub szFullPath: windows_sys::core::PWSTR,
//     pub Anonymous: PDH_COUNTER_INFO_W_0,
//     pub szExplainText: windows_sys::core::PWSTR,
//     pub DataBuffer: [u32; 1],
// }

// UNSUPPORTED Rust 328:1: declaration Impl has no candidate rule
// impl Default for PDH_COUNTER_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 333:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_COUNTER_INFO_W_0 {
//     pub DataItemPath: PDH_DATA_ITEM_PATH_ELEMENTS_W,
//     pub CounterPath: PDH_COUNTER_PATH_ELEMENTS_W,
//     pub Anonymous: PDH_COUNTER_INFO_W_0_0,
// }

// UNSUPPORTED Rust 340:1: declaration Impl has no candidate rule
// impl Default for PDH_COUNTER_INFO_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 345:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_COUNTER_INFO_W_0_0 {
//     pub szMachineName: windows_sys::core::PWSTR,
//     pub szObjectName: windows_sys::core::PWSTR,
//     pub szInstanceName: windows_sys::core::PWSTR,
//     pub szParentInstance: windows_sys::core::PWSTR,
//     pub dwInstanceIndex: u32,
//     pub szCounterName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 355:1: declaration Impl has no candidate rule
// impl Default for PDH_COUNTER_INFO_W_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 360:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_COUNTER_PATH_ELEMENTS_A {
//     pub szMachineName: windows_sys::core::PSTR,
//     pub szObjectName: windows_sys::core::PSTR,
//     pub szInstanceName: windows_sys::core::PSTR,
//     pub szParentInstance: windows_sys::core::PSTR,
//     pub dwInstanceIndex: u32,
//     pub szCounterName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 370:1: declaration Impl has no candidate rule
// impl Default for PDH_COUNTER_PATH_ELEMENTS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 375:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_COUNTER_PATH_ELEMENTS_W {
//     pub szMachineName: windows_sys::core::PWSTR,
//     pub szObjectName: windows_sys::core::PWSTR,
//     pub szInstanceName: windows_sys::core::PWSTR,
//     pub szParentInstance: windows_sys::core::PWSTR,
//     pub dwInstanceIndex: u32,
//     pub szCounterName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 385:1: declaration Impl has no candidate rule
// impl Default for PDH_COUNTER_PATH_ELEMENTS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_CSTATUS_BAD_COUNTERNAME`: UInt = 3221228480u;
public const val `PDH_CSTATUS_INVALID_DATA`: UInt = 3221228474u;
public const val `PDH_CSTATUS_ITEM_NOT_VALIDATED`: UInt = 2147485651u;
public const val `PDH_CSTATUS_NEW_DATA`: UInt = 1u;
public const val `PDH_CSTATUS_NO_COUNTER`: UInt = 3221228473u;
public const val `PDH_CSTATUS_NO_COUNTERNAME`: UInt = 3221228479u;
public const val `PDH_CSTATUS_NO_INSTANCE`: UInt = 2147485649u;
public const val `PDH_CSTATUS_NO_MACHINE`: UInt = 2147485648u;
public const val `PDH_CSTATUS_NO_OBJECT`: UInt = 3221228472u;
public const val `PDH_CSTATUS_VALID_DATA`: UInt = 0u;
public const val `PDH_CVERSION_WIN50`: `PDH_DLL_VERSION` = 1280u;
// UNSUPPORTED Rust 401:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_DATA_ITEM_PATH_ELEMENTS_A {
//     pub szMachineName: windows_sys::core::PSTR,
//     pub ObjectGUID: windows_sys::core::GUID,
//     pub dwItemId: u32,
//     pub szInstanceName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 409:1: declaration Impl has no candidate rule
// impl Default for PDH_DATA_ITEM_PATH_ELEMENTS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 414:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_DATA_ITEM_PATH_ELEMENTS_W {
//     pub szMachineName: windows_sys::core::PWSTR,
//     pub ObjectGUID: windows_sys::core::GUID,
//     pub dwItemId: u32,
//     pub szInstanceName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 422:1: declaration Impl has no candidate rule
// impl Default for PDH_DATA_ITEM_PATH_ELEMENTS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_DATA_SOURCE_IS_LOG_FILE`: UInt = 3221228494u;
public const val `PDH_DATA_SOURCE_IS_REAL_TIME`: UInt = 3221228495u;
public const val `PDH_DIALOG_CANCELLED`: UInt = 2147485657u;
public typealias `PDH_DLL_VERSION` = UInt;
public const val `PDH_END_OF_LOG_FILE`: UInt = 2147485658u;
public const val `PDH_ENTRY_NOT_IN_LOG_FILE`: UInt = 3221228493u;
public const val `PDH_FILE_ALREADY_EXISTS`: UInt = 3221228498u;
public const val `PDH_FILE_NOT_FOUND`: UInt = 3221228497u;
public const val `PDH_FLAGS_FILE_BROWSER_ONLY`: `PDH_SELECT_DATA_SOURCE_FLAGS` = 1u;
public const val `PDH_FLAGS_NONE`: `PDH_SELECT_DATA_SOURCE_FLAGS` = 0u;
public typealias `PDH_FMT` = UInt;
// UNSUPPORTED Rust 438:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_FMT_COUNTERVALUE {
//     pub CStatus: u32,
//     pub Anonymous: PDH_FMT_COUNTERVALUE_0,
// }

// UNSUPPORTED Rust 444:1: declaration Impl has no candidate rule
// impl Default for PDH_FMT_COUNTERVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 449:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_FMT_COUNTERVALUE_0 {
//     pub longValue: i32,
//     pub doubleValue: f64,
//     pub largeValue: i64,
//     pub AnsiStringValue: windows_sys::core::PCSTR,
//     pub WideStringValue: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 458:1: declaration Impl has no candidate rule
// impl Default for PDH_FMT_COUNTERVALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_FMT_COUNTERVALUE_ITEM_A {
//     pub szName: windows_sys::core::PSTR,
//     pub FmtValue: PDH_FMT_COUNTERVALUE,
// }

// UNSUPPORTED Rust 469:1: declaration Impl has no candidate rule
// impl Default for PDH_FMT_COUNTERVALUE_ITEM_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 474:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_FMT_COUNTERVALUE_ITEM_W {
//     pub szName: windows_sys::core::PWSTR,
//     pub FmtValue: PDH_FMT_COUNTERVALUE,
// }

// UNSUPPORTED Rust 480:1: declaration Impl has no candidate rule
// impl Default for PDH_FMT_COUNTERVALUE_ITEM_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_FMT_DOUBLE`: `PDH_FMT` = 512u;
public const val `PDH_FMT_LARGE`: `PDH_FMT` = 1024u;
public const val `PDH_FMT_LONG`: `PDH_FMT` = 256u;
public const val `PDH_FUNCTION_NOT_FOUND`: UInt = 3221228478u;
// UNSUPPORTED Rust 489:1: non-scalar type Ptr unsupported
// pub type PDH_HCOUNTER = *mut core::ffi::c_void;

// UNSUPPORTED Rust 490:1: non-scalar type Ptr unsupported
// pub type PDH_HLOG = *mut core::ffi::c_void;

// UNSUPPORTED Rust 491:1: non-scalar type Ptr unsupported
// pub type PDH_HQUERY = *mut core::ffi::c_void;

public const val `PDH_INCORRECT_APPEND_TIME`: UInt = 3221228539u;
public const val `PDH_INSUFFICIENT_BUFFER`: UInt = 3221228482u;
public const val `PDH_INVALID_ARGUMENT`: UInt = 3221228477u;
public const val `PDH_INVALID_BUFFER`: UInt = 3221228481u;
public const val `PDH_INVALID_DATA`: UInt = 3221228486u;
public const val `PDH_INVALID_DATASOURCE`: UInt = 3221228509u;
public const val `PDH_INVALID_HANDLE`: UInt = 3221228476u;
public const val `PDH_INVALID_INSTANCE`: UInt = 3221228485u;
public const val `PDH_INVALID_PATH`: UInt = 3221228484u;
public const val `PDH_INVALID_SQLDB`: UInt = 3221228510u;
public const val `PDH_INVALID_SQL_LOG_FORMAT`: UInt = 3221228533u;
public typealias `PDH_LOG` = UInt;
public const val `PDH_LOGSVC_NOT_OPENED`: UInt = 3221228505u;
public const val `PDH_LOGSVC_QUERY_NOT_FOUND`: UInt = 3221228504u;
public const val `PDH_LOG_FILE_CREATE_ERROR`: UInt = 3221228489u;
public const val `PDH_LOG_FILE_OPEN_ERROR`: UInt = 3221228490u;
public const val `PDH_LOG_FILE_TOO_SMALL`: UInt = 3221228508u;
public const val `PDH_LOG_READ_ACCESS`: `PDH_LOG` = 65536u;
public const val `PDH_LOG_SAMPLE_TOO_SMALL`: UInt = 3221228536u;
// UNSUPPORTED Rust 511:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_LOG_SERVICE_QUERY_INFO_A {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwLogQuota: u32,
//     pub szLogFileCaption: windows_sys::core::PSTR,
//     pub szDefaultDir: windows_sys::core::PSTR,
//     pub szBaseFileName: windows_sys::core::PSTR,
//     pub dwFileType: u32,
//     pub dwReserved: u32,
//     pub Anonymous: PDH_LOG_SERVICE_QUERY_INFO_A_0,
// }

// UNSUPPORTED Rust 524:1: declaration Impl has no candidate rule
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 529:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_LOG_SERVICE_QUERY_INFO_A_0 {
//     pub Anonymous1: PDH_LOG_SERVICE_QUERY_INFO_A_0_0,
//     pub Anonymous2: PDH_LOG_SERVICE_QUERY_INFO_A_0_1,
// }

// UNSUPPORTED Rust 535:1: declaration Impl has no candidate rule
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 540:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_LOG_SERVICE_QUERY_INFO_A_0_0 {
//     pub PdlAutoNameInterval: u32,
//     pub PdlAutoNameUnits: u32,
//     pub PdlCommandFilename: windows_sys::core::PSTR,
//     pub PdlCounterList: windows_sys::core::PSTR,
//     pub PdlAutoNameFormat: u32,
//     pub PdlSampleInterval: u32,
//     pub PdlLogStartTime: super::super::Foundation::FILETIME,
//     pub PdlLogEndTime: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 552:1: declaration Impl has no candidate rule
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_A_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 557:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_LOG_SERVICE_QUERY_INFO_A_0_1 {
//     pub TlNumberOfBuffers: u32,
//     pub TlMinimumBuffers: u32,
//     pub TlMaximumBuffers: u32,
//     pub TlFreeBuffers: u32,
//     pub TlBufferSize: u32,
//     pub TlEventsLost: u32,
//     pub TlLoggerThreadId: u32,
//     pub TlBuffersWritten: u32,
//     pub TlLogHandle: u32,
//     pub TlLogFileName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 571:1: declaration Impl has no candidate rule
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_A_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 576:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_LOG_SERVICE_QUERY_INFO_W {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwLogQuota: u32,
//     pub szLogFileCaption: windows_sys::core::PWSTR,
//     pub szDefaultDir: windows_sys::core::PWSTR,
//     pub szBaseFileName: windows_sys::core::PWSTR,
//     pub dwFileType: u32,
//     pub dwReserved: u32,
//     pub Anonymous: PDH_LOG_SERVICE_QUERY_INFO_W_0,
// }

// UNSUPPORTED Rust 589:1: declaration Impl has no candidate rule
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 594:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_LOG_SERVICE_QUERY_INFO_W_0 {
//     pub Anonymous1: PDH_LOG_SERVICE_QUERY_INFO_W_0_0,
//     pub Anonymous2: PDH_LOG_SERVICE_QUERY_INFO_W_0_1,
// }

// UNSUPPORTED Rust 600:1: declaration Impl has no candidate rule
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 605:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_LOG_SERVICE_QUERY_INFO_W_0_0 {
//     pub PdlAutoNameInterval: u32,
//     pub PdlAutoNameUnits: u32,
//     pub PdlCommandFilename: windows_sys::core::PWSTR,
//     pub PdlCounterList: windows_sys::core::PWSTR,
//     pub PdlAutoNameFormat: u32,
//     pub PdlSampleInterval: u32,
//     pub PdlLogStartTime: super::super::Foundation::FILETIME,
//     pub PdlLogEndTime: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 617:1: declaration Impl has no candidate rule
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_W_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 622:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_LOG_SERVICE_QUERY_INFO_W_0_1 {
//     pub TlNumberOfBuffers: u32,
//     pub TlMinimumBuffers: u32,
//     pub TlMaximumBuffers: u32,
//     pub TlFreeBuffers: u32,
//     pub TlBufferSize: u32,
//     pub TlEventsLost: u32,
//     pub TlLoggerThreadId: u32,
//     pub TlBuffersWritten: u32,
//     pub TlLogHandle: u32,
//     pub TlLogFileName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 636:1: declaration Impl has no candidate rule
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_W_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PDH_LOG_TYPE` = UInt;
public const val `PDH_LOG_TYPE_BINARY`: `PDH_LOG_TYPE` = 8u;
public const val `PDH_LOG_TYPE_CSV`: `PDH_LOG_TYPE` = 1u;
public const val `PDH_LOG_TYPE_NOT_FOUND`: UInt = 3221228491u;
public const val `PDH_LOG_TYPE_PERFMON`: `PDH_LOG_TYPE` = 6u;
public const val `PDH_LOG_TYPE_RETIRED_BIN`: UInt = 3u;
public const val `PDH_LOG_TYPE_SQL`: `PDH_LOG_TYPE` = 7u;
public const val `PDH_LOG_TYPE_TRACE_GENERIC`: UInt = 5u;
public const val `PDH_LOG_TYPE_TRACE_KERNEL`: UInt = 4u;
public const val `PDH_LOG_TYPE_TSV`: `PDH_LOG_TYPE` = 2u;
public const val `PDH_LOG_TYPE_UNDEFINED`: `PDH_LOG_TYPE` = 0u;
public const val `PDH_LOG_UPDATE_ACCESS`: `PDH_LOG` = 262144u;
public const val `PDH_LOG_WRITE_ACCESS`: `PDH_LOG` = 131072u;
public const val `PDH_MAX_COUNTER_NAME`: UInt = 1024u;
public const val `PDH_MAX_COUNTER_PATH`: UInt = 2048u;
public const val `PDH_MAX_DATASOURCE_PATH`: UInt = 1024u;
public const val `PDH_MAX_INSTANCE_NAME`: UInt = 1024u;
public const val `PDH_MAX_SCALE`: Int = 7;
public const val `PDH_MEMORY_ALLOCATION_FAILURE`: UInt = 3221228475u;
public const val `PDH_MIN_SCALE`: Int = -7;
public const val `PDH_MORE_DATA`: UInt = 2147485650u;
public const val `PDH_NOEXPANDCOUNTERS`: UInt = 1u;
public const val `PDH_NOEXPANDINSTANCES`: UInt = 2u;
public const val `PDH_NOT_IMPLEMENTED`: UInt = 3221228499u;
public const val `PDH_NO_COUNTERS`: UInt = 3221228511u;
public const val `PDH_NO_DATA`: UInt = 2147485653u;
public const val `PDH_NO_DIALOG_DATA`: UInt = 3221228487u;
public const val `PDH_NO_MORE_DATA`: UInt = 3221228492u;
public const val `PDH_OS_EARLIER_VERSION`: UInt = 3221228538u;
public const val `PDH_OS_LATER_VERSION`: UInt = 3221228537u;
public typealias `PDH_PATH_FLAGS` = UInt;
public const val `PDH_PATH_WBEM_INPUT`: `PDH_PATH_FLAGS` = 2u;
public const val `PDH_PATH_WBEM_NONE`: `PDH_PATH_FLAGS` = 0u;
public const val `PDH_PATH_WBEM_RESULT`: `PDH_PATH_FLAGS` = 1u;
public const val `PDH_PLA_COLLECTION_ALREADY_RUNNING`: UInt = 3221228521u;
public const val `PDH_PLA_COLLECTION_NOT_FOUND`: UInt = 3221228523u;
public const val `PDH_PLA_ERROR_ALREADY_EXISTS`: UInt = 3221228526u;
public const val `PDH_PLA_ERROR_FILEPATH`: UInt = 3221228528u;
public const val `PDH_PLA_ERROR_NAME_TOO_LONG`: UInt = 3221228532u;
public const val `PDH_PLA_ERROR_NOSTART`: UInt = 3221228525u;
public const val `PDH_PLA_ERROR_SCHEDULE_ELAPSED`: UInt = 3221228524u;
public const val `PDH_PLA_ERROR_SCHEDULE_OVERLAP`: UInt = 3221228522u;
public const val `PDH_PLA_ERROR_TYPE_MISMATCH`: UInt = 3221228527u;
public const val `PDH_PLA_SERVICE_ERROR`: UInt = 3221228529u;
public const val `PDH_PLA_VALIDATION_ERROR`: UInt = 3221228530u;
public const val `PDH_PLA_VALIDATION_WARNING`: UInt = 2147486707u;
public const val `PDH_QUERY_PERF_DATA_TIMEOUT`: UInt = 3221228542u;
// UNSUPPORTED Rust 688:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PDH_RAW_COUNTER {
//     pub CStatus: u32,
//     pub TimeStamp: super::super::Foundation::FILETIME,
//     pub FirstValue: i64,
//     pub SecondValue: i64,
//     pub MultiCount: u32,
// }

// UNSUPPORTED Rust 697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_RAW_COUNTER_ITEM_A {
//     pub szName: windows_sys::core::PSTR,
//     pub RawValue: PDH_RAW_COUNTER,
// }

// UNSUPPORTED Rust 703:1: declaration Impl has no candidate rule
// impl Default for PDH_RAW_COUNTER_ITEM_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 708:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_RAW_COUNTER_ITEM_W {
//     pub szName: windows_sys::core::PWSTR,
//     pub RawValue: PDH_RAW_COUNTER,
// }

// UNSUPPORTED Rust 714:1: declaration Impl has no candidate rule
// impl Default for PDH_RAW_COUNTER_ITEM_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 719:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_RAW_LOG_RECORD {
//     pub dwStructureSize: u32,
//     pub dwRecordType: PDH_LOG_TYPE,
//     pub dwItems: u32,
//     pub RawBytes: [u8; 1],
// }

// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule
// impl Default for PDH_RAW_LOG_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_REFRESHCOUNTERS`: UInt = 4u;
public const val `PDH_RETRY`: UInt = 2147485652u;
public typealias `PDH_SELECT_DATA_SOURCE_FLAGS` = UInt;
public const val `PDH_SQL_ALLOCCON_FAILED`: UInt = 3221228513u;
public const val `PDH_SQL_ALLOC_FAILED`: UInt = 3221228512u;
public const val `PDH_SQL_ALTER_DETAIL_FAILED`: UInt = 3221228541u;
public const val `PDH_SQL_BIND_FAILED`: UInt = 3221228519u;
public const val `PDH_SQL_CONNECT_FAILED`: UInt = 3221228518u;
public const val `PDH_SQL_EXEC_DIRECT_FAILED`: UInt = 3221228514u;
public const val `PDH_SQL_FETCH_FAILED`: UInt = 3221228515u;
public const val `PDH_SQL_MORE_RESULTS_FAILED`: UInt = 3221228517u;
public const val `PDH_SQL_ROWCOUNT_FAILED`: UInt = 3221228516u;
// UNSUPPORTED Rust 744:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_STATISTICS {
//     pub dwFormat: u32,
//     pub count: u32,
//     pub min: PDH_FMT_COUNTERVALUE,
//     pub max: PDH_FMT_COUNTERVALUE,
//     pub mean: PDH_FMT_COUNTERVALUE,
// }

// UNSUPPORTED Rust 753:1: declaration Impl has no candidate rule
// impl Default for PDH_STATISTICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_STRING_NOT_FOUND`: UInt = 3221228500u;
// UNSUPPORTED Rust 759:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PDH_TIME_INFO {
//     pub StartTime: i64,
//     pub EndTime: i64,
//     pub SampleCount: u32,
// }

public const val `PDH_UNABLE_MAP_NAME_FILES`: UInt = 2147486677u;
public const val `PDH_UNABLE_READ_LOG_HEADER`: UInt = 3221228496u;
public const val `PDH_UNKNOWN_LOGSVC_COMMAND`: UInt = 3221228503u;
public const val `PDH_UNKNOWN_LOG_FORMAT`: UInt = 3221228502u;
public const val `PDH_UNMATCHED_APPEND_COUNTER`: UInt = 3221228540u;
public const val `PDH_VERSION`: `PDH_DLL_VERSION` = 1283u;
public const val `PDH_WBEM_ERROR`: UInt = 3221228506u;
// UNSUPPORTED Rust 773:1: generic scalar type unsupported
// pub type PERFLIBREQUEST = Option<unsafe extern "system" fn(requestcode: u32, buffer: *mut core::ffi::c_void, buffersize: u32) -> u32>;

public const val `PERF_ADD_COUNTER`: UInt = 1u;
public const val `PERF_AGGREGATE_AVG`: `PERF_COUNTER_AGGREGATE_FUNC` = 2u;
// UNSUPPORTED Rust 776:1: non-scalar type Ptr unsupported
// pub const PERF_AGGREGATE_INSTANCE: windows_sys::core::PCWSTR = windows_sys::core::w!("_Total");

public const val `PERF_AGGREGATE_MAX`: `PERF_COUNTER_AGGREGATE_FUNC` = 4u;
public const val `PERF_AGGREGATE_MIN`: `PERF_COUNTER_AGGREGATE_FUNC` = 3u;
public const val `PERF_AGGREGATE_TOTAL`: `PERF_COUNTER_AGGREGATE_FUNC` = 1u;
public const val `PERF_AGGREGATE_UNDEFINED`: `PERF_COUNTER_AGGREGATE_FUNC` = 0u;
public const val `PERF_ATTRIB_BY_REFERENCE`: ULong = 1uL;
public const val `PERF_ATTRIB_DISPLAY_AS_HEX`: ULong = 16uL;
public const val `PERF_ATTRIB_DISPLAY_AS_REAL`: ULong = 8uL;
public const val `PERF_ATTRIB_NO_DISPLAYABLE`: ULong = 2uL;
public const val `PERF_ATTRIB_NO_GROUP_SEPARATOR`: ULong = 4uL;
public const val `PERF_COLLECT_END`: UInt = 6u;
public const val `PERF_COLLECT_START`: UInt = 5u;
public const val `PERF_COUNTERSET`: `PerfCounterDataType` = 6;
public const val `PERF_COUNTERSET_FLAG_AGGREGATE`: UInt = 4u;
public const val `PERF_COUNTERSET_FLAG_HISTORY`: UInt = 8u;
public const val `PERF_COUNTERSET_FLAG_INSTANCE`: UInt = 16u;
public const val `PERF_COUNTERSET_FLAG_MULTIPLE`: UInt = 2u;
// UNSUPPORTED Rust 793:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTERSET_INFO {
//     pub CounterSetGuid: windows_sys::core::GUID,
//     pub ProviderGuid: windows_sys::core::GUID,
//     pub NumCounters: u32,
//     pub InstanceType: u32,
// }

// UNSUPPORTED Rust 801:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTERSET_INSTANCE {
//     pub CounterSetGuid: windows_sys::core::GUID,
//     pub dwSize: u32,
//     pub InstanceId: u32,
//     pub InstanceNameOffset: u32,
//     pub InstanceNameSize: u32,
// }

public const val `PERF_COUNTERSET_MULTI_INSTANCES`: UInt = 2u;
// UNSUPPORTED Rust 811:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTERSET_REG_INFO {
//     pub CounterSetGuid: windows_sys::core::GUID,
//     pub CounterSetType: u32,
//     pub DetailLevel: u32,
//     pub NumCounters: u32,
//     pub InstanceType: u32,
// }

public const val `PERF_COUNTERSET_SINGLE_AGGREGATE`: UInt = 4u;
public const val `PERF_COUNTERSET_SINGLE_INSTANCE`: UInt = 0u;
public typealias `PERF_COUNTER_AGGREGATE_FUNC` = UInt;
public const val `PERF_COUNTER_BASE`: UInt = 196608u;
// UNSUPPORTED Rust 824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTER_BLOCK {
//     pub ByteLength: u32,
// }

// UNSUPPORTED Rust 829:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTER_DATA {
//     pub dwDataSize: u32,
//     pub dwSize: u32,
// }

// UNSUPPORTED Rust 835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct PERF_COUNTER_DEFINITION {
//     pub ByteLength: u32,
//     pub CounterNameTitleIndex: u32,
//     pub CounterNameTitle: windows_sys::core::PWSTR,
//     pub CounterHelpTitleIndex: u32,
//     pub CounterHelpTitle: windows_sys::core::PWSTR,
//     pub DefaultScale: i32,
//     pub DetailLevel: u32,
//     pub CounterType: u32,
//     pub CounterSize: u32,
//     pub CounterOffset: u32,
// }

// UNSUPPORTED Rust 850:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for PERF_COUNTER_DEFINITION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 856:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTER_DEFINITION {
//     pub ByteLength: u32,
//     pub CounterNameTitleIndex: u32,
//     pub CounterNameTitle: u32,
//     pub CounterHelpTitleIndex: u32,
//     pub CounterHelpTitle: u32,
//     pub DefaultScale: i32,
//     pub DetailLevel: u32,
//     pub CounterType: u32,
//     pub CounterSize: u32,
//     pub CounterOffset: u32,
// }

public const val `PERF_COUNTER_ELAPSED`: UInt = 262144u;
public const val `PERF_COUNTER_FRACTION`: UInt = 131072u;
// UNSUPPORTED Rust 873:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTER_HEADER {
//     pub dwStatus: u32,
//     pub dwType: PerfCounterDataType,
//     pub dwSize: u32,
//     pub Reserved: u32,
// }

public const val `PERF_COUNTER_HISTOGRAM`: UInt = 393216u;
public const val `PERF_COUNTER_HISTOGRAM_TYPE`: UInt = 2147483648u;
// UNSUPPORTED Rust 883:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTER_IDENTIFIER {
//     pub CounterSetGuid: windows_sys::core::GUID,
//     pub Status: u32,
//     pub Size: u32,
//     pub CounterId: u32,
//     pub InstanceId: u32,
//     pub Index: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 894:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTER_IDENTITY {
//     pub CounterSetGuid: windows_sys::core::GUID,
//     pub BufferSize: u32,
//     pub CounterId: u32,
//     pub InstanceId: u32,
//     pub MachineOffset: u32,
//     pub NameOffset: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 905:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTER_INFO {
//     pub CounterId: u32,
//     pub Type: u32,
//     pub Attrib: u64,
//     pub Size: u32,
//     pub DetailLevel: u32,
//     pub Scale: i32,
//     pub Offset: u32,
// }

public const val `PERF_COUNTER_PRECISION`: UInt = 458752u;
public const val `PERF_COUNTER_QUEUELEN`: UInt = 327680u;
public const val `PERF_COUNTER_RATE`: UInt = 65536u;
// UNSUPPORTED Rust 919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_COUNTER_REG_INFO {
//     pub CounterId: u32,
//     pub Type: u32,
//     pub Attrib: u64,
//     pub DetailLevel: u32,
//     pub DefaultScale: i32,
//     pub BaseCounterId: u32,
//     pub PerfTimeId: u32,
//     pub PerfFreqId: u32,
//     pub MultiId: u32,
//     pub AggregateFunc: PERF_COUNTER_AGGREGATE_FUNC,
//     pub Reserved: u32,
// }

public const val `PERF_COUNTER_VALUE`: UInt = 0u;
// UNSUPPORTED Rust 935:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PERF_DATA_BLOCK {
//     pub Signature: [u16; 4],
//     pub LittleEndian: u32,
//     pub Version: u32,
//     pub Revision: u32,
//     pub TotalByteLength: u32,
//     pub HeaderLength: u32,
//     pub NumObjectTypes: u32,
//     pub DefaultObject: i32,
//     pub SystemTime: super::super::Foundation::SYSTEMTIME,
//     pub PerfTime: i64,
//     pub PerfFreq: i64,
//     pub PerfTime100nSec: i64,
//     pub SystemNameLength: u32,
//     pub SystemNameOffset: u32,
// }

// UNSUPPORTED Rust 953:1: declaration Impl has no candidate rule
// impl Default for PERF_DATA_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 958:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_DATA_HEADER {
//     pub dwTotalSize: u32,
//     pub dwNumCounters: u32,
//     pub PerfTimeStamp: i64,
//     pub PerfTime100NSec: i64,
//     pub PerfFreq: i64,
//     pub SystemTime: super::super::Foundation::SYSTEMTIME,
// }

public const val `PERF_DATA_REVISION`: UInt = 1u;
public const val `PERF_DATA_VERSION`: UInt = 1u;
public const val `PERF_DELTA_BASE`: UInt = 8388608u;
public const val `PERF_DELTA_COUNTER`: UInt = 4194304u;
public typealias `PERF_DETAIL` = UInt;
public const val `PERF_DETAIL_ADVANCED`: `PERF_DETAIL` = 200u;
public const val `PERF_DETAIL_EXPERT`: `PERF_DETAIL` = 300u;
public const val `PERF_DETAIL_NOVICE`: `PERF_DETAIL` = 100u;
public const val `PERF_DETAIL_WIZARD`: `PERF_DETAIL` = 400u;
public const val `PERF_DISPLAY_NOSHOW`: UInt = 1073741824u;
public const val `PERF_DISPLAY_NO_SUFFIX`: UInt = 0u;
public const val `PERF_DISPLAY_PERCENT`: UInt = 536870912u;
public const val `PERF_DISPLAY_PER_SEC`: UInt = 268435456u;
public const val `PERF_DISPLAY_SECONDS`: UInt = 805306368u;
public const val `PERF_ENUM_INSTANCES`: UInt = 3u;
public const val `PERF_ERROR_RETURN`: `PerfCounterDataType` = 0;
public const val `PERF_FILTER`: UInt = 9u;
// UNSUPPORTED Rust 985:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_INSTANCE_DEFINITION {
//     pub ByteLength: u32,
//     pub ParentObjectTitleIndex: u32,
//     pub ParentObjectInstance: u32,
//     pub UniqueID: i32,
//     pub NameOffset: u32,
//     pub NameLength: u32,
// }

// UNSUPPORTED Rust 995:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_INSTANCE_HEADER {
//     pub Size: u32,
//     pub InstanceId: u32,
// }

public const val `PERF_INVERSE_COUNTER`: UInt = 16777216u;
public const val `PERF_MAX_INSTANCE_NAME`: UInt = 1024u;
// UNSUPPORTED Rust 1003:1: generic scalar type unsupported
// pub type PERF_MEM_ALLOC = Option<unsafe extern "system" fn(allocsize: usize, pcontext: *mut core::ffi::c_void) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 1004:1: generic scalar type unsupported
// pub type PERF_MEM_FREE = Option<unsafe extern "system" fn(pbuffer: *mut core::ffi::c_void, pcontext: *mut core::ffi::c_void)>;

public const val `PERF_METADATA_MULTIPLE_INSTANCES`: Int = -2;
public const val `PERF_METADATA_NO_INSTANCES`: Int = -3;
public const val `PERF_MULTIPLE_COUNTERS`: `PerfCounterDataType` = 2;
public const val `PERF_MULTIPLE_INSTANCES`: `PerfCounterDataType` = 4;
public const val `PERF_MULTI_COUNTER`: UInt = 33554432u;
// UNSUPPORTED Rust 1010:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_MULTI_COUNTERS {
//     pub dwSize: u32,
//     pub dwCounters: u32,
// }

// UNSUPPORTED Rust 1016:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_MULTI_INSTANCES {
//     pub dwTotalSize: u32,
//     pub dwInstances: u32,
// }

public const val `PERF_NO_INSTANCES`: Int = -1;
public const val `PERF_NO_UNIQUE_ID`: Int = -1;
public const val `PERF_NUMBER_DECIMAL`: UInt = 65536u;
public const val `PERF_NUMBER_DEC_1000`: UInt = 131072u;
public const val `PERF_NUMBER_HEX`: UInt = 0u;
public const val `PERF_OBJECT_TIMER`: UInt = 2097152u;
// UNSUPPORTED Rust 1028:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct PERF_OBJECT_TYPE {
//     pub TotalByteLength: u32,
//     pub DefinitionLength: u32,
//     pub HeaderLength: u32,
//     pub ObjectNameTitleIndex: u32,
//     pub ObjectNameTitle: windows_sys::core::PWSTR,
//     pub ObjectHelpTitleIndex: u32,
//     pub ObjectHelpTitle: windows_sys::core::PWSTR,
//     pub DetailLevel: u32,
//     pub NumCounters: u32,
//     pub DefaultCounter: i32,
//     pub NumInstances: i32,
//     pub CodePage: u32,
//     pub PerfTime: i64,
//     pub PerfFreq: i64,
// }

// UNSUPPORTED Rust 1047:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for PERF_OBJECT_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1053:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_OBJECT_TYPE {
//     pub TotalByteLength: u32,
//     pub DefinitionLength: u32,
//     pub HeaderLength: u32,
//     pub ObjectNameTitleIndex: u32,
//     pub ObjectNameTitle: u32,
//     pub ObjectHelpTitleIndex: u32,
//     pub ObjectHelpTitle: u32,
//     pub DetailLevel: u32,
//     pub NumCounters: u32,
//     pub DefaultCounter: i32,
//     pub NumInstances: i32,
//     pub CodePage: u32,
//     pub PerfTime: i64,
//     pub PerfFreq: i64,
// }

// UNSUPPORTED Rust 1072:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PERF_PROVIDER_CONTEXT {
//     pub ContextSize: u32,
//     pub Reserved: u32,
//     pub ControlCallback: PERFLIBREQUEST,
//     pub MemAllocRoutine: PERF_MEM_ALLOC,
//     pub MemFreeRoutine: PERF_MEM_FREE,
//     pub pMemContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1082:1: declaration Impl has no candidate rule
// impl Default for PERF_PROVIDER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PERF_PROVIDER_DRIVER`: UInt = 2u;
public const val `PERF_PROVIDER_KERNEL_MODE`: UInt = 1u;
public const val `PERF_PROVIDER_USER_MODE`: UInt = 0u;
public const val `PERF_REG_COUNTERSET_ENGLISH_NAME`: `PerfRegInfoType` = 9;
public const val `PERF_REG_COUNTERSET_HELP_STRING`: `PerfRegInfoType` = 4;
public const val `PERF_REG_COUNTERSET_NAME_STRING`: `PerfRegInfoType` = 3;
public const val `PERF_REG_COUNTERSET_STRUCT`: `PerfRegInfoType` = 1;
public const val `PERF_REG_COUNTER_ENGLISH_NAMES`: `PerfRegInfoType` = 10;
public const val `PERF_REG_COUNTER_HELP_STRINGS`: `PerfRegInfoType` = 6;
public const val `PERF_REG_COUNTER_NAME_STRINGS`: `PerfRegInfoType` = 5;
public const val `PERF_REG_COUNTER_STRUCT`: `PerfRegInfoType` = 2;
public const val `PERF_REG_PROVIDER_GUID`: `PerfRegInfoType` = 8;
public const val `PERF_REG_PROVIDER_NAME`: `PerfRegInfoType` = 7;
public const val `PERF_REMOVE_COUNTER`: UInt = 2u;
public const val `PERF_SINGLE_COUNTER`: `PerfCounterDataType` = 1;
public const val `PERF_SIZE_DWORD`: UInt = 0u;
public const val `PERF_SIZE_LARGE`: UInt = 256u;
public const val `PERF_SIZE_VARIABLE_LEN`: UInt = 768u;
public const val `PERF_SIZE_ZERO`: UInt = 512u;
// UNSUPPORTED Rust 1106:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_STRING_BUFFER_HEADER {
//     pub dwSize: u32,
//     pub dwCounters: u32,
// }

// UNSUPPORTED Rust 1112:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERF_STRING_COUNTER_HEADER {
//     pub dwCounterId: u32,
//     pub dwOffset: u32,
// }

public const val `PERF_TEXT_ASCII`: UInt = 65536u;
public const val `PERF_TEXT_UNICODE`: UInt = 0u;
public const val `PERF_TIMER_100NS`: UInt = 1048576u;
public const val `PERF_TIMER_TICK`: UInt = 0u;
public const val `PERF_TYPE_COUNTER`: UInt = 1024u;
public const val `PERF_TYPE_NUMBER`: UInt = 0u;
public const val `PERF_TYPE_TEXT`: UInt = 2048u;
public const val `PERF_TYPE_ZERO`: UInt = 3072u;
public const val `PERF_WILDCARD_COUNTER`: UInt = 4294967295u;
// UNSUPPORTED Rust 1127:1: non-scalar type Ptr unsupported
// pub const PERF_WILDCARD_INSTANCE: windows_sys::core::PCWSTR = windows_sys::core::w!("*");

public const val `PLAL_ALERT_CMD_LINE_A_NAME`: UInt = 512u;
public const val `PLAL_ALERT_CMD_LINE_C_NAME`: UInt = 1024u;
public const val `PLAL_ALERT_CMD_LINE_D_TIME`: UInt = 2048u;
public const val `PLAL_ALERT_CMD_LINE_L_VAL`: UInt = 4096u;
public const val `PLAL_ALERT_CMD_LINE_MASK`: UInt = 32512u;
public const val `PLAL_ALERT_CMD_LINE_M_VAL`: UInt = 8192u;
public const val `PLAL_ALERT_CMD_LINE_SINGLE`: UInt = 256u;
public const val `PLAL_ALERT_CMD_LINE_U_TEXT`: UInt = 16384u;
// UNSUPPORTED Rust 1136:1: generic scalar type unsupported
// pub type PLA_CABEXTRACT_CALLBACK = Option<unsafe extern "system" fn(filename: windows_sys::core::PCWSTR, context: *mut core::ffi::c_void)>;

public const val `PLA_CAPABILITY_AUTOLOGGER`: UInt = 32u;
public const val `PLA_CAPABILITY_LEGACY_SESSION`: UInt = 8u;
public const val `PLA_CAPABILITY_LEGACY_SVC`: UInt = 16u;
public const val `PLA_CAPABILITY_LOCAL`: UInt = 268435456u;
public const val `PLA_CAPABILITY_V1_SESSION`: UInt = 2u;
public const val `PLA_CAPABILITY_V1_SVC`: UInt = 1u;
public const val `PLA_CAPABILITY_V1_SYSTEM`: UInt = 4u;
// UNSUPPORTED Rust 1144:1: generic scalar type unsupported
// pub type PM_CLOSE_PROC = Option<unsafe extern "system" fn() -> u32>;

// UNSUPPORTED Rust 1145:1: generic scalar type unsupported
// pub type PM_COLLECT_PROC = Option<unsafe extern "system" fn(pvaluename: windows_sys::core::PCWSTR, ppdata: *mut *mut core::ffi::c_void, pcbtotalbytes: *mut u32, pnumobjecttypes: *mut u32) -> u32>;

// UNSUPPORTED Rust 1146:1: generic scalar type unsupported
// pub type PM_OPEN_PROC = Option<unsafe extern "system" fn(pcontext: windows_sys::core::PCWSTR) -> u32>;

public typealias `PerfCounterDataType` = Int;
public typealias `PerfRegInfoType` = Int;
public typealias `REAL_TIME_DATA_SOURCE_ID_FLAGS` = UInt;
public typealias `ReportValueTypeConstants` = Int;
public typealias `ResourcePolicy` = Int;
// UNSUPPORTED Rust 1152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const S_PDH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04d66358_c4a1_419b_8023_23b73902de2c);

// UNSUPPORTED Rust 1153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ServerDataCollectorSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837531_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1154:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ServerDataCollectorSetCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837532_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SourcePropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cf32aa1_7571_11d0_93c4_00aa00a3ddea);

public typealias `StreamMode` = Int;
public typealias `SysmonBatchReason` = Int;
public typealias `SysmonDataType` = Int;
public typealias `SysmonFileType` = Int;
// UNSUPPORTED Rust 1160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemDataCollectorSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837546_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1161:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemDataCollectorSetCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837547_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1162:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemMonitor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4d2d8e0_d1dd_11ce_940f_008029004347);

// UNSUPPORTED Rust 1163:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemMonitor2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f30578c_5f38_4612_acfe_6ed04c7b7af8);

// UNSUPPORTED Rust 1164:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const TraceDataProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837513_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1165:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const TraceDataProviderCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837511_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1166:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const TraceSession: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0383751c_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1167:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const TraceSessionCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837530_098b_11d8_9414_505054503030);

public typealias `ValueMapType` = Int;
public const val `WINPERF_LOG_DEBUG`: UInt = 2u;
public const val `WINPERF_LOG_NONE`: UInt = 0u;
public const val `WINPERF_LOG_USER`: UInt = 1u;
public const val `WINPERF_LOG_VERBOSE`: UInt = 3u;
public typealias `WeekDays` = Int;
public const val `plaAlert`: `DataCollectorType` = 3;
public const val `plaApiTrace`: `DataCollectorType` = 4;
public const val `plaBinary`: `FileFormat` = 3;
public const val `plaBoth`: `StreamMode` = 3;
public const val `plaBuffering`: `StreamMode` = 4;
public const val `plaCommaSeparated`: `FileFormat` = 0;
public const val `plaCompiling`: `DataCollectorSetStatus` = 2;
public const val `plaComputer`: `AutoPathFormat` = 2;
public const val `plaConfiguration`: `DataCollectorType` = 2;
public const val `plaCreateCab`: `FolderActionSteps` = 1;
public const val `plaCreateHtml`: `DataManagerSteps` = 4;
public const val `plaCreateNew`: `CommitMode` = 1;
public const val `plaCreateOrModify`: `CommitMode` = 3;
public const val `plaCreateReport`: `DataManagerSteps` = 1;
public const val `plaCycle`: `ClockType` = 3;
public const val `plaDeleteCab`: `FolderActionSteps` = 8;
public const val `plaDeleteData`: `FolderActionSteps` = 2;
public const val `plaDeleteLargest`: `ResourcePolicy` = 0;
public const val `plaDeleteOldest`: `ResourcePolicy` = 1;
public const val `plaDeleteReport`: `FolderActionSteps` = 16;
public const val `plaEveryday`: `WeekDays` = 127;
public const val `plaFile`: `StreamMode` = 1;
public const val `plaFlag`: `ValueMapType` = 2;
public const val `plaFlagArray`: `ValueMapType` = 3;
public const val `plaFlushTrace`: `CommitMode` = 32;
public const val `plaFolderActions`: `DataManagerSteps` = 8;
public const val `plaFriday`: `WeekDays` = 32;
public const val `plaIndex`: `ValueMapType` = 1;
public const val `plaModify`: `CommitMode` = 2;
public const val `plaMonday`: `WeekDays` = 2;
public const val `plaMonthDayHour`: `AutoPathFormat` = 256;
public const val `plaMonthDayHourMinute`: `AutoPathFormat` = 16384;
public const val `plaNone`: `AutoPathFormat` = 0;
public const val `plaPattern`: `AutoPathFormat` = 1;
public const val `plaPending`: `DataCollectorSetStatus` = 3;
public const val `plaPerformance`: `ClockType` = 1;
public const val `plaPerformanceCounter`: `DataCollectorType` = 0;
public const val `plaRealTime`: `StreamMode` = 2;
public const val `plaResourceFreeing`: `DataManagerSteps` = 16;
public const val `plaRunOnce`: `WeekDays` = 0;
public const val `plaRunRules`: `DataManagerSteps` = 2;
public const val `plaRunning`: `DataCollectorSetStatus` = 1;
public const val `plaSaturday`: `WeekDays` = 64;
public const val `plaSendCab`: `FolderActionSteps` = 4;
public const val `plaSerialNumber`: `AutoPathFormat` = 512;
public const val `plaSql`: `FileFormat` = 2;
public const val `plaStopped`: `DataCollectorSetStatus` = 0;
public const val `plaSunday`: `WeekDays` = 1;
public const val `plaSystem`: `ClockType` = 2;
public const val `plaTabSeparated`: `FileFormat` = 1;
public const val `plaThursday`: `WeekDays` = 16;
public const val `plaTimeStamp`: `ClockType` = 0;
public const val `plaTrace`: `DataCollectorType` = 1;
public const val `plaTuesday`: `WeekDays` = 4;
public const val `plaUndefined`: `DataCollectorSetStatus` = 4;
public const val `plaUpdateRunningInstance`: `CommitMode` = 16;
public const val `plaValidateOnly`: `CommitMode` = 4096;
public const val `plaValidation`: `ValueMapType` = 4;
public const val `plaWednesday`: `WeekDays` = 8;
public const val `plaYearDayOfYear`: `AutoPathFormat` = 1024;
public const val `plaYearMonth`: `AutoPathFormat` = 2048;
public const val `plaYearMonthDay`: `AutoPathFormat` = 4096;
public const val `plaYearMonthDayHour`: `AutoPathFormat` = 8192;
public const val `sysmonAverage`: `ReportValueTypeConstants` = 2;
public const val `sysmonBatchAddCounters`: `SysmonBatchReason` = 2;
public const val `sysmonBatchAddFiles`: `SysmonBatchReason` = 1;
public const val `sysmonBatchAddFilesAutoCounters`: `SysmonBatchReason` = 3;
public const val `sysmonBatchNone`: `SysmonBatchReason` = 0;
public const val `sysmonChartArea`: `DisplayTypeConstants` = 4;
public const val `sysmonChartStackedArea`: `DisplayTypeConstants` = 5;
public const val `sysmonCurrentActivity`: `DataSourceTypeConstants` = 1;
public const val `sysmonCurrentValue`: `ReportValueTypeConstants` = 1;
public const val `sysmonDataAvg`: `SysmonDataType` = 1;
public const val `sysmonDataCount`: `SysmonDataType` = 5;
public const val `sysmonDataMax`: `SysmonDataType` = 3;
public const val `sysmonDataMin`: `SysmonDataType` = 2;
public const val `sysmonDataTime`: `SysmonDataType` = 4;
public const val `sysmonDefaultValue`: `ReportValueTypeConstants` = 0;
public const val `sysmonFileBlg`: `SysmonFileType` = 5;
public const val `sysmonFileCsv`: `SysmonFileType` = 3;
public const val `sysmonFileGif`: `SysmonFileType` = 7;
public const val `sysmonFileHtml`: `SysmonFileType` = 1;
public const val `sysmonFileReport`: `SysmonFileType` = 2;
public const val `sysmonFileRetiredBlg`: `SysmonFileType` = 6;
public const val `sysmonFileTsv`: `SysmonFileType` = 4;
public const val `sysmonHistogram`: `DisplayTypeConstants` = 2;
public const val `sysmonLineGraph`: `DisplayTypeConstants` = 1;
public const val `sysmonLogFiles`: `DataSourceTypeConstants` = 2;
public const val `sysmonMaximum`: `ReportValueTypeConstants` = 4;
public const val `sysmonMinimum`: `ReportValueTypeConstants` = 3;
public const val `sysmonNullDataSource`: `DataSourceTypeConstants` = -1;
public const val `sysmonReport`: `DisplayTypeConstants` = 3;
public const val `sysmonSqlLog`: `DataSourceTypeConstants` = 3;
