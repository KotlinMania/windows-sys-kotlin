// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Graphics_Printing_PrintTicket")]
// pub mod PrintTicket;

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AbortPrinter(hprinter : PRINTER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddFormA(hprinter : PRINTER_HANDLE, level : u32, pform : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddFormW(hprinter : PRINTER_HANDLE, level : u32, pform : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddJobA(hprinter : PRINTER_HANDLE, level : u32, pdata : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddJobW(hprinter : PRINTER_HANDLE, level : u32, pdata : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddMonitorA(pname : windows_sys::core::PCSTR, level : u32, pmonitors : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddMonitorW(pname : windows_sys::core::PCWSTR, level : u32, pmonitors : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPortA(pname : windows_sys::core::PCSTR, hwnd : super::super::Foundation:: HWND, pmonitorname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPortW(pname : windows_sys::core::PCWSTR, hwnd : super::super::Foundation:: HWND, pmonitorname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn AddPrintDeviceObject(hprinter : PRINTER_HANDLE, phdeviceobject : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrintProcessorA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, ppathname : windows_sys::core::PCSTR, pprintprocessorname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrintProcessorW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, ppathname : windows_sys::core::PCWSTR, pprintprocessorname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrintProvidorA(pname : windows_sys::core::PCSTR, level : u32, pprovidorinfo : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrintProvidorW(pname : windows_sys::core::PCWSTR, level : u32, pprovidorinfo : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterA(pname : windows_sys::core::PCSTR, level : u32, pprinter : *const u8) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterConnection2A(hwnd : super::super::Foundation:: HWND, pszname : windows_sys::core::PCSTR, dwlevel : u32, pconnectioninfo : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterConnection2W(hwnd : super::super::Foundation:: HWND, pszname : windows_sys::core::PCWSTR, dwlevel : u32, pconnectioninfo : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterConnectionA(pname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterConnectionW(pname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterDriverA(pname : windows_sys::core::PCSTR, level : u32, pdriverinfo : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterDriverExA(pname : windows_sys::core::PCSTR, level : u32, lpbdriverinfo : *const u8, dwfilecopyflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterDriverExW(pname : windows_sys::core::PCWSTR, level : u32, lpbdriverinfo : *const u8, dwfilecopyflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterDriverW(pname : windows_sys::core::PCWSTR, level : u32, pdriverinfo : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn AddPrinterW(pname : windows_sys::core::PCWSTR, level : u32, pprinter : *const u8) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn AdvancedDocumentPropertiesA(hwnd : super::super::Foundation:: HWND, hprinter : PRINTER_HANDLE, pdevicename : windows_sys::core::PCSTR, pdevmodeoutput : *mut super::Gdi:: DEVMODEA, pdevmodeinput : *const super::Gdi:: DEVMODEA) -> i32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn AdvancedDocumentPropertiesW(hwnd : super::super::Foundation:: HWND, hprinter : PRINTER_HANDLE, pdevicename : windows_sys::core::PCWSTR, pdevmodeoutput : *mut super::Gdi:: DEVMODEW, pdevmodeinput : *const super::Gdi:: DEVMODEW) -> i32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn AppendPrinterNotifyInfoData(pinfodest : *const PRINTER_NOTIFY_INFO, pdatasrc : *const PRINTER_NOTIFY_INFO_DATA, fdwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn CallRouterFindFirstPrinterChangeNotification(hprinterrpc : super::super::Foundation:: HANDLE, fdwfilterflags : u32, fdwoptions : u32, hnotify : super::super::Foundation:: HANDLE, pprinternotifyoptions : *const PRINTER_NOTIFY_OPTIONS) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn ClosePrinter(hprinter : PRINTER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn CloseSpoolFileHandle(hprinter : PRINTER_HANDLE, hspoolfile : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn CommitSpoolData(hprinter : PRINTER_HANDLE, hspoolfile : super::super::Foundation:: HANDLE, cbcommit : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("compstui.dll" "system" fn CommonPropertySheetUIA(hwndowner : super::super::Foundation:: HWND, pfnpropsheetui : PFNPROPSHEETUI, lparam : super::super::Foundation:: LPARAM, presult : *mut u32) -> i32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("compstui.dll" "system" fn CommonPropertySheetUIW(hwndowner : super::super::Foundation:: HWND, pfnpropsheetui : PFNPROPSHEETUI, lparam : super::super::Foundation:: LPARAM, presult : *mut u32) -> i32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn ConfigurePortA(pname : windows_sys::core::PCSTR, hwnd : super::super::Foundation:: HWND, pportname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn ConfigurePortW(pname : windows_sys::core::PCWSTR, hwnd : super::super::Foundation:: HWND, pportname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn ConnectToPrinterDlg(hwnd : super::super::Foundation:: HWND, flags : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn CorePrinterDriverInstalledA(pszserver : windows_sys::core::PCSTR, pszenvironment : windows_sys::core::PCSTR, coredriverguid : windows_sys::core::GUID, ftdriverdate : super::super::Foundation:: FILETIME, dwldriverversion : u64, pbdriverinstalled : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn CorePrinterDriverInstalledW(pszserver : windows_sys::core::PCWSTR, pszenvironment : windows_sys::core::PCWSTR, coredriverguid : windows_sys::core::GUID, ftdriverdate : super::super::Foundation:: FILETIME, dwldriverversion : u64, pbdriverinstalled : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn CreatePrintAsyncNotifyChannel(pszname : windows_sys::core::PCWSTR, pnotificationtype : *const windows_sys::core::GUID, euserfilter : PrintAsyncNotifyUserFilter, econversationstyle : PrintAsyncNotifyConversationStyle, pcallback : * mut core::ffi::c_void, ppiasynchnotification : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn CreatePrinterIC(hprinter : PRINTER_HANDLE, pdevmode : *const super::Gdi:: DEVMODEW) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeleteFormA(hprinter : PRINTER_HANDLE, pformname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeleteFormW(hprinter : PRINTER_HANDLE, pformname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeleteJobNamedProperty(hprinter : PRINTER_HANDLE, jobid : u32, pszname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeleteMonitorA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, pmonitorname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeleteMonitorW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, pmonitorname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePortA(pname : windows_sys::core::PCSTR, hwnd : super::super::Foundation:: HWND, pportname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePortW(pname : windows_sys::core::PCWSTR, hwnd : super::super::Foundation:: HWND, pportname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrintProcessorA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, pprintprocessorname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrintProcessorW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, pprintprocessorname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrintProvidorA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, pprintprovidorname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrintProvidorW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, pprintprovidorname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinter(hprinter : PRINTER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterConnectionA(pname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterConnectionW(pname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDataA(hprinter : PRINTER_HANDLE, pvaluename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDataExA(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCSTR, pvaluename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDataExW(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCWSTR, pvaluename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDataW(hprinter : PRINTER_HANDLE, pvaluename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDriverA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, pdrivername : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDriverExA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, pdrivername : windows_sys::core::PCSTR, dwdeleteflag : u32, dwversionflag : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDriverExW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, pdrivername : windows_sys::core::PCWSTR, dwdeleteflag : u32, dwversionflag : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDriverPackageA(pszserver : windows_sys::core::PCSTR, pszinfpath : windows_sys::core::PCSTR, pszenvironment : windows_sys::core::PCSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDriverPackageW(pszserver : windows_sys::core::PCWSTR, pszinfpath : windows_sys::core::PCWSTR, pszenvironment : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterDriverW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, pdrivername : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterIC(hprinteric : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterKeyA(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn DeletePrinterKeyW(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn DevQueryPrint(hprinter : PRINTER_HANDLE, pdevmode : *const super::Gdi:: DEVMODEA, presid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn DevQueryPrintEx(pdqpinfo : *mut DEVQUERYPRINT_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn DocumentPropertiesA(hwnd : super::super::Foundation:: HWND, hprinter : PRINTER_HANDLE, pdevicename : windows_sys::core::PCSTR, pdevmodeoutput : *mut super::Gdi:: DEVMODEA, pdevmodeinput : *const super::Gdi:: DEVMODEA, fmode : u32) -> i32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn DocumentPropertiesW(hwnd : super::super::Foundation:: HWND, hprinter : PRINTER_HANDLE, pdevicename : windows_sys::core::PCWSTR, pdevmodeoutput : *mut super::Gdi:: DEVMODEW, pdevmodeinput : *const super::Gdi:: DEVMODEW, fmode : u32) -> i32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EndDocPrinter(hprinter : PRINTER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EndPagePrinter(hprinter : PRINTER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumFormsA(hprinter : PRINTER_HANDLE, level : u32, pform : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumFormsW(hprinter : PRINTER_HANDLE, level : u32, pform : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumJobNamedProperties(hprinter : PRINTER_HANDLE, jobid : u32, pcproperties : *mut u32, ppproperties : *mut *mut PrintNamedProperty) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumJobsA(hprinter : PRINTER_HANDLE, firstjob : u32, nojobs : u32, level : u32, pjob : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumJobsW(hprinter : PRINTER_HANDLE, firstjob : u32, nojobs : u32, level : u32, pjob : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumMonitorsA(pname : windows_sys::core::PCSTR, level : u32, pmonitor : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumMonitorsW(pname : windows_sys::core::PCWSTR, level : u32, pmonitor : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPortsA(pname : windows_sys::core::PCSTR, level : u32, pport : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPortsW(pname : windows_sys::core::PCWSTR, level : u32, pport : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrintProcessorDatatypesA(pname : windows_sys::core::PCSTR, pprintprocessorname : windows_sys::core::PCSTR, level : u32, pdatatypes : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrintProcessorDatatypesW(pname : windows_sys::core::PCWSTR, pprintprocessorname : windows_sys::core::PCWSTR, level : u32, pdatatypes : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrintProcessorsA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, level : u32, pprintprocessorinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrintProcessorsW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, level : u32, pprintprocessorinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrinterDataA(hprinter : PRINTER_HANDLE, dwindex : u32, pvaluename : windows_sys::core::PSTR, cbvaluename : u32, pcbvaluename : *mut u32, ptype : *mut u32, pdata : *mut u8, cbdata : u32, pcbdata : *mut u32) -> u32);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrinterDataExA(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCSTR, penumvalues : *mut u8, cbenumvalues : u32, pcbenumvalues : *mut u32, pnenumvalues : *mut u32) -> u32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrinterDataExW(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCWSTR, penumvalues : *mut u8, cbenumvalues : u32, pcbenumvalues : *mut u32, pnenumvalues : *mut u32) -> u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrinterDataW(hprinter : PRINTER_HANDLE, dwindex : u32, pvaluename : windows_sys::core::PWSTR, cbvaluename : u32, pcbvaluename : *mut u32, ptype : *mut u32, pdata : *mut u8, cbdata : u32, pcbdata : *mut u32) -> u32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrinterDriversA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, level : u32, pdriverinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrinterDriversW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, level : u32, pdriverinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrinterKeyA(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCSTR, psubkey : windows_sys::core::PSTR, cbsubkey : u32, pcbsubkey : *mut u32) -> u32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrinterKeyW(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCWSTR, psubkey : windows_sys::core::PWSTR, cbsubkey : u32, pcbsubkey : *mut u32) -> u32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrintersA(flags : u32, name : windows_sys::core::PCSTR, level : u32, pprinterenum : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn EnumPrintersW(flags : u32, name : windows_sys::core::PCWSTR, level : u32, pprinterenum : *mut u8, cbbuf : u32, pcbneeded : *mut u32, pcreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn ExtDeviceMode(hwnd : super::super::Foundation:: HWND, hinst : super::super::Foundation:: HANDLE, pdevmodeoutput : *mut super::Gdi:: DEVMODEA, pdevicename : windows_sys::core::PCSTR, pport : windows_sys::core::PCSTR, pdevmodeinput : *const super::Gdi:: DEVMODEA, pprofile : windows_sys::core::PCSTR, fmode : u32) -> i32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn FindClosePrinterChangeNotification(hchange : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn FindFirstPrinterChangeNotification(hprinter : PRINTER_HANDLE, fdwfilter : u32, fdwoptions : u32, pprinternotifyoptions : *const core::ffi::c_void) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn FindNextPrinterChangeNotification(hchange : super::super::Foundation:: HANDLE, pdwchange : *mut u32, pvreserved : *const core::ffi::c_void, ppprinternotifyinfo : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn FlushPrinter(hprinter : PRINTER_HANDLE, pbuf : *const core::ffi::c_void, cbbuf : u32, pcwritten : *mut u32, csleep : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn FreePrintNamedPropertyArray(cproperties : u32, ppproperties : *mut *mut PrintNamedProperty));

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn FreePrintPropertyValue(pvalue : *mut PrintPropertyValue));

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn FreePrinterNotifyInfo(pprinternotifyinfo : *const PRINTER_NOTIFY_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiDeleteSpoolFileHandle(spoolfilehandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiEndDocEMF(spoolfilehandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiEndPageEMF(spoolfilehandle : super::super::Foundation:: HANDLE, dwoptimization : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GdiGetDC(spoolfilehandle : super::super::Foundation:: HANDLE) -> super::Gdi:: HDC);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GdiGetDevmodeForPage(spoolfilehandle : super::super::Foundation:: HANDLE, dwpagenumber : u32, pcurrdm : *mut *mut super::Gdi:: DEVMODEW, plastdm : *mut *mut super::Gdi:: DEVMODEW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiGetPageCount(spoolfilehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiGetPageHandle(spoolfilehandle : super::super::Foundation:: HANDLE, page : u32, pdwpagetype : *mut u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GdiGetSpoolFileHandle(pwszprintername : windows_sys::core::PCWSTR, pdevmode : *mut super::Gdi:: DEVMODEW, pwszdocname : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiPlayPageEMF(spoolfilehandle : super::super::Foundation:: HANDLE, hemf : super::super::Foundation:: HANDLE, prectdocument : *mut super::super::Foundation:: RECT, prectborder : *mut super::super::Foundation:: RECT, prectclip : *mut super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GdiResetDCEMF(spoolfilehandle : super::super::Foundation:: HANDLE, pcurrdm : *mut super::Gdi:: DEVMODEW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_Xps")]
// windows_link::link!("gdi32.dll" "system" fn GdiStartDocEMF(spoolfilehandle : super::super::Foundation:: HANDLE, pdocinfo : *mut super::super::Storage::Xps:: DOCINFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiStartPageEMF(spoolfilehandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GenerateCopyFilePaths(pszprintername : windows_sys::core::PCWSTR, pszdirectory : windows_sys::core::PCWSTR, psplclientinfo : *const u8, dwlevel : u32, pszsourcedir : windows_sys::core::PWSTR, pcchsourcedirsize : *mut u32, psztargetdir : windows_sys::core::PWSTR, pcchtargetdirsize : *mut u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("compstui.dll" "system" fn GetCPSUIUserData(hdlg : super::super::Foundation:: HWND) -> usize);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetCorePrinterDriversA(pszserver : windows_sys::core::PCSTR, pszenvironment : windows_sys::core::PCSTR, pszzcoredriverdependencies : windows_sys::core::PCSTR, ccoreprinterdrivers : u32, pcoreprinterdrivers : *mut CORE_PRINTER_DRIVERA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetCorePrinterDriversW(pszserver : windows_sys::core::PCWSTR, pszenvironment : windows_sys::core::PCWSTR, pszzcoredriverdependencies : windows_sys::core::PCWSTR, ccoreprinterdrivers : u32, pcoreprinterdrivers : *mut CORE_PRINTER_DRIVERW) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetDefaultPrinterA(pszbuffer : windows_sys::core::PSTR, pcchbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetDefaultPrinterW(pszbuffer : windows_sys::core::PWSTR, pcchbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetFormA(hprinter : PRINTER_HANDLE, pformname : windows_sys::core::PCSTR, level : u32, pform : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetFormW(hprinter : PRINTER_HANDLE, pformname : windows_sys::core::PCWSTR, level : u32, pform : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetJobA(hprinter : PRINTER_HANDLE, jobid : u32, level : u32, pjob : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("spoolss.dll" "system" fn GetJobAttributes(pprintername : windows_sys::core::PCWSTR, pdevmode : *const super::Gdi:: DEVMODEW, pattributeinfo : *mut ATTRIBUTE_INFO_3) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("spoolss.dll" "system" fn GetJobAttributesEx(pprintername : windows_sys::core::PCWSTR, pdevmode : *const super::Gdi:: DEVMODEW, dwlevel : u32, pattributeinfo : *mut u8, nsize : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetJobNamedPropertyValue(hprinter : PRINTER_HANDLE, jobid : u32, pszname : windows_sys::core::PCWSTR, pvalue : *mut PrintPropertyValue) -> u32);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetJobW(hprinter : PRINTER_HANDLE, jobid : u32, level : u32, pjob : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrintExecutionData(pdata : *mut PRINT_EXECUTION_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrintOutputInfo(hwnd : super::super::Foundation:: HWND, pszprinter : windows_sys::core::PCWSTR, phfile : *mut super::super::Foundation:: HANDLE, ppszoutputfile : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrintProcessorDirectoryA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, level : u32, pprintprocessorinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrintProcessorDirectoryW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, level : u32, pprintprocessorinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterA(hprinter : PRINTER_HANDLE, level : u32, pprinter : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDataA(hprinter : PRINTER_HANDLE, pvaluename : windows_sys::core::PCSTR, ptype : *mut u32, pdata : *mut u8, nsize : u32, pcbneeded : *mut u32) -> u32);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDataExA(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCSTR, pvaluename : windows_sys::core::PCSTR, ptype : *mut u32, pdata : *mut u8, nsize : u32, pcbneeded : *mut u32) -> u32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDataExW(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCWSTR, pvaluename : windows_sys::core::PCWSTR, ptype : *mut u32, pdata : *mut u8, nsize : u32, pcbneeded : *mut u32) -> u32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDataW(hprinter : PRINTER_HANDLE, pvaluename : windows_sys::core::PCWSTR, ptype : *mut u32, pdata : *mut u8, nsize : u32, pcbneeded : *mut u32) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDriver2A(hwnd : super::super::Foundation:: HWND, hprinter : PRINTER_HANDLE, penvironment : windows_sys::core::PCSTR, level : u32, pdriverinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDriver2W(hwnd : super::super::Foundation:: HWND, hprinter : PRINTER_HANDLE, penvironment : windows_sys::core::PCWSTR, level : u32, pdriverinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDriverA(hprinter : PRINTER_HANDLE, penvironment : windows_sys::core::PCSTR, level : u32, pdriverinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDriverDirectoryA(pname : windows_sys::core::PCSTR, penvironment : windows_sys::core::PCSTR, level : u32, pdriverdirectory : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDriverDirectoryW(pname : windows_sys::core::PCWSTR, penvironment : windows_sys::core::PCWSTR, level : u32, pdriverdirectory : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDriverPackagePathA(pszserver : windows_sys::core::PCSTR, pszenvironment : windows_sys::core::PCSTR, pszlanguage : windows_sys::core::PCSTR, pszpackageid : windows_sys::core::PCSTR, pszdriverpackagecab : windows_sys::core::PSTR, cchdriverpackagecab : u32, pcchrequiredsize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDriverPackagePathW(pszserver : windows_sys::core::PCWSTR, pszenvironment : windows_sys::core::PCWSTR, pszlanguage : windows_sys::core::PCWSTR, pszpackageid : windows_sys::core::PCWSTR, pszdriverpackagecab : windows_sys::core::PWSTR, cchdriverpackagecab : u32, pcchrequiredsize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterDriverW(hprinter : PRINTER_HANDLE, penvironment : windows_sys::core::PCWSTR, level : u32, pdriverinfo : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetPrinterW(hprinter : PRINTER_HANDLE, level : u32, pprinter : *mut u8, cbbuf : u32, pcbneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn GetSpoolFileHandle(hprinter : PRINTER_HANDLE) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn ImpersonatePrinterClient(htoken : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn InstallPrinterDriverFromPackageA(pszserver : windows_sys::core::PCSTR, pszinfpath : windows_sys::core::PCSTR, pszdrivername : windows_sys::core::PCSTR, pszenvironment : windows_sys::core::PCSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn InstallPrinterDriverFromPackageW(pszserver : windows_sys::core::PCWSTR, pszinfpath : windows_sys::core::PCWSTR, pszdrivername : windows_sys::core::PCWSTR, pszenvironment : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn IsValidDevmodeA(pdevmode : *const super::Gdi:: DEVMODEA, devmodesize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn IsValidDevmodeW(pdevmode : *const super::Gdi:: DEVMODEW, devmodesize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn OpenPrinter2A(pprintername : windows_sys::core::PCSTR, phprinter : *mut PRINTER_HANDLE, pdefault : *const PRINTER_DEFAULTSA, poptions : *const PRINTER_OPTIONSA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn OpenPrinter2W(pprintername : windows_sys::core::PCWSTR, phprinter : *mut PRINTER_HANDLE, pdefault : *const PRINTER_DEFAULTSW, poptions : *const PRINTER_OPTIONSW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn OpenPrinterA(pprintername : windows_sys::core::PCSTR, phprinter : *mut PRINTER_HANDLE, pdefault : *const PRINTER_DEFAULTSA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn OpenPrinterW(pprintername : windows_sys::core::PCWSTR, phprinter : *mut PRINTER_HANDLE, pdefault : *const PRINTER_DEFAULTSW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn PartialReplyPrinterChangeNotification(hprinter : PRINTER_HANDLE, pdatasrc : *const PRINTER_NOTIFY_INFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn PlayGdiScriptOnPrinterIC(hprinteric : super::super::Foundation:: HANDLE, pin : *const u8, cin : u32, pout : *mut u8, cout : u32, ul : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn PrinterMessageBoxA(hprinter : PRINTER_HANDLE, error : u32, hwnd : super::super::Foundation:: HWND, ptext : windows_sys::core::PCSTR, pcaption : windows_sys::core::PCSTR, dwtype : u32) -> u32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn PrinterMessageBoxW(hprinter : PRINTER_HANDLE, error : u32, hwnd : super::super::Foundation:: HWND, ptext : windows_sys::core::PCWSTR, pcaption : windows_sys::core::PCWSTR, dwtype : u32) -> u32);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn PrinterProperties(hwnd : super::super::Foundation:: HWND, hprinter : PRINTER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn ProvidorFindClosePrinterChangeNotification(hprinter : PRINTER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn ProvidorFindFirstPrinterChangeNotification(hprinter : PRINTER_HANDLE, fdwflags : u32, fdwoptions : u32, hnotify : super::super::Foundation:: HANDLE, pprinternotifyoptions : *const core::ffi::c_void, pvreserved1 : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn ReadPrinter(hprinter : PRINTER_HANDLE, pbuf : *mut core::ffi::c_void, cbbuf : u32, pnobytesread : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn RegisterForPrintAsyncNotifications(pszname : windows_sys::core::PCWSTR, pnotificationtype : *const windows_sys::core::GUID, euserfilter : PrintAsyncNotifyUserFilter, econversationstyle : PrintAsyncNotifyConversationStyle, pcallback : * mut core::ffi::c_void, phnotify : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn RemovePrintDeviceObject(hdeviceobject : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn ReplyPrinterChangeNotification(hprinter : PRINTER_HANDLE, fdwchangeflags : u32, pdwresult : *mut u32, pprinternotifyinfo : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn ReplyPrinterChangeNotificationEx(hnotify : super::super::Foundation:: HANDLE, dwcolor : u32, fdwflags : u32, pdwresult : *mut u32, pprinternotifyinfo : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn ReportJobProcessingProgress(printerhandle : super::super::Foundation:: HANDLE, jobid : u32, joboperation : EPrintXPSJobOperation, jobprogress : EPrintXPSJobProgress) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn ResetPrinterA(hprinter : PRINTER_HANDLE, pdefault : *const PRINTER_DEFAULTSA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winspool.drv" "system" fn ResetPrinterW(hprinter : PRINTER_HANDLE, pdefault : *const PRINTER_DEFAULTSW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn RevertToPrinterSelf() -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn RouterAllocBidiMem(numbytes : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn RouterAllocBidiResponseContainer(count : u32) -> *mut BIDI_RESPONSE_CONTAINER);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn RouterAllocPrinterNotifyInfo(cprinternotifyinfodata : u32) -> *mut PRINTER_NOTIFY_INFO);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn RouterFreeBidiMem(pmempointer : *const core::ffi::c_void));

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn RouterFreeBidiResponseContainer(pdata : *const BIDI_RESPONSE_CONTAINER) -> u32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn RouterFreePrinterNotifyInfo(pinfo : *const PRINTER_NOTIFY_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn ScheduleJob(hprinter : PRINTER_HANDLE, jobid : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("compstui.dll" "system" fn SetCPSUIUserData(hdlg : super::super::Foundation:: HWND, cpsuiuserdata : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetDefaultPrinterA(pszprinter : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetDefaultPrinterW(pszprinter : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetFormA(hprinter : PRINTER_HANDLE, pformname : windows_sys::core::PCSTR, level : u32, pform : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetFormW(hprinter : PRINTER_HANDLE, pformname : windows_sys::core::PCWSTR, level : u32, pform : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetJobA(hprinter : PRINTER_HANDLE, jobid : u32, level : u32, pjob : *const u8, command : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetJobNamedProperty(hprinter : PRINTER_HANDLE, jobid : u32, pproperty : *const PrintNamedProperty) -> u32);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetJobW(hprinter : PRINTER_HANDLE, jobid : u32, level : u32, pjob : *const u8, command : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetPortA(pname : windows_sys::core::PCSTR, pportname : windows_sys::core::PCSTR, dwlevel : u32, pportinfo : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetPortW(pname : windows_sys::core::PCWSTR, pportname : windows_sys::core::PCWSTR, dwlevel : u32, pportinfo : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetPrinterA(hprinter : PRINTER_HANDLE, level : u32, pprinter : *const u8, command : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetPrinterDataA(hprinter : PRINTER_HANDLE, pvaluename : windows_sys::core::PCSTR, r#type : u32, pdata : *const u8, cbdata : u32) -> u32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetPrinterDataExA(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCSTR, pvaluename : windows_sys::core::PCSTR, r#type : u32, pdata : *const u8, cbdata : u32) -> u32);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetPrinterDataExW(hprinter : PRINTER_HANDLE, pkeyname : windows_sys::core::PCWSTR, pvaluename : windows_sys::core::PCWSTR, r#type : u32, pdata : *const u8, cbdata : u32) -> u32);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetPrinterDataW(hprinter : PRINTER_HANDLE, pvaluename : windows_sys::core::PCWSTR, r#type : u32, pdata : *const u8, cbdata : u32) -> u32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn SetPrinterW(hprinter : PRINTER_HANDLE, level : u32, pprinter : *const u8, command : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn SplIsSessionZero(hprinter : PRINTER_HANDLE, jobid : u32, pissessionzero : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn SplPromptUIInUsersSession(hprinter : PRINTER_HANDLE, jobid : u32, puiparams : *const SHOWUIPARAMS, presponse : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn SpoolerCopyFileEvent(pszprintername : windows_sys::core::PCWSTR, pszkey : windows_sys::core::PCWSTR, dwcopyfileevent : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn SpoolerFindClosePrinterChangeNotification(hprinter : PRINTER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn SpoolerFindFirstPrinterChangeNotification(hprinter : PRINTER_HANDLE, fdwfilterflags : u32, fdwoptions : u32, pprinternotifyoptions : *const core::ffi::c_void, pvreserved : *const core::ffi::c_void, pnotificationconfig : *const core::ffi::c_void, phnotify : *mut super::super::Foundation:: HANDLE, phevent : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn SpoolerFindNextPrinterChangeNotification(hprinter : PRINTER_HANDLE, pfdwchange : *mut u32, pprinternotifyoptions : *const core::ffi::c_void, ppprinternotifyinfo : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn SpoolerFreePrinterNotifyInfo(pinfo : *const PRINTER_NOTIFY_INFO));

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn SpoolerRefreshPrinterChangeNotification(hprinter : PRINTER_HANDLE, dwcolor : u32, poptions : *const PRINTER_NOTIFY_OPTIONS, ppinfo : *mut *mut PRINTER_NOTIFY_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn StartDocPrinterA(hprinter : PRINTER_HANDLE, level : u32, pdocinfo : *const DOC_INFO_1A) -> u32);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn StartDocPrinterW(hprinter : PRINTER_HANDLE, level : u32, pdocinfo : *const DOC_INFO_1W) -> u32);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn StartPagePrinter(hprinter : PRINTER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn UnRegisterForPrintAsyncNotifications(param0 : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("spoolss.dll" "system" fn UpdatePrintDeviceObject(hprinter : PRINTER_HANDLE, hdeviceobject : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn UploadPrinterDriverPackageA(pszserver : windows_sys::core::PCSTR, pszinfpath : windows_sys::core::PCSTR, pszenvironment : windows_sys::core::PCSTR, dwflags : u32, hwnd : super::super::Foundation:: HWND, pszdestinfpath : windows_sys::core::PSTR, pcchdestinfpath : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn UploadPrinterDriverPackageW(pszserver : windows_sys::core::PCWSTR, pszinfpath : windows_sys::core::PCWSTR, pszenvironment : windows_sys::core::PCWSTR, dwflags : u32, hwnd : super::super::Foundation:: HWND, pszdestinfpath : windows_sys::core::PWSTR, pcchdestinfpath : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn WaitForPrinterChange(hprinter : PRINTER_HANDLE, flags : u32) -> u32);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn WritePrinter(hprinter : PRINTER_HANDLE, pbuf : *const core::ffi::c_void, cbbuf : u32, pcwritten : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("winspool.drv" "system" fn XcvDataW(hxcv : super::super::Foundation:: HANDLE, pszdataname : windows_sys::core::PCWSTR, pinputdata : *const u8, cbinputdata : u32, poutputdata : *mut u8, cboutputdata : u32, pcboutputneeded : *mut u32, pdwstatus : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDJOB_INFO_1A {
//     pub Path: windows_sys::core::PSTR,
//     pub JobId: u32,
// }

// UNSUPPORTED Rust 246:1: declaration Impl has no candidate rule
// impl Default for ADDJOB_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDJOB_INFO_1W {
//     pub Path: windows_sys::core::PWSTR,
//     pub JobId: u32,
// }

// UNSUPPORTED Rust 257:1: declaration Impl has no candidate rule
// impl Default for ADDJOB_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ALREADY_REGISTERED`: `PrintAsyncNotifyError` = 15;
public const val `ALREADY_UNREGISTERED`: `PrintAsyncNotifyError` = 14;
public const val `APD_COPY_ALL_FILES`: UInt = 4u;
public const val `APD_COPY_FROM_DIRECTORY`: UInt = 16u;
public const val `APD_COPY_NEW_FILES`: UInt = 8u;
public const val `APD_STRICT_DOWNGRADE`: UInt = 2u;
public const val `APD_STRICT_UPGRADE`: UInt = 1u;
public const val `APPLYCPSUI_NO_NEWDEF`: UInt = 1u;
public const val `APPLYCPSUI_OK_CANCEL_BUTTON`: UInt = 2u;
public const val `ASYNC_CALL_ALREADY_PARKED`: `PrintAsyncNotifyError` = 12;
public const val `ASYNC_CALL_IN_PROGRESS`: `PrintAsyncNotifyError` = 17;
public const val `ASYNC_NOTIFICATION_FAILURE`: `PrintAsyncNotifyError` = 6;
// UNSUPPORTED Rust 274:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATTRIBUTE_INFO_1 {
//     pub dwJobNumberOfPagesPerSide: u32,
//     pub dwDrvNumberOfPagesPerSide: u32,
//     pub dwNupBorderFlags: u32,
//     pub dwJobPageOrderFlags: u32,
//     pub dwDrvPageOrderFlags: u32,
//     pub dwJobNumberOfCopies: u32,
//     pub dwDrvNumberOfCopies: u32,
// }

// UNSUPPORTED Rust 285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATTRIBUTE_INFO_2 {
//     pub dwJobNumberOfPagesPerSide: u32,
//     pub dwDrvNumberOfPagesPerSide: u32,
//     pub dwNupBorderFlags: u32,
//     pub dwJobPageOrderFlags: u32,
//     pub dwDrvPageOrderFlags: u32,
//     pub dwJobNumberOfCopies: u32,
//     pub dwDrvNumberOfCopies: u32,
//     pub dwColorOptimization: u32,
// }

// UNSUPPORTED Rust 297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATTRIBUTE_INFO_3 {
//     pub dwJobNumberOfPagesPerSide: u32,
//     pub dwDrvNumberOfPagesPerSide: u32,
//     pub dwNupBorderFlags: u32,
//     pub dwJobPageOrderFlags: u32,
//     pub dwDrvPageOrderFlags: u32,
//     pub dwJobNumberOfCopies: u32,
//     pub dwDrvNumberOfCopies: u32,
//     pub dwColorOptimization: u32,
//     pub dmPrintQuality: i16,
//     pub dmYResolution: i16,
// }

// UNSUPPORTED Rust 311:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATTRIBUTE_INFO_4 {
//     pub dwJobNumberOfPagesPerSide: u32,
//     pub dwDrvNumberOfPagesPerSide: u32,
//     pub dwNupBorderFlags: u32,
//     pub dwJobPageOrderFlags: u32,
//     pub dwDrvPageOrderFlags: u32,
//     pub dwJobNumberOfCopies: u32,
//     pub dwDrvNumberOfCopies: u32,
//     pub dwColorOptimization: u32,
//     pub dmPrintQuality: i16,
//     pub dmYResolution: i16,
//     pub dwDuplexFlags: u32,
//     pub dwNupDirection: u32,
//     pub dwBookletFlags: u32,
//     pub dwScalingPercentX: u32,
//     pub dwScalingPercentY: u32,
// }

public const val `BIDI_ACCESS_ADMINISTRATOR`: UInt = 1u;
public const val `BIDI_ACCESS_USER`: UInt = 2u;
// UNSUPPORTED Rust 332:1: non-scalar type Ptr unsupported
// pub const BIDI_ACTION_ENUM_SCHEMA: windows_sys::core::PCWSTR = windows_sys::core::w!("EnumSchema");

// UNSUPPORTED Rust 333:1: non-scalar type Ptr unsupported
// pub const BIDI_ACTION_GET: windows_sys::core::PCWSTR = windows_sys::core::w!("Get");

// UNSUPPORTED Rust 334:1: non-scalar type Ptr unsupported
// pub const BIDI_ACTION_GET_ALL: windows_sys::core::PCWSTR = windows_sys::core::w!("GetAll");

// UNSUPPORTED Rust 335:1: non-scalar type Ptr unsupported
// pub const BIDI_ACTION_GET_WITH_ARGUMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("GetWithArgument");

// UNSUPPORTED Rust 336:1: non-scalar type Ptr unsupported
// pub const BIDI_ACTION_SET: windows_sys::core::PCWSTR = windows_sys::core::w!("Set");

public const val `BIDI_BLOB`: `BIDI_TYPE` = 7;
public const val `BIDI_BOOL`: `BIDI_TYPE` = 3;
// UNSUPPORTED Rust 339:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BIDI_DATA {
//     pub dwBidiType: u32,
//     pub u: BIDI_DATA_0,
// }

// UNSUPPORTED Rust 345:1: declaration Impl has no candidate rule
// impl Default for BIDI_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 350:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BIDI_DATA_0 {
//     pub bData: windows_sys::core::BOOL,
//     pub iData: i32,
//     pub sData: windows_sys::core::PWSTR,
//     pub fData: f32,
//     pub biData: BINARY_CONTAINER,
// }

// UNSUPPORTED Rust 359:1: declaration Impl has no candidate rule
// impl Default for BIDI_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BIDI_ENUM`: `BIDI_TYPE` = 6;
public const val `BIDI_FLOAT`: `BIDI_TYPE` = 2;
public const val `BIDI_INT`: `BIDI_TYPE` = 1;
public const val `BIDI_NULL`: `BIDI_TYPE` = 0;
// UNSUPPORTED Rust 368:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BIDI_REQUEST_CONTAINER {
//     pub Version: u32,
//     pub Flags: u32,
//     pub Count: u32,
//     pub aData: [BIDI_REQUEST_DATA; 1],
// }

// UNSUPPORTED Rust 376:1: declaration Impl has no candidate rule
// impl Default for BIDI_REQUEST_CONTAINER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 381:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BIDI_REQUEST_DATA {
//     pub dwReqNumber: u32,
//     pub pSchema: windows_sys::core::PWSTR,
//     pub data: BIDI_DATA,
// }

// UNSUPPORTED Rust 388:1: declaration Impl has no candidate rule
// impl Default for BIDI_REQUEST_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 393:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BIDI_RESPONSE_CONTAINER {
//     pub Version: u32,
//     pub Flags: u32,
//     pub Count: u32,
//     pub aData: [BIDI_RESPONSE_DATA; 1],
// }

// UNSUPPORTED Rust 401:1: declaration Impl has no candidate rule
// impl Default for BIDI_RESPONSE_CONTAINER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 406:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BIDI_RESPONSE_DATA {
//     pub dwResult: u32,
//     pub dwReqNumber: u32,
//     pub pSchema: windows_sys::core::PWSTR,
//     pub data: BIDI_DATA,
// }

// UNSUPPORTED Rust 414:1: declaration Impl has no candidate rule
// impl Default for BIDI_RESPONSE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BIDI_STRING`: `BIDI_TYPE` = 4;
public const val `BIDI_TEXT`: `BIDI_TYPE` = 5;
public typealias `BIDI_TYPE` = Int;
// UNSUPPORTED Rust 422:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BINARY_CONTAINER {
//     pub cbBuf: u32,
//     pub pData: *mut u8,
// }

// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule
// impl Default for BINARY_CONTAINER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BOOKLET_EDGE_LEFT`: UInt = 0u;
public const val `BOOKLET_EDGE_RIGHT`: UInt = 1u;
public const val `BOOKLET_PRINT`: UInt = 2u;
public const val `BORDER_PRINT`: UInt = 0u;
// UNSUPPORTED Rust 437:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const BidiRequest: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9162a23_45f9_47cc_80f5_fe0fe9b9e1a2);

// UNSUPPORTED Rust 438:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const BidiRequestContainer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc5b8a24_db05_4a01_8388_22edf6c2bbba);

// UNSUPPORTED Rust 439:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const BidiSpl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2a614240_a4c5_4c33_bd87_1bc709331639);

// UNSUPPORTED Rust 440:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BranchOfficeJobData {
//     pub eEventType: EBranchOfficeJobEventType,
//     pub JobId: u32,
//     pub JobInfo: BranchOfficeJobData_0,
// }

// UNSUPPORTED Rust 447:1: declaration Impl has no candidate rule
// impl Default for BranchOfficeJobData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 452:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BranchOfficeJobData_0 {
//     pub LogJobPrinted: BranchOfficeJobDataPrinted,
//     pub LogJobRendered: BranchOfficeJobDataRendered,
//     pub LogJobError: BranchOfficeJobDataError,
//     pub LogPipelineFailed: BranchOfficeJobDataPipelineFailed,
//     pub LogOfflineFileFull: BranchOfficeLogOfflineFileFull,
// }

// UNSUPPORTED Rust 461:1: declaration Impl has no candidate rule
// impl Default for BranchOfficeJobData_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 466:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BranchOfficeJobDataContainer {
//     pub cJobDataEntries: u32,
//     pub JobData: [BranchOfficeJobData; 1],
// }

// UNSUPPORTED Rust 472:1: declaration Impl has no candidate rule
// impl Default for BranchOfficeJobDataContainer {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 477:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BranchOfficeJobDataError {
//     pub LastError: u32,
//     pub pDocumentName: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub pDataType: windows_sys::core::PWSTR,
//     pub TotalSize: i64,
//     pub PrintedSize: i64,
//     pub TotalPages: u32,
//     pub PrintedPages: u32,
//     pub pMachineName: windows_sys::core::PWSTR,
//     pub pJobError: windows_sys::core::PWSTR,
//     pub pErrorDescription: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 493:1: declaration Impl has no candidate rule
// impl Default for BranchOfficeJobDataError {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 498:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BranchOfficeJobDataPipelineFailed {
//     pub pDocumentName: windows_sys::core::PWSTR,
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub pExtraErrorInfo: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 505:1: declaration Impl has no candidate rule
// impl Default for BranchOfficeJobDataPipelineFailed {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 510:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BranchOfficeJobDataPrinted {
//     pub Status: u32,
//     pub pDocumentName: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub pMachineName: windows_sys::core::PWSTR,
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub pPortName: windows_sys::core::PWSTR,
//     pub Size: i64,
//     pub TotalPages: u32,
// }

// UNSUPPORTED Rust 522:1: declaration Impl has no candidate rule
// impl Default for BranchOfficeJobDataPrinted {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BranchOfficeJobDataRendered {
//     pub Size: i64,
//     pub ICMMethod: u32,
//     pub Color: i16,
//     pub PrintQuality: i16,
//     pub YResolution: i16,
//     pub Copies: i16,
//     pub TTOption: i16,
// }

// UNSUPPORTED Rust 538:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BranchOfficeLogOfflineFileFull {
//     pub pMachineName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 543:1: declaration Impl has no candidate rule
// impl Default for BranchOfficeLogOfflineFileFull {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CC_BIG5`: Int = -10;
public const val `CC_CP437`: Int = -1;
public const val `CC_CP850`: Int = -2;
public const val `CC_CP863`: Int = -3;
public const val `CC_DEFAULT`: UInt = 0u;
public const val `CC_GB2312`: Int = -16;
public const val `CC_ISC`: Int = -11;
public const val `CC_JIS`: Int = -12;
public const val `CC_JIS_ANK`: Int = -13;
public const val `CC_NOPRECNV`: UInt = 65535u;
public const val `CC_NS86`: Int = -14;
public const val `CC_SJIS`: Int = -17;
public const val `CC_TCA`: Int = -15;
public const val `CC_WANSUNG`: Int = -18;
public const val `CDM_CONVERT`: UInt = 1u;
public const val `CDM_CONVERT351`: UInt = 2u;
public const val `CDM_DRIVER_DEFAULT`: UInt = 4u;
public const val `CHANNEL_ACQUIRED`: `PrintAsyncNotifyError` = 16;
public const val `CHANNEL_ALREADY_CLOSED`: `PrintAsyncNotifyError` = 8;
public const val `CHANNEL_ALREADY_OPENED`: `PrintAsyncNotifyError` = 9;
public const val `CHANNEL_CLOSED_BY_ANOTHER_LISTENER`: `PrintAsyncNotifyError` = 2;
public const val `CHANNEL_CLOSED_BY_SAME_LISTENER`: `PrintAsyncNotifyError` = 3;
public const val `CHANNEL_CLOSED_BY_SERVER`: `PrintAsyncNotifyError` = 1;
public const val `CHANNEL_NOT_OPENED`: `PrintAsyncNotifyError` = 11;
public const val `CHANNEL_RELEASED_BY_LISTENER`: `PrintAsyncNotifyError` = 4;
public const val `CHANNEL_WAITING_FOR_CLIENT_NOTIFICATION`: `PrintAsyncNotifyError` = 10;
public const val `CHKBOXS_FALSE_PDATA`: UInt = 3u;
public const val `CHKBOXS_FALSE_TRUE`: UInt = 0u;
public const val `CHKBOXS_NONE_PDATA`: UInt = 6u;
public const val `CHKBOXS_NO_PDATA`: UInt = 4u;
public const val `CHKBOXS_NO_YES`: UInt = 1u;
public const val `CHKBOXS_OFF_ON`: UInt = 2u;
public const val `CHKBOXS_OFF_PDATA`: UInt = 5u;
// UNSUPPORTED Rust 581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_OEMPTPROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91723892_45d2_48e2_9ec9_562379daf992);

// UNSUPPORTED Rust 582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_OEMRENDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6d6abf26_9f38_11d1_882a_00c04fb961ec);

// UNSUPPORTED Rust 583:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_OEMUI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabce80d7_9f46_11d1_882a_00c04fb961ec);

// UNSUPPORTED Rust 584:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_OEMUIMXDC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e144300_5b43_4288_932a_5e4dd6d82bed);

// UNSUPPORTED Rust 585:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_PTPROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46ac151b_8490_4531_96cc_55bf2bf19e11);

// UNSUPPORTED Rust 586:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_XPSRASTERIZER_FACTORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x503e79bf_1d09_4764_9d72_1eb0c65967c6);

public const val `COLOR_OPTIMIZATION`: UInt = 1u;
// UNSUPPORTED Rust 588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct COMPROPSHEETUI {
//     pub cbSize: u16,
//     pub Flags: u16,
//     pub hInstCaller: super::super::Foundation::HINSTANCE,
//     pub pCallerName: *mut i8,
//     pub UserData: usize,
//     pub pHelpFile: *mut i8,
//     pub pfnCallBack: _CPSUICALLBACK,
//     pub pOptItem: *mut OPTITEM,
//     pub pDlgPage: *mut DLGPAGE,
//     pub cOptItem: u16,
//     pub cDlgPage: u16,
//     pub IconID: usize,
//     pub pOptItemName: *mut i8,
//     pub CallerVersion: u16,
//     pub OptItemVersion: u16,
//     pub dwReserved: [usize; 4],
// }

// UNSUPPORTED Rust 609:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for COMPROPSHEETUI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 615:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONFIG_INFO_DATA_1 {
//     pub Reserved: [u8; 128],
//     pub dwVersion: u32,
// }

// UNSUPPORTED Rust 621:1: declaration Impl has no candidate rule
// impl Default for CONFIG_INFO_DATA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `COPYFILE_EVENT_ADD_PRINTER_CONNECTION`: UInt = 3u;
public const val `COPYFILE_EVENT_DELETE_PRINTER`: UInt = 2u;
public const val `COPYFILE_EVENT_DELETE_PRINTER_CONNECTION`: UInt = 4u;
public const val `COPYFILE_EVENT_FILES_CHANGED`: UInt = 5u;
public const val `COPYFILE_EVENT_SET_PRINTER_DATAEX`: UInt = 1u;
public const val `COPYFILE_FLAG_CLIENT_SPOOLER`: UInt = 1u;
public const val `COPYFILE_FLAG_SERVER_SPOOLER`: UInt = 2u;
// UNSUPPORTED Rust 633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CORE_PRINTER_DRIVERA {
//     pub CoreDriverGUID: windows_sys::core::GUID,
//     pub ftDriverDate: super::super::Foundation::FILETIME,
//     pub dwlDriverVersion: u64,
//     pub szPackageID: [i8; 260],
// }

// UNSUPPORTED Rust 641:1: declaration Impl has no candidate rule
// impl Default for CORE_PRINTER_DRIVERA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 646:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CORE_PRINTER_DRIVERW {
//     pub CoreDriverGUID: windows_sys::core::GUID,
//     pub ftDriverDate: super::super::Foundation::FILETIME,
//     pub dwlDriverVersion: u64,
//     pub szPackageID: [u16; 260],
// }

// UNSUPPORTED Rust 654:1: declaration Impl has no candidate rule
// impl Default for CORE_PRINTER_DRIVERW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CPSFUNC_ADD_HPROPSHEETPAGE`: UInt = 0u;
public const val `CPSFUNC_ADD_PCOMPROPSHEETUI`: UInt = 3u;
public const val `CPSFUNC_ADD_PCOMPROPSHEETUIA`: UInt = 2u;
public const val `CPSFUNC_ADD_PCOMPROPSHEETUIW`: UInt = 3u;
public const val `CPSFUNC_ADD_PFNPROPSHEETUI`: UInt = 5u;
public const val `CPSFUNC_ADD_PFNPROPSHEETUIA`: UInt = 4u;
public const val `CPSFUNC_ADD_PFNPROPSHEETUIW`: UInt = 5u;
public const val `CPSFUNC_ADD_PROPSHEETPAGE`: UInt = 1u;
public const val `CPSFUNC_ADD_PROPSHEETPAGEA`: UInt = 15u;
public const val `CPSFUNC_ADD_PROPSHEETPAGEW`: UInt = 1u;
public const val `CPSFUNC_DELETE_HCOMPROPSHEET`: UInt = 6u;
public const val `CPSFUNC_DO_APPLY_CPSUI`: UInt = 25u;
public const val `CPSFUNC_GET_HPSUIPAGES`: UInt = 10u;
public const val `CPSFUNC_GET_PAGECOUNT`: UInt = 8u;
public const val `CPSFUNC_GET_PFNPROPSHEETUI_ICON`: UInt = 14u;
public const val `CPSFUNC_IGNORE_CPSUI_PSN_APPLY`: UInt = 24u;
public const val `CPSFUNC_INSERT_PSUIPAGE`: UInt = 17u;
public const val `CPSFUNC_INSERT_PSUIPAGEA`: UInt = 16u;
public const val `CPSFUNC_INSERT_PSUIPAGEW`: UInt = 17u;
public const val `CPSFUNC_LOAD_CPSUI_ICON`: UInt = 13u;
public const val `CPSFUNC_LOAD_CPSUI_STRING`: UInt = 12u;
public const val `CPSFUNC_LOAD_CPSUI_STRINGA`: UInt = 11u;
public const val `CPSFUNC_LOAD_CPSUI_STRINGW`: UInt = 12u;
public const val `CPSFUNC_QUERY_DATABLOCK`: UInt = 22u;
public const val `CPSFUNC_SET_DATABLOCK`: UInt = 21u;
public const val `CPSFUNC_SET_DMPUB_HIDEBITS`: UInt = 23u;
public const val `CPSFUNC_SET_FUSION_CONTEXT`: UInt = 26u;
public const val `CPSFUNC_SET_HSTARTPAGE`: UInt = 7u;
public const val `CPSFUNC_SET_PSUIPAGE_ICON`: UInt = 20u;
public const val `CPSFUNC_SET_PSUIPAGE_TITLE`: UInt = 19u;
public const val `CPSFUNC_SET_PSUIPAGE_TITLEA`: UInt = 18u;
public const val `CPSFUNC_SET_PSUIPAGE_TITLEW`: UInt = 19u;
public const val `CPSFUNC_SET_RESULT`: UInt = 9u;
// UNSUPPORTED Rust 692:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct CPSUICBPARAM {
//     pub cbSize: u16,
//     pub Reason: u16,
//     pub hDlg: super::super::Foundation::HWND,
//     pub pOptItem: *mut OPTITEM,
//     pub cOptItem: u16,
//     pub Flags: u16,
//     pub pCurItem: *mut OPTITEM,
//     pub Anonymous: CPSUICBPARAM_0,
//     pub UserData: usize,
//     pub Result: usize,
// }

// UNSUPPORTED Rust 707:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for CPSUICBPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 713:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union CPSUICBPARAM_0 {
//     pub OldSel: i32,
//     pub pOldSel: *mut i8,
// }

// UNSUPPORTED Rust 720:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for CPSUICBPARAM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CPSUICB_ACTION_ITEMS_APPLIED`: UInt = 4u;
public const val `CPSUICB_ACTION_NONE`: UInt = 0u;
public const val `CPSUICB_ACTION_NO_APPLY_EXIT`: UInt = 3u;
public const val `CPSUICB_ACTION_OPTIF_CHANGED`: UInt = 1u;
public const val `CPSUICB_ACTION_REINIT_ITEMS`: UInt = 2u;
public const val `CPSUICB_REASON_ABOUT`: UInt = 9u;
public const val `CPSUICB_REASON_APPLYNOW`: UInt = 6u;
public const val `CPSUICB_REASON_DLGPROC`: UInt = 3u;
public const val `CPSUICB_REASON_ECB_CHANGED`: UInt = 2u;
public const val `CPSUICB_REASON_EXTPUSH`: UInt = 5u;
public const val `CPSUICB_REASON_ITEMS_REVERTED`: UInt = 8u;
public const val `CPSUICB_REASON_KILLACTIVE`: UInt = 11u;
public const val `CPSUICB_REASON_OPTITEM_SETFOCUS`: UInt = 7u;
public const val `CPSUICB_REASON_PUSHBUTTON`: UInt = 1u;
public const val `CPSUICB_REASON_SEL_CHANGED`: UInt = 0u;
public const val `CPSUICB_REASON_SETACTIVE`: UInt = 10u;
public const val `CPSUICB_REASON_UNDO_CHANGES`: UInt = 4u;
// UNSUPPORTED Rust 743:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPSUIDATABLOCK {
//     pub cbData: u32,
//     pub pbData: *mut u8,
// }

// UNSUPPORTED Rust 749:1: declaration Impl has no candidate rule
// impl Default for CPSUIDATABLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CPSUIF_ABOUT_CALLBACK`: UInt = 4u;
public const val `CPSUIF_ICONID_AS_HICON`: UInt = 2u;
public const val `CPSUIF_UPDATE_PERMISSION`: UInt = 1u;
public const val `CPSUI_CANCEL`: UInt = 0u;
public const val `CPSUI_OK`: UInt = 1u;
public const val `CPSUI_REBOOTSYSTEM`: UInt = 3u;
public const val `CPSUI_RESTARTWINDOWS`: UInt = 2u;
public const val `CUSTOMPARAM_HEIGHT`: UInt = 1u;
public const val `CUSTOMPARAM_HEIGHTOFFSET`: UInt = 3u;
public const val `CUSTOMPARAM_MAX`: UInt = 5u;
public const val `CUSTOMPARAM_ORIENTATION`: UInt = 4u;
public const val `CUSTOMPARAM_WIDTH`: UInt = 0u;
public const val `CUSTOMPARAM_WIDTHOFFSET`: UInt = 2u;
// UNSUPPORTED Rust 767:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CUSTOMSIZEPARAM {
//     pub dwOrder: i32,
//     pub lMinVal: i32,
//     pub lMaxVal: i32,
// }

public const val `Compression_Fast`: `EXpsCompressionOptions` = 3;
public const val `Compression_Normal`: `EXpsCompressionOptions` = 1;
public const val `Compression_NotCompressed`: `EXpsCompressionOptions` = 0;
public const val `Compression_Small`: `EXpsCompressionOptions` = 2;
// UNSUPPORTED Rust 778:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DATATYPES_INFO_1A {
//     pub pName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 783:1: declaration Impl has no candidate rule
// impl Default for DATATYPES_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 788:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DATATYPES_INFO_1W {
//     pub pName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 793:1: declaration Impl has no candidate rule
// impl Default for DATATYPES_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 798:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DATA_HEADER {
//     pub dwSignature: u32,
//     pub wSize: u16,
//     pub wDataID: u16,
//     pub dwDataSize: u32,
//     pub dwReserved: u32,
// }

public const val `DEF_PRIORITY`: UInt = 1u;
// UNSUPPORTED Rust 808:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DELETE_PORT_DATA_1 {
//     pub psztPortName: [u16; 64],
//     pub Reserved: [u8; 98],
//     pub dwVersion: u32,
//     pub dwReserved: u32,
// }

// UNSUPPORTED Rust 816:1: declaration Impl has no candidate rule
// impl Default for DELETE_PORT_DATA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 821:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEVICEPROPERTYHEADER {
//     pub cbSize: u16,
//     pub Flags: u16,
//     pub hPrinter: super::super::Foundation::HANDLE,
//     pub pszPrinterName: *mut i8,
// }

// UNSUPPORTED Rust 829:1: declaration Impl has no candidate rule
// impl Default for DEVICEPROPERTYHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 834:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct DEVQUERYPRINT_INFO {
//     pub cbSize: u16,
//     pub Level: u16,
//     pub hPrinter: super::super::Foundation::HANDLE,
//     pub pDevMode: *mut super::Gdi::DEVMODEA,
//     pub pszErrorStr: windows_sys::core::PWSTR,
//     pub cchErrorStr: u32,
//     pub cchNeeded: u32,
// }

// UNSUPPORTED Rust 846:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DEVQUERYPRINT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DF_BKSP_OK`: UInt = 64u;
public const val `DF_NOITALIC`: UInt = 1u;
public const val `DF_NOUNDER`: UInt = 2u;
public const val `DF_NO_BOLD`: UInt = 8u;
public const val `DF_NO_DOUBLE_UNDERLINE`: UInt = 16u;
public const val `DF_NO_STRIKETHRU`: UInt = 32u;
public const val `DF_TYPE_CAPSL`: UInt = 3u;
public const val `DF_TYPE_HPINTELLIFONT`: UInt = 0u;
public const val `DF_TYPE_OEM1`: UInt = 4u;
public const val `DF_TYPE_OEM2`: UInt = 5u;
public const val `DF_TYPE_PST1`: UInt = 2u;
public const val `DF_TYPE_TRUETYPE`: UInt = 1u;
public const val `DF_XM_CR`: UInt = 4u;
public const val `DISPID_PRINTEREXTENSION_CONTEXT`: UInt = 11800u;
public const val `DISPID_PRINTEREXTENSION_CONTEXTCOLLECTION`: UInt = 12100u;
public const val `DISPID_PRINTEREXTENSION_CONTEXTCOLLECTION_COUNT`: UInt = 12101u;
public const val `DISPID_PRINTEREXTENSION_CONTEXTCOLLECTION_GETAT`: UInt = 12102u;
public const val `DISPID_PRINTEREXTENSION_CONTEXT_DRIVERPROPERTIES`: UInt = 11803u;
public const val `DISPID_PRINTEREXTENSION_CONTEXT_PRINTERQUEUE`: UInt = 11801u;
public const val `DISPID_PRINTEREXTENSION_CONTEXT_PRINTSCHEMATICKET`: UInt = 11802u;
public const val `DISPID_PRINTEREXTENSION_CONTEXT_USERPROPERTIES`: UInt = 11804u;
public const val `DISPID_PRINTEREXTENSION_EVENT`: UInt = 12200u;
public const val `DISPID_PRINTEREXTENSION_EVENTARGS`: UInt = 12000u;
public const val `DISPID_PRINTEREXTENSION_EVENTARGS_BIDINOTIFICATION`: UInt = 12001u;
public const val `DISPID_PRINTEREXTENSION_EVENTARGS_DETAILEDREASONID`: UInt = 12005u;
public const val `DISPID_PRINTEREXTENSION_EVENTARGS_REASONID`: UInt = 12002u;
public const val `DISPID_PRINTEREXTENSION_EVENTARGS_REQUEST`: UInt = 12003u;
public const val `DISPID_PRINTEREXTENSION_EVENTARGS_SOURCEAPPLICATION`: UInt = 12004u;
public const val `DISPID_PRINTEREXTENSION_EVENTARGS_WINDOWMODAL`: UInt = 12006u;
public const val `DISPID_PRINTEREXTENSION_EVENTARGS_WINDOWPARENT`: UInt = 12007u;
public const val `DISPID_PRINTEREXTENSION_EVENT_ONDRIVEREVENT`: UInt = 12201u;
public const val `DISPID_PRINTEREXTENSION_EVENT_ONPRINTERQUEUESENUMERATED`: UInt = 12202u;
public const val `DISPID_PRINTEREXTENSION_REQUEST`: UInt = 11900u;
public const val `DISPID_PRINTEREXTENSION_REQUEST_CANCEL`: UInt = 11901u;
public const val `DISPID_PRINTEREXTENSION_REQUEST_COMPLETE`: UInt = 11902u;
public const val `DISPID_PRINTERPROPERTYBAG`: UInt = 11400u;
public const val `DISPID_PRINTERPROPERTYBAG_GETBOOL`: UInt = 11401u;
public const val `DISPID_PRINTERPROPERTYBAG_GETBYTES`: UInt = 11407u;
public const val `DISPID_PRINTERPROPERTYBAG_GETINT32`: UInt = 11403u;
public const val `DISPID_PRINTERPROPERTYBAG_GETREADSTREAM`: UInt = 11409u;
public const val `DISPID_PRINTERPROPERTYBAG_GETSTRING`: UInt = 11405u;
public const val `DISPID_PRINTERPROPERTYBAG_GETWRITESTREAM`: UInt = 11410u;
public const val `DISPID_PRINTERPROPERTYBAG_SETBOOL`: UInt = 11402u;
public const val `DISPID_PRINTERPROPERTYBAG_SETBYTES`: UInt = 11408u;
public const val `DISPID_PRINTERPROPERTYBAG_SETINT32`: UInt = 11404u;
public const val `DISPID_PRINTERPROPERTYBAG_SETSTRING`: UInt = 11406u;
public const val `DISPID_PRINTERQUEUE`: UInt = 11600u;
public const val `DISPID_PRINTERQUEUEEVENT`: UInt = 11700u;
public const val `DISPID_PRINTERQUEUEEVENT_ONBIDIRESPONSERECEIVED`: UInt = 11701u;
public const val `DISPID_PRINTERQUEUEVIEW`: UInt = 12700u;
public const val `DISPID_PRINTERQUEUEVIEW_EVENT`: UInt = 12800u;
public const val `DISPID_PRINTERQUEUEVIEW_EVENT_ONCHANGED`: UInt = 12801u;
public const val `DISPID_PRINTERQUEUEVIEW_SETVIEWRANGE`: UInt = 12701u;
public const val `DISPID_PRINTERQUEUE_GETPRINTERQUEUEVIEW`: UInt = 11606u;
public const val `DISPID_PRINTERQUEUE_GETPROPERTIES`: UInt = 11604u;
public const val `DISPID_PRINTERQUEUE_HANDLE`: UInt = 11601u;
public const val `DISPID_PRINTERQUEUE_NAME`: UInt = 11602u;
public const val `DISPID_PRINTERQUEUE_SENDBIDIQUERY`: UInt = 11603u;
public const val `DISPID_PRINTERQUEUE_SENDBIDISETREQUESTASYNC`: UInt = 11605u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG`: UInt = 11500u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_GETBOOL`: UInt = 11501u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_GETBYTES`: UInt = 11507u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_GETINT32`: UInt = 11503u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_GETREADSTREAM`: UInt = 11509u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_GETSTREAMASXML`: UInt = 11411u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_GETSTRING`: UInt = 11505u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_GETWRITESTREAM`: UInt = 11510u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_SETBOOL`: UInt = 11502u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_SETBYTES`: UInt = 11508u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_SETINT32`: UInt = 11504u;
public const val `DISPID_PRINTERSCRIPTABLEPROPERTYBAG_SETSTRING`: UInt = 11506u;
public const val `DISPID_PRINTERSCRIPTABLESEQUENTIALSTREAM`: UInt = 11200u;
public const val `DISPID_PRINTERSCRIPTABLESEQUENTIALSTREAM_READ`: UInt = 11201u;
public const val `DISPID_PRINTERSCRIPTABLESEQUENTIALSTREAM_WRITE`: UInt = 11202u;
public const val `DISPID_PRINTERSCRIPTABLESTREAM`: UInt = 11300u;
public const val `DISPID_PRINTERSCRIPTABLESTREAM_COMMIT`: UInt = 11301u;
public const val `DISPID_PRINTERSCRIPTABLESTREAM_SEEK`: UInt = 11302u;
public const val `DISPID_PRINTERSCRIPTABLESTREAM_SETSIZE`: UInt = 11303u;
public const val `DISPID_PRINTERSCRIPTCONTEXT`: UInt = 12300u;
public const val `DISPID_PRINTERSCRIPTCONTEXT_DRIVERPROPERTIES`: UInt = 12301u;
public const val `DISPID_PRINTERSCRIPTCONTEXT_QUEUEPROPERTIES`: UInt = 12302u;
public const val `DISPID_PRINTERSCRIPTCONTEXT_USERPROPERTIES`: UInt = 12303u;
public const val `DISPID_PRINTJOBCOLLECTION`: UInt = 12600u;
public const val `DISPID_PRINTJOBCOLLECTION_COUNT`: UInt = 12601u;
public const val `DISPID_PRINTJOBCOLLECTION_GETAT`: UInt = 12602u;
public const val `DISPID_PRINTSCHEMA_ASYNCOPERATION`: UInt = 10900u;
public const val `DISPID_PRINTSCHEMA_ASYNCOPERATIONEVENT`: UInt = 11100u;
public const val `DISPID_PRINTSCHEMA_ASYNCOPERATIONEVENT_COMPLETED`: UInt = 11101u;
public const val `DISPID_PRINTSCHEMA_ASYNCOPERATION_CANCEL`: UInt = 10902u;
public const val `DISPID_PRINTSCHEMA_ASYNCOPERATION_START`: UInt = 10901u;
public const val `DISPID_PRINTSCHEMA_CAPABILITIES`: UInt = 10800u;
public const val `DISPID_PRINTSCHEMA_CAPABILITIES_GETFEATURE`: UInt = 10802u;
public const val `DISPID_PRINTSCHEMA_CAPABILITIES_GETFEATURE_KEYNAME`: UInt = 10801u;
public const val `DISPID_PRINTSCHEMA_CAPABILITIES_GETOPTIONS`: UInt = 10807u;
public const val `DISPID_PRINTSCHEMA_CAPABILITIES_GETPARAMETERDEFINITION`: UInt = 10808u;
public const val `DISPID_PRINTSCHEMA_CAPABILITIES_GETSELECTEDOPTION`: UInt = 10806u;
public const val `DISPID_PRINTSCHEMA_CAPABILITIES_JOBCOPIESMAXVALUE`: UInt = 10805u;
public const val `DISPID_PRINTSCHEMA_CAPABILITIES_JOBCOPIESMINVALUE`: UInt = 10804u;
public const val `DISPID_PRINTSCHEMA_CAPABILITIES_PAGEIMAGEABLESIZE`: UInt = 10803u;
public const val `DISPID_PRINTSCHEMA_DISPLAYABLEELEMENT`: UInt = 10100u;
public const val `DISPID_PRINTSCHEMA_DISPLAYABLEELEMENT_DISPLAYNAME`: UInt = 10101u;
public const val `DISPID_PRINTSCHEMA_ELEMENT`: UInt = 10000u;
public const val `DISPID_PRINTSCHEMA_ELEMENT_NAME`: UInt = 10002u;
public const val `DISPID_PRINTSCHEMA_ELEMENT_NAMESPACEURI`: UInt = 10003u;
public const val `DISPID_PRINTSCHEMA_ELEMENT_XMLNODE`: UInt = 10001u;
public const val `DISPID_PRINTSCHEMA_FEATURE`: UInt = 10600u;
public const val `DISPID_PRINTSCHEMA_FEATURE_DISPLAYUI`: UInt = 10604u;
public const val `DISPID_PRINTSCHEMA_FEATURE_GETOPTION`: UInt = 10603u;
public const val `DISPID_PRINTSCHEMA_FEATURE_SELECTEDOPTION`: UInt = 10601u;
public const val `DISPID_PRINTSCHEMA_FEATURE_SELECTIONTYPE`: UInt = 10602u;
public const val `DISPID_PRINTSCHEMA_NUPOPTION`: UInt = 10400u;
public const val `DISPID_PRINTSCHEMA_NUPOPTION_PAGESPERSHEET`: UInt = 10401u;
public const val `DISPID_PRINTSCHEMA_OPTION`: UInt = 10200u;
public const val `DISPID_PRINTSCHEMA_OPTIONCOLLECTION`: UInt = 10500u;
public const val `DISPID_PRINTSCHEMA_OPTIONCOLLECTION_COUNT`: UInt = 10501u;
public const val `DISPID_PRINTSCHEMA_OPTIONCOLLECTION_GETAT`: UInt = 10502u;
public const val `DISPID_PRINTSCHEMA_OPTION_CONSTRAINED`: UInt = 10202u;
public const val `DISPID_PRINTSCHEMA_OPTION_GETPROPERTYVALUE`: UInt = 10203u;
public const val `DISPID_PRINTSCHEMA_OPTION_SELECTED`: UInt = 10201u;
public const val `DISPID_PRINTSCHEMA_PAGEIMAGEABLESIZE`: UInt = 10700u;
public const val `DISPID_PRINTSCHEMA_PAGEIMAGEABLESIZE_EXTENT_HEIGHT`: UInt = 10706u;
public const val `DISPID_PRINTSCHEMA_PAGEIMAGEABLESIZE_EXTENT_WIDTH`: UInt = 10705u;
public const val `DISPID_PRINTSCHEMA_PAGEIMAGEABLESIZE_IMAGEABLE_HEIGHT`: UInt = 10702u;
public const val `DISPID_PRINTSCHEMA_PAGEIMAGEABLESIZE_IMAGEABLE_WIDTH`: UInt = 10701u;
public const val `DISPID_PRINTSCHEMA_PAGEIMAGEABLESIZE_ORIGIN_HEIGHT`: UInt = 10704u;
public const val `DISPID_PRINTSCHEMA_PAGEIMAGEABLESIZE_ORIGIN_WIDTH`: UInt = 10703u;
public const val `DISPID_PRINTSCHEMA_PAGEMEDIASIZEOPTION`: UInt = 10300u;
public const val `DISPID_PRINTSCHEMA_PAGEMEDIASIZEOPTION_HEIGHT`: UInt = 10302u;
public const val `DISPID_PRINTSCHEMA_PAGEMEDIASIZEOPTION_WIDTH`: UInt = 10301u;
public const val `DISPID_PRINTSCHEMA_PARAMETERDEFINITION`: UInt = 12500u;
public const val `DISPID_PRINTSCHEMA_PARAMETERDEFINITION_DATATYPE`: UInt = 12503u;
public const val `DISPID_PRINTSCHEMA_PARAMETERDEFINITION_RANGEMAX`: UInt = 12505u;
public const val `DISPID_PRINTSCHEMA_PARAMETERDEFINITION_RANGEMIN`: UInt = 12504u;
public const val `DISPID_PRINTSCHEMA_PARAMETERDEFINITION_UNITTYPE`: UInt = 12502u;
public const val `DISPID_PRINTSCHEMA_PARAMETERDEFINITION_USERINPUTREQUIRED`: UInt = 12501u;
public const val `DISPID_PRINTSCHEMA_PARAMETERINITIALIZER`: UInt = 12400u;
public const val `DISPID_PRINTSCHEMA_PARAMETERINITIALIZER_VALUE`: UInt = 12401u;
public const val `DISPID_PRINTSCHEMA_TICKET`: UInt = 11000u;
public const val `DISPID_PRINTSCHEMA_TICKET_COMMITASYNC`: UInt = 11004u;
public const val `DISPID_PRINTSCHEMA_TICKET_GETCAPABILITIES`: UInt = 11006u;
public const val `DISPID_PRINTSCHEMA_TICKET_GETFEATURE`: UInt = 11002u;
public const val `DISPID_PRINTSCHEMA_TICKET_GETFEATURE_KEYNAME`: UInt = 11001u;
public const val `DISPID_PRINTSCHEMA_TICKET_GETPARAMETERINITIALIZER`: UInt = 11008u;
public const val `DISPID_PRINTSCHEMA_TICKET_JOBCOPIESALLDOCUMENTS`: UInt = 11007u;
public const val `DISPID_PRINTSCHEMA_TICKET_NOTIFYXMLCHANGED`: UInt = 11005u;
public const val `DISPID_PRINTSCHEMA_TICKET_VALIDATEASYNC`: UInt = 11003u;
public const val `DI_CHANNEL`: UInt = 1u;
public const val `DI_MEMORYMAP_WRITE`: UInt = 1u;
public const val `DI_READ_SPOOL_JOB`: UInt = 3u;
// UNSUPPORTED Rust 1001:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct DLGPAGE {
//     pub cbSize: u16,
//     pub Flags: u16,
//     pub DlgProc: super::super::UI::WindowsAndMessaging::DLGPROC,
//     pub pTabName: *mut i8,
//     pub IconID: usize,
//     pub Anonymous: DLGPAGE_0,
// }

// UNSUPPORTED Rust 1012:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for DLGPAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1018:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union DLGPAGE_0 {
//     pub DlgTemplateID: u16,
//     pub hDlgTemplate: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1025:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for DLGPAGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DMPUB_BOOKLET_EDGE`: UInt = 21u;
public const val `DMPUB_COLOR`: UInt = 6u;
public const val `DMPUB_COPIES_COLLATE`: UInt = 3u;
public const val `DMPUB_DEFSOURCE`: UInt = 4u;
public const val `DMPUB_DITHERTYPE`: UInt = 13u;
public const val `DMPUB_DUPLEX`: UInt = 7u;
public const val `DMPUB_FIRST`: UInt = 1u;
public const val `DMPUB_FORMNAME`: UInt = 9u;
public const val `DMPUB_ICMINTENT`: UInt = 11u;
public const val `DMPUB_ICMMETHOD`: UInt = 10u;
public const val `DMPUB_LAST`: UInt = 21u;
public const val `DMPUB_MANUAL_DUPLEX`: UInt = 19u;
public const val `DMPUB_MEDIATYPE`: UInt = 12u;
public const val `DMPUB_NONE`: UInt = 0u;
public const val `DMPUB_NUP`: UInt = 16u;
public const val `DMPUB_NUP_DIRECTION`: UInt = 18u;
public const val `DMPUB_OEM_GRAPHIC_ITEM`: UInt = 98u;
public const val `DMPUB_OEM_PAPER_ITEM`: UInt = 97u;
public const val `DMPUB_OEM_ROOT_ITEM`: UInt = 99u;
public const val `DMPUB_ORIENTATION`: UInt = 1u;
public const val `DMPUB_OUTPUTBIN`: UInt = 14u;
public const val `DMPUB_PAGEORDER`: UInt = 17u;
public const val `DMPUB_PRINTQUALITY`: UInt = 5u;
public const val `DMPUB_QUALITY`: UInt = 15u;
public const val `DMPUB_SCALE`: UInt = 2u;
public const val `DMPUB_STAPLE`: UInt = 20u;
public const val `DMPUB_TTOPTION`: UInt = 8u;
public const val `DMPUB_USER`: UInt = 100u;
public const val `DM_ADVANCED`: UInt = 16u;
public const val `DM_INVALIDATE_DRIVER_CACHE`: UInt = 536870912u;
public const val `DM_NOPERMISSION`: UInt = 32u;
public const val `DM_PROMPT_NON_MODAL`: UInt = 1073741824u;
public const val `DM_RESERVED`: UInt = 2147483648u;
public const val `DM_USER_DEFAULT`: UInt = 64u;
// UNSUPPORTED Rust 1065:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct DOCEVENT_CREATEDCPRE {
//     pub pszDriver: windows_sys::core::PWSTR,
//     pub pszDevice: windows_sys::core::PWSTR,
//     pub pdm: *mut super::Gdi::DEVMODEW,
//     pub bIC: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1074:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DOCEVENT_CREATEDCPRE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1080:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOCEVENT_ESCAPE {
//     pub iEscape: i32,
//     pub cjInput: i32,
//     pub pvInData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1087:1: declaration Impl has no candidate rule
// impl Default for DOCEVENT_ESCAPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1092:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOCEVENT_FILTER {
//     pub cbSize: u32,
//     pub cElementsAllocated: u32,
//     pub cElementsNeeded: u32,
//     pub cElementsReturned: u32,
//     pub aDocEventCall: [u32; 1],
// }

// UNSUPPORTED Rust 1101:1: declaration Impl has no candidate rule
// impl Default for DOCEVENT_FILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOCUMENTEVENT_ABORTDOC`: UInt = 9u;
public const val `DOCUMENTEVENT_CREATEDCPOST`: UInt = 2u;
public const val `DOCUMENTEVENT_CREATEDCPRE`: UInt = 1u;
public const val `DOCUMENTEVENT_DELETEDC`: UInt = 10u;
public const val `DOCUMENTEVENT_ENDDOC`: UInt = 8u;
public const val `DOCUMENTEVENT_ENDDOCPOST`: UInt = 12u;
public const val `DOCUMENTEVENT_ENDDOCPRE`: UInt = 8u;
public const val `DOCUMENTEVENT_ENDPAGE`: UInt = 7u;
public const val `DOCUMENTEVENT_ESCAPE`: UInt = 11u;
public const val `DOCUMENTEVENT_FAILURE`: Int = -1;
public const val `DOCUMENTEVENT_FIRST`: UInt = 1u;
public const val `DOCUMENTEVENT_LAST`: UInt = 15u;
public const val `DOCUMENTEVENT_QUERYFILTER`: UInt = 14u;
public const val `DOCUMENTEVENT_RESETDCPOST`: UInt = 4u;
public const val `DOCUMENTEVENT_RESETDCPRE`: UInt = 3u;
public const val `DOCUMENTEVENT_SPOOLED`: UInt = 65536u;
public const val `DOCUMENTEVENT_STARTDOC`: UInt = 5u;
public const val `DOCUMENTEVENT_STARTDOCPOST`: UInt = 13u;
public const val `DOCUMENTEVENT_STARTDOCPRE`: UInt = 5u;
public const val `DOCUMENTEVENT_STARTPAGE`: UInt = 6u;
public const val `DOCUMENTEVENT_SUCCESS`: UInt = 1u;
public const val `DOCUMENTEVENT_UNSUPPORTED`: UInt = 0u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDDOCUMENTPOST`: UInt = 5u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDDOCUMENTPRE`: UInt = 2u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDDOCUMENTPRINTTICKETPOST`: UInt = 11u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDDOCUMENTPRINTTICKETPRE`: UInt = 8u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDDOCUMENTSEQUENCEPOST`: UInt = 13u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDDOCUMENTSEQUENCEPRE`: UInt = 1u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDDOCUMENTSEQUENCEPRINTTICKETPOST`: UInt = 12u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDDOCUMENTSEQUENCEPRINTTICKETPRE`: UInt = 7u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDPAGEEPRE`: UInt = 3u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDPAGEPOST`: UInt = 4u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDPAGEPRINTTICKETPOST`: UInt = 10u;
public const val `DOCUMENTEVENT_XPS_ADDFIXEDPAGEPRINTTICKETPRE`: UInt = 9u;
public const val `DOCUMENTEVENT_XPS_CANCELJOB`: UInt = 6u;
// UNSUPPORTED Rust 1141:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct DOCUMENTPROPERTYHEADER {
//     pub cbSize: u16,
//     pub Reserved: u16,
//     pub hPrinter: super::super::Foundation::HANDLE,
//     pub pszPrinterName: *mut i8,
//     pub pdmIn: *mut super::Gdi::DEVMODEA,
//     pub pdmOut: *mut super::Gdi::DEVMODEA,
//     pub cbOut: u32,
//     pub fMode: u32,
// }

// UNSUPPORTED Rust 1154:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DOCUMENTPROPERTYHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1160:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOC_INFO_1A {
//     pub pDocName: windows_sys::core::PSTR,
//     pub pOutputFile: windows_sys::core::PSTR,
//     pub pDatatype: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1167:1: declaration Impl has no candidate rule
// impl Default for DOC_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1172:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOC_INFO_1W {
//     pub pDocName: windows_sys::core::PWSTR,
//     pub pOutputFile: windows_sys::core::PWSTR,
//     pub pDatatype: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1179:1: declaration Impl has no candidate rule
// impl Default for DOC_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1184:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOC_INFO_2A {
//     pub pDocName: windows_sys::core::PSTR,
//     pub pOutputFile: windows_sys::core::PSTR,
//     pub pDatatype: windows_sys::core::PSTR,
//     pub dwMode: u32,
//     pub JobId: u32,
// }

// UNSUPPORTED Rust 1193:1: declaration Impl has no candidate rule
// impl Default for DOC_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1198:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOC_INFO_2W {
//     pub pDocName: windows_sys::core::PWSTR,
//     pub pOutputFile: windows_sys::core::PWSTR,
//     pub pDatatype: windows_sys::core::PWSTR,
//     pub dwMode: u32,
//     pub JobId: u32,
// }

// UNSUPPORTED Rust 1207:1: declaration Impl has no candidate rule
// impl Default for DOC_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1212:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOC_INFO_3A {
//     pub pDocName: windows_sys::core::PSTR,
//     pub pOutputFile: windows_sys::core::PSTR,
//     pub pDatatype: windows_sys::core::PSTR,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 1220:1: declaration Impl has no candidate rule
// impl Default for DOC_INFO_3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOC_INFO_3W {
//     pub pDocName: windows_sys::core::PWSTR,
//     pub pOutputFile: windows_sys::core::PWSTR,
//     pub pDatatype: windows_sys::core::PWSTR,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 1233:1: declaration Impl has no candidate rule
// impl Default for DOC_INFO_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1238:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOC_INFO_INTERNAL {
//     pub pDocName: *mut i8,
//     pub pOutputFile: *mut i8,
//     pub pDatatype: *mut i8,
//     pub bLowILJob: windows_sys::core::BOOL,
//     pub hTokenLowIL: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1247:1: declaration Impl has no candidate rule
// impl Default for DOC_INFO_INTERNAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOC_INFO_INTERNAL_LEVEL`: UInt = 100u;
public const val `DPD_DELETE_ALL_FILES`: UInt = 4u;
public const val `DPD_DELETE_SPECIFIC_VERSION`: UInt = 2u;
public const val `DPD_DELETE_UNUSED_FILES`: UInt = 1u;
public const val `DPF_ICONID_AS_HICON`: UInt = 1u;
public const val `DPF_USE_HDLGTEMPLATE`: UInt = 2u;
public const val `DPS_NOPERMISSION`: UInt = 1u;
public const val `DP_STD_DOCPROPPAGE1`: UInt = 65533u;
public const val `DP_STD_DOCPROPPAGE2`: UInt = 65534u;
public const val `DP_STD_RESERVED_START`: UInt = 65520u;
public const val `DP_STD_TREEVIEWPAGE`: UInt = 65535u;
public const val `DRIVER_EVENT_DELETE`: UInt = 2u;
public const val `DRIVER_EVENT_INITIALIZE`: UInt = 1u;
// UNSUPPORTED Rust 1265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_1A {
//     pub pName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1270:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1275:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_1W {
//     pub pName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1280:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_2A {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PSTR,
//     pub pEnvironment: windows_sys::core::PSTR,
//     pub pDriverPath: windows_sys::core::PSTR,
//     pub pDataFile: windows_sys::core::PSTR,
//     pub pConfigFile: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1295:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_2W {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PWSTR,
//     pub pEnvironment: windows_sys::core::PWSTR,
//     pub pDriverPath: windows_sys::core::PWSTR,
//     pub pDataFile: windows_sys::core::PWSTR,
//     pub pConfigFile: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1310:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1315:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_3A {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PSTR,
//     pub pEnvironment: windows_sys::core::PSTR,
//     pub pDriverPath: windows_sys::core::PSTR,
//     pub pDataFile: windows_sys::core::PSTR,
//     pub pConfigFile: windows_sys::core::PSTR,
//     pub pHelpFile: windows_sys::core::PSTR,
//     pub pDependentFiles: windows_sys::core::PSTR,
//     pub pMonitorName: windows_sys::core::PSTR,
//     pub pDefaultDataType: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1329:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1334:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_3W {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PWSTR,
//     pub pEnvironment: windows_sys::core::PWSTR,
//     pub pDriverPath: windows_sys::core::PWSTR,
//     pub pDataFile: windows_sys::core::PWSTR,
//     pub pConfigFile: windows_sys::core::PWSTR,
//     pub pHelpFile: windows_sys::core::PWSTR,
//     pub pDependentFiles: windows_sys::core::PWSTR,
//     pub pMonitorName: windows_sys::core::PWSTR,
//     pub pDefaultDataType: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1348:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_4A {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PSTR,
//     pub pEnvironment: windows_sys::core::PSTR,
//     pub pDriverPath: windows_sys::core::PSTR,
//     pub pDataFile: windows_sys::core::PSTR,
//     pub pConfigFile: windows_sys::core::PSTR,
//     pub pHelpFile: windows_sys::core::PSTR,
//     pub pDependentFiles: windows_sys::core::PSTR,
//     pub pMonitorName: windows_sys::core::PSTR,
//     pub pDefaultDataType: windows_sys::core::PSTR,
//     pub pszzPreviousNames: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1368:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_4A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1373:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_4W {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PWSTR,
//     pub pEnvironment: windows_sys::core::PWSTR,
//     pub pDriverPath: windows_sys::core::PWSTR,
//     pub pDataFile: windows_sys::core::PWSTR,
//     pub pConfigFile: windows_sys::core::PWSTR,
//     pub pHelpFile: windows_sys::core::PWSTR,
//     pub pDependentFiles: windows_sys::core::PWSTR,
//     pub pMonitorName: windows_sys::core::PWSTR,
//     pub pDefaultDataType: windows_sys::core::PWSTR,
//     pub pszzPreviousNames: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1388:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_4W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1393:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_5A {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PSTR,
//     pub pEnvironment: windows_sys::core::PSTR,
//     pub pDriverPath: windows_sys::core::PSTR,
//     pub pDataFile: windows_sys::core::PSTR,
//     pub pConfigFile: windows_sys::core::PSTR,
//     pub dwDriverAttributes: u32,
//     pub dwConfigVersion: u32,
//     pub dwDriverVersion: u32,
// }

// UNSUPPORTED Rust 1406:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_5A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_5W {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PWSTR,
//     pub pEnvironment: windows_sys::core::PWSTR,
//     pub pDriverPath: windows_sys::core::PWSTR,
//     pub pDataFile: windows_sys::core::PWSTR,
//     pub pConfigFile: windows_sys::core::PWSTR,
//     pub dwDriverAttributes: u32,
//     pub dwConfigVersion: u32,
//     pub dwDriverVersion: u32,
// }

// UNSUPPORTED Rust 1424:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_5W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_6A {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PSTR,
//     pub pEnvironment: windows_sys::core::PSTR,
//     pub pDriverPath: windows_sys::core::PSTR,
//     pub pDataFile: windows_sys::core::PSTR,
//     pub pConfigFile: windows_sys::core::PSTR,
//     pub pHelpFile: windows_sys::core::PSTR,
//     pub pDependentFiles: windows_sys::core::PSTR,
//     pub pMonitorName: windows_sys::core::PSTR,
//     pub pDefaultDataType: windows_sys::core::PSTR,
//     pub pszzPreviousNames: windows_sys::core::PSTR,
//     pub ftDriverDate: super::super::Foundation::FILETIME,
//     pub dwlDriverVersion: u64,
//     pub pszMfgName: windows_sys::core::PSTR,
//     pub pszOEMUrl: windows_sys::core::PSTR,
//     pub pszHardwareID: windows_sys::core::PSTR,
//     pub pszProvider: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1450:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_6A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1455:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_6W {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PWSTR,
//     pub pEnvironment: windows_sys::core::PWSTR,
//     pub pDriverPath: windows_sys::core::PWSTR,
//     pub pDataFile: windows_sys::core::PWSTR,
//     pub pConfigFile: windows_sys::core::PWSTR,
//     pub pHelpFile: windows_sys::core::PWSTR,
//     pub pDependentFiles: windows_sys::core::PWSTR,
//     pub pMonitorName: windows_sys::core::PWSTR,
//     pub pDefaultDataType: windows_sys::core::PWSTR,
//     pub pszzPreviousNames: windows_sys::core::PWSTR,
//     pub ftDriverDate: super::super::Foundation::FILETIME,
//     pub dwlDriverVersion: u64,
//     pub pszMfgName: windows_sys::core::PWSTR,
//     pub pszOEMUrl: windows_sys::core::PWSTR,
//     pub pszHardwareID: windows_sys::core::PWSTR,
//     pub pszProvider: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1476:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_6W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1481:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_8A {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PSTR,
//     pub pEnvironment: windows_sys::core::PSTR,
//     pub pDriverPath: windows_sys::core::PSTR,
//     pub pDataFile: windows_sys::core::PSTR,
//     pub pConfigFile: windows_sys::core::PSTR,
//     pub pHelpFile: windows_sys::core::PSTR,
//     pub pDependentFiles: windows_sys::core::PSTR,
//     pub pMonitorName: windows_sys::core::PSTR,
//     pub pDefaultDataType: windows_sys::core::PSTR,
//     pub pszzPreviousNames: windows_sys::core::PSTR,
//     pub ftDriverDate: super::super::Foundation::FILETIME,
//     pub dwlDriverVersion: u64,
//     pub pszMfgName: windows_sys::core::PSTR,
//     pub pszOEMUrl: windows_sys::core::PSTR,
//     pub pszHardwareID: windows_sys::core::PSTR,
//     pub pszProvider: windows_sys::core::PSTR,
//     pub pszPrintProcessor: windows_sys::core::PSTR,
//     pub pszVendorSetup: windows_sys::core::PSTR,
//     pub pszzColorProfiles: windows_sys::core::PSTR,
//     pub pszInfPath: windows_sys::core::PSTR,
//     pub dwPrinterDriverAttributes: u32,
//     pub pszzCoreDriverDependencies: windows_sys::core::PSTR,
//     pub ftMinInboxDriverVerDate: super::super::Foundation::FILETIME,
//     pub dwlMinInboxDriverVerVersion: u64,
// }

// UNSUPPORTED Rust 1510:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_8A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1515:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_INFO_8W {
//     pub cVersion: u32,
//     pub pName: windows_sys::core::PWSTR,
//     pub pEnvironment: windows_sys::core::PWSTR,
//     pub pDriverPath: windows_sys::core::PWSTR,
//     pub pDataFile: windows_sys::core::PWSTR,
//     pub pConfigFile: windows_sys::core::PWSTR,
//     pub pHelpFile: windows_sys::core::PWSTR,
//     pub pDependentFiles: windows_sys::core::PWSTR,
//     pub pMonitorName: windows_sys::core::PWSTR,
//     pub pDefaultDataType: windows_sys::core::PWSTR,
//     pub pszzPreviousNames: windows_sys::core::PWSTR,
//     pub ftDriverDate: super::super::Foundation::FILETIME,
//     pub dwlDriverVersion: u64,
//     pub pszMfgName: windows_sys::core::PWSTR,
//     pub pszOEMUrl: windows_sys::core::PWSTR,
//     pub pszHardwareID: windows_sys::core::PWSTR,
//     pub pszProvider: windows_sys::core::PWSTR,
//     pub pszPrintProcessor: windows_sys::core::PWSTR,
//     pub pszVendorSetup: windows_sys::core::PWSTR,
//     pub pszzColorProfiles: windows_sys::core::PWSTR,
//     pub pszInfPath: windows_sys::core::PWSTR,
//     pub dwPrinterDriverAttributes: u32,
//     pub pszzCoreDriverDependencies: windows_sys::core::PWSTR,
//     pub ftMinInboxDriverVerDate: super::super::Foundation::FILETIME,
//     pub dwlMinInboxDriverVerVersion: u64,
// }

// UNSUPPORTED Rust 1544:1: declaration Impl has no candidate rule
// impl Default for DRIVER_INFO_8W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DRIVER_KERNELMODE`: UInt = 1u;
// UNSUPPORTED Rust 1550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_UPGRADE_INFO_1 {
//     pub pPrinterName: *mut i8,
//     pub pOldDriverDirectory: *mut i8,
// }

// UNSUPPORTED Rust 1556:1: declaration Impl has no candidate rule
// impl Default for DRIVER_UPGRADE_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1561:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVER_UPGRADE_INFO_2 {
//     pub pPrinterName: *mut i8,
//     pub pOldDriverDirectory: *mut i8,
//     pub cVersion: u32,
//     pub pName: *mut i8,
//     pub pEnvironment: *mut i8,
//     pub pDriverPath: *mut i8,
//     pub pDataFile: *mut i8,
//     pub pConfigFile: *mut i8,
//     pub pHelpFile: *mut i8,
//     pub pDependentFiles: *mut i8,
//     pub pMonitorName: *mut i8,
//     pub pDefaultDataType: *mut i8,
//     pub pszzPreviousNames: *mut i8,
// }

// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule
// impl Default for DRIVER_UPGRADE_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DRIVER_USERMODE`: UInt = 2u;
public const val `DSPRINT_PENDING`: UInt = 2147483648u;
public const val `DSPRINT_PUBLISH`: UInt = 1u;
public const val `DSPRINT_REPUBLISH`: UInt = 8u;
public const val `DSPRINT_UNPUBLISH`: UInt = 4u;
public const val `DSPRINT_UPDATE`: UInt = 2u;
public typealias `EATTRIBUTE_DATATYPE` = Int;
public typealias `EBranchOfficeJobEventType` = Int;
public const val `ECBF_CHECKNAME_AT_FRONT`: UInt = 1u;
public const val `ECBF_CHECKNAME_ONLY`: UInt = 128u;
public const val `ECBF_CHECKNAME_ONLY_ENABLED`: UInt = 2u;
public const val `ECBF_ICONID_AS_HICON`: UInt = 4u;
public const val `ECBF_MASK`: UInt = 255u;
public const val `ECBF_OVERLAY_ECBICON_IF_CHECKED`: UInt = 16u;
public const val `ECBF_OVERLAY_NO_ICON`: UInt = 64u;
public const val `ECBF_OVERLAY_STOP_ICON`: UInt = 32u;
public const val `ECBF_OVERLAY_WARNING_ICON`: UInt = 8u;
// UNSUPPORTED Rust 1600:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type EMFPLAYPROC = Option<unsafe extern "system" fn(param0: super::Gdi::HDC, param1: i32, param2: super::super::Foundation::HANDLE) -> i32>;

public const val `EMF_PP_COLOR_OPTIMIZATION`: UInt = 1u;
public const val `EPF_ICONID_AS_HICON`: UInt = 8u;
public const val `EPF_INCL_SETUP_TITLE`: UInt = 2u;
public const val `EPF_MASK`: UInt = 255u;
public const val `EPF_NO_DOT_DOT_DOT`: UInt = 4u;
public const val `EPF_OVERLAY_NO_ICON`: UInt = 64u;
public const val `EPF_OVERLAY_STOP_ICON`: UInt = 32u;
public const val `EPF_OVERLAY_WARNING_ICON`: UInt = 16u;
public const val `EPF_PUSH_TYPE_DLGPROC`: UInt = 1u;
public const val `EPF_USE_HDLGTEMPLATE`: UInt = 128u;
public typealias `EPrintPropertyType` = Int;
public typealias `EPrintXPSJobOperation` = Int;
public typealias `EPrintXPSJobProgress` = Int;
public const val `ERROR_BIDI_DEVICE_CONFIG_UNCHANGED`: UInt = 13014u;
public const val `ERROR_BIDI_DEVICE_OFFLINE`: UInt = 13004u;
public const val `ERROR_BIDI_ERROR_BASE`: UInt = 13000u;
public const val `ERROR_BIDI_GET_ARGUMENT_NOT_SUPPORTED`: UInt = 13012u;
public const val `ERROR_BIDI_GET_MISSING_ARGUMENT`: UInt = 13013u;
public const val `ERROR_BIDI_GET_REQUIRES_ARGUMENT`: UInt = 13011u;
public const val `ERROR_BIDI_NO_BIDI_SCHEMA_EXTENSIONS`: UInt = 13016u;
public const val `ERROR_BIDI_NO_LOCALIZED_RESOURCES`: UInt = 13015u;
public const val `ERROR_BIDI_SCHEMA_NOT_SUPPORTED`: UInt = 13005u;
public const val `ERROR_BIDI_SCHEMA_READ_ONLY`: UInt = 13002u;
public const val `ERROR_BIDI_SCHEMA_WRITE_ONLY`: UInt = 13010u;
public const val `ERROR_BIDI_SERVER_OFFLINE`: UInt = 13003u;
public const val `ERROR_BIDI_SET_DIFFERENT_TYPE`: UInt = 13006u;
public const val `ERROR_BIDI_SET_INVALID_SCHEMAPATH`: UInt = 13008u;
public const val `ERROR_BIDI_SET_MULTIPLE_SCHEMAPATH`: UInt = 13007u;
public const val `ERROR_BIDI_SET_UNKNOWN_FAILURE`: UInt = 13009u;
public const val `ERROR_BIDI_STATUS_OK`: UInt = 0u;
public const val `ERROR_BIDI_STATUS_WARNING`: UInt = 13001u;
public const val `ERROR_BIDI_UNSUPPORTED_CLIENT_LANGUAGE`: UInt = 13017u;
public const val `ERROR_BIDI_UNSUPPORTED_RESOURCE_FORMAT`: UInt = 13018u;
public const val `ERR_CPSUI_ALLOCMEM_FAILED`: Int = -2;
public const val `ERR_CPSUI_CREATEPROPPAGE_FAILED`: Int = -10;
public const val `ERR_CPSUI_CREATE_IMAGELIST_FAILED`: Int = -33;
public const val `ERR_CPSUI_CREATE_TRACKBAR_FAILED`: Int = -31;
public const val `ERR_CPSUI_CREATE_UDARROW_FAILED`: Int = -32;
public const val `ERR_CPSUI_DMCOPIES_USE_EXTPUSH`: Int = -43;
public const val `ERR_CPSUI_FUNCTION_NOT_IMPLEMENTED`: Int = -9999;
public const val `ERR_CPSUI_GETLASTERROR`: Int = -1;
public const val `ERR_CPSUI_INTERNAL_ERROR`: Int = -10000;
public const val `ERR_CPSUI_INVALID_DLGPAGEIDX`: Int = -16;
public const val `ERR_CPSUI_INVALID_DLGPAGE_CBSIZE`: Int = -14;
public const val `ERR_CPSUI_INVALID_DMPUBID`: Int = -29;
public const val `ERR_CPSUI_INVALID_DMPUB_TVOT`: Int = -30;
public const val `ERR_CPSUI_INVALID_ECB_CBSIZE`: Int = -26;
public const val `ERR_CPSUI_INVALID_EDITBOX_BUF_SIZE`: Int = -25;
public const val `ERR_CPSUI_INVALID_EDITBOX_PSEL`: Int = -24;
public const val `ERR_CPSUI_INVALID_EXTPUSH_CBSIZE`: Int = -39;
public const val `ERR_CPSUI_INVALID_LBCB_TYPE`: Int = -35;
public const val `ERR_CPSUI_INVALID_LPARAM`: Int = -4;
public const val `ERR_CPSUI_INVALID_OPTITEM_CBSIZE`: Int = -19;
public const val `ERR_CPSUI_INVALID_OPTPARAM_CBSIZE`: Int = -23;
public const val `ERR_CPSUI_INVALID_OPTTYPE_CBSIZE`: Int = -20;
public const val `ERR_CPSUI_INVALID_OPTTYPE_COUNT`: Int = -21;
public const val `ERR_CPSUI_INVALID_PDATA`: Int = -3;
public const val `ERR_CPSUI_INVALID_PDLGPAGE`: Int = -13;
public const val `ERR_CPSUI_INVALID_PUSHBUTTON_TYPE`: Int = -38;
public const val `ERR_CPSUI_INVALID_TVOT_TYPE`: Int = -34;
public const val `ERR_CPSUI_MORE_THAN_ONE_STDPAGE`: Int = -12;
public const val `ERR_CPSUI_MORE_THAN_ONE_TVPAGE`: Int = -11;
public const val `ERR_CPSUI_NO_EXTPUSH_DLGTEMPLATEID`: Int = -41;
public const val `ERR_CPSUI_NO_PROPSHEETPAGE`: Int = -8;
public const val `ERR_CPSUI_NULL_CALLERNAME`: Int = -6;
public const val `ERR_CPSUI_NULL_ECB_PCHECKEDNAME`: Int = -28;
public const val `ERR_CPSUI_NULL_ECB_PTITLE`: Int = -27;
public const val `ERR_CPSUI_NULL_EXTPUSH_CALLBACK`: Int = -42;
public const val `ERR_CPSUI_NULL_EXTPUSH_DLGPROC`: Int = -40;
public const val `ERR_CPSUI_NULL_HINST`: Int = -5;
public const val `ERR_CPSUI_NULL_OPTITEMNAME`: Int = -7;
public const val `ERR_CPSUI_NULL_POPTITEM`: Int = -18;
public const val `ERR_CPSUI_NULL_POPTPARAM`: Int = -22;
public const val `ERR_CPSUI_SUBITEM_DIFF_DLGPAGEIDX`: Int = -17;
public const val `ERR_CPSUI_SUBITEM_DIFF_OPTIF_HIDE`: Int = -36;
public const val `ERR_CPSUI_TOO_MANY_DLGPAGES`: Int = -15;
public const val `ERR_CPSUI_TOO_MANY_PROPSHEETPAGES`: Int = -9;
public const val `ERR_CPSUI_ZERO_OPTITEM`: Int = -44;
// UNSUPPORTED Rust 1680:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXTCHKBOX {
//     pub cbSize: u16,
//     pub Flags: u16,
//     pub pTitle: *mut i8,
//     pub pSeparator: *mut i8,
//     pub pCheckedName: *mut i8,
//     pub IconID: usize,
//     pub wReserved: [u16; 4],
//     pub dwReserved: [usize; 2],
// }

// UNSUPPORTED Rust 1692:1: declaration Impl has no candidate rule
// impl Default for EXTCHKBOX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct EXTPUSH {
//     pub cbSize: u16,
//     pub Flags: u16,
//     pub pTitle: *mut i8,
//     pub Anonymous1: EXTPUSH_0,
//     pub IconID: usize,
//     pub Anonymous2: EXTPUSH_1,
//     pub dwReserved: [usize; 3],
// }

// UNSUPPORTED Rust 1709:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for EXTPUSH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1715:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union EXTPUSH_0 {
//     pub DlgProc: super::super::UI::WindowsAndMessaging::DLGPROC,
//     pub pfnCallBack: super::super::Foundation::FARPROC,
// }

// UNSUPPORTED Rust 1722:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for EXTPUSH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1728:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union EXTPUSH_1 {
//     pub DlgTemplateID: u16,
//     pub hDlgTemplate: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1735:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for EXTPUSH_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1741:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EXTTEXTMETRIC {
//     pub emSize: i16,
//     pub emPointSize: i16,
//     pub emOrientation: i16,
//     pub emMasterHeight: i16,
//     pub emMinScale: i16,
//     pub emMaxScale: i16,
//     pub emMasterUnits: i16,
//     pub emCapHeight: i16,
//     pub emXHeight: i16,
//     pub emLowerCaseAscent: i16,
//     pub emLowerCaseDescent: i16,
//     pub emSlant: i16,
//     pub emSuperScript: i16,
//     pub emSubScript: i16,
//     pub emSuperScriptSize: i16,
//     pub emSubScriptSize: i16,
//     pub emUnderlineOffset: i16,
//     pub emUnderlineWidth: i16,
//     pub emDoubleUpperUnderlineOffset: i16,
//     pub emDoubleLowerUnderlineOffset: i16,
//     pub emDoubleUpperUnderlineWidth: i16,
//     pub emDoubleLowerUnderlineWidth: i16,
//     pub emStrikeOutOffset: i16,
//     pub emStrikeOutWidth: i16,
//     pub emKernPairs: u16,
//     pub emKernTracks: u16,
// }

public typealias `EXpsCompressionOptions` = Int;
public typealias `EXpsFontOptions` = Int;
public typealias `EXpsFontRestriction` = Int;
public typealias `EXpsJobConsumption` = Int;
public const val `E_VERSION_NOT_SUPPORTED`: UInt = 2147745793u;
public const val `FG_CANCHANGE`: UInt = 128u;
public const val `FILL_WITH_DEFAULTS`: UInt = 1u;
// UNSUPPORTED Rust 1778:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FMTID_PrinterPropertyBag: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75f9adca_097d_45c3_a6e4_bab29e276f3e);

public const val `FNT_INFO_CURRENTFONTID`: UInt = 10u;
public const val `FNT_INFO_FONTBOLD`: UInt = 6u;
public const val `FNT_INFO_FONTHEIGHT`: UInt = 4u;
public const val `FNT_INFO_FONTITALIC`: UInt = 7u;
public const val `FNT_INFO_FONTMAXWIDTH`: UInt = 13u;
public const val `FNT_INFO_FONTSTRIKETHRU`: UInt = 9u;
public const val `FNT_INFO_FONTUNDERLINE`: UInt = 8u;
public const val `FNT_INFO_FONTWIDTH`: UInt = 5u;
public const val `FNT_INFO_GRAYPERCENTAGE`: UInt = 1u;
public const val `FNT_INFO_MAX`: UInt = 14u;
public const val `FNT_INFO_NEXTFONTID`: UInt = 2u;
public const val `FNT_INFO_NEXTGLYPH`: UInt = 3u;
public const val `FNT_INFO_PRINTDIRINCCDEGREES`: UInt = 0u;
public const val `FNT_INFO_TEXTXRES`: UInt = 12u;
public const val `FNT_INFO_TEXTYRES`: UInt = 11u;
public const val `FONT_DIR_SORTED`: UInt = 1u;
public const val `FONT_FL_DEVICEFONT`: UInt = 16u;
public const val `FONT_FL_GLYPHSET_GTT`: UInt = 32u;
public const val `FONT_FL_GLYPHSET_RLE`: UInt = 64u;
public const val `FONT_FL_IFI`: UInt = 2u;
public const val `FONT_FL_PERMANENT_SF`: UInt = 8u;
public const val `FONT_FL_RESERVED`: UInt = 32768u;
public const val `FONT_FL_SOFTFONT`: UInt = 4u;
public const val `FONT_FL_UFM`: UInt = 1u;
public const val `FORM_BUILTIN`: UInt = 1u;
// UNSUPPORTED Rust 1804:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FORM_INFO_1A {
//     pub Flags: u32,
//     pub pName: windows_sys::core::PSTR,
//     pub Size: super::super::Foundation::SIZE,
//     pub ImageableArea: super::super::Foundation::RECTL,
// }

// UNSUPPORTED Rust 1812:1: declaration Impl has no candidate rule
// impl Default for FORM_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1817:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FORM_INFO_1W {
//     pub Flags: u32,
//     pub pName: windows_sys::core::PWSTR,
//     pub Size: super::super::Foundation::SIZE,
//     pub ImageableArea: super::super::Foundation::RECTL,
// }

// UNSUPPORTED Rust 1825:1: declaration Impl has no candidate rule
// impl Default for FORM_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1830:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FORM_INFO_2A {
//     pub Flags: u32,
//     pub pName: windows_sys::core::PCSTR,
//     pub Size: super::super::Foundation::SIZE,
//     pub ImageableArea: super::super::Foundation::RECTL,
//     pub pKeyword: windows_sys::core::PCSTR,
//     pub StringType: u32,
//     pub pMuiDll: windows_sys::core::PCSTR,
//     pub dwResourceId: u32,
//     pub pDisplayName: windows_sys::core::PCSTR,
//     pub wLangId: u16,
// }

// UNSUPPORTED Rust 1844:1: declaration Impl has no candidate rule
// impl Default for FORM_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1849:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FORM_INFO_2W {
//     pub Flags: u32,
//     pub pName: windows_sys::core::PCWSTR,
//     pub Size: super::super::Foundation::SIZE,
//     pub ImageableArea: super::super::Foundation::RECTL,
//     pub pKeyword: windows_sys::core::PCSTR,
//     pub StringType: u32,
//     pub pMuiDll: windows_sys::core::PCWSTR,
//     pub dwResourceId: u32,
//     pub pDisplayName: windows_sys::core::PCWSTR,
//     pub wLangId: u16,
// }

// UNSUPPORTED Rust 1863:1: declaration Impl has no candidate rule
// impl Default for FORM_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FORM_PRINTER`: UInt = 2u;
public const val `FORM_USER`: UInt = 0u;
public const val `FinalPageCount`: `PageCountType` = 0;
public const val `Font_Normal`: `EXpsFontOptions` = 0;
public const val `Font_Obfusticate`: `EXpsFontOptions` = 1;
// UNSUPPORTED Rust 1873:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GLYPHRUN {
//     pub wcLow: u16,
//     pub wGlyphCount: u16,
// }

public const val `GPD_OEMCUSTOMDATA`: UInt = 1u;
// UNSUPPORTED Rust 1880:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_IPPUSB_PRINT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2f40381_f46d_4e51_bce7_62de6cf2d098);

// UNSUPPORTED Rust 1881:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_USBPRINT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x28d78fad_5a12_11d1_ae5b_0000f803a8c2);

public const val `IDI_CPSUI_ADVANCE`: UInt = 64058u;
public const val `IDI_CPSUI_AUTOSEL`: UInt = 64025u;
public const val `IDI_CPSUI_COLLATE`: UInt = 64030u;
public const val `IDI_CPSUI_COLOR`: UInt = 64040u;
public const val `IDI_CPSUI_COPY`: UInt = 64046u;
public const val `IDI_CPSUI_DEVICE`: UInt = 64060u;
public const val `IDI_CPSUI_DEVICE2`: UInt = 64061u;
public const val `IDI_CPSUI_DEVICE_FEATURE`: UInt = 64080u;
public const val `IDI_CPSUI_DITHER_COARSE`: UInt = 64042u;
public const val `IDI_CPSUI_DITHER_FINE`: UInt = 64043u;
public const val `IDI_CPSUI_DITHER_LINEART`: UInt = 64044u;
public const val `IDI_CPSUI_DITHER_NONE`: UInt = 64041u;
public const val `IDI_CPSUI_DOCUMENT`: UInt = 64059u;
public const val `IDI_CPSUI_DUPLEX_HORZ`: UInt = 64032u;
public const val `IDI_CPSUI_DUPLEX_HORZ_L`: UInt = 64085u;
public const val `IDI_CPSUI_DUPLEX_NONE`: UInt = 64031u;
public const val `IDI_CPSUI_DUPLEX_NONE_L`: UInt = 64084u;
public const val `IDI_CPSUI_DUPLEX_VERT`: UInt = 64033u;
public const val `IDI_CPSUI_DUPLEX_VERT_L`: UInt = 64086u;
public const val `IDI_CPSUI_EMPTY`: UInt = 64000u;
public const val `IDI_CPSUI_ENVELOPE`: UInt = 64010u;
public const val `IDI_CPSUI_ENVELOPE_FEED`: UInt = 64097u;
public const val `IDI_CPSUI_ERROR`: UInt = 64050u;
public const val `IDI_CPSUI_FALSE`: UInt = 64005u;
public const val `IDI_CPSUI_FAX`: UInt = 64095u;
public const val `IDI_CPSUI_FONTCART`: UInt = 64013u;
public const val `IDI_CPSUI_FONTCARTHDR`: UInt = 64012u;
public const val `IDI_CPSUI_FONTCART_SLOT`: UInt = 64098u;
public const val `IDI_CPSUI_FONTSUB`: UInt = 64081u;
public const val `IDI_CPSUI_FORMTRAYASSIGN`: UInt = 64076u;
public const val `IDI_CPSUI_GENERIC_ITEM`: UInt = 64073u;
public const val `IDI_CPSUI_GENERIC_OPTION`: UInt = 64072u;
public const val `IDI_CPSUI_GRAPHIC`: UInt = 64057u;
public const val `IDI_CPSUI_HALFTONE_SETUP`: UInt = 64048u;
public const val `IDI_CPSUI_HTCLRADJ`: UInt = 64047u;
public const val `IDI_CPSUI_HT_DEVICE`: UInt = 64017u;
public const val `IDI_CPSUI_HT_HOST`: UInt = 64016u;
public const val `IDI_CPSUI_ICM_INTENT`: UInt = 64053u;
public const val `IDI_CPSUI_ICM_METHOD`: UInt = 64052u;
public const val `IDI_CPSUI_ICM_OPTION`: UInt = 64051u;
public const val `IDI_CPSUI_ICONID_FIRST`: UInt = 64000u;
public const val `IDI_CPSUI_ICONID_LAST`: UInt = 64111u;
public const val `IDI_CPSUI_INSTALLABLE_OPTION`: UInt = 64078u;
public const val `IDI_CPSUI_LANDSCAPE`: UInt = 64023u;
public const val `IDI_CPSUI_LAYOUT_BMP_ARROWL`: UInt = 64100u;
public const val `IDI_CPSUI_LAYOUT_BMP_ARROWLR`: UInt = 64104u;
public const val `IDI_CPSUI_LAYOUT_BMP_ARROWS`: UInt = 64101u;
public const val `IDI_CPSUI_LAYOUT_BMP_BOOKLETL`: UInt = 64102u;
public const val `IDI_CPSUI_LAYOUT_BMP_BOOKLETL_NB`: UInt = 64106u;
public const val `IDI_CPSUI_LAYOUT_BMP_BOOKLETP`: UInt = 64103u;
public const val `IDI_CPSUI_LAYOUT_BMP_BOOKLETP_NB`: UInt = 64107u;
public const val `IDI_CPSUI_LAYOUT_BMP_PORTRAIT`: UInt = 64099u;
public const val `IDI_CPSUI_LAYOUT_BMP_ROT_PORT`: UInt = 64105u;
public const val `IDI_CPSUI_LF_PEN_PLOTTER`: UInt = 64087u;
public const val `IDI_CPSUI_LF_RASTER_PLOTTER`: UInt = 64089u;
public const val `IDI_CPSUI_MANUAL_FEED`: UInt = 64094u;
public const val `IDI_CPSUI_MEM`: UInt = 64011u;
public const val `IDI_CPSUI_MONO`: UInt = 64039u;
public const val `IDI_CPSUI_NO`: UInt = 64003u;
public const val `IDI_CPSUI_NOTINSTALLED`: UInt = 64069u;
public const val `IDI_CPSUI_NUP_BORDER`: UInt = 64111u;
public const val `IDI_CPSUI_OFF`: UInt = 64007u;
public const val `IDI_CPSUI_ON`: UInt = 64008u;
public const val `IDI_CPSUI_OPTION`: UInt = 64066u;
public const val `IDI_CPSUI_OPTION2`: UInt = 64067u;
public const val `IDI_CPSUI_OUTBIN`: UInt = 64055u;
public const val `IDI_CPSUI_OUTPUT`: UInt = 64056u;
public const val `IDI_CPSUI_PAGE_PROTECT`: UInt = 64096u;
public const val `IDI_CPSUI_PAPER_OUTPUT`: UInt = 64009u;
public const val `IDI_CPSUI_PAPER_TRAY`: UInt = 64026u;
public const val `IDI_CPSUI_PAPER_TRAY2`: UInt = 64027u;
public const val `IDI_CPSUI_PAPER_TRAY3`: UInt = 64028u;
public const val `IDI_CPSUI_PEN_CARROUSEL`: UInt = 64092u;
public const val `IDI_CPSUI_PLOTTER_PEN`: UInt = 64093u;
public const val `IDI_CPSUI_PORTRAIT`: UInt = 64022u;
public const val `IDI_CPSUI_POSTSCRIPT`: UInt = 64082u;
public const val `IDI_CPSUI_PRINTER`: UInt = 64062u;
public const val `IDI_CPSUI_PRINTER2`: UInt = 64063u;
public const val `IDI_CPSUI_PRINTER3`: UInt = 64064u;
public const val `IDI_CPSUI_PRINTER4`: UInt = 64065u;
public const val `IDI_CPSUI_PRINTER_FEATURE`: UInt = 64079u;
public const val `IDI_CPSUI_PRINTER_FOLDER`: UInt = 64077u;
public const val `IDI_CPSUI_QUESTION`: UInt = 64075u;
public const val `IDI_CPSUI_RES_DRAFT`: UInt = 64034u;
public const val `IDI_CPSUI_RES_HIGH`: UInt = 64037u;
public const val `IDI_CPSUI_RES_LOW`: UInt = 64035u;
public const val `IDI_CPSUI_RES_MEDIUM`: UInt = 64036u;
public const val `IDI_CPSUI_RES_PRESENTATION`: UInt = 64038u;
public const val `IDI_CPSUI_ROLL_PAPER`: UInt = 64091u;
public const val `IDI_CPSUI_ROT_LAND`: UInt = 64024u;
public const val `IDI_CPSUI_ROT_PORT`: UInt = 64110u;
public const val `IDI_CPSUI_RUN_DIALOG`: UInt = 64074u;
public const val `IDI_CPSUI_SCALING`: UInt = 64045u;
public const val `IDI_CPSUI_SEL_NONE`: UInt = 64001u;
public const val `IDI_CPSUI_SF_PEN_PLOTTER`: UInt = 64088u;
public const val `IDI_CPSUI_SF_RASTER_PLOTTER`: UInt = 64090u;
public const val `IDI_CPSUI_STAPLER_OFF`: UInt = 64015u;
public const val `IDI_CPSUI_STAPLER_ON`: UInt = 64014u;
public const val `IDI_CPSUI_STD_FORM`: UInt = 64054u;
public const val `IDI_CPSUI_STOP`: UInt = 64068u;
public const val `IDI_CPSUI_STOP_WARNING_OVERLAY`: UInt = 64071u;
public const val `IDI_CPSUI_TELEPHONE`: UInt = 64083u;
public const val `IDI_CPSUI_TRANSPARENT`: UInt = 64029u;
public const val `IDI_CPSUI_TRUE`: UInt = 64006u;
public const val `IDI_CPSUI_TT_DOWNLOADSOFT`: UInt = 64019u;
public const val `IDI_CPSUI_TT_DOWNLOADVECT`: UInt = 64020u;
public const val `IDI_CPSUI_TT_PRINTASGRAPHIC`: UInt = 64018u;
public const val `IDI_CPSUI_TT_SUBDEV`: UInt = 64021u;
public const val `IDI_CPSUI_WARNING`: UInt = 64002u;
public const val `IDI_CPSUI_WARNING_OVERLAY`: UInt = 64070u;
public const val `IDI_CPSUI_WATERMARK`: UInt = 64049u;
public const val `IDI_CPSUI_YES`: UInt = 64004u;
public const val `IDS_CPSUI_ABOUT`: UInt = 64848u;
public const val `IDS_CPSUI_ADVANCED`: UInt = 64722u;
public const val `IDS_CPSUI_ADVANCEDOCUMENT`: UInt = 64716u;
public const val `IDS_CPSUI_ALL`: UInt = 64841u;
public const val `IDS_CPSUI_AUTOSELECT`: UInt = 64718u;
public const val `IDS_CPSUI_BACKTOFRONT`: UInt = 64857u;
public const val `IDS_CPSUI_BOND`: UInt = 64786u;
public const val `IDS_CPSUI_BOOKLET`: UInt = 64873u;
public const val `IDS_CPSUI_BOOKLET_EDGE`: UInt = 64888u;
public const val `IDS_CPSUI_BOOKLET_EDGE_LEFT`: UInt = 64889u;
public const val `IDS_CPSUI_BOOKLET_EDGE_RIGHT`: UInt = 64890u;
public const val `IDS_CPSUI_CASSETTE_TRAY`: UInt = 64810u;
public const val `IDS_CPSUI_CHANGE`: UInt = 64702u;
public const val `IDS_CPSUI_CHANGED`: UInt = 64846u;
public const val `IDS_CPSUI_CHANGES`: UInt = 64845u;
public const val `IDS_CPSUI_COARSE`: UInt = 64787u;
public const val `IDS_CPSUI_COLLATE`: UInt = 64756u;
public const val `IDS_CPSUI_COLLATED`: UInt = 64757u;
public const val `IDS_CPSUI_COLON_SEP`: UInt = 64707u;
public const val `IDS_CPSUI_COLOR`: UInt = 64764u;
public const val `IDS_CPSUI_COLOR_APPERANCE`: UInt = 64744u;
public const val `IDS_CPSUI_COPIES`: UInt = 64831u;
public const val `IDS_CPSUI_COPY`: UInt = 64830u;
public const val `IDS_CPSUI_DEFAULT`: UInt = 64732u;
public const val `IDS_CPSUI_DEFAULTDOCUMENT`: UInt = 64714u;
public const val `IDS_CPSUI_DEFAULT_TRAY`: UInt = 64811u;
public const val `IDS_CPSUI_DEVICE`: UInt = 64842u;
public const val `IDS_CPSUI_DEVICEOPTIONS`: UInt = 64725u;
public const val `IDS_CPSUI_DEVICE_SETTINGS`: UInt = 64852u;
public const val `IDS_CPSUI_DITHERING`: UInt = 64752u;
public const val `IDS_CPSUI_DOCUMENT`: UInt = 64715u;
public const val `IDS_CPSUI_DOWN_THEN_LEFT`: UInt = 64882u;
public const val `IDS_CPSUI_DOWN_THEN_RIGHT`: UInt = 64880u;
public const val `IDS_CPSUI_DRAFT`: UInt = 64759u;
public const val `IDS_CPSUI_DUPLEX`: UInt = 64745u;
public const val `IDS_CPSUI_ENVELOPE_TRAY`: UInt = 64804u;
public const val `IDS_CPSUI_ENVMANUAL_TRAY`: UInt = 64805u;
public const val `IDS_CPSUI_ERRDIFFUSE`: UInt = 64790u;
public const val `IDS_CPSUI_ERROR`: UInt = 64733u;
public const val `IDS_CPSUI_EXIST`: UInt = 64736u;
public const val `IDS_CPSUI_FALSE`: UInt = 64726u;
public const val `IDS_CPSUI_FAST`: UInt = 64838u;
public const val `IDS_CPSUI_FAX`: UInt = 64835u;
public const val `IDS_CPSUI_FINE`: UInt = 64788u;
public const val `IDS_CPSUI_FORMNAME`: UInt = 64747u;
public const val `IDS_CPSUI_FORMSOURCE`: UInt = 64812u;
public const val `IDS_CPSUI_FORMTRAYASSIGN`: UInt = 64798u;
public const val `IDS_CPSUI_FRONTTOBACK`: UInt = 64856u;
public const val `IDS_CPSUI_GLOSSY`: UInt = 64783u;
public const val `IDS_CPSUI_GRAPHIC`: UInt = 64720u;
public const val `IDS_CPSUI_GRAYSCALE`: UInt = 64765u;
public const val `IDS_CPSUI_HALFTONE`: UInt = 64791u;
public const val `IDS_CPSUI_HALFTONE_SETUP`: UInt = 64817u;
public const val `IDS_CPSUI_HIGH`: UInt = 64762u;
public const val `IDS_CPSUI_HORIZONTAL`: UInt = 64768u;
public const val `IDS_CPSUI_HTCLRADJ`: UInt = 64792u;
public const val `IDS_CPSUI_ICM`: UInt = 64748u;
public const val `IDS_CPSUI_ICMINTENT`: UInt = 64750u;
public const val `IDS_CPSUI_ICMMETHOD`: UInt = 64749u;
public const val `IDS_CPSUI_ICM_BLACKWHITE`: UInt = 64776u;
public const val `IDS_CPSUI_ICM_COLORMETRIC`: UInt = 64781u;
public const val `IDS_CPSUI_ICM_CONTRAST`: UInt = 64780u;
public const val `IDS_CPSUI_ICM_NO`: UInt = 64777u;
public const val `IDS_CPSUI_ICM_SATURATION`: UInt = 64779u;
public const val `IDS_CPSUI_ICM_YES`: UInt = 64778u;
public const val `IDS_CPSUI_INSTFONTCART`: UInt = 64818u;
public const val `IDS_CPSUI_LANDSCAPE`: UInt = 64754u;
public const val `IDS_CPSUI_LARGECAP_TRAY`: UInt = 64809u;
public const val `IDS_CPSUI_LARGEFMT_TRAY`: UInt = 64808u;
public const val `IDS_CPSUI_LBCB_NOSEL`: UInt = 64712u;
public const val `IDS_CPSUI_LEFT_ANGLE`: UInt = 64708u;
public const val `IDS_CPSUI_LEFT_SLOT`: UInt = 64823u;
public const val `IDS_CPSUI_LEFT_THEN_DOWN`: UInt = 64881u;
public const val `IDS_CPSUI_LINEART`: UInt = 64789u;
public const val `IDS_CPSUI_LONG_SIDE`: UInt = 64770u;
public const val `IDS_CPSUI_LOW`: UInt = 64760u;
public const val `IDS_CPSUI_LOWER_TRAY`: UInt = 64801u;
public const val `IDS_CPSUI_MAILBOX`: UInt = 64829u;
public const val `IDS_CPSUI_MAKE`: UInt = 64833u;
public const val `IDS_CPSUI_MANUALFEED`: UInt = 64813u;
public const val `IDS_CPSUI_MANUAL_DUPLEX`: UInt = 64883u;
public const val `IDS_CPSUI_MANUAL_DUPLEX_OFF`: UInt = 64885u;
public const val `IDS_CPSUI_MANUAL_DUPLEX_ON`: UInt = 64884u;
public const val `IDS_CPSUI_MANUAL_TRAY`: UInt = 64803u;
public const val `IDS_CPSUI_MEDIA`: UInt = 64751u;
public const val `IDS_CPSUI_MEDIUM`: UInt = 64761u;
public const val `IDS_CPSUI_MIDDLE_TRAY`: UInt = 64802u;
public const val `IDS_CPSUI_MONOCHROME`: UInt = 64766u;
public const val `IDS_CPSUI_MORE`: UInt = 64701u;
public const val `IDS_CPSUI_NO`: UInt = 64728u;
public const val `IDS_CPSUI_NONE`: UInt = 64734u;
public const val `IDS_CPSUI_NOT`: UInt = 64735u;
public const val `IDS_CPSUI_NOTINSTALLED`: UInt = 64737u;
public const val `IDS_CPSUI_NO_NAME`: UInt = 64850u;
public const val `IDS_CPSUI_NUM_OF_COPIES`: UInt = 64740u;
public const val `IDS_CPSUI_NUP`: UInt = 64864u;
public const val `IDS_CPSUI_NUP_BORDER`: UInt = 64891u;
public const val `IDS_CPSUI_NUP_BORDERED`: UInt = 64892u;
public const val `IDS_CPSUI_NUP_DIRECTION`: UInt = 64878u;
public const val `IDS_CPSUI_NUP_FOURUP`: UInt = 64867u;
public const val `IDS_CPSUI_NUP_NINEUP`: UInt = 64869u;
public const val `IDS_CPSUI_NUP_NORMAL`: UInt = 64865u;
public const val `IDS_CPSUI_NUP_SIXTEENUP`: UInt = 64870u;
public const val `IDS_CPSUI_NUP_SIXUP`: UInt = 64868u;
public const val `IDS_CPSUI_NUP_TWOUP`: UInt = 64866u;
public const val `IDS_CPSUI_OF`: UInt = 64704u;
public const val `IDS_CPSUI_OFF`: UInt = 64730u;
public const val `IDS_CPSUI_ON`: UInt = 64731u;
public const val `IDS_CPSUI_ONLYONE`: UInt = 64800u;
public const val `IDS_CPSUI_OPTION`: UInt = 64703u;
public const val `IDS_CPSUI_OPTIONS`: UInt = 64721u;
public const val `IDS_CPSUI_ORIENTATION`: UInt = 64738u;
public const val `IDS_CPSUI_OUTBINASSIGN`: UInt = 64796u;
public const val `IDS_CPSUI_OUTPUTBIN`: UInt = 64863u;
public const val `IDS_CPSUI_PAGEORDER`: UInt = 64855u;
public const val `IDS_CPSUI_PAGEPROTECT`: UInt = 64816u;
public const val `IDS_CPSUI_PAPER_OUTPUT`: UInt = 64719u;
public const val `IDS_CPSUI_PERCENT`: UInt = 64711u;
public const val `IDS_CPSUI_PLOT`: UInt = 64836u;
public const val `IDS_CPSUI_PORTRAIT`: UInt = 64753u;
public const val `IDS_CPSUI_POSTER`: UInt = 64874u;
public const val `IDS_CPSUI_POSTER_2x2`: UInt = 64875u;
public const val `IDS_CPSUI_POSTER_3x3`: UInt = 64876u;
public const val `IDS_CPSUI_POSTER_4x4`: UInt = 64877u;
public const val `IDS_CPSUI_PRESENTATION`: UInt = 64763u;
public const val `IDS_CPSUI_PRINT`: UInt = 64834u;
public const val `IDS_CPSUI_PRINTER`: UInt = 64717u;
public const val `IDS_CPSUI_PRINTERMEM_KB`: UInt = 64814u;
public const val `IDS_CPSUI_PRINTERMEM_MB`: UInt = 64815u;
public const val `IDS_CPSUI_PRINTFLDSETTING`: UInt = 64758u;
public const val `IDS_CPSUI_PRINTQUALITY`: UInt = 64742u;
public const val `IDS_CPSUI_PROPERTIES`: UInt = 64713u;
public const val `IDS_CPSUI_QUALITY_BEST`: UInt = 64861u;
public const val `IDS_CPSUI_QUALITY_BETTER`: UInt = 64860u;
public const val `IDS_CPSUI_QUALITY_CUSTOM`: UInt = 64862u;
public const val `IDS_CPSUI_QUALITY_DRAFT`: UInt = 64859u;
public const val `IDS_CPSUI_QUALITY_SETTINGS`: UInt = 64858u;
public const val `IDS_CPSUI_RANGE_FROM`: UInt = 64705u;
public const val `IDS_CPSUI_REGULAR`: UInt = 64785u;
public const val `IDS_CPSUI_RESET`: UInt = 64840u;
public const val `IDS_CPSUI_RESOLUTION`: UInt = 64743u;
public const val `IDS_CPSUI_REVERT`: UInt = 64844u;
public const val `IDS_CPSUI_RIGHT_ANGLE`: UInt = 64709u;
public const val `IDS_CPSUI_RIGHT_SLOT`: UInt = 64824u;
public const val `IDS_CPSUI_RIGHT_THEN_DOWN`: UInt = 64879u;
public const val `IDS_CPSUI_ROTATED`: UInt = 64839u;
public const val `IDS_CPSUI_ROT_LAND`: UInt = 64755u;
public const val `IDS_CPSUI_ROT_PORT`: UInt = 64886u;
public const val `IDS_CPSUI_SCALING`: UInt = 64739u;
public const val `IDS_CPSUI_SETTING`: UInt = 64851u;
public const val `IDS_CPSUI_SETTINGS`: UInt = 64843u;
public const val `IDS_CPSUI_SETUP`: UInt = 64700u;
public const val `IDS_CPSUI_SHORT_SIDE`: UInt = 64771u;
public const val `IDS_CPSUI_SIDE1`: UInt = 64871u;
public const val `IDS_CPSUI_SIDE2`: UInt = 64872u;
public const val `IDS_CPSUI_SIMPLEX`: UInt = 64767u;
public const val `IDS_CPSUI_SLASH_SEP`: UInt = 64710u;
public const val `IDS_CPSUI_SLOT1`: UInt = 64819u;
public const val `IDS_CPSUI_SLOT2`: UInt = 64820u;
public const val `IDS_CPSUI_SLOT3`: UInt = 64821u;
public const val `IDS_CPSUI_SLOT4`: UInt = 64822u;
public const val `IDS_CPSUI_SLOW`: UInt = 64837u;
public const val `IDS_CPSUI_SMALLFMT_TRAY`: UInt = 64807u;
public const val `IDS_CPSUI_SOURCE`: UInt = 64741u;
public const val `IDS_CPSUI_STACKER`: UInt = 64828u;
public const val `IDS_CPSUI_STANDARD`: UInt = 64782u;
public const val `IDS_CPSUI_STAPLE`: UInt = 64887u;
public const val `IDS_CPSUI_STAPLER`: UInt = 64825u;
public const val `IDS_CPSUI_STAPLER_OFF`: UInt = 64827u;
public const val `IDS_CPSUI_STAPLER_ON`: UInt = 64826u;
public const val `IDS_CPSUI_STDDOCPROPTAB`: UInt = 64723u;
public const val `IDS_CPSUI_STDDOCPROPTAB1`: UInt = 64853u;
public const val `IDS_CPSUI_STDDOCPROPTAB2`: UInt = 64854u;
public const val `IDS_CPSUI_STDDOCPROPTVTAB`: UInt = 64724u;
public const val `IDS_CPSUI_STRID_FIRST`: UInt = 64700u;
public const val `IDS_CPSUI_STRID_LAST`: UInt = 64892u;
public const val `IDS_CPSUI_TO`: UInt = 64706u;
public const val `IDS_CPSUI_TOTAL`: UInt = 64832u;
public const val `IDS_CPSUI_TRACTOR_TRAY`: UInt = 64806u;
public const val `IDS_CPSUI_TRANSPARENCY`: UInt = 64784u;
public const val `IDS_CPSUI_TRUE`: UInt = 64727u;
public const val `IDS_CPSUI_TTOPTION`: UInt = 64746u;
public const val `IDS_CPSUI_TT_DOWNLOADSOFT`: UInt = 64773u;
public const val `IDS_CPSUI_TT_DOWNLOADVECT`: UInt = 64774u;
public const val `IDS_CPSUI_TT_PRINTASGRAPHIC`: UInt = 64772u;
public const val `IDS_CPSUI_TT_SUBDEV`: UInt = 64775u;
public const val `IDS_CPSUI_UPPER_TRAY`: UInt = 64799u;
public const val `IDS_CPSUI_USE_DEVICE_HT`: UInt = 64794u;
public const val `IDS_CPSUI_USE_HOST_HT`: UInt = 64793u;
public const val `IDS_CPSUI_USE_PRINTER_HT`: UInt = 64795u;
public const val `IDS_CPSUI_VERSION`: UInt = 64849u;
public const val `IDS_CPSUI_VERTICAL`: UInt = 64769u;
public const val `IDS_CPSUI_WARNING`: UInt = 64847u;
public const val `IDS_CPSUI_WATERMARK`: UInt = 64797u;
public const val `IDS_CPSUI_YES`: UInt = 64729u;
// UNSUPPORTED Rust 2189:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INSERTPSUIPAGE_INFO {
//     pub cbSize: u16,
//     pub Type: u8,
//     pub Mode: u8,
//     pub dwData1: usize,
//     pub dwData2: usize,
//     pub dwData3: usize,
// }

public const val `INSPSUIPAGE_MODE_AFTER`: UInt = 1u;
public const val `INSPSUIPAGE_MODE_BEFORE`: UInt = 0u;
public const val `INSPSUIPAGE_MODE_FIRST_CHILD`: UInt = 2u;
public const val `INSPSUIPAGE_MODE_INDEX`: UInt = 4u;
public const val `INSPSUIPAGE_MODE_LAST_CHILD`: UInt = 3u;
public const val `INTERNAL_NOTIFICATION_QUEUE_IS_FULL`: `PrintAsyncNotifyError` = 19;
public const val `INVALID_NOTIFICATION_TYPE`: `PrintAsyncNotifyError` = 20;
// UNSUPPORTED Rust 2206:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INVOC {
//     pub dwCount: u32,
//     pub loOffset: u32,
// }

public const val `IOCTL_USBPRINT_ADD_CHILD_DEVICE`: UInt = 2228316u;
public const val `IOCTL_USBPRINT_ADD_MSIPP_COMPAT_ID`: UInt = 2228308u;
public const val `IOCTL_USBPRINT_CYCLE_PORT`: UInt = 2228320u;
public const val `IOCTL_USBPRINT_GET_1284_ID`: UInt = 2228276u;
public const val `IOCTL_USBPRINT_GET_INTERFACE_TYPE`: UInt = 2228300u;
public const val `IOCTL_USBPRINT_GET_LPT_STATUS`: UInt = 2228272u;
public const val `IOCTL_USBPRINT_GET_PROTOCOL`: UInt = 2228292u;
public const val `IOCTL_USBPRINT_SET_DEVICE_ID`: UInt = 2228312u;
public const val `IOCTL_USBPRINT_SET_PORT_NUMBER`: UInt = 2228304u;
public const val `IOCTL_USBPRINT_SET_PROTOCOL`: UInt = 2228296u;
public const val `IOCTL_USBPRINT_SOFT_RESET`: UInt = 2228288u;
public const val `IOCTL_USBPRINT_VENDOR_GET_COMMAND`: UInt = 2228284u;
public const val `IOCTL_USBPRINT_VENDOR_SET_COMMAND`: UInt = 2228280u;
public const val `IPDFP_COPY_ALL_FILES`: UInt = 1u;
// UNSUPPORTED Rust 2226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ImgErrorInfo {
//     pub description: windows_sys::core::BSTR,
//     pub guid: windows_sys::core::GUID,
//     pub helpContext: u32,
//     pub helpFile: windows_sys::core::BSTR,
//     pub source: windows_sys::core::BSTR,
//     pub devDescription: windows_sys::core::BSTR,
//     pub errorID: windows_sys::core::GUID,
//     pub cUserParameters: u32,
//     pub aUserParameters: *mut windows_sys::core::BSTR,
//     pub userFallback: windows_sys::core::BSTR,
//     pub exceptionID: u32,
// }

// UNSUPPORTED Rust 2241:1: declaration Impl has no candidate rule
// impl Default for ImgErrorInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IntermediatePageCount`: `PageCountType` = 1;
public const val `JOB_ACCESS_ADMINISTER`: UInt = 16u;
public const val `JOB_ACCESS_READ`: UInt = 32u;
public const val `JOB_CONTROL_CANCEL`: UInt = 3u;
public const val `JOB_CONTROL_DELETE`: UInt = 5u;
public const val `JOB_CONTROL_LAST_PAGE_EJECTED`: UInt = 7u;
public const val `JOB_CONTROL_PAUSE`: UInt = 1u;
public const val `JOB_CONTROL_RELEASE`: UInt = 9u;
public const val `JOB_CONTROL_RESTART`: UInt = 4u;
public const val `JOB_CONTROL_RESUME`: UInt = 2u;
public const val `JOB_CONTROL_RETAIN`: UInt = 8u;
public const val `JOB_CONTROL_SEND_TOAST`: UInt = 10u;
public const val `JOB_CONTROL_SENT_TO_PRINTER`: UInt = 6u;
// UNSUPPORTED Rust 2259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOB_INFO_1A {
//     pub JobId: u32,
//     pub pPrinterName: windows_sys::core::PSTR,
//     pub pMachineName: windows_sys::core::PSTR,
//     pub pUserName: windows_sys::core::PSTR,
//     pub pDocument: windows_sys::core::PSTR,
//     pub pDatatype: windows_sys::core::PSTR,
//     pub pStatus: windows_sys::core::PSTR,
//     pub Status: u32,
//     pub Priority: u32,
//     pub Position: u32,
//     pub TotalPages: u32,
//     pub PagesPrinted: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
// }

// UNSUPPORTED Rust 2276:1: declaration Impl has no candidate rule
// impl Default for JOB_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2281:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOB_INFO_1W {
//     pub JobId: u32,
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub pMachineName: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub pDocument: windows_sys::core::PWSTR,
//     pub pDatatype: windows_sys::core::PWSTR,
//     pub pStatus: windows_sys::core::PWSTR,
//     pub Status: u32,
//     pub Priority: u32,
//     pub Position: u32,
//     pub TotalPages: u32,
//     pub PagesPrinted: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
// }

// UNSUPPORTED Rust 2298:1: declaration Impl has no candidate rule
// impl Default for JOB_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2303:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// #[derive(Clone, Copy)]
// pub struct JOB_INFO_2A {
//     pub JobId: u32,
//     pub pPrinterName: windows_sys::core::PSTR,
//     pub pMachineName: windows_sys::core::PSTR,
//     pub pUserName: windows_sys::core::PSTR,
//     pub pDocument: windows_sys::core::PSTR,
//     pub pNotifyName: windows_sys::core::PSTR,
//     pub pDatatype: windows_sys::core::PSTR,
//     pub pPrintProcessor: windows_sys::core::PSTR,
//     pub pParameters: windows_sys::core::PSTR,
//     pub pDriverName: windows_sys::core::PSTR,
//     pub pDevMode: *mut super::Gdi::DEVMODEA,
//     pub pStatus: windows_sys::core::PSTR,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
//     pub Status: u32,
//     pub Priority: u32,
//     pub Position: u32,
//     pub StartTime: u32,
//     pub UntilTime: u32,
//     pub TotalPages: u32,
//     pub Size: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
//     pub Time: u32,
//     pub PagesPrinted: u32,
// }

// UNSUPPORTED Rust 2331:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for JOB_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2337:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// #[derive(Clone, Copy)]
// pub struct JOB_INFO_2W {
//     pub JobId: u32,
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub pMachineName: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub pDocument: windows_sys::core::PWSTR,
//     pub pNotifyName: windows_sys::core::PWSTR,
//     pub pDatatype: windows_sys::core::PWSTR,
//     pub pPrintProcessor: windows_sys::core::PWSTR,
//     pub pParameters: windows_sys::core::PWSTR,
//     pub pDriverName: windows_sys::core::PWSTR,
//     pub pDevMode: *mut super::Gdi::DEVMODEW,
//     pub pStatus: windows_sys::core::PWSTR,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
//     pub Status: u32,
//     pub Priority: u32,
//     pub Position: u32,
//     pub StartTime: u32,
//     pub UntilTime: u32,
//     pub TotalPages: u32,
//     pub Size: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
//     pub Time: u32,
//     pub PagesPrinted: u32,
// }

// UNSUPPORTED Rust 2365:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for JOB_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2371:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOB_INFO_3 {
//     pub JobId: u32,
//     pub NextJobId: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 2378:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// #[derive(Clone, Copy)]
// pub struct JOB_INFO_4A {
//     pub JobId: u32,
//     pub pPrinterName: windows_sys::core::PSTR,
//     pub pMachineName: windows_sys::core::PSTR,
//     pub pUserName: windows_sys::core::PSTR,
//     pub pDocument: windows_sys::core::PSTR,
//     pub pNotifyName: windows_sys::core::PSTR,
//     pub pDatatype: windows_sys::core::PSTR,
//     pub pPrintProcessor: windows_sys::core::PSTR,
//     pub pParameters: windows_sys::core::PSTR,
//     pub pDriverName: windows_sys::core::PSTR,
//     pub pDevMode: *mut super::Gdi::DEVMODEA,
//     pub pStatus: windows_sys::core::PSTR,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
//     pub Status: u32,
//     pub Priority: u32,
//     pub Position: u32,
//     pub StartTime: u32,
//     pub UntilTime: u32,
//     pub TotalPages: u32,
//     pub Size: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
//     pub Time: u32,
//     pub PagesPrinted: u32,
//     pub SizeHigh: i32,
// }

// UNSUPPORTED Rust 2407:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for JOB_INFO_4A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2413:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// #[derive(Clone, Copy)]
// pub struct JOB_INFO_4W {
//     pub JobId: u32,
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub pMachineName: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub pDocument: windows_sys::core::PWSTR,
//     pub pNotifyName: windows_sys::core::PWSTR,
//     pub pDatatype: windows_sys::core::PWSTR,
//     pub pPrintProcessor: windows_sys::core::PWSTR,
//     pub pParameters: windows_sys::core::PWSTR,
//     pub pDriverName: windows_sys::core::PWSTR,
//     pub pDevMode: *mut super::Gdi::DEVMODEW,
//     pub pStatus: windows_sys::core::PWSTR,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
//     pub Status: u32,
//     pub Priority: u32,
//     pub Position: u32,
//     pub StartTime: u32,
//     pub UntilTime: u32,
//     pub TotalPages: u32,
//     pub Size: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
//     pub Time: u32,
//     pub PagesPrinted: u32,
//     pub SizeHigh: i32,
// }

// UNSUPPORTED Rust 2442:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for JOB_INFO_4W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `JOB_NOTIFY_FIELD_BYTES_PRINTED`: UInt = 23u;
public const val `JOB_NOTIFY_FIELD_DATATYPE`: UInt = 5u;
public const val `JOB_NOTIFY_FIELD_DEVMODE`: UInt = 9u;
public const val `JOB_NOTIFY_FIELD_DOCUMENT`: UInt = 13u;
public const val `JOB_NOTIFY_FIELD_DRIVER_NAME`: UInt = 8u;
public const val `JOB_NOTIFY_FIELD_MACHINE_NAME`: UInt = 1u;
public const val `JOB_NOTIFY_FIELD_NOTIFY_NAME`: UInt = 4u;
public const val `JOB_NOTIFY_FIELD_PAGES_PRINTED`: UInt = 21u;
public const val `JOB_NOTIFY_FIELD_PARAMETERS`: UInt = 7u;
public const val `JOB_NOTIFY_FIELD_PORT_NAME`: UInt = 2u;
public const val `JOB_NOTIFY_FIELD_POSITION`: UInt = 15u;
public const val `JOB_NOTIFY_FIELD_PRINTER_NAME`: UInt = 0u;
public const val `JOB_NOTIFY_FIELD_PRINT_PROCESSOR`: UInt = 6u;
public const val `JOB_NOTIFY_FIELD_PRIORITY`: UInt = 14u;
public const val `JOB_NOTIFY_FIELD_REMOTE_JOB_ID`: UInt = 24u;
public const val `JOB_NOTIFY_FIELD_SECURITY_DESCRIPTOR`: UInt = 12u;
public const val `JOB_NOTIFY_FIELD_START_TIME`: UInt = 17u;
public const val `JOB_NOTIFY_FIELD_STATUS`: UInt = 10u;
public const val `JOB_NOTIFY_FIELD_STATUS_STRING`: UInt = 11u;
public const val `JOB_NOTIFY_FIELD_SUBMITTED`: UInt = 16u;
public const val `JOB_NOTIFY_FIELD_TIME`: UInt = 19u;
public const val `JOB_NOTIFY_FIELD_TOTAL_BYTES`: UInt = 22u;
public const val `JOB_NOTIFY_FIELD_TOTAL_PAGES`: UInt = 20u;
public const val `JOB_NOTIFY_FIELD_UNTIL_TIME`: UInt = 18u;
public const val `JOB_NOTIFY_FIELD_USER_NAME`: UInt = 3u;
public const val `JOB_NOTIFY_TYPE`: UInt = 1u;
public const val `JOB_POSITION_UNSPECIFIED`: UInt = 0u;
public const val `JOB_STATUS_BLOCKED_DEVQ`: UInt = 512u;
public const val `JOB_STATUS_COMPLETE`: UInt = 4096u;
public const val `JOB_STATUS_DELETED`: UInt = 256u;
public const val `JOB_STATUS_DELETING`: UInt = 4u;
public const val `JOB_STATUS_ERROR`: UInt = 2u;
public const val `JOB_STATUS_OFFLINE`: UInt = 32u;
public const val `JOB_STATUS_PAPEROUT`: UInt = 64u;
public const val `JOB_STATUS_PAUSED`: UInt = 1u;
public const val `JOB_STATUS_PRINTED`: UInt = 128u;
public const val `JOB_STATUS_PRINTING`: UInt = 16u;
public const val `JOB_STATUS_RENDERING_LOCALLY`: UInt = 16384u;
public const val `JOB_STATUS_RESTART`: UInt = 2048u;
public const val `JOB_STATUS_RETAINED`: UInt = 8192u;
public const val `JOB_STATUS_SPOOLING`: UInt = 8u;
public const val `JOB_STATUS_USER_INTERVENTION`: UInt = 1024u;
// UNSUPPORTED Rust 2490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Devices_Display")]
// #[derive(Clone, Copy)]
// pub struct KERNDATA {
//     pub dwSize: u32,
//     pub dwKernPairNum: u32,
//     pub KernPair: [super::super::Devices::Display::FD_KERNINGPAIR; 1],
// }

// UNSUPPORTED Rust 2498:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Devices_Display")]
// impl Default for KERNDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOCAL_ONLY_REGISTRATION`: `PrintAsyncNotifyError` = 23;
public const val `LPR`: UInt = 2u;
// UNSUPPORTED Rust 2506:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPTABLE {
//     pub dwSize: u32,
//     pub dwGlyphNum: u32,
//     pub Trans: [TRANSDATA; 1],
// }

// UNSUPPORTED Rust 2513:1: declaration Impl has no candidate rule
// impl Default for MAPTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAX_ADDRESS_STR_LEN`: UInt = 13u;
public const val `MAX_CHANNEL_COUNT_EXCEEDED`: `PrintAsyncNotifyError` = 22;
public const val `MAX_CPSFUNC_INDEX`: UInt = 26u;
public const val `MAX_DEVICEDESCRIPTION_STR_LEN`: UInt = 257u;
public const val `MAX_DLGPAGE_COUNT`: UInt = 64u;
public const val `MAX_FORM_KEYWORD_LENGTH`: UInt = 64u;
public const val `MAX_IPADDR_STR_LEN`: UInt = 16u;
public const val `MAX_NETWORKNAME2_LEN`: UInt = 128u;
public const val `MAX_NETWORKNAME_LEN`: UInt = 49u;
public const val `MAX_NOTIFICATION_SIZE_EXCEEDED`: `PrintAsyncNotifyError` = 18;
public const val `MAX_PORTNAME_LEN`: UInt = 64u;
public const val `MAX_PRIORITY`: UInt = 99u;
public const val `MAX_PROPSHEETUI_REASON_INDEX`: UInt = 5u;
public const val `MAX_PSUIPAGEINSERT_INDEX`: UInt = 5u;
public const val `MAX_QUEUENAME_LEN`: UInt = 33u;
public const val `MAX_REGISTRATION_COUNT_EXCEEDED`: `PrintAsyncNotifyError` = 21;
public const val `MAX_RES_STR_CHARS`: UInt = 160u;
public const val `MAX_SNMP_COMMUNITY_STR_LEN`: UInt = 33u;
// UNSUPPORTED Rust 2536:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MESSAGEBOX_PARAMS {
//     pub cbSize: u32,
//     pub pTitle: windows_sys::core::PWSTR,
//     pub pMessage: windows_sys::core::PWSTR,
//     pub Style: u32,
//     pub dwTimeout: u32,
//     pub bWait: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2546:1: declaration Impl has no candidate rule
// impl Default for MESSAGEBOX_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIN_PRIORITY`: UInt = 1u;
// UNSUPPORTED Rust 2552:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct MONITOR {
//     pub pfnEnumPorts: PFN_PRINTING_ENUMPORTS,
//     pub pfnOpenPort: PFN_PRINTING_OPENPORT,
//     pub pfnOpenPortEx: PFN_PRINTING_OPENPORTEX,
//     pub pfnStartDocPort: PFN_PRINTING_STARTDOCPORT,
//     pub pfnWritePort: PFN_PRINTING_WRITEPORT,
//     pub pfnReadPort: PFN_PRINTING_READPORT,
//     pub pfnEndDocPort: PFN_PRINTING_ENDDOCPORT,
//     pub pfnClosePort: PFN_PRINTING_CLOSEPORT,
//     pub pfnAddPort: PFN_PRINTING_ADDPORT,
//     pub pfnAddPortEx: PFN_PRINTING_ADDPORTEX,
//     pub pfnConfigurePort: PFN_PRINTING_CONFIGUREPORT,
//     pub pfnDeletePort: PFN_PRINTING_DELETEPORT,
//     pub pfnGetPrinterDataFromPort: PFN_PRINTING_GETPRINTERDATAFROMPORT,
//     pub pfnSetPortTimeOuts: PFN_PRINTING_SETPORTTIMEOUTS,
//     pub pfnXcvOpenPort: PFN_PRINTING_XCVOPENPORT,
//     pub pfnXcvDataPort: PFN_PRINTING_XCVDATAPORT,
//     pub pfnXcvClosePort: PFN_PRINTING_XCVCLOSEPORT,
// }

// UNSUPPORTED Rust 2574:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct MONITOR2 {
//     pub cbSize: u32,
//     pub pfnEnumPorts: PFN_PRINTING_ENUMPORTS2,
//     pub pfnOpenPort: PFN_PRINTING_OPENPORT2,
//     pub pfnOpenPortEx: PFN_PRINTING_OPENPORTEX2,
//     pub pfnStartDocPort: PFN_PRINTING_STARTDOCPORT2,
//     pub pfnWritePort: PFN_PRINTING_WRITEPORT2,
//     pub pfnReadPort: PFN_PRINTING_READPORT2,
//     pub pfnEndDocPort: PFN_PRINTING_ENDDOCPORT2,
//     pub pfnClosePort: PFN_PRINTING_CLOSEPORT2,
//     pub pfnAddPort: PFN_PRINTING_ADDPORT2,
//     pub pfnAddPortEx: PFN_PRINTING_ADDPORTEX2,
//     pub pfnConfigurePort: PFN_PRINTING_CONFIGUREPORT2,
//     pub pfnDeletePort: PFN_PRINTING_DELETEPORT2,
//     pub pfnGetPrinterDataFromPort: PFN_PRINTING_GETPRINTERDATAFROMPORT2,
//     pub pfnSetPortTimeOuts: PFN_PRINTING_SETPORTTIMEOUTS2,
//     pub pfnXcvOpenPort: PFN_PRINTING_XCVOPENPORT2,
//     pub pfnXcvDataPort: PFN_PRINTING_XCVDATAPORT2,
//     pub pfnXcvClosePort: PFN_PRINTING_XCVCLOSEPORT2,
//     pub pfnShutdown: PFN_PRINTING_SHUTDOWN2,
//     pub pfnSendRecvBidiDataFromPort: PFN_PRINTING_SENDRECVBIDIDATAFROMPORT2,
//     pub pfnNotifyUsedPorts: PFN_PRINTING_NOTIFYUSEDPORTS2,
//     pub pfnNotifyUnusedPorts: PFN_PRINTING_NOTIFYUNUSEDPORTS2,
//     pub pfnPowerEvent: PFN_PRINTING_POWEREVENT2,
// }

// UNSUPPORTED Rust 2602:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct MONITOREX {
//     pub dwMonitorSize: u32,
//     pub Monitor: MONITOR,
// }

// UNSUPPORTED Rust 2609:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy)]
// pub struct MONITORINIT {
//     pub cbSize: u32,
//     pub hSpooler: super::super::Foundation::HANDLE,
//     pub hckRegistryRoot: super::super::System::Registry::HKEY,
//     pub pMonitorReg: *mut MONITORREG,
//     pub bLocal: windows_sys::core::BOOL,
//     pub pszServerName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 2620:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for MONITORINIT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2626:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MONITORREG {
//     pub cbSize: u32,
//     pub fpCreateKey: isize,
//     pub fpOpenKey: isize,
//     pub fpCloseKey: isize,
//     pub fpDeleteKey: isize,
//     pub fpEnumKey: isize,
//     pub fpQueryInfoKey: isize,
//     pub fpSetValue: isize,
//     pub fpDeleteValue: isize,
//     pub fpEnumValue: isize,
//     pub fpQueryValue: isize,
// }

// UNSUPPORTED Rust 2641:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MONITORUI {
//     pub dwMonitorUISize: u32,
//     pub pfnAddPortUI: isize,
//     pub pfnConfigurePortUI: isize,
//     pub pfnDeletePortUI: isize,
// }

// UNSUPPORTED Rust 2649:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONITOR_INFO_1A {
//     pub pName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2654:1: declaration Impl has no candidate rule
// impl Default for MONITOR_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONITOR_INFO_1W {
//     pub pName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2664:1: declaration Impl has no candidate rule
// impl Default for MONITOR_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2669:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONITOR_INFO_2A {
//     pub pName: windows_sys::core::PSTR,
//     pub pEnvironment: windows_sys::core::PSTR,
//     pub pDLLName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2676:1: declaration Impl has no candidate rule
// impl Default for MONITOR_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2681:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONITOR_INFO_2W {
//     pub pName: windows_sys::core::PWSTR,
//     pub pEnvironment: windows_sys::core::PWSTR,
//     pub pDLLName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2688:1: declaration Impl has no candidate rule
// impl Default for MONITOR_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2693:1: non-scalar type Ptr unsupported
// pub const MS_PRINT_JOB_OUTPUT_FILE: windows_sys::core::PCWSTR = windows_sys::core::w!("MsPrintJobOutputFile");

public const val `MTYPE_ADD`: UInt = 64u;
public const val `MTYPE_COMPOSE`: UInt = 1u;
public const val `MTYPE_DIRECT`: UInt = 2u;
public const val `MTYPE_DISABLE`: UInt = 128u;
public const val `MTYPE_DOUBLE`: UInt = 16u;
public const val `MTYPE_DOUBLEBYTECHAR_MASK`: UInt = 24u;
public const val `MTYPE_FORMAT_MASK`: UInt = 7u;
public const val `MTYPE_PAIRED`: UInt = 4u;
public const val `MTYPE_PREDEFIN_MASK`: UInt = 224u;
public const val `MTYPE_REPLACE`: UInt = 32u;
public const val `MTYPE_SINGLE`: UInt = 8u;
public const val `MV_GRAPHICS`: UInt = 4u;
public const val `MV_PHYSICAL`: UInt = 8u;
public const val `MV_RELATIVE`: UInt = 2u;
public const val `MV_SENDXMOVECMD`: UInt = 16u;
public const val `MV_SENDYMOVECMD`: UInt = 32u;
public const val `MV_UPDATE`: UInt = 1u;
public const val `MXDCOP_GET_FILENAME`: UInt = 14u;
public const val `MXDCOP_PRINTTICKET_FIXED_DOC`: UInt = 24u;
public const val `MXDCOP_PRINTTICKET_FIXED_DOC_SEQ`: UInt = 22u;
public const val `MXDCOP_PRINTTICKET_FIXED_PAGE`: UInt = 26u;
public const val `MXDCOP_SET_S0PAGE`: UInt = 28u;
public const val `MXDCOP_SET_S0PAGE_RESOURCE`: UInt = 30u;
public const val `MXDCOP_SET_XPSPASSTHRU_MODE`: UInt = 32u;
public const val `MXDC_ESCAPE`: UInt = 4122u;
// UNSUPPORTED Rust 2719:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MXDC_ESCAPE_HEADER_T {
//     pub cbInput: u32,
//     pub cbOutput: u32,
//     pub opCode: u32,
// }

// UNSUPPORTED Rust 2726:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MXDC_GET_FILENAME_DATA_T {
//     pub cbOutput: u32,
//     pub wszData: [u16; 1],
// }

// UNSUPPORTED Rust 2732:1: declaration Impl has no candidate rule
// impl Default for MXDC_GET_FILENAME_DATA_T {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MXDC_IMAGETYPE_JPEGHIGH_COMPRESSION`: `MXDC_IMAGE_TYPE_ENUMS` = 1;
public const val `MXDC_IMAGETYPE_JPEGLOW_COMPRESSION`: `MXDC_IMAGE_TYPE_ENUMS` = 3;
public const val `MXDC_IMAGETYPE_JPEGMEDIUM_COMPRESSION`: `MXDC_IMAGE_TYPE_ENUMS` = 2;
public const val `MXDC_IMAGETYPE_PNG`: `MXDC_IMAGE_TYPE_ENUMS` = 4;
public typealias `MXDC_IMAGE_TYPE_ENUMS` = Int;
public const val `MXDC_LANDSCAPE_ROTATE_COUNTERCLOCKWISE_270_DEGREES`: `MXDC_LANDSCAPE_ROTATION_ENUMS` = -90;
public const val `MXDC_LANDSCAPE_ROTATE_COUNTERCLOCKWISE_90_DEGREES`: `MXDC_LANDSCAPE_ROTATION_ENUMS` = 90;
public const val `MXDC_LANDSCAPE_ROTATE_NONE`: `MXDC_LANDSCAPE_ROTATION_ENUMS` = 0;
public typealias `MXDC_LANDSCAPE_ROTATION_ENUMS` = Int;
// UNSUPPORTED Rust 2746:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MXDC_PRINTTICKET_DATA_T {
//     pub dwDataSize: u32,
//     pub bData: [u8; 1],
// }

// UNSUPPORTED Rust 2752:1: declaration Impl has no candidate rule
// impl Default for MXDC_PRINTTICKET_DATA_T {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2757:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MXDC_PRINTTICKET_ESCAPE_T {
//     pub mxdcEscape: MXDC_ESCAPE_HEADER_T,
//     pub printTicketData: MXDC_PRINTTICKET_DATA_T,
// }

public const val `MXDC_RESOURCE_DICTIONARY`: `MXDC_S0_PAGE_ENUMS` = 5;
public const val `MXDC_RESOURCE_ICC_PROFILE`: `MXDC_S0_PAGE_ENUMS` = 6;
public const val `MXDC_RESOURCE_JPEG`: `MXDC_S0_PAGE_ENUMS` = 1;
public const val `MXDC_RESOURCE_JPEG_THUMBNAIL`: `MXDC_S0_PAGE_ENUMS` = 7;
public const val `MXDC_RESOURCE_MAX`: `MXDC_S0_PAGE_ENUMS` = 9;
public const val `MXDC_RESOURCE_PNG`: `MXDC_S0_PAGE_ENUMS` = 2;
public const val `MXDC_RESOURCE_PNG_THUMBNAIL`: `MXDC_S0_PAGE_ENUMS` = 8;
public const val `MXDC_RESOURCE_TIFF`: `MXDC_S0_PAGE_ENUMS` = 3;
public const val `MXDC_RESOURCE_TTF`: `MXDC_S0_PAGE_ENUMS` = 0;
public const val `MXDC_RESOURCE_WDP`: `MXDC_S0_PAGE_ENUMS` = 4;
// UNSUPPORTED Rust 2773:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MXDC_S0PAGE_DATA_T {
//     pub dwSize: u32,
//     pub bData: [u8; 1],
// }

// UNSUPPORTED Rust 2779:1: declaration Impl has no candidate rule
// impl Default for MXDC_S0PAGE_DATA_T {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2784:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MXDC_S0PAGE_PASSTHROUGH_ESCAPE_T {
//     pub mxdcEscape: MXDC_ESCAPE_HEADER_T,
//     pub xpsS0PageData: MXDC_S0PAGE_DATA_T,
// }

// UNSUPPORTED Rust 2790:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MXDC_S0PAGE_RESOURCE_ESCAPE_T {
//     pub mxdcEscape: MXDC_ESCAPE_HEADER_T,
//     pub xpsS0PageResourcePassthrough: MXDC_XPS_S0PAGE_RESOURCE_T,
// }

public typealias `MXDC_S0_PAGE_ENUMS` = Int;
// UNSUPPORTED Rust 2797:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MXDC_XPS_S0PAGE_RESOURCE_T {
//     pub dwSize: u32,
//     pub dwResourceType: u32,
//     pub szUri: [u8; 260],
//     pub dwDataSize: u32,
//     pub bData: [u8; 1],
// }

// UNSUPPORTED Rust 2806:1: declaration Impl has no candidate rule
// impl Default for MXDC_XPS_S0PAGE_RESOURCE_T {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NORMAL_PRINT`: UInt = 0u;
public typealias `NOTIFICATION_CALLBACK_COMMANDS` = Int;
public const val `NOTIFICATION_COMMAND_CONTEXT_ACQUIRE`: `NOTIFICATION_CALLBACK_COMMANDS` = 1;
public const val `NOTIFICATION_COMMAND_CONTEXT_RELEASE`: `NOTIFICATION_CALLBACK_COMMANDS` = 2;
public const val `NOTIFICATION_COMMAND_NOTIFY`: `NOTIFICATION_CALLBACK_COMMANDS` = 0;
// UNSUPPORTED Rust 2816:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NOTIFICATION_CONFIG_1 {
//     pub cbSize: u32,
//     pub fdwFlags: u32,
//     pub pfnNotifyCallback: ROUTER_NOTIFY_CALLBACK,
//     pub pContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2824:1: declaration Impl has no candidate rule
// impl Default for NOTIFICATION_CONFIG_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NOTIFICATION_CONFIG_ASYNC_CHANNEL`: `NOTIFICATION_CONFIG_FLAGS` = 8;
public const val `NOTIFICATION_CONFIG_CREATE_EVENT`: `NOTIFICATION_CONFIG_FLAGS` = 1;
public const val `NOTIFICATION_CONFIG_EVENT_TRIGGER`: `NOTIFICATION_CONFIG_FLAGS` = 4;
public typealias `NOTIFICATION_CONFIG_FLAGS` = Int;
public const val `NOTIFICATION_CONFIG_REGISTER_CALLBACK`: `NOTIFICATION_CONFIG_FLAGS` = 2;
// UNSUPPORTED Rust 2834:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NOTIFICATION_RELEASE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba9a5027_a70e_4ae7_9b7d_eb3e06ad4157);

public const val `NOT_REGISTERED`: `PrintAsyncNotifyError` = 13;
public const val `NO_BORDER_PRINT`: UInt = 1u;
public const val `NO_COLOR_OPTIMIZATION`: UInt = 0u;
public const val `NO_LISTENERS`: `PrintAsyncNotifyError` = 7;
public const val `NO_PRIORITY`: UInt = 0u;
// UNSUPPORTED Rust 2840:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// pub type OEMCUIPCALLBACK = Option<unsafe extern "system" fn(param0: *mut CPSUICBPARAM, param1: *mut OEMCUIPPARAM) -> i32>;

// UNSUPPORTED Rust 2842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct OEMCUIPPARAM {
//     pub cbSize: u32,
//     pub poemuiobj: *mut OEMUIOBJ,
//     pub hPrinter: super::super::Foundation::HANDLE,
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub hModule: super::super::Foundation::HANDLE,
//     pub hOEMHeap: super::super::Foundation::HANDLE,
//     pub pPublicDM: *mut super::Gdi::DEVMODEA,
//     pub pOEMDM: *mut core::ffi::c_void,
//     pub dwFlags: u32,
//     pub pDrvOptItems: *mut OPTITEM,
//     pub cDrvOptItems: u32,
//     pub pOEMOptItems: *mut OPTITEM,
//     pub cOEMOptItems: u32,
//     pub pOEMUserData: *mut core::ffi::c_void,
//     pub OEMCUIPCallback: OEMCUIPCALLBACK,
// }

// UNSUPPORTED Rust 2862:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OEMCUIPPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OEMCUIP_DOCPROP`: UInt = 1u;
public const val `OEMCUIP_PRNPROP`: UInt = 2u;
// UNSUPPORTED Rust 2870:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct OEMDMPARAM {
//     pub cbSize: u32,
//     pub pdriverobj: *mut core::ffi::c_void,
//     pub hPrinter: super::super::Foundation::HANDLE,
//     pub hModule: super::super::Foundation::HANDLE,
//     pub pPublicDMIn: *mut super::Gdi::DEVMODEA,
//     pub pPublicDMOut: *mut super::Gdi::DEVMODEA,
//     pub pOEMDMIn: *mut core::ffi::c_void,
//     pub pOEMDMOut: *mut core::ffi::c_void,
//     pub cbBufSize: u32,
// }

// UNSUPPORTED Rust 2884:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for OEMDMPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OEMDM_CONVERT`: UInt = 3u;
public const val `OEMDM_DEFAULT`: UInt = 2u;
public const val `OEMDM_MERGE`: UInt = 4u;
public const val `OEMDM_SIZE`: UInt = 1u;
// UNSUPPORTED Rust 2894:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OEMFONTINSTPARAM {
//     pub cbSize: u32,
//     pub hPrinter: super::super::Foundation::HANDLE,
//     pub hModule: super::super::Foundation::HANDLE,
//     pub hHeap: super::super::Foundation::HANDLE,
//     pub dwFlags: u32,
//     pub pFontInstallerName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2904:1: declaration Impl has no candidate rule
// impl Default for OEMFONTINSTPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OEMGDS_FREEMEM`: UInt = 32769u;
public const val `OEMGDS_JOBTIMEOUT`: UInt = 32770u;
public const val `OEMGDS_MAX`: UInt = 65536u;
public const val `OEMGDS_MAXBITMAP`: UInt = 32774u;
public const val `OEMGDS_MINOUTLINE`: UInt = 32773u;
public const val `OEMGDS_MIN_DOCSTICKY`: UInt = 1u;
public const val `OEMGDS_MIN_PRINTERSTICKY`: UInt = 32768u;
public const val `OEMGDS_PRINTFLAGS`: UInt = 32768u;
public const val `OEMGDS_PROTOCOL`: UInt = 32772u;
public const val `OEMGDS_PSDM_CUSTOMSIZE`: UInt = 6u;
public const val `OEMGDS_PSDM_DIALECT`: UInt = 2u;
public const val `OEMGDS_PSDM_FLAGS`: UInt = 1u;
public const val `OEMGDS_PSDM_NUP`: UInt = 4u;
public const val `OEMGDS_PSDM_PSLEVEL`: UInt = 5u;
public const val `OEMGDS_PSDM_TTDLFMT`: UInt = 3u;
public const val `OEMGDS_UNIDM_FLAGS`: UInt = 16385u;
public const val `OEMGDS_UNIDM_GPDVER`: UInt = 16384u;
public const val `OEMGDS_WAITTIMEOUT`: UInt = 32771u;
public const val `OEMGI_GETINTERFACEVERSION`: UInt = 2u;
public const val `OEMGI_GETPUBLISHERINFO`: UInt = 4u;
public const val `OEMGI_GETREQUESTEDHELPERINTERFACES`: UInt = 5u;
public const val `OEMGI_GETSIGNATURE`: UInt = 1u;
public const val `OEMGI_GETVERSION`: UInt = 3u;
public const val `OEMPUBLISH_DEFAULT`: UInt = 0u;
public const val `OEMPUBLISH_IPRINTCOREHELPER`: UInt = 1u;
public const val `OEMTTY_INFO_CODEPAGE`: UInt = 2u;
public const val `OEMTTY_INFO_MARGINS`: UInt = 1u;
public const val `OEMTTY_INFO_NUM_UFMS`: UInt = 3u;
public const val `OEMTTY_INFO_UFM_IDS`: UInt = 4u;
// UNSUPPORTED Rust 2938:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OEMUIOBJ {
//     pub cbSize: u32,
//     pub pOemUIProcs: *mut OEMUIPROCS,
// }

// UNSUPPORTED Rust 2944:1: declaration Impl has no candidate rule
// impl Default for OEMUIOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2949:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OEMUIPROCS {
//     pub DrvGetDriverSetting: PFN_DrvGetDriverSetting,
//     pub DrvUpdateUISetting: PFN_DrvUpdateUISetting,
// }

// UNSUPPORTED Rust 2955:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct OEMUIPSPARAM {
//     pub cbSize: u32,
//     pub poemuiobj: *mut OEMUIOBJ,
//     pub hPrinter: super::super::Foundation::HANDLE,
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub hModule: super::super::Foundation::HANDLE,
//     pub hOEMHeap: super::super::Foundation::HANDLE,
//     pub pPublicDM: *mut super::Gdi::DEVMODEA,
//     pub pOEMDM: *mut core::ffi::c_void,
//     pub pOEMUserData: *mut core::ffi::c_void,
//     pub dwFlags: u32,
//     pub pOemEntry: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2971:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for OEMUIPSPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2977:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OEM_DMEXTRAHEADER {
//     pub dwSize: u32,
//     pub dwSignature: u32,
//     pub dwVersion: u32,
// }

public const val `OEM_MODE_PUBLISHER`: UInt = 1u;
// UNSUPPORTED Rust 2985:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OIEXT {
//     pub cbSize: u16,
//     pub Flags: u16,
//     pub hInstCaller: super::super::Foundation::HINSTANCE,
//     pub pHelpFile: *mut i8,
//     pub dwReserved: [usize; 4],
// }

// UNSUPPORTED Rust 2994:1: declaration Impl has no candidate rule
// impl Default for OIEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OIEXTF_ANSI_STRING`: UInt = 1u;
public const val `OPTCF_HIDE`: UInt = 1u;
public const val `OPTCF_MASK`: UInt = 1u;
// UNSUPPORTED Rust 3002:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OPTCOMBO {
//     pub cbSize: u16,
//     pub Flags: u8,
//     pub cListItem: u16,
//     pub pListItem: *mut OPTPARAM,
//     pub Sel: i32,
//     pub dwReserved: [u32; 3],
// }

// UNSUPPORTED Rust 3012:1: declaration Impl has no candidate rule
// impl Default for OPTCOMBO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OPTIF_CALLBACK`: Int = 4;
public const val `OPTIF_CHANGED`: Int = 8;
public const val `OPTIF_CHANGEONCE`: Int = 16;
public const val `OPTIF_COLLAPSE`: Int = 1;
public const val `OPTIF_DISABLED`: Int = 32;
public const val `OPTIF_ECB_CHECKED`: Int = 64;
public const val `OPTIF_EXT_DISABLED`: Int = 256;
public const val `OPTIF_EXT_HIDE`: Int = 128;
public const val `OPTIF_EXT_IS_EXTPUSH`: Int = 1024;
public const val `OPTIF_HAS_POIEXT`: Int = 65536;
public const val `OPTIF_HIDE`: Int = 2;
public const val `OPTIF_INITIAL_TVITEM`: Int = 32768;
public const val `OPTIF_MASK`: Int = 131071;
public const val `OPTIF_NO_GROUPBOX_NAME`: Int = 2048;
public const val `OPTIF_OVERLAY_NO_ICON`: Int = 16384;
public const val `OPTIF_OVERLAY_STOP_ICON`: Int = 8192;
public const val `OPTIF_OVERLAY_WARNING_ICON`: Int = 4096;
public const val `OPTIF_SEL_AS_HICON`: Int = 512;
// UNSUPPORTED Rust 3035:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct OPTITEM {
//     pub cbSize: u16,
//     pub Level: u8,
//     pub DlgPageIdx: u8,
//     pub Flags: u32,
//     pub UserData: usize,
//     pub pName: *mut i8,
//     pub Anonymous1: OPTITEM_0,
//     pub Anonymous2: OPTITEM_1,
//     pub pOptType: *mut OPTTYPE,
//     pub HelpIndex: u32,
//     pub DMPubID: u8,
//     pub UserItemID: u8,
//     pub wReserved: u16,
//     pub pOIExt: *mut OIEXT,
//     pub dwReserved: [usize; 3],
// }

// UNSUPPORTED Rust 3055:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPTITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3061:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union OPTITEM_0 {
//     pub Sel: i32,
//     pub pSel: *mut i8,
// }

// UNSUPPORTED Rust 3068:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPTITEM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3074:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union OPTITEM_1 {
//     pub pExtChkBox: *mut EXTCHKBOX,
//     pub pExtPush: *mut EXTPUSH,
// }

// UNSUPPORTED Rust 3081:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPTITEM_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3087:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OPTPARAM {
//     pub cbSize: u16,
//     pub Flags: u8,
//     pub Style: u8,
//     pub pData: *mut i8,
//     pub IconID: usize,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub dwReserved: [usize; 2],
// }

// UNSUPPORTED Rust 3098:1: declaration Impl has no candidate rule
// impl Default for OPTPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OPTPF_DISABLED`: UInt = 2u;
public const val `OPTPF_HIDE`: UInt = 1u;
public const val `OPTPF_ICONID_AS_HICON`: UInt = 4u;
public const val `OPTPF_MASK`: UInt = 127u;
public const val `OPTPF_OVERLAY_NO_ICON`: UInt = 32u;
public const val `OPTPF_OVERLAY_STOP_ICON`: UInt = 16u;
public const val `OPTPF_OVERLAY_WARNING_ICON`: UInt = 8u;
public const val `OPTPF_USE_HDLGTEMPLATE`: UInt = 64u;
public const val `OPTTF_MASK`: UInt = 3u;
public const val `OPTTF_NOSPACE_BEFORE_POSTFIX`: UInt = 2u;
public const val `OPTTF_TYPE_DISABLED`: UInt = 1u;
// UNSUPPORTED Rust 3114:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OPTTYPE {
//     pub cbSize: u16,
//     pub Type: u8,
//     pub Flags: u8,
//     pub Count: u16,
//     pub BegCtrlID: u16,
//     pub pOptParam: *mut OPTPARAM,
//     pub Style: u16,
//     pub wReserved: [u16; 3],
//     pub dwReserved: [usize; 3],
// }

// UNSUPPORTED Rust 3127:1: declaration Impl has no candidate rule
// impl Default for OPTTYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OTS_LBCB_INCL_ITEM_NONE`: UInt = 8u;
public const val `OTS_LBCB_NO_ICON16_IN_ITEM`: UInt = 16u;
public const val `OTS_LBCB_PROPPAGE_CBUSELB`: UInt = 4u;
public const val `OTS_LBCB_PROPPAGE_LBUSECB`: UInt = 2u;
public const val `OTS_LBCB_SORT`: UInt = 1u;
public const val `OTS_MASK`: UInt = 255u;
public const val `OTS_PUSH_ENABLE_ALWAYS`: UInt = 128u;
public const val `OTS_PUSH_INCL_SETUP_TITLE`: UInt = 32u;
public const val `OTS_PUSH_NO_DOT_DOT_DOT`: UInt = 64u;
public const val `PDEV_ADJUST_PAPER_MARGIN_TYPE`: UInt = 1u;
public const val `PDEV_HOSTFONT_ENABLED_TYPE`: UInt = 2u;
public const val `PDEV_USE_TRUE_COLOR_TYPE`: UInt = 3u;
// UNSUPPORTED Rust 3144:1: generic scalar type unsupported
// pub type PFNCOMPROPSHEET = Option<unsafe extern "system" fn(hcompropsheet: super::super::Foundation::HANDLE, function: u32, lparam1: super::super::Foundation::LPARAM, lparam2: super::super::Foundation::LPARAM) -> isize>;

// UNSUPPORTED Rust 3145:1: generic scalar type unsupported
// pub type PFNPROPSHEETUI = Option<unsafe extern "system" fn(ppsuiinfo: *mut PROPSHEETUI_INFO, lparam: super::super::Foundation::LPARAM) -> i32>;

// UNSUPPORTED Rust 3146:1: generic scalar type unsupported
// pub type PFN_DrvGetDriverSetting = Option<unsafe extern "system" fn(pdriverobj: *mut core::ffi::c_void, feature: windows_sys::core::PCSTR, poutput: *mut core::ffi::c_void, cbsize: u32, pcbneeded: *mut u32, pdwoptionsreturned: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3147:1: generic scalar type unsupported
// pub type PFN_DrvUpdateUISetting = Option<unsafe extern "system" fn(pdriverobj: *mut core::ffi::c_void, poptitem: *mut core::ffi::c_void, dwpreviousselection: u32, dwmode: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3148:1: generic scalar type unsupported
// pub type PFN_DrvUpgradeRegistrySetting = Option<unsafe extern "system" fn(hprinter: super::super::Foundation::HANDLE, pfeature: windows_sys::core::PCSTR, poption: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3149:1: generic scalar type unsupported
// pub type PFN_PRINTING_ADDPORT = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: super::super::Foundation::HWND, param2: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3150:1: generic scalar type unsupported
// pub type PFN_PRINTING_ADDPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: super::super::Foundation::HWND, param3: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3151:1: generic scalar type unsupported
// pub type PFN_PRINTING_ADDPORTEX = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: *const u8, param3: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3152:1: generic scalar type unsupported
// pub type PFN_PRINTING_ADDPORTEX2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: u32, param3: *const u8, param4: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3153:1: generic scalar type unsupported
// pub type PFN_PRINTING_CLOSEPORT = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3154:1: generic scalar type unsupported
// pub type PFN_PRINTING_CLOSEPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3155:1: generic scalar type unsupported
// pub type PFN_PRINTING_CONFIGUREPORT = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: super::super::Foundation::HWND, param2: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3156:1: generic scalar type unsupported
// pub type PFN_PRINTING_CONFIGUREPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: super::super::Foundation::HWND, param3: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3157:1: generic scalar type unsupported
// pub type PFN_PRINTING_DELETEPORT = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: super::super::Foundation::HWND, param2: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3158:1: generic scalar type unsupported
// pub type PFN_PRINTING_DELETEPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: super::super::Foundation::HWND, param3: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3159:1: generic scalar type unsupported
// pub type PFN_PRINTING_ENDDOCPORT = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3160:1: generic scalar type unsupported
// pub type PFN_PRINTING_ENDDOCPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3161:1: generic scalar type unsupported
// pub type PFN_PRINTING_ENUMPORTS = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: *mut u8, param3: u32, param4: *mut u32, param5: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3162:1: generic scalar type unsupported
// pub type PFN_PRINTING_ENUMPORTS2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: u32, param3: *mut u8, param4: u32, param5: *mut u32, param6: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3163:1: generic scalar type unsupported
// pub type PFN_PRINTING_GETPRINTERDATAFROMPORT = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32, param2: windows_sys::core::PCWSTR, param3: windows_sys::core::PCWSTR, param4: u32, param5: windows_sys::core::PCWSTR, param6: u32, param7: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3164:1: generic scalar type unsupported
// pub type PFN_PRINTING_GETPRINTERDATAFROMPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32, param2: windows_sys::core::PCWSTR, param3: windows_sys::core::PCWSTR, param4: u32, param5: windows_sys::core::PCWSTR, param6: u32, param7: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3165:1: generic scalar type unsupported
// pub type PFN_PRINTING_NOTIFYUNUSEDPORTS2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32, param2: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3166:1: generic scalar type unsupported
// pub type PFN_PRINTING_NOTIFYUSEDPORTS2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32, param2: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3167:1: generic scalar type unsupported
// pub type PFN_PRINTING_OPENPORT = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: *mut super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3168:1: generic scalar type unsupported
// pub type PFN_PRINTING_OPENPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: *mut super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3169:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
// pub type PFN_PRINTING_OPENPORTEX = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: windows_sys::core::PCWSTR, param3: *mut super::super::Foundation::HANDLE, param4: *const MONITOR2) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3171:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
// pub type PFN_PRINTING_OPENPORTEX2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: windows_sys::core::PCWSTR, param3: windows_sys::core::PCWSTR, param4: *mut super::super::Foundation::HANDLE, param5: *const MONITOR2) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3173:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Power")]
// pub type PFN_PRINTING_POWEREVENT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32, param2: *const super::super::System::Power::POWERBROADCAST_SETTING) -> u32>;

// UNSUPPORTED Rust 3175:1: generic scalar type unsupported
// pub type PFN_PRINTING_READPORT = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: *mut u8, param2: u32, param3: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3176:1: generic scalar type unsupported
// pub type PFN_PRINTING_READPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: *mut u8, param2: u32, param3: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3177:1: generic scalar type unsupported
// pub type PFN_PRINTING_SENDRECVBIDIDATAFROMPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32, param2: windows_sys::core::PCWSTR, param3: *const BIDI_REQUEST_CONTAINER, param4: *mut *mut BIDI_RESPONSE_CONTAINER) -> u32>;

// UNSUPPORTED Rust 3178:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Devices_Communication")]
// pub type PFN_PRINTING_SETPORTTIMEOUTS = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: *const super::super::Devices::Communication::COMMTIMEOUTS, param2: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3180:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Devices_Communication")]
// pub type PFN_PRINTING_SETPORTTIMEOUTS2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: *const super::super::Devices::Communication::COMMTIMEOUTS, param2: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3182:1: generic scalar type unsupported
// pub type PFN_PRINTING_SHUTDOWN2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE)>;

// UNSUPPORTED Rust 3183:1: generic scalar type unsupported
// pub type PFN_PRINTING_STARTDOCPORT = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: u32, param3: u32, param4: *const u8) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3184:1: generic scalar type unsupported
// pub type PFN_PRINTING_STARTDOCPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: u32, param3: u32, param4: *const u8) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3185:1: generic scalar type unsupported
// pub type PFN_PRINTING_WRITEPORT = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: *const u8, param2: u32, param3: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3186:1: generic scalar type unsupported
// pub type PFN_PRINTING_WRITEPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: *const u8, param2: u32, param3: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3187:1: generic scalar type unsupported
// pub type PFN_PRINTING_XCVCLOSEPORT = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3188:1: generic scalar type unsupported
// pub type PFN_PRINTING_XCVCLOSEPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3189:1: generic scalar type unsupported
// pub type PFN_PRINTING_XCVDATAPORT = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: *const u8, param3: u32, param4: *mut u8, param5: u32, param6: *mut u32) -> u32>;

// UNSUPPORTED Rust 3190:1: generic scalar type unsupported
// pub type PFN_PRINTING_XCVDATAPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: *const u8, param3: u32, param4: *mut u8, param5: u32, param6: *mut u32) -> u32>;

// UNSUPPORTED Rust 3191:1: generic scalar type unsupported
// pub type PFN_PRINTING_XCVOPENPORT = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: *mut super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3192:1: generic scalar type unsupported
// pub type PFN_PRINTING_XCVOPENPORT2 = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: windows_sys::core::PCWSTR, param2: u32, param3: *mut super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3193:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PORT_DATA_1 {
//     pub sztPortName: [u16; 64],
//     pub dwVersion: u32,
//     pub dwProtocol: u32,
//     pub cbSize: u32,
//     pub dwReserved: u32,
//     pub sztHostAddress: [u16; 49],
//     pub sztSNMPCommunity: [u16; 33],
//     pub dwDoubleSpool: u32,
//     pub sztQueue: [u16; 33],
//     pub sztIPAddress: [u16; 16],
//     pub Reserved: [u8; 540],
//     pub dwPortNumber: u32,
//     pub dwSNMPEnabled: u32,
//     pub dwSNMPDevIndex: u32,
// }

// UNSUPPORTED Rust 3211:1: declaration Impl has no candidate rule
// impl Default for PORT_DATA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PORT_DATA_2 {
//     pub sztPortName: [u16; 64],
//     pub dwVersion: u32,
//     pub dwProtocol: u32,
//     pub cbSize: u32,
//     pub dwReserved: u32,
//     pub sztHostAddress: [u16; 128],
//     pub sztSNMPCommunity: [u16; 33],
//     pub dwDoubleSpool: u32,
//     pub sztQueue: [u16; 33],
//     pub Reserved: [u8; 514],
//     pub dwPortNumber: u32,
//     pub dwSNMPEnabled: u32,
//     pub dwSNMPDevIndex: u32,
//     pub dwPortMonitorMibIndex: u32,
// }

// UNSUPPORTED Rust 3234:1: declaration Impl has no candidate rule
// impl Default for PORT_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3239:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PORT_DATA_LIST_1 {
//     pub dwVersion: u32,
//     pub cPortData: u32,
//     pub pPortData: [PORT_DATA_2; 1],
// }

// UNSUPPORTED Rust 3246:1: declaration Impl has no candidate rule
// impl Default for PORT_DATA_LIST_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PORT_INFO_1A {
//     pub pName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3256:1: declaration Impl has no candidate rule
// impl Default for PORT_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3261:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PORT_INFO_1W {
//     pub pName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3266:1: declaration Impl has no candidate rule
// impl Default for PORT_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PORT_INFO_2A {
//     pub pPortName: windows_sys::core::PSTR,
//     pub pMonitorName: windows_sys::core::PSTR,
//     pub pDescription: windows_sys::core::PSTR,
//     pub fPortType: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 3280:1: declaration Impl has no candidate rule
// impl Default for PORT_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PORT_INFO_2W {
//     pub pPortName: windows_sys::core::PWSTR,
//     pub pMonitorName: windows_sys::core::PWSTR,
//     pub pDescription: windows_sys::core::PWSTR,
//     pub fPortType: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 3294:1: declaration Impl has no candidate rule
// impl Default for PORT_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3299:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PORT_INFO_3A {
//     pub dwStatus: u32,
//     pub pszStatus: windows_sys::core::PSTR,
//     pub dwSeverity: u32,
// }

// UNSUPPORTED Rust 3306:1: declaration Impl has no candidate rule
// impl Default for PORT_INFO_3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3311:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PORT_INFO_3W {
//     pub dwStatus: u32,
//     pub pszStatus: windows_sys::core::PWSTR,
//     pub dwSeverity: u32,
// }

// UNSUPPORTED Rust 3318:1: declaration Impl has no candidate rule
// impl Default for PORT_INFO_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PORT_STATUS_DOOR_OPEN`: UInt = 7u;
public const val `PORT_STATUS_NO_TONER`: UInt = 6u;
public const val `PORT_STATUS_OFFLINE`: UInt = 1u;
public const val `PORT_STATUS_OUTPUT_BIN_FULL`: UInt = 4u;
public const val `PORT_STATUS_OUT_OF_MEMORY`: UInt = 9u;
public const val `PORT_STATUS_PAPER_JAM`: UInt = 2u;
public const val `PORT_STATUS_PAPER_OUT`: UInt = 3u;
public const val `PORT_STATUS_PAPER_PROBLEM`: UInt = 5u;
public const val `PORT_STATUS_POWER_SAVE`: UInt = 12u;
public const val `PORT_STATUS_TONER_LOW`: UInt = 10u;
public const val `PORT_STATUS_TYPE_ERROR`: UInt = 1u;
public const val `PORT_STATUS_TYPE_INFO`: UInt = 3u;
public const val `PORT_STATUS_TYPE_WARNING`: UInt = 2u;
public const val `PORT_STATUS_USER_INTERVENTION`: UInt = 8u;
public const val `PORT_STATUS_WARMING_UP`: UInt = 11u;
public const val `PORT_TYPE_NET_ATTACHED`: UInt = 8u;
public const val `PORT_TYPE_READ`: UInt = 2u;
public const val `PORT_TYPE_REDIRECTED`: UInt = 4u;
public const val `PORT_TYPE_WRITE`: UInt = 1u;
public const val `PPCAPS_BOOKLET_EDGE`: UInt = 1u;
public const val `PPCAPS_BORDER_PRINT`: UInt = 1u;
public const val `PPCAPS_REVERSE_PAGES_FOR_REVERSE_DUPLEX`: UInt = 1u;
public const val `PPCAPS_RIGHT_THEN_DOWN`: UInt = 1u;
public const val `PPCAPS_SQUARE_SCALING`: UInt = 1u;
public const val `PRINTER_ACCESS_ADMINISTER`: `PRINTER_ACCESS_RIGHTS` = 4u;
public const val `PRINTER_ACCESS_MANAGE_LIMITED`: `PRINTER_ACCESS_RIGHTS` = 64u;
public typealias `PRINTER_ACCESS_RIGHTS` = UInt;
public const val `PRINTER_ACCESS_USE`: `PRINTER_ACCESS_RIGHTS` = 8u;
public const val `PRINTER_ALL_ACCESS`: `PRINTER_ACCESS_RIGHTS` = 983052u;
public const val `PRINTER_ATTRIBUTE_DEFAULT`: UInt = 4u;
public const val `PRINTER_ATTRIBUTE_DIRECT`: UInt = 2u;
public const val `PRINTER_ATTRIBUTE_DO_COMPLETE_FIRST`: UInt = 512u;
public const val `PRINTER_ATTRIBUTE_ENABLE_BIDI`: UInt = 2048u;
public const val `PRINTER_ATTRIBUTE_ENABLE_DEVQ`: UInt = 128u;
public const val `PRINTER_ATTRIBUTE_ENTERPRISE_CLOUD`: UInt = 8388608u;
public const val `PRINTER_ATTRIBUTE_FAX`: UInt = 16384u;
public const val `PRINTER_ATTRIBUTE_FRIENDLY_NAME`: UInt = 1048576u;
public const val `PRINTER_ATTRIBUTE_HIDDEN`: UInt = 32u;
public const val `PRINTER_ATTRIBUTE_KEEPPRINTEDJOBS`: UInt = 256u;
public const val `PRINTER_ATTRIBUTE_LOCAL`: UInt = 64u;
public const val `PRINTER_ATTRIBUTE_MACHINE`: UInt = 524288u;
public const val `PRINTER_ATTRIBUTE_NETWORK`: UInt = 16u;
public const val `PRINTER_ATTRIBUTE_PER_USER`: UInt = 4194304u;
public const val `PRINTER_ATTRIBUTE_PUBLISHED`: UInt = 8192u;
public const val `PRINTER_ATTRIBUTE_PUSHED_MACHINE`: UInt = 262144u;
public const val `PRINTER_ATTRIBUTE_PUSHED_USER`: UInt = 131072u;
public const val `PRINTER_ATTRIBUTE_QUEUED`: UInt = 1u;
public const val `PRINTER_ATTRIBUTE_RAW_ONLY`: UInt = 4096u;
public const val `PRINTER_ATTRIBUTE_SHARED`: UInt = 8u;
public const val `PRINTER_ATTRIBUTE_TS`: UInt = 32768u;
public const val `PRINTER_ATTRIBUTE_TS_GENERIC_DRIVER`: UInt = 2097152u;
public const val `PRINTER_ATTRIBUTE_WORK_OFFLINE`: UInt = 1024u;
public const val `PRINTER_CHANGE_ADD_FORM`: UInt = 65536u;
public const val `PRINTER_CHANGE_ADD_JOB`: UInt = 256u;
public const val `PRINTER_CHANGE_ADD_PORT`: UInt = 1048576u;
public const val `PRINTER_CHANGE_ADD_PRINTER`: UInt = 1u;
public const val `PRINTER_CHANGE_ADD_PRINTER_DRIVER`: UInt = 268435456u;
public const val `PRINTER_CHANGE_ADD_PRINT_PROCESSOR`: UInt = 16777216u;
public const val `PRINTER_CHANGE_ALL`: UInt = 2138570751u;
public const val `PRINTER_CHANGE_CONFIGURE_PORT`: UInt = 2097152u;
public const val `PRINTER_CHANGE_DELETE_FORM`: UInt = 262144u;
public const val `PRINTER_CHANGE_DELETE_JOB`: UInt = 1024u;
public const val `PRINTER_CHANGE_DELETE_PORT`: UInt = 4194304u;
public const val `PRINTER_CHANGE_DELETE_PRINTER`: UInt = 4u;
public const val `PRINTER_CHANGE_DELETE_PRINTER_DRIVER`: UInt = 1073741824u;
public const val `PRINTER_CHANGE_DELETE_PRINT_PROCESSOR`: UInt = 67108864u;
public const val `PRINTER_CHANGE_FAILED_CONNECTION_PRINTER`: UInt = 8u;
public const val `PRINTER_CHANGE_FORM`: UInt = 458752u;
public const val `PRINTER_CHANGE_JOB`: UInt = 65280u;
public const val `PRINTER_CHANGE_PORT`: UInt = 7340032u;
public const val `PRINTER_CHANGE_PRINTER`: UInt = 255u;
public const val `PRINTER_CHANGE_PRINTER_DRIVER`: UInt = 1879048192u;
public const val `PRINTER_CHANGE_PRINT_PROCESSOR`: UInt = 117440512u;
public const val `PRINTER_CHANGE_SERVER`: UInt = 134217728u;
public const val `PRINTER_CHANGE_SET_FORM`: UInt = 131072u;
public const val `PRINTER_CHANGE_SET_JOB`: UInt = 512u;
public const val `PRINTER_CHANGE_SET_PRINTER`: UInt = 2u;
public const val `PRINTER_CHANGE_SET_PRINTER_DRIVER`: UInt = 536870912u;
public const val `PRINTER_CHANGE_TIMEOUT`: UInt = 2147483648u;
public const val `PRINTER_CHANGE_WRITE_JOB`: UInt = 2048u;
// UNSUPPORTED Rust 3403:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_CONNECTION_INFO_1A {
//     pub dwFlags: u32,
//     pub pszDriverName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3409:1: declaration Impl has no candidate rule
// impl Default for PRINTER_CONNECTION_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3414:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_CONNECTION_INFO_1W {
//     pub dwFlags: u32,
//     pub pszDriverName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3420:1: declaration Impl has no candidate rule
// impl Default for PRINTER_CONNECTION_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_CONNECTION_MISMATCH`: UInt = 32u;
public const val `PRINTER_CONNECTION_NO_UI`: UInt = 64u;
public const val `PRINTER_CONTROL_PAUSE`: UInt = 1u;
public const val `PRINTER_CONTROL_PURGE`: UInt = 3u;
public const val `PRINTER_CONTROL_RESUME`: UInt = 2u;
public const val `PRINTER_CONTROL_SET_STATUS`: UInt = 4u;
// UNSUPPORTED Rust 3431:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTER_DEFAULTSA {
//     pub pDatatype: windows_sys::core::PSTR,
//     pub pDevMode: *mut super::Gdi::DEVMODEA,
//     pub DesiredAccess: PRINTER_ACCESS_RIGHTS,
// }

// UNSUPPORTED Rust 3439:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_DEFAULTSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3445:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTER_DEFAULTSW {
//     pub pDatatype: windows_sys::core::PWSTR,
//     pub pDevMode: *mut super::Gdi::DEVMODEW,
//     pub DesiredAccess: PRINTER_ACCESS_RIGHTS,
// }

// UNSUPPORTED Rust 3453:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_DEFAULTSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_DELETE`: `PRINTER_ACCESS_RIGHTS` = 65536u;
public const val `PRINTER_DRIVER_CATEGORY_3D`: UInt = 4096u;
public const val `PRINTER_DRIVER_CATEGORY_CLOUD`: UInt = 8192u;
public const val `PRINTER_DRIVER_CATEGORY_FAX`: UInt = 64u;
public const val `PRINTER_DRIVER_CATEGORY_FILE`: UInt = 128u;
public const val `PRINTER_DRIVER_CATEGORY_SERVICE`: UInt = 512u;
public const val `PRINTER_DRIVER_CATEGORY_VIRTUAL`: UInt = 256u;
public const val `PRINTER_DRIVER_CLASS`: UInt = 8u;
public const val `PRINTER_DRIVER_DERIVED`: UInt = 16u;
public const val `PRINTER_DRIVER_NOT_SHAREABLE`: UInt = 32u;
public const val `PRINTER_DRIVER_PACKAGE_AWARE`: UInt = 1u;
public const val `PRINTER_DRIVER_SANDBOX_DISABLED`: UInt = 2048u;
public const val `PRINTER_DRIVER_SANDBOX_ENABLED`: UInt = 4u;
public const val `PRINTER_DRIVER_SOFT_RESET_REQUIRED`: UInt = 1024u;
public const val `PRINTER_DRIVER_XPS`: UInt = 2u;
public const val `PRINTER_ENUM_CATEGORY_3D`: UInt = 67108864u;
public const val `PRINTER_ENUM_CATEGORY_ALL`: UInt = 33554432u;
public const val `PRINTER_ENUM_CONNECTIONS`: UInt = 4u;
public const val `PRINTER_ENUM_CONTAINER`: UInt = 32768u;
public const val `PRINTER_ENUM_DEFAULT`: UInt = 1u;
public const val `PRINTER_ENUM_EXPAND`: UInt = 16384u;
public const val `PRINTER_ENUM_FAVORITE`: UInt = 4u;
public const val `PRINTER_ENUM_HIDE`: UInt = 16777216u;
public const val `PRINTER_ENUM_ICON1`: UInt = 65536u;
public const val `PRINTER_ENUM_ICON2`: UInt = 131072u;
public const val `PRINTER_ENUM_ICON3`: UInt = 262144u;
public const val `PRINTER_ENUM_ICON4`: UInt = 524288u;
public const val `PRINTER_ENUM_ICON5`: UInt = 1048576u;
public const val `PRINTER_ENUM_ICON6`: UInt = 2097152u;
public const val `PRINTER_ENUM_ICON7`: UInt = 4194304u;
public const val `PRINTER_ENUM_ICON8`: UInt = 8388608u;
public const val `PRINTER_ENUM_ICONMASK`: UInt = 16711680u;
public const val `PRINTER_ENUM_LOCAL`: UInt = 2u;
public const val `PRINTER_ENUM_NAME`: UInt = 8u;
public const val `PRINTER_ENUM_NETWORK`: UInt = 64u;
public const val `PRINTER_ENUM_REMOTE`: UInt = 16u;
public const val `PRINTER_ENUM_SHARED`: UInt = 32u;
// UNSUPPORTED Rust 3496:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_ENUM_VALUESA {
//     pub pValueName: windows_sys::core::PSTR,
//     pub cbValueName: u32,
//     pub dwType: u32,
//     pub pData: *mut u8,
//     pub cbData: u32,
// }

// UNSUPPORTED Rust 3505:1: declaration Impl has no candidate rule
// impl Default for PRINTER_ENUM_VALUESA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3510:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_ENUM_VALUESW {
//     pub pValueName: windows_sys::core::PWSTR,
//     pub cbValueName: u32,
//     pub dwType: u32,
//     pub pData: *mut u8,
//     pub cbData: u32,
// }

// UNSUPPORTED Rust 3519:1: declaration Impl has no candidate rule
// impl Default for PRINTER_ENUM_VALUESW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_ERROR_INFORMATION`: UInt = 2147483648u;
public const val `PRINTER_ERROR_JAM`: UInt = 2u;
public const val `PRINTER_ERROR_OUTOFPAPER`: UInt = 1u;
public const val `PRINTER_ERROR_OUTOFTONER`: UInt = 4u;
public const val `PRINTER_ERROR_SEVERE`: UInt = 536870912u;
public const val `PRINTER_ERROR_WARNING`: UInt = 1073741824u;
public const val `PRINTER_EVENT_ADD_CONNECTION`: UInt = 1u;
public const val `PRINTER_EVENT_ADD_CONNECTION_NO_UI`: UInt = 9u;
public const val `PRINTER_EVENT_ATTRIBUTES_CHANGED`: UInt = 7u;
// UNSUPPORTED Rust 3533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTER_EVENT_ATTRIBUTES_INFO {
//     pub cbSize: u32,
//     pub dwOldAttributes: u32,
//     pub dwNewAttributes: u32,
// }

public const val `PRINTER_EVENT_CACHE_DELETE`: UInt = 6u;
public const val `PRINTER_EVENT_CACHE_REFRESH`: UInt = 5u;
public const val `PRINTER_EVENT_CONFIGURATION_CHANGE`: UInt = 0u;
public const val `PRINTER_EVENT_CONFIGURATION_UPDATE`: UInt = 8u;
public const val `PRINTER_EVENT_DELETE`: UInt = 4u;
public const val `PRINTER_EVENT_DELETE_CONNECTION`: UInt = 2u;
public const val `PRINTER_EVENT_DELETE_CONNECTION_NO_UI`: UInt = 10u;
public const val `PRINTER_EVENT_FLAG_NO_UI`: UInt = 1u;
public const val `PRINTER_EVENT_INITIALIZE`: UInt = 3u;
public const val `PRINTER_EXECUTE`: `PRINTER_ACCESS_RIGHTS` = 131080u;
// UNSUPPORTED Rust 3550:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PRINTER_EXTENSION_DETAILEDREASON_PRINTER_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5d5a1704_dfd1_4181_8eee_815c86edad31);

// UNSUPPORTED Rust 3551:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PRINTER_EXTENSION_REASON_DRIVER_EVENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x23bb1328_63de_4293_915b_a6a23d929acb);

// UNSUPPORTED Rust 3552:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PRINTER_EXTENSION_REASON_PRINT_PREFERENCES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xec8f261f_267c_469f_b5d6_3933023c29cc);

// UNSUPPORTED Rust 3553:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_HANDLE {
//     pub Value: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3558:1: declaration Impl has no candidate rule
// impl Default for PRINTER_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3563:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_1A {
//     pub Flags: u32,
//     pub pDescription: windows_sys::core::PSTR,
//     pub pName: windows_sys::core::PSTR,
//     pub pComment: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3571:1: declaration Impl has no candidate rule
// impl Default for PRINTER_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3576:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_1W {
//     pub Flags: u32,
//     pub pDescription: windows_sys::core::PWSTR,
//     pub pName: windows_sys::core::PWSTR,
//     pub pComment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3584:1: declaration Impl has no candidate rule
// impl Default for PRINTER_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3589:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_2A {
//     pub pServerName: windows_sys::core::PSTR,
//     pub pPrinterName: windows_sys::core::PSTR,
//     pub pShareName: windows_sys::core::PSTR,
//     pub pPortName: windows_sys::core::PSTR,
//     pub pDriverName: windows_sys::core::PSTR,
//     pub pComment: windows_sys::core::PSTR,
//     pub pLocation: windows_sys::core::PSTR,
//     pub pDevMode: *mut super::Gdi::DEVMODEA,
//     pub pSepFile: windows_sys::core::PSTR,
//     pub pPrintProcessor: windows_sys::core::PSTR,
//     pub pDatatype: windows_sys::core::PSTR,
//     pub pParameters: windows_sys::core::PSTR,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
//     pub Attributes: u32,
//     pub Priority: u32,
//     pub DefaultPriority: u32,
//     pub StartTime: u32,
//     pub UntilTime: u32,
//     pub Status: u32,
//     pub cJobs: u32,
//     pub AveragePPM: u32,
// }

// UNSUPPORTED Rust 3615:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for PRINTER_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3621:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_2W {
//     pub pServerName: windows_sys::core::PWSTR,
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub pShareName: windows_sys::core::PWSTR,
//     pub pPortName: windows_sys::core::PWSTR,
//     pub pDriverName: windows_sys::core::PWSTR,
//     pub pComment: windows_sys::core::PWSTR,
//     pub pLocation: windows_sys::core::PWSTR,
//     pub pDevMode: *mut super::Gdi::DEVMODEW,
//     pub pSepFile: windows_sys::core::PWSTR,
//     pub pPrintProcessor: windows_sys::core::PWSTR,
//     pub pDatatype: windows_sys::core::PWSTR,
//     pub pParameters: windows_sys::core::PWSTR,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
//     pub Attributes: u32,
//     pub Priority: u32,
//     pub DefaultPriority: u32,
//     pub StartTime: u32,
//     pub UntilTime: u32,
//     pub Status: u32,
//     pub cJobs: u32,
//     pub AveragePPM: u32,
// }

// UNSUPPORTED Rust 3647:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for PRINTER_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3653:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_3 {
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
// }

// UNSUPPORTED Rust 3659:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for PRINTER_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3665:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_4A {
//     pub pPrinterName: windows_sys::core::PSTR,
//     pub pServerName: windows_sys::core::PSTR,
//     pub Attributes: u32,
// }

// UNSUPPORTED Rust 3672:1: declaration Impl has no candidate rule
// impl Default for PRINTER_INFO_4A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3677:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_4W {
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub pServerName: windows_sys::core::PWSTR,
//     pub Attributes: u32,
// }

// UNSUPPORTED Rust 3684:1: declaration Impl has no candidate rule
// impl Default for PRINTER_INFO_4W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_5A {
//     pub pPrinterName: windows_sys::core::PSTR,
//     pub pPortName: windows_sys::core::PSTR,
//     pub Attributes: u32,
//     pub DeviceNotSelectedTimeout: u32,
//     pub TransmissionRetryTimeout: u32,
// }

// UNSUPPORTED Rust 3698:1: declaration Impl has no candidate rule
// impl Default for PRINTER_INFO_5A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3703:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_5W {
//     pub pPrinterName: windows_sys::core::PWSTR,
//     pub pPortName: windows_sys::core::PWSTR,
//     pub Attributes: u32,
//     pub DeviceNotSelectedTimeout: u32,
//     pub TransmissionRetryTimeout: u32,
// }

// UNSUPPORTED Rust 3712:1: declaration Impl has no candidate rule
// impl Default for PRINTER_INFO_5W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3717:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTER_INFO_6 {
//     pub dwStatus: u32,
// }

// UNSUPPORTED Rust 3722:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_7A {
//     pub pszObjectGUID: windows_sys::core::PSTR,
//     pub dwAction: u32,
// }

// UNSUPPORTED Rust 3728:1: declaration Impl has no candidate rule
// impl Default for PRINTER_INFO_7A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3733:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_7W {
//     pub pszObjectGUID: windows_sys::core::PWSTR,
//     pub dwAction: u32,
// }

// UNSUPPORTED Rust 3739:1: declaration Impl has no candidate rule
// impl Default for PRINTER_INFO_7W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3744:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_8A {
//     pub pDevMode: *mut super::Gdi::DEVMODEA,
// }

// UNSUPPORTED Rust 3750:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_INFO_8A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3756:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_8W {
//     pub pDevMode: *mut super::Gdi::DEVMODEW,
// }

// UNSUPPORTED Rust 3762:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_INFO_8W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3768:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_9A {
//     pub pDevMode: *mut super::Gdi::DEVMODEA,
// }

// UNSUPPORTED Rust 3774:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_INFO_9A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3780:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTER_INFO_9W {
//     pub pDevMode: *mut super::Gdi::DEVMODEW,
// }

// UNSUPPORTED Rust 3786:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_INFO_9W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_NOTIFY_CATEGORY_3D`: UInt = 8192u;
public const val `PRINTER_NOTIFY_CATEGORY_ALL`: UInt = 4096u;
public const val `PRINTER_NOTIFY_FIELD_ATTRIBUTES`: UInt = 13u;
public const val `PRINTER_NOTIFY_FIELD_AVERAGE_PPM`: UInt = 21u;
public const val `PRINTER_NOTIFY_FIELD_BRANCH_OFFICE_PRINTING`: UInt = 28u;
public const val `PRINTER_NOTIFY_FIELD_BYTES_PRINTED`: UInt = 25u;
public const val `PRINTER_NOTIFY_FIELD_CJOBS`: UInt = 20u;
public const val `PRINTER_NOTIFY_FIELD_COMMENT`: UInt = 5u;
public const val `PRINTER_NOTIFY_FIELD_DATATYPE`: UInt = 11u;
public const val `PRINTER_NOTIFY_FIELD_DEFAULT_PRIORITY`: UInt = 15u;
public const val `PRINTER_NOTIFY_FIELD_DEVMODE`: UInt = 7u;
public const val `PRINTER_NOTIFY_FIELD_DRIVER_NAME`: UInt = 4u;
public const val `PRINTER_NOTIFY_FIELD_FRIENDLY_NAME`: UInt = 27u;
public const val `PRINTER_NOTIFY_FIELD_LOCATION`: UInt = 6u;
public const val `PRINTER_NOTIFY_FIELD_OBJECT_GUID`: UInt = 26u;
public const val `PRINTER_NOTIFY_FIELD_PAGES_PRINTED`: UInt = 23u;
public const val `PRINTER_NOTIFY_FIELD_PARAMETERS`: UInt = 10u;
public const val `PRINTER_NOTIFY_FIELD_PORT_NAME`: UInt = 3u;
public const val `PRINTER_NOTIFY_FIELD_PRINTER_NAME`: UInt = 1u;
public const val `PRINTER_NOTIFY_FIELD_PRINT_PROCESSOR`: UInt = 9u;
public const val `PRINTER_NOTIFY_FIELD_PRIORITY`: UInt = 14u;
public const val `PRINTER_NOTIFY_FIELD_SECURITY_DESCRIPTOR`: UInt = 12u;
public const val `PRINTER_NOTIFY_FIELD_SEPFILE`: UInt = 8u;
public const val `PRINTER_NOTIFY_FIELD_SERVER_NAME`: UInt = 0u;
public const val `PRINTER_NOTIFY_FIELD_SHARE_NAME`: UInt = 2u;
public const val `PRINTER_NOTIFY_FIELD_START_TIME`: UInt = 16u;
public const val `PRINTER_NOTIFY_FIELD_STATUS`: UInt = 18u;
public const val `PRINTER_NOTIFY_FIELD_STATUS_STRING`: UInt = 19u;
public const val `PRINTER_NOTIFY_FIELD_TOTAL_BYTES`: UInt = 24u;
public const val `PRINTER_NOTIFY_FIELD_TOTAL_PAGES`: UInt = 22u;
public const val `PRINTER_NOTIFY_FIELD_UNTIL_TIME`: UInt = 17u;
// UNSUPPORTED Rust 3823:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_NOTIFY_INFO {
//     pub Version: u32,
//     pub Flags: u32,
//     pub Count: u32,
//     pub aData: [PRINTER_NOTIFY_INFO_DATA; 1],
// }

// UNSUPPORTED Rust 3831:1: declaration Impl has no candidate rule
// impl Default for PRINTER_NOTIFY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3836:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_NOTIFY_INFO_DATA {
//     pub Type: u16,
//     pub Field: u16,
//     pub Reserved: u32,
//     pub Id: u32,
//     pub NotifyData: PRINTER_NOTIFY_INFO_DATA_0,
// }

// UNSUPPORTED Rust 3845:1: declaration Impl has no candidate rule
// impl Default for PRINTER_NOTIFY_INFO_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3850:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PRINTER_NOTIFY_INFO_DATA_0 {
//     pub adwData: [u32; 2],
//     pub Data: PRINTER_NOTIFY_INFO_DATA_0_0,
// }

// UNSUPPORTED Rust 3856:1: declaration Impl has no candidate rule
// impl Default for PRINTER_NOTIFY_INFO_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3861:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_NOTIFY_INFO_DATA_0_0 {
//     pub cbBuf: u32,
//     pub pBuf: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3867:1: declaration Impl has no candidate rule
// impl Default for PRINTER_NOTIFY_INFO_DATA_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_NOTIFY_INFO_DATA_COMPACT`: UInt = 1u;
public const val `PRINTER_NOTIFY_INFO_DISCARDED`: UInt = 1u;
// UNSUPPORTED Rust 3874:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTER_NOTIFY_INIT {
//     pub Size: u32,
//     pub Reserved: u32,
//     pub PollTime: u32,
// }

// UNSUPPORTED Rust 3881:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_NOTIFY_OPTIONS {
//     pub Version: u32,
//     pub Flags: u32,
//     pub Count: u32,
//     pub pTypes: *mut PRINTER_NOTIFY_OPTIONS_TYPE,
// }

// UNSUPPORTED Rust 3889:1: declaration Impl has no candidate rule
// impl Default for PRINTER_NOTIFY_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_NOTIFY_OPTIONS_REFRESH`: UInt = 1u;
// UNSUPPORTED Rust 3895:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTER_NOTIFY_OPTIONS_TYPE {
//     pub Type: u16,
//     pub Reserved0: u16,
//     pub Reserved1: u32,
//     pub Reserved2: u32,
//     pub Count: u32,
//     pub pFields: *mut u16,
// }

// UNSUPPORTED Rust 3905:1: declaration Impl has no candidate rule
// impl Default for PRINTER_NOTIFY_OPTIONS_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_NOTIFY_STATUS_ENDPOINT`: UInt = 1u;
public const val `PRINTER_NOTIFY_STATUS_INFO`: UInt = 4u;
public const val `PRINTER_NOTIFY_STATUS_POLL`: UInt = 2u;
public const val `PRINTER_NOTIFY_TYPE`: UInt = 0u;
public const val `PRINTER_OEMINTF_VERSION`: UInt = 65536u;
// UNSUPPORTED Rust 3915:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTER_OPTIONSA {
//     pub cbSize: u32,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 3921:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTER_OPTIONSW {
//     pub cbSize: u32,
//     pub dwFlags: u32,
// }

public const val `PRINTER_OPTION_CACHE`: `PRINTER_OPTION_FLAGS` = 2;
public const val `PRINTER_OPTION_CLIENT_CHANGE`: `PRINTER_OPTION_FLAGS` = 4;
public typealias `PRINTER_OPTION_FLAGS` = Int;
public const val `PRINTER_OPTION_NO_CACHE`: `PRINTER_OPTION_FLAGS` = 1;
public const val `PRINTER_OPTION_NO_CLIENT_DATA`: `PRINTER_OPTION_FLAGS` = 8;
public const val `PRINTER_READ`: `PRINTER_ACCESS_RIGHTS` = 131080u;
public const val `PRINTER_READ_CONTROL`: `PRINTER_ACCESS_RIGHTS` = 131072u;
public const val `PRINTER_STANDARD_RIGHTS_EXECUTE`: `PRINTER_ACCESS_RIGHTS` = 131072u;
public const val `PRINTER_STANDARD_RIGHTS_READ`: `PRINTER_ACCESS_RIGHTS` = 131072u;
public const val `PRINTER_STANDARD_RIGHTS_REQUIRED`: `PRINTER_ACCESS_RIGHTS` = 983040u;
public const val `PRINTER_STANDARD_RIGHTS_WRITE`: `PRINTER_ACCESS_RIGHTS` = 131072u;
public const val `PRINTER_STATUS_BUSY`: UInt = 512u;
public const val `PRINTER_STATUS_DOOR_OPEN`: UInt = 4194304u;
public const val `PRINTER_STATUS_DRIVER_UPDATE_NEEDED`: UInt = 67108864u;
public const val `PRINTER_STATUS_ERROR`: UInt = 2u;
public const val `PRINTER_STATUS_INITIALIZING`: UInt = 32768u;
public const val `PRINTER_STATUS_IO_ACTIVE`: UInt = 256u;
public const val `PRINTER_STATUS_MANUAL_FEED`: UInt = 32u;
public const val `PRINTER_STATUS_NOT_AVAILABLE`: UInt = 4096u;
public const val `PRINTER_STATUS_NO_TONER`: UInt = 262144u;
public const val `PRINTER_STATUS_OFFLINE`: UInt = 128u;
public const val `PRINTER_STATUS_OUTPUT_BIN_FULL`: UInt = 2048u;
public const val `PRINTER_STATUS_OUT_OF_MEMORY`: UInt = 2097152u;
public const val `PRINTER_STATUS_PAGE_PUNT`: UInt = 524288u;
public const val `PRINTER_STATUS_PAPER_JAM`: UInt = 8u;
public const val `PRINTER_STATUS_PAPER_OUT`: UInt = 16u;
public const val `PRINTER_STATUS_PAPER_PROBLEM`: UInt = 64u;
public const val `PRINTER_STATUS_PAUSED`: UInt = 1u;
public const val `PRINTER_STATUS_PENDING_DELETION`: UInt = 4u;
public const val `PRINTER_STATUS_POWER_SAVE`: UInt = 16777216u;
public const val `PRINTER_STATUS_PRINTING`: UInt = 1024u;
public const val `PRINTER_STATUS_PROCESSING`: UInt = 16384u;
public const val `PRINTER_STATUS_SERVER_OFFLINE`: UInt = 33554432u;
public const val `PRINTER_STATUS_SERVER_UNKNOWN`: UInt = 8388608u;
public const val `PRINTER_STATUS_TONER_LOW`: UInt = 131072u;
public const val `PRINTER_STATUS_USER_INTERVENTION`: UInt = 1048576u;
public const val `PRINTER_STATUS_WAITING`: UInt = 8192u;
public const val `PRINTER_STATUS_WARMING_UP`: UInt = 65536u;
public const val `PRINTER_SYNCHRONIZE`: `PRINTER_ACCESS_RIGHTS` = 1048576u;
public const val `PRINTER_WRITE`: `PRINTER_ACCESS_RIGHTS` = 131080u;
public const val `PRINTER_WRITE_DAC`: `PRINTER_ACCESS_RIGHTS` = 262144u;
public const val `PRINTER_WRITE_OWNER`: `PRINTER_ACCESS_RIGHTS` = 524288u;
// UNSUPPORTED Rust 3969:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTIFI32 {
//     pub cjThis: u32,
//     pub cjIfiExtra: u32,
//     pub dpwszFamilyName: i32,
//     pub dpwszStyleName: i32,
//     pub dpwszFaceName: i32,
//     pub dpwszUniqueName: i32,
//     pub dpFontSim: i32,
//     pub lEmbedId: i32,
//     pub lItalicAngle: i32,
//     pub lCharBias: i32,
//     pub dpCharSets: i32,
//     pub jWinCharSet: u8,
//     pub jWinPitchAndFamily: u8,
//     pub usWinWeight: u16,
//     pub flInfo: u32,
//     pub fsSelection: u16,
//     pub fsType: u16,
//     pub fwdUnitsPerEm: i16,
//     pub fwdLowestPPEm: i16,
//     pub fwdWinAscender: i16,
//     pub fwdWinDescender: i16,
//     pub fwdMacAscender: i16,
//     pub fwdMacDescender: i16,
//     pub fwdMacLineGap: i16,
//     pub fwdTypoAscender: i16,
//     pub fwdTypoDescender: i16,
//     pub fwdTypoLineGap: i16,
//     pub fwdAveCharWidth: i16,
//     pub fwdMaxCharInc: i16,
//     pub fwdCapHeight: i16,
//     pub fwdXHeight: i16,
//     pub fwdSubscriptXSize: i16,
//     pub fwdSubscriptYSize: i16,
//     pub fwdSubscriptXOffset: i16,
//     pub fwdSubscriptYOffset: i16,
//     pub fwdSuperscriptXSize: i16,
//     pub fwdSuperscriptYSize: i16,
//     pub fwdSuperscriptXOffset: i16,
//     pub fwdSuperscriptYOffset: i16,
//     pub fwdUnderscoreSize: i16,
//     pub fwdUnderscorePosition: i16,
//     pub fwdStrikeoutSize: i16,
//     pub fwdStrikeoutPosition: i16,
//     pub chFirstChar: u8,
//     pub chLastChar: u8,
//     pub chDefaultChar: u8,
//     pub chBreakChar: u8,
//     pub wcFirstChar: u16,
//     pub wcLastChar: u16,
//     pub wcDefaultChar: u16,
//     pub wcBreakChar: u16,
//     pub ptlBaseline: super::super::Foundation::POINTL,
//     pub ptlAspect: super::super::Foundation::POINTL,
//     pub ptlCaret: super::super::Foundation::POINTL,
//     pub rclFontBox: super::super::Foundation::RECTL,
//     pub achVendId: [u8; 4],
//     pub cKerningPairs: u32,
//     pub ulPanoseCulture: u32,
//     pub panose: super::Gdi::PANOSE,
// }

// UNSUPPORTED Rust 4033:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTIFI32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4039:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTPROCESSOROPENDATA {
//     pub pDevMode: *mut super::Gdi::DEVMODEA,
//     pub pDatatype: windows_sys::core::PWSTR,
//     pub pParameters: windows_sys::core::PWSTR,
//     pub pDocumentName: windows_sys::core::PWSTR,
//     pub JobId: u32,
//     pub pOutputFile: windows_sys::core::PWSTR,
//     pub pPrinterName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4051:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTPROCESSOROPENDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4057:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTPROCESSOR_CAPS_1 {
//     pub dwLevel: u32,
//     pub dwNupOptions: u32,
//     pub dwPageOrderFlags: u32,
//     pub dwNumberOfCopies: u32,
// }

// UNSUPPORTED Rust 4065:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTPROCESSOR_CAPS_2 {
//     pub dwLevel: u32,
//     pub dwNupOptions: u32,
//     pub dwPageOrderFlags: u32,
//     pub dwNumberOfCopies: u32,
//     pub dwDuplexHandlingCaps: u32,
//     pub dwNupDirectionCaps: u32,
//     pub dwNupBorderCaps: u32,
//     pub dwBookletHandlingCaps: u32,
//     pub dwScalingCaps: u32,
// }

// UNSUPPORTED Rust 4078:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTPROCESSOR_INFO_1A {
//     pub pName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 4083:1: declaration Impl has no candidate rule
// impl Default for PRINTPROCESSOR_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4088:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINTPROCESSOR_INFO_1W {
//     pub pName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4093:1: declaration Impl has no candidate rule
// impl Default for PRINTPROCESSOR_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4098:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTPROVIDOR {
//     pub fpOpenPrinter: isize,
//     pub fpSetJob: isize,
//     pub fpGetJob: isize,
//     pub fpEnumJobs: isize,
//     pub fpAddPrinter: isize,
//     pub fpDeletePrinter: isize,
//     pub fpSetPrinter: isize,
//     pub fpGetPrinter: isize,
//     pub fpEnumPrinters: isize,
//     pub fpAddPrinterDriver: isize,
//     pub fpEnumPrinterDrivers: isize,
//     pub fpGetPrinterDriver: isize,
//     pub fpGetPrinterDriverDirectory: isize,
//     pub fpDeletePrinterDriver: isize,
//     pub fpAddPrintProcessor: isize,
//     pub fpEnumPrintProcessors: isize,
//     pub fpGetPrintProcessorDirectory: isize,
//     pub fpDeletePrintProcessor: isize,
//     pub fpEnumPrintProcessorDatatypes: isize,
//     pub fpStartDocPrinter: isize,
//     pub fpStartPagePrinter: isize,
//     pub fpWritePrinter: isize,
//     pub fpEndPagePrinter: isize,
//     pub fpAbortPrinter: isize,
//     pub fpReadPrinter: isize,
//     pub fpEndDocPrinter: isize,
//     pub fpAddJob: isize,
//     pub fpScheduleJob: isize,
//     pub fpGetPrinterData: isize,
//     pub fpSetPrinterData: isize,
//     pub fpWaitForPrinterChange: isize,
//     pub fpClosePrinter: isize,
//     pub fpAddForm: isize,
//     pub fpDeleteForm: isize,
//     pub fpGetForm: isize,
//     pub fpSetForm: isize,
//     pub fpEnumForms: isize,
//     pub fpEnumMonitors: isize,
//     pub fpEnumPorts: isize,
//     pub fpAddPort: isize,
//     pub fpConfigurePort: isize,
//     pub fpDeletePort: isize,
//     pub fpCreatePrinterIC: isize,
//     pub fpPlayGdiScriptOnPrinterIC: isize,
//     pub fpDeletePrinterIC: isize,
//     pub fpAddPrinterConnection: isize,
//     pub fpDeletePrinterConnection: isize,
//     pub fpPrinterMessageBox: isize,
//     pub fpAddMonitor: isize,
//     pub fpDeleteMonitor: isize,
//     pub fpResetPrinter: isize,
//     pub fpGetPrinterDriverEx: isize,
//     pub fpFindFirstPrinterChangeNotification: isize,
//     pub fpFindClosePrinterChangeNotification: isize,
//     pub fpAddPortEx: isize,
//     pub fpShutDown: isize,
//     pub fpRefreshPrinterChangeNotification: isize,
//     pub fpOpenPrinterEx: isize,
//     pub fpAddPrinterEx: isize,
//     pub fpSetPort: isize,
//     pub fpEnumPrinterData: isize,
//     pub fpDeletePrinterData: isize,
//     pub fpClusterSplOpen: isize,
//     pub fpClusterSplClose: isize,
//     pub fpClusterSplIsAlive: isize,
//     pub fpSetPrinterDataEx: isize,
//     pub fpGetPrinterDataEx: isize,
//     pub fpEnumPrinterDataEx: isize,
//     pub fpEnumPrinterKey: isize,
//     pub fpDeletePrinterDataEx: isize,
//     pub fpDeletePrinterKey: isize,
//     pub fpSeekPrinter: isize,
//     pub fpDeletePrinterDriverEx: isize,
//     pub fpAddPerMachineConnection: isize,
//     pub fpDeletePerMachineConnection: isize,
//     pub fpEnumPerMachineConnections: isize,
//     pub fpXcvData: isize,
//     pub fpAddPrinterDriverEx: isize,
//     pub fpSplReadPrinter: isize,
//     pub fpDriverUnloadComplete: isize,
//     pub fpGetSpoolFileInfo: isize,
//     pub fpCommitSpoolData: isize,
//     pub fpCloseSpoolFileHandle: isize,
//     pub fpFlushPrinter: isize,
//     pub fpSendRecvBidiData: isize,
//     pub fpAddPrinterConnection2: isize,
//     pub fpGetPrintClassObject: isize,
//     pub fpReportJobProcessingProgress: isize,
//     pub fpEnumAndLogProvidorObjects: isize,
//     pub fpInternalGetPrinterDriver: isize,
//     pub fpFindCompatibleDriver: isize,
//     pub fpInstallPrinterDriverPackageFromConnection: isize,
//     pub fpGetJobNamedPropertyValue: isize,
//     pub fpSetJobNamedProperty: isize,
//     pub fpDeleteJobNamedProperty: isize,
//     pub fpEnumJobNamedProperties: isize,
//     pub fpPowerEvent: isize,
//     pub fpGetUserPropertyBag: isize,
//     pub fpCanShutdown: isize,
//     pub fpLogJobInfoForBranchOffice: isize,
//     pub fpRegeneratePrintDeviceCapabilities: isize,
//     pub fpPrintSupportOperation: isize,
//     pub fpIppCreateJobOnPrinter: isize,
//     pub fpIppGetJobAttributes: isize,
//     pub fpIppSetJobAttributes: isize,
//     pub fpIppGetPrinterAttributes: isize,
//     pub fpIppSetPrinterAttributes: isize,
//     pub fpIppCreateJobOnPrinterWithAttributes: isize,
// }

// UNSUPPORTED Rust 4210:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PRINT_APP_BIDI_NOTIFY_CHANNEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2abad223_b994_4aca_82fc_4571b1b585ac);

public typealias `PRINT_EXECUTION_CONTEXT` = Int;
public const val `PRINT_EXECUTION_CONTEXT_APPLICATION`: `PRINT_EXECUTION_CONTEXT` = 0;
public const val `PRINT_EXECUTION_CONTEXT_FILTER_PIPELINE`: `PRINT_EXECUTION_CONTEXT` = 3;
public const val `PRINT_EXECUTION_CONTEXT_SPOOLER_ISOLATION_HOST`: `PRINT_EXECUTION_CONTEXT` = 2;
public const val `PRINT_EXECUTION_CONTEXT_SPOOLER_SERVICE`: `PRINT_EXECUTION_CONTEXT` = 1;
public const val `PRINT_EXECUTION_CONTEXT_WOW64`: `PRINT_EXECUTION_CONTEXT` = 4;
// UNSUPPORTED Rust 4217:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINT_EXECUTION_DATA {
//     pub context: PRINT_EXECUTION_CONTEXT,
//     pub clientAppPID: u32,
// }

// UNSUPPORTED Rust 4223:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRINT_FEATURE_OPTION {
//     pub pszFeature: windows_sys::core::PCSTR,
//     pub pszOption: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4229:1: declaration Impl has no candidate rule
// impl Default for PRINT_FEATURE_OPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4234:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PRINT_PORT_MONITOR_NOTIFY_CHANNEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25df3b0e_74a9_47f5_80ce_79b4b1eb5c58);

// UNSUPPORTED Rust 4235:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct PROPSHEETUI_GETICON_INFO {
//     pub cbSize: u16,
//     pub Flags: u16,
//     pub cxIcon: u16,
//     pub cyIcon: u16,
//     pub hIcon: super::super::UI::WindowsAndMessaging::HICON,
// }

// UNSUPPORTED Rust 4245:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for PROPSHEETUI_GETICON_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROPSHEETUI_INFO {
//     pub cbSize: u16,
//     pub Version: u16,
//     pub Flags: u16,
//     pub Reason: u16,
//     pub hComPropSheet: super::super::Foundation::HANDLE,
//     pub pfnComPropSheet: PFNCOMPROPSHEET,
//     pub lParamInit: super::super::Foundation::LPARAM,
//     pub UserData: usize,
//     pub Result: usize,
// }

// UNSUPPORTED Rust 4264:1: declaration Impl has no candidate rule
// impl Default for PROPSHEETUI_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4269:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct PROPSHEETUI_INFO_HEADER {
//     pub cbSize: u16,
//     pub Flags: u16,
//     pub pTitle: *mut i8,
//     pub hWndParent: super::super::Foundation::HWND,
//     pub hInst: super::super::Foundation::HINSTANCE,
//     pub Anonymous: PROPSHEETUI_INFO_HEADER_0,
// }

// UNSUPPORTED Rust 4280:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for PROPSHEETUI_INFO_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4286:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union PROPSHEETUI_INFO_HEADER_0 {
//     pub hIcon: super::super::UI::WindowsAndMessaging::HICON,
//     pub IconID: usize,
// }

// UNSUPPORTED Rust 4293:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for PROPSHEETUI_INFO_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROPSHEETUI_INFO_VERSION`: UInt = 256u;
public const val `PROPSHEETUI_REASON_BEFORE_INIT`: UInt = 5u;
public const val `PROPSHEETUI_REASON_DESTROY`: UInt = 2u;
public const val `PROPSHEETUI_REASON_GET_ICON`: UInt = 4u;
public const val `PROPSHEETUI_REASON_GET_INFO_HEADER`: UInt = 1u;
public const val `PROPSHEETUI_REASON_INIT`: UInt = 0u;
public const val `PROPSHEETUI_REASON_SET_RESULT`: UInt = 3u;
public const val `PROTOCOL_LPR_TYPE`: UInt = 2u;
public const val `PROTOCOL_RAWTCP_TYPE`: UInt = 1u;
public const val `PROTOCOL_UNKNOWN_TYPE`: UInt = 0u;
// UNSUPPORTED Rust 4309:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROVIDOR_INFO_1A {
//     pub pName: windows_sys::core::PSTR,
//     pub pEnvironment: windows_sys::core::PSTR,
//     pub pDLLName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 4316:1: declaration Impl has no candidate rule
// impl Default for PROVIDOR_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROVIDOR_INFO_1W {
//     pub pName: windows_sys::core::PWSTR,
//     pub pEnvironment: windows_sys::core::PWSTR,
//     pub pDLLName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4328:1: declaration Impl has no candidate rule
// impl Default for PROVIDOR_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4333:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROVIDOR_INFO_2A {
//     pub pOrder: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 4338:1: declaration Impl has no candidate rule
// impl Default for PROVIDOR_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4343:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROVIDOR_INFO_2W {
//     pub pOrder: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4348:1: declaration Impl has no candidate rule
// impl Default for PROVIDOR_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PSCRIPT5_PRIVATE_DEVMODE {
//     pub wReserved: [u16; 57],
//     pub wSize: u16,
// }

// UNSUPPORTED Rust 4359:1: declaration Impl has no candidate rule
// impl Default for PSCRIPT5_PRIVATE_DEVMODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4364:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PSPINFO {
//     pub cbSize: u16,
//     pub wReserved: u16,
//     pub hComPropSheet: super::super::Foundation::HANDLE,
//     pub hCPSUIPage: super::super::Foundation::HANDLE,
//     pub pfnComPropSheet: PFNCOMPROPSHEET,
// }

// UNSUPPORTED Rust 4373:1: declaration Impl has no candidate rule
// impl Default for PSPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PSUIHDRF_DEFTITLE`: UInt = 16u;
public const val `PSUIHDRF_EXACT_PTITLE`: UInt = 32u;
public const val `PSUIHDRF_NOAPPLYNOW`: UInt = 2u;
public const val `PSUIHDRF_OBSOLETE`: UInt = 1u;
public const val `PSUIHDRF_PROPTITLE`: UInt = 4u;
public const val `PSUIHDRF_USEHICON`: UInt = 8u;
public const val `PSUIINFO_UNICODE`: UInt = 1u;
public const val `PSUIPAGEINSERT_DLL`: UInt = 5u;
public const val `PSUIPAGEINSERT_GROUP_PARENT`: UInt = 0u;
public const val `PSUIPAGEINSERT_HPROPSHEETPAGE`: UInt = 4u;
public const val `PSUIPAGEINSERT_PCOMPROPSHEETUI`: UInt = 1u;
public const val `PSUIPAGEINSERT_PFNPROPSHEETUI`: UInt = 2u;
public const val `PSUIPAGEINSERT_PROPSHEETPAGE`: UInt = 3u;
public const val `PTSHIM_DEFAULT`: `SHIMOPTS` = 0;
public const val `PTSHIM_NOSNAPSHOT`: `SHIMOPTS` = 1;
// UNSUPPORTED Rust 4393:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PUBLISHERINFO {
//     pub dwMode: u32,
//     pub wMinoutlinePPEM: u16,
//     pub wMaxbitmapPPEM: u16,
// }

public const val `PUSHBUTTON_TYPE_CALLBACK`: UInt = 1u;
public const val `PUSHBUTTON_TYPE_DLGPROC`: UInt = 0u;
public const val `PUSHBUTTON_TYPE_HTCLRADJ`: UInt = 2u;
public const val `PUSHBUTTON_TYPE_HTSETUP`: UInt = 3u;
public typealias `PageCountType` = Int;
public typealias `PrintAsyncNotifyConversationStyle` = Int;
public typealias `PrintAsyncNotifyError` = Int;
public typealias `PrintAsyncNotifyUserFilter` = Int;
public typealias `PrintJobStatus` = Int;
public const val `PrintJobStatus_BlockedDeviceQueue`: `PrintJobStatus` = 512;
public const val `PrintJobStatus_Complete`: `PrintJobStatus` = 4096;
public const val `PrintJobStatus_Deleted`: `PrintJobStatus` = 256;
public const val `PrintJobStatus_Deleting`: `PrintJobStatus` = 4;
public const val `PrintJobStatus_Error`: `PrintJobStatus` = 2;
public const val `PrintJobStatus_Offline`: `PrintJobStatus` = 32;
public const val `PrintJobStatus_PaperOut`: `PrintJobStatus` = 64;
public const val `PrintJobStatus_Paused`: `PrintJobStatus` = 1;
public const val `PrintJobStatus_Printed`: `PrintJobStatus` = 128;
public const val `PrintJobStatus_Printing`: `PrintJobStatus` = 16;
public const val `PrintJobStatus_Restarted`: `PrintJobStatus` = 2048;
public const val `PrintJobStatus_Retained`: `PrintJobStatus` = 8192;
public const val `PrintJobStatus_Spooling`: `PrintJobStatus` = 8;
public const val `PrintJobStatus_UserIntervention`: `PrintJobStatus` = 1024;
// UNSUPPORTED Rust 4423:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PrintNamedProperty {
//     pub propertyName: windows_sys::core::PWSTR,
//     pub propertyValue: PrintPropertyValue,
// }

// UNSUPPORTED Rust 4429:1: declaration Impl has no candidate rule
// impl Default for PrintNamedProperty {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4434:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PrintPropertiesCollection {
//     pub numberOfProperties: u32,
//     pub propertiesCollection: *mut PrintNamedProperty,
// }

// UNSUPPORTED Rust 4440:1: declaration Impl has no candidate rule
// impl Default for PrintPropertiesCollection {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4445:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PrintPropertyValue {
//     pub ePropertyType: EPrintPropertyType,
//     pub value: PrintPropertyValue_0,
// }

// UNSUPPORTED Rust 4451:1: declaration Impl has no candidate rule
// impl Default for PrintPropertyValue {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4456:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PrintPropertyValue_0 {
//     pub propertyByte: u8,
//     pub propertyString: windows_sys::core::PWSTR,
//     pub propertyInt32: i32,
//     pub propertyInt64: i64,
//     pub propertyBlob: PrintPropertyValue_0_0,
// }

// UNSUPPORTED Rust 4465:1: declaration Impl has no candidate rule
// impl Default for PrintPropertyValue_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4470:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PrintPropertyValue_0_0 {
//     pub cbBuf: u32,
//     pub pBuf: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4476:1: declaration Impl has no candidate rule
// impl Default for PrintPropertyValue_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PrintSchemaAsyncOperation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43b2f83d_10f2_48ab_831b_55fdbdbd34a4);

public typealias `PrintSchemaConstrainedSetting` = Int;
public const val `PrintSchemaConstrainedSetting_Admin`: `PrintSchemaConstrainedSetting` = 2;
public const val `PrintSchemaConstrainedSetting_Device`: `PrintSchemaConstrainedSetting` = 3;
public const val `PrintSchemaConstrainedSetting_None`: `PrintSchemaConstrainedSetting` = 0;
public const val `PrintSchemaConstrainedSetting_PrintTicket`: `PrintSchemaConstrainedSetting` = 1;
public typealias `PrintSchemaParameterDataType` = Int;
public const val `PrintSchemaParameterDataType_Integer`: `PrintSchemaParameterDataType` = 0;
public const val `PrintSchemaParameterDataType_NumericString`: `PrintSchemaParameterDataType` = 1;
public const val `PrintSchemaParameterDataType_String`: `PrintSchemaParameterDataType` = 2;
public typealias `PrintSchemaSelectionType` = Int;
public const val `PrintSchemaSelectionType_PickMany`: `PrintSchemaSelectionType` = 1;
public const val `PrintSchemaSelectionType_PickOne`: `PrintSchemaSelectionType` = 0;
// UNSUPPORTED Rust 4494:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PrinterExtensionManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x331b60da_9e90_4dd0_9c84_eac4e659b61f);

// UNSUPPORTED Rust 4495:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PrinterQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb54c230_798c_4c9e_b461_29fad04039b1);

// UNSUPPORTED Rust 4496:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PrinterQueueView: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb54c231_798c_4c9e_b461_29fad04039b1);

public const val `QCP_DEVICEPROFILE`: UInt = 0u;
public const val `QCP_PROFILEDISK`: UInt = 2u;
public const val `QCP_PROFILEMEMORY`: UInt = 1u;
public const val `QCP_SOURCEPROFILE`: UInt = 1u;
public const val `RAWTCP`: UInt = 1u;
public const val `REMOTE_ONLY_REGISTRATION`: `PrintAsyncNotifyError` = 24;
public const val `REVERSE_PAGES_FOR_REVERSE_DUPLEX`: UInt = 1u;
public const val `REVERSE_PRINT`: UInt = 1u;
public const val `RIGHT_THEN_DOWN`: UInt = 1u;
// UNSUPPORTED Rust 4506:1: generic scalar type unsupported
// pub type ROUTER_NOTIFY_CALLBACK = Option<unsafe extern "system" fn(dwcommand: u32, pcontext: *const core::ffi::c_void, dwcolor: u32, pnofityinfo: *const PRINTER_NOTIFY_INFO, fdwflags: u32, pdwresult: *mut u32) -> windows_sys::core::BOOL>;

public const val `ROUTER_STOP_ROUTING`: UInt = 2u;
public const val `ROUTER_SUCCESS`: UInt = 1u;
public const val `ROUTER_UNKNOWN`: UInt = 0u;
public const val `SERVER_ACCESS_ADMINISTER`: `PRINTER_ACCESS_RIGHTS` = 1u;
public const val `SERVER_ACCESS_ENUMERATE`: `PRINTER_ACCESS_RIGHTS` = 2u;
public const val `SERVER_ALL_ACCESS`: `PRINTER_ACCESS_RIGHTS` = 983043u;
public const val `SERVER_EXECUTE`: `PRINTER_ACCESS_RIGHTS` = 131074u;
public const val `SERVER_NOTIFY_FIELD_PRINT_DRIVER_ISOLATION_GROUP`: UInt = 0u;
public const val `SERVER_NOTIFY_TYPE`: UInt = 2u;
public const val `SERVER_READ`: `PRINTER_ACCESS_RIGHTS` = 131074u;
public const val `SERVER_WRITE`: `PRINTER_ACCESS_RIGHTS` = 131075u;
public const val `SETOPTIONS_FLAG_KEEP_CONFLICT`: UInt = 2u;
public const val `SETOPTIONS_FLAG_RESOLVE_CONFLICT`: UInt = 1u;
public const val `SETOPTIONS_RESULT_CONFLICT_REMAINED`: UInt = 2u;
public const val `SETOPTIONS_RESULT_CONFLICT_RESOLVED`: UInt = 1u;
public const val `SETOPTIONS_RESULT_NO_CONFLICT`: UInt = 0u;
// UNSUPPORTED Rust 4523:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SETRESULT_INFO {
//     pub cbSize: u16,
//     pub wReserved: u16,
//     pub hSetResult: super::super::Foundation::HANDLE,
//     pub Result: super::super::Foundation::LRESULT,
// }

// UNSUPPORTED Rust 4531:1: declaration Impl has no candidate rule
// impl Default for SETRESULT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SHIMOPTS` = Int;
// UNSUPPORTED Rust 4537:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SHOWUIPARAMS {
//     pub UIType: UI_TYPE,
//     pub MessageBoxParams: MESSAGEBOX_PARAMS,
// }

// UNSUPPORTED Rust 4543:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SIMULATE_CAPS_1 {
//     pub dwLevel: u32,
//     pub dwPageOrderFlags: u32,
//     pub dwNumberOfCopies: u32,
//     pub dwCollate: u32,
//     pub dwNupOptions: u32,
// }

// UNSUPPORTED Rust 4552:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SPLCLIENT_INFO_1 {
//     pub dwSize: u32,
//     pub pMachineName: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub dwBuildNum: u32,
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
//     pub wProcessorArchitecture: u16,
// }

// UNSUPPORTED Rust 4563:1: declaration Impl has no candidate rule
// impl Default for SPLCLIENT_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4568:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SPLCLIENT_INFO_2_W2K {
//     pub hSplPrinter: usize,
// }

// UNSUPPORTED Rust 4573:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct SPLCLIENT_INFO_2_WINXP {
//     pub hSplPrinter: u32,
// }

// UNSUPPORTED Rust 4579:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct SPLCLIENT_INFO_2_WINXP {
//     pub hSplPrinter: u64,
// }

// UNSUPPORTED Rust 4585:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SPLCLIENT_INFO_3_VISTA {
//     pub cbSize: u32,
//     pub dwFlags: u32,
//     pub dwSize: u32,
//     pub pMachineName: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub dwBuildNum: u32,
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
//     pub wProcessorArchitecture: u16,
//     pub hSplPrinter: u64,
// }

// UNSUPPORTED Rust 4599:1: declaration Impl has no candidate rule
// impl Default for SPLCLIENT_INFO_3_VISTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SPLCLIENT_INFO_INTERNAL {
//     pub cbSize: u32,
//     pub dwFlags: u32,
//     pub dwSize: u32,
//     pub pMachineName: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub dwBuildNum: u32,
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
//     pub wProcessorArchitecture: u16,
//     pub hSplPrinter: u64,
//     pub dwProcessId: u32,
//     pub dwSessionId: u32,
// }

// UNSUPPORTED Rust 4620:1: declaration Impl has no candidate rule
// impl Default for SPLCLIENT_INFO_INTERNAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SPLCLIENT_INFO_INTERNAL_LEVEL`: UInt = 100u;
// UNSUPPORTED Rust 4626:1: non-scalar type Ptr unsupported
// pub const SPLDS_ASSET_NUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("assetNumber");

// UNSUPPORTED Rust 4627:1: non-scalar type Ptr unsupported
// pub const SPLDS_BYTES_PER_MINUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("bytesPerMinute");

// UNSUPPORTED Rust 4628:1: non-scalar type Ptr unsupported
// pub const SPLDS_DESCRIPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("description");

// UNSUPPORTED Rust 4629:1: non-scalar type Ptr unsupported
// pub const SPLDS_DRIVER_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("DsDriver");

// UNSUPPORTED Rust 4630:1: non-scalar type Ptr unsupported
// pub const SPLDS_DRIVER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("driverName");

// UNSUPPORTED Rust 4631:1: non-scalar type Ptr unsupported
// pub const SPLDS_DRIVER_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("driverVersion");

// UNSUPPORTED Rust 4632:1: non-scalar type Ptr unsupported
// pub const SPLDS_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("flags");

// UNSUPPORTED Rust 4633:1: non-scalar type Ptr unsupported
// pub const SPLDS_LOCATION: windows_sys::core::PCWSTR = windows_sys::core::w!("location");

// UNSUPPORTED Rust 4634:1: non-scalar type Ptr unsupported
// pub const SPLDS_PORT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("portName");

// UNSUPPORTED Rust 4635:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINTER_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("printQueue");

// UNSUPPORTED Rust 4636:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINTER_LOCATIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("printerLocations");

// UNSUPPORTED Rust 4637:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINTER_MODEL: windows_sys::core::PCWSTR = windows_sys::core::w!("printerModel");

// UNSUPPORTED Rust 4638:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINTER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("printerName");

// UNSUPPORTED Rust 4639:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINTER_NAME_ALIASES: windows_sys::core::PCWSTR = windows_sys::core::w!("printerNameAliases");

// UNSUPPORTED Rust 4640:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_ATTRIBUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("printAttributes");

// UNSUPPORTED Rust 4641:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_BIN_NAMES: windows_sys::core::PCWSTR = windows_sys::core::w!("printBinNames");

// UNSUPPORTED Rust 4642:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_COLLATE: windows_sys::core::PCWSTR = windows_sys::core::w!("printCollate");

// UNSUPPORTED Rust 4643:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_COLOR: windows_sys::core::PCWSTR = windows_sys::core::w!("printColor");

// UNSUPPORTED Rust 4644:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_DUPLEX_SUPPORTED: windows_sys::core::PCWSTR = windows_sys::core::w!("printDuplexSupported");

// UNSUPPORTED Rust 4645:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_END_TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("printEndTime");

// UNSUPPORTED Rust 4646:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_KEEP_PRINTED_JOBS: windows_sys::core::PCWSTR = windows_sys::core::w!("printKeepPrintedJobs");

// UNSUPPORTED Rust 4647:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_LANGUAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("printLanguage");

// UNSUPPORTED Rust 4648:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_MAC_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("printMACAddress");

// UNSUPPORTED Rust 4649:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_MAX_RESOLUTION_SUPPORTED: windows_sys::core::PCWSTR = windows_sys::core::w!("printMaxResolutionSupported");

// UNSUPPORTED Rust 4650:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_MAX_X_EXTENT: windows_sys::core::PCWSTR = windows_sys::core::w!("printMaxXExtent");

// UNSUPPORTED Rust 4651:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_MAX_Y_EXTENT: windows_sys::core::PCWSTR = windows_sys::core::w!("printMaxYExtent");

// UNSUPPORTED Rust 4652:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_MEDIA_READY: windows_sys::core::PCWSTR = windows_sys::core::w!("printMediaReady");

// UNSUPPORTED Rust 4653:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_MEDIA_SUPPORTED: windows_sys::core::PCWSTR = windows_sys::core::w!("printMediaSupported");

// UNSUPPORTED Rust 4654:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_MEMORY: windows_sys::core::PCWSTR = windows_sys::core::w!("printMemory");

// UNSUPPORTED Rust 4655:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_MIN_X_EXTENT: windows_sys::core::PCWSTR = windows_sys::core::w!("printMinXExtent");

// UNSUPPORTED Rust 4656:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_MIN_Y_EXTENT: windows_sys::core::PCWSTR = windows_sys::core::w!("printMinYExtent");

// UNSUPPORTED Rust 4657:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_NETWORK_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("printNetworkAddress");

// UNSUPPORTED Rust 4658:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_NOTIFY: windows_sys::core::PCWSTR = windows_sys::core::w!("printNotify");

// UNSUPPORTED Rust 4659:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_NUMBER_UP: windows_sys::core::PCWSTR = windows_sys::core::w!("printNumberUp");

// UNSUPPORTED Rust 4660:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_ORIENTATIONS_SUPPORTED: windows_sys::core::PCWSTR = windows_sys::core::w!("printOrientationsSupported");

// UNSUPPORTED Rust 4661:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_OWNER: windows_sys::core::PCWSTR = windows_sys::core::w!("printOwner");

// UNSUPPORTED Rust 4662:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_PAGES_PER_MINUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("printPagesPerMinute");

// UNSUPPORTED Rust 4663:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_RATE: windows_sys::core::PCWSTR = windows_sys::core::w!("printRate");

// UNSUPPORTED Rust 4664:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_RATE_UNIT: windows_sys::core::PCWSTR = windows_sys::core::w!("printRateUnit");

// UNSUPPORTED Rust 4665:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_SEPARATOR_FILE: windows_sys::core::PCWSTR = windows_sys::core::w!("printSeparatorFile");

// UNSUPPORTED Rust 4666:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_SHARE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("printShareName");

// UNSUPPORTED Rust 4667:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_SPOOLING: windows_sys::core::PCWSTR = windows_sys::core::w!("printSpooling");

// UNSUPPORTED Rust 4668:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_STAPLING_SUPPORTED: windows_sys::core::PCWSTR = windows_sys::core::w!("printStaplingSupported");

// UNSUPPORTED Rust 4669:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_START_TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("printStartTime");

// UNSUPPORTED Rust 4670:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRINT_STATUS: windows_sys::core::PCWSTR = windows_sys::core::w!("printStatus");

// UNSUPPORTED Rust 4671:1: non-scalar type Ptr unsupported
// pub const SPLDS_PRIORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("priority");

// UNSUPPORTED Rust 4672:1: non-scalar type Ptr unsupported
// pub const SPLDS_SERVER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("serverName");

// UNSUPPORTED Rust 4673:1: non-scalar type Ptr unsupported
// pub const SPLDS_SHORT_SERVER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("shortServerName");

// UNSUPPORTED Rust 4674:1: non-scalar type Ptr unsupported
// pub const SPLDS_SPOOLER_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("DsSpooler");

// UNSUPPORTED Rust 4675:1: non-scalar type Ptr unsupported
// pub const SPLDS_UNC_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("uNCName");

// UNSUPPORTED Rust 4676:1: non-scalar type Ptr unsupported
// pub const SPLDS_URL: windows_sys::core::PCWSTR = windows_sys::core::w!("url");

// UNSUPPORTED Rust 4677:1: non-scalar type Ptr unsupported
// pub const SPLDS_USER_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("DsUser");

// UNSUPPORTED Rust 4678:1: non-scalar type Ptr unsupported
// pub const SPLDS_VERSION_NUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("versionNumber");

// UNSUPPORTED Rust 4679:1: non-scalar type Ptr unsupported
// pub const SPLPRINTER_USER_MODE_PRINTER_DRIVER: windows_sys::core::PCWSTR = windows_sys::core::w!("SPLUserModePrinterDriver");

// UNSUPPORTED Rust 4680:1: non-scalar type Ptr unsupported
// pub const SPLREG_ALLOW_USER_MANAGEFORMS: windows_sys::core::PCWSTR = windows_sys::core::w!("AllowUserManageForms");

// UNSUPPORTED Rust 4681:1: non-scalar type Ptr unsupported
// pub const SPLREG_ARCHITECTURE: windows_sys::core::PCWSTR = windows_sys::core::w!("Architecture");

// UNSUPPORTED Rust 4682:1: non-scalar type Ptr unsupported
// pub const SPLREG_BEEP_ENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("BeepEnabled");

// UNSUPPORTED Rust 4683:1: non-scalar type Ptr unsupported
// pub const SPLREG_DEFAULT_SPOOL_DIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultSpoolDirectory");

// UNSUPPORTED Rust 4684:1: non-scalar type Ptr unsupported
// pub const SPLREG_DNS_MACHINE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DNSMachineName");

// UNSUPPORTED Rust 4685:1: non-scalar type Ptr unsupported
// pub const SPLREG_DS_PRESENT: windows_sys::core::PCWSTR = windows_sys::core::w!("DsPresent");

// UNSUPPORTED Rust 4686:1: non-scalar type Ptr unsupported
// pub const SPLREG_DS_PRESENT_FOR_USER: windows_sys::core::PCWSTR = windows_sys::core::w!("DsPresentForUser");

// UNSUPPORTED Rust 4687:1: non-scalar type Ptr unsupported
// pub const SPLREG_EVENT_LOG: windows_sys::core::PCWSTR = windows_sys::core::w!("EventLog");

// UNSUPPORTED Rust 4688:1: non-scalar type Ptr unsupported
// pub const SPLREG_MAJOR_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("MajorVersion");

// UNSUPPORTED Rust 4689:1: non-scalar type Ptr unsupported
// pub const SPLREG_MINOR_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("MinorVersion");

// UNSUPPORTED Rust 4690:1: non-scalar type Ptr unsupported
// pub const SPLREG_NET_POPUP: windows_sys::core::PCWSTR = windows_sys::core::w!("NetPopup");

// UNSUPPORTED Rust 4691:1: non-scalar type Ptr unsupported
// pub const SPLREG_NET_POPUP_TO_COMPUTER: windows_sys::core::PCWSTR = windows_sys::core::w!("NetPopupToComputer");

// UNSUPPORTED Rust 4692:1: non-scalar type Ptr unsupported
// pub const SPLREG_OS_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("OSVersion");

// UNSUPPORTED Rust 4693:1: non-scalar type Ptr unsupported
// pub const SPLREG_OS_VERSIONEX: windows_sys::core::PCWSTR = windows_sys::core::w!("OSVersionEx");

// UNSUPPORTED Rust 4694:1: non-scalar type Ptr unsupported
// pub const SPLREG_PORT_THREAD_PRIORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("PortThreadPriority");

// UNSUPPORTED Rust 4695:1: non-scalar type Ptr unsupported
// pub const SPLREG_PORT_THREAD_PRIORITY_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("PortThreadPriorityDefault");

// UNSUPPORTED Rust 4696:1: non-scalar type Ptr unsupported
// pub const SPLREG_PRINT_DRIVER_ISOLATION_EXECUTION_POLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintDriverIsolationExecutionPolicy");

// UNSUPPORTED Rust 4697:1: non-scalar type Ptr unsupported
// pub const SPLREG_PRINT_DRIVER_ISOLATION_GROUPS: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintDriverIsolationGroups");

// UNSUPPORTED Rust 4698:1: non-scalar type Ptr unsupported
// pub const SPLREG_PRINT_DRIVER_ISOLATION_IDLE_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintDriverIsolationIdleTimeout");

// UNSUPPORTED Rust 4699:1: non-scalar type Ptr unsupported
// pub const SPLREG_PRINT_DRIVER_ISOLATION_MAX_OBJECTS_BEFORE_RECYCLE: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintDriverIsolationMaxobjsBeforeRecycle");

// UNSUPPORTED Rust 4700:1: non-scalar type Ptr unsupported
// pub const SPLREG_PRINT_DRIVER_ISOLATION_OVERRIDE_POLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintDriverIsolationOverrideCompat");

// UNSUPPORTED Rust 4701:1: non-scalar type Ptr unsupported
// pub const SPLREG_PRINT_DRIVER_ISOLATION_TIME_BEFORE_RECYCLE: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintDriverIsolationTimeBeforeRecycle");

// UNSUPPORTED Rust 4702:1: non-scalar type Ptr unsupported
// pub const SPLREG_PRINT_QUEUE_V4_DRIVER_DIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintQueueV4DriverDirectory");

// UNSUPPORTED Rust 4703:1: non-scalar type Ptr unsupported
// pub const SPLREG_REMOTE_FAX: windows_sys::core::PCWSTR = windows_sys::core::w!("RemoteFax");

// UNSUPPORTED Rust 4704:1: non-scalar type Ptr unsupported
// pub const SPLREG_RESTART_JOB_ON_POOL_ENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("RestartJobOnPoolEnabled");

// UNSUPPORTED Rust 4705:1: non-scalar type Ptr unsupported
// pub const SPLREG_RESTART_JOB_ON_POOL_ERROR: windows_sys::core::PCWSTR = windows_sys::core::w!("RestartJobOnPoolError");

// UNSUPPORTED Rust 4706:1: non-scalar type Ptr unsupported
// pub const SPLREG_RETRY_POPUP: windows_sys::core::PCWSTR = windows_sys::core::w!("RetryPopup");

// UNSUPPORTED Rust 4707:1: non-scalar type Ptr unsupported
// pub const SPLREG_SCHEDULER_THREAD_PRIORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("SchedulerThreadPriority");

// UNSUPPORTED Rust 4708:1: non-scalar type Ptr unsupported
// pub const SPLREG_SCHEDULER_THREAD_PRIORITY_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("SchedulerThreadPriorityDefault");

// UNSUPPORTED Rust 4709:1: non-scalar type Ptr unsupported
// pub const SPLREG_WEBSHAREMGMT: windows_sys::core::PCWSTR = windows_sys::core::w!("WebShareMgmt");

public const val `SPOOL_FILE_PERSISTENT`: UInt = 1u;
public const val `SPOOL_FILE_TEMPORARY`: UInt = 2u;
public const val `SR_OWNER`: UInt = 0u;
public const val `SR_OWNER_PARENT`: UInt = 1u;
public const val `SSP_STDPAGE1`: UInt = 10001u;
public const val `SSP_STDPAGE2`: UInt = 10002u;
public const val `SSP_TVPAGE`: UInt = 10000u;
public const val `STRING_LANGPAIR`: UInt = 4u;
public const val `STRING_MUIDLL`: UInt = 2u;
public const val `STRING_NONE`: UInt = 1u;
public const val `S_CONFLICT_RESOLVED`: UInt = 262146u;
public const val `S_DEVCAP_OUTPUT_FULL_REPLACEMENT`: Int = 318465;
public const val `S_NO_CONFLICT`: UInt = 262145u;
// UNSUPPORTED Rust 4723:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRANSDATA {
//     pub ubCodePageID: u8,
//     pub ubType: u8,
//     pub uCode: TRANSDATA_0,
// }

// UNSUPPORTED Rust 4730:1: declaration Impl has no candidate rule
// impl Default for TRANSDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4735:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TRANSDATA_0 {
//     pub sCode: i16,
//     pub ubCode: u8,
//     pub ubPairs: [u8; 2],
// }

// UNSUPPORTED Rust 4742:1: declaration Impl has no candidate rule
// impl Default for TRANSDATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TTDOWNLOAD_BITMAP`: UInt = 2u;
public const val `TTDOWNLOAD_DONTCARE`: UInt = 0u;
public const val `TTDOWNLOAD_GRAPHICS`: UInt = 1u;
public const val `TTDOWNLOAD_TTOUTLINE`: UInt = 3u;
public const val `TVOT_2STATES`: UInt = 0u;
public const val `TVOT_3STATES`: UInt = 1u;
public const val `TVOT_CHKBOX`: UInt = 9u;
public const val `TVOT_COMBOBOX`: UInt = 6u;
public const val `TVOT_EDITBOX`: UInt = 7u;
public const val `TVOT_LISTBOX`: UInt = 5u;
public const val `TVOT_NSTATES_EX`: UInt = 10u;
public const val `TVOT_PUSHBUTTON`: UInt = 8u;
public const val `TVOT_SCROLLBAR`: UInt = 4u;
public const val `TVOT_TRACKBAR`: UInt = 3u;
public const val `TVOT_UDARROW`: UInt = 2u;
public const val `TYPE_GLYPHHANDLE`: UInt = 3u;
public const val `TYPE_GLYPHID`: UInt = 4u;
public const val `TYPE_TRANSDATA`: UInt = 2u;
public const val `TYPE_UNICODE`: UInt = 1u;
// UNSUPPORTED Rust 4766:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UFF_FILEHEADER {
//     pub dwSignature: u32,
//     pub dwVersion: u32,
//     pub dwSize: u32,
//     pub nFonts: u32,
//     pub nGlyphSets: u32,
//     pub nVarData: u32,
//     pub offFontDir: u32,
//     pub dwFlags: u32,
//     pub dwReserved: [u32; 4],
// }

// UNSUPPORTED Rust 4779:1: declaration Impl has no candidate rule
// impl Default for UFF_FILEHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4784:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UFF_FONTDIRECTORY {
//     pub dwSignature: u32,
//     pub wSize: u16,
//     pub wFontID: u16,
//     pub sGlyphID: i16,
//     pub wFlags: u16,
//     pub dwInstallerSig: u32,
//     pub offFontName: u32,
//     pub offCartridgeName: u32,
//     pub offFontData: u32,
//     pub offGlyphData: u32,
//     pub offVarData: u32,
// }

public const val `UFF_VERSION_NUMBER`: UInt = 65537u;
public const val `UFM_CART`: UInt = 2u;
public const val `UFM_SCALABLE`: UInt = 4u;
public const val `UFM_SOFT`: UInt = 1u;
public const val `UFOFLAG_TTDOWNLOAD_BITMAP`: UInt = 2u;
public const val `UFOFLAG_TTDOWNLOAD_TTOUTLINE`: UInt = 4u;
public const val `UFOFLAG_TTFONT`: UInt = 1u;
public const val `UFOFLAG_TTOUTLINE_BOLD_SIM`: UInt = 8u;
public const val `UFOFLAG_TTOUTLINE_ITALIC_SIM`: UInt = 16u;
public const val `UFOFLAG_TTOUTLINE_VERTICAL`: UInt = 32u;
public const val `UFOFLAG_TTSUBSTITUTED`: UInt = 64u;
public const val `UFO_GETINFO_FONTOBJ`: UInt = 1u;
public const val `UFO_GETINFO_GLYPHBITMAP`: UInt = 3u;
public const val `UFO_GETINFO_GLYPHSTRING`: UInt = 2u;
public const val `UFO_GETINFO_GLYPHWIDTH`: UInt = 4u;
public const val `UFO_GETINFO_MEMORY`: UInt = 5u;
public const val `UFO_GETINFO_STDVARIABLE`: UInt = 6u;
public typealias `UI_TYPE` = Int;
// UNSUPPORTED Rust 4817:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UNIDRVINFO {
//     pub dwSize: u32,
//     pub flGenFlags: u32,
//     pub wType: u16,
//     pub fCaps: u16,
//     pub wXRes: u16,
//     pub wYRes: u16,
//     pub sYAdjust: i16,
//     pub sYMoved: i16,
//     pub wPrivateData: u16,
//     pub sShift: i16,
//     pub SelectFont: INVOC,
//     pub UnSelectFont: INVOC,
//     pub wReserved: [u16; 4],
// }

// UNSUPPORTED Rust 4834:1: declaration Impl has no candidate rule
// impl Default for UNIDRVINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4839:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UNIDRV_PRIVATE_DEVMODE {
//     pub wReserved: [u16; 4],
//     pub wSize: u16,
// }

// UNSUPPORTED Rust 4845:1: declaration Impl has no candidate rule
// impl Default for UNIDRV_PRIVATE_DEVMODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4850:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UNIFM_HDR {
//     pub dwSize: u32,
//     pub dwVersion: u32,
//     pub ulDefaultCodepage: u32,
//     pub lGlyphSetDataRCID: i32,
//     pub loUnidrvInfo: u32,
//     pub loIFIMetrics: u32,
//     pub loExtTextMetric: u32,
//     pub loWidthTable: u32,
//     pub loKernPair: u32,
//     pub dwReserved: [u32; 2],
// }

// UNSUPPORTED Rust 4864:1: declaration Impl has no candidate rule
// impl Default for UNIFM_HDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNIFM_VERSION_1_0`: UInt = 65536u;
public const val `UNIRECTIONAL_NOTIFICATION_LOST`: `PrintAsyncNotifyError` = 5;
// UNSUPPORTED Rust 4871:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UNI_CODEPAGEINFO {
//     pub dwCodePage: u32,
//     pub SelectSymbolSet: INVOC,
//     pub UnSelectSymbolSet: INVOC,
// }

// UNSUPPORTED Rust 4878:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UNI_GLYPHSETDATA {
//     pub dwSize: u32,
//     pub dwVersion: u32,
//     pub dwFlags: u32,
//     pub lPredefinedID: i32,
//     pub dwGlyphCount: u32,
//     pub dwRunCount: u32,
//     pub loRunOffset: u32,
//     pub dwCodePageCount: u32,
//     pub loCodePageOffset: u32,
//     pub loMapTableOffset: u32,
//     pub dwReserved: [u32; 2],
// }

// UNSUPPORTED Rust 4893:1: declaration Impl has no candidate rule
// impl Default for UNI_GLYPHSETDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNI_GLYPHSETDATA_VERSION_1_0`: UInt = 65536u;
public const val `UNKNOWN_PROTOCOL`: UInt = 0u;
public const val `UPDP_CHECK_DRIVERSTORE`: UInt = 4u;
public const val `UPDP_SILENT_UPLOAD`: UInt = 1u;
public const val `UPDP_UPLOAD_ALWAYS`: UInt = 2u;
public const val `USBPRINT_IOCTL_INDEX`: UInt = 0u;
public const val `USB_PRINTER_INTERFACE_CLASSIC`: UInt = 1u;
public const val `USB_PRINTER_INTERFACE_DUAL`: UInt = 3u;
public const val `USB_PRINTER_INTERFACE_IPP`: UInt = 2u;
// UNSUPPORTED Rust 4907:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USERDATA {
//     pub dwSize: u32,
//     pub dwItemID: usize,
//     pub pKeyWordName: windows_sys::core::PSTR,
//     pub dwReserved: [u32; 8],
// }

// UNSUPPORTED Rust 4915:1: declaration Impl has no candidate rule
// impl Default for USERDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4920:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WIDTHRUN {
//     pub wStartGlyph: u16,
//     pub wGlyphCount: u16,
//     pub loCharWidthOffset: u32,
// }

// UNSUPPORTED Rust 4927:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIDTHTABLE {
//     pub dwSize: u32,
//     pub dwRunNum: u32,
//     pub WidthRun: [WIDTHRUN; 1],
// }

// UNSUPPORTED Rust 4934:1: declaration Impl has no candidate rule
// impl Default for WIDTHTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WM_FI_FILENAME`: UInt = 900u;
public typealias `XPSRAS_BACKGROUND_COLOR` = Int;
public const val `XPSRAS_BACKGROUND_COLOR_OPAQUE`: `XPSRAS_BACKGROUND_COLOR` = 1;
public const val `XPSRAS_BACKGROUND_COLOR_TRANSPARENT`: `XPSRAS_BACKGROUND_COLOR` = 0;
public typealias `XPSRAS_PIXEL_FORMAT` = Int;
public const val `XPSRAS_PIXEL_FORMAT_128BPP_PRGBA_FLOAT_SCRGB`: `XPSRAS_PIXEL_FORMAT` = 3;
public const val `XPSRAS_PIXEL_FORMAT_32BPP_PBGRA_UINT_SRGB`: `XPSRAS_PIXEL_FORMAT` = 1;
public const val `XPSRAS_PIXEL_FORMAT_64BPP_PRGBA_HALF_SCRGB`: `XPSRAS_PIXEL_FORMAT` = 2;
public typealias `XPSRAS_RENDERING_MODE` = Int;
public const val `XPSRAS_RENDERING_MODE_ALIASED`: `XPSRAS_RENDERING_MODE` = 1;
public const val `XPSRAS_RENDERING_MODE_ANTIALIASED`: `XPSRAS_RENDERING_MODE` = 0;
// UNSUPPORTED Rust 4950:1: non-scalar type Ptr unsupported
// pub const XPS_FP_DRIVER_PROPERTY_BAG: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverPropertyBag");

// UNSUPPORTED Rust 4951:1: non-scalar type Ptr unsupported
// pub const XPS_FP_JOB_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintJobId");

// UNSUPPORTED Rust 4952:1: non-scalar type Ptr unsupported
// pub const XPS_FP_JOB_LEVEL_PRINTTICKET: windows_sys::core::PCWSTR = windows_sys::core::w!("JobPrintTicket");

// UNSUPPORTED Rust 4953:1: non-scalar type Ptr unsupported
// pub const XPS_FP_MERGED_DATAFILE_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("MergedDataFilePath");

// UNSUPPORTED Rust 4954:1: non-scalar type Ptr unsupported
// pub const XPS_FP_MS_CONTENT_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverMultiContentType");

// UNSUPPORTED Rust 4955:1: non-scalar type Ptr unsupported
// pub const XPS_FP_MS_CONTENT_TYPE_OPENXPS: windows_sys::core::PCWSTR = windows_sys::core::w!("OpenXPS");

// UNSUPPORTED Rust 4956:1: non-scalar type Ptr unsupported
// pub const XPS_FP_MS_CONTENT_TYPE_XPS: windows_sys::core::PCWSTR = windows_sys::core::w!("XPS");

// UNSUPPORTED Rust 4957:1: non-scalar type Ptr unsupported
// pub const XPS_FP_OUTPUT_FILE: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintOutputFileName");

// UNSUPPORTED Rust 4958:1: non-scalar type Ptr unsupported
// pub const XPS_FP_PRINTDEVICECAPABILITIES: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintDeviceCapabilities");

// UNSUPPORTED Rust 4959:1: non-scalar type Ptr unsupported
// pub const XPS_FP_PRINTER_HANDLE: windows_sys::core::PCWSTR = windows_sys::core::w!("PrinterHandle");

// UNSUPPORTED Rust 4960:1: non-scalar type Ptr unsupported
// pub const XPS_FP_PRINTER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PrinterName");

// UNSUPPORTED Rust 4961:1: non-scalar type Ptr unsupported
// pub const XPS_FP_PRINT_CLASS_FACTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintClassFactory");

// UNSUPPORTED Rust 4962:1: non-scalar type Ptr unsupported
// pub const XPS_FP_PROGRESS_REPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("ProgressReport");

// UNSUPPORTED Rust 4963:1: non-scalar type Ptr unsupported
// pub const XPS_FP_QUEUE_PROPERTY_BAG: windows_sys::core::PCWSTR = windows_sys::core::w!("QueuePropertyBag");

// UNSUPPORTED Rust 4964:1: non-scalar type Ptr unsupported
// pub const XPS_FP_RESOURCE_DLL_PATHS: windows_sys::core::PCWSTR = windows_sys::core::w!("ResourceDLLPaths");

// UNSUPPORTED Rust 4965:1: non-scalar type Ptr unsupported
// pub const XPS_FP_USER_PRINT_TICKET: windows_sys::core::PCWSTR = windows_sys::core::w!("PerUserPrintTicket");

// UNSUPPORTED Rust 4966:1: non-scalar type Ptr unsupported
// pub const XPS_FP_USER_TOKEN: windows_sys::core::PCWSTR = windows_sys::core::w!("UserSecurityToken");

public const val `XpsJob_DocumentSequenceAdded`: `EXpsJobConsumption` = 0;
public const val `XpsJob_FixedDocumentAdded`: `EXpsJobConsumption` = 1;
public const val `XpsJob_FixedPageAdded`: `EXpsJobConsumption` = 2;
public const val `Xps_Restricted_Font_Editable`: `EXpsFontRestriction` = 8;
public const val `Xps_Restricted_Font_Installable`: `EXpsFontRestriction` = 0;
public const val `Xps_Restricted_Font_NoEmbedding`: `EXpsFontRestriction` = 2;
public const val `Xps_Restricted_Font_PreviewPrint`: `EXpsFontRestriction` = 4;
// UNSUPPORTED Rust 4974:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type _CPSUICALLBACK = Option<unsafe extern "system" fn(pcpsuicbparam: *mut CPSUICBPARAM) -> i32>;

// UNSUPPORTED Rust 4976:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct _SPLCLIENT_INFO_2_V3 {
//     pub hSplPrinter: u64,
// }

public const val `kADT_ASCII`: `EATTRIBUTE_DATATYPE` = 5;
public const val `kADT_BINARY`: `EATTRIBUTE_DATATYPE` = 7;
public const val `kADT_BOOL`: `EATTRIBUTE_DATATYPE` = 1;
public const val `kADT_CUSTOMSIZEPARAMS`: `EATTRIBUTE_DATATYPE` = 10;
public const val `kADT_DWORD`: `EATTRIBUTE_DATATYPE` = 4;
public const val `kADT_INT`: `EATTRIBUTE_DATATYPE` = 2;
public const val `kADT_LONG`: `EATTRIBUTE_DATATYPE` = 3;
public const val `kADT_RECT`: `EATTRIBUTE_DATATYPE` = 9;
public const val `kADT_SIZE`: `EATTRIBUTE_DATATYPE` = 8;
public const val `kADT_UNICODE`: `EATTRIBUTE_DATATYPE` = 6;
public const val `kADT_UNKNOWN`: `EATTRIBUTE_DATATYPE` = 0;
public const val `kAddingDocumentSequence`: `EPrintXPSJobProgress` = 0;
public const val `kAddingFixedDocument`: `EPrintXPSJobProgress` = 2;
public const val `kAddingFixedPage`: `EPrintXPSJobProgress` = 4;
public const val `kAllUsers`: `PrintAsyncNotifyUserFilter` = 1;
public const val `kBiDirectional`: `PrintAsyncNotifyConversationStyle` = 0;
public const val `kDocumentSequenceAdded`: `EPrintXPSJobProgress` = 1;
public const val `kFixedDocumentAdded`: `EPrintXPSJobProgress` = 3;
public const val `kFixedPageAdded`: `EPrintXPSJobProgress` = 5;
public const val `kFontAdded`: `EPrintXPSJobProgress` = 7;
public const val `kImageAdded`: `EPrintXPSJobProgress` = 8;
public const val `kInvalidJobState`: `EBranchOfficeJobEventType` = 0;
public const val `kJobConsumption`: `EPrintXPSJobOperation` = 2;
public const val `kJobProduction`: `EPrintXPSJobOperation` = 1;
public const val `kLogJobError`: `EBranchOfficeJobEventType` = 3;
public const val `kLogJobPipelineError`: `EBranchOfficeJobEventType` = 4;
public const val `kLogJobPrinted`: `EBranchOfficeJobEventType` = 1;
public const val `kLogJobRendered`: `EBranchOfficeJobEventType` = 2;
public const val `kLogOfflineFileFull`: `EBranchOfficeJobEventType` = 5;
public const val `kMessageBox`: `UI_TYPE` = 0;
public const val `kPerUser`: `PrintAsyncNotifyUserFilter` = 0;
public const val `kPropertyTypeBuffer`: `EPrintPropertyType` = 10;
public const val `kPropertyTypeByte`: `EPrintPropertyType` = 4;
public const val `kPropertyTypeDevMode`: `EPrintPropertyType` = 6;
public const val `kPropertyTypeInt32`: `EPrintPropertyType` = 2;
public const val `kPropertyTypeInt64`: `EPrintPropertyType` = 3;
public const val `kPropertyTypeNotificationOptions`: `EPrintPropertyType` = 9;
public const val `kPropertyTypeNotificationReply`: `EPrintPropertyType` = 8;
public const val `kPropertyTypeSD`: `EPrintPropertyType` = 7;
public const val `kPropertyTypeString`: `EPrintPropertyType` = 1;
public const val `kPropertyTypeTime`: `EPrintPropertyType` = 5;
public const val `kResourceAdded`: `EPrintXPSJobProgress` = 6;
public const val `kUniDirectional`: `PrintAsyncNotifyConversationStyle` = 1;
public const val `kXpsDocumentCommitted`: `EPrintXPSJobProgress` = 9;
