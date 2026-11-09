#ifndef WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_WINDOWS_WIN32_GRAPHICS_PRINTING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_WINDOWS_WIN32_GRAPHICS_PRINTING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_graphics_printing_AddMonitorA(void* pname, uint32_t level, void* pmonitors);
int32_t windowssys_windows_win32_graphics_printing_AddMonitorW(void* pname, uint32_t level, void* pmonitors);
int32_t windowssys_windows_win32_graphics_printing_AddPortA(void* pname, void* hwnd, void* pmonitorname);
int32_t windowssys_windows_win32_graphics_printing_AddPortW(void* pname, void* hwnd, void* pmonitorname);
int32_t windowssys_windows_win32_graphics_printing_AddPrintProcessorA(void* pname, void* penvironment, void* ppathname, void* pprintprocessorname);
int32_t windowssys_windows_win32_graphics_printing_AddPrintProcessorW(void* pname, void* penvironment, void* ppathname, void* pprintprocessorname);
int32_t windowssys_windows_win32_graphics_printing_AddPrintProvidorA(void* pname, uint32_t level, void* pprovidorinfo);
int32_t windowssys_windows_win32_graphics_printing_AddPrintProvidorW(void* pname, uint32_t level, void* pprovidorinfo);
void* windowssys_windows_win32_graphics_printing_AddPrinterA(void* pname, uint32_t level, void* pprinter);
int32_t windowssys_windows_win32_graphics_printing_AddPrinterConnection2A(void* hwnd, void* pszname, uint32_t dwlevel, void* pconnectioninfo);
int32_t windowssys_windows_win32_graphics_printing_AddPrinterConnection2W(void* hwnd, void* pszname, uint32_t dwlevel, void* pconnectioninfo);
int32_t windowssys_windows_win32_graphics_printing_AddPrinterConnectionA(void* pname);
int32_t windowssys_windows_win32_graphics_printing_AddPrinterConnectionW(void* pname);
int32_t windowssys_windows_win32_graphics_printing_AddPrinterDriverA(void* pname, uint32_t level, void* pdriverinfo);
int32_t windowssys_windows_win32_graphics_printing_AddPrinterDriverExA(void* pname, uint32_t level, void* lpbdriverinfo, uint32_t dwfilecopyflags);
int32_t windowssys_windows_win32_graphics_printing_AddPrinterDriverExW(void* pname, uint32_t level, void* lpbdriverinfo, uint32_t dwfilecopyflags);
int32_t windowssys_windows_win32_graphics_printing_AddPrinterDriverW(void* pname, uint32_t level, void* pdriverinfo);
void* windowssys_windows_win32_graphics_printing_AddPrinterW(void* pname, uint32_t level, void* pprinter);
int32_t windowssys_windows_win32_graphics_printing_AppendPrinterNotifyInfoData(void* pinfodest, void* pdatasrc, uint32_t fdwflags);
uint32_t windowssys_windows_win32_graphics_printing_CallRouterFindFirstPrinterChangeNotification(void* hprinterrpc, uint32_t fdwfilterflags, uint32_t fdwoptions, void* hnotify, void* pprinternotifyoptions);
int32_t windowssys_windows_win32_graphics_printing_CommonPropertySheetUIA(void* hwndowner, void* pfnpropsheetui, int64_t lparam, void* presult);
int32_t windowssys_windows_win32_graphics_printing_CommonPropertySheetUIW(void* hwndowner, void* pfnpropsheetui, int64_t lparam, void* presult);
int32_t windowssys_windows_win32_graphics_printing_ConfigurePortA(void* pname, void* hwnd, void* pportname);
int32_t windowssys_windows_win32_graphics_printing_ConfigurePortW(void* pname, void* hwnd, void* pportname);
void* windowssys_windows_win32_graphics_printing_ConnectToPrinterDlg(void* hwnd, uint32_t flags);
int32_t windowssys_windows_win32_graphics_printing_CreatePrintAsyncNotifyChannel(void* pszname, void* pnotificationtype, int32_t euserfilter, int32_t econversationstyle, void* pcallback, void* ppiasynchnotification);
int32_t windowssys_windows_win32_graphics_printing_DeleteMonitorA(void* pname, void* penvironment, void* pmonitorname);
int32_t windowssys_windows_win32_graphics_printing_DeleteMonitorW(void* pname, void* penvironment, void* pmonitorname);
int32_t windowssys_windows_win32_graphics_printing_DeletePortA(void* pname, void* hwnd, void* pportname);
int32_t windowssys_windows_win32_graphics_printing_DeletePortW(void* pname, void* hwnd, void* pportname);
int32_t windowssys_windows_win32_graphics_printing_DeletePrintProcessorA(void* pname, void* penvironment, void* pprintprocessorname);
int32_t windowssys_windows_win32_graphics_printing_DeletePrintProcessorW(void* pname, void* penvironment, void* pprintprocessorname);
int32_t windowssys_windows_win32_graphics_printing_DeletePrintProvidorA(void* pname, void* penvironment, void* pprintprovidorname);
int32_t windowssys_windows_win32_graphics_printing_DeletePrintProvidorW(void* pname, void* penvironment, void* pprintprovidorname);
int32_t windowssys_windows_win32_graphics_printing_DeletePrinterConnectionA(void* pname);
int32_t windowssys_windows_win32_graphics_printing_DeletePrinterConnectionW(void* pname);
int32_t windowssys_windows_win32_graphics_printing_DeletePrinterDriverA(void* pname, void* penvironment, void* pdrivername);
int32_t windowssys_windows_win32_graphics_printing_DeletePrinterDriverExA(void* pname, void* penvironment, void* pdrivername, uint32_t dwdeleteflag, uint32_t dwversionflag);
int32_t windowssys_windows_win32_graphics_printing_DeletePrinterDriverExW(void* pname, void* penvironment, void* pdrivername, uint32_t dwdeleteflag, uint32_t dwversionflag);
int32_t windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageA(void* pszserver, void* pszinfpath, void* pszenvironment);
int32_t windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageW(void* pszserver, void* pszinfpath, void* pszenvironment);
int32_t windowssys_windows_win32_graphics_printing_DeletePrinterDriverW(void* pname, void* penvironment, void* pdrivername);
int32_t windowssys_windows_win32_graphics_printing_DeletePrinterIC(void* hprinteric);
int32_t windowssys_windows_win32_graphics_printing_DevQueryPrintEx(void* pdqpinfo);
int32_t windowssys_windows_win32_graphics_printing_EnumMonitorsA(void* pname, uint32_t level, void* pmonitor, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumMonitorsW(void* pname, uint32_t level, void* pmonitor, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPortsA(void* pname, uint32_t level, void* pport, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPortsW(void* pname, uint32_t level, void* pport, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesA(void* pname, void* pprintprocessorname, uint32_t level, void* pdatatypes, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesW(void* pname, void* pprintprocessorname, uint32_t level, void* pdatatypes, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPrintProcessorsA(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPrintProcessorsW(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPrinterDriversA(void* pname, void* penvironment, uint32_t level, void* pdriverinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPrinterDriversW(void* pname, void* penvironment, uint32_t level, void* pdriverinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPrintersA(uint32_t flags, void* name, uint32_t level, void* pprinterenum, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_EnumPrintersW(uint32_t flags, void* name, uint32_t level, void* pprinterenum, uint32_t cbbuf, void* pcbneeded, void* pcreturned);
int32_t windowssys_windows_win32_graphics_printing_ExtDeviceMode(void* hwnd, void* hinst, void* pdevmodeoutput, void* pdevicename, void* pport, void* pdevmodeinput, void* pprofile, uint32_t fmode);
int32_t windowssys_windows_win32_graphics_printing_FindClosePrinterChangeNotification(void* hchange);
int32_t windowssys_windows_win32_graphics_printing_FindNextPrinterChangeNotification(void* hchange, void* pdwchange, void* pvreserved, void* ppprinternotifyinfo);
void windowssys_windows_win32_graphics_printing_FreePrintNamedPropertyArray(uint32_t cproperties, void* ppproperties);
void windowssys_windows_win32_graphics_printing_FreePrintPropertyValue(void* pvalue);
int32_t windowssys_windows_win32_graphics_printing_FreePrinterNotifyInfo(void* pprinternotifyinfo);
int32_t windowssys_windows_win32_graphics_printing_GdiDeleteSpoolFileHandle(void* spoolfilehandle);
int32_t windowssys_windows_win32_graphics_printing_GdiEndDocEMF(void* spoolfilehandle);
int32_t windowssys_windows_win32_graphics_printing_GdiEndPageEMF(void* spoolfilehandle, uint32_t dwoptimization);
void* windowssys_windows_win32_graphics_printing_GdiGetDC(void* spoolfilehandle);
int32_t windowssys_windows_win32_graphics_printing_GdiGetDevmodeForPage(void* spoolfilehandle, uint32_t dwpagenumber, void* pcurrdm, void* plastdm);
uint32_t windowssys_windows_win32_graphics_printing_GdiGetPageCount(void* spoolfilehandle);
void* windowssys_windows_win32_graphics_printing_GdiGetPageHandle(void* spoolfilehandle, uint32_t page, void* pdwpagetype);
void* windowssys_windows_win32_graphics_printing_GdiGetSpoolFileHandle(void* pwszprintername, void* pdevmode, void* pwszdocname);
int32_t windowssys_windows_win32_graphics_printing_GdiPlayPageEMF(void* spoolfilehandle, void* hemf, void* prectdocument, void* prectborder, void* prectclip);
int32_t windowssys_windows_win32_graphics_printing_GdiResetDCEMF(void* spoolfilehandle, void* pcurrdm);
int32_t windowssys_windows_win32_graphics_printing_GdiStartDocEMF(void* spoolfilehandle, void* pdocinfo);
int32_t windowssys_windows_win32_graphics_printing_GdiStartPageEMF(void* spoolfilehandle);
uint32_t windowssys_windows_win32_graphics_printing_GenerateCopyFilePaths(void* pszprintername, void* pszdirectory, void* psplclientinfo, uint32_t dwlevel, void* pszsourcedir, void* pcchsourcedirsize, void* psztargetdir, void* pcchtargetdirsize, uint32_t dwflags);
uint64_t windowssys_windows_win32_graphics_printing_GetCPSUIUserData(void* hdlg);
int32_t windowssys_windows_win32_graphics_printing_GetCorePrinterDriversA(void* pszserver, void* pszenvironment, void* pszzcoredriverdependencies, uint32_t ccoreprinterdrivers, void* pcoreprinterdrivers);
int32_t windowssys_windows_win32_graphics_printing_GetCorePrinterDriversW(void* pszserver, void* pszenvironment, void* pszzcoredriverdependencies, uint32_t ccoreprinterdrivers, void* pcoreprinterdrivers);
int32_t windowssys_windows_win32_graphics_printing_GetDefaultPrinterA(void* pszbuffer, void* pcchbuffer);
int32_t windowssys_windows_win32_graphics_printing_GetDefaultPrinterW(void* pszbuffer, void* pcchbuffer);
int32_t windowssys_windows_win32_graphics_printing_GetJobAttributes(void* pprintername, void* pdevmode, void* pattributeinfo);
int32_t windowssys_windows_win32_graphics_printing_GetJobAttributesEx(void* pprintername, void* pdevmode, uint32_t dwlevel, void* pattributeinfo, uint32_t nsize, uint32_t dwflags);
int32_t windowssys_windows_win32_graphics_printing_GetPrintExecutionData(void* pdata);
int32_t windowssys_windows_win32_graphics_printing_GetPrintOutputInfo(void* hwnd, void* pszprinter, void* phfile, void* ppszoutputfile);
int32_t windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryA(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded);
int32_t windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryW(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded);
int32_t windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryA(void* pname, void* penvironment, uint32_t level, void* pdriverdirectory, uint32_t cbbuf, void* pcbneeded);
int32_t windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryW(void* pname, void* penvironment, uint32_t level, void* pdriverdirectory, uint32_t cbbuf, void* pcbneeded);
int32_t windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathA(void* pszserver, void* pszenvironment, void* pszlanguage, void* pszpackageid, void* pszdriverpackagecab, uint32_t cchdriverpackagecab, void* pcchrequiredsize);
int32_t windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathW(void* pszserver, void* pszenvironment, void* pszlanguage, void* pszpackageid, void* pszdriverpackagecab, uint32_t cchdriverpackagecab, void* pcchrequiredsize);
int32_t windowssys_windows_win32_graphics_printing_ImpersonatePrinterClient(void* htoken);
int32_t windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageA(void* pszserver, void* pszinfpath, void* pszdrivername, void* pszenvironment, uint32_t dwflags);
int32_t windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageW(void* pszserver, void* pszinfpath, void* pszdrivername, void* pszenvironment, uint32_t dwflags);
int32_t windowssys_windows_win32_graphics_printing_IsValidDevmodeA(void* pdevmode, uint64_t devmodesize);
int32_t windowssys_windows_win32_graphics_printing_IsValidDevmodeW(void* pdevmode, uint64_t devmodesize);
int32_t windowssys_windows_win32_graphics_printing_OpenPrinter2A(void* pprintername, void* phprinter, void* pdefault, void* poptions);
int32_t windowssys_windows_win32_graphics_printing_OpenPrinter2W(void* pprintername, void* phprinter, void* pdefault, void* poptions);
int32_t windowssys_windows_win32_graphics_printing_OpenPrinterA(void* pprintername, void* phprinter, void* pdefault);
int32_t windowssys_windows_win32_graphics_printing_OpenPrinterW(void* pprintername, void* phprinter, void* pdefault);
int32_t windowssys_windows_win32_graphics_printing_PlayGdiScriptOnPrinterIC(void* hprinteric, void* pin, uint32_t cin, void* pout, uint32_t cout, uint32_t ul);
int32_t windowssys_windows_win32_graphics_printing_RegisterForPrintAsyncNotifications(void* pszname, void* pnotificationtype, int32_t euserfilter, int32_t econversationstyle, void* pcallback, void* phnotify);
int32_t windowssys_windows_win32_graphics_printing_RemovePrintDeviceObject(void* hdeviceobject);
int32_t windowssys_windows_win32_graphics_printing_ReplyPrinterChangeNotificationEx(void* hnotify, uint32_t dwcolor, uint32_t fdwflags, void* pdwresult, void* pprinternotifyinfo);
int32_t windowssys_windows_win32_graphics_printing_ReportJobProcessingProgress(void* printerhandle, uint32_t jobid, int32_t joboperation, int32_t jobprogress);
void* windowssys_windows_win32_graphics_printing_RevertToPrinterSelf(void);
void* windowssys_windows_win32_graphics_printing_RouterAllocBidiMem(uint64_t numbytes);
void* windowssys_windows_win32_graphics_printing_RouterAllocBidiResponseContainer(uint32_t count);
void* windowssys_windows_win32_graphics_printing_RouterAllocPrinterNotifyInfo(uint32_t cprinternotifyinfodata);
void windowssys_windows_win32_graphics_printing_RouterFreeBidiMem(void* pmempointer);
uint32_t windowssys_windows_win32_graphics_printing_RouterFreeBidiResponseContainer(void* pdata);
int32_t windowssys_windows_win32_graphics_printing_RouterFreePrinterNotifyInfo(void* pinfo);
int32_t windowssys_windows_win32_graphics_printing_SetCPSUIUserData(void* hdlg, uint64_t cpsuiuserdata);
int32_t windowssys_windows_win32_graphics_printing_SetDefaultPrinterA(void* pszprinter);
int32_t windowssys_windows_win32_graphics_printing_SetDefaultPrinterW(void* pszprinter);
int32_t windowssys_windows_win32_graphics_printing_SetPortA(void* pname, void* pportname, uint32_t dwlevel, void* pportinfo);
int32_t windowssys_windows_win32_graphics_printing_SetPortW(void* pname, void* pportname, uint32_t dwlevel, void* pportinfo);
int32_t windowssys_windows_win32_graphics_printing_SpoolerCopyFileEvent(void* pszprintername, void* pszkey, uint32_t dwcopyfileevent);
void windowssys_windows_win32_graphics_printing_SpoolerFreePrinterNotifyInfo(void* pinfo);
int32_t windowssys_windows_win32_graphics_printing_UnRegisterForPrintAsyncNotifications(void* param0);
int32_t windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageA(void* pszserver, void* pszinfpath, void* pszenvironment, uint32_t dwflags, void* hwnd, void* pszdestinfpath, void* pcchdestinfpath);
int32_t windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageW(void* pszserver, void* pszinfpath, void* pszenvironment, uint32_t dwflags, void* hwnd, void* pszdestinfpath, void* pcchdestinfpath);
int32_t windowssys_windows_win32_graphics_printing_XcvDataW(void* hxcv, void* pszdataname, void* pinputdata, uint32_t cbinputdata, void* poutputdata, uint32_t cboutputdata, void* pcboutputneeded, void* pdwstatus);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_WINDOWS_WIN32_GRAPHICS_PRINTING_WRAPPER_H */
