#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_FAX_WINDOWS_WIN32_DEVICES_FAX_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_FAX_WINDOWS_WIN32_DEVICES_FAX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_fax_CanSendToFaxRecipient(void);
int32_t windowssys_windows_win32_devices_fax_FaxAbort(void* faxhandle, uint32_t jobid);
int32_t windowssys_windows_win32_devices_fax_FaxAccessCheck(void* faxhandle, uint32_t accessmask);
int32_t windowssys_windows_win32_devices_fax_FaxClose(void* faxhandle);
int32_t windowssys_windows_win32_devices_fax_FaxCompleteJobParamsA(void* jobparams, void* coverpageinfo);
int32_t windowssys_windows_win32_devices_fax_FaxCompleteJobParamsW(void* jobparams, void* coverpageinfo);
int32_t windowssys_windows_win32_devices_fax_FaxConnectFaxServerA(void* machinename, void* faxhandle);
int32_t windowssys_windows_win32_devices_fax_FaxConnectFaxServerW(void* machinename, void* faxhandle);
int32_t windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodA(void* faxporthandle, void* routingguid, int32_t enabled);
int32_t windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodW(void* faxporthandle, void* routingguid, int32_t enabled);
int32_t windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoA(void* faxhandle, void* routinginfo, void* methodsreturned);
int32_t windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoW(void* faxhandle, void* routinginfo, void* methodsreturned);
int32_t windowssys_windows_win32_devices_fax_FaxEnumJobsA(void* faxhandle, void* jobentry, void* jobsreturned);
int32_t windowssys_windows_win32_devices_fax_FaxEnumJobsW(void* faxhandle, void* jobentry, void* jobsreturned);
int32_t windowssys_windows_win32_devices_fax_FaxEnumPortsA(void* faxhandle, void* portinfo, void* portsreturned);
int32_t windowssys_windows_win32_devices_fax_FaxEnumPortsW(void* faxhandle, void* portinfo, void* portsreturned);
int32_t windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsA(void* faxporthandle, void* routingmethod, void* methodsreturned);
int32_t windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsW(void* faxporthandle, void* routingmethod, void* methodsreturned);
void windowssys_windows_win32_devices_fax_FaxFreeBuffer(void* buffer);
int32_t windowssys_windows_win32_devices_fax_FaxGetConfigurationA(void* faxhandle, void* faxconfig);
int32_t windowssys_windows_win32_devices_fax_FaxGetConfigurationW(void* faxhandle, void* faxconfig);
int32_t windowssys_windows_win32_devices_fax_FaxGetDeviceStatusA(void* faxporthandle, void* devicestatus);
int32_t windowssys_windows_win32_devices_fax_FaxGetDeviceStatusW(void* faxporthandle, void* devicestatus);
int32_t windowssys_windows_win32_devices_fax_FaxGetJobA(void* faxhandle, uint32_t jobid, void* jobentry);
int32_t windowssys_windows_win32_devices_fax_FaxGetJobW(void* faxhandle, uint32_t jobid, void* jobentry);
int32_t windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesA(void* faxhandle, void* categories, void* numbercategories);
int32_t windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesW(void* faxhandle, void* categories, void* numbercategories);
int32_t windowssys_windows_win32_devices_fax_FaxGetPageData(void* faxhandle, uint32_t jobid, void* buffer, void* buffersize, void* imagewidth, void* imageheight);
int32_t windowssys_windows_win32_devices_fax_FaxGetPortA(void* faxporthandle, void* portinfo);
int32_t windowssys_windows_win32_devices_fax_FaxGetPortW(void* faxporthandle, void* portinfo);
int32_t windowssys_windows_win32_devices_fax_FaxGetRoutingInfoA(void* faxporthandle, void* routingguid, void* routinginfobuffer, void* routinginfobuffersize);
int32_t windowssys_windows_win32_devices_fax_FaxGetRoutingInfoW(void* faxporthandle, void* routingguid, void* routinginfobuffer, void* routinginfobuffersize);
int32_t windowssys_windows_win32_devices_fax_FaxInitializeEventQueue(void* faxhandle, void* completionport, uint64_t completionkey, void* hwnd, uint32_t messagestart);
int32_t windowssys_windows_win32_devices_fax_FaxOpenPort(void* faxhandle, uint32_t deviceid, uint32_t flags, void* faxporthandle);
int32_t windowssys_windows_win32_devices_fax_FaxPrintCoverPageA(void* faxcontextinfo, void* coverpageinfo);
int32_t windowssys_windows_win32_devices_fax_FaxPrintCoverPageW(void* faxcontextinfo, void* coverpageinfo);
int32_t windowssys_windows_win32_devices_fax_FaxRegisterRoutingExtensionW(void* faxhandle, void* extensionname, void* friendlyname, void* imagename, void* callback, void* context);
int32_t windowssys_windows_win32_devices_fax_FaxRegisterServiceProviderW(void* deviceprovider, void* friendlyname, void* imagename, void* tspname);
int32_t windowssys_windows_win32_devices_fax_FaxSendDocumentA(void* faxhandle, void* filename, void* jobparams, void* coverpageinfo, void* faxjobid);
int32_t windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastA(void* faxhandle, void* filename, void* faxjobid, void* faxrecipientcallback, void* context);
int32_t windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastW(void* faxhandle, void* filename, void* faxjobid, void* faxrecipientcallback, void* context);
int32_t windowssys_windows_win32_devices_fax_FaxSendDocumentW(void* faxhandle, void* filename, void* jobparams, void* coverpageinfo, void* faxjobid);
int32_t windowssys_windows_win32_devices_fax_FaxSetConfigurationA(void* faxhandle, void* faxconfig);
int32_t windowssys_windows_win32_devices_fax_FaxSetConfigurationW(void* faxhandle, void* faxconfig);
int32_t windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoA(void* faxhandle, void* routinginfo);
int32_t windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoW(void* faxhandle, void* routinginfo);
int32_t windowssys_windows_win32_devices_fax_FaxSetJobA(void* faxhandle, uint32_t jobid, uint32_t command, void* jobentry);
int32_t windowssys_windows_win32_devices_fax_FaxSetJobW(void* faxhandle, uint32_t jobid, uint32_t command, void* jobentry);
int32_t windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesA(void* faxhandle, void* categories, uint32_t numbercategories);
int32_t windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesW(void* faxhandle, void* categories, uint32_t numbercategories);
int32_t windowssys_windows_win32_devices_fax_FaxSetPortA(void* faxporthandle, void* portinfo);
int32_t windowssys_windows_win32_devices_fax_FaxSetPortW(void* faxporthandle, void* portinfo);
int32_t windowssys_windows_win32_devices_fax_FaxSetRoutingInfoA(void* faxporthandle, void* routingguid, void* routinginfobuffer, uint32_t routinginfobuffersize);
int32_t windowssys_windows_win32_devices_fax_FaxSetRoutingInfoW(void* faxporthandle, void* routingguid, void* routinginfobuffer, uint32_t routinginfobuffersize);
int32_t windowssys_windows_win32_devices_fax_FaxStartPrintJobA(void* printername, void* printinfo, void* faxjobid, void* faxcontextinfo);
int32_t windowssys_windows_win32_devices_fax_FaxStartPrintJobW(void* printername, void* printinfo, void* faxjobid, void* faxcontextinfo);
int32_t windowssys_windows_win32_devices_fax_FaxUnregisterServiceProviderW(void* deviceprovider);
uint32_t windowssys_windows_win32_devices_fax_SendToFaxRecipient(int32_t sndmode, void* lpfilename);
int32_t windowssys_windows_win32_devices_fax_StiCreateInstanceW(void* hinst, uint32_t dwver, void* ppsti, void* punkouter);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_FAX_WINDOWS_WIN32_DEVICES_FAX_WRAPPER_H */
