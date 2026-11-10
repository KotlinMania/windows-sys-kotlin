#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_FAX_WINDOWS_WIN32_DEVICES_FAX_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_FAX_WINDOWS_WIN32_DEVICES_FAX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_fax_canSendToFaxRecipient(void);
int32_t windowssys_windows_win32_devices_fax_faxAbort(void* faxhandle, uint32_t jobid);
int32_t windowssys_windows_win32_devices_fax_faxAccessCheck(void* faxhandle, uint32_t accessmask);
int32_t windowssys_windows_win32_devices_fax_faxClose(void* faxhandle);
int32_t windowssys_windows_win32_devices_fax_faxCompleteJobParamsA(void* jobparams, void* coverpageinfo);
int32_t windowssys_windows_win32_devices_fax_faxCompleteJobParamsW(void* jobparams, void* coverpageinfo);
int32_t windowssys_windows_win32_devices_fax_faxConnectFaxServerA(void* machinename, void* faxhandle);
int32_t windowssys_windows_win32_devices_fax_faxConnectFaxServerW(void* machinename, void* faxhandle);
int32_t windowssys_windows_win32_devices_fax_faxEnableRoutingMethodA(void* faxporthandle, void* routingguid, int32_t enabled);
int32_t windowssys_windows_win32_devices_fax_faxEnableRoutingMethodW(void* faxporthandle, void* routingguid, int32_t enabled);
int32_t windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoA(void* faxhandle, void* routinginfo, void* methodsreturned);
int32_t windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoW(void* faxhandle, void* routinginfo, void* methodsreturned);
int32_t windowssys_windows_win32_devices_fax_faxEnumJobsA(void* faxhandle, void* jobentry, void* jobsreturned);
int32_t windowssys_windows_win32_devices_fax_faxEnumJobsW(void* faxhandle, void* jobentry, void* jobsreturned);
int32_t windowssys_windows_win32_devices_fax_faxEnumPortsA(void* faxhandle, void* portinfo, void* portsreturned);
int32_t windowssys_windows_win32_devices_fax_faxEnumPortsW(void* faxhandle, void* portinfo, void* portsreturned);
int32_t windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsA(void* faxporthandle, void* routingmethod, void* methodsreturned);
int32_t windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsW(void* faxporthandle, void* routingmethod, void* methodsreturned);
void windowssys_windows_win32_devices_fax_faxFreeBuffer(void* buffer);
int32_t windowssys_windows_win32_devices_fax_faxGetConfigurationA(void* faxhandle, void* faxconfig);
int32_t windowssys_windows_win32_devices_fax_faxGetConfigurationW(void* faxhandle, void* faxconfig);
int32_t windowssys_windows_win32_devices_fax_faxGetDeviceStatusA(void* faxporthandle, void* devicestatus);
int32_t windowssys_windows_win32_devices_fax_faxGetDeviceStatusW(void* faxporthandle, void* devicestatus);
int32_t windowssys_windows_win32_devices_fax_faxGetJobA(void* faxhandle, uint32_t jobid, void* jobentry);
int32_t windowssys_windows_win32_devices_fax_faxGetJobW(void* faxhandle, uint32_t jobid, void* jobentry);
int32_t windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesA(void* faxhandle, void* categories, void* numbercategories);
int32_t windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesW(void* faxhandle, void* categories, void* numbercategories);
int32_t windowssys_windows_win32_devices_fax_faxGetPageData(void* faxhandle, uint32_t jobid, void* buffer, void* buffersize, void* imagewidth, void* imageheight);
int32_t windowssys_windows_win32_devices_fax_faxGetPortA(void* faxporthandle, void* portinfo);
int32_t windowssys_windows_win32_devices_fax_faxGetPortW(void* faxporthandle, void* portinfo);
int32_t windowssys_windows_win32_devices_fax_faxGetRoutingInfoA(void* faxporthandle, void* routingguid, void* routinginfobuffer, void* routinginfobuffersize);
int32_t windowssys_windows_win32_devices_fax_faxGetRoutingInfoW(void* faxporthandle, void* routingguid, void* routinginfobuffer, void* routinginfobuffersize);
int32_t windowssys_windows_win32_devices_fax_faxInitializeEventQueue(void* faxhandle, void* completionport, uint64_t completionkey, void* hwnd, uint32_t messagestart);
int32_t windowssys_windows_win32_devices_fax_faxOpenPort(void* faxhandle, uint32_t deviceid, uint32_t flags, void* faxporthandle);
int32_t windowssys_windows_win32_devices_fax_faxPrintCoverPageA(void* faxcontextinfo, void* coverpageinfo);
int32_t windowssys_windows_win32_devices_fax_faxPrintCoverPageW(void* faxcontextinfo, void* coverpageinfo);
int32_t windowssys_windows_win32_devices_fax_faxRegisterRoutingExtensionW(void* faxhandle, void* extensionname, void* friendlyname, void* imagename, void* callback, void* context);
int32_t windowssys_windows_win32_devices_fax_faxRegisterServiceProviderW(void* deviceprovider, void* friendlyname, void* imagename, void* tspname);
int32_t windowssys_windows_win32_devices_fax_faxSendDocumentA(void* faxhandle, void* filename, void* jobparams, void* coverpageinfo, void* faxjobid);
int32_t windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastA(void* faxhandle, void* filename, void* faxjobid, void* faxrecipientcallback, void* context);
int32_t windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastW(void* faxhandle, void* filename, void* faxjobid, void* faxrecipientcallback, void* context);
int32_t windowssys_windows_win32_devices_fax_faxSendDocumentW(void* faxhandle, void* filename, void* jobparams, void* coverpageinfo, void* faxjobid);
int32_t windowssys_windows_win32_devices_fax_faxSetConfigurationA(void* faxhandle, void* faxconfig);
int32_t windowssys_windows_win32_devices_fax_faxSetConfigurationW(void* faxhandle, void* faxconfig);
int32_t windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoA(void* faxhandle, void* routinginfo);
int32_t windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoW(void* faxhandle, void* routinginfo);
int32_t windowssys_windows_win32_devices_fax_faxSetJobA(void* faxhandle, uint32_t jobid, uint32_t command, void* jobentry);
int32_t windowssys_windows_win32_devices_fax_faxSetJobW(void* faxhandle, uint32_t jobid, uint32_t command, void* jobentry);
int32_t windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesA(void* faxhandle, void* categories, uint32_t numbercategories);
int32_t windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesW(void* faxhandle, void* categories, uint32_t numbercategories);
int32_t windowssys_windows_win32_devices_fax_faxSetPortA(void* faxporthandle, void* portinfo);
int32_t windowssys_windows_win32_devices_fax_faxSetPortW(void* faxporthandle, void* portinfo);
int32_t windowssys_windows_win32_devices_fax_faxSetRoutingInfoA(void* faxporthandle, void* routingguid, void* routinginfobuffer, uint32_t routinginfobuffersize);
int32_t windowssys_windows_win32_devices_fax_faxSetRoutingInfoW(void* faxporthandle, void* routingguid, void* routinginfobuffer, uint32_t routinginfobuffersize);
int32_t windowssys_windows_win32_devices_fax_faxStartPrintJobA(void* printername, void* printinfo, void* faxjobid, void* faxcontextinfo);
int32_t windowssys_windows_win32_devices_fax_faxStartPrintJobW(void* printername, void* printinfo, void* faxjobid, void* faxcontextinfo);
int32_t windowssys_windows_win32_devices_fax_faxUnregisterServiceProviderW(void* deviceprovider);
uint32_t windowssys_windows_win32_devices_fax_sendToFaxRecipient(int32_t sndmode, void* lpfilename);
int32_t windowssys_windows_win32_devices_fax_stiCreateInstanceW(void* hinst, uint32_t dwver, void* ppsti, void* punkouter);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_FAX_WINDOWS_WIN32_DEVICES_FAX_WRAPPER_H */
