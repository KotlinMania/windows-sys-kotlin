#ifndef WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_WINDOWS_WIN32_GRAPHICS_PRINTING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_WINDOWS_WIN32_GRAPHICS_PRINTING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_graphics_printing_addMonitorA(void* pname, uint32_t level, void* pmonitors);
int32_t windowssys_windows_win32_graphics_printing_addMonitorW(void* pname, uint32_t level, void* pmonitors);
int32_t windowssys_windows_win32_graphics_printing_addPortA(void* pname, void* hwnd, void* pmonitorname);
int32_t windowssys_windows_win32_graphics_printing_addPortW(void* pname, void* hwnd, void* pmonitorname);
int32_t windowssys_windows_win32_graphics_printing_addPrintProcessorA(void* pname, void* penvironment, void* ppathname, void* pprintprocessorname);
int32_t windowssys_windows_win32_graphics_printing_addPrintProcessorW(void* pname, void* penvironment, void* ppathname, void* pprintprocessorname);
int32_t windowssys_windows_win32_graphics_printing_addPrintProvidorA(void* pname, uint32_t level, void* pprovidorinfo);
int32_t windowssys_windows_win32_graphics_printing_addPrintProvidorW(void* pname, uint32_t level, void* pprovidorinfo);
void* windowssys_windows_win32_graphics_printing_addPrinterA(void* pname, uint32_t level, void* pprinter);
int32_t windowssys_windows_win32_graphics_printing_addPrinterConnection2A(void* hwnd, void* pszname, uint32_t dwlevel, void* pconnectioninfo);
int32_t windowssys_windows_win32_graphics_printing_addPrinterConnection2W(void* hwnd, void* pszname, uint32_t dwlevel, void* pconnectioninfo);
int32_t windowssys_windows_win32_graphics_printing_addPrinterConnectionA(void* pname);
int32_t windowssys_windows_win32_graphics_printing_addPrinterConnectionW(void* pname);
int32_t windowssys_windows_win32_graphics_printing_addPrinterDriverA(void* pname, uint32_t level, void* pdriverinfo);
int32_t windowssys_windows_win32_graphics_printing_addPrinterDriverExA(void* pname, uint32_t level, void* lpbdriverinfo, uint32_t dwfilecopyflags);
int32_t windowssys_windows_win32_graphics_printing_addPrinterDriverExW(void* pname, uint32_t level, void* lpbdriverinfo, uint32_t dwfilecopyflags);
int32_t windowssys_windows_win32_graphics_printing_addPrinterDriverW(void* pname, uint32_t level, void* pdriverinfo);
void* windowssys_windows_win32_graphics_printing_addPrinterW(void* pname, uint32_t level, void* pprinter);
int32_t windowssys_windows_win32_graphics_printing_appendPrinterNotifyInfoData(void* pinfodest, void* pdatasrc, uint32_t fdwflags);
uint32_t windowssys_windows_win32_graphics_printing_callRouterFindFirstPrinterChangeNotification(void* hprinterrpc, uint32_t fdwfilterflags, uint32_t fdwoptions, void* hnotify, void* pprinternotifyoptions);
int32_t windowssys_windows_win32_graphics_printing_commonPropertySheetUIA(void* hwndowner, void* pfnpropsheetui, int64_t lparam, void* presult);
int32_t windowssys_windows_win32_graphics_printing_commonPropertySheetUIW(void* hwndowner, void* pfnpropsheetui, int64_t lparam, void* presult);
int32_t windowssys_windows_win32_graphics_printing_configurePortA(void* pname, void* hwnd, void* pportname);
int32_t windowssys_windows_win32_graphics_printing_configurePortW(void* pname, void* hwnd, void* pportname);
void* windowssys_windows_win32_graphics_printing_connectToPrinterDlg(void* hwnd, uint32_t flags);
int32_t windowssys_windows_win32_graphics_printing_createPrintAsyncNotifyChannel(void* pszname, void* pnotificationtype, int32_t euserfilter, int32_t econversationstyle, void* pcallback, void* ppiasynchnotification);
int32_t windowssys_windows_win32_graphics_printing_deleteMonitorA(void* pname, void* penvironment, void* pmonitorname);
int32_t windowssys_windows_win32_graphics_printing_deleteMonitorW(void* pname, void* penvironment, void* pmonitorname);
int32_t windowssys_windows_win32_graphics_printing_deletePortA(void* pname, void* hwnd, void* pportname);
int32_t windowssys_windows_win32_graphics_printing_deletePortW(void* pname, void* hwnd, void* pportname);
int32_t windowssys_windows_win32_graphics_printing_deletePrintProcessorA(void* pname, void* penvironment, void* pprintprocessorname);
int32_t windowssys_windows_win32_graphics_printing_deletePrintProcessorW(void* pname, void* penvironment, void* pprintprocessorname);
int32_t windowssys_windows_win32_graphics_printing_deletePrintProvidorA(void* pname, void* penvironment, void* pprintprovidorname);
int32_t windowssys_windows_win32_graphics_printing_deletePrintProvidorW(void* pname, void* penvironment, void* pprintprovidorname);
int32_t windowssys_windows_win32_graphics_printing_deletePrinterConnectionA(void* pname);
int32_t windowssys_windows_win32_graphics_printing_deletePrinterConnectionW(void* pname);
int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverA(void* pname, void* penvironment, void* pdrivername);
int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverExA(void* pname, void* penvironment, void* pdrivername, uint32_t dwdeleteflag, uint32_t dwversionflag);
int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverExW(void* pname, void* penvironment, void* pdrivername, uint32_t dwdeleteflag, uint32_t dwversionflag);
int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageA(void* pszserver, void* pszinfpath, void* pszenvironment);
int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageW(void* pszserver, void* pszinfpath, void* pszenvironment);
int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverW(void* pname, void* penvironment, void* pdrivername);
int32_t windowssys_windows_win32_graphics_printing_deletePrinterIC(void* hprinteric);
int32_t windowssys_windows_win32_graphics_printing_devQueryPrintEx(void* pdqpinfo);
int32_t windowssys_windows_win32_graphics_printing_enumMonitorsA(void* pname, uint32_t level, void* pmonitor, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumMonitorsW(void* pname, uint32_t level, void* pmonitor, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPortsA(void* pname, uint32_t level, void* pport, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPortsW(void* pname, uint32_t level, void* pport, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesA(void* pname, void* pprintprocessorname, uint32_t level, void* pdatatypes, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesW(void* pname, void* pprintprocessorname, uint32_t level, void* pdatatypes, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPrintProcessorsA(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPrintProcessorsW(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPrinterDriversA(void* pname, void* penvironment, uint32_t level, void* pdriverinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPrinterDriversW(void* pname, void* penvironment, uint32_t level, void* pdriverinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPrintersA(uint32_t flags, void* name, uint32_t level, void* pprinterenum, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_enumPrintersW(uint32_t flags, void* name, uint32_t level, void* pprinterenum, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_extDeviceMode(void* hwnd, void* hinst, void* pdevmodeoutput, void* pdevicename, void* pport, void* pdevmodeinput, void* pprofile, uint32_t fmode);
int32_t windowssys_windows_win32_graphics_printing_findClosePrinterChangeNotification(void* hchange);
int32_t windowssys_windows_win32_graphics_printing_findNextPrinterChangeNotification(void* hchange, void* pdwchange, void* pvreserved, void* ppprinternotifyinfo);
void windowssys_windows_win32_graphics_printing_freePrintNamedPropertyArray(uint32_t cproperties, void* ppproperties);
void windowssys_windows_win32_graphics_printing_freePrintPropertyValue(void* pvalue);
int32_t windowssys_windows_win32_graphics_printing_freePrinterNotifyInfo(void* pprinternotifyinfo);
int32_t windowssys_windows_win32_graphics_printing_gdiDeleteSpoolFileHandle(void* spoolfilehandle);
int32_t windowssys_windows_win32_graphics_printing_gdiEndDocEMF(void* spoolfilehandle);
int32_t windowssys_windows_win32_graphics_printing_gdiEndPageEMF(void* spoolfilehandle, uint32_t dwoptimization);
void* windowssys_windows_win32_graphics_printing_gdiGetDC(void* spoolfilehandle);
int32_t windowssys_windows_win32_graphics_printing_gdiGetDevmodeForPage(void* spoolfilehandle, uint32_t dwpagenumber, void* pcurrdm, void* plastdm);
uint32_t windowssys_windows_win32_graphics_printing_gdiGetPageCount(void* spoolfilehandle);
void* windowssys_windows_win32_graphics_printing_gdiGetPageHandle(void* spoolfilehandle, uint32_t page, void* pdwpagetype);
void* windowssys_windows_win32_graphics_printing_gdiGetSpoolFileHandle(void* pwszprintername, void* pdevmode, void* pwszdocname);
int32_t windowssys_windows_win32_graphics_printing_gdiPlayPageEMF(void* spoolfilehandle, void* hemf, void* prectdocument, void* prectborder, void* prectclip);
int32_t windowssys_windows_win32_graphics_printing_gdiResetDCEMF(void* spoolfilehandle, void* pcurrdm);
int32_t windowssys_windows_win32_graphics_printing_gdiStartDocEMF(void* spoolfilehandle, void* pdocinfo);
int32_t windowssys_windows_win32_graphics_printing_gdiStartPageEMF(void* spoolfilehandle);
uint32_t windowssys_windows_win32_graphics_printing_generateCopyFilePaths(void* pszprintername, void* pszdirectory, void* psplclientinfo, uint32_t dwlevel, void* pszsourcedir, void* pcchsourcedirsize, void* psztargetdir, void* pcchtargetdirsize, uint32_t dwflags);
uint64_t windowssys_windows_win32_graphics_printing_getCPSUIUserData(void* hdlg);
int32_t windowssys_windows_win32_graphics_printing_getCorePrinterDriversA(void* pszserver, void* pszenvironment, void* pszzcoredriverdependencies, uint32_t ccoreprinterdrivers, void* pcoreprinterdrivers);
int32_t windowssys_windows_win32_graphics_printing_getCorePrinterDriversW(void* pszserver, void* pszenvironment, void* pszzcoredriverdependencies, uint32_t ccoreprinterdrivers, void* pcoreprinterdrivers);
int32_t windowssys_windows_win32_graphics_printing_getDefaultPrinterA(void* pszbuffer, void* pcchbuffer);
int32_t windowssys_windows_win32_graphics_printing_getDefaultPrinterW(void* pszbuffer, void* pcchbuffer);
int32_t windowssys_windows_win32_graphics_printing_getJobAttributes(void* pprintername, void* pdevmode, void* pattributeinfo);
int32_t windowssys_windows_win32_graphics_printing_getJobAttributesEx(void* pprintername, void* pdevmode, uint32_t dwlevel, void* pattributeinfo, uint32_t nsize, uint32_t dwflags);
int32_t windowssys_windows_win32_graphics_printing_getPrintExecutionData(void* pdata);
int32_t windowssys_windows_win32_graphics_printing_getPrintOutputInfo(void* hwnd, void* pszprinter, void* phfile, void* ppszoutputfile);
int32_t windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryA(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded);
int32_t windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryW(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded);
int32_t windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryA(void* pname, void* penvironment, uint32_t level, void* pdriverdirectory, uint32_t cbbuf, void* pcbneeded);
int32_t windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryW(void* pname, void* penvironment, uint32_t level, void* pdriverdirectory, uint32_t cbbuf, void* pcbneeded);
int32_t windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathA(void* pszserver, void* pszenvironment, void* pszlanguage, void* pszpackageid, void* pszdriverpackagecab, uint32_t cchdriverpackagecab, void* pcchrequiredsize);
int32_t windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathW(void* pszserver, void* pszenvironment, void* pszlanguage, void* pszpackageid, void* pszdriverpackagecab, uint32_t cchdriverpackagecab, void* pcchrequiredsize);
int32_t windowssys_windows_win32_graphics_printing_impersonatePrinterClient(void* htoken);
int32_t windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageA(void* pszserver, void* pszinfpath, void* pszdrivername, void* pszenvironment, uint32_t dwflags);
int32_t windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageW(void* pszserver, void* pszinfpath, void* pszdrivername, void* pszenvironment, uint32_t dwflags);
int32_t windowssys_windows_win32_graphics_printing_isValidDevmodeA(void* pdevmode, uint64_t devmodesize);
int32_t windowssys_windows_win32_graphics_printing_isValidDevmodeW(void* pdevmode, uint64_t devmodesize);
int32_t windowssys_windows_win32_graphics_printing_openPrinter2A(void* pprintername, void* phprinter, void* pdefault, void* poptions);
int32_t windowssys_windows_win32_graphics_printing_openPrinter2W(void* pprintername, void* phprinter, void* pdefault, void* poptions);
int32_t windowssys_windows_win32_graphics_printing_openPrinterA(void* pprintername, void* phprinter, void* pdefault);
int32_t windowssys_windows_win32_graphics_printing_openPrinterW(void* pprintername, void* phprinter, void* pdefault);
int32_t windowssys_windows_win32_graphics_printing_playGdiScriptOnPrinterIC(void* hprinteric, void* pin, uint32_t cin, void* pout, uint32_t cout, uint32_t ul);
int32_t windowssys_windows_win32_graphics_printing_registerForPrintAsyncNotifications(void* pszname, void* pnotificationtype, int32_t euserfilter, int32_t econversationstyle, void* pcallback, void* phnotify);
int32_t windowssys_windows_win32_graphics_printing_removePrintDeviceObject(void* hdeviceobject);
int32_t windowssys_windows_win32_graphics_printing_replyPrinterChangeNotificationEx(void* hnotify, uint32_t dwcolor, uint32_t fdwflags, void* pdwresult, void* pprinternotifyinfo);
int32_t windowssys_windows_win32_graphics_printing_reportJobProcessingProgress(void* printerhandle, uint32_t jobid, int32_t joboperation, int32_t jobprogress);
void* windowssys_windows_win32_graphics_printing_revertToPrinterSelf(void);
void* windowssys_windows_win32_graphics_printing_routerAllocBidiMem(uint64_t numbytes);
void* windowssys_windows_win32_graphics_printing_routerAllocBidiResponseContainer(uint32_t count);
void* windowssys_windows_win32_graphics_printing_routerAllocPrinterNotifyInfo(uint32_t cprinternotifyinfodata);
void windowssys_windows_win32_graphics_printing_routerFreeBidiMem(void* pmempointer);
uint32_t windowssys_windows_win32_graphics_printing_routerFreeBidiResponseContainer(void* pdata);
int32_t windowssys_windows_win32_graphics_printing_routerFreePrinterNotifyInfo(void* pinfo);
int32_t windowssys_windows_win32_graphics_printing_setCPSUIUserData(void* hdlg, uint64_t cpsuiuserdata);
int32_t windowssys_windows_win32_graphics_printing_setDefaultPrinterA(void* pszprinter);
int32_t windowssys_windows_win32_graphics_printing_setDefaultPrinterW(void* pszprinter);
int32_t windowssys_windows_win32_graphics_printing_setPortA(void* pname, void* pportname, uint32_t dwlevel, void* pportinfo);
int32_t windowssys_windows_win32_graphics_printing_setPortW(void* pname, void* pportname, uint32_t dwlevel, void* pportinfo);
int32_t windowssys_windows_win32_graphics_printing_spoolerCopyFileEvent(void* pszprintername, void* pszkey, uint32_t dwcopyfileevent);
void windowssys_windows_win32_graphics_printing_spoolerFreePrinterNotifyInfo(void* pinfo);
int32_t windowssys_windows_win32_graphics_printing_unRegisterForPrintAsyncNotifications(void* param0);
int32_t windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageA(void* pszserver, void* pszinfpath, void* pszenvironment, uint32_t dwflags, void* hwnd, void* pszdestinfpath, void* pcchdestinfpath);
int32_t windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageW(void* pszserver, void* pszinfpath, void* pszenvironment, uint32_t dwflags, void* hwnd, void* pszdestinfpath, void* pcchdestinfpath);
int32_t windowssys_windows_win32_graphics_printing_xcvDataW(void* hxcv, void* pszdataname, void* pinputdata, uint32_t cbinputdata, void* poutputdata, uint32_t cboutputdata, void* pcboutputneeded, void* pdwstatus);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_WINDOWS_WIN32_GRAPHICS_PRINTING_WRAPPER_H */
