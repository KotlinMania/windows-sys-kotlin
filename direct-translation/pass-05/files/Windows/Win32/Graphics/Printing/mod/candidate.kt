// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_Graphics_Printing_PrintTicket")]
// pub mod PrintTicket;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AbortPrinter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AbortPrinter`(`hprinter` : `PRINTER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddFormA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddFormA`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pform` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddFormW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddFormW`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pform` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddJobA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddJobA`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddJobW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddJobW`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddMonitorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddMonitorA`(`pname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pmonitors` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddMonitorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddMonitorW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pmonitors` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPortA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPortA`(`pname` : `windows_sys`.`core`.`PCSTR`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `pmonitorname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPortW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPortW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `pmonitorname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=AddPrintDeviceObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrintDeviceObject`(`hprinter` : `PRINTER_HANDLE`, `phdeviceobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrintProcessorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrintProcessorA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `ppathname` : `windows_sys`.`core`.`PCSTR`, `pprintprocessorname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrintProcessorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrintProcessorW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `ppathname` : `windows_sys`.`core`.`PCWSTR`, `pprintprocessorname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrintProvidorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrintProvidorA`(`pname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pprovidorinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrintProvidorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrintProvidorW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pprovidorinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterA`(`pname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pprinter` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterConnection2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterConnection2A`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszname` : `windows_sys`.`core`.`PCSTR`, `dwlevel` : UInt, `pconnectioninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterConnection2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterConnection2W`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszname` : `windows_sys`.`core`.`PCWSTR`, `dwlevel` : UInt, `pconnectioninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterConnectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterConnectionA`(`pname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterConnectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterConnectionW`(`pname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterDriverA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterDriverA`(`pname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pdriverinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterDriverExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterDriverExA`(`pname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `lpbdriverinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwfilecopyflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterDriverExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterDriverExW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `lpbdriverinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwfilecopyflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterDriverW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterDriverW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pdriverinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AddPrinterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPrinterW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pprinter` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AdvancedDocumentPropertiesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `AdvancedDocumentPropertiesA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hprinter` : `PRINTER_HANDLE`, `pdevicename` : `windows_sys`.`core`.`PCSTR`, `pdevmodeoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?, `pdevmodeinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=AdvancedDocumentPropertiesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `AdvancedDocumentPropertiesW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hprinter` : `PRINTER_HANDLE`, `pdevicename` : `windows_sys`.`core`.`PCWSTR`, `pdevmodeoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?, `pdevmodeinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=AppendPrinterNotifyInfoData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppendPrinterNotifyInfoData`(`pinfodest` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_INFO`>?, `pdatasrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_INFO_DATA`>?, `fdwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=CallRouterFindFirstPrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CallRouterFindFirstPrinterChangeNotification`(`hprinterrpc` : `super`.`super`.`Foundation`.`HANDLE`, `fdwfilterflags` : UInt, `fdwoptions` : UInt, `hnotify` : `super`.`super`.`Foundation`.`HANDLE`, `pprinternotifyoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_OPTIONS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ClosePrinter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClosePrinter`(`hprinter` : `PRINTER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=CloseSpoolFileHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseSpoolFileHandle`(`hprinter` : `PRINTER_HANDLE`, `hspoolfile` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=CommitSpoolData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommitSpoolData`(`hprinter` : `PRINTER_HANDLE`, `hspoolfile` : `super`.`super`.`Foundation`.`HANDLE`, `cbcommit` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=compstui.dll, ABI=system, export=CommonPropertySheetUIA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommonPropertySheetUIA`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `pfnpropsheetui` : `PFNPROPSHEETUI`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `presult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=compstui.dll, ABI=system, export=CommonPropertySheetUIW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommonPropertySheetUIW`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `pfnpropsheetui` : `PFNPROPSHEETUI`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `presult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ConfigurePortA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConfigurePortA`(`pname` : `windows_sys`.`core`.`PCSTR`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `pportname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ConfigurePortW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConfigurePortW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `pportname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ConnectToPrinterDlg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConnectToPrinterDlg`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `flags` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=CorePrinterDriverInstalledA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CorePrinterDriverInstalledA`(`pszserver` : `windows_sys`.`core`.`PCSTR`, `pszenvironment` : `windows_sys`.`core`.`PCSTR`, `coredriverguid` : `windows_sys`.`core`.`GUID`, `ftdriverdate` : `super`.`super`.`Foundation`.`FILETIME`, `dwldriverversion` : ULong, `pbdriverinstalled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=CorePrinterDriverInstalledW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CorePrinterDriverInstalledW`(`pszserver` : `windows_sys`.`core`.`PCWSTR`, `pszenvironment` : `windows_sys`.`core`.`PCWSTR`, `coredriverguid` : `windows_sys`.`core`.`GUID`, `ftdriverdate` : `super`.`super`.`Foundation`.`FILETIME`, `dwldriverversion` : ULong, `pbdriverinstalled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=CreatePrintAsyncNotifyChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePrintAsyncNotifyChannel`(`pszname` : `windows_sys`.`core`.`PCWSTR`, `pnotificationtype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `euserfilter` : `PrintAsyncNotifyUserFilter`, `econversationstyle` : `PrintAsyncNotifyConversationStyle`, `pcallback` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppiasynchnotification` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=CreatePrinterIC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreatePrinterIC`(`hprinter` : `PRINTER_HANDLE`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeleteFormA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteFormA`(`hprinter` : `PRINTER_HANDLE`, `pformname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeleteFormW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteFormW`(`hprinter` : `PRINTER_HANDLE`, `pformname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeleteJobNamedProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteJobNamedProperty`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `pszname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeleteMonitorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteMonitorA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `pmonitorname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeleteMonitorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteMonitorW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `pmonitorname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePortA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePortA`(`pname` : `windows_sys`.`core`.`PCSTR`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `pportname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePortW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePortW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `pportname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrintProcessorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrintProcessorA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `pprintprocessorname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrintProcessorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrintProcessorW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `pprintprocessorname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrintProvidorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrintProvidorA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `pprintprovidorname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrintProvidorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrintProvidorW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `pprintprovidorname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinter`(`hprinter` : `PRINTER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterConnectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterConnectionA`(`pname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterConnectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterConnectionW`(`pname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDataA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDataA`(`hprinter` : `PRINTER_HANDLE`, `pvaluename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDataExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDataExA`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCSTR`, `pvaluename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDataExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDataExW`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCWSTR`, `pvaluename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDataW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDataW`(`hprinter` : `PRINTER_HANDLE`, `pvaluename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDriverA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDriverA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `pdrivername` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDriverExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDriverExA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `pdrivername` : `windows_sys`.`core`.`PCSTR`, `dwdeleteflag` : UInt, `dwversionflag` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDriverExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDriverExW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `pdrivername` : `windows_sys`.`core`.`PCWSTR`, `dwdeleteflag` : UInt, `dwversionflag` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDriverPackageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDriverPackageA`(`pszserver` : `windows_sys`.`core`.`PCSTR`, `pszinfpath` : `windows_sys`.`core`.`PCSTR`, `pszenvironment` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDriverPackageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDriverPackageW`(`pszserver` : `windows_sys`.`core`.`PCWSTR`, `pszinfpath` : `windows_sys`.`core`.`PCWSTR`, `pszenvironment` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterDriverW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterDriverW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `pdrivername` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterIC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterIC`(`hprinteric` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterKeyA`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeletePrinterKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePrinterKeyW`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DevQueryPrint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DevQueryPrint`(`hprinter` : `PRINTER_HANDLE`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?, `presid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DevQueryPrintEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DevQueryPrintEx`(`pdqpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVQUERYPRINT_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DocumentPropertiesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DocumentPropertiesA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hprinter` : `PRINTER_HANDLE`, `pdevicename` : `windows_sys`.`core`.`PCSTR`, `pdevmodeoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?, `pdevmodeinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?, `fmode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DocumentPropertiesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DocumentPropertiesW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hprinter` : `PRINTER_HANDLE`, `pdevicename` : `windows_sys`.`core`.`PCWSTR`, `pdevmodeoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?, `pdevmodeinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?, `fmode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EndDocPrinter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndDocPrinter`(`hprinter` : `PRINTER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EndPagePrinter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndPagePrinter`(`hprinter` : `PRINTER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumFormsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumFormsA`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pform` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumFormsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumFormsW`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pform` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumJobNamedProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumJobNamedProperties`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `pcproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PrintNamedProperty`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumJobsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumJobsA`(`hprinter` : `PRINTER_HANDLE`, `firstjob` : UInt, `nojobs` : UInt, `level` : UInt, `pjob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumJobsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumJobsW`(`hprinter` : `PRINTER_HANDLE`, `firstjob` : UInt, `nojobs` : UInt, `level` : UInt, `pjob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumMonitorsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumMonitorsA`(`pname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pmonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumMonitorsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumMonitorsW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pmonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPortsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPortsA`(`pname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPortsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPortsW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrintProcessorDatatypesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrintProcessorDatatypesA`(`pname` : `windows_sys`.`core`.`PCSTR`, `pprintprocessorname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pdatatypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrintProcessorDatatypesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrintProcessorDatatypesW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `pprintprocessorname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pdatatypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrintProcessorsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrintProcessorsA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pprintprocessorinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrintProcessorsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrintProcessorsW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pprintprocessorinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrinterDataA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrinterDataA`(`hprinter` : `PRINTER_HANDLE`, `dwindex` : UInt, `pvaluename` : `windows_sys`.`core`.`PSTR`, `cbvaluename` : UInt, `pcbvaluename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt, `pcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrinterDataExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrinterDataExA`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCSTR`, `penumvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbenumvalues` : UInt, `pcbenumvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pnenumvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrinterDataExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrinterDataExW`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCWSTR`, `penumvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbenumvalues` : UInt, `pcbenumvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pnenumvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrinterDataW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrinterDataW`(`hprinter` : `PRINTER_HANDLE`, `dwindex` : UInt, `pvaluename` : `windows_sys`.`core`.`PWSTR`, `cbvaluename` : UInt, `pcbvaluename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt, `pcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrinterDriversA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrinterDriversA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pdriverinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrinterDriversW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrinterDriversW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pdriverinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrinterKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrinterKeyA`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCSTR`, `psubkey` : `windows_sys`.`core`.`PSTR`, `cbsubkey` : UInt, `pcbsubkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrinterKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrinterKeyW`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCWSTR`, `psubkey` : `windows_sys`.`core`.`PWSTR`, `cbsubkey` : UInt, `pcbsubkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrintersA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrintersA`(`flags` : UInt, `name` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pprinterenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=EnumPrintersW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPrintersW`(`flags` : UInt, `name` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pprinterenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ExtDeviceMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ExtDeviceMode`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinst` : `super`.`super`.`Foundation`.`HANDLE`, `pdevmodeoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?, `pdevicename` : `windows_sys`.`core`.`PCSTR`, `pport` : `windows_sys`.`core`.`PCSTR`, `pdevmodeinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?, `pprofile` : `windows_sys`.`core`.`PCSTR`, `fmode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=FindClosePrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindClosePrinterChangeNotification`(`hchange` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=FindFirstPrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstPrinterChangeNotification`(`hprinter` : `PRINTER_HANDLE`, `fdwfilter` : UInt, `fdwoptions` : UInt, `pprinternotifyoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=FindNextPrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextPrinterChangeNotification`(`hchange` : `super`.`super`.`Foundation`.`HANDLE`, `pdwchange` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppprinternotifyinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=FlushPrinter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlushPrinter`(`hprinter` : `PRINTER_HANDLE`, `pbuf` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuf` : UInt, `pcwritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `csleep` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=FreePrintNamedPropertyArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreePrintNamedPropertyArray`(`cproperties` : UInt, `ppproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PrintNamedProperty`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=FreePrintPropertyValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreePrintPropertyValue`(`pvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PrintPropertyValue`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=FreePrinterNotifyInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreePrinterNotifyInfo`(`pprinternotifyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiDeleteSpoolFileHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiDeleteSpoolFileHandle`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiEndDocEMF; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiEndDocEMF`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiEndPageEMF; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiEndPageEMF`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`, `dwoptimization` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiGetDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdiGetDC`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`Gdi`.`HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiGetDevmodeForPage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdiGetDevmodeForPage`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`, `dwpagenumber` : UInt, `pcurrdm` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Gdi`.`DEVMODEW`>>?, `plastdm` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Gdi`.`DEVMODEW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiGetPageCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiGetPageCount`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiGetPageHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiGetPageHandle`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`, `page` : UInt, `pdwpagetype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiGetSpoolFileHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdiGetSpoolFileHandle`(`pwszprintername` : `windows_sys`.`core`.`PCWSTR`, `pdevmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?, `pwszdocname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiPlayPageEMF; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiPlayPageEMF`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`, `hemf` : `super`.`super`.`Foundation`.`HANDLE`, `prectdocument` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `prectborder` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `prectclip` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiResetDCEMF; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdiResetDCEMF`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`, `pcurrdm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiStartDocEMF; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_Xps")]
public external fun `GdiStartDocEMF`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`, `pdocinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`Xps`.`DOCINFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiStartPageEMF; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiStartPageEMF`(`spoolfilehandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GenerateCopyFilePaths; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GenerateCopyFilePaths`(`pszprintername` : `windows_sys`.`core`.`PCWSTR`, `pszdirectory` : `windows_sys`.`core`.`PCWSTR`, `psplclientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwlevel` : UInt, `pszsourcedir` : `windows_sys`.`core`.`PWSTR`, `pcchsourcedirsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `psztargetdir` : `windows_sys`.`core`.`PWSTR`, `pcchtargetdirsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=compstui.dll, ABI=system, export=GetCPSUIUserData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCPSUIUserData`(`hdlg` : `super`.`super`.`Foundation`.`HWND`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetCorePrinterDriversA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCorePrinterDriversA`(`pszserver` : `windows_sys`.`core`.`PCSTR`, `pszenvironment` : `windows_sys`.`core`.`PCSTR`, `pszzcoredriverdependencies` : `windows_sys`.`core`.`PCSTR`, `ccoreprinterdrivers` : UInt, `pcoreprinterdrivers` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CORE_PRINTER_DRIVERA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetCorePrinterDriversW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCorePrinterDriversW`(`pszserver` : `windows_sys`.`core`.`PCWSTR`, `pszenvironment` : `windows_sys`.`core`.`PCWSTR`, `pszzcoredriverdependencies` : `windows_sys`.`core`.`PCWSTR`, `ccoreprinterdrivers` : UInt, `pcoreprinterdrivers` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CORE_PRINTER_DRIVERW`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetDefaultPrinterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDefaultPrinterA`(`pszbuffer` : `windows_sys`.`core`.`PSTR`, `pcchbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetDefaultPrinterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDefaultPrinterW`(`pszbuffer` : `windows_sys`.`core`.`PWSTR`, `pcchbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetFormA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFormA`(`hprinter` : `PRINTER_HANDLE`, `pformname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pform` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetFormW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFormW`(`hprinter` : `PRINTER_HANDLE`, `pformname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pform` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetJobA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetJobA`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `level` : UInt, `pjob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=GetJobAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetJobAttributes`(`pprintername` : `windows_sys`.`core`.`PCWSTR`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?, `pattributeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ATTRIBUTE_INFO_3`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=GetJobAttributesEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetJobAttributesEx`(`pprintername` : `windows_sys`.`core`.`PCWSTR`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?, `dwlevel` : UInt, `pattributeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nsize` : UInt, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetJobNamedPropertyValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetJobNamedPropertyValue`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `pszname` : `windows_sys`.`core`.`PCWSTR`, `pvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PrintPropertyValue`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetJobW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetJobW`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `level` : UInt, `pjob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrintExecutionData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrintExecutionData`(`pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINT_EXECUTION_DATA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrintOutputInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrintOutputInfo`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszprinter` : `windows_sys`.`core`.`PCWSTR`, `phfile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `ppszoutputfile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrintProcessorDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrintProcessorDirectoryA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pprintprocessorinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrintProcessorDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrintProcessorDirectoryW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pprintprocessorinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterA`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pprinter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDataA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDataA`(`hprinter` : `PRINTER_HANDLE`, `pvaluename` : `windows_sys`.`core`.`PCSTR`, `ptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nsize` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDataExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDataExA`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCSTR`, `pvaluename` : `windows_sys`.`core`.`PCSTR`, `ptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nsize` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDataExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDataExW`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCWSTR`, `pvaluename` : `windows_sys`.`core`.`PCWSTR`, `ptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nsize` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDataW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDataW`(`hprinter` : `PRINTER_HANDLE`, `pvaluename` : `windows_sys`.`core`.`PCWSTR`, `ptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nsize` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDriver2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDriver2A`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hprinter` : `PRINTER_HANDLE`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pdriverinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDriver2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDriver2W`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hprinter` : `PRINTER_HANDLE`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pdriverinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDriverA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDriverA`(`hprinter` : `PRINTER_HANDLE`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pdriverinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDriverDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDriverDirectoryA`(`pname` : `windows_sys`.`core`.`PCSTR`, `penvironment` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pdriverdirectory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDriverDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDriverDirectoryW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pdriverdirectory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDriverPackagePathA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDriverPackagePathA`(`pszserver` : `windows_sys`.`core`.`PCSTR`, `pszenvironment` : `windows_sys`.`core`.`PCSTR`, `pszlanguage` : `windows_sys`.`core`.`PCSTR`, `pszpackageid` : `windows_sys`.`core`.`PCSTR`, `pszdriverpackagecab` : `windows_sys`.`core`.`PSTR`, `cchdriverpackagecab` : UInt, `pcchrequiredsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDriverPackagePathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDriverPackagePathW`(`pszserver` : `windows_sys`.`core`.`PCWSTR`, `pszenvironment` : `windows_sys`.`core`.`PCWSTR`, `pszlanguage` : `windows_sys`.`core`.`PCWSTR`, `pszpackageid` : `windows_sys`.`core`.`PCWSTR`, `pszdriverpackagecab` : `windows_sys`.`core`.`PWSTR`, `cchdriverpackagecab` : UInt, `pcchrequiredsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterDriverW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterDriverW`(`hprinter` : `PRINTER_HANDLE`, `penvironment` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pdriverinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetPrinterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrinterW`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pprinter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbuf` : UInt, `pcbneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=GetSpoolFileHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSpoolFileHandle`(`hprinter` : `PRINTER_HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=ImpersonatePrinterClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImpersonatePrinterClient`(`htoken` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=InstallPrinterDriverFromPackageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InstallPrinterDriverFromPackageA`(`pszserver` : `windows_sys`.`core`.`PCSTR`, `pszinfpath` : `windows_sys`.`core`.`PCSTR`, `pszdrivername` : `windows_sys`.`core`.`PCSTR`, `pszenvironment` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=InstallPrinterDriverFromPackageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InstallPrinterDriverFromPackageW`(`pszserver` : `windows_sys`.`core`.`PCWSTR`, `pszinfpath` : `windows_sys`.`core`.`PCWSTR`, `pszdrivername` : `windows_sys`.`core`.`PCWSTR`, `pszenvironment` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=IsValidDevmodeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `IsValidDevmodeA`(`pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?, `devmodesize` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=IsValidDevmodeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `IsValidDevmodeW`(`pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?, `devmodesize` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=OpenPrinter2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `OpenPrinter2A`(`pprintername` : `windows_sys`.`core`.`PCSTR`, `phprinter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTER_HANDLE`>?, `pdefault` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_DEFAULTSA`>?, `poptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_OPTIONSA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=OpenPrinter2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `OpenPrinter2W`(`pprintername` : `windows_sys`.`core`.`PCWSTR`, `phprinter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTER_HANDLE`>?, `pdefault` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_DEFAULTSW`>?, `poptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_OPTIONSW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=OpenPrinterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `OpenPrinterA`(`pprintername` : `windows_sys`.`core`.`PCSTR`, `phprinter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTER_HANDLE`>?, `pdefault` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_DEFAULTSA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=OpenPrinterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `OpenPrinterW`(`pprintername` : `windows_sys`.`core`.`PCWSTR`, `phprinter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTER_HANDLE`>?, `pdefault` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_DEFAULTSW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=PartialReplyPrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PartialReplyPrinterChangeNotification`(`hprinter` : `PRINTER_HANDLE`, `pdatasrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_INFO_DATA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=PlayGdiScriptOnPrinterIC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PlayGdiScriptOnPrinterIC`(`hprinteric` : `super`.`super`.`Foundation`.`HANDLE`, `pin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cin` : UInt, `pout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cout` : UInt, `ul` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=PrinterMessageBoxA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrinterMessageBoxA`(`hprinter` : `PRINTER_HANDLE`, `error` : UInt, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `ptext` : `windows_sys`.`core`.`PCSTR`, `pcaption` : `windows_sys`.`core`.`PCSTR`, `dwtype` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=PrinterMessageBoxW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrinterMessageBoxW`(`hprinter` : `PRINTER_HANDLE`, `error` : UInt, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `ptext` : `windows_sys`.`core`.`PCWSTR`, `pcaption` : `windows_sys`.`core`.`PCWSTR`, `dwtype` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=PrinterProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrinterProperties`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hprinter` : `PRINTER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=ProvidorFindClosePrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProvidorFindClosePrinterChangeNotification`(`hprinter` : `PRINTER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=ProvidorFindFirstPrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProvidorFindFirstPrinterChangeNotification`(`hprinter` : `PRINTER_HANDLE`, `fdwflags` : UInt, `fdwoptions` : UInt, `hnotify` : `super`.`super`.`Foundation`.`HANDLE`, `pprinternotifyoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvreserved1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ReadPrinter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadPrinter`(`hprinter` : `PRINTER_HANDLE`, `pbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuf` : UInt, `pnobytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=RegisterForPrintAsyncNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterForPrintAsyncNotifications`(`pszname` : `windows_sys`.`core`.`PCWSTR`, `pnotificationtype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `euserfilter` : `PrintAsyncNotifyUserFilter`, `econversationstyle` : `PrintAsyncNotifyConversationStyle`, `pcallback` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phnotify` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=RemovePrintDeviceObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemovePrintDeviceObject`(`hdeviceobject` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=ReplyPrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReplyPrinterChangeNotification`(`hprinter` : `PRINTER_HANDLE`, `fdwchangeflags` : UInt, `pdwresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pprinternotifyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=ReplyPrinterChangeNotificationEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReplyPrinterChangeNotificationEx`(`hnotify` : `super`.`super`.`Foundation`.`HANDLE`, `dwcolor` : UInt, `fdwflags` : UInt, `pdwresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pprinternotifyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ReportJobProcessingProgress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportJobProcessingProgress`(`printerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobid` : UInt, `joboperation` : `EPrintXPSJobOperation`, `jobprogress` : `EPrintXPSJobProgress`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ResetPrinterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ResetPrinterA`(`hprinter` : `PRINTER_HANDLE`, `pdefault` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_DEFAULTSA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ResetPrinterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ResetPrinterW`(`hprinter` : `PRINTER_HANDLE`, `pdefault` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_DEFAULTSW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=RevertToPrinterSelf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RevertToPrinterSelf`() : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=RouterAllocBidiMem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RouterAllocBidiMem`(`numbytes` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=RouterAllocBidiResponseContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RouterAllocBidiResponseContainer`(`count` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`BIDI_RESPONSE_CONTAINER`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=RouterAllocPrinterNotifyInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RouterAllocPrinterNotifyInfo`(`cprinternotifyinfodata` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_INFO`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=RouterFreeBidiMem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RouterFreeBidiMem`(`pmempointer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=RouterFreeBidiResponseContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RouterFreeBidiResponseContainer`(`pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`BIDI_RESPONSE_CONTAINER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=RouterFreePrinterNotifyInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RouterFreePrinterNotifyInfo`(`pinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=ScheduleJob; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScheduleJob`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=compstui.dll, ABI=system, export=SetCPSUIUserData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCPSUIUserData`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `cpsuiuserdata` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetDefaultPrinterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDefaultPrinterA`(`pszprinter` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetDefaultPrinterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDefaultPrinterW`(`pszprinter` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetFormA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFormA`(`hprinter` : `PRINTER_HANDLE`, `pformname` : `windows_sys`.`core`.`PCSTR`, `level` : UInt, `pform` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetFormW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFormW`(`hprinter` : `PRINTER_HANDLE`, `pformname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `pform` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetJobA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetJobA`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `level` : UInt, `pjob` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `command` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetJobNamedProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetJobNamedProperty`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `pproperty` : /* Rust *const */ kotlinx.cinterop.CPointer<`PrintNamedProperty`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetJobW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetJobW`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `level` : UInt, `pjob` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `command` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetPortA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPortA`(`pname` : `windows_sys`.`core`.`PCSTR`, `pportname` : `windows_sys`.`core`.`PCSTR`, `dwlevel` : UInt, `pportinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetPortW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPortW`(`pname` : `windows_sys`.`core`.`PCWSTR`, `pportname` : `windows_sys`.`core`.`PCWSTR`, `dwlevel` : UInt, `pportinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetPrinterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPrinterA`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pprinter` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `command` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetPrinterDataA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPrinterDataA`(`hprinter` : `PRINTER_HANDLE`, `pvaluename` : `windows_sys`.`core`.`PCSTR`, `type` : UInt, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetPrinterDataExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPrinterDataExA`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCSTR`, `pvaluename` : `windows_sys`.`core`.`PCSTR`, `type` : UInt, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetPrinterDataExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPrinterDataExW`(`hprinter` : `PRINTER_HANDLE`, `pkeyname` : `windows_sys`.`core`.`PCWSTR`, `pvaluename` : `windows_sys`.`core`.`PCWSTR`, `type` : UInt, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetPrinterDataW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPrinterDataW`(`hprinter` : `PRINTER_HANDLE`, `pvaluename` : `windows_sys`.`core`.`PCWSTR`, `type` : UInt, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=SetPrinterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPrinterW`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pprinter` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `command` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=SplIsSessionZero; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SplIsSessionZero`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `pissessionzero` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=SplPromptUIInUsersSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SplPromptUIInUsersSession`(`hprinter` : `PRINTER_HANDLE`, `jobid` : UInt, `puiparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`SHOWUIPARAMS`>?, `presponse` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=SpoolerCopyFileEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SpoolerCopyFileEvent`(`pszprintername` : `windows_sys`.`core`.`PCWSTR`, `pszkey` : `windows_sys`.`core`.`PCWSTR`, `dwcopyfileevent` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=SpoolerFindClosePrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SpoolerFindClosePrinterChangeNotification`(`hprinter` : `PRINTER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=SpoolerFindFirstPrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SpoolerFindFirstPrinterChangeNotification`(`hprinter` : `PRINTER_HANDLE`, `fdwfilterflags` : UInt, `fdwoptions` : UInt, `pprinternotifyoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pnotificationconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phnotify` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `phevent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=SpoolerFindNextPrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SpoolerFindNextPrinterChangeNotification`(`hprinter` : `PRINTER_HANDLE`, `pfdwchange` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pprinternotifyoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppprinternotifyinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=SpoolerFreePrinterNotifyInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SpoolerFreePrinterNotifyInfo`(`pinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_INFO`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=SpoolerRefreshPrinterChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SpoolerRefreshPrinterChangeNotification`(`hprinter` : `PRINTER_HANDLE`, `dwcolor` : UInt, `poptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_OPTIONS`>?, `ppinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PRINTER_NOTIFY_INFO`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=StartDocPrinterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StartDocPrinterA`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pdocinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DOC_INFO_1A`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=StartDocPrinterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StartDocPrinterW`(`hprinter` : `PRINTER_HANDLE`, `level` : UInt, `pdocinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DOC_INFO_1W`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=StartPagePrinter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StartPagePrinter`(`hprinter` : `PRINTER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=UnRegisterForPrintAsyncNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnRegisterForPrintAsyncNotifications`(`param0` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=spoolss.dll, ABI=system, export=UpdatePrintDeviceObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdatePrintDeviceObject`(`hprinter` : `PRINTER_HANDLE`, `hdeviceobject` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=UploadPrinterDriverPackageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UploadPrinterDriverPackageA`(`pszserver` : `windows_sys`.`core`.`PCSTR`, `pszinfpath` : `windows_sys`.`core`.`PCSTR`, `pszenvironment` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszdestinfpath` : `windows_sys`.`core`.`PSTR`, `pcchdestinfpath` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=UploadPrinterDriverPackageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UploadPrinterDriverPackageW`(`pszserver` : `windows_sys`.`core`.`PCWSTR`, `pszinfpath` : `windows_sys`.`core`.`PCWSTR`, `pszenvironment` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszdestinfpath` : `windows_sys`.`core`.`PWSTR`, `pcchdestinfpath` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=WaitForPrinterChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WaitForPrinterChange`(`hprinter` : `PRINTER_HANDLE`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=WritePrinter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WritePrinter`(`hprinter` : `PRINTER_HANDLE`, `pbuf` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuf` : UInt, `pcwritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=XcvDataW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XcvDataW`(`hxcv` : `super`.`super`.`Foundation`.`HANDLE`, `pszdataname` : `windows_sys`.`core`.`PCWSTR`, `pinputdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbinputdata` : UInt, `poutputdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cboutputdata` : UInt, `pcboutputneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADDJOB_INFO_1A` (
    public var `Path`: `windows_sys`.`core`.`PSTR`,
    public var `JobId`: UInt,
)
// UNSUPPORTED Rust 246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADDJOB_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADDJOB_INFO_1W` (
    public var `Path`: `windows_sys`.`core`.`PWSTR`,
    public var `JobId`: UInt,
)
// UNSUPPORTED Rust 257:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ATTRIBUTE_INFO_1` (
    public var `dwJobNumberOfPagesPerSide`: UInt,
    public var `dwDrvNumberOfPagesPerSide`: UInt,
    public var `dwNupBorderFlags`: UInt,
    public var `dwJobPageOrderFlags`: UInt,
    public var `dwDrvPageOrderFlags`: UInt,
    public var `dwJobNumberOfCopies`: UInt,
    public var `dwDrvNumberOfCopies`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ATTRIBUTE_INFO_2` (
    public var `dwJobNumberOfPagesPerSide`: UInt,
    public var `dwDrvNumberOfPagesPerSide`: UInt,
    public var `dwNupBorderFlags`: UInt,
    public var `dwJobPageOrderFlags`: UInt,
    public var `dwDrvPageOrderFlags`: UInt,
    public var `dwJobNumberOfCopies`: UInt,
    public var `dwDrvNumberOfCopies`: UInt,
    public var `dwColorOptimization`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ATTRIBUTE_INFO_3` (
    public var `dwJobNumberOfPagesPerSide`: UInt,
    public var `dwDrvNumberOfPagesPerSide`: UInt,
    public var `dwNupBorderFlags`: UInt,
    public var `dwJobPageOrderFlags`: UInt,
    public var `dwDrvPageOrderFlags`: UInt,
    public var `dwJobNumberOfCopies`: UInt,
    public var `dwDrvNumberOfCopies`: UInt,
    public var `dwColorOptimization`: UInt,
    public var `dmPrintQuality`: Short,
    public var `dmYResolution`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ATTRIBUTE_INFO_4` (
    public var `dwJobNumberOfPagesPerSide`: UInt,
    public var `dwDrvNumberOfPagesPerSide`: UInt,
    public var `dwNupBorderFlags`: UInt,
    public var `dwJobPageOrderFlags`: UInt,
    public var `dwDrvPageOrderFlags`: UInt,
    public var `dwJobNumberOfCopies`: UInt,
    public var `dwDrvNumberOfCopies`: UInt,
    public var `dwColorOptimization`: UInt,
    public var `dmPrintQuality`: Short,
    public var `dmYResolution`: Short,
    public var `dwDuplexFlags`: UInt,
    public var `dwNupDirection`: UInt,
    public var `dwBookletFlags`: UInt,
    public var `dwScalingPercentX`: UInt,
    public var `dwScalingPercentY`: UInt,
)
public const val `BIDI_ACCESS_ADMINISTRATOR`: UInt = 1u;
public const val `BIDI_ACCESS_USER`: UInt = 2u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `BIDI_ACTION_ENUM_SCHEMA`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnumSchema");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `BIDI_ACTION_GET`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Get");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `BIDI_ACTION_GET_ALL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GetAll");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `BIDI_ACTION_GET_WITH_ARGUMENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GetWithArgument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `BIDI_ACTION_SET`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Set");
public const val `BIDI_BLOB`: `BIDI_TYPE` = 7;
public const val `BIDI_BOOL`: `BIDI_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BIDI_DATA` (
    public var `dwBidiType`: UInt,
    public var `u`: `BIDI_DATA_0`,
)
// UNSUPPORTED Rust 345:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BIDI_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 350:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BIDI_DATA_0 {
//     pub bData: windows_sys::core::BOOL,
//     pub iData: i32,
//     pub sData: windows_sys::core::PWSTR,
//     pub fData: f32,
//     pub biData: BINARY_CONTAINER,
// }

// UNSUPPORTED Rust 359:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BIDI_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BIDI_ENUM`: `BIDI_TYPE` = 6;
public const val `BIDI_FLOAT`: `BIDI_TYPE` = 2;
public const val `BIDI_INT`: `BIDI_TYPE` = 1;
public const val `BIDI_NULL`: `BIDI_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BIDI_REQUEST_CONTAINER` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `Count`: UInt,
    public var `aData`: Array<`BIDI_REQUEST_DATA`>,
)
// UNSUPPORTED Rust 376:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BIDI_REQUEST_CONTAINER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BIDI_REQUEST_DATA` (
    public var `dwReqNumber`: UInt,
    public var `pSchema`: `windows_sys`.`core`.`PWSTR`,
    public var `data`: `BIDI_DATA`,
)
// UNSUPPORTED Rust 388:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BIDI_REQUEST_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BIDI_RESPONSE_CONTAINER` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `Count`: UInt,
    public var `aData`: Array<`BIDI_RESPONSE_DATA`>,
)
// UNSUPPORTED Rust 401:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BIDI_RESPONSE_CONTAINER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BIDI_RESPONSE_DATA` (
    public var `dwResult`: UInt,
    public var `dwReqNumber`: UInt,
    public var `pSchema`: `windows_sys`.`core`.`PWSTR`,
    public var `data`: `BIDI_DATA`,
)
// UNSUPPORTED Rust 414:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BIDI_RESPONSE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BIDI_STRING`: `BIDI_TYPE` = 4;
public const val `BIDI_TEXT`: `BIDI_TYPE` = 5;
public typealias `BIDI_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BINARY_CONTAINER` (
    public var `cbBuf`: UInt,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BINARY_CONTAINER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BOOKLET_EDGE_LEFT`: UInt = 0u;
public const val `BOOKLET_EDGE_RIGHT`: UInt = 1u;
public const val `BOOKLET_PRINT`: UInt = 2u;
public const val `BORDER_PRINT`: UInt = 0u;
// UNSUPPORTED Rust 437:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BidiRequest: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9162a23_45f9_47cc_80f5_fe0fe9b9e1a2);

// UNSUPPORTED Rust 438:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BidiRequestContainer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc5b8a24_db05_4a01_8388_22edf6c2bbba);

// UNSUPPORTED Rust 439:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BidiSpl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2a614240_a4c5_4c33_bd87_1bc709331639);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BranchOfficeJobData` (
    public var `eEventType`: `EBranchOfficeJobEventType`,
    public var `JobId`: UInt,
    public var `JobInfo`: `BranchOfficeJobData_0`,
)
// UNSUPPORTED Rust 447:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BranchOfficeJobData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 452:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BranchOfficeJobData_0 {
//     pub LogJobPrinted: BranchOfficeJobDataPrinted,
//     pub LogJobRendered: BranchOfficeJobDataRendered,
//     pub LogJobError: BranchOfficeJobDataError,
//     pub LogPipelineFailed: BranchOfficeJobDataPipelineFailed,
//     pub LogOfflineFileFull: BranchOfficeLogOfflineFileFull,
// }

// UNSUPPORTED Rust 461:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BranchOfficeJobData_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BranchOfficeJobDataContainer` (
    public var `cJobDataEntries`: UInt,
    public var `JobData`: Array<`BranchOfficeJobData`>,
)
// UNSUPPORTED Rust 472:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BranchOfficeJobDataContainer {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BranchOfficeJobDataError` (
    public var `LastError`: UInt,
    public var `pDocumentName`: `windows_sys`.`core`.`PWSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDataType`: `windows_sys`.`core`.`PWSTR`,
    public var `TotalSize`: Long,
    public var `PrintedSize`: Long,
    public var `TotalPages`: UInt,
    public var `PrintedPages`: UInt,
    public var `pMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `pJobError`: `windows_sys`.`core`.`PWSTR`,
    public var `pErrorDescription`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 493:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BranchOfficeJobDataError {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BranchOfficeJobDataPipelineFailed` (
    public var `pDocumentName`: `windows_sys`.`core`.`PWSTR`,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `pExtraErrorInfo`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 505:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BranchOfficeJobDataPipelineFailed {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BranchOfficeJobDataPrinted` (
    public var `Status`: UInt,
    public var `pDocumentName`: `windows_sys`.`core`.`PWSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `pPortName`: `windows_sys`.`core`.`PWSTR`,
    public var `Size`: Long,
    public var `TotalPages`: UInt,
)
// UNSUPPORTED Rust 522:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BranchOfficeJobDataPrinted {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BranchOfficeJobDataRendered` (
    public var `Size`: Long,
    public var `ICMMethod`: UInt,
    public var `Color`: Short,
    public var `PrintQuality`: Short,
    public var `YResolution`: Short,
    public var `Copies`: Short,
    public var `TTOption`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BranchOfficeLogOfflineFileFull` (
    public var `pMachineName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 543:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_OEMPTPROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91723892_45d2_48e2_9ec9_562379daf992);

// UNSUPPORTED Rust 582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_OEMRENDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6d6abf26_9f38_11d1_882a_00c04fb961ec);

// UNSUPPORTED Rust 583:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_OEMUI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabce80d7_9f46_11d1_882a_00c04fb961ec);

// UNSUPPORTED Rust 584:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_OEMUIMXDC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e144300_5b43_4288_932a_5e4dd6d82bed);

// UNSUPPORTED Rust 585:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_PTPROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46ac151b_8490_4531_96cc_55bf2bf19e11);

// UNSUPPORTED Rust 586:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_XPSRASTERIZER_FACTORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x503e79bf_1d09_4764_9d72_1eb0c65967c6);

public const val `COLOR_OPTIMIZATION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMPROPSHEETUI` (
    public var `cbSize`: UShort,
    public var `Flags`: UShort,
    public var `hInstCaller`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `pCallerName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `UserData`: ULong,
    public var `pHelpFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pfnCallBack`: `_CPSUICALLBACK`,
    public var `pOptItem`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPTITEM`>?,
    public var `pDlgPage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DLGPAGE`>?,
    public var `cOptItem`: UShort,
    public var `cDlgPage`: UShort,
    public var `IconID`: ULong,
    public var `pOptItemName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `CallerVersion`: UShort,
    public var `OptItemVersion`: UShort,
    public var `dwReserved`: ULongArray,
)
// UNSUPPORTED Rust 609:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for COMPROPSHEETUI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONFIG_INFO_DATA_1` (
    public var `Reserved`: UByteArray,
    public var `dwVersion`: UInt,
)
// UNSUPPORTED Rust 621:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CORE_PRINTER_DRIVERA` (
    public var `CoreDriverGUID`: `windows_sys`.`core`.`GUID`,
    public var `ftDriverDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwlDriverVersion`: ULong,
    public var `szPackageID`: ByteArray,
)
// UNSUPPORTED Rust 641:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CORE_PRINTER_DRIVERA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CORE_PRINTER_DRIVERW` (
    public var `CoreDriverGUID`: `windows_sys`.`core`.`GUID`,
    public var `ftDriverDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwlDriverVersion`: ULong,
    public var `szPackageID`: UShortArray,
)
// UNSUPPORTED Rust 654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CPSUICBPARAM` (
    public var `cbSize`: UShort,
    public var `Reason`: UShort,
    public var `hDlg`: `super`.`super`.`Foundation`.`HWND`,
    public var `pOptItem`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPTITEM`>?,
    public var `cOptItem`: UShort,
    public var `Flags`: UShort,
    public var `pCurItem`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPTITEM`>?,
    public var `Anonymous`: `CPSUICBPARAM_0`,
    public var `UserData`: ULong,
    public var `Result`: ULong,
)
// UNSUPPORTED Rust 707:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for CPSUICBPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 713:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union CPSUICBPARAM_0 {
//     pub OldSel: i32,
//     pub pOldSel: *mut i8,
// }

// UNSUPPORTED Rust 720:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CPSUIDATABLOCK` (
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 749:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CUSTOMSIZEPARAM` (
    public var `dwOrder`: Int,
    public var `lMinVal`: Int,
    public var `lMaxVal`: Int,
)
public const val `Compression_Fast`: `EXpsCompressionOptions` = 3;
public const val `Compression_Normal`: `EXpsCompressionOptions` = 1;
public const val `Compression_NotCompressed`: `EXpsCompressionOptions` = 0;
public const val `Compression_Small`: `EXpsCompressionOptions` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DATATYPES_INFO_1A` (
    public var `pName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 783:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DATATYPES_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DATATYPES_INFO_1W` (
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 793:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DATATYPES_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DATA_HEADER` (
    public var `dwSignature`: UInt,
    public var `wSize`: UShort,
    public var `wDataID`: UShort,
    public var `dwDataSize`: UInt,
    public var `dwReserved`: UInt,
)
public const val `DEF_PRIORITY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 98 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DELETE_PORT_DATA_1` (
    public var `psztPortName`: UShortArray,
    public var `Reserved`: UByteArray,
    public var `dwVersion`: UInt,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 816:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DELETE_PORT_DATA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICEPROPERTYHEADER` (
    public var `cbSize`: UShort,
    public var `Flags`: UShort,
    public var `hPrinter`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pszPrinterName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 829:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICEPROPERTYHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVQUERYPRINT_INFO` (
    public var `cbSize`: UShort,
    public var `Level`: UShort,
    public var `hPrinter`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pszErrorStr`: `windows_sys`.`core`.`PWSTR`,
    public var `cchErrorStr`: UInt,
    public var `cchNeeded`: UInt,
)
// UNSUPPORTED Rust 846:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DLGPAGE` (
    public var `cbSize`: UShort,
    public var `Flags`: UShort,
    public var `DlgProc`: `super`.`super`.`UI`.`WindowsAndMessaging`.`DLGPROC`,
    public var `pTabName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `IconID`: ULong,
    public var `Anonymous`: `DLGPAGE_0`,
)
// UNSUPPORTED Rust 1012:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for DLGPAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1018:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union DLGPAGE_0 {
//     pub DlgTemplateID: u16,
//     pub hDlgTemplate: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1025:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOCEVENT_CREATEDCPRE` (
    public var `pszDriver`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDevice`: `windows_sys`.`core`.`PWSTR`,
    public var `pdm`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?,
    public var `bIC`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 1074:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DOCEVENT_CREATEDCPRE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOCEVENT_ESCAPE` (
    public var `iEscape`: Int,
    public var `cjInput`: Int,
    public var `pvInData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1087:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOCEVENT_ESCAPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOCEVENT_FILTER` (
    public var `cbSize`: UInt,
    public var `cElementsAllocated`: UInt,
    public var `cElementsNeeded`: UInt,
    public var `cElementsReturned`: UInt,
    public var `aDocEventCall`: UIntArray,
)
// UNSUPPORTED Rust 1101:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOCUMENTPROPERTYHEADER` (
    public var `cbSize`: UShort,
    public var `Reserved`: UShort,
    public var `hPrinter`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pszPrinterName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pdmIn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pdmOut`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `cbOut`: UInt,
    public var `fMode`: UInt,
)
// UNSUPPORTED Rust 1154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DOCUMENTPROPERTYHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOC_INFO_1A` (
    public var `pDocName`: `windows_sys`.`core`.`PSTR`,
    public var `pOutputFile`: `windows_sys`.`core`.`PSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1167:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOC_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOC_INFO_1W` (
    public var `pDocName`: `windows_sys`.`core`.`PWSTR`,
    public var `pOutputFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1179:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOC_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOC_INFO_2A` (
    public var `pDocName`: `windows_sys`.`core`.`PSTR`,
    public var `pOutputFile`: `windows_sys`.`core`.`PSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PSTR`,
    public var `dwMode`: UInt,
    public var `JobId`: UInt,
)
// UNSUPPORTED Rust 1193:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOC_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOC_INFO_2W` (
    public var `pDocName`: `windows_sys`.`core`.`PWSTR`,
    public var `pOutputFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PWSTR`,
    public var `dwMode`: UInt,
    public var `JobId`: UInt,
)
// UNSUPPORTED Rust 1207:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOC_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOC_INFO_3A` (
    public var `pDocName`: `windows_sys`.`core`.`PSTR`,
    public var `pOutputFile`: `windows_sys`.`core`.`PSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PSTR`,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 1220:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOC_INFO_3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOC_INFO_3W` (
    public var `pDocName`: `windows_sys`.`core`.`PWSTR`,
    public var `pOutputFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PWSTR`,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 1233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOC_INFO_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOC_INFO_INTERNAL` (
    public var `pDocName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pOutputFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pDatatype`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `bLowILJob`: `windows_sys`.`core`.`BOOL`,
    public var `hTokenLowIL`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 1247:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_1A` (
    public var `pName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1270:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_1W` (
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1280:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_2A` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1295:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_2W` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PWSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PWSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1310:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_3A` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PSTR`,
    public var `pHelpFile`: `windows_sys`.`core`.`PSTR`,
    public var `pDependentFiles`: `windows_sys`.`core`.`PSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PSTR`,
    public var `pDefaultDataType`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1329:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_3W` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PWSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PWSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pHelpFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pDependentFiles`: `windows_sys`.`core`.`PWSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDefaultDataType`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_4A` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PSTR`,
    public var `pHelpFile`: `windows_sys`.`core`.`PSTR`,
    public var `pDependentFiles`: `windows_sys`.`core`.`PSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PSTR`,
    public var `pDefaultDataType`: `windows_sys`.`core`.`PSTR`,
    public var `pszzPreviousNames`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1368:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_4A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_4W` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PWSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PWSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pHelpFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pDependentFiles`: `windows_sys`.`core`.`PWSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDefaultDataType`: `windows_sys`.`core`.`PWSTR`,
    public var `pszzPreviousNames`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1388:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_4W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_5A` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PSTR`,
    public var `dwDriverAttributes`: UInt,
    public var `dwConfigVersion`: UInt,
    public var `dwDriverVersion`: UInt,
)
// UNSUPPORTED Rust 1406:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_5A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_5W` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PWSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PWSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PWSTR`,
    public var `dwDriverAttributes`: UInt,
    public var `dwConfigVersion`: UInt,
    public var `dwDriverVersion`: UInt,
)
// UNSUPPORTED Rust 1424:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_5W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_6A` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PSTR`,
    public var `pHelpFile`: `windows_sys`.`core`.`PSTR`,
    public var `pDependentFiles`: `windows_sys`.`core`.`PSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PSTR`,
    public var `pDefaultDataType`: `windows_sys`.`core`.`PSTR`,
    public var `pszzPreviousNames`: `windows_sys`.`core`.`PSTR`,
    public var `ftDriverDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwlDriverVersion`: ULong,
    public var `pszMfgName`: `windows_sys`.`core`.`PSTR`,
    public var `pszOEMUrl`: `windows_sys`.`core`.`PSTR`,
    public var `pszHardwareID`: `windows_sys`.`core`.`PSTR`,
    public var `pszProvider`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1450:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_6A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_6W` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PWSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PWSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pHelpFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pDependentFiles`: `windows_sys`.`core`.`PWSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDefaultDataType`: `windows_sys`.`core`.`PWSTR`,
    public var `pszzPreviousNames`: `windows_sys`.`core`.`PWSTR`,
    public var `ftDriverDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwlDriverVersion`: ULong,
    public var `pszMfgName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszOEMUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `pszHardwareID`: `windows_sys`.`core`.`PWSTR`,
    public var `pszProvider`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1476:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_6W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_8A` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PSTR`,
    public var `pHelpFile`: `windows_sys`.`core`.`PSTR`,
    public var `pDependentFiles`: `windows_sys`.`core`.`PSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PSTR`,
    public var `pDefaultDataType`: `windows_sys`.`core`.`PSTR`,
    public var `pszzPreviousNames`: `windows_sys`.`core`.`PSTR`,
    public var `ftDriverDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwlDriverVersion`: ULong,
    public var `pszMfgName`: `windows_sys`.`core`.`PSTR`,
    public var `pszOEMUrl`: `windows_sys`.`core`.`PSTR`,
    public var `pszHardwareID`: `windows_sys`.`core`.`PSTR`,
    public var `pszProvider`: `windows_sys`.`core`.`PSTR`,
    public var `pszPrintProcessor`: `windows_sys`.`core`.`PSTR`,
    public var `pszVendorSetup`: `windows_sys`.`core`.`PSTR`,
    public var `pszzColorProfiles`: `windows_sys`.`core`.`PSTR`,
    public var `pszInfPath`: `windows_sys`.`core`.`PSTR`,
    public var `dwPrinterDriverAttributes`: UInt,
    public var `pszzCoreDriverDependencies`: `windows_sys`.`core`.`PSTR`,
    public var `ftMinInboxDriverVerDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwlMinInboxDriverVerVersion`: ULong,
)
// UNSUPPORTED Rust 1510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_8A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_INFO_8W` (
    public var `cVersion`: UInt,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PWSTR`,
    public var `pDriverPath`: `windows_sys`.`core`.`PWSTR`,
    public var `pDataFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pConfigFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pHelpFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pDependentFiles`: `windows_sys`.`core`.`PWSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDefaultDataType`: `windows_sys`.`core`.`PWSTR`,
    public var `pszzPreviousNames`: `windows_sys`.`core`.`PWSTR`,
    public var `ftDriverDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwlDriverVersion`: ULong,
    public var `pszMfgName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszOEMUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `pszHardwareID`: `windows_sys`.`core`.`PWSTR`,
    public var `pszProvider`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPrintProcessor`: `windows_sys`.`core`.`PWSTR`,
    public var `pszVendorSetup`: `windows_sys`.`core`.`PWSTR`,
    public var `pszzColorProfiles`: `windows_sys`.`core`.`PWSTR`,
    public var `pszInfPath`: `windows_sys`.`core`.`PWSTR`,
    public var `dwPrinterDriverAttributes`: UInt,
    public var `pszzCoreDriverDependencies`: `windows_sys`.`core`.`PWSTR`,
    public var `ftMinInboxDriverVerDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwlMinInboxDriverVerVersion`: ULong,
)
// UNSUPPORTED Rust 1544:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_INFO_8W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DRIVER_KERNELMODE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_UPGRADE_INFO_1` (
    public var `pPrinterName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pOldDriverDirectory`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 1556:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVER_UPGRADE_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_UPGRADE_INFO_2` (
    public var `pPrinterName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pOldDriverDirectory`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `cVersion`: UInt,
    public var `pName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pEnvironment`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pDriverPath`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pDataFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pConfigFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pHelpFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pDependentFiles`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pMonitorName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pDefaultDataType`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszzPreviousNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `EMFPLAYPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`Gdi`.`HDC`, Int, `super`.`super`.`Foundation`.`HANDLE`) -> Int>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXTCHKBOX` (
    public var `cbSize`: UShort,
    public var `Flags`: UShort,
    public var `pTitle`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pSeparator`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pCheckedName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `IconID`: ULong,
    public var `wReserved`: UShortArray,
    public var `dwReserved`: ULongArray,
)
// UNSUPPORTED Rust 1692:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EXTCHKBOX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXTPUSH` (
    public var `cbSize`: UShort,
    public var `Flags`: UShort,
    public var `pTitle`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `Anonymous1`: `EXTPUSH_0`,
    public var `IconID`: ULong,
    public var `Anonymous2`: `EXTPUSH_1`,
    public var `dwReserved`: ULongArray,
)
// UNSUPPORTED Rust 1709:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for EXTPUSH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1715:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union EXTPUSH_0 {
//     pub DlgProc: super::super::UI::WindowsAndMessaging::DLGPROC,
//     pub pfnCallBack: super::super::Foundation::FARPROC,
// }

// UNSUPPORTED Rust 1722:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for EXTPUSH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1728:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union EXTPUSH_1 {
//     pub DlgTemplateID: u16,
//     pub hDlgTemplate: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1735:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for EXTPUSH_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EXTTEXTMETRIC` (
    public var `emSize`: Short,
    public var `emPointSize`: Short,
    public var `emOrientation`: Short,
    public var `emMasterHeight`: Short,
    public var `emMinScale`: Short,
    public var `emMaxScale`: Short,
    public var `emMasterUnits`: Short,
    public var `emCapHeight`: Short,
    public var `emXHeight`: Short,
    public var `emLowerCaseAscent`: Short,
    public var `emLowerCaseDescent`: Short,
    public var `emSlant`: Short,
    public var `emSuperScript`: Short,
    public var `emSubScript`: Short,
    public var `emSuperScriptSize`: Short,
    public var `emSubScriptSize`: Short,
    public var `emUnderlineOffset`: Short,
    public var `emUnderlineWidth`: Short,
    public var `emDoubleUpperUnderlineOffset`: Short,
    public var `emDoubleLowerUnderlineOffset`: Short,
    public var `emDoubleUpperUnderlineWidth`: Short,
    public var `emDoubleLowerUnderlineWidth`: Short,
    public var `emStrikeOutOffset`: Short,
    public var `emStrikeOutWidth`: Short,
    public var `emKernPairs`: UShort,
    public var `emKernTracks`: UShort,
)
public typealias `EXpsCompressionOptions` = Int;
public typealias `EXpsFontOptions` = Int;
public typealias `EXpsFontRestriction` = Int;
public typealias `EXpsJobConsumption` = Int;
public const val `E_VERSION_NOT_SUPPORTED`: UInt = 2147745793u;
public const val `FG_CANCHANGE`: UInt = 128u;
public const val `FILL_WITH_DEFAULTS`: UInt = 1u;
// UNSUPPORTED Rust 1778:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FORM_INFO_1A` (
    public var `Flags`: UInt,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `Size`: `super`.`super`.`Foundation`.`SIZE`,
    public var `ImageableArea`: `super`.`super`.`Foundation`.`RECTL`,
)
// UNSUPPORTED Rust 1812:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FORM_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FORM_INFO_1W` (
    public var `Flags`: UInt,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `Size`: `super`.`super`.`Foundation`.`SIZE`,
    public var `ImageableArea`: `super`.`super`.`Foundation`.`RECTL`,
)
// UNSUPPORTED Rust 1825:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FORM_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FORM_INFO_2A` (
    public var `Flags`: UInt,
    public var `pName`: `windows_sys`.`core`.`PCSTR`,
    public var `Size`: `super`.`super`.`Foundation`.`SIZE`,
    public var `ImageableArea`: `super`.`super`.`Foundation`.`RECTL`,
    public var `pKeyword`: `windows_sys`.`core`.`PCSTR`,
    public var `StringType`: UInt,
    public var `pMuiDll`: `windows_sys`.`core`.`PCSTR`,
    public var `dwResourceId`: UInt,
    public var `pDisplayName`: `windows_sys`.`core`.`PCSTR`,
    public var `wLangId`: UShort,
)
// UNSUPPORTED Rust 1844:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FORM_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FORM_INFO_2W` (
    public var `Flags`: UInt,
    public var `pName`: `windows_sys`.`core`.`PCWSTR`,
    public var `Size`: `super`.`super`.`Foundation`.`SIZE`,
    public var `ImageableArea`: `super`.`super`.`Foundation`.`RECTL`,
    public var `pKeyword`: `windows_sys`.`core`.`PCSTR`,
    public var `StringType`: UInt,
    public var `pMuiDll`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwResourceId`: UInt,
    public var `pDisplayName`: `windows_sys`.`core`.`PCWSTR`,
    public var `wLangId`: UShort,
)
// UNSUPPORTED Rust 1863:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GLYPHRUN` (
    public var `wcLow`: UShort,
    public var `wGlyphCount`: UShort,
)
public const val `GPD_OEMCUSTOMDATA`: UInt = 1u;
// UNSUPPORTED Rust 1880:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_IPPUSB_PRINT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2f40381_f46d_4e51_bce7_62de6cf2d098);

// UNSUPPORTED Rust 1881:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INSERTPSUIPAGE_INFO` (
    public var `cbSize`: UShort,
    public var `Type`: UByte,
    public var `Mode`: UByte,
    public var `dwData1`: ULong,
    public var `dwData2`: ULong,
    public var `dwData3`: ULong,
)
public const val `INSPSUIPAGE_MODE_AFTER`: UInt = 1u;
public const val `INSPSUIPAGE_MODE_BEFORE`: UInt = 0u;
public const val `INSPSUIPAGE_MODE_FIRST_CHILD`: UInt = 2u;
public const val `INSPSUIPAGE_MODE_INDEX`: UInt = 4u;
public const val `INSPSUIPAGE_MODE_LAST_CHILD`: UInt = 3u;
public const val `INTERNAL_NOTIFICATION_QUEUE_IS_FULL`: `PrintAsyncNotifyError` = 19;
public const val `INVALID_NOTIFICATION_TYPE`: `PrintAsyncNotifyError` = 20;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INVOC` (
    public var `dwCount`: UInt,
    public var `loOffset`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ImgErrorInfo` (
    public var `description`: `windows_sys`.`core`.`BSTR`,
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `helpContext`: UInt,
    public var `helpFile`: `windows_sys`.`core`.`BSTR`,
    public var `source`: `windows_sys`.`core`.`BSTR`,
    public var `devDescription`: `windows_sys`.`core`.`BSTR`,
    public var `errorID`: `windows_sys`.`core`.`GUID`,
    public var `cUserParameters`: UInt,
    public var `aUserParameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?,
    public var `userFallback`: `windows_sys`.`core`.`BSTR`,
    public var `exceptionID`: UInt,
)
// UNSUPPORTED Rust 2241:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOB_INFO_1A` (
    public var `JobId`: UInt,
    public var `pPrinterName`: `windows_sys`.`core`.`PSTR`,
    public var `pMachineName`: `windows_sys`.`core`.`PSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PSTR`,
    public var `pDocument`: `windows_sys`.`core`.`PSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PSTR`,
    public var `pStatus`: `windows_sys`.`core`.`PSTR`,
    public var `Status`: UInt,
    public var `Priority`: UInt,
    public var `Position`: UInt,
    public var `TotalPages`: UInt,
    public var `PagesPrinted`: UInt,
    public var `Submitted`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
)
// UNSUPPORTED Rust 2276:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOB_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOB_INFO_1W` (
    public var `JobId`: UInt,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `pMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDocument`: `windows_sys`.`core`.`PWSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PWSTR`,
    public var `pStatus`: `windows_sys`.`core`.`PWSTR`,
    public var `Status`: UInt,
    public var `Priority`: UInt,
    public var `Position`: UInt,
    public var `TotalPages`: UInt,
    public var `PagesPrinted`: UInt,
    public var `Submitted`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
)
// UNSUPPORTED Rust 2298:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOB_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOB_INFO_2A` (
    public var `JobId`: UInt,
    public var `pPrinterName`: `windows_sys`.`core`.`PSTR`,
    public var `pMachineName`: `windows_sys`.`core`.`PSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PSTR`,
    public var `pDocument`: `windows_sys`.`core`.`PSTR`,
    public var `pNotifyName`: `windows_sys`.`core`.`PSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PSTR`,
    public var `pPrintProcessor`: `windows_sys`.`core`.`PSTR`,
    public var `pParameters`: `windows_sys`.`core`.`PSTR`,
    public var `pDriverName`: `windows_sys`.`core`.`PSTR`,
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pStatus`: `windows_sys`.`core`.`PSTR`,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `Status`: UInt,
    public var `Priority`: UInt,
    public var `Position`: UInt,
    public var `StartTime`: UInt,
    public var `UntilTime`: UInt,
    public var `TotalPages`: UInt,
    public var `Size`: UInt,
    public var `Submitted`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `Time`: UInt,
    public var `PagesPrinted`: UInt,
)
// UNSUPPORTED Rust 2331:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for JOB_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOB_INFO_2W` (
    public var `JobId`: UInt,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `pMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDocument`: `windows_sys`.`core`.`PWSTR`,
    public var `pNotifyName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PWSTR`,
    public var `pPrintProcessor`: `windows_sys`.`core`.`PWSTR`,
    public var `pParameters`: `windows_sys`.`core`.`PWSTR`,
    public var `pDriverName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?,
    public var `pStatus`: `windows_sys`.`core`.`PWSTR`,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `Status`: UInt,
    public var `Priority`: UInt,
    public var `Position`: UInt,
    public var `StartTime`: UInt,
    public var `UntilTime`: UInt,
    public var `TotalPages`: UInt,
    public var `Size`: UInt,
    public var `Submitted`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `Time`: UInt,
    public var `PagesPrinted`: UInt,
)
// UNSUPPORTED Rust 2365:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for JOB_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOB_INFO_3` (
    public var `JobId`: UInt,
    public var `NextJobId`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOB_INFO_4A` (
    public var `JobId`: UInt,
    public var `pPrinterName`: `windows_sys`.`core`.`PSTR`,
    public var `pMachineName`: `windows_sys`.`core`.`PSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PSTR`,
    public var `pDocument`: `windows_sys`.`core`.`PSTR`,
    public var `pNotifyName`: `windows_sys`.`core`.`PSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PSTR`,
    public var `pPrintProcessor`: `windows_sys`.`core`.`PSTR`,
    public var `pParameters`: `windows_sys`.`core`.`PSTR`,
    public var `pDriverName`: `windows_sys`.`core`.`PSTR`,
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pStatus`: `windows_sys`.`core`.`PSTR`,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `Status`: UInt,
    public var `Priority`: UInt,
    public var `Position`: UInt,
    public var `StartTime`: UInt,
    public var `UntilTime`: UInt,
    public var `TotalPages`: UInt,
    public var `Size`: UInt,
    public var `Submitted`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `Time`: UInt,
    public var `PagesPrinted`: UInt,
    public var `SizeHigh`: Int,
)
// UNSUPPORTED Rust 2407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for JOB_INFO_4A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOB_INFO_4W` (
    public var `JobId`: UInt,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `pMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDocument`: `windows_sys`.`core`.`PWSTR`,
    public var `pNotifyName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PWSTR`,
    public var `pPrintProcessor`: `windows_sys`.`core`.`PWSTR`,
    public var `pParameters`: `windows_sys`.`core`.`PWSTR`,
    public var `pDriverName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?,
    public var `pStatus`: `windows_sys`.`core`.`PWSTR`,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `Status`: UInt,
    public var `Priority`: UInt,
    public var `Position`: UInt,
    public var `StartTime`: UInt,
    public var `UntilTime`: UInt,
    public var `TotalPages`: UInt,
    public var `Size`: UInt,
    public var `Submitted`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `Time`: UInt,
    public var `PagesPrinted`: UInt,
    public var `SizeHigh`: Int,
)
// UNSUPPORTED Rust 2442:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Display")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERNDATA` (
    public var `dwSize`: UInt,
    public var `dwKernPairNum`: UInt,
    public var `KernPair`: Array<`super`.`super`.`Devices`.`Display`.`FD_KERNINGPAIR`>,
)
// UNSUPPORTED Rust 2498:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Devices_Display")]
// impl Default for KERNDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOCAL_ONLY_REGISTRATION`: `PrintAsyncNotifyError` = 23;
public const val `LPR`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MAPTABLE` (
    public var `dwSize`: UInt,
    public var `dwGlyphNum`: UInt,
    public var `Trans`: Array<`TRANSDATA`>,
)
// UNSUPPORTED Rust 2513:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MESSAGEBOX_PARAMS` (
    public var `cbSize`: UInt,
    public var `pTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `pMessage`: `windows_sys`.`core`.`PWSTR`,
    public var `Style`: UInt,
    public var `dwTimeout`: UInt,
    public var `bWait`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 2546:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MESSAGEBOX_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIN_PRIORITY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MONITOR` (
    public var `pfnEnumPorts`: `PFN_PRINTING_ENUMPORTS`,
    public var `pfnOpenPort`: `PFN_PRINTING_OPENPORT`,
    public var `pfnOpenPortEx`: `PFN_PRINTING_OPENPORTEX`,
    public var `pfnStartDocPort`: `PFN_PRINTING_STARTDOCPORT`,
    public var `pfnWritePort`: `PFN_PRINTING_WRITEPORT`,
    public var `pfnReadPort`: `PFN_PRINTING_READPORT`,
    public var `pfnEndDocPort`: `PFN_PRINTING_ENDDOCPORT`,
    public var `pfnClosePort`: `PFN_PRINTING_CLOSEPORT`,
    public var `pfnAddPort`: `PFN_PRINTING_ADDPORT`,
    public var `pfnAddPortEx`: `PFN_PRINTING_ADDPORTEX`,
    public var `pfnConfigurePort`: `PFN_PRINTING_CONFIGUREPORT`,
    public var `pfnDeletePort`: `PFN_PRINTING_DELETEPORT`,
    public var `pfnGetPrinterDataFromPort`: `PFN_PRINTING_GETPRINTERDATAFROMPORT`,
    public var `pfnSetPortTimeOuts`: `PFN_PRINTING_SETPORTTIMEOUTS`,
    public var `pfnXcvOpenPort`: `PFN_PRINTING_XCVOPENPORT`,
    public var `pfnXcvDataPort`: `PFN_PRINTING_XCVDATAPORT`,
    public var `pfnXcvClosePort`: `PFN_PRINTING_XCVCLOSEPORT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MONITOR2` (
    public var `cbSize`: UInt,
    public var `pfnEnumPorts`: `PFN_PRINTING_ENUMPORTS2`,
    public var `pfnOpenPort`: `PFN_PRINTING_OPENPORT2`,
    public var `pfnOpenPortEx`: `PFN_PRINTING_OPENPORTEX2`,
    public var `pfnStartDocPort`: `PFN_PRINTING_STARTDOCPORT2`,
    public var `pfnWritePort`: `PFN_PRINTING_WRITEPORT2`,
    public var `pfnReadPort`: `PFN_PRINTING_READPORT2`,
    public var `pfnEndDocPort`: `PFN_PRINTING_ENDDOCPORT2`,
    public var `pfnClosePort`: `PFN_PRINTING_CLOSEPORT2`,
    public var `pfnAddPort`: `PFN_PRINTING_ADDPORT2`,
    public var `pfnAddPortEx`: `PFN_PRINTING_ADDPORTEX2`,
    public var `pfnConfigurePort`: `PFN_PRINTING_CONFIGUREPORT2`,
    public var `pfnDeletePort`: `PFN_PRINTING_DELETEPORT2`,
    public var `pfnGetPrinterDataFromPort`: `PFN_PRINTING_GETPRINTERDATAFROMPORT2`,
    public var `pfnSetPortTimeOuts`: `PFN_PRINTING_SETPORTTIMEOUTS2`,
    public var `pfnXcvOpenPort`: `PFN_PRINTING_XCVOPENPORT2`,
    public var `pfnXcvDataPort`: `PFN_PRINTING_XCVDATAPORT2`,
    public var `pfnXcvClosePort`: `PFN_PRINTING_XCVCLOSEPORT2`,
    public var `pfnShutdown`: `PFN_PRINTING_SHUTDOWN2`,
    public var `pfnSendRecvBidiDataFromPort`: `PFN_PRINTING_SENDRECVBIDIDATAFROMPORT2`,
    public var `pfnNotifyUsedPorts`: `PFN_PRINTING_NOTIFYUSEDPORTS2`,
    public var `pfnNotifyUnusedPorts`: `PFN_PRINTING_NOTIFYUNUSEDPORTS2`,
    public var `pfnPowerEvent`: `PFN_PRINTING_POWEREVENT2`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MONITOREX` (
    public var `dwMonitorSize`: UInt,
    public var `Monitor`: `MONITOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONITORINIT` (
    public var `cbSize`: UInt,
    public var `hSpooler`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hckRegistryRoot`: `super`.`super`.`System`.`Registry`.`HKEY`,
    public var `pMonitorReg`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MONITORREG`>?,
    public var `bLocal`: `windows_sys`.`core`.`BOOL`,
    public var `pszServerName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 2620:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for MONITORINIT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MONITORREG` (
    public var `cbSize`: UInt,
    public var `fpCreateKey`: Long,
    public var `fpOpenKey`: Long,
    public var `fpCloseKey`: Long,
    public var `fpDeleteKey`: Long,
    public var `fpEnumKey`: Long,
    public var `fpQueryInfoKey`: Long,
    public var `fpSetValue`: Long,
    public var `fpDeleteValue`: Long,
    public var `fpEnumValue`: Long,
    public var `fpQueryValue`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MONITORUI` (
    public var `dwMonitorUISize`: UInt,
    public var `pfnAddPortUI`: Long,
    public var `pfnConfigurePortUI`: Long,
    public var `pfnDeletePortUI`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONITOR_INFO_1A` (
    public var `pName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 2654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MONITOR_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONITOR_INFO_1W` (
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2664:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MONITOR_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONITOR_INFO_2A` (
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PSTR`,
    public var `pDLLName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 2676:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MONITOR_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONITOR_INFO_2W` (
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PWSTR`,
    public var `pDLLName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2688:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MONITOR_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MS_PRINT_JOB_OUTPUT_FILE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MsPrintJobOutputFile");
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MXDC_ESCAPE_HEADER_T` (
    public var `cbInput`: UInt,
    public var `cbOutput`: UInt,
    public var `opCode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MXDC_GET_FILENAME_DATA_T` (
    public var `cbOutput`: UInt,
    public var `wszData`: UShortArray,
)
// UNSUPPORTED Rust 2732:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MXDC_PRINTTICKET_DATA_T` (
    public var `dwDataSize`: UInt,
    public var `bData`: UByteArray,
)
// UNSUPPORTED Rust 2752:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MXDC_PRINTTICKET_DATA_T {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MXDC_PRINTTICKET_ESCAPE_T` (
    public var `mxdcEscape`: `MXDC_ESCAPE_HEADER_T`,
    public var `printTicketData`: `MXDC_PRINTTICKET_DATA_T`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MXDC_S0PAGE_DATA_T` (
    public var `dwSize`: UInt,
    public var `bData`: UByteArray,
)
// UNSUPPORTED Rust 2779:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MXDC_S0PAGE_DATA_T {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MXDC_S0PAGE_PASSTHROUGH_ESCAPE_T` (
    public var `mxdcEscape`: `MXDC_ESCAPE_HEADER_T`,
    public var `xpsS0PageData`: `MXDC_S0PAGE_DATA_T`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MXDC_S0PAGE_RESOURCE_ESCAPE_T` (
    public var `mxdcEscape`: `MXDC_ESCAPE_HEADER_T`,
    public var `xpsS0PageResourcePassthrough`: `MXDC_XPS_S0PAGE_RESOURCE_T`,
)
public typealias `MXDC_S0_PAGE_ENUMS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MXDC_XPS_S0PAGE_RESOURCE_T` (
    public var `dwSize`: UInt,
    public var `dwResourceType`: UInt,
    public var `szUri`: UByteArray,
    public var `dwDataSize`: UInt,
    public var `bData`: UByteArray,
)
// UNSUPPORTED Rust 2806:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NOTIFICATION_CONFIG_1` (
    public var `cbSize`: UInt,
    public var `fdwFlags`: UInt,
    public var `pfnNotifyCallback`: `ROUTER_NOTIFY_CALLBACK`,
    public var `pContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2824:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 2834:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NOTIFICATION_RELEASE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba9a5027_a70e_4ae7_9b7d_eb3e06ad4157);

public const val `NOT_REGISTERED`: `PrintAsyncNotifyError` = 13;
public const val `NO_BORDER_PRINT`: UInt = 1u;
public const val `NO_COLOR_OPTIMIZATION`: UInt = 0u;
public const val `NO_LISTENERS`: `PrintAsyncNotifyError` = 7;
public const val `NO_PRIORITY`: UInt = 0u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
public typealias `OEMCUIPCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CPSUICBPARAM`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`OEMCUIPPARAM`>?) -> Int>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OEMCUIPPARAM` (
    public var `cbSize`: UInt,
    public var `poemuiobj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OEMUIOBJ`>?,
    public var `hPrinter`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `hModule`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hOEMHeap`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pPublicDM`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pOEMDM`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwFlags`: UInt,
    public var `pDrvOptItems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPTITEM`>?,
    public var `cDrvOptItems`: UInt,
    public var `pOEMOptItems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPTITEM`>?,
    public var `cOEMOptItems`: UInt,
    public var `pOEMUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OEMCUIPCallback`: `OEMCUIPCALLBACK`,
)
// UNSUPPORTED Rust 2862:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OEMCUIPPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OEMCUIP_DOCPROP`: UInt = 1u;
public const val `OEMCUIP_PRNPROP`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OEMDMPARAM` (
    public var `cbSize`: UInt,
    public var `pdriverobj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hPrinter`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hModule`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pPublicDMIn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pPublicDMOut`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pOEMDMIn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pOEMDMOut`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbBufSize`: UInt,
)
// UNSUPPORTED Rust 2884:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OEMFONTINSTPARAM` (
    public var `cbSize`: UInt,
    public var `hPrinter`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hModule`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hHeap`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwFlags`: UInt,
    public var `pFontInstallerName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2904:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OEMUIOBJ` (
    public var `cbSize`: UInt,
    public var `pOemUIProcs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OEMUIPROCS`>?,
)
// UNSUPPORTED Rust 2944:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OEMUIOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OEMUIPROCS` (
    public var `DrvGetDriverSetting`: `PFN_DrvGetDriverSetting`,
    public var `DrvUpdateUISetting`: `PFN_DrvUpdateUISetting`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OEMUIPSPARAM` (
    public var `cbSize`: UInt,
    public var `poemuiobj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OEMUIOBJ`>?,
    public var `hPrinter`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `hModule`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hOEMHeap`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pPublicDM`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pOEMDM`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pOEMUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwFlags`: UInt,
    public var `pOemEntry`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2971:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for OEMUIPSPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OEM_DMEXTRAHEADER` (
    public var `dwSize`: UInt,
    public var `dwSignature`: UInt,
    public var `dwVersion`: UInt,
)
public const val `OEM_MODE_PUBLISHER`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OIEXT` (
    public var `cbSize`: UShort,
    public var `Flags`: UShort,
    public var `hInstCaller`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `pHelpFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `dwReserved`: ULongArray,
)
// UNSUPPORTED Rust 2994:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OIEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OIEXTF_ANSI_STRING`: UInt = 1u;
public const val `OPTCF_HIDE`: UInt = 1u;
public const val `OPTCF_MASK`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPTCOMBO` (
    public var `cbSize`: UShort,
    public var `Flags`: UByte,
    public var `cListItem`: UShort,
    public var `pListItem`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPTPARAM`>?,
    public var `Sel`: Int,
    public var `dwReserved`: UIntArray,
)
// UNSUPPORTED Rust 3012:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPTITEM` (
    public var `cbSize`: UShort,
    public var `Level`: UByte,
    public var `DlgPageIdx`: UByte,
    public var `Flags`: UInt,
    public var `UserData`: ULong,
    public var `pName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `Anonymous1`: `OPTITEM_0`,
    public var `Anonymous2`: `OPTITEM_1`,
    public var `pOptType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPTTYPE`>?,
    public var `HelpIndex`: UInt,
    public var `DMPubID`: UByte,
    public var `UserItemID`: UByte,
    public var `wReserved`: UShort,
    public var `pOIExt`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OIEXT`>?,
    public var `dwReserved`: ULongArray,
)
// UNSUPPORTED Rust 3055:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPTITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3061:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union OPTITEM_0 {
//     pub Sel: i32,
//     pub pSel: *mut i8,
// }

// UNSUPPORTED Rust 3068:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPTITEM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3074:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union OPTITEM_1 {
//     pub pExtChkBox: *mut EXTCHKBOX,
//     pub pExtPush: *mut EXTPUSH,
// }

// UNSUPPORTED Rust 3081:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPTITEM_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPTPARAM` (
    public var `cbSize`: UShort,
    public var `Flags`: UByte,
    public var `Style`: UByte,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `IconID`: ULong,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwReserved`: ULongArray,
)
// UNSUPPORTED Rust 3098:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPTTYPE` (
    public var `cbSize`: UShort,
    public var `Type`: UByte,
    public var `Flags`: UByte,
    public var `Count`: UShort,
    public var `BegCtrlID`: UShort,
    public var `pOptParam`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPTPARAM`>?,
    public var `Style`: UShort,
    public var `wReserved`: UShortArray,
    public var `dwReserved`: ULongArray,
)
// UNSUPPORTED Rust 3127:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNCOMPROPSHEET` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, `super`.`super`.`Foundation`.`LPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> Long>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNPROPSHEETUI` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`PROPSHEETUI_INFO`>?, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvGetDriverSetting` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvUpdateUISetting` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvUpgradeRegistrySetting` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_ADDPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_ADDPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_ADDPORTEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_ADDPORTEX2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_CLOSEPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_CLOSEPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_CONFIGUREPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_CONFIGUREPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_DELETEPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_DELETEPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_ENDDOCPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_ENDDOCPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_ENUMPORTS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_ENUMPORTS2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_GETPRINTERDATAFROMPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_GETPRINTERDATAFROMPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_NOTIFYUNUSEDPORTS2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, `windows_sys`.`core`.`PCWSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_NOTIFYUSEDPORTS2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, `windows_sys`.`core`.`PCWSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_OPENPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_OPENPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
public typealias `PFN_PRINTING_OPENPORTEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MONITOR2`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Devices_Communication", feature = "Win32_System_Power"))]
public typealias `PFN_PRINTING_OPENPORTEX2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MONITOR2`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Power")]
public typealias `PFN_PRINTING_POWEREVENT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Power`.`POWERBROADCAST_SETTING`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_READPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_READPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_SENDRECVBIDIDATAFROMPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`BIDI_REQUEST_CONTAINER`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`BIDI_RESPONSE_CONTAINER`>>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Communication")]
public typealias `PFN_PRINTING_SETPORTTIMEOUTS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Devices`.`Communication`.`COMMTIMEOUTS`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Communication")]
public typealias `PFN_PRINTING_SETPORTTIMEOUTS2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Devices`.`Communication`.`COMMTIMEOUTS`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_SHUTDOWN2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_STARTDOCPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_STARTDOCPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_WRITEPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_WRITEPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_XCVCLOSEPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_XCVCLOSEPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_XCVDATAPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_XCVDATAPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_XCVOPENPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_PRINTING_XCVOPENPORT2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 49 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 33 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 540 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PORT_DATA_1` (
    public var `sztPortName`: UShortArray,
    public var `dwVersion`: UInt,
    public var `dwProtocol`: UInt,
    public var `cbSize`: UInt,
    public var `dwReserved`: UInt,
    public var `sztHostAddress`: UShortArray,
    public var `sztSNMPCommunity`: UShortArray,
    public var `dwDoubleSpool`: UInt,
    public var `sztQueue`: UShortArray,
    public var `sztIPAddress`: UShortArray,
    public var `Reserved`: UByteArray,
    public var `dwPortNumber`: UInt,
    public var `dwSNMPEnabled`: UInt,
    public var `dwSNMPDevIndex`: UInt,
)
// UNSUPPORTED Rust 3211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PORT_DATA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 33 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 514 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PORT_DATA_2` (
    public var `sztPortName`: UShortArray,
    public var `dwVersion`: UInt,
    public var `dwProtocol`: UInt,
    public var `cbSize`: UInt,
    public var `dwReserved`: UInt,
    public var `sztHostAddress`: UShortArray,
    public var `sztSNMPCommunity`: UShortArray,
    public var `dwDoubleSpool`: UInt,
    public var `sztQueue`: UShortArray,
    public var `Reserved`: UByteArray,
    public var `dwPortNumber`: UInt,
    public var `dwSNMPEnabled`: UInt,
    public var `dwSNMPDevIndex`: UInt,
    public var `dwPortMonitorMibIndex`: UInt,
)
// UNSUPPORTED Rust 3234:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PORT_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PORT_DATA_LIST_1` (
    public var `dwVersion`: UInt,
    public var `cPortData`: UInt,
    public var `pPortData`: Array<`PORT_DATA_2`>,
)
// UNSUPPORTED Rust 3246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PORT_DATA_LIST_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PORT_INFO_1A` (
    public var `pName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 3256:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PORT_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PORT_INFO_1W` (
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3266:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PORT_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PORT_INFO_2A` (
    public var `pPortName`: `windows_sys`.`core`.`PSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PSTR`,
    public var `pDescription`: `windows_sys`.`core`.`PSTR`,
    public var `fPortType`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 3280:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PORT_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PORT_INFO_2W` (
    public var `pPortName`: `windows_sys`.`core`.`PWSTR`,
    public var `pMonitorName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `fPortType`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 3294:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PORT_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PORT_INFO_3A` (
    public var `dwStatus`: UInt,
    public var `pszStatus`: `windows_sys`.`core`.`PSTR`,
    public var `dwSeverity`: UInt,
)
// UNSUPPORTED Rust 3306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PORT_INFO_3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PORT_INFO_3W` (
    public var `dwStatus`: UInt,
    public var `pszStatus`: `windows_sys`.`core`.`PWSTR`,
    public var `dwSeverity`: UInt,
)
// UNSUPPORTED Rust 3318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_CONNECTION_INFO_1A` (
    public var `dwFlags`: UInt,
    public var `pszDriverName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 3409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_CONNECTION_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_CONNECTION_INFO_1W` (
    public var `dwFlags`: UInt,
    public var `pszDriverName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3420:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_DEFAULTSA` (
    public var `pDatatype`: `windows_sys`.`core`.`PSTR`,
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `DesiredAccess`: `PRINTER_ACCESS_RIGHTS`,
)
// UNSUPPORTED Rust 3439:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_DEFAULTSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_DEFAULTSW` (
    public var `pDatatype`: `windows_sys`.`core`.`PWSTR`,
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?,
    public var `DesiredAccess`: `PRINTER_ACCESS_RIGHTS`,
)
// UNSUPPORTED Rust 3453:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_ENUM_VALUESA` (
    public var `pValueName`: `windows_sys`.`core`.`PSTR`,
    public var `cbValueName`: UInt,
    public var `dwType`: UInt,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbData`: UInt,
)
// UNSUPPORTED Rust 3505:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_ENUM_VALUESA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_ENUM_VALUESW` (
    public var `pValueName`: `windows_sys`.`core`.`PWSTR`,
    public var `cbValueName`: UInt,
    public var `dwType`: UInt,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbData`: UInt,
)
// UNSUPPORTED Rust 3519:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTER_EVENT_ATTRIBUTES_INFO` (
    public var `cbSize`: UInt,
    public var `dwOldAttributes`: UInt,
    public var `dwNewAttributes`: UInt,
)
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
// UNSUPPORTED Rust 3550:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PRINTER_EXTENSION_DETAILEDREASON_PRINTER_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5d5a1704_dfd1_4181_8eee_815c86edad31);

// UNSUPPORTED Rust 3551:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PRINTER_EXTENSION_REASON_DRIVER_EVENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x23bb1328_63de_4293_915b_a6a23d929acb);

// UNSUPPORTED Rust 3552:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PRINTER_EXTENSION_REASON_PRINT_PREFERENCES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xec8f261f_267c_469f_b5d6_3933023c29cc);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_HANDLE` (
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3558:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_1A` (
    public var `Flags`: UInt,
    public var `pDescription`: `windows_sys`.`core`.`PSTR`,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `pComment`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 3571:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_1W` (
    public var `Flags`: UInt,
    public var `pDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `pComment`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3584:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_2A` (
    public var `pServerName`: `windows_sys`.`core`.`PSTR`,
    public var `pPrinterName`: `windows_sys`.`core`.`PSTR`,
    public var `pShareName`: `windows_sys`.`core`.`PSTR`,
    public var `pPortName`: `windows_sys`.`core`.`PSTR`,
    public var `pDriverName`: `windows_sys`.`core`.`PSTR`,
    public var `pComment`: `windows_sys`.`core`.`PSTR`,
    public var `pLocation`: `windows_sys`.`core`.`PSTR`,
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pSepFile`: `windows_sys`.`core`.`PSTR`,
    public var `pPrintProcessor`: `windows_sys`.`core`.`PSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PSTR`,
    public var `pParameters`: `windows_sys`.`core`.`PSTR`,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `Attributes`: UInt,
    public var `Priority`: UInt,
    public var `DefaultPriority`: UInt,
    public var `StartTime`: UInt,
    public var `UntilTime`: UInt,
    public var `Status`: UInt,
    public var `cJobs`: UInt,
    public var `AveragePPM`: UInt,
)
// UNSUPPORTED Rust 3615:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for PRINTER_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_2W` (
    public var `pServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `pShareName`: `windows_sys`.`core`.`PWSTR`,
    public var `pPortName`: `windows_sys`.`core`.`PWSTR`,
    public var `pDriverName`: `windows_sys`.`core`.`PWSTR`,
    public var `pComment`: `windows_sys`.`core`.`PWSTR`,
    public var `pLocation`: `windows_sys`.`core`.`PWSTR`,
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?,
    public var `pSepFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pPrintProcessor`: `windows_sys`.`core`.`PWSTR`,
    public var `pDatatype`: `windows_sys`.`core`.`PWSTR`,
    public var `pParameters`: `windows_sys`.`core`.`PWSTR`,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `Attributes`: UInt,
    public var `Priority`: UInt,
    public var `DefaultPriority`: UInt,
    public var `StartTime`: UInt,
    public var `UntilTime`: UInt,
    public var `Status`: UInt,
    public var `cJobs`: UInt,
    public var `AveragePPM`: UInt,
)
// UNSUPPORTED Rust 3647:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// impl Default for PRINTER_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_3` (
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
)
// UNSUPPORTED Rust 3659:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for PRINTER_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_4A` (
    public var `pPrinterName`: `windows_sys`.`core`.`PSTR`,
    public var `pServerName`: `windows_sys`.`core`.`PSTR`,
    public var `Attributes`: UInt,
)
// UNSUPPORTED Rust 3672:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_INFO_4A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_4W` (
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `pServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `Attributes`: UInt,
)
// UNSUPPORTED Rust 3684:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_INFO_4W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_5A` (
    public var `pPrinterName`: `windows_sys`.`core`.`PSTR`,
    public var `pPortName`: `windows_sys`.`core`.`PSTR`,
    public var `Attributes`: UInt,
    public var `DeviceNotSelectedTimeout`: UInt,
    public var `TransmissionRetryTimeout`: UInt,
)
// UNSUPPORTED Rust 3698:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_INFO_5A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_5W` (
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
    public var `pPortName`: `windows_sys`.`core`.`PWSTR`,
    public var `Attributes`: UInt,
    public var `DeviceNotSelectedTimeout`: UInt,
    public var `TransmissionRetryTimeout`: UInt,
)
// UNSUPPORTED Rust 3712:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_INFO_5W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTER_INFO_6` (
    public var `dwStatus`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_7A` (
    public var `pszObjectGUID`: `windows_sys`.`core`.`PSTR`,
    public var `dwAction`: UInt,
)
// UNSUPPORTED Rust 3728:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_INFO_7A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_7W` (
    public var `pszObjectGUID`: `windows_sys`.`core`.`PWSTR`,
    public var `dwAction`: UInt,
)
// UNSUPPORTED Rust 3739:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_INFO_7W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_8A` (
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
)
// UNSUPPORTED Rust 3750:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_INFO_8A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_8W` (
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?,
)
// UNSUPPORTED Rust 3762:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_INFO_8W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_9A` (
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
)
// UNSUPPORTED Rust 3774:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTER_INFO_9A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_INFO_9W` (
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEW`>?,
)
// UNSUPPORTED Rust 3786:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_NOTIFY_INFO` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `Count`: UInt,
    public var `aData`: Array<`PRINTER_NOTIFY_INFO_DATA`>,
)
// UNSUPPORTED Rust 3831:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_NOTIFY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_NOTIFY_INFO_DATA` (
    public var `Type`: UShort,
    public var `Field`: UShort,
    public var `Reserved`: UInt,
    public var `Id`: UInt,
    public var `NotifyData`: `PRINTER_NOTIFY_INFO_DATA_0`,
)
// UNSUPPORTED Rust 3845:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_NOTIFY_INFO_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3850:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PRINTER_NOTIFY_INFO_DATA_0 {
//     pub adwData: [u32; 2],
//     pub Data: PRINTER_NOTIFY_INFO_DATA_0_0,
// }

// UNSUPPORTED Rust 3856:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_NOTIFY_INFO_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_NOTIFY_INFO_DATA_0_0` (
    public var `cbBuf`: UInt,
    public var `pBuf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3867:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_NOTIFY_INFO_DATA_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_NOTIFY_INFO_DATA_COMPACT`: UInt = 1u;
public const val `PRINTER_NOTIFY_INFO_DISCARDED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTER_NOTIFY_INIT` (
    public var `Size`: UInt,
    public var `Reserved`: UInt,
    public var `PollTime`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_NOTIFY_OPTIONS` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `Count`: UInt,
    public var `pTypes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_OPTIONS_TYPE`>?,
)
// UNSUPPORTED Rust 3889:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTER_NOTIFY_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_NOTIFY_OPTIONS_REFRESH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTER_NOTIFY_OPTIONS_TYPE` (
    public var `Type`: UShort,
    public var `Reserved0`: UShort,
    public var `Reserved1`: UInt,
    public var `Reserved2`: UInt,
    public var `Count`: UInt,
    public var `pFields`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 3905:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTER_OPTIONSA` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTER_OPTIONSW` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTIFI32` (
    public var `cjThis`: UInt,
    public var `cjIfiExtra`: UInt,
    public var `dpwszFamilyName`: Int,
    public var `dpwszStyleName`: Int,
    public var `dpwszFaceName`: Int,
    public var `dpwszUniqueName`: Int,
    public var `dpFontSim`: Int,
    public var `lEmbedId`: Int,
    public var `lItalicAngle`: Int,
    public var `lCharBias`: Int,
    public var `dpCharSets`: Int,
    public var `jWinCharSet`: UByte,
    public var `jWinPitchAndFamily`: UByte,
    public var `usWinWeight`: UShort,
    public var `flInfo`: UInt,
    public var `fsSelection`: UShort,
    public var `fsType`: UShort,
    public var `fwdUnitsPerEm`: Short,
    public var `fwdLowestPPEm`: Short,
    public var `fwdWinAscender`: Short,
    public var `fwdWinDescender`: Short,
    public var `fwdMacAscender`: Short,
    public var `fwdMacDescender`: Short,
    public var `fwdMacLineGap`: Short,
    public var `fwdTypoAscender`: Short,
    public var `fwdTypoDescender`: Short,
    public var `fwdTypoLineGap`: Short,
    public var `fwdAveCharWidth`: Short,
    public var `fwdMaxCharInc`: Short,
    public var `fwdCapHeight`: Short,
    public var `fwdXHeight`: Short,
    public var `fwdSubscriptXSize`: Short,
    public var `fwdSubscriptYSize`: Short,
    public var `fwdSubscriptXOffset`: Short,
    public var `fwdSubscriptYOffset`: Short,
    public var `fwdSuperscriptXSize`: Short,
    public var `fwdSuperscriptYSize`: Short,
    public var `fwdSuperscriptXOffset`: Short,
    public var `fwdSuperscriptYOffset`: Short,
    public var `fwdUnderscoreSize`: Short,
    public var `fwdUnderscorePosition`: Short,
    public var `fwdStrikeoutSize`: Short,
    public var `fwdStrikeoutPosition`: Short,
    public var `chFirstChar`: UByte,
    public var `chLastChar`: UByte,
    public var `chDefaultChar`: UByte,
    public var `chBreakChar`: UByte,
    public var `wcFirstChar`: UShort,
    public var `wcLastChar`: UShort,
    public var `wcDefaultChar`: UShort,
    public var `wcBreakChar`: UShort,
    public var `ptlBaseline`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlAspect`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlCaret`: `super`.`super`.`Foundation`.`POINTL`,
    public var `rclFontBox`: `super`.`super`.`Foundation`.`RECTL`,
    public var `achVendId`: UByteArray,
    public var `cKerningPairs`: UInt,
    public var `ulPanoseCulture`: UInt,
    public var `panose`: `super`.`Gdi`.`PANOSE`,
)
// UNSUPPORTED Rust 4033:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTIFI32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTPROCESSOROPENDATA` (
    public var `pDevMode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`DEVMODEA`>?,
    public var `pDatatype`: `windows_sys`.`core`.`PWSTR`,
    public var `pParameters`: `windows_sys`.`core`.`PWSTR`,
    public var `pDocumentName`: `windows_sys`.`core`.`PWSTR`,
    public var `JobId`: UInt,
    public var `pOutputFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pPrinterName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 4051:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTPROCESSOROPENDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTPROCESSOR_CAPS_1` (
    public var `dwLevel`: UInt,
    public var `dwNupOptions`: UInt,
    public var `dwPageOrderFlags`: UInt,
    public var `dwNumberOfCopies`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTPROCESSOR_CAPS_2` (
    public var `dwLevel`: UInt,
    public var `dwNupOptions`: UInt,
    public var `dwPageOrderFlags`: UInt,
    public var `dwNumberOfCopies`: UInt,
    public var `dwDuplexHandlingCaps`: UInt,
    public var `dwNupDirectionCaps`: UInt,
    public var `dwNupBorderCaps`: UInt,
    public var `dwBookletHandlingCaps`: UInt,
    public var `dwScalingCaps`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTPROCESSOR_INFO_1A` (
    public var `pName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 4083:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTPROCESSOR_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTPROCESSOR_INFO_1W` (
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 4093:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINTPROCESSOR_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTPROVIDOR` (
    public var `fpOpenPrinter`: Long,
    public var `fpSetJob`: Long,
    public var `fpGetJob`: Long,
    public var `fpEnumJobs`: Long,
    public var `fpAddPrinter`: Long,
    public var `fpDeletePrinter`: Long,
    public var `fpSetPrinter`: Long,
    public var `fpGetPrinter`: Long,
    public var `fpEnumPrinters`: Long,
    public var `fpAddPrinterDriver`: Long,
    public var `fpEnumPrinterDrivers`: Long,
    public var `fpGetPrinterDriver`: Long,
    public var `fpGetPrinterDriverDirectory`: Long,
    public var `fpDeletePrinterDriver`: Long,
    public var `fpAddPrintProcessor`: Long,
    public var `fpEnumPrintProcessors`: Long,
    public var `fpGetPrintProcessorDirectory`: Long,
    public var `fpDeletePrintProcessor`: Long,
    public var `fpEnumPrintProcessorDatatypes`: Long,
    public var `fpStartDocPrinter`: Long,
    public var `fpStartPagePrinter`: Long,
    public var `fpWritePrinter`: Long,
    public var `fpEndPagePrinter`: Long,
    public var `fpAbortPrinter`: Long,
    public var `fpReadPrinter`: Long,
    public var `fpEndDocPrinter`: Long,
    public var `fpAddJob`: Long,
    public var `fpScheduleJob`: Long,
    public var `fpGetPrinterData`: Long,
    public var `fpSetPrinterData`: Long,
    public var `fpWaitForPrinterChange`: Long,
    public var `fpClosePrinter`: Long,
    public var `fpAddForm`: Long,
    public var `fpDeleteForm`: Long,
    public var `fpGetForm`: Long,
    public var `fpSetForm`: Long,
    public var `fpEnumForms`: Long,
    public var `fpEnumMonitors`: Long,
    public var `fpEnumPorts`: Long,
    public var `fpAddPort`: Long,
    public var `fpConfigurePort`: Long,
    public var `fpDeletePort`: Long,
    public var `fpCreatePrinterIC`: Long,
    public var `fpPlayGdiScriptOnPrinterIC`: Long,
    public var `fpDeletePrinterIC`: Long,
    public var `fpAddPrinterConnection`: Long,
    public var `fpDeletePrinterConnection`: Long,
    public var `fpPrinterMessageBox`: Long,
    public var `fpAddMonitor`: Long,
    public var `fpDeleteMonitor`: Long,
    public var `fpResetPrinter`: Long,
    public var `fpGetPrinterDriverEx`: Long,
    public var `fpFindFirstPrinterChangeNotification`: Long,
    public var `fpFindClosePrinterChangeNotification`: Long,
    public var `fpAddPortEx`: Long,
    public var `fpShutDown`: Long,
    public var `fpRefreshPrinterChangeNotification`: Long,
    public var `fpOpenPrinterEx`: Long,
    public var `fpAddPrinterEx`: Long,
    public var `fpSetPort`: Long,
    public var `fpEnumPrinterData`: Long,
    public var `fpDeletePrinterData`: Long,
    public var `fpClusterSplOpen`: Long,
    public var `fpClusterSplClose`: Long,
    public var `fpClusterSplIsAlive`: Long,
    public var `fpSetPrinterDataEx`: Long,
    public var `fpGetPrinterDataEx`: Long,
    public var `fpEnumPrinterDataEx`: Long,
    public var `fpEnumPrinterKey`: Long,
    public var `fpDeletePrinterDataEx`: Long,
    public var `fpDeletePrinterKey`: Long,
    public var `fpSeekPrinter`: Long,
    public var `fpDeletePrinterDriverEx`: Long,
    public var `fpAddPerMachineConnection`: Long,
    public var `fpDeletePerMachineConnection`: Long,
    public var `fpEnumPerMachineConnections`: Long,
    public var `fpXcvData`: Long,
    public var `fpAddPrinterDriverEx`: Long,
    public var `fpSplReadPrinter`: Long,
    public var `fpDriverUnloadComplete`: Long,
    public var `fpGetSpoolFileInfo`: Long,
    public var `fpCommitSpoolData`: Long,
    public var `fpCloseSpoolFileHandle`: Long,
    public var `fpFlushPrinter`: Long,
    public var `fpSendRecvBidiData`: Long,
    public var `fpAddPrinterConnection2`: Long,
    public var `fpGetPrintClassObject`: Long,
    public var `fpReportJobProcessingProgress`: Long,
    public var `fpEnumAndLogProvidorObjects`: Long,
    public var `fpInternalGetPrinterDriver`: Long,
    public var `fpFindCompatibleDriver`: Long,
    public var `fpInstallPrinterDriverPackageFromConnection`: Long,
    public var `fpGetJobNamedPropertyValue`: Long,
    public var `fpSetJobNamedProperty`: Long,
    public var `fpDeleteJobNamedProperty`: Long,
    public var `fpEnumJobNamedProperties`: Long,
    public var `fpPowerEvent`: Long,
    public var `fpGetUserPropertyBag`: Long,
    public var `fpCanShutdown`: Long,
    public var `fpLogJobInfoForBranchOffice`: Long,
    public var `fpRegeneratePrintDeviceCapabilities`: Long,
    public var `fpPrintSupportOperation`: Long,
    public var `fpIppCreateJobOnPrinter`: Long,
    public var `fpIppGetJobAttributes`: Long,
    public var `fpIppSetJobAttributes`: Long,
    public var `fpIppGetPrinterAttributes`: Long,
    public var `fpIppSetPrinterAttributes`: Long,
    public var `fpIppCreateJobOnPrinterWithAttributes`: Long,
)
// UNSUPPORTED Rust 4210:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PRINT_APP_BIDI_NOTIFY_CHANNEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2abad223_b994_4aca_82fc_4571b1b585ac);

public typealias `PRINT_EXECUTION_CONTEXT` = Int;
public const val `PRINT_EXECUTION_CONTEXT_APPLICATION`: `PRINT_EXECUTION_CONTEXT` = 0;
public const val `PRINT_EXECUTION_CONTEXT_FILTER_PIPELINE`: `PRINT_EXECUTION_CONTEXT` = 3;
public const val `PRINT_EXECUTION_CONTEXT_SPOOLER_ISOLATION_HOST`: `PRINT_EXECUTION_CONTEXT` = 2;
public const val `PRINT_EXECUTION_CONTEXT_SPOOLER_SERVICE`: `PRINT_EXECUTION_CONTEXT` = 1;
public const val `PRINT_EXECUTION_CONTEXT_WOW64`: `PRINT_EXECUTION_CONTEXT` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINT_EXECUTION_DATA` (
    public var `context`: `PRINT_EXECUTION_CONTEXT`,
    public var `clientAppPID`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINT_FEATURE_OPTION` (
    public var `pszFeature`: `windows_sys`.`core`.`PCSTR`,
    public var `pszOption`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 4229:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRINT_FEATURE_OPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4234:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PRINT_PORT_MONITOR_NOTIFY_CHANNEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25df3b0e_74a9_47f5_80ce_79b4b1eb5c58);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETUI_GETICON_INFO` (
    public var `cbSize`: UShort,
    public var `Flags`: UShort,
    public var `cxIcon`: UShort,
    public var `cyIcon`: UShort,
    public var `hIcon`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`,
)
// UNSUPPORTED Rust 4245:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for PROPSHEETUI_GETICON_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETUI_INFO` (
    public var `cbSize`: UShort,
    public var `Version`: UShort,
    public var `Flags`: UShort,
    public var `Reason`: UShort,
    public var `hComPropSheet`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pfnComPropSheet`: `PFNCOMPROPSHEET`,
    public var `lParamInit`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `UserData`: ULong,
    public var `Result`: ULong,
)
// UNSUPPORTED Rust 4264:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROPSHEETUI_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETUI_INFO_HEADER` (
    public var `cbSize`: UShort,
    public var `Flags`: UShort,
    public var `pTitle`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `hWndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `hInst`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous`: `PROPSHEETUI_INFO_HEADER_0`,
)
// UNSUPPORTED Rust 4280:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for PROPSHEETUI_INFO_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4286:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union PROPSHEETUI_INFO_HEADER_0 {
//     pub hIcon: super::super::UI::WindowsAndMessaging::HICON,
//     pub IconID: usize,
// }

// UNSUPPORTED Rust 4293:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROVIDOR_INFO_1A` (
    public var `pName`: `windows_sys`.`core`.`PSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PSTR`,
    public var `pDLLName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 4316:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROVIDOR_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROVIDOR_INFO_1W` (
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `pEnvironment`: `windows_sys`.`core`.`PWSTR`,
    public var `pDLLName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 4328:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROVIDOR_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROVIDOR_INFO_2A` (
    public var `pOrder`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 4338:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROVIDOR_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROVIDOR_INFO_2W` (
    public var `pOrder`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 4348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROVIDOR_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 57 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSCRIPT5_PRIVATE_DEVMODE` (
    public var `wReserved`: UShortArray,
    public var `wSize`: UShort,
)
// UNSUPPORTED Rust 4359:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PSCRIPT5_PRIVATE_DEVMODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSPINFO` (
    public var `cbSize`: UShort,
    public var `wReserved`: UShort,
    public var `hComPropSheet`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hCPSUIPage`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pfnComPropSheet`: `PFNCOMPROPSHEET`,
)
// UNSUPPORTED Rust 4373:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PUBLISHERINFO` (
    public var `dwMode`: UInt,
    public var `wMinoutlinePPEM`: UShort,
    public var `wMaxbitmapPPEM`: UShort,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PrintNamedProperty` (
    public var `propertyName`: `windows_sys`.`core`.`PWSTR`,
    public var `propertyValue`: `PrintPropertyValue`,
)
// UNSUPPORTED Rust 4429:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PrintNamedProperty {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PrintPropertiesCollection` (
    public var `numberOfProperties`: UInt,
    public var `propertiesCollection`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PrintNamedProperty`>?,
)
// UNSUPPORTED Rust 4440:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PrintPropertiesCollection {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PrintPropertyValue` (
    public var `ePropertyType`: `EPrintPropertyType`,
    public var `value`: `PrintPropertyValue_0`,
)
// UNSUPPORTED Rust 4451:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PrintPropertyValue {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4456:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PrintPropertyValue_0 {
//     pub propertyByte: u8,
//     pub propertyString: windows_sys::core::PWSTR,
//     pub propertyInt32: i32,
//     pub propertyInt64: i64,
//     pub propertyBlob: PrintPropertyValue_0_0,
// }

// UNSUPPORTED Rust 4465:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PrintPropertyValue_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PrintPropertyValue_0_0` (
    public var `cbBuf`: UInt,
    public var `pBuf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4476:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PrintPropertyValue_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
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
// UNSUPPORTED Rust 4494:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PrinterExtensionManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x331b60da_9e90_4dd0_9c84_eac4e659b61f);

// UNSUPPORTED Rust 4495:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PrinterQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb54c230_798c_4c9e_b461_29fad04039b1);

// UNSUPPORTED Rust 4496:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ROUTER_NOTIFY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`PRINTER_NOTIFY_INFO`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SETRESULT_INFO` (
    public var `cbSize`: UShort,
    public var `wReserved`: UShort,
    public var `hSetResult`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `Result`: `super`.`super`.`Foundation`.`LRESULT`,
)
// UNSUPPORTED Rust 4531:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SETRESULT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SHIMOPTS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SHOWUIPARAMS` (
    public var `UIType`: `UI_TYPE`,
    public var `MessageBoxParams`: `MESSAGEBOX_PARAMS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SIMULATE_CAPS_1` (
    public var `dwLevel`: UInt,
    public var `dwPageOrderFlags`: UInt,
    public var `dwNumberOfCopies`: UInt,
    public var `dwCollate`: UInt,
    public var `dwNupOptions`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPLCLIENT_INFO_1` (
    public var `dwSize`: UInt,
    public var `pMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwBuildNum`: UInt,
    public var `dwMajorVersion`: UInt,
    public var `dwMinorVersion`: UInt,
    public var `wProcessorArchitecture`: UShort,
)
// UNSUPPORTED Rust 4563:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SPLCLIENT_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SPLCLIENT_INFO_2_W2K` (
    public var `hSplPrinter`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SPLCLIENT_INFO_2_WINXP` (
    public var `hSplPrinter`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SPLCLIENT_INFO_2_WINXP` (
    public var `hSplPrinter`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPLCLIENT_INFO_3_VISTA` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwSize`: UInt,
    public var `pMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwBuildNum`: UInt,
    public var `dwMajorVersion`: UInt,
    public var `dwMinorVersion`: UInt,
    public var `wProcessorArchitecture`: UShort,
    public var `hSplPrinter`: ULong,
)
// UNSUPPORTED Rust 4599:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SPLCLIENT_INFO_3_VISTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPLCLIENT_INFO_INTERNAL` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwSize`: UInt,
    public var `pMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwBuildNum`: UInt,
    public var `dwMajorVersion`: UInt,
    public var `dwMinorVersion`: UInt,
    public var `wProcessorArchitecture`: UShort,
    public var `hSplPrinter`: ULong,
    public var `dwProcessId`: UInt,
    public var `dwSessionId`: UInt,
)
// UNSUPPORTED Rust 4620:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SPLCLIENT_INFO_INTERNAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SPLCLIENT_INFO_INTERNAL_LEVEL`: UInt = 100u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_ASSET_NUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("assetNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_BYTES_PER_MINUTE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("bytesPerMinute");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_DESCRIPTION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("description");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_DRIVER_KEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DsDriver");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_DRIVER_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("driverName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_DRIVER_VERSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("driverVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_FLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("flags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_LOCATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("location");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PORT_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("portName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINTER_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printQueue");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINTER_LOCATIONS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printerLocations");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINTER_MODEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printerModel");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINTER_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printerName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINTER_NAME_ALIASES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printerNameAliases");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_ATTRIBUTES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printAttributes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_BIN_NAMES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printBinNames");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_COLLATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printCollate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_COLOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printColor");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_DUPLEX_SUPPORTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printDuplexSupported");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_END_TIME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printEndTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_KEEP_PRINTED_JOBS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printKeepPrintedJobs");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_LANGUAGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printLanguage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_MAC_ADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printMACAddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_MAX_RESOLUTION_SUPPORTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printMaxResolutionSupported");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_MAX_X_EXTENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printMaxXExtent");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_MAX_Y_EXTENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printMaxYExtent");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_MEDIA_READY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printMediaReady");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_MEDIA_SUPPORTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printMediaSupported");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_MEMORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printMemory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_MIN_X_EXTENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printMinXExtent");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_MIN_Y_EXTENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printMinYExtent");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_NETWORK_ADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printNetworkAddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_NOTIFY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printNotify");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_NUMBER_UP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printNumberUp");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_ORIENTATIONS_SUPPORTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printOrientationsSupported");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_OWNER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printOwner");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_PAGES_PER_MINUTE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printPagesPerMinute");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_RATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printRate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_RATE_UNIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printRateUnit");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_SEPARATOR_FILE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printSeparatorFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_SHARE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printShareName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_SPOOLING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printSpooling");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_STAPLING_SUPPORTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printStaplingSupported");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_START_TIME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printStartTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRINT_STATUS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("printStatus");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_PRIORITY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("priority");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_SERVER_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("serverName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_SHORT_SERVER_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("shortServerName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_SPOOLER_KEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DsSpooler");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_UNC_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("uNCName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_URL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("url");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_USER_KEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DsUser");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLDS_VERSION_NUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("versionNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLPRINTER_USER_MODE_PRINTER_DRIVER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SPLUserModePrinterDriver");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_ALLOW_USER_MANAGEFORMS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AllowUserManageForms");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_ARCHITECTURE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Architecture");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_BEEP_ENABLED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BeepEnabled");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_DEFAULT_SPOOL_DIRECTORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DefaultSpoolDirectory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_DNS_MACHINE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DNSMachineName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_DS_PRESENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DsPresent");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_DS_PRESENT_FOR_USER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DsPresentForUser");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_EVENT_LOG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EventLog");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_MAJOR_VERSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MajorVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_MINOR_VERSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MinorVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_NET_POPUP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NetPopup");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_NET_POPUP_TO_COMPUTER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NetPopupToComputer");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_OS_VERSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OSVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_OS_VERSIONEX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OSVersionEx");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_PORT_THREAD_PRIORITY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PortThreadPriority");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_PORT_THREAD_PRIORITY_DEFAULT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PortThreadPriorityDefault");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_PRINT_DRIVER_ISOLATION_EXECUTION_POLICY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintDriverIsolationExecutionPolicy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_PRINT_DRIVER_ISOLATION_GROUPS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintDriverIsolationGroups");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_PRINT_DRIVER_ISOLATION_IDLE_TIMEOUT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintDriverIsolationIdleTimeout");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_PRINT_DRIVER_ISOLATION_MAX_OBJECTS_BEFORE_RECYCLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintDriverIsolationMaxobjsBeforeRecycle");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_PRINT_DRIVER_ISOLATION_OVERRIDE_POLICY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintDriverIsolationOverrideCompat");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_PRINT_DRIVER_ISOLATION_TIME_BEFORE_RECYCLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintDriverIsolationTimeBeforeRecycle");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_PRINT_QUEUE_V4_DRIVER_DIRECTORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintQueueV4DriverDirectory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_REMOTE_FAX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RemoteFax");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_RESTART_JOB_ON_POOL_ENABLED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RestartJobOnPoolEnabled");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_RESTART_JOB_ON_POOL_ERROR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RestartJobOnPoolError");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_RETRY_POPUP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RetryPopup");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_SCHEDULER_THREAD_PRIORITY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SchedulerThreadPriority");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_SCHEDULER_THREAD_PRIORITY_DEFAULT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SchedulerThreadPriorityDefault");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SPLREG_WEBSHAREMGMT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WebShareMgmt");
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRANSDATA` (
    public var `ubCodePageID`: UByte,
    public var `ubType`: UByte,
    public var `uCode`: `TRANSDATA_0`,
)
// UNSUPPORTED Rust 4730:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRANSDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4735:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TRANSDATA_0 {
//     pub sCode: i16,
//     pub ubCode: u8,
//     pub ubPairs: [u8; 2],
// }

// UNSUPPORTED Rust 4742:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UFF_FILEHEADER` (
    public var `dwSignature`: UInt,
    public var `dwVersion`: UInt,
    public var `dwSize`: UInt,
    public var `nFonts`: UInt,
    public var `nGlyphSets`: UInt,
    public var `nVarData`: UInt,
    public var `offFontDir`: UInt,
    public var `dwFlags`: UInt,
    public var `dwReserved`: UIntArray,
)
// UNSUPPORTED Rust 4779:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UFF_FILEHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UFF_FONTDIRECTORY` (
    public var `dwSignature`: UInt,
    public var `wSize`: UShort,
    public var `wFontID`: UShort,
    public var `sGlyphID`: Short,
    public var `wFlags`: UShort,
    public var `dwInstallerSig`: UInt,
    public var `offFontName`: UInt,
    public var `offCartridgeName`: UInt,
    public var `offFontData`: UInt,
    public var `offGlyphData`: UInt,
    public var `offVarData`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNIDRVINFO` (
    public var `dwSize`: UInt,
    public var `flGenFlags`: UInt,
    public var `wType`: UShort,
    public var `fCaps`: UShort,
    public var `wXRes`: UShort,
    public var `wYRes`: UShort,
    public var `sYAdjust`: Short,
    public var `sYMoved`: Short,
    public var `wPrivateData`: UShort,
    public var `sShift`: Short,
    public var `SelectFont`: `INVOC`,
    public var `UnSelectFont`: `INVOC`,
    public var `wReserved`: UShortArray,
)
// UNSUPPORTED Rust 4834:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UNIDRVINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNIDRV_PRIVATE_DEVMODE` (
    public var `wReserved`: UShortArray,
    public var `wSize`: UShort,
)
// UNSUPPORTED Rust 4845:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UNIDRV_PRIVATE_DEVMODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNIFM_HDR` (
    public var `dwSize`: UInt,
    public var `dwVersion`: UInt,
    public var `ulDefaultCodepage`: UInt,
    public var `lGlyphSetDataRCID`: Int,
    public var `loUnidrvInfo`: UInt,
    public var `loIFIMetrics`: UInt,
    public var `loExtTextMetric`: UInt,
    public var `loWidthTable`: UInt,
    public var `loKernPair`: UInt,
    public var `dwReserved`: UIntArray,
)
// UNSUPPORTED Rust 4864:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UNIFM_HDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNIFM_VERSION_1_0`: UInt = 65536u;
public const val `UNIRECTIONAL_NOTIFICATION_LOST`: `PrintAsyncNotifyError` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UNI_CODEPAGEINFO` (
    public var `dwCodePage`: UInt,
    public var `SelectSymbolSet`: `INVOC`,
    public var `UnSelectSymbolSet`: `INVOC`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNI_GLYPHSETDATA` (
    public var `dwSize`: UInt,
    public var `dwVersion`: UInt,
    public var `dwFlags`: UInt,
    public var `lPredefinedID`: Int,
    public var `dwGlyphCount`: UInt,
    public var `dwRunCount`: UInt,
    public var `loRunOffset`: UInt,
    public var `dwCodePageCount`: UInt,
    public var `loCodePageOffset`: UInt,
    public var `loMapTableOffset`: UInt,
    public var `dwReserved`: UIntArray,
)
// UNSUPPORTED Rust 4893:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USERDATA` (
    public var `dwSize`: UInt,
    public var `dwItemID`: ULong,
    public var `pKeyWordName`: `windows_sys`.`core`.`PSTR`,
    public var `dwReserved`: UIntArray,
)
// UNSUPPORTED Rust 4915:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USERDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WIDTHRUN` (
    public var `wStartGlyph`: UShort,
    public var `wGlyphCount`: UShort,
    public var `loCharWidthOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WIDTHTABLE` (
    public var `dwSize`: UInt,
    public var `dwRunNum`: UInt,
    public var `WidthRun`: Array<`WIDTHRUN`>,
)
// UNSUPPORTED Rust 4934:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_DRIVER_PROPERTY_BAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DriverPropertyBag");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_JOB_ID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintJobId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_JOB_LEVEL_PRINTTICKET`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("JobPrintTicket");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_MERGED_DATAFILE_PATH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MergedDataFilePath");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_MS_CONTENT_TYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DriverMultiContentType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_MS_CONTENT_TYPE_OPENXPS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OpenXPS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_MS_CONTENT_TYPE_XPS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("XPS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_OUTPUT_FILE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintOutputFileName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_PRINTDEVICECAPABILITIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintDeviceCapabilities");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_PRINTER_HANDLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrinterHandle");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_PRINTER_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrinterName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_PRINT_CLASS_FACTORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrintClassFactory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_PROGRESS_REPORT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ProgressReport");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_QUEUE_PROPERTY_BAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("QueuePropertyBag");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_RESOURCE_DLL_PATHS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ResourceDLLPaths");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_USER_PRINT_TICKET`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PerUserPrintTicket");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XPS_FP_USER_TOKEN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UserSecurityToken");
public const val `XpsJob_DocumentSequenceAdded`: `EXpsJobConsumption` = 0;
public const val `XpsJob_FixedDocumentAdded`: `EXpsJobConsumption` = 1;
public const val `XpsJob_FixedPageAdded`: `EXpsJobConsumption` = 2;
public const val `Xps_Restricted_Font_Editable`: `EXpsFontRestriction` = 8;
public const val `Xps_Restricted_Font_Installable`: `EXpsFontRestriction` = 0;
public const val `Xps_Restricted_Font_NoEmbedding`: `EXpsFontRestriction` = 2;
public const val `Xps_Restricted_Font_PreviewPrint`: `EXpsFontRestriction` = 4;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `_CPSUICALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CPSUICBPARAM`>?) -> Int>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `_SPLCLIENT_INFO_2_V3` (
    public var `hSplPrinter`: ULong,
)
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
