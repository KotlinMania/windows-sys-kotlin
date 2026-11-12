#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SERVICES_WINDOWS_WIN32_SYSTEM_SERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SERVICES_WINDOWS_WIN32_SYSTEM_SERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemServicesChangeServiceConfig2A(void* hservice, uint32_t dwinfolevel, void* lpinfo);
int32_t windowssysWindowsWin32SystemServicesChangeServiceConfig2W(void* hservice, uint32_t dwinfolevel, void* lpinfo);
int32_t windowssysWindowsWin32SystemServicesChangeServiceConfigA(void* hservice, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword, void* lpdisplayname);
int32_t windowssysWindowsWin32SystemServicesChangeServiceConfigW(void* hservice, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword, void* lpdisplayname);
int32_t windowssysWindowsWin32SystemServicesCloseServiceHandle(void* hscobject);
int32_t windowssysWindowsWin32SystemServicesControlService(void* hservice, uint32_t dwcontrol, void* lpservicestatus);
int32_t windowssysWindowsWin32SystemServicesControlServiceExA(void* hservice, uint32_t dwcontrol, uint32_t dwinfolevel, void* pcontrolparams);
int32_t windowssysWindowsWin32SystemServicesControlServiceExW(void* hservice, uint32_t dwcontrol, uint32_t dwinfolevel, void* pcontrolparams);
void* windowssysWindowsWin32SystemServicesCreateServiceA(void* hscmanager, void* lpservicename, void* lpdisplayname, uint32_t dwdesiredaccess, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword);
void* windowssysWindowsWin32SystemServicesCreateServiceW(void* hscmanager, void* lpservicename, void* lpdisplayname, uint32_t dwdesiredaccess, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword);
int32_t windowssysWindowsWin32SystemServicesDeleteService(void* hservice);
int32_t windowssysWindowsWin32SystemServicesEnumDependentServicesA(void* hservice, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned);
int32_t windowssysWindowsWin32SystemServicesEnumDependentServicesW(void* hservice, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned);
int32_t windowssysWindowsWin32SystemServicesEnumServicesStatusA(void* hscmanager, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle);
int32_t windowssysWindowsWin32SystemServicesEnumServicesStatusExA(void* hscmanager, int32_t infolevel, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle, void* pszgroupname);
int32_t windowssysWindowsWin32SystemServicesEnumServicesStatusExW(void* hscmanager, int32_t infolevel, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle, void* pszgroupname);
int32_t windowssysWindowsWin32SystemServicesEnumServicesStatusW(void* hscmanager, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle);
uint32_t windowssysWindowsWin32SystemServicesGetServiceDirectory(void* hservicestatus, int32_t edirectorytype, void* lppathbuffer, uint32_t cchpathbufferlength, void* lpcchrequiredbufferlength);
int32_t windowssysWindowsWin32SystemServicesGetServiceDisplayNameA(void* hscmanager, void* lpservicename, void* lpdisplayname, void* lpcchbuffer);
int32_t windowssysWindowsWin32SystemServicesGetServiceDisplayNameW(void* hscmanager, void* lpservicename, void* lpdisplayname, void* lpcchbuffer);
int32_t windowssysWindowsWin32SystemServicesGetServiceKeyNameA(void* hscmanager, void* lpdisplayname, void* lpservicename, void* lpcchbuffer);
int32_t windowssysWindowsWin32SystemServicesGetServiceKeyNameW(void* hscmanager, void* lpdisplayname, void* lpservicename, void* lpcchbuffer);
uint32_t windowssysWindowsWin32SystemServicesGetServiceRegistryStateKey(void* servicestatushandle, int32_t statetype, uint32_t accessmask, void* servicestatekey);
uint32_t windowssysWindowsWin32SystemServicesGetSharedServiceDirectory(void* servicehandle, int32_t directorytype, void* pathbuffer, uint32_t pathbufferlength, void* requiredbufferlength);
uint32_t windowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey(void* servicehandle, int32_t statetype, uint32_t accessmask, void* servicestatekey);
void* windowssysWindowsWin32SystemServicesLockServiceDatabase(void* hscmanager);
int32_t windowssysWindowsWin32SystemServicesNotifyBootConfigStatus(int32_t bootacceptable);
uint32_t windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA(void* hservice, uint32_t dwnotifymask, void* pnotifybuffer);
uint32_t windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW(void* hservice, uint32_t dwnotifymask, void* pnotifybuffer);
void* windowssysWindowsWin32SystemServicesOpenSCManagerA(void* lpmachinename, void* lpdatabasename, uint32_t dwdesiredaccess);
void* windowssysWindowsWin32SystemServicesOpenSCManagerW(void* lpmachinename, void* lpdatabasename, uint32_t dwdesiredaccess);
void* windowssysWindowsWin32SystemServicesOpenServiceA(void* hscmanager, void* lpservicename, uint32_t dwdesiredaccess);
void* windowssysWindowsWin32SystemServicesOpenServiceW(void* hscmanager, void* lpservicename, uint32_t dwdesiredaccess);
int32_t windowssysWindowsWin32SystemServicesQueryServiceConfig2A(void* hservice, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssysWindowsWin32SystemServicesQueryServiceConfig2W(void* hservice, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssysWindowsWin32SystemServicesQueryServiceConfigA(void* hservice, void* lpserviceconfig, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssysWindowsWin32SystemServicesQueryServiceConfigW(void* hservice, void* lpserviceconfig, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssysWindowsWin32SystemServicesQueryServiceDynamicInformation(void* hservicestatus, uint32_t dwinfolevel, void* ppdynamicinfo);
int32_t windowssysWindowsWin32SystemServicesQueryServiceLockStatusA(void* hscmanager, void* lplockstatus, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssysWindowsWin32SystemServicesQueryServiceLockStatusW(void* hscmanager, void* lplockstatus, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssysWindowsWin32SystemServicesQueryServiceObjectSecurity(void* hservice, uint32_t dwsecurityinformation, void* lpsecuritydescriptor, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssysWindowsWin32SystemServicesQueryServiceStatus(void* hservice, void* lpservicestatus);
int32_t windowssysWindowsWin32SystemServicesQueryServiceStatusEx(void* hservice, int32_t infolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
void* windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA(void* lpservicename, void* lphandlerproc);
void* windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA(void* lpservicename, void* lphandlerproc, void* lpcontext);
void* windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW(void* lpservicename, void* lphandlerproc, void* lpcontext);
void* windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW(void* lpservicename, void* lphandlerproc);
int32_t windowssysWindowsWin32SystemServicesSetServiceBits(void* hservicestatus, uint32_t dwservicebits, int32_t bsetbitson, int32_t bupdateimmediately);
int32_t windowssysWindowsWin32SystemServicesSetServiceObjectSecurity(void* hservice, uint32_t dwsecurityinformation, void* lpsecuritydescriptor);
int32_t windowssysWindowsWin32SystemServicesSetServiceStatus(void* hservicestatus, void* lpservicestatus);
int32_t windowssysWindowsWin32SystemServicesStartServiceA(void* hservice, uint32_t dwnumserviceargs, void* lpserviceargvectors);
int32_t windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA(void* lpservicestarttable);
int32_t windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW(void* lpservicestarttable);
int32_t windowssysWindowsWin32SystemServicesStartServiceW(void* hservice, uint32_t dwnumserviceargs, void* lpserviceargvectors);
uint32_t windowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications(void* hservice, int32_t eeventtype, void* pcallback, void* pcallbackcontext, void* psubscription);
int32_t windowssysWindowsWin32SystemServicesUnlockServiceDatabase(void* sclock);
void windowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications(int64_t psubscription);
uint32_t windowssysWindowsWin32SystemServicesWaitServiceState(void* hservice, uint32_t dwnotify, uint32_t dwtimeout, void* hcancelevent);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SERVICES_WINDOWS_WIN32_SYSTEM_SERVICES_WRAPPER_H */
