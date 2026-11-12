#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_FAX_WINDOWS_WIN32_DEVICES_FAX_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_FAX_WINDOWS_WIN32_DEVICES_FAX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient(void);
int32_t windowssysWindowsWin32DevicesFaxFaxAbort(void* faxhandle, uint32_t jobid);
int32_t windowssysWindowsWin32DevicesFaxFaxAccessCheck(void* faxhandle, uint32_t accessmask);
int32_t windowssysWindowsWin32DevicesFaxFaxClose(void* faxhandle);
int32_t windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(void* jobparams, void* coverpageinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(void* jobparams, void* coverpageinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(void* machinename, void* faxhandle);
int32_t windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(void* machinename, void* faxhandle);
int32_t windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(void* faxporthandle, void* routingguid, int32_t enabled);
int32_t windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(void* faxporthandle, void* routingguid, int32_t enabled);
int32_t windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(void* faxhandle, void* routinginfo, void* methodsreturned);
int32_t windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(void* faxhandle, void* routinginfo, void* methodsreturned);
int32_t windowssysWindowsWin32DevicesFaxFaxEnumJobsA(void* faxhandle, void* jobentry, void* jobsreturned);
int32_t windowssysWindowsWin32DevicesFaxFaxEnumJobsW(void* faxhandle, void* jobentry, void* jobsreturned);
int32_t windowssysWindowsWin32DevicesFaxFaxEnumPortsA(void* faxhandle, void* portinfo, void* portsreturned);
int32_t windowssysWindowsWin32DevicesFaxFaxEnumPortsW(void* faxhandle, void* portinfo, void* portsreturned);
int32_t windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(void* faxporthandle, void* routingmethod, void* methodsreturned);
int32_t windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(void* faxporthandle, void* routingmethod, void* methodsreturned);
void windowssysWindowsWin32DevicesFaxFaxFreeBuffer(void* buffer);
int32_t windowssysWindowsWin32DevicesFaxFaxGetConfigurationA(void* faxhandle, void* faxconfig);
int32_t windowssysWindowsWin32DevicesFaxFaxGetConfigurationW(void* faxhandle, void* faxconfig);
int32_t windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(void* faxporthandle, void* devicestatus);
int32_t windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(void* faxporthandle, void* devicestatus);
int32_t windowssysWindowsWin32DevicesFaxFaxGetJobA(void* faxhandle, uint32_t jobid, void* jobentry);
int32_t windowssysWindowsWin32DevicesFaxFaxGetJobW(void* faxhandle, uint32_t jobid, void* jobentry);
int32_t windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(void* faxhandle, void* categories, void* numbercategories);
int32_t windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(void* faxhandle, void* categories, void* numbercategories);
int32_t windowssysWindowsWin32DevicesFaxFaxGetPageData(void* faxhandle, uint32_t jobid, void* buffer, void* buffersize, void* imagewidth, void* imageheight);
int32_t windowssysWindowsWin32DevicesFaxFaxGetPortA(void* faxporthandle, void* portinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxGetPortW(void* faxporthandle, void* portinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(void* faxporthandle, void* routingguid, void* routinginfobuffer, void* routinginfobuffersize);
int32_t windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(void* faxporthandle, void* routingguid, void* routinginfobuffer, void* routinginfobuffersize);
int32_t windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(void* faxhandle, void* completionport, uint64_t completionkey, void* hwnd, uint32_t messagestart);
int32_t windowssysWindowsWin32DevicesFaxFaxOpenPort(void* faxhandle, uint32_t deviceid, uint32_t flags, void* faxporthandle);
int32_t windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(void* faxcontextinfo, void* coverpageinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(void* faxcontextinfo, void* coverpageinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(void* faxhandle, void* extensionname, void* friendlyname, void* imagename, void* callback, void* context);
int32_t windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(void* deviceprovider, void* friendlyname, void* imagename, void* tspname);
int32_t windowssysWindowsWin32DevicesFaxFaxSendDocumentA(void* faxhandle, void* filename, void* jobparams, void* coverpageinfo, void* faxjobid);
int32_t windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(void* faxhandle, void* filename, void* faxjobid, void* faxrecipientcallback, void* context);
int32_t windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(void* faxhandle, void* filename, void* faxjobid, void* faxrecipientcallback, void* context);
int32_t windowssysWindowsWin32DevicesFaxFaxSendDocumentW(void* faxhandle, void* filename, void* jobparams, void* coverpageinfo, void* faxjobid);
int32_t windowssysWindowsWin32DevicesFaxFaxSetConfigurationA(void* faxhandle, void* faxconfig);
int32_t windowssysWindowsWin32DevicesFaxFaxSetConfigurationW(void* faxhandle, void* faxconfig);
int32_t windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(void* faxhandle, void* routinginfo);
int32_t windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(void* faxhandle, void* routinginfo);
int32_t windowssysWindowsWin32DevicesFaxFaxSetJobA(void* faxhandle, uint32_t jobid, uint32_t command, void* jobentry);
int32_t windowssysWindowsWin32DevicesFaxFaxSetJobW(void* faxhandle, uint32_t jobid, uint32_t command, void* jobentry);
int32_t windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(void* faxhandle, void* categories, uint32_t numbercategories);
int32_t windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(void* faxhandle, void* categories, uint32_t numbercategories);
int32_t windowssysWindowsWin32DevicesFaxFaxSetPortA(void* faxporthandle, void* portinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxSetPortW(void* faxporthandle, void* portinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(void* faxporthandle, void* routingguid, void* routinginfobuffer, uint32_t routinginfobuffersize);
int32_t windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(void* faxporthandle, void* routingguid, void* routinginfobuffer, uint32_t routinginfobuffersize);
int32_t windowssysWindowsWin32DevicesFaxFaxStartPrintJobA(void* printername, void* printinfo, void* faxjobid, void* faxcontextinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxStartPrintJobW(void* printername, void* printinfo, void* faxjobid, void* faxcontextinfo);
int32_t windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(void* deviceprovider);
uint32_t windowssysWindowsWin32DevicesFaxSendToFaxRecipient(int32_t sndmode, void* lpfilename);
int32_t windowssysWindowsWin32DevicesFaxStiCreateInstanceW(void* hinst, uint32_t dwver, void* ppsti, void* punkouter);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_FAX_WINDOWS_WIN32_DEVICES_FAX_WRAPPER_H */
