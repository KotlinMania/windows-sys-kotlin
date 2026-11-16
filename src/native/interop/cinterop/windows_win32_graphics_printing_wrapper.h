#ifndef WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_WINDOWS_WIN32_GRAPHICS_PRINTING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_WINDOWS_WIN32_GRAPHICS_PRINTING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32GraphicsPrintingAddMonitorA(void* pname, uint32_t level, void* pmonitors);
int32_t windowssysWindowsWin32GraphicsPrintingAddMonitorW(void* pname, uint32_t level, void* pmonitors);
int32_t windowssysWindowsWin32GraphicsPrintingAddPortA(void* pname, void* hwnd, void* pmonitorname);
int32_t windowssysWindowsWin32GraphicsPrintingAddPortW(void* pname, void* hwnd, void* pmonitorname);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrintProcessorA(void* pname, void* penvironment, void* ppathname, void* pprintprocessorname);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrintProcessorW(void* pname, void* penvironment, void* ppathname, void* pprintprocessorname);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrintProvidorA(void* pname, uint32_t level, void* pprovidorinfo);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrintProvidorW(void* pname, uint32_t level, void* pprovidorinfo);
void* windowssysWindowsWin32GraphicsPrintingAddPrinterA(void* pname, uint32_t level, void* pprinter);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A(void* hwnd, void* pszname, uint32_t dwlevel, void* pconnectioninfo);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W(void* hwnd, void* pszname, uint32_t dwlevel, void* pconnectioninfo);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA(void* pname);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW(void* pname);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrinterDriverA(void* pname, uint32_t level, void* pdriverinfo);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA(void* pname, uint32_t level, void* lpbdriverinfo, uint32_t dwfilecopyflags);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW(void* pname, uint32_t level, void* lpbdriverinfo, uint32_t dwfilecopyflags);
int32_t windowssysWindowsWin32GraphicsPrintingAddPrinterDriverW(void* pname, uint32_t level, void* pdriverinfo);
void* windowssysWindowsWin32GraphicsPrintingAddPrinterW(void* pname, uint32_t level, void* pprinter);
int32_t windowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData(void* pinfodest, void* pdatasrc, uint32_t fdwflags);
uint32_t windowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification(void* hprinterrpc, uint32_t fdwfilterflags, uint32_t fdwoptions, void* hnotify, void* pprinternotifyoptions);
int32_t windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA(void* hwndowner, void* pfnpropsheetui, int64_t lparam, void* presult);
int32_t windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW(void* hwndowner, void* pfnpropsheetui, int64_t lparam, void* presult);
int32_t windowssysWindowsWin32GraphicsPrintingConfigurePortA(void* pname, void* hwnd, void* pportname);
int32_t windowssysWindowsWin32GraphicsPrintingConfigurePortW(void* pname, void* hwnd, void* pportname);
void* windowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg(void* hwnd, uint32_t flags);
int32_t windowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel(void* pszname, void* pnotificationtype, int32_t euserfilter, int32_t econversationstyle, void* pcallback, void* ppiasynchnotification);
int32_t windowssysWindowsWin32GraphicsPrintingDeleteMonitorA(void* pname, void* penvironment, void* pmonitorname);
int32_t windowssysWindowsWin32GraphicsPrintingDeleteMonitorW(void* pname, void* penvironment, void* pmonitorname);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePortA(void* pname, void* hwnd, void* pportname);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePortW(void* pname, void* hwnd, void* pportname);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA(void* pname, void* penvironment, void* pprintprocessorname);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW(void* pname, void* penvironment, void* pprintprocessorname);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA(void* pname, void* penvironment, void* pprintprovidorname);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW(void* pname, void* penvironment, void* pprintprovidorname);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA(void* pname);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW(void* pname);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA(void* pname, void* penvironment, void* pdrivername);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA(void* pname, void* penvironment, void* pdrivername, uint32_t dwdeleteflag, uint32_t dwversionflag);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW(void* pname, void* penvironment, void* pdrivername, uint32_t dwdeleteflag, uint32_t dwversionflag);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA(void* pszserver, void* pszinfpath, void* pszenvironment);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW(void* pszserver, void* pszinfpath, void* pszenvironment);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW(void* pname, void* penvironment, void* pdrivername);
int32_t windowssysWindowsWin32GraphicsPrintingDeletePrinterIC(void* hprinteric);
int32_t windowssysWindowsWin32GraphicsPrintingDevQueryPrintEx(void* pdqpinfo);
int32_t windowssysWindowsWin32GraphicsPrintingEnumMonitorsA(void* pname, uint32_t level, void* pmonitor, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumMonitorsW(void* pname, uint32_t level, void* pmonitor, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPortsA(void* pname, uint32_t level, void* pport, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPortsW(void* pname, uint32_t level, void* pport, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA(void* pname, void* pprintprocessorname, uint32_t level, void* pdatatypes, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW(void* pname, void* pprintprocessorname, uint32_t level, void* pdatatypes, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA(void* pname, void* penvironment, uint32_t level, void* pdriverinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW(void* pname, void* penvironment, uint32_t level, void* pdriverinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPrintersA(uint32_t flags, void* name, uint32_t level, void* pprinterenum, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingEnumPrintersW(uint32_t flags, void* name, uint32_t level, void* pprinterenum, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssysWindowsWin32GraphicsPrintingExtDeviceMode(void* hwnd, void* hinst, void* pdevmodeoutput, void* pdevicename, void* pport, void* pdevmodeinput, void* pprofile, uint32_t fmode);
int32_t windowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification(void* hchange);
int32_t windowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification(void* hchange, void* pdwchange, void* pvreserved, void* ppprinternotifyinfo);
void windowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray(uint32_t cproperties, void* ppproperties);
void windowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue(void* pvalue);
int32_t windowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo(void* pprinternotifyinfo);
int32_t windowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle(void* spoolfilehandle);
int32_t windowssysWindowsWin32GraphicsPrintingGdiEndDocEMF(void* spoolfilehandle);
int32_t windowssysWindowsWin32GraphicsPrintingGdiEndPageEMF(void* spoolfilehandle, uint32_t dwoptimization);
void* windowssysWindowsWin32GraphicsPrintingGdiGetDC(void* spoolfilehandle);
int32_t windowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage(void* spoolfilehandle, uint32_t dwpagenumber, void* pcurrdm, void* plastdm);
uint32_t windowssysWindowsWin32GraphicsPrintingGdiGetPageCount(void* spoolfilehandle);
void* windowssysWindowsWin32GraphicsPrintingGdiGetPageHandle(void* spoolfilehandle, uint32_t page, void* pdwpagetype);
void* windowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle(void* pwszprintername, void* pdevmode, void* pwszdocname);
int32_t windowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF(void* spoolfilehandle, void* hemf, void* prectdocument, void* prectborder, void* prectclip);
int32_t windowssysWindowsWin32GraphicsPrintingGdiResetDCEMF(void* spoolfilehandle, void* pcurrdm);
int32_t windowssysWindowsWin32GraphicsPrintingGdiStartDocEMF(void* spoolfilehandle, void* pdocinfo);
int32_t windowssysWindowsWin32GraphicsPrintingGdiStartPageEMF(void* spoolfilehandle);
uint32_t windowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths(void* pszprintername, void* pszdirectory, void* psplclientinfo, uint32_t dwlevel, void* pszsourcedir, void* pcchsourcedirsize, void* psztargetdir, void* pcchtargetdirsize, uint32_t dwflags);
uint64_t windowssysWindowsWin32GraphicsPrintingGetCPSUIUserData(void* hdlg);
int32_t windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA(void* pszserver, void* pszenvironment, void* pszzcoredriverdependencies, uint32_t ccoreprinterdrivers, void* pcoreprinterdrivers);
int32_t windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW(void* pszserver, void* pszenvironment, void* pszzcoredriverdependencies, uint32_t ccoreprinterdrivers, void* pcoreprinterdrivers);
int32_t windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA(void* pszbuffer, void* pcchbuffer);
int32_t windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW(void* pszbuffer, void* pcchbuffer);
int32_t windowssysWindowsWin32GraphicsPrintingGetJobAttributes(void* pprintername, void* pdevmode, void* pattributeinfo);
int32_t windowssysWindowsWin32GraphicsPrintingGetJobAttributesEx(void* pprintername, void* pdevmode, uint32_t dwlevel, void* pattributeinfo, uint32_t nsize, uint32_t dwflags);
int32_t windowssysWindowsWin32GraphicsPrintingGetPrintExecutionData(void* pdata);
int32_t windowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo(void* hwnd, void* pszprinter, void* phfile, void* ppszoutputfile);
int32_t windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded);
int32_t windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded);
int32_t windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA(void* pname, void* penvironment, uint32_t level, void* pdriverdirectory, uint32_t cbbuf, void* pcbneeded);
int32_t windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW(void* pname, void* penvironment, uint32_t level, void* pdriverdirectory, uint32_t cbbuf, void* pcbneeded);
int32_t windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA(void* pszserver, void* pszenvironment, void* pszlanguage, void* pszpackageid, void* pszdriverpackagecab, uint32_t cchdriverpackagecab, void* pcchrequiredsize);
int32_t windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW(void* pszserver, void* pszenvironment, void* pszlanguage, void* pszpackageid, void* pszdriverpackagecab, uint32_t cchdriverpackagecab, void* pcchrequiredsize);
int32_t windowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient(void* htoken);
int32_t windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA(void* pszserver, void* pszinfpath, void* pszdrivername, void* pszenvironment, uint32_t dwflags);
int32_t windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW(void* pszserver, void* pszinfpath, void* pszdrivername, void* pszenvironment, uint32_t dwflags);
int32_t windowssysWindowsWin32GraphicsPrintingIsValidDevmodeA(void* pdevmode, uint64_t devmodesize);
int32_t windowssysWindowsWin32GraphicsPrintingIsValidDevmodeW(void* pdevmode, uint64_t devmodesize);
int32_t windowssysWindowsWin32GraphicsPrintingOpenPrinter2A(void* pprintername, void* phprinter, void* pdefault, void* poptions);
int32_t windowssysWindowsWin32GraphicsPrintingOpenPrinter2W(void* pprintername, void* phprinter, void* pdefault, void* poptions);
int32_t windowssysWindowsWin32GraphicsPrintingOpenPrinterA(void* pprintername, void* phprinter, void* pdefault);
int32_t windowssysWindowsWin32GraphicsPrintingOpenPrinterW(void* pprintername, void* phprinter, void* pdefault);
int32_t windowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC(void* hprinteric, void* pin, uint32_t cin, void* pout, uint32_t cout, uint32_t ul);
int32_t windowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications(void* pszname, void* pnotificationtype, int32_t euserfilter, int32_t econversationstyle, void* pcallback, void* phnotify);
int32_t windowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject(void* hdeviceobject);
int32_t windowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx(void* hnotify, uint32_t dwcolor, uint32_t fdwflags, void* pdwresult, void* pprinternotifyinfo);
int32_t windowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress(void* printerhandle, uint32_t jobid, int32_t joboperation, int32_t jobprogress);
void* windowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf(void);
void* windowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem(uint64_t numbytes);
void* windowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer(uint32_t count);
void* windowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo(uint32_t cprinternotifyinfodata);
void windowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem(void* pmempointer);
uint32_t windowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer(void* pdata);
int32_t windowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo(void* pinfo);
int32_t windowssysWindowsWin32GraphicsPrintingSetCPSUIUserData(void* hdlg, uint64_t cpsuiuserdata);
int32_t windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA(void* pszprinter);
int32_t windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW(void* pszprinter);
int32_t windowssysWindowsWin32GraphicsPrintingSetPortA(void* pname, void* pportname, uint32_t dwlevel, void* pportinfo);
int32_t windowssysWindowsWin32GraphicsPrintingSetPortW(void* pname, void* pportname, uint32_t dwlevel, void* pportinfo);
int32_t windowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent(void* pszprintername, void* pszkey, uint32_t dwcopyfileevent);
void windowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo(void* pinfo);
int32_t windowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications(void* param0);
int32_t windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA(void* pszserver, void* pszinfpath, void* pszenvironment, uint32_t dwflags, void* hwnd, void* pszdestinfpath, void* pcchdestinfpath);
int32_t windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW(void* pszserver, void* pszinfpath, void* pszenvironment, uint32_t dwflags, void* hwnd, void* pszdestinfpath, void* pcchdestinfpath);
int32_t windowssysWindowsWin32GraphicsPrintingXcvDataW(void* hxcv, void* pszdataname, void* pinputdata, uint32_t cbinputdata, void* poutputdata, uint32_t cboutputdata, void* pcboutputneeded, void* pdwstatus);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_WINDOWS_WIN32_GRAPHICS_PRINTING_WRAPPER_H */
